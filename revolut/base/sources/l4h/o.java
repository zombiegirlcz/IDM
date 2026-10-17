package l4h;

import d9.e1;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class o {
    public static final BigDecimal a(BigDecimal balance, BigDecimal initial) {
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(initial, "initial");
        if (!e1.D(initial)) {
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            return ZERO;
        }
        BigDecimal bigDecimal = new BigDecimal(100);
        MathContext mathContext = MathContext.DECIMAL128;
        BigDecimal bigDecimalDivide = bigDecimal.multiply(balance, mathContext).divide(initial, mathContext);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        return bigDecimalDivide;
    }

    public static final BigDecimal b(eel.k kVar, int i, int i2) {
        List list = kVar.f125232a;
        List list2 = kVar.f125232a;
        if (list.isEmpty()) {
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            return ZERO;
        }
        int iG = kotlin.ranges.f.g(i, 0, list2.size() - 1);
        BigDecimal bigDecimal = ((eel.f) ((eel.l) list2.get(kotlin.ranges.f.g(i2, iG, list2.size() - 1))).f125239c).f125230a.f126703a;
        eel.h hVar = kVar.d;
        if (iG != 0) {
            hVar = null;
        }
        eel.f fVar = (eel.f) hVar;
        ej0.b bVar = fVar != null ? fVar.f125230a : null;
        if (bVar == null) {
            bVar = ((eel.f) ((eel.l) list2.get(iG)).f125239c).f125230a;
        }
        BigDecimal bigDecimalSubtract = bigDecimal.subtract(bVar.f126703a);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        return bigDecimalSubtract;
    }

    public static final BigDecimal c(BigDecimal bigDecimal, nel.n nVar) {
        Integer num;
        BigDecimal scale;
        return (nVar == null || (num = nVar.f214603n) == null || (scale = bigDecimal.setScale(num.intValue(), RoundingMode.HALF_UP)) == null) ? bigDecimal : scale;
    }
}
