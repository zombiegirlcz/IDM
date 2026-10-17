package fy6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f138943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sr6.l f138944b;

    public n(Integer num, sr6.l period) {
        Intrinsics.checkNotNullParameter(period, "period");
        this.f138943a = num;
        this.f138944b = period;
    }

    public static n a(n nVar, Integer num, sr6.l period, int i) {
        if ((i & 1) != 0) {
            num = nVar.f138943a;
        }
        if ((i & 2) != 0) {
            period = nVar.f138944b;
        }
        nVar.getClass();
        Intrinsics.checkNotNullParameter(period, "period");
        return new n(num, period);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f138943a, nVar.f138943a) && this.f138944b == nVar.f138944b;
    }

    public final int hashCode() {
        Integer num = this.f138943a;
        return this.f138944b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
    }
}
