package w5h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f295272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f295273b;

    public f(e health, double d) {
        Intrinsics.checkNotNullParameter(health, "health");
        this.f295272a = health;
        this.f295273b = d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f295272a == fVar.f295272a && Double.compare(this.f295273b, fVar.f295273b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f295273b) + (this.f295272a.hashCode() * 31);
    }
}
