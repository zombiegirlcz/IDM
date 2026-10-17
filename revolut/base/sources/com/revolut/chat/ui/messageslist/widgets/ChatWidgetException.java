package com.revolut.chat.ui.messageslist.widgets;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/chat/ui/messageslist/widgets/ChatWidgetException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChatWidgetException extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatWidgetException(String message, Throwable th10) {
        super(message, th10);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
