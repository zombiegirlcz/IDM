package gsb;

import com.revolut.feature.retail.cfd.api.domain.models.MarginQuote;
import d9.e1;
import java.math.BigDecimal;
import k4l.e0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qy5.a f146353a;

    public a(l4i.a amountConverter, qy5.a stateDetailsValidator) {
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        Intrinsics.checkNotNullParameter(stateDetailsValidator, "stateDetailsValidator");
        this.f146353a = stateDetailsValidator;
    }

    @Override // gsb.b
    public final t a(bfl.g tradeSide, qrb.b inputType, qrb.k tradeInstrumentData, qrb.e quote) {
        t tVarR;
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(inputType, "inputType");
        Intrinsics.checkNotNullParameter(tradeInstrumentData, "tradeInstrumentData");
        Intrinsics.checkNotNullParameter(quote, "quote");
        if (!(quote instanceof qrb.c)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (!(tradeInstrumentData instanceof qrb.g)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        MarginQuote marginQuote = ((qrb.c) quote).f248683a;
        dj0.d dVarB = l4i.a.b(marginQuote.f82110a);
        qrb.g gVar = (qrb.g) tradeInstrumentData;
        e0 e0Var = gVar.f;
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(e0Var.f180956g);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        BigDecimal bigDecimal = e0Var.f180957h;
        if (bigDecimal == null) {
            bigDecimal = BigDecimal.ZERO;
        }
        BigDecimal bigDecimal2 = marginQuote.d.f104717a;
        if (bigDecimal2.compareTo(bigDecimalValueOf) > 0) {
            tVarR = new d(bigDecimalValueOf);
        } else if (e1.G(bigDecimal2) && bigDecimal2.compareTo(bigDecimal) < 0) {
            Intrinsics.h(bigDecimal);
            tVarR = new e(bigDecimal);
        } else if (pyd.c.O(dVarB, gVar.f248691g.f248681a).compareTo(new dj0.d(0L, dVarB.f115083b)) < 0) {
            tVarR = c.f146354a;
        } else {
            nel.n nVar = gVar.f248690c;
            tVarR = this.f146353a.r(nVar.f, nVar.f214608t);
        }
        return tVarR == null ? f.f146357a : tVarR;
    }
}
