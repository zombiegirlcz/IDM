package qeg;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f245149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zfi.a f245150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f245151c;

    public e() {
        this(0);
    }

    public static e a(e eVar, Data filter, zfi.a appliedFilters, String searchQuery, int i) {
        if ((i & 1) != 0) {
            filter = eVar.f245149a;
        }
        if ((i & 2) != 0) {
            appliedFilters = eVar.f245150b;
        }
        if ((i & 4) != 0) {
            searchQuery = eVar.f245151c;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(appliedFilters, "appliedFilters");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        return new e(filter, appliedFilters, searchQuery);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f245149a, eVar.f245149a) && Intrinsics.f(this.f245150b, eVar.f245150b) && Intrinsics.f(this.f245151c, eVar.f245151c);
    }

    public final int hashCode() {
        return this.f245151c.hashCode() + ((this.f245150b.hashCode() + (this.f245149a.hashCode() * 31)) * 31);
    }

    public e(Data filter, zfi.a appliedFilters, String searchQuery) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(appliedFilters, "appliedFilters");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this.f245149a = filter;
        this.f245150b = appliedFilters;
        this.f245151c = searchQuery;
    }

    public /* synthetic */ e(int i) {
        Data data = new Data(null, null, true, 3, null);
        zfi.a aVar = new zfi.a(0);
        m70.a.c(t0.f186434a);
        this(data, aVar, "");
    }
}
