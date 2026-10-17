package xzg;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f309998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f309999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f310000c;

    public i(long j2, BigDecimal rate, String percentageChange) {
        Intrinsics.checkNotNullParameter(rate, "rate");
        Intrinsics.checkNotNullParameter(percentageChange, "percentageChange");
        this.f309998a = j2;
        this.f309999b = rate;
        this.f310000c = percentageChange;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f309998a == iVar.f309998a && Intrinsics.f(this.f309999b, iVar.f309999b) && Intrinsics.f(this.f310000c, iVar.f310000c);
    }

    public final int hashCode() {
        return this.f310000c.hashCode() + t61.a.d(this.f309999b, Long.hashCode(this.f309998a) * 31, 31);
    }
}
