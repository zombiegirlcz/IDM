package ich;

import com.revolut.feature.wealth.api.domain.model.instruments_collection.filters.InstrumentsCollectionFilter;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.filters.InstrumentsCollectionFilterId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstrumentsCollectionFilterId f160277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InstrumentsCollectionFilter.ListFilter.Value f160278b;

    public n(InstrumentsCollectionFilterId filterId, InstrumentsCollectionFilter.ListFilter.Value filterValue) {
        Intrinsics.checkNotNullParameter(filterId, "filterId");
        Intrinsics.checkNotNullParameter(filterValue, "filterValue");
        this.f160277a = filterId;
        this.f160278b = filterValue;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f160277a, nVar.f160277a) && Intrinsics.f(this.f160278b, nVar.f160278b);
    }

    public final int hashCode() {
        return this.f160278b.hashCode() + (this.f160277a.hashCode() * 31);
    }
}
