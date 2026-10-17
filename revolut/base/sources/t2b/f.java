package t2b;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import nel.n;
import p2b.l;
import vrl.s;
import w4l.i;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f267532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f267533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u2b.a f267534c;

    public f(s orderLimitsByPortfolio, l cfdShareableQuoteInteractor, u2b.a marginQuoteParamsMapper) {
        Intrinsics.checkNotNullParameter(orderLimitsByPortfolio, "orderLimitsByPortfolio");
        Intrinsics.checkNotNullParameter(cfdShareableQuoteInteractor, "cfdShareableQuoteInteractor");
        Intrinsics.checkNotNullParameter(marginQuoteParamsMapper, "marginQuoteParamsMapper");
        this.f267532a = orderLimitsByPortfolio;
        this.f267533b = cfdShareableQuoteInteractor;
        this.f267534c = marginQuoteParamsMapper;
    }

    public final Flow a(f8l.e orderType, String portfolioId, n instrument, bfl.g side, BigDecimal longQuantity, BigDecimal shortQuantity, BigDecimal quantity, BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(longQuantity, "longQuantity");
        Intrinsics.checkNotNullParameter(shortQuantity, "shortQuantity");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        return xam.a.h(new e(this, orderType, instrument, quantity, side, longQuantity, shortQuantity, bigDecimal, null), rd0.e.b(this.f267532a.a(portfolioId, instrument.f214596b, side, (56 & 8) != 0 ? null : null, (56 & 16) != 0 ? null : Boolean.FALSE, null, (56 & 64) != 0 ? w4l.h.f294642c : i.f294643c)));
    }
}
