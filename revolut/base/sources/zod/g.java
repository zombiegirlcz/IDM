package zod;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xnd.l f323988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xnd.h f323989b;

    public g(xnd.l params, xnd.h period) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(period, "period");
        this.f323988a = params;
        this.f323989b = period;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f323988a, gVar.f323988a) && Intrinsics.f(this.f323989b, gVar.f323989b);
    }

    public final int hashCode() {
        return this.f323989b.hashCode() + (this.f323988a.hashCode() * 31);
    }
}
