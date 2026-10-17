package cw5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f109534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f109535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f109536c;
    public final double d;
    public final double e;
    public final double f;

    public b(String code, long j2, double d, double d5, double d6, double d10) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f109534a = code;
        this.f109535b = j2;
        this.f109536c = d;
        this.d = d5;
        this.e = d6;
        this.f = d10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f109534a, bVar.f109534a) && this.f109535b == bVar.f109535b && Double.compare(this.f109536c, bVar.f109536c) == 0 && Double.compare(this.d, bVar.d) == 0 && Double.compare(this.e, bVar.e) == 0 && Double.compare(this.f, bVar.f) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f) + m72.b.c(m72.b.c(m72.b.c(a0.d.c(this.f109534a.hashCode() * 31, 31, this.f109535b), this.f109536c, 31), this.d, 31), this.e, 31);
    }
}
