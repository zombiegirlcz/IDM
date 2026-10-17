package com.revolut.retail.feature.payments.payment_links.impl.data;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import n7k.c;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/payments/payment_links/impl/data/TransferLinkService;", "", "Ln7k/c;", "getLimits", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_payments_payment_links_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TransferLinkService {
    @GET("transfer-link/limits")
    Object getLimits(@NotNull Continuation<? super c> continuation);
}
