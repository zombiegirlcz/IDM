package mwk;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes12.dex */
public final class i implements cli.j, fsl.n, q2h.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nel.n f209498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qdf.c f209499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e3h.c f209500c;
    public final atk.d d;
    public final ctk.l e;
    public final osk.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f209501g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final zsk.a f209502h;
    public final h3h.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Data f209503j;
    public final Data k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ftk.m f209504l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f209505m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final jtk.i f209506n;
    public final Data o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f209507p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f209508q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f209509r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final tsk.d f209510s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final xsk.c f209511t;
    public final Data u;
    public final Data v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Data f209512w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final List f209513x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final List f209514y;

    public i(nel.n nVar, qdf.c cVar, e3h.c historicalChartDomainState, atk.d investmentNoticeWidgetDomainState, ctk.l similarToWidgetState, osk.c analystsWidgetState, Data wealthDisclaimersDomainState, zsk.a importantInformationDomainState, h3h.d investmentsWidgetDomainState, Data data, Data data2, ftk.m mVar, List list, jtk.i iVar, Data keyStatsState, List instrumentBioItems, List alertsWidgetItems, List corporateEventsItems, tsk.d dVar, xsk.c financialPerformanceWidgetState, Data data3, Data data4, Data data5, List list2, List list3) {
        Intrinsics.checkNotNullParameter(historicalChartDomainState, "historicalChartDomainState");
        Intrinsics.checkNotNullParameter(investmentNoticeWidgetDomainState, "investmentNoticeWidgetDomainState");
        Intrinsics.checkNotNullParameter(similarToWidgetState, "similarToWidgetState");
        Intrinsics.checkNotNullParameter(analystsWidgetState, "analystsWidgetState");
        Intrinsics.checkNotNullParameter(wealthDisclaimersDomainState, "wealthDisclaimersDomainState");
        Intrinsics.checkNotNullParameter(importantInformationDomainState, "importantInformationDomainState");
        Intrinsics.checkNotNullParameter(investmentsWidgetDomainState, "investmentsWidgetDomainState");
        Intrinsics.checkNotNullParameter(keyStatsState, "keyStatsState");
        Intrinsics.checkNotNullParameter(instrumentBioItems, "instrumentBioItems");
        Intrinsics.checkNotNullParameter(alertsWidgetItems, "alertsWidgetItems");
        Intrinsics.checkNotNullParameter(corporateEventsItems, "corporateEventsItems");
        Intrinsics.checkNotNullParameter(financialPerformanceWidgetState, "financialPerformanceWidgetState");
        this.f209498a = nVar;
        this.f209499b = cVar;
        this.f209500c = historicalChartDomainState;
        this.d = investmentNoticeWidgetDomainState;
        this.e = similarToWidgetState;
        this.f = analystsWidgetState;
        this.f209501g = wealthDisclaimersDomainState;
        this.f209502h = importantInformationDomainState;
        this.i = investmentsWidgetDomainState;
        this.f209503j = data;
        this.k = data2;
        this.f209504l = mVar;
        this.f209505m = list;
        this.f209506n = iVar;
        this.o = keyStatsState;
        this.f209507p = instrumentBioItems;
        this.f209508q = alertsWidgetItems;
        this.f209509r = corporateEventsItems;
        this.f209510s = dVar;
        this.f209511t = financialPerformanceWidgetState;
        this.u = data3;
        this.v = data4;
        this.f209512w = data5;
        this.f209513x = list2;
        this.f209514y = list3;
    }

    public static i f(i iVar, nel.n nVar, qdf.c cVar, e3h.c cVar2, atk.d dVar, ctk.l lVar, osk.c cVar3, Data data, zsk.a aVar, h3h.d dVar2, Data data2, Data data3, ftk.m mVar, List list, jtk.i iVar2, Data data4, List list2, List list3, List list4, tsk.d dVar3, xsk.c cVar4, Data data5, Data data6, Data data7, List list5, List list6, int i) {
        nel.n nVar2 = (i & 1) != 0 ? iVar.f209498a : nVar;
        qdf.c cVar5 = (i & 2) != 0 ? iVar.f209499b : cVar;
        e3h.c historicalChartDomainState = (i & 4) != 0 ? iVar.f209500c : cVar2;
        atk.d investmentNoticeWidgetDomainState = (i & 8) != 0 ? iVar.d : dVar;
        ctk.l similarToWidgetState = (i & 16) != 0 ? iVar.e : lVar;
        osk.c analystsWidgetState = (i & 32) != 0 ? iVar.f : cVar3;
        Data wealthDisclaimersDomainState = (i & 64) != 0 ? iVar.f209501g : data;
        zsk.a importantInformationDomainState = (i & 128) != 0 ? iVar.f209502h : aVar;
        h3h.d investmentsWidgetDomainState = (i & 256) != 0 ? iVar.i : dVar2;
        Data data8 = (i & 512) != 0 ? iVar.f209503j : data2;
        Data data9 = (i & 1024) != 0 ? iVar.k : data3;
        ftk.m mVar2 = (i & 2048) != 0 ? iVar.f209504l : mVar;
        List list7 = (i & 4096) != 0 ? iVar.f209505m : list;
        jtk.i iVar3 = (i & 8192) != 0 ? iVar.f209506n : iVar2;
        nel.n nVar3 = nVar2;
        Data keyStatsState = (i & 16384) != 0 ? iVar.o : data4;
        List instrumentBioItems = (i & 32768) != 0 ? iVar.f209507p : list2;
        qdf.c cVar6 = cVar5;
        List alertsWidgetItems = (i & 65536) != 0 ? iVar.f209508q : list3;
        Data data10 = data8;
        List corporateEventsItems = (i & 131072) != 0 ? iVar.f209509r : list4;
        Data data11 = data9;
        tsk.d dVar4 = (i & 262144) != 0 ? iVar.f209510s : dVar3;
        xsk.c financialPerformanceWidgetState = (i & 524288) != 0 ? iVar.f209511t : cVar4;
        ftk.m mVar3 = mVar2;
        Data data12 = (i & PKIFailureInfo.badCertTemplate) != 0 ? iVar.u : data5;
        Data data13 = (i & PKIFailureInfo.badSenderNonce) != 0 ? iVar.v : data6;
        Data data14 = (i & 4194304) != 0 ? iVar.f209512w : data7;
        List list8 = (i & 8388608) != 0 ? iVar.f209513x : list5;
        List list9 = (i & 16777216) != 0 ? iVar.f209514y : list6;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(historicalChartDomainState, "historicalChartDomainState");
        Intrinsics.checkNotNullParameter(investmentNoticeWidgetDomainState, "investmentNoticeWidgetDomainState");
        Intrinsics.checkNotNullParameter(similarToWidgetState, "similarToWidgetState");
        Intrinsics.checkNotNullParameter(analystsWidgetState, "analystsWidgetState");
        Intrinsics.checkNotNullParameter(wealthDisclaimersDomainState, "wealthDisclaimersDomainState");
        Intrinsics.checkNotNullParameter(importantInformationDomainState, "importantInformationDomainState");
        Intrinsics.checkNotNullParameter(investmentsWidgetDomainState, "investmentsWidgetDomainState");
        Intrinsics.checkNotNullParameter(keyStatsState, "keyStatsState");
        Intrinsics.checkNotNullParameter(instrumentBioItems, "instrumentBioItems");
        Intrinsics.checkNotNullParameter(alertsWidgetItems, "alertsWidgetItems");
        Intrinsics.checkNotNullParameter(corporateEventsItems, "corporateEventsItems");
        Intrinsics.checkNotNullParameter(financialPerformanceWidgetState, "financialPerformanceWidgetState");
        return new i(nVar3, cVar6, historicalChartDomainState, investmentNoticeWidgetDomainState, similarToWidgetState, analystsWidgetState, wealthDisclaimersDomainState, importantInformationDomainState, investmentsWidgetDomainState, data10, data11, mVar3, list7, iVar3, keyStatsState, instrumentBioItems, alertsWidgetItems, corporateEventsItems, dVar4, financialPerformanceWidgetState, data12, data13, data14, list8, list9);
    }

    @Override // fsl.n
    public final Data J0() {
        return this.k;
    }

    @Override // fsl.n
    public final Data a() {
        return this.f209503j;
    }

    @Override // q2h.i
    public final Data c() {
        return this.u;
    }

    @Override // q2h.i
    public final Data e() {
        return this.v;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f209498a, iVar.f209498a) && Intrinsics.f(this.f209499b, iVar.f209499b) && Intrinsics.f(this.f209500c, iVar.f209500c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f) && Intrinsics.f(this.f209501g, iVar.f209501g) && Intrinsics.f(this.f209502h, iVar.f209502h) && Intrinsics.f(this.i, iVar.i) && Intrinsics.f(this.f209503j, iVar.f209503j) && Intrinsics.f(this.k, iVar.k) && Intrinsics.f(this.f209504l, iVar.f209504l) && Intrinsics.f(this.f209505m, iVar.f209505m) && Intrinsics.f(this.f209506n, iVar.f209506n) && Intrinsics.f(this.o, iVar.o) && Intrinsics.f(this.f209507p, iVar.f209507p) && Intrinsics.f(this.f209508q, iVar.f209508q) && Intrinsics.f(this.f209509r, iVar.f209509r) && Intrinsics.f(this.f209510s, iVar.f209510s) && Intrinsics.f(this.f209511t, iVar.f209511t) && Intrinsics.f(this.u, iVar.u) && Intrinsics.f(this.v, iVar.v) && Intrinsics.f(this.f209512w, iVar.f209512w) && Intrinsics.f(this.f209513x, iVar.f209513x) && Intrinsics.f(this.f209514y, iVar.f209514y);
    }

    public final int hashCode() {
        nel.n nVar = this.f209498a;
        int iHashCode = (nVar == null ? 0 : nVar.hashCode()) * 31;
        qdf.c cVar = this.f209499b;
        int iHashCode2 = (this.i.hashCode() + kii.e.c(this.f209502h.f324943a, kii.e.c(this.f209501g, (this.f.hashCode() + ((this.e.hashCode() + kii.e.c(this.d.f9085a, (this.f209500c.hashCode() + ((iHashCode + (cVar == null ? 0 : cVar.f244952a.hashCode())) * 31)) * 31, 31)) * 31)) * 31, 31), 31)) * 31;
        Data data = this.f209503j;
        int iHashCode3 = (iHashCode2 + (data == null ? 0 : data.hashCode())) * 31;
        Data data2 = this.k;
        int iHashCode4 = (iHashCode3 + (data2 == null ? 0 : data2.hashCode())) * 31;
        ftk.m mVar = this.f209504l;
        int iHashCode5 = (iHashCode4 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        List list = this.f209505m;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        jtk.i iVar = this.f209506n;
        int iD = p.a.d(p.a.d(p.a.d(kii.e.c(this.o, (iHashCode6 + (iVar == null ? 0 : iVar.hashCode())) * 31, 31), 31, this.f209507p), 31, this.f209508q), 31, this.f209509r);
        tsk.d dVar = this.f209510s;
        int iHashCode7 = (this.f209511t.hashCode() + ((iD + (dVar == null ? 0 : dVar.hashCode())) * 31)) * 31;
        Data data3 = this.u;
        int iHashCode8 = (iHashCode7 + (data3 == null ? 0 : data3.hashCode())) * 31;
        Data data4 = this.v;
        int iHashCode9 = (iHashCode8 + (data4 == null ? 0 : data4.hashCode())) * 31;
        Data data5 = this.f209512w;
        int iHashCode10 = (iHashCode9 + (data5 == null ? 0 : data5.hashCode())) * 31;
        List list2 = this.f209513x;
        int iHashCode11 = (iHashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f209514y;
        return iHashCode11 + (list3 != null ? list3.hashCode() : 0);
    }
}
