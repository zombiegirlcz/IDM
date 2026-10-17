package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f215758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f215759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f215760c;

    public e(double d, long j2, String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f215758a = d;
        this.f215759b = j2;
        this.f215760c = currency;
    }

    public final long a() {
        return this.f215759b;
    }

    public final String b() {
        return this.f215760c;
    }

    public final double c() {
        return this.f215758a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Double.compare(this.f215758a, eVar.f215758a) == 0 && this.f215759b == eVar.f215759b && Intrinsics.f(this.f215760c, eVar.f215760c);
    }

    public final int hashCode() {
        return this.f215760c.hashCode() + a0.d.c(Double.hashCode(this.f215758a) * 31, 31, this.f215759b);
    }
}
