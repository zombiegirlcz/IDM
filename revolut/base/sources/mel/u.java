package mel;

import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class u {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final BigDecimal f204775c = new BigDecimal("0.99");
    public static final BigDecimal d = new BigDecimal("0.01");
    public static final BigDecimal e = new BigDecimal("0.5");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f204776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f204777b;

    public u(BigDecimal value, BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f204776a = value;
        this.f204777b = bigDecimal;
    }

    public final BigDecimal a() {
        BigDecimal bigDecimal = this.f204777b;
        if (bigDecimal == null) {
            return null;
        }
        BigDecimal bigDecimal2 = (BigDecimal) kotlin.ranges.f.j(bigDecimal, d, f204775c);
        s sVarB = b();
        int i = sVarB == null ? -1 : t.f204774a[sVarB.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i != 1) {
            if (i == 2 || i == 3) {
                return bigDecimal2.setScale(2, RoundingMode.HALF_EVEN);
            }
            throw new NoWhenBranchMatchedException();
        }
        BigDecimal ONE = BigDecimal.ONE;
        Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
        BigDecimal bigDecimalSubtract = ONE.subtract(bigDecimal2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        return bigDecimalSubtract.setScale(2, RoundingMode.HALF_EVEN);
    }

    public final s b() {
        BigDecimal bigDecimal = this.f204777b;
        if (bigDecimal == null) {
            return null;
        }
        BigDecimal bigDecimal2 = e;
        return bigDecimal.compareTo(bigDecimal2) > 0 ? s.TOP : bigDecimal.compareTo(bigDecimal2) < 0 ? s.BOTTOM : s.MIDDLE;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f204776a, uVar.f204776a) && Intrinsics.f(this.f204777b, uVar.f204777b);
    }

    public final int hashCode() {
        int iHashCode = this.f204776a.hashCode() * 31;
        BigDecimal bigDecimal = this.f204777b;
        return iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode());
    }
}
