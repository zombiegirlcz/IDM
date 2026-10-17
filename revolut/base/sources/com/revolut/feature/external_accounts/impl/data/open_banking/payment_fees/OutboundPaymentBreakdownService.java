package com.revolut.feature.external_accounts.impl.data.open_banking.payment_fees;

import kf6.c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0004\u001a\u00020\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/data/open_banking/payment_fees/OutboundPaymentBreakdownService;", "", "Lkf6/c;", "request", "getOutboundPaymentBreakdown", "(Lkf6/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface OutboundPaymentBreakdownService {
    @POST("consents/payment/charges")
    Object getOutboundPaymentBreakdown(@Body @NotNull c cVar, @NotNull Continuation<Object> continuation);
}
