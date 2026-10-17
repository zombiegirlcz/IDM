package com.revolut.feature.payments.messaging.data.impl.data.database.network.service;

import efm.d0;
import kotlin.Metadata;
import kv9.f;
import kv9.g;
import kv9.p;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import zj0.b;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\n2\b\b\u0001\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/payments/messaging/data/impl/data/database/network/service/MessagingEncryptionService;", "", "", "groupId", "Lefm/d0;", "Lkv9/f;", "getGroupKeys", "(Ljava/lang/String;)Lefm/d0;", "Lkv9/g;", "updatesKeys", "Lefm/b;", "updateGroupKeys", "(Ljava/lang/String;Lkv9/g;)Lefm/b;", "Lkv9/p;", "publicKey", "sendPublicKey", "(Lkv9/p;)Lefm/b;", "feature_payments_messaging_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MessagingEncryptionService {
    @GET("/groups/{groupId}/keys")
    @NotNull
    d0<f> getGroupKeys(@Path("groupId") @NotNull String groupId);

    @PUT("/user/current/key")
    @b
    @NotNull
    efm.b sendPublicKey(@Body @NotNull p publicKey);

    @PUT("/groups/{groupId}/keys")
    @NotNull
    efm.b updateGroupKeys(@Path("groupId") @NotNull String groupId, @Body @NotNull g updatesKeys);
}
