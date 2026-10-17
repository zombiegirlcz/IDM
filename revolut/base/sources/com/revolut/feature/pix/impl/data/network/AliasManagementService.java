package com.revolut.feature.pix.impl.data.network;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import l8a.e;
import l8a.f;
import l8a.g;
import l8a.k;
import l8a.m;
import l8a.o;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Tag;
import wj0.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b`\u0018\u00002\u00020\u0001J&\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J<\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\t\u001a\u00020\b2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\r\u0010\u000eJ<\u0010\u0010\u001a\u00020\f2\b\b\u0001\u0010\t\u001a\u00020\u000f2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0010\u0010\u0011J0\u0010\u0013\u001a\u00020\f2\b\b\u0001\u0010\u0012\u001a\u00020\u00022\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0003\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0013\u0010\u0014J<\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\t\u001a\u00020\u00152\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u001a\u001a\u00020\u00192\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0003\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001a\u0010\u001bJ<\u0010\u001c\u001a\u00020\u00162\b\b\u0001\u0010\u0012\u001a\u00020\u00022\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u001c\u0010\u001dJ<\u0010\u001e\u001a\u00020\u00162\b\b\u0001\u0010\u0012\u001a\u00020\u00022\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u001e\u0010\u001dJF\u0010\u001f\u001a\u00020\u00162\b\b\u0001\u0010\u0012\u001a\u00020\u00022\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u001f\u0010 J<\u0010!\u001a\u00020\u00162\b\b\u0001\u0010\u0012\u001a\u00020\u00022\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b!\u0010\u001dJF\u0010\"\u001a\u00020\u00162\b\b\u0001\u0010\u0012\u001a\u00020\u00022\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\"\u0010 ¨\u0006#À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/pix/impl/data/network/AliasManagementService;", "", "", "aliasSystem", "walletId", "Ll8a/k;", "getAliases", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll8a/e;", "body", "Lwj0/b;", "idempotencyTag", "Ll8a/m;", "createAlias", "(Ll8a/e;Lwj0/b;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll8a/f;", "deleteAlias", "(Ll8a/f;Lwj0/b;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "operationId", "getAliasOperation", "(Ljava/lang/String;Lwj0/b;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll8a/g;", "", "generateOwnershipVerificationCode", "(Ll8a/g;Lwj0/b;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll8a/o;", "peekOwnershipVerificationCode", "(Lwj0/b;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "claimAlias", "(Ljava/lang/String;Lwj0/b;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelClaim", "confirmClaim", "(Ljava/lang/String;Lwj0/b;Ljava/lang/String;Ljava/lang/String;Ll8a/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "acceptClaim", "denyClaim", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AliasManagementService {
    @POST("bank-account-aliases/operations/{operationId}/claims/accept")
    Object acceptClaim(@Path("operationId") @NotNull String str, @Tag b bVar, @NotNull @Query("aliasSystem") String str2, @Query("walletId") String str3, @NotNull Continuation<? super Unit> continuation);

    @POST("bank-account-aliases/operations/{operationId}/claims/cancel")
    Object cancelClaim(@Path("operationId") @NotNull String str, @Tag b bVar, @NotNull @Query("aliasSystem") String str2, @Query("walletId") String str3, @NotNull Continuation<? super Unit> continuation);

    @POST("bank-account-aliases/operations/{operationId}/claims")
    Object claimAlias(@Path("operationId") @NotNull String str, @Tag b bVar, @NotNull @Query("aliasSystem") String str2, @Query("walletId") String str3, @NotNull Continuation<? super Unit> continuation);

    @POST("bank-account-aliases/operations/{operationId}/claims/confirm")
    Object confirmClaim(@Path("operationId") @NotNull String str, @Tag b bVar, @NotNull @Query("aliasSystem") String str2, @Query("walletId") String str3, @Body @NotNull e eVar, @NotNull Continuation<? super Unit> continuation);

    @POST("bank-account-aliases")
    Object createAlias(@Body @NotNull e eVar, @Tag b bVar, @NotNull @Query("aliasSystem") String str, @Query("walletId") String str2, @NotNull Continuation<? super m> continuation);

    @POST("bank-account-aliases/remove")
    Object deleteAlias(@Body @NotNull f fVar, @Tag b bVar, @NotNull @Query("aliasSystem") String str, @Query("walletId") String str2, @NotNull Continuation<? super m> continuation);

    @POST("bank-account-aliases/operations/{operationId}/claims/deny")
    Object denyClaim(@Path("operationId") @NotNull String str, @Tag b bVar, @NotNull @Query("aliasSystem") String str2, @Query("walletId") String str3, @Body @NotNull e eVar, @NotNull Continuation<? super Unit> continuation);

    @POST("bank-account-aliases/verify-ownership")
    Object generateOwnershipVerificationCode(@Body @NotNull g gVar, @Tag b bVar, @NotNull @Query("aliasSystem") String str, @Query("walletId") String str2, @NotNull Continuation<? super Unit> continuation);

    @GET("bank-account-aliases/operations/{operationId}")
    Object getAliasOperation(@Path("operationId") @NotNull String str, @Tag b bVar, @NotNull @Query("aliasSystem") String str2, @NotNull Continuation<? super m> continuation);

    @GET("bank-account-aliases")
    Object getAliases(@NotNull @Query("aliasSystem") String str, @Query("walletId") String str2, @NotNull Continuation<? super k> continuation);

    @GET("bank-account-aliases/verify-ownership/devcode")
    Object peekOwnershipVerificationCode(@Tag b bVar, @NotNull @Query("aliasSystem") String str, @NotNull Continuation<? super o> continuation);
}
