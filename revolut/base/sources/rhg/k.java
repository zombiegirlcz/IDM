package rhg;

import com.revolut.feature.travel.miles.api.model.TravelMilesSearchAppliedFilters;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelMilesSearchAppliedFilters f254454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f254455b;

    public k(TravelMilesSearchAppliedFilters appliedFilters, boolean z) {
        Intrinsics.checkNotNullParameter(appliedFilters, "appliedFilters");
        this.f254454a = appliedFilters;
        this.f254455b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f254454a, kVar.f254454a) && this.f254455b == kVar.f254455b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f254455b) + (this.f254454a.hashCode() * 31);
    }
}
