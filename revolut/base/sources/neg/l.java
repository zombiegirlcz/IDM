package neg;

import com.revolut.data.model.Data;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.r0;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f214514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f214515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zfi.a f214516c;
    public final zfi.a d;
    public final zfi.a e;
    public final Map f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f214517g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f214518h;
    public final Data i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f214519j;
    public final Map k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f214520l;

    public l() {
        this(0);
    }

    public static l a(l lVar, Data data, Data data2, zfi.a aVar, zfi.a aVar2, zfi.a aVar3, Map map, String str, String str2, Data data3, boolean z, Map map2, long j2, int i) {
        Data filters = (i & 1) != 0 ? lVar.f214514a : data;
        Data recentFilters = (i & 2) != 0 ? lVar.f214515b : data2;
        zfi.a currentlyAppliedFilters = (i & 4) != 0 ? lVar.f214516c : aVar;
        zfi.a appliedFiltersUISection = (i & 8) != 0 ? lVar.d : aVar2;
        zfi.a modifiedScreenLevelFilters = (i & 16) != 0 ? lVar.e : aVar3;
        Map visibleOptions = (i & 32) != 0 ? lVar.f : map;
        String smartFilterText = (i & 64) != 0 ? lVar.f214517g : str;
        String smartSearchPrompt = (i & 128) != 0 ? lVar.f214518h : str2;
        Data smartAppliedFilters = (i & 256) != 0 ? lVar.i : data3;
        boolean z3 = (i & 512) != 0 ? lVar.f214519j : z;
        Map manualFilterTimestamps = (i & 1024) != 0 ? lVar.k : map2;
        long j3 = (i & 2048) != 0 ? lVar.f214520l : j2;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(filters, "filters");
        Intrinsics.checkNotNullParameter(recentFilters, "recentFilters");
        Intrinsics.checkNotNullParameter(currentlyAppliedFilters, "currentlyAppliedFilters");
        Intrinsics.checkNotNullParameter(appliedFiltersUISection, "appliedFiltersUISection");
        Intrinsics.checkNotNullParameter(modifiedScreenLevelFilters, "modifiedScreenLevelFilters");
        Intrinsics.checkNotNullParameter(visibleOptions, "visibleOptions");
        Intrinsics.checkNotNullParameter(smartFilterText, "smartFilterText");
        Intrinsics.checkNotNullParameter(smartSearchPrompt, "smartSearchPrompt");
        Intrinsics.checkNotNullParameter(smartAppliedFilters, "smartAppliedFilters");
        Intrinsics.checkNotNullParameter(manualFilterTimestamps, "manualFilterTimestamps");
        return new l(filters, recentFilters, currentlyAppliedFilters, appliedFiltersUISection, modifiedScreenLevelFilters, visibleOptions, smartFilterText, smartSearchPrompt, smartAppliedFilters, z3, manualFilterTimestamps, j3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f214514a, lVar.f214514a) && Intrinsics.f(this.f214515b, lVar.f214515b) && Intrinsics.f(this.f214516c, lVar.f214516c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e) && Intrinsics.f(this.f, lVar.f) && Intrinsics.f(this.f214517g, lVar.f214517g) && Intrinsics.f(this.f214518h, lVar.f214518h) && Intrinsics.f(this.i, lVar.i) && this.f214519j == lVar.f214519j && Intrinsics.f(this.k, lVar.k) && this.f214520l == lVar.f214520l;
    }

    public final int hashCode() {
        return Long.hashCode(this.f214520l) + p.a.e(j6.a.c(kii.e.c(this.i, p.a.c(p.a.c(p.a.e((this.e.hashCode() + ((this.d.hashCode() + ((this.f214516c.hashCode() + kii.e.c(this.f214515b, this.f214514a.hashCode() * 31, 31)) * 31)) * 31)) * 31, 31, this.f), 31, this.f214517g), 31, this.f214518h), 31), 31, this.f214519j), 31, this.k);
    }

    public l(Data filters, Data recentFilters, zfi.a currentlyAppliedFilters, zfi.a appliedFiltersUISection, zfi.a modifiedScreenLevelFilters, Map visibleOptions, String smartFilterText, String smartSearchPrompt, Data smartAppliedFilters, boolean z, Map manualFilterTimestamps, long j2) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        Intrinsics.checkNotNullParameter(recentFilters, "recentFilters");
        Intrinsics.checkNotNullParameter(currentlyAppliedFilters, "currentlyAppliedFilters");
        Intrinsics.checkNotNullParameter(appliedFiltersUISection, "appliedFiltersUISection");
        Intrinsics.checkNotNullParameter(modifiedScreenLevelFilters, "modifiedScreenLevelFilters");
        Intrinsics.checkNotNullParameter(visibleOptions, "visibleOptions");
        Intrinsics.checkNotNullParameter(smartFilterText, "smartFilterText");
        Intrinsics.checkNotNullParameter(smartSearchPrompt, "smartSearchPrompt");
        Intrinsics.checkNotNullParameter(smartAppliedFilters, "smartAppliedFilters");
        Intrinsics.checkNotNullParameter(manualFilterTimestamps, "manualFilterTimestamps");
        this.f214514a = filters;
        this.f214515b = recentFilters;
        this.f214516c = currentlyAppliedFilters;
        this.d = appliedFiltersUISection;
        this.e = modifiedScreenLevelFilters;
        this.f = visibleOptions;
        this.f214517g = smartFilterText;
        this.f214518h = smartSearchPrompt;
        this.i = smartAppliedFilters;
        this.f214519j = z;
        this.k = manualFilterTimestamps;
        this.f214520l = j2;
    }

    public /* synthetic */ l(int i) {
        Data data = new Data(null, null, true, 3, null);
        Data data2 = new Data(null, null, true, 3, null);
        zfi.a aVar = new zfi.a(0);
        zfi.a aVar2 = new zfi.a(0);
        zfi.a aVar3 = new zfi.a(0);
        Map mapG = r0.g();
        t0 t0Var = t0.f186434a;
        m70.a.c(t0Var);
        m70.a.c(t0Var);
        od0.i.Companion.getClass();
        this(data, data2, aVar, aVar2, aVar3, mapG, "", "", new Data(od0.i.f224256b, null, false, 6, null), false, r0.g(), 0L);
    }
}
