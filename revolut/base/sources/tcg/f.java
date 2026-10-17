package tcg;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f269786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f269787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f269788c;
    public final List d;
    public final List e;
    public final Data f;

    public f() {
        this(0);
    }

    public static f a(f fVar, String str, Data data, List list, List list2, List list3, Data data2, int i) {
        if ((i & 1) != 0) {
            str = fVar.f269786a;
        }
        String query = str;
        if ((i & 2) != 0) {
            data = fVar.f269787b;
        }
        Data searchResults = data;
        if ((i & 4) != 0) {
            list = fVar.f269788c;
        }
        List recentLocations = list;
        if ((i & 8) != 0) {
            list2 = fVar.d;
        }
        List recentProperties = list2;
        if ((i & 16) != 0) {
            list3 = fVar.e;
        }
        List recentSmartSearches = list3;
        if ((i & 32) != 0) {
            data2 = fVar.f;
        }
        Data popularHotelsLocations = data2;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(searchResults, "searchResults");
        Intrinsics.checkNotNullParameter(recentLocations, "recentLocations");
        Intrinsics.checkNotNullParameter(recentProperties, "recentProperties");
        Intrinsics.checkNotNullParameter(recentSmartSearches, "recentSmartSearches");
        Intrinsics.checkNotNullParameter(popularHotelsLocations, "popularHotelsLocations");
        return new f(query, searchResults, recentLocations, recentProperties, recentSmartSearches, popularHotelsLocations);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f269786a, fVar.f269786a) && Intrinsics.f(this.f269787b, fVar.f269787b) && Intrinsics.f(this.f269788c, fVar.f269788c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.d(p.a.d(p.a.d(kii.e.c(this.f269787b, this.f269786a.hashCode() * 31, 31), 31, this.f269788c), 31, this.d), 31, this.e);
    }

    public f(String query, Data searchResults, List recentLocations, List recentProperties, List recentSmartSearches, Data popularHotelsLocations) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(searchResults, "searchResults");
        Intrinsics.checkNotNullParameter(recentLocations, "recentLocations");
        Intrinsics.checkNotNullParameter(recentProperties, "recentProperties");
        Intrinsics.checkNotNullParameter(recentSmartSearches, "recentSmartSearches");
        Intrinsics.checkNotNullParameter(popularHotelsLocations, "popularHotelsLocations");
        this.f269786a = query;
        this.f269787b = searchResults;
        this.f269788c = recentLocations;
        this.d = recentProperties;
        this.e = recentSmartSearches;
        this.f = popularHotelsLocations;
    }

    public f(int i) {
        m70.a.c(t0.f186434a);
        Data data = new Data(null, null, false, 7, null);
        f0 f0Var = f0.f322471a;
        this("", data, f0Var, f0Var, f0Var, new Data(null, null, false, 7, null));
    }
}
