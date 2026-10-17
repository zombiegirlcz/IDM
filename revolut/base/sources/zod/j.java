package zod;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xnd.l f323999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xnd.h f324000b;

    public j(xnd.l params, xnd.h period) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(period, "period");
        this.f323999a = params;
        this.f324000b = period;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f323999a, jVar.f323999a) && Intrinsics.f(this.f324000b, jVar.f324000b);
    }

    public final int hashCode() {
        return this.f324000b.hashCode() + (this.f323999a.hashCode() * 31);
    }
}
