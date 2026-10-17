package ip0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class vg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f166810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nw0.a f166811b;

    public vg(Clause revPointsTitle, nw0.a revPointsPrice) {
        Intrinsics.checkNotNullParameter(revPointsTitle, "revPointsTitle");
        Intrinsics.checkNotNullParameter(revPointsPrice, "revPointsPrice");
        this.f166810a = revPointsTitle;
        this.f166811b = revPointsPrice;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof vg)) {
            return false;
        }
        vg vgVar = (vg) obj2;
        return Intrinsics.f(this.f166810a, vgVar.f166810a) && Intrinsics.f(this.f166811b, vgVar.f166811b);
    }

    public final int hashCode() {
        return this.f166811b.hashCode() + (this.f166810a.hashCode() * 31);
    }
}
