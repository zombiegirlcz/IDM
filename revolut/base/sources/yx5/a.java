package yx5;

import com.revolut.data.model.Data;
import com.revolut.feature.cryptocommodity_invest.models.SortingType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f317557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f317558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SortingType f317559c;
    public final boolean d;
    public final String e;

    public a() {
        this(0);
    }

    public static a a(a aVar, Data data, Data data2, SortingType sortingType, boolean z, String str, int i) {
        if ((i & 1) != 0) {
            data = aVar.f317557a;
        }
        Data cryptoListItems = data;
        if ((i & 2) != 0) {
            data2 = aVar.f317558b;
        }
        Data searchResults = data2;
        if ((i & 4) != 0) {
            sortingType = aVar.f317559c;
        }
        SortingType sortingType2 = sortingType;
        if ((i & 8) != 0) {
            z = aVar.d;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            str = aVar.e;
        }
        String searchQuery = str;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(cryptoListItems, "cryptoListItems");
        Intrinsics.checkNotNullParameter(searchResults, "searchResults");
        Intrinsics.checkNotNullParameter(sortingType2, "sortingType");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        return new a(cryptoListItems, searchResults, sortingType2, z3, searchQuery);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f317557a, aVar.f317557a) && Intrinsics.f(this.f317558b, aVar.f317558b) && Intrinsics.f(this.f317559c, aVar.f317559c) && this.d == aVar.d && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.c((this.f317559c.hashCode() + kii.e.c(this.f317558b, this.f317557a.hashCode() * 31, 31)) * 31, 31, this.d);
    }

    public a(Data cryptoListItems, Data searchResults, SortingType sortingType, boolean z, String searchQuery) {
        Intrinsics.checkNotNullParameter(cryptoListItems, "cryptoListItems");
        Intrinsics.checkNotNullParameter(searchResults, "searchResults");
        Intrinsics.checkNotNullParameter(sortingType, "sortingType");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this.f317557a = cryptoListItems;
        this.f317558b = searchResults;
        this.f317559c = sortingType;
        this.d = z;
        this.e = searchQuery;
    }

    public /* synthetic */ a(int i) {
        this(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new SortingType.MarketCap(0), false, "");
    }
}
