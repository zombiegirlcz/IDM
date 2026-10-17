package z1k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f318859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f318860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f318861c;

    public f(double d, long j2, String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f318859a = currency;
        this.f318860b = j2;
        this.f318861c = d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f318859a, fVar.f318859a) && this.f318860b == fVar.f318860b && Double.compare(this.f318861c, fVar.f318861c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f318861c) + a0.d.c(this.f318859a.hashCode() * 31, 31, this.f318860b);
    }
}
