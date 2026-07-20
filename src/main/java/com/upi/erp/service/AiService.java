package com.upi.erp.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class AiService {

    private final ChatClient chatClient;

    public AiService(ChatClient.Builder builder) {
        this.chatClient = builder.build();
    }

    public String explicarTema(String tema) {

        return chatClient.prompt()
                .user("Explain the topic " + tema + " in English using simple language.")
                .call()
                .content();
    }
}