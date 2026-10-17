package qi7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vel.f f246671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f246672b;

    public h(vel.f performanceAsset, g gVar) {
        Intrinsics.checkNotNullParameter(performanceAsset, "performanceAsset");
        this.f246671a = performanceAsset;
        this.f246672b = gVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f246671a, hVar.f246671a) && Intrinsics.f(this.f246672b, hVar.f246672b);
    }

    public final int hashCode() {
        int iHashCode = this.f246671a.hashCode() * 31;
        g gVar = this.f246672b;
        return iHashCode + (gVar == null ? 0 : gVar.hashCode());
    }
}
