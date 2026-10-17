package g1f;

import aii.e;
import kotlin.jvm.internal.Intrinsics;
import m1c.e0;
import u2f.j;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f139589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f139590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f139591c;
    public final Integer d;

    public c(String agentId, j product, e0 revPointsBottomSheetContext, Integer num) {
        Intrinsics.checkNotNullParameter(agentId, "agentId");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(revPointsBottomSheetContext, "revPointsBottomSheetContext");
        this.f139589a = agentId;
        this.f139590b = product;
        this.f139591c = revPointsBottomSheetContext;
        this.d = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f139589a, cVar.f139589a) && this.f139590b == cVar.f139590b && this.f139591c == cVar.f139591c && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f139591c.hashCode() + ((this.f139590b.hashCode() + (this.f139589a.hashCode() * 31)) * 31)) * 31;
        Integer num = this.d;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
