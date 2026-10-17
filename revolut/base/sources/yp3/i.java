package yp3;

import aii.u;
import ft3.j1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1 f315774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f315775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f315776c;

    public i(j1 productType, String str, u uVar) {
        Intrinsics.checkNotNullParameter(productType, "productType");
        this.f315774a = productType;
        this.f315775b = str;
        this.f315776c = uVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f315774a == iVar.f315774a && Intrinsics.f(this.f315775b, iVar.f315775b) && Intrinsics.f(this.f315776c, iVar.f315776c);
    }

    public final int hashCode() {
        int iHashCode = this.f315774a.hashCode() * 31;
        String str = this.f315775b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        u uVar = this.f315776c;
        return iHashCode2 + (uVar != null ? uVar.hashCode() : 0);
    }
}
