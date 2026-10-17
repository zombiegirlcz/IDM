package com.revolut.feature.payments.air.widget.impl.data.network;

import com.revolut.feature.payments.air.widget.impl.model.PaymentWidget;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/payments/air/widget/impl/data/network/PaymentWidgetService;", "", "getPaymentWidget", "Lcom/revolut/feature/payments/air/widget/impl/model/PaymentWidget;", "widgetInstanceId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_payments_air_widget_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PaymentWidgetService {
    @GET("social/payment-widgets/{widgetInstanceId}")
    Object getPaymentWidget(@Path("widgetInstanceId") @NotNull String str, @NotNull Continuation<? super PaymentWidget> continuation);
}
