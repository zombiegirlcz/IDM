package lig;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f195508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f195509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lk0.g f195510c;
    public final Data d;

    public g() {
        this(0);
    }

    public static g a(g gVar, String query, Data searchSuggestions, lk0.g gVar2, Data recentSearchData, int i) {
        if ((i & 1) != 0) {
            query = gVar.f195508a;
        }
        if ((i & 2) != 0) {
            searchSuggestions = gVar.f195509b;
        }
        if ((i & 4) != 0) {
            gVar2 = gVar.f195510c;
        }
        if ((i & 8) != 0) {
            recentSearchData = gVar.d;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(searchSuggestions, "searchSuggestions");
        Intrinsics.checkNotNullParameter(recentSearchData, "recentSearchData");
        return new g(query, searchSuggestions, gVar2, recentSearchData);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f195508a, gVar.f195508a) && Intrinsics.f(this.f195509b, gVar.f195509b) && Intrinsics.f(this.f195510c, gVar.f195510c) && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f195509b, this.f195508a.hashCode() * 31, 31);
        lk0.g gVar = this.f195510c;
        return this.d.hashCode() + ((iC + (gVar == null ? 0 : gVar.f196174a.hashCode())) * 31);
    }

    public g(String query, Data searchSuggestions, lk0.g gVar, Data recentSearchData) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(searchSuggestions, "searchSuggestions");
        Intrinsics.checkNotNullParameter(recentSearchData, "recentSearchData");
        this.f195508a = query;
        this.f195509b = searchSuggestions;
        this.f195510c = gVar;
        this.d = recentSearchData;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i) {
        this("", new Data(null, null, true, 3, null), null, new Data(null, null, true, 3, null));
        m70.a.c(t0.f186434a);
    }
}
