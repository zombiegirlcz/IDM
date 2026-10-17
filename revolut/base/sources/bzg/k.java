package bzg;

import aw0.e5;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import com.revolut.retail.feature.crypto.disclaimer.api.DisclaimerParams;
import com.revolut.shared.feature.wealth.models.config.Links;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WidgetisedAnalyticsType f19990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vyg.f f19991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f19992c;
    public final vyg.c d;
    public final hel.b e;
    public final vyg.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f19993g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DisclaimerParams f19994h;
    public final Data i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final fzg.e f19995j;
    public final Pair k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f19996l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Data f19997m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f19998n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final fzg.f f19999p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Data f20000q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Data f20001r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Data f20002s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e5 f20003t;
    public final Links u;

    public k(WidgetisedAnalyticsType analyticsType, vyg.f selectedPnLType, Data pnLValuesData, vyg.c selectedTimeframe, hel.b bVar, vyg.d selectedChartType, boolean z, DisclaimerParams disclaimerParams, Data pnLChartData, fzg.e eVar, Pair pair, boolean z3, Data data, List pnlContributorTypes, boolean z4, fzg.f fVar, Data realisedPnLItems, Data contributorsData, Data visibleContributorsData, e5 e5Var, Links links) {
        Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
        Intrinsics.checkNotNullParameter(selectedPnLType, "selectedPnLType");
        Intrinsics.checkNotNullParameter(pnLValuesData, "pnLValuesData");
        Intrinsics.checkNotNullParameter(selectedTimeframe, "selectedTimeframe");
        Intrinsics.checkNotNullParameter(selectedChartType, "selectedChartType");
        Intrinsics.checkNotNullParameter(pnLChartData, "pnLChartData");
        Intrinsics.checkNotNullParameter(pnlContributorTypes, "pnlContributorTypes");
        Intrinsics.checkNotNullParameter(realisedPnLItems, "realisedPnLItems");
        Intrinsics.checkNotNullParameter(contributorsData, "contributorsData");
        Intrinsics.checkNotNullParameter(visibleContributorsData, "visibleContributorsData");
        this.f19990a = analyticsType;
        this.f19991b = selectedPnLType;
        this.f19992c = pnLValuesData;
        this.d = selectedTimeframe;
        this.e = bVar;
        this.f = selectedChartType;
        this.f19993g = z;
        this.f19994h = disclaimerParams;
        this.i = pnLChartData;
        this.f19995j = eVar;
        this.k = pair;
        this.f19996l = z3;
        this.f19997m = data;
        this.f19998n = pnlContributorTypes;
        this.o = z4;
        this.f19999p = fVar;
        this.f20000q = realisedPnLItems;
        this.f20001r = contributorsData;
        this.f20002s = visibleContributorsData;
        this.f20003t = e5Var;
        this.u = links;
    }

    public static k a(k kVar, vyg.f fVar, Data data, vyg.c cVar, vyg.d dVar, DisclaimerParams disclaimerParams, Data data2, fzg.e eVar, Pair pair, boolean z, Data data3, List list, boolean z3, fzg.f fVar2, Data data4, Data data5, Data data6, e5 e5Var, int i) {
        boolean z4;
        Data visibleContributorsData;
        WidgetisedAnalyticsType analyticsType = kVar.f19990a;
        vyg.f selectedPnLType = (i & 2) != 0 ? kVar.f19991b : fVar;
        Data pnLValuesData = (i & 4) != 0 ? kVar.f19992c : data;
        vyg.c selectedTimeframe = (i & 8) != 0 ? kVar.d : cVar;
        hel.b bVar = kVar.e;
        vyg.d selectedChartType = (i & 32) != 0 ? kVar.f : dVar;
        boolean z6 = kVar.f19993g;
        DisclaimerParams disclaimerParams2 = (i & 128) != 0 ? kVar.f19994h : disclaimerParams;
        Data pnLChartData = (i & 256) != 0 ? kVar.i : data2;
        fzg.e eVar2 = (i & 512) != 0 ? kVar.f19995j : eVar;
        Pair pair2 = (i & 1024) != 0 ? kVar.k : pair;
        boolean z11 = (i & 2048) != 0 ? kVar.f19996l : z;
        Data data7 = (i & 4096) != 0 ? kVar.f19997m : data3;
        List pnlContributorTypes = (i & 8192) != 0 ? kVar.f19998n : list;
        boolean z12 = (i & 16384) != 0 ? kVar.o : z3;
        fzg.f fVar3 = (i & 32768) != 0 ? kVar.f19999p : fVar2;
        Data realisedPnLItems = (i & 65536) != 0 ? kVar.f20000q : data4;
        boolean z29 = z12;
        Data contributorsData = (i & 131072) != 0 ? kVar.f20001r : data5;
        if ((i & 262144) != 0) {
            z4 = z6;
            visibleContributorsData = kVar.f20002s;
        } else {
            z4 = z6;
            visibleContributorsData = data6;
        }
        DisclaimerParams disclaimerParams3 = disclaimerParams2;
        e5 e5Var2 = (i & 524288) != 0 ? kVar.f20003t : e5Var;
        Links links = kVar.u;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
        Intrinsics.checkNotNullParameter(selectedPnLType, "selectedPnLType");
        Intrinsics.checkNotNullParameter(pnLValuesData, "pnLValuesData");
        Intrinsics.checkNotNullParameter(selectedTimeframe, "selectedTimeframe");
        Intrinsics.checkNotNullParameter(selectedChartType, "selectedChartType");
        Intrinsics.checkNotNullParameter(pnLChartData, "pnLChartData");
        Intrinsics.checkNotNullParameter(pnlContributorTypes, "pnlContributorTypes");
        Intrinsics.checkNotNullParameter(realisedPnLItems, "realisedPnLItems");
        Intrinsics.checkNotNullParameter(contributorsData, "contributorsData");
        Intrinsics.checkNotNullParameter(visibleContributorsData, "visibleContributorsData");
        return new k(analyticsType, selectedPnLType, pnLValuesData, selectedTimeframe, bVar, selectedChartType, z4, disclaimerParams3, pnLChartData, eVar2, pair2, z11, data7, pnlContributorTypes, z29, fVar3, realisedPnLItems, contributorsData, visibleContributorsData, e5Var2, links);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f19990a, kVar.f19990a) && this.f19991b == kVar.f19991b && Intrinsics.f(this.f19992c, kVar.f19992c) && this.d == kVar.d && this.e == kVar.e && this.f == kVar.f && this.f19993g == kVar.f19993g && Intrinsics.f(this.f19994h, kVar.f19994h) && Intrinsics.f(this.i, kVar.i) && Intrinsics.f(this.f19995j, kVar.f19995j) && Intrinsics.f(this.k, kVar.k) && this.f19996l == kVar.f19996l && Intrinsics.f(this.f19997m, kVar.f19997m) && Intrinsics.f(this.f19998n, kVar.f19998n) && this.o == kVar.o && this.f19999p == kVar.f19999p && Intrinsics.f(this.f20000q, kVar.f20000q) && Intrinsics.f(this.f20001r, kVar.f20001r) && Intrinsics.f(this.f20002s, kVar.f20002s) && Intrinsics.f(this.f20003t, kVar.f20003t) && Intrinsics.f(this.u, kVar.u);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + kii.e.c(this.f19992c, (this.f19991b.hashCode() + (this.f19990a.hashCode() * 31)) * 31, 31)) * 31;
        hel.b bVar = this.e;
        int iC = j6.a.c((this.f.hashCode() + ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31, 31, this.f19993g);
        DisclaimerParams disclaimerParams = this.f19994h;
        int iC2 = kii.e.c(this.i, (iC + (disclaimerParams == null ? 0 : disclaimerParams.hashCode())) * 31, 31);
        fzg.e eVar = this.f19995j;
        int iHashCode2 = (iC2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        Pair pair = this.k;
        int iC3 = j6.a.c((iHashCode2 + (pair == null ? 0 : pair.hashCode())) * 31, 31, this.f19996l);
        Data data = this.f19997m;
        int iC4 = j6.a.c(p.a.d((iC3 + (data == null ? 0 : data.hashCode())) * 31, 31, this.f19998n), 31, this.o);
        fzg.f fVar = this.f19999p;
        int iC5 = kii.e.c(this.f20002s, kii.e.c(this.f20001r, kii.e.c(this.f20000q, (iC4 + (fVar == null ? 0 : fVar.hashCode())) * 31, 31), 31), 31);
        e5 e5Var = this.f20003t;
        int iHashCode3 = (iC5 + (e5Var == null ? 0 : e5Var.hashCode())) * 31;
        Links links = this.u;
        return iHashCode3 + (links != null ? links.hashCode() : 0);
    }
}
