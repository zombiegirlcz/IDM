package com.revolut.feature.cashback.impl.network;

import fd3.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0006\u0010\u0004¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/cashback/impl/network/CashbackStatusService;", "", "Lfd3/h;", "getCashbackStatus", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "postCloseCashback", "feature_cashback_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CashbackStatusService {
    @GET("/cashback/status")
    Object getCashbackStatus(@NotNull Continuation<? super h> continuation);

    @POST("/cashback/close")
    Object postCloseCashback(@NotNull Continuation<? super Unit> continuation);
}
