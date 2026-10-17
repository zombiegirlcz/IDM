package nch;

import com.revolut.feature.wealth.api.domain.model.instruments_collection.filters.InstrumentsCollectionFilter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstrumentsCollectionFilter.ListFilter f214188a;

    public g(InstrumentsCollectionFilter.ListFilter listFilter) {
        Intrinsics.checkNotNullParameter(listFilter, "listFilter");
        this.f214188a = listFilter;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f214188a, ((g) obj2).f214188a);
    }

    public final int hashCode() {
        return this.f214188a.hashCode();
    }
}
