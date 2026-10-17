package com.revolut.feature.security_hub.impl.network;

import auc.c;
import auc.g;
import auc.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\u0006J\u001a\u0010\u000e\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\n2\b\b\u0001\u0010\u0010\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0011\u0010\u0006J\u0010\u0010\u0012\u001a\u00020\nH§@¢\u0006\u0004\b\u0012\u0010\t¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/security_hub/impl/network/LinkedWalletsService;", "", "", "linkedWalletId", "Lauc/g;", "getLinkedWallet", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lauc/h;", "getLinkedWallets", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "deleteLinkedWallet", "Lauc/c;", "updateRequest", "updateSettings", "(Lauc/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cardId", "enrollToClickToPay", "acknowledgeNew", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface LinkedWalletsService {
    @POST("security-hub/linked-wallet/acknowledge-new")
    Object acknowledgeNew(@NotNull Continuation<? super Unit> continuation);

    @POST("my-card/digitized-cards/{id}/terminate")
    Object deleteLinkedWallet(@Path("id") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @POST("/my-card/{id}/digital-wallets/click-to-pay/provision")
    Object enrollToClickToPay(@Path("id") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @GET("my-card/digitized-cards/{id}")
    Object getLinkedWallet(@Path("id") @NotNull String str, @NotNull Continuation<? super g> continuation);

    @GET("my-card/digitized-cards/all")
    Object getLinkedWallets(@NotNull Continuation<? super h> continuation);

    @PATCH("my-card/settings")
    Object updateSettings(@Body @NotNull c cVar, @NotNull Continuation<? super Unit> continuation);
}
