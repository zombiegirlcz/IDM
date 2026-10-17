package jch;

import com.revolut.feature.wealth.api.domain.model.instruments_collection.filters.InstrumentsCollectionFilter;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.filters.InstrumentsCollectionFilterId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstrumentsCollectionFilterId f172806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InstrumentsCollectionFilter.RangeFilter.Range f172807b;

    public n(InstrumentsCollectionFilterId filterId, InstrumentsCollectionFilter.RangeFilter.Range filterRange) {
        Intrinsics.checkNotNullParameter(filterId, "filterId");
        Intrinsics.checkNotNullParameter(filterRange, "filterRange");
        this.f172806a = filterId;
        this.f172807b = filterRange;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f172806a, nVar.f172806a) && Intrinsics.f(this.f172807b, nVar.f172807b);
    }

    public final int hashCode() {
        return this.f172807b.hashCode() + (this.f172806a.hashCode() * 31);
    }
}
