package zod;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xnd.l f323993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xnd.h f323994b;

    public h(xnd.l params, xnd.h period) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(period, "period");
        this.f323993a = params;
        this.f323994b = period;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f323993a, hVar.f323993a) && Intrinsics.f(this.f323994b, hVar.f323994b);
    }

    public final int hashCode() {
        return this.f323994b.hashCode() + (this.f323993a.hashCode() * 31);
    }
}
