package nch;

import com.revolut.feature.wealth.api.domain.model.instruments_collection.filters.InstrumentsCollectionFilter;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstrumentsCollectionFilter.ListFilter f214185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f214186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f214187c;

    public f(InstrumentsCollectionFilter.ListFilter listFilter, List filterValueSearchResults, String searchQuery) {
        Intrinsics.checkNotNullParameter(listFilter, "listFilter");
        Intrinsics.checkNotNullParameter(filterValueSearchResults, "filterValueSearchResults");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this.f214185a = listFilter;
        this.f214186b = filterValueSearchResults;
        this.f214187c = searchQuery;
    }

    public static f a(f fVar, InstrumentsCollectionFilter.ListFilter listFilter, ArrayList filterValueSearchResults, String searchQuery, int i) {
        if ((i & 1) != 0) {
            listFilter = fVar.f214185a;
        }
        if ((i & 4) != 0) {
            searchQuery = fVar.f214187c;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(listFilter, "listFilter");
        Intrinsics.checkNotNullParameter(filterValueSearchResults, "filterValueSearchResults");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        return new f(listFilter, filterValueSearchResults, searchQuery);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f214185a, fVar.f214185a) && Intrinsics.f(this.f214186b, fVar.f214186b) && Intrinsics.f(this.f214187c, fVar.f214187c);
    }

    public final int hashCode() {
        return this.f214187c.hashCode() + p.a.d(this.f214185a.hashCode() * 31, 31, this.f214186b);
    }
}
