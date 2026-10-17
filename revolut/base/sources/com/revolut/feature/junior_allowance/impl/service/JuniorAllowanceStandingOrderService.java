package com.revolut.feature.junior_allowance.impl.service;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import wb8.g;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/junior_allowance/impl/service/JuniorAllowanceStandingOrderService;", "", "", "Lwb8/g;", "getAllowanceStandingOrders", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_junior_allowance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface JuniorAllowanceStandingOrderService {
    @GET("/youth/allowance-standing-orders")
    Object getAllowanceStandingOrders(@NotNull Continuation<? super List<g>> continuation);
}
