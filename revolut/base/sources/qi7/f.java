package qi7;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f246668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f246669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f246670c;

    public f(BigDecimal totalShareholderReturn, BigDecimal sharpeRatio, BigDecimal volatility) {
        Intrinsics.checkNotNullParameter(totalShareholderReturn, "totalShareholderReturn");
        Intrinsics.checkNotNullParameter(sharpeRatio, "sharpeRatio");
        Intrinsics.checkNotNullParameter(volatility, "volatility");
        this.f246668a = totalShareholderReturn;
        this.f246669b = sharpeRatio;
        this.f246670c = volatility;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f246668a, fVar.f246668a) && Intrinsics.f(this.f246669b, fVar.f246669b) && Intrinsics.f(this.f246670c, fVar.f246670c);
    }

    public final int hashCode() {
        return this.f246670c.hashCode() + t61.a.d(this.f246669b, this.f246668a.hashCode() * 31, 31);
    }
}
