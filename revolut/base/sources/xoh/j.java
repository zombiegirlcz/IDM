package xoh;

import com.revolut.feature.wealth_discovery.impl.screener.flows.all_filters.ScreenerAllFiltersFlowContract$Page;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements oki.a {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f307837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScreenerAllFiltersFlowContract$Page f307838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f307839c;
    public final Map d;
    public final boolean e;
    public final boolean f;

    public j(List pagerItems, ScreenerAllFiltersFlowContract$Page selectedPage, Map instrumentCount, Map selectedFilters, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        Intrinsics.checkNotNullParameter(selectedPage, "selectedPage");
        Intrinsics.checkNotNullParameter(instrumentCount, "instrumentCount");
        Intrinsics.checkNotNullParameter(selectedFilters, "selectedFilters");
        this.f307837a = pagerItems;
        this.f307838b = selectedPage;
        this.f307839c = instrumentCount;
        this.d = selectedFilters;
        this.e = z;
        this.f = z3;
    }

    public static j a(j jVar, List list, ScreenerAllFiltersFlowContract$Page screenerAllFiltersFlowContract$Page, Map map, Map map2, boolean z, boolean z3, int i) {
        if ((i & 1) != 0) {
            list = jVar.f307837a;
        }
        List pagerItems = list;
        if ((i & 2) != 0) {
            screenerAllFiltersFlowContract$Page = jVar.f307838b;
        }
        ScreenerAllFiltersFlowContract$Page selectedPage = screenerAllFiltersFlowContract$Page;
        if ((i & 4) != 0) {
            map = jVar.f307839c;
        }
        Map instrumentCount = map;
        if ((i & 8) != 0) {
            map2 = jVar.d;
        }
        Map selectedFilters = map2;
        if ((i & 16) != 0) {
            z = jVar.e;
        }
        boolean z4 = z;
        if ((i & 32) != 0) {
            z3 = jVar.f;
        }
        jVar.getClass();
        jVar.getClass();
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        Intrinsics.checkNotNullParameter(selectedPage, "selectedPage");
        Intrinsics.checkNotNullParameter(instrumentCount, "instrumentCount");
        Intrinsics.checkNotNullParameter(selectedFilters, "selectedFilters");
        return new j(pagerItems, selectedPage, instrumentCount, selectedFilters, z4, z3);
    }

    @Override // oki.a
    public final List W() {
        return this.f307837a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f307837a, jVar.f307837a) && this.f307838b == jVar.f307838b && Intrinsics.f(this.f307839c, jVar.f307839c) && Intrinsics.f(this.d, jVar.d) && this.e == jVar.e && this.f == jVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + j6.a.c(j6.a.c(p.a.e(p.a.e((this.f307838b.hashCode() + (this.f307837a.hashCode() * 31)) * 31, 31, this.f307839c), 31, this.d), 31, this.e), 31, this.f);
    }

    @Override // oki.a
    public final String z() {
        return this.f307838b.getF70838b();
    }
}
