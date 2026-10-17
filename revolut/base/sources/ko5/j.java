package ko5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f186232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f186233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f186234c;
    public final long d;

    public j(double d, long j2, xi0.b from, xi0.b to6) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        this.f186232a = from;
        this.f186233b = to6;
        this.f186234c = d;
        this.d = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f186232a, jVar.f186232a) && Intrinsics.f(this.f186233b, jVar.f186233b) && Double.compare(this.f186234c, jVar.f186234c) == 0 && this.d == jVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + m72.b.c(h30.l.j(this.f186233b, this.f186232a.hashCode() * 31, 31), this.f186234c, 31);
    }
}
