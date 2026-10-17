package com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment;

import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.OutboundPaymentExtras;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b extends q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, OutboundPaymentExtras.LegacyQuote.class, "<init>", "<init>(Lcom/revolut/shared/feature/market_data/models/domain/models/OrderQuote;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        OrderQuote p0 = (OrderQuote) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return new OutboundPaymentExtras.LegacyQuote(p0);
    }
}
