package mic;

import aw0.u4;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class y implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f205682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u4 f205683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oic.d f205684c;

    public y(List items, u4 u4Var, oic.d dVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f205682a = items;
        this.f205683b = u4Var;
        this.f205684c = dVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f205682a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f205682a, yVar.f205682a) && Intrinsics.f(this.f205683b, yVar.f205683b) && Intrinsics.f(this.f205684c, yVar.f205684c);
    }

    public final int hashCode() {
        int iHashCode = this.f205682a.hashCode() * 31;
        u4 u4Var = this.f205683b;
        int iHashCode2 = (iHashCode + (u4Var == null ? 0 : u4Var.hashCode())) * 31;
        oic.d dVar = this.f205684c;
        return iHashCode2 + (dVar != null ? dVar.hashCode() : 0);
    }

    public y() {
        this(zhm.f0.f322471a, null, null);
    }
}
