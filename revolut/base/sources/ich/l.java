package ich;

import com.revolut.data.model.Data;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.InstrumentsCollectionSortOption;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f160272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f160273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f160274c;
    public final boolean d;
    public final String e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InstrumentsCollectionSortOption f160275g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f160276h;
    public final List i;

    public l(Data instrumentsCollection, Data instrumentsSearchResultsData, Data data, boolean z, String searchQuery, List sortOptions, InstrumentsCollectionSortOption appliedSortOption, Data defaultFilters, List filters) {
        Intrinsics.checkNotNullParameter(instrumentsCollection, "instrumentsCollection");
        Intrinsics.checkNotNullParameter(instrumentsSearchResultsData, "instrumentsSearchResultsData");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(sortOptions, "sortOptions");
        Intrinsics.checkNotNullParameter(appliedSortOption, "appliedSortOption");
        Intrinsics.checkNotNullParameter(defaultFilters, "defaultFilters");
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.f160272a = instrumentsCollection;
        this.f160273b = instrumentsSearchResultsData;
        this.f160274c = data;
        this.d = z;
        this.e = searchQuery;
        this.f = sortOptions;
        this.f160275g = appliedSortOption;
        this.f160276h = defaultFilters;
        this.i = filters;
    }

    public static l a(l lVar, Data data, Data data2, Data data3, boolean z, String str, List list, InstrumentsCollectionSortOption instrumentsCollectionSortOption, Data data4, List list2, int i) {
        if ((i & 1) != 0) {
            data = lVar.f160272a;
        }
        Data instrumentsCollection = data;
        if ((i & 2) != 0) {
            data2 = lVar.f160273b;
        }
        Data instrumentsSearchResultsData = data2;
        if ((i & 4) != 0) {
            data3 = lVar.f160274c;
        }
        Data data5 = data3;
        if ((i & 8) != 0) {
            z = lVar.d;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            str = lVar.e;
        }
        String searchQuery = str;
        List sortOptions = (i & 32) != 0 ? lVar.f : list;
        InstrumentsCollectionSortOption appliedSortOption = (i & 64) != 0 ? lVar.f160275g : instrumentsCollectionSortOption;
        Data defaultFilters = (i & 128) != 0 ? lVar.f160276h : data4;
        List filters = (i & 256) != 0 ? lVar.i : list2;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(instrumentsCollection, "instrumentsCollection");
        Intrinsics.checkNotNullParameter(instrumentsSearchResultsData, "instrumentsSearchResultsData");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(sortOptions, "sortOptions");
        Intrinsics.checkNotNullParameter(appliedSortOption, "appliedSortOption");
        Intrinsics.checkNotNullParameter(defaultFilters, "defaultFilters");
        Intrinsics.checkNotNullParameter(filters, "filters");
        return new l(instrumentsCollection, instrumentsSearchResultsData, data5, z3, searchQuery, sortOptions, appliedSortOption, defaultFilters, filters);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f160272a, lVar.f160272a) && Intrinsics.f(this.f160273b, lVar.f160273b) && Intrinsics.f(this.f160274c, lVar.f160274c) && this.d == lVar.d && Intrinsics.f(this.e, lVar.e) && Intrinsics.f(this.f, lVar.f) && Intrinsics.f(this.f160275g, lVar.f160275g) && Intrinsics.f(this.f160276h, lVar.f160276h) && Intrinsics.f(this.i, lVar.i);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f160273b, this.f160272a.hashCode() * 31, 31);
        Data data = this.f160274c;
        return this.i.hashCode() + kii.e.c(this.f160276h, (this.f160275g.hashCode() + p.a.d(p.a.c(j6.a.c((iC + (data == null ? 0 : data.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f)) * 31, 31);
    }
}
