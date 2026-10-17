package jch;

import com.revolut.feature.wealth.api.domain.model.instruments_collection.filters.InstrumentsCollectionFilter;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.filters.InstrumentsCollectionFilterId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstrumentsCollectionFilterId f172803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InstrumentsCollectionFilter.ListFilter.Value f172804b;

    public k(InstrumentsCollectionFilterId filterId, InstrumentsCollectionFilter.ListFilter.Value filterValue) {
        Intrinsics.checkNotNullParameter(filterId, "filterId");
        Intrinsics.checkNotNullParameter(filterValue, "filterValue");
        this.f172803a = filterId;
        this.f172804b = filterValue;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f172803a, kVar.f172803a) && Intrinsics.f(this.f172804b, kVar.f172804b);
    }

    public final int hashCode() {
        return this.f172804b.hashCode() + (this.f172803a.hashCode() * 31);
    }
}
