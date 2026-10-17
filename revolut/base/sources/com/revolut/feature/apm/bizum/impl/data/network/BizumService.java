package com.revolut.feature.apm.bizum.impl.data.network;

import js1.a;
import js1.b;
import js1.d;
import js1.e;
import js1.g;
import js1.h;
import js1.i;
import js1.j;
import js1.k;
import js1.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Tag;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH§@¢\u0006\u0004\b\f\u0010\u0004J\u001a\u0010\u000e\u001a\u00020\u00012\b\b\u0001\u0010\u0006\u001a\u00020\rH§@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0011\u0010\u0004J \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0006\u001a\u00020\u0012H§@¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u0006\u001a\u00020\u00152\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0016H§@¢\u0006\u0004\b\u0019\u0010\u001aJ&\u0010\u001c\u001a\u00020\u00182\b\b\u0001\u0010\u0006\u001a\u00020\u001b2\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0016H§@¢\u0006\u0004\b\u001c\u0010\u001dJ&\u0010!\u001a\u00020 2\b\b\u0001\u0010\u001f\u001a\u00020\u001e2\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0016H§@¢\u0006\u0004\b!\u0010\"¨\u0006#À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/bizum/impl/data/network/BizumService;", "", "Ljs1/e;", "getBizumUserRegistrationStatus", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljs1/b;", "body", "Ljs1/d;", "postBizumUser", "(Ljs1/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lretrofit2/Response;", "", "deleteBizumUser", "Ljs1/a;", "postBizumContact", "(Ljs1/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljs1/g;", "getBizumSettings", "Ljs1/h;", "patchBizumSettings", "(Ljs1/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljs1/i;", "Lwj0/b;", "idempotencyTag", "Ljs1/l;", "postTransfer", "(Ljs1/i;Lwj0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljs1/j;", "postTransferFx", "(Ljs1/j;Lwj0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "id", "Ljs1/k;", "postTransferConfirmation", "(Ljava/lang/String;Lwj0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_apm_bizum_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BizumService {
    @DELETE("bizum/user")
    Object deleteBizumUser(@NotNull Continuation<? super Response<Unit>> continuation);

    @GET("bizum/settings")
    Object getBizumSettings(@NotNull Continuation<? super g> continuation);

    @GET("bizum/user")
    Object getBizumUserRegistrationStatus(@NotNull Continuation<? super e> continuation);

    @PATCH("bizum/settings")
    Object patchBizumSettings(@Body @NotNull h hVar, @NotNull Continuation<? super Response<Unit>> continuation);

    @POST("bizum/contact/discovery")
    Object postBizumContact(@Body @NotNull a aVar, @NotNull Continuation<Object> continuation);

    @POST("bizum/user")
    Object postBizumUser(@Body @NotNull b bVar, @NotNull Continuation<? super d> continuation);

    @POST("bizum-transfers")
    Object postTransfer(@Body @NotNull i iVar, @Tag wj0.b bVar, @NotNull Continuation<? super l> continuation);

    @POST("bizum-transfers/{id}/confirm")
    Object postTransferConfirmation(@Path("id") @NotNull String str, @Tag wj0.b bVar, @NotNull Continuation<? super k> continuation);

    @POST("transfers/bizum")
    Object postTransferFx(@Body @NotNull j jVar, @Tag wj0.b bVar, @NotNull Continuation<? super l> continuation);
}
