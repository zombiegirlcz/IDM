package ll4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yw4.b f196525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f196526b;

    public o(yw4.b balanceDisplay, l lVar) {
        Intrinsics.checkNotNullParameter(balanceDisplay, "balanceDisplay");
        this.f196525a = balanceDisplay;
        this.f196526b = lVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f196525a, oVar.f196525a) && Intrinsics.f(this.f196526b, oVar.f196526b);
    }

    public final int hashCode() {
        int iHashCode = this.f196525a.hashCode() * 31;
        l lVar = this.f196526b;
        return iHashCode + (lVar == null ? 0 : lVar.f196524a.hashCode());
    }
}
