package ind;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class z implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f162835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f162836b;

    public z(List inflow, List outflow) {
        Intrinsics.checkNotNullParameter(inflow, "inflow");
        Intrinsics.checkNotNullParameter(outflow, "outflow");
        this.f162835a = inflow;
        this.f162836b = outflow;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f162835a, zVar.f162835a) && Intrinsics.f(this.f162836b, zVar.f162836b);
    }

    public final int hashCode() {
        return this.f162836b.hashCode() + (this.f162835a.hashCode() * 31);
    }

    @Override // ind.b0
    public final boolean isEmpty() {
        return this.f162835a.isEmpty() && this.f162836b.isEmpty();
    }
}
