package zod;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xnd.l f323996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xnd.h f323997b;

    public i(xnd.l params, xnd.h period) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(period, "period");
        this.f323996a = params;
        this.f323997b = period;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f323996a, iVar.f323996a) && Intrinsics.f(this.f323997b, iVar.f323997b);
    }

    public final int hashCode() {
        return this.f323997b.hashCode() + (this.f323996a.hashCode() * 31);
    }
}
