package rwk;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f257985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f257986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f257987c;
    public final BigDecimal d;
    public final BigDecimal e;

    public f(BigDecimal min, BigDecimal max, k valueUnit) {
        Intrinsics.checkNotNullParameter(min, "min");
        Intrinsics.checkNotNullParameter(max, "max");
        Intrinsics.checkNotNullParameter(valueUnit, "valueUnit");
        this.f257985a = min;
        this.f257986b = max;
        this.f257987c = valueUnit;
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        Comparable comparableL = cim.c.l(min, ZERO);
        Intrinsics.checkNotNullExpressionValue(comparableL, "minOf(...)");
        this.d = (BigDecimal) comparableL;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        Comparable comparableK = cim.c.k(max, ZERO);
        Intrinsics.checkNotNullExpressionValue(comparableK, "maxOf(...)");
        this.e = (BigDecimal) comparableK;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f257985a, fVar.f257985a) && Intrinsics.f(this.f257986b, fVar.f257986b) && Intrinsics.f(this.f257987c, fVar.f257987c);
    }

    public final int hashCode() {
        return this.f257987c.hashCode() + t61.a.d(this.f257986b, this.f257985a.hashCode() * 31, 31);
    }
}
