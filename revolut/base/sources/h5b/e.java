package h5b;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f149525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f149526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f149527c;
    public final dj0.d d;

    public e(dj0.d accountValue, dj0.d marginReserved, boolean z) {
        Intrinsics.checkNotNullParameter(accountValue, "accountValue");
        Intrinsics.checkNotNullParameter(marginReserved, "marginReserved");
        this.f149525a = accountValue;
        this.f149526b = marginReserved;
        this.f149527c = z;
        this.d = pyd.c.k(marginReserved, 2L);
    }

    public final long a() {
        long j2 = this.f149526b.f115082a;
        if (j2 != 0) {
            return (this.f149525a.f115082a * ((long) 100)) / j2;
        }
        r6.b.D("marginReserved is zero. Can not divide by zero");
        return 0L;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f149525a, eVar.f149525a) && Intrinsics.f(this.f149526b, eVar.f149526b) && this.f149527c == eVar.f149527c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f149527c) + v7.c(this.f149525a.hashCode() * 31, 31, this.f149526b);
    }
}
