package d3c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f111068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f111069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f111070c;
    public final u d;

    public w(String productDescription, v vVar, s sVar, u uVar) {
        Intrinsics.checkNotNullParameter(productDescription, "productDescription");
        this.f111068a = productDescription;
        this.f111069b = vVar;
        this.f111070c = sVar;
        this.d = uVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f111068a, wVar.f111068a) && Intrinsics.f(this.f111069b, wVar.f111069b) && Intrinsics.f(this.f111070c, wVar.f111070c) && Intrinsics.f(this.d, wVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f111068a.hashCode() * 31;
        v vVar = this.f111069b;
        int iHashCode2 = (iHashCode + (vVar == null ? 0 : vVar.hashCode())) * 31;
        s sVar = this.f111070c;
        int iHashCode3 = (iHashCode2 + (sVar == null ? 0 : sVar.hashCode())) * 31;
        u uVar = this.d;
        return iHashCode3 + (uVar != null ? uVar.hashCode() : 0);
    }
}
