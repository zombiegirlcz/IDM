package com.revolut.feature.chat.impl.network;

import e20.e;
import e20.f;
import efm.d0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import zj0.b;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/chat/impl/network/ChatRelatedService;", "", "Le20/e;", "body", "Lefm/d0;", "Le20/f;", "getVerificationTokenForChat", "(Le20/e;)Lefm/d0;", "retail_feature_chat_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ChatRelatedService {
    @b
    @POST("/support/chat/verification-tokens")
    @NotNull
    d0<f> getVerificationTokenForChat(@Body @NotNull e body);
}
