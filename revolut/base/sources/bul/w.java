package bul;

import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import d9.e1;
import k4l.r0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class w implements v, e4i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l4i.a f18919a;

    public w(s orderQuoteAmountProvider, l4i.a amountConverter) {
        Intrinsics.checkNotNullParameter(orderQuoteAmountProvider, "orderQuoteAmountProvider");
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        this.f18919a = amountConverter;
    }

    @Override // bul.v
    public final dfl.x a(OrderQuote orderQuote) {
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        throw new IllegalStateException("Recurring order type doesn't support quantity based order");
    }

    @Override // bul.v
    public final dfl.a b(OrderQuote orderQuote) {
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        dj0.d dVarG = g(e1.v(orderQuote));
        return new dfl.a(dVarG.f115082a, dVarG.f115083b);
    }

    @Override // bul.v
    public final boolean c(r0 orderType) {
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        return oi0.d.B(orderType);
    }

    @Override // e4i.a
    public final l4i.a e() {
        return this.f18919a;
    }
}
