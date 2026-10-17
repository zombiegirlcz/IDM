package dod;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yld.d f116545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xnd.l f116546c;
    public final xnd.h d;

    public g(yld.d screenType, xnd.l params, xnd.h period) {
        Intrinsics.checkNotNullParameter(screenType, "screenType");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(period, "period");
        this.f116545b = screenType;
        this.f116546c = params;
        this.d = period;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f116545b == gVar.f116545b && Intrinsics.f(this.f116546c, gVar.f116546c) && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f116546c.hashCode() + (this.f116545b.hashCode() * 31)) * 31);
    }
}
