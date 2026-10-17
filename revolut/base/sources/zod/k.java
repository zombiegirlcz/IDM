package zod;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xnd.l f324001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xnd.h f324002b;

    public k(xnd.l params, xnd.h period) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(period, "period");
        this.f324001a = params;
        this.f324002b = period;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f324001a, kVar.f324001a) && Intrinsics.f(this.f324002b, kVar.f324002b);
    }

    public final int hashCode() {
        return this.f324002b.hashCode() + (this.f324001a.hashCode() * 31);
    }
}
