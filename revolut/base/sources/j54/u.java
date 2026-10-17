package j54;

import ft3.j1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class u extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j1 f171568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f171569c;
    public final aii.u d;

    public u(j1 productType, String str, aii.u uVar) {
        Intrinsics.checkNotNullParameter(productType, "productType");
        this.f171568b = productType;
        this.f171569c = str;
        this.d = uVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return this.f171568b == uVar.f171568b && Intrinsics.f(this.f171569c, uVar.f171569c) && Intrinsics.f(this.d, uVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f171568b.hashCode() * 31;
        String str = this.f171569c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        aii.u uVar = this.d;
        return iHashCode2 + (uVar != null ? uVar.hashCode() : 0);
    }
}
