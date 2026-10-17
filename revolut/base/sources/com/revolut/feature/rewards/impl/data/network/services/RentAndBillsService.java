package com.revolut.feature.rewards.impl.data.network.services;

import chc.b0;
import chc.c;
import chc.f0;
import chc.n;
import chc.v;
import chc.w;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\n\u001a\u00020\u00052\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0011\u0010\u0004J\u001a\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0013\u001a\u00020\u0012H§@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/rewards/impl/data/network/services/RentAndBillsService;", "", "Lchc/b0;", "getLinkedPayments", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "id", "Lchc/w;", "getLinkedPaymentById", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "category", "Lchc/v;", "payment", "Lchc/c;", "linkPayment", "(Ljava/lang/String;Lchc/v;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lchc/n;", "getConfiguration", "Lchc/f0;", "request", "", "unlinkLinkedPayments", "(Lchc/f0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RentAndBillsService {
    @GET("rewards/rent-and-bills/config")
    Object getConfiguration(@NotNull Continuation<? super n> continuation);

    @GET("rewards/rent-and-bills/linked-payments/{id}")
    Object getLinkedPaymentById(@Path("id") @NotNull String str, @NotNull Continuation<? super w> continuation);

    @GET("rewards/rent-and-bills/linked-payments")
    Object getLinkedPayments(@NotNull Continuation<? super b0> continuation);

    @POST("rewards/rent-and-bills/{category}")
    Object linkPayment(@Path("category") @NotNull String str, @Body @NotNull v vVar, @NotNull Continuation<? super c> continuation);

    @POST("rewards/rent-and-bills/linked-payments/unlink")
    Object unlinkLinkedPayments(@Body @NotNull f0 f0Var, @NotNull Continuation<? super Unit> continuation);
}
