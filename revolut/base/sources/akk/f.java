package akk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hha.i f5974c;

    public f(hha.i iVar, String planId, String str) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f5972a = planId;
        this.f5973b = str;
        this.f5974c = iVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f5972a, fVar.f5972a) && Intrinsics.f(this.f5973b, fVar.f5973b) && this.f5974c == fVar.f5974c;
    }

    public final int hashCode() {
        int iHashCode = this.f5972a.hashCode() * 31;
        String str = this.f5973b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        hha.i iVar = this.f5974c;
        return iHashCode2 + (iVar != null ? iVar.hashCode() : 0);
    }
}
