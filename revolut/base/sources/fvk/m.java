package fvk;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class m implements cli.j, fsl.n, q2h.i {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e3h.c f138440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f138441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final atk.d f138442c;
    public final btk.d d;
    public final h3h.d e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f138443g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a3h.d f138444h;
    public final vsk.g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ctk.l f138445j;
    public final qdf.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f138446l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f138447m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final jtk.i f138448n;
    public final Data o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Data f138449p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Data f138450q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Data f138451r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Data f138452s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List f138453t;

    public m(e3h.c historicalChartDomainState, List list, atk.d investmentNoticeWidgetDomainState, btk.d investmentPlanDomainState, h3h.d investmentsWidgetDomainState, List list2, Data keyStatsState, a3h.d etfExposureOverviewDomainState, vsk.g etfVariantsState, ctk.l similarToWidgetState, qdf.c cVar, List instrumentBioItems, List alertsWidgetItems, jtk.i iVar, Data wealthDisclaimersDomainState, Data data, Data data2, Data data3, Data data4, List list3) {
        Intrinsics.checkNotNullParameter(historicalChartDomainState, "historicalChartDomainState");
        Intrinsics.checkNotNullParameter(investmentNoticeWidgetDomainState, "investmentNoticeWidgetDomainState");
        Intrinsics.checkNotNullParameter(investmentPlanDomainState, "investmentPlanDomainState");
        Intrinsics.checkNotNullParameter(investmentsWidgetDomainState, "investmentsWidgetDomainState");
        Intrinsics.checkNotNullParameter(keyStatsState, "keyStatsState");
        Intrinsics.checkNotNullParameter(etfExposureOverviewDomainState, "etfExposureOverviewDomainState");
        Intrinsics.checkNotNullParameter(etfVariantsState, "etfVariantsState");
        Intrinsics.checkNotNullParameter(similarToWidgetState, "similarToWidgetState");
        Intrinsics.checkNotNullParameter(instrumentBioItems, "instrumentBioItems");
        Intrinsics.checkNotNullParameter(alertsWidgetItems, "alertsWidgetItems");
        Intrinsics.checkNotNullParameter(wealthDisclaimersDomainState, "wealthDisclaimersDomainState");
        this.f138440a = historicalChartDomainState;
        this.f138441b = list;
        this.f138442c = investmentNoticeWidgetDomainState;
        this.d = investmentPlanDomainState;
        this.e = investmentsWidgetDomainState;
        this.f = list2;
        this.f138443g = keyStatsState;
        this.f138444h = etfExposureOverviewDomainState;
        this.i = etfVariantsState;
        this.f138445j = similarToWidgetState;
        this.k = cVar;
        this.f138446l = instrumentBioItems;
        this.f138447m = alertsWidgetItems;
        this.f138448n = iVar;
        this.o = wealthDisclaimersDomainState;
        this.f138449p = data;
        this.f138450q = data2;
        this.f138451r = data3;
        this.f138452s = data4;
        this.f138453t = list3;
    }

    public static m f(m mVar, e3h.c cVar, List list, atk.d dVar, btk.d dVar2, h3h.d dVar3, List list2, Data data, a3h.d dVar4, vsk.g gVar, ctk.l lVar, qdf.c cVar2, List list3, List list4, jtk.i iVar, Data data2, Data data3, Data data4, Data data5, Data data6, List list5, int i) {
        e3h.c historicalChartDomainState = (i & 1) != 0 ? mVar.f138440a : cVar;
        List list6 = (i & 2) != 0 ? mVar.f138441b : list;
        atk.d investmentNoticeWidgetDomainState = (i & 4) != 0 ? mVar.f138442c : dVar;
        btk.d investmentPlanDomainState = (i & 8) != 0 ? mVar.d : dVar2;
        h3h.d investmentsWidgetDomainState = (i & 16) != 0 ? mVar.e : dVar3;
        List list7 = (i & 32) != 0 ? mVar.f : list2;
        Data keyStatsState = (i & 64) != 0 ? mVar.f138443g : data;
        a3h.d etfExposureOverviewDomainState = (i & 128) != 0 ? mVar.f138444h : dVar4;
        vsk.g etfVariantsState = (i & 256) != 0 ? mVar.i : gVar;
        ctk.l similarToWidgetState = (i & 512) != 0 ? mVar.f138445j : lVar;
        qdf.c cVar3 = (i & 1024) != 0 ? mVar.k : cVar2;
        List instrumentBioItems = (i & 2048) != 0 ? mVar.f138446l : list3;
        List alertsWidgetItems = (i & 4096) != 0 ? mVar.f138447m : list4;
        jtk.i iVar2 = (i & 8192) != 0 ? mVar.f138448n : iVar;
        List list8 = list6;
        Data wealthDisclaimersDomainState = (i & 16384) != 0 ? mVar.o : data2;
        Data data7 = (i & 32768) != 0 ? mVar.f138449p : data3;
        Data data8 = (i & 65536) != 0 ? mVar.f138450q : data4;
        Data data9 = (i & 131072) != 0 ? mVar.f138451r : data5;
        Data data10 = (i & 262144) != 0 ? mVar.f138452s : data6;
        List list9 = (i & 524288) != 0 ? mVar.f138453t : list5;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(historicalChartDomainState, "historicalChartDomainState");
        Intrinsics.checkNotNullParameter(investmentNoticeWidgetDomainState, "investmentNoticeWidgetDomainState");
        Intrinsics.checkNotNullParameter(investmentPlanDomainState, "investmentPlanDomainState");
        Intrinsics.checkNotNullParameter(investmentsWidgetDomainState, "investmentsWidgetDomainState");
        Intrinsics.checkNotNullParameter(keyStatsState, "keyStatsState");
        Intrinsics.checkNotNullParameter(etfExposureOverviewDomainState, "etfExposureOverviewDomainState");
        Intrinsics.checkNotNullParameter(etfVariantsState, "etfVariantsState");
        Intrinsics.checkNotNullParameter(similarToWidgetState, "similarToWidgetState");
        Intrinsics.checkNotNullParameter(instrumentBioItems, "instrumentBioItems");
        Intrinsics.checkNotNullParameter(alertsWidgetItems, "alertsWidgetItems");
        Intrinsics.checkNotNullParameter(wealthDisclaimersDomainState, "wealthDisclaimersDomainState");
        return new m(historicalChartDomainState, list8, investmentNoticeWidgetDomainState, investmentPlanDomainState, investmentsWidgetDomainState, list7, keyStatsState, etfExposureOverviewDomainState, etfVariantsState, similarToWidgetState, cVar3, instrumentBioItems, alertsWidgetItems, iVar2, wealthDisclaimersDomainState, data7, data8, data9, data10, list9);
    }

    @Override // fsl.n
    public final Data J0() {
        return this.f138452s;
    }

    @Override // fsl.n
    public final Data a() {
        return this.f138451r;
    }

    @Override // q2h.i
    public final Data c() {
        return this.f138449p;
    }

    @Override // q2h.i
    public final Data e() {
        return this.f138450q;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f138440a, mVar.f138440a) && Intrinsics.f(this.f138441b, mVar.f138441b) && Intrinsics.f(this.f138442c, mVar.f138442c) && Intrinsics.f(this.d, mVar.d) && Intrinsics.f(this.e, mVar.e) && Intrinsics.f(this.f, mVar.f) && Intrinsics.f(this.f138443g, mVar.f138443g) && Intrinsics.f(this.f138444h, mVar.f138444h) && Intrinsics.f(this.i, mVar.i) && Intrinsics.f(this.f138445j, mVar.f138445j) && Intrinsics.f(this.k, mVar.k) && Intrinsics.f(this.f138446l, mVar.f138446l) && Intrinsics.f(this.f138447m, mVar.f138447m) && Intrinsics.f(this.f138448n, mVar.f138448n) && Intrinsics.f(this.o, mVar.o) && Intrinsics.f(this.f138449p, mVar.f138449p) && Intrinsics.f(this.f138450q, mVar.f138450q) && Intrinsics.f(this.f138451r, mVar.f138451r) && Intrinsics.f(this.f138452s, mVar.f138452s) && Intrinsics.f(this.f138453t, mVar.f138453t);
    }

    public final int hashCode() {
        int iHashCode = this.f138440a.hashCode() * 31;
        List list = this.f138441b;
        int iHashCode2 = (this.e.hashCode() + ((this.d.hashCode() + kii.e.c(this.f138442c.f9085a, (iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31)) * 31)) * 31;
        List list2 = this.f;
        int iHashCode3 = (this.f138445j.hashCode() + ((this.i.hashCode() + ((this.f138444h.hashCode() + kii.e.c(this.f138443g, (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31, 31)) * 31)) * 31)) * 31;
        qdf.c cVar = this.k;
        int iD = p.a.d(p.a.d((iHashCode3 + (cVar == null ? 0 : cVar.f244952a.hashCode())) * 31, 31, this.f138446l), 31, this.f138447m);
        jtk.i iVar = this.f138448n;
        int iC = kii.e.c(this.o, (iD + (iVar == null ? 0 : iVar.hashCode())) * 31, 31);
        Data data = this.f138449p;
        int iHashCode4 = (iC + (data == null ? 0 : data.hashCode())) * 31;
        Data data2 = this.f138450q;
        int iHashCode5 = (iHashCode4 + (data2 == null ? 0 : data2.hashCode())) * 31;
        Data data3 = this.f138451r;
        int iHashCode6 = (iHashCode5 + (data3 == null ? 0 : data3.hashCode())) * 31;
        Data data4 = this.f138452s;
        int iHashCode7 = (iHashCode6 + (data4 == null ? 0 : data4.hashCode())) * 31;
        List list3 = this.f138453t;
        return iHashCode7 + (list3 != null ? list3.hashCode() : 0);
    }
}
