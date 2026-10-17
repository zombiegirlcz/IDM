package com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment;

import com.revolut.feature.external_accounts.impl.domain.open_banking.payment_fees.OutboundPaymentBreakdown;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.OutboundPaymentExtras;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c extends q implements Function1 {
    public static final c f = new c();

    public c() {
        super(1, OutboundPaymentExtras.PaymentBreakdown.class, "<init>", "<init>(Lcom/revolut/feature/external_accounts/impl/domain/open_banking/payment_fees/OutboundPaymentBreakdown;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        OutboundPaymentBreakdown p0 = (OutboundPaymentBreakdown) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return new OutboundPaymentExtras.PaymentBreakdown(p0);
    }
}
