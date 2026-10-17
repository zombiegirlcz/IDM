package ox5;

import com.revolut.data.model.Data;
import com.revolut.feature.cryptocommodity_invest.models.SortingType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sh5.c f230585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f230586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f230587c;
    public final Data d;
    public final Data e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f230588g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SortingType f230589h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final xzg.n0 f230590j;
    public final Data k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f230591l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f230592m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Data f230593n;
    public final boolean o;

    public l() {
        this(0, 32767);
    }

    public static l a(l lVar, sh5.c cVar, Data data, Data data2, Data data3, Data data4, Data data5, Data data6, SortingType sortingType, int i, xzg.n0 n0Var, Data data7, boolean z, String str, Data data8, boolean z3, int i2) {
        sh5.c headerDisclaimer = (i2 & 1) != 0 ? lVar.f230585a : cVar;
        Data recentlyViewedCurrency = (i2 & 2) != 0 ? lVar.f230586b : data;
        Data watchlistItems = (i2 & 4) != 0 ? lVar.f230587c : data2;
        Data topMoversAssets = (i2 & 8) != 0 ? lVar.d : data3;
        Data trendingItems = (i2 & 16) != 0 ? lVar.e : data4;
        Data cryptoListItems = (i2 & 32) != 0 ? lVar.f : data5;
        Data searchResults = (i2 & 64) != 0 ? lVar.f230588g : data6;
        SortingType sortingType2 = (i2 & 128) != 0 ? lVar.f230589h : sortingType;
        int i3 = (i2 & 256) != 0 ? lVar.i : i;
        xzg.n0 selectedTopMoversFilter = (i2 & 512) != 0 ? lVar.f230590j : n0Var;
        Data data9 = (i2 & 1024) != 0 ? lVar.k : data7;
        boolean z4 = (i2 & 2048) != 0 ? lVar.f230591l : z;
        String searchQuery = (i2 & 4096) != 0 ? lVar.f230592m : str;
        Data collectionsData = (i2 & 8192) != 0 ? lVar.f230593n : data8;
        boolean z6 = (i2 & 16384) != 0 ? lVar.o : z3;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(headerDisclaimer, "headerDisclaimer");
        Intrinsics.checkNotNullParameter(recentlyViewedCurrency, "recentlyViewedCurrency");
        Intrinsics.checkNotNullParameter(watchlistItems, "watchlistItems");
        Intrinsics.checkNotNullParameter(topMoversAssets, "topMoversAssets");
        Intrinsics.checkNotNullParameter(trendingItems, "trendingItems");
        Intrinsics.checkNotNullParameter(cryptoListItems, "cryptoListItems");
        Intrinsics.checkNotNullParameter(searchResults, "searchResults");
        Intrinsics.checkNotNullParameter(sortingType2, "sortingType");
        Intrinsics.checkNotNullParameter(selectedTopMoversFilter, "selectedTopMoversFilter");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(collectionsData, "collectionsData");
        return new l(headerDisclaimer, recentlyViewedCurrency, watchlistItems, topMoversAssets, trendingItems, cryptoListItems, searchResults, sortingType2, i3, selectedTopMoversFilter, data9, z4, searchQuery, collectionsData, z6);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f230585a, lVar.f230585a) && Intrinsics.f(this.f230586b, lVar.f230586b) && Intrinsics.f(this.f230587c, lVar.f230587c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e) && Intrinsics.f(this.f, lVar.f) && Intrinsics.f(this.f230588g, lVar.f230588g) && Intrinsics.f(this.f230589h, lVar.f230589h) && this.i == lVar.i && this.f230590j == lVar.f230590j && Intrinsics.f(this.k, lVar.k) && this.f230591l == lVar.f230591l && Intrinsics.f(this.f230592m, lVar.f230592m) && Intrinsics.f(this.f230593n, lVar.f230593n) && this.o == lVar.o;
    }

    public final int hashCode() {
        int iHashCode = (this.f230590j.hashCode() + j6.a.b(this.i, (this.f230589h.hashCode() + kii.e.c(this.f230588g, kii.e.c(this.f, kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f230587c, kii.e.c(this.f230586b, this.f230585a.hashCode() * 31, 31), 31), 31), 31), 31), 31)) * 31, 31)) * 31;
        Data data = this.k;
        return Boolean.hashCode(this.o) + kii.e.c(this.f230593n, p.a.c(j6.a.c((iHashCode + (data == null ? 0 : data.hashCode())) * 31, 31, this.f230591l), 31, this.f230592m), 31);
    }

    public l(sh5.c headerDisclaimer, Data recentlyViewedCurrency, Data watchlistItems, Data topMoversAssets, Data trendingItems, Data cryptoListItems, Data searchResults, SortingType sortingType, int i, xzg.n0 selectedTopMoversFilter, Data data, boolean z, String searchQuery, Data collectionsData, boolean z3) {
        Intrinsics.checkNotNullParameter(headerDisclaimer, "headerDisclaimer");
        Intrinsics.checkNotNullParameter(recentlyViewedCurrency, "recentlyViewedCurrency");
        Intrinsics.checkNotNullParameter(watchlistItems, "watchlistItems");
        Intrinsics.checkNotNullParameter(topMoversAssets, "topMoversAssets");
        Intrinsics.checkNotNullParameter(trendingItems, "trendingItems");
        Intrinsics.checkNotNullParameter(cryptoListItems, "cryptoListItems");
        Intrinsics.checkNotNullParameter(searchResults, "searchResults");
        Intrinsics.checkNotNullParameter(sortingType, "sortingType");
        Intrinsics.checkNotNullParameter(selectedTopMoversFilter, "selectedTopMoversFilter");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(collectionsData, "collectionsData");
        this.f230585a = headerDisclaimer;
        this.f230586b = recentlyViewedCurrency;
        this.f230587c = watchlistItems;
        this.d = topMoversAssets;
        this.e = trendingItems;
        this.f = cryptoListItems;
        this.f230588g = searchResults;
        this.f230589h = sortingType;
        this.i = i;
        this.f230590j = selectedTopMoversFilter;
        this.k = data;
        this.f230591l = z;
        this.f230592m = searchQuery;
        this.f230593n = collectionsData;
        this.o = z3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i, int i2) {
        this(sh5.b.a(), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new SortingType.MarketCap(0), (i2 & 256) != 0 ? 3 : i, xzg.n0.GAINERS, null, false, "", new Data(null, null, true, 3, null), true);
        sh5.c.Companion.getClass();
    }
}
