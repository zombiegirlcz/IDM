package t5l;

import aw0.o9;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import d9.e1;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import xi0.b;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final BigDecimal f268117a = BigDecimal.valueOf(0.5d);

    public static CompositeClause a(b baseCurrency, b secondCurrency, BigDecimal rate, Custom custom, int i) {
        if ((i & 8) != 0) {
            custom = null;
        }
        o9 sensitivity = o9.NON_SENSITIVE;
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(secondCurrency, "secondCurrency");
        Intrinsics.checkNotNullParameter(rate, "rate");
        Intrinsics.checkNotNullParameter(sensitivity, "sensitivity");
        boolean z = rate.abs().compareTo(f268117a) < 0 && e1.D(rate);
        Pair pair = !z ? new Pair(baseCurrency, secondCurrency) : new Pair(secondCurrency, baseCurrency);
        b bVar = (b) pair.f186385a;
        b bVar2 = (b) pair.f186386b;
        if (z) {
            rate = BigDecimal.ONE.divide(rate, Math.max(rate.scale(), 5), RoundingMode.HALF_EVEN);
        }
        Intrinsics.h(rate);
        return com.revolut.core.ui_kit.models.b.d(bVar, bVar2, rate, custom, sensitivity);
    }
}
