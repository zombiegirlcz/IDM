package mlk;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class s extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f207022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f207023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f207024c;
    public final ggk.z d;
    public final w e;
    public final ggk.u f;

    public s(List list, List cardsToTerminate, List list2, ggk.z zVar, w wVar, ggk.u uVar) {
        Intrinsics.checkNotNullParameter(cardsToTerminate, "cardsToTerminate");
        this.f207022a = list;
        this.f207023b = cardsToTerminate;
        this.f207024c = list2;
        this.d = zVar;
        this.e = wVar;
        this.f = uVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f207022a, sVar.f207022a) && Intrinsics.f(this.f207023b, sVar.f207023b) && Intrinsics.f(this.f207024c, sVar.f207024c) && Intrinsics.f(this.d, sVar.d) && Intrinsics.f(this.e, sVar.e) && this.f == sVar.f;
    }

    public final int hashCode() {
        List list = this.f207022a;
        int iD = p.a.d((list == null ? 0 : list.hashCode()) * 31, 31, this.f207023b);
        List list2 = this.f207024c;
        int iHashCode = (iD + (list2 == null ? 0 : list2.hashCode())) * 31;
        ggk.z zVar = this.d;
        int iHashCode2 = (iHashCode + (zVar == null ? 0 : zVar.hashCode())) * 31;
        w wVar = this.e;
        int iHashCode3 = (iHashCode2 + (wVar == null ? 0 : wVar.hashCode())) * 31;
        ggk.u uVar = this.f;
        return iHashCode3 + (uVar != null ? uVar.hashCode() : 0);
    }
}
