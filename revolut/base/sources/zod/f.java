package zod;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xnd.l f323983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xnd.h f323984b;

    public f(xnd.l params, xnd.h period) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(period, "period");
        this.f323983a = params;
        this.f323984b = period;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f323983a, fVar.f323983a) && Intrinsics.f(this.f323984b, fVar.f323984b);
    }

    public final int hashCode() {
        return this.f323984b.hashCode() + (this.f323983a.hashCode() * 31);
    }
}
