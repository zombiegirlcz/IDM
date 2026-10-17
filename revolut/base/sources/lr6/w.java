package lr6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f199418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f199419b;

    public w(x online, x xVar) {
        Intrinsics.checkNotNullParameter(online, "online");
        this.f199418a = online;
        this.f199419b = xVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f199418a, wVar.f199418a) && Intrinsics.f(this.f199419b, wVar.f199419b);
    }

    public final int hashCode() {
        int iHashCode = this.f199418a.hashCode() * 31;
        x xVar = this.f199419b;
        return iHashCode + (xVar == null ? 0 : xVar.hashCode());
    }
}
