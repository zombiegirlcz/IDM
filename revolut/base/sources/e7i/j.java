package e7i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f123338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f123339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ibd.j f123340c;
    public final boolean d;

    public j(long j2, xi0.b currency, ibd.j period, boolean z) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(period, "period");
        this.f123338a = j2;
        this.f123339b = currency;
        this.f123340c = period;
        this.d = z;
    }

    public static j a(j jVar, long j2, ibd.j jVar2, int i) {
        if ((i & 1) != 0) {
            j2 = jVar.f123338a;
        }
        long j3 = j2;
        xi0.b currency = jVar.f123339b;
        if ((i & 4) != 0) {
            jVar2 = jVar.f123340c;
        }
        ibd.j period = jVar2;
        boolean z = jVar.d;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(period, "period");
        return new j(j3, currency, period, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f123338a == jVar.f123338a && Intrinsics.f(this.f123339b, jVar.f123339b) && this.f123340c == jVar.f123340c && this.d == jVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.f123340c.hashCode() + h30.l.j(this.f123339b, Long.hashCode(this.f123338a) * 31, 31)) * 31);
    }
}
