package com.revolut.feature.apm.core.impl.data.network.alias;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Tag;
import wj0.b;
import wy1.a;
import wy1.c;
import wy1.f;
import wy1.g;
import wy1.h;
import wy1.i;
import wy1.j;
import wy1.l;
import wy1.m;
import wy1.n;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J0\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000f\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u000eH§@¢\u0006\u0004\b\u000f\u0010\u0010J.\u0010\u0011\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0011\u0010\u0010J.\u0010\u0012\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0012\u0010\u0010J$\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0019\u0010\u0006J$\u0010\u001b\u001a\u00020\u000b2\b\b\u0001\u0010\u001a\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001b\u0010\u001cJ&\u0010\u001e\u001a\u00020\u001d2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0004\b\u001e\u0010\u001fJ$\u0010 \u001a\u00020\u001d2\b\b\u0001\u0010\u001a\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b \u0010\u001cJ$\u0010!\u001a\u00020\u000b2\b\b\u0001\u0010\u001a\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b!\u0010\u001cJ.\u0010\"\u001a\u00020\u000b2\b\b\u0001\u0010\u001a\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u000eH§@¢\u0006\u0004\b\"\u0010#J.\u0010%\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020$H§@¢\u0006\u0004\b%\u0010&J$\u0010)\u001a\u00020(2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020'H§@¢\u0006\u0004\b)\u0010*¨\u0006+À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/core/impl/data/network/alias/AliasService;", "", "", "aliasSystem", "Lwy1/g;", "getAliases", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lwj0/b;", "idempotencyTag", "Lwy1/h;", "body", "Lwy1/f;", "registerAlias", "(Ljava/lang/String;Lwj0/b;Lwy1/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lwy1/a;", "freezeAlias", "(Ljava/lang/String;Lwj0/b;Lwy1/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unfreezeAlias", "deleteAlias", "Lwy1/m;", "", "verifyOwnership", "(Ljava/lang/String;Lwy1/m;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lretrofit2/Response;", "Lwy1/n;", "verifyOwnershipDebug", "operationId", "getAliasOperationStatus", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lwy1/c;", "createAliasAvailabilityCheck", "(Ljava/lang/String;Lwj0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAliasAvailabilityCheck", "acceptAliasOperation", "denyAliasOperation", "(Ljava/lang/String;Ljava/lang/String;Lwy1/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lwy1/i;", "replaceAlias", "(Ljava/lang/String;Lwj0/b;Lwy1/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lwy1/j;", "Lwy1/l;", "resolveAlias", "(Ljava/lang/String;Lwy1/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_apm_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AliasService {
    @POST("/bank-account-aliases/operations/{operationId}/claims/accept")
    Object acceptAliasOperation(@Path("operationId") @NotNull String str, @NotNull @Query("aliasSystem") String str2, @NotNull Continuation<? super f> continuation);

    @POST("/bank-account-aliases/availability-check")
    Object createAliasAvailabilityCheck(@NotNull @Query("aliasSystem") String str, @Tag b bVar, @NotNull Continuation<? super c> continuation);

    @POST("bank-account-aliases/remove")
    Object deleteAlias(@NotNull @Query("aliasSystem") String str, @Tag @NotNull b bVar, @Body @NotNull a aVar, @NotNull Continuation<? super f> continuation);

    @POST("/bank-account-aliases/operations/{operationId}/claims/deny")
    Object denyAliasOperation(@Path("operationId") @NotNull String str, @NotNull @Query("aliasSystem") String str2, @Body @NotNull a aVar, @NotNull Continuation<? super f> continuation);

    @POST("bank-account-aliases/disable")
    Object freezeAlias(@NotNull @Query("aliasSystem") String str, @Tag @NotNull b bVar, @Body @NotNull a aVar, @NotNull Continuation<? super f> continuation);

    @GET("/bank-account-aliases/availability-check/{operationId}")
    Object getAliasAvailabilityCheck(@Path("operationId") @NotNull String str, @NotNull @Query("aliasSystem") String str2, @NotNull Continuation<? super c> continuation);

    @GET("/bank-account-aliases/operations/{operationId}")
    Object getAliasOperationStatus(@Path("operationId") @NotNull String str, @NotNull @Query("aliasSystem") String str2, @NotNull Continuation<? super f> continuation);

    @GET("bank-account-aliases")
    Object getAliases(@NotNull @Query("aliasSystem") String str, @NotNull Continuation<? super g> continuation);

    @POST("bank-account-aliases")
    Object registerAlias(@NotNull @Query("aliasSystem") String str, @Tag b bVar, @Body @NotNull h hVar, @NotNull Continuation<? super f> continuation);

    @POST("/bank-account-aliases/replace")
    Object replaceAlias(@NotNull @Query("aliasSystem") String str, @Tag @NotNull b bVar, @Body @NotNull i iVar, @NotNull Continuation<? super f> continuation);

    @POST("/alias-beneficiaries/{aliasSystem}/resolve")
    Object resolveAlias(@Path("aliasSystem") @NotNull String str, @Body @NotNull j jVar, @NotNull Continuation<? super l> continuation);

    @POST("bank-account-aliases/enable")
    Object unfreezeAlias(@NotNull @Query("aliasSystem") String str, @Tag @NotNull b bVar, @Body @NotNull a aVar, @NotNull Continuation<? super f> continuation);

    @POST("/bank-account-aliases/verify-ownership")
    Object verifyOwnership(@NotNull @Query("aliasSystem") String str, @Body @NotNull m mVar, @NotNull Continuation<? super Unit> continuation);

    @GET("/bank-account-aliases/verify-ownership/devcode")
    Object verifyOwnershipDebug(@NotNull @Query("aliasSystem") String str, @NotNull Continuation<? super Response<n>> continuation);
}
