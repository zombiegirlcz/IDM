package ind;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f162833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f162834b;

    public y(Clause clause, String pieId) {
        Intrinsics.checkNotNullParameter(pieId, "pieId");
        this.f162833a = pieId;
        this.f162834b = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f162833a, yVar.f162833a) && Intrinsics.f(this.f162834b, yVar.f162834b);
    }

    public final int hashCode() {
        int iHashCode = this.f162833a.hashCode() * 31;
        Clause clause = this.f162834b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
