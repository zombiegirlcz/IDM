package g1f;

import aii.e;
import kotlin.jvm.internal.Intrinsics;
import m1c.e0;
import u2f.j;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f139586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f139587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f139588c;

    public b(String agentId, j product, e0 revPointsBottomSheetContext) {
        Intrinsics.checkNotNullParameter(agentId, "agentId");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(revPointsBottomSheetContext, "revPointsBottomSheetContext");
        this.f139586a = agentId;
        this.f139587b = product;
        this.f139588c = revPointsBottomSheetContext;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f139586a, bVar.f139586a) && this.f139587b == bVar.f139587b && this.f139588c == bVar.f139588c;
    }

    public final int hashCode() {
        return this.f139588c.hashCode() + ((this.f139587b.hashCode() + (this.f139586a.hashCode() * 31)) * 31);
    }
}
