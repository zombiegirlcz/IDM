package com.revolut.chat.data.repository.messages.upload;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/chat/data/repository/messages/upload/UploadExpiredException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UploadExpiredException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f51025a;

    public UploadExpiredException(UUID uploadCorrelationId) {
        Intrinsics.checkNotNullParameter(uploadCorrelationId, "uploadCorrelationId");
        this.f51025a = uploadCorrelationId;
    }
}
