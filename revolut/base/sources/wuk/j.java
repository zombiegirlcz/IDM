package wuk;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class j implements cli.j, q2h.i, fsl.n {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f300182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ksk.d f300183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n2h.f f300184c;
    public final psk.e d;
    public final rsk.c e;
    public final e3h.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f300185g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final atk.d f300186h;
    public final h3h.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f300187j;
    public final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Data f300188l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Data f300189m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k3h.d f300190n;
    public final ctk.l o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jtk.i f300191p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Data f300192q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f300193r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Data f300194s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Data f300195t;
    public final Data u;
    public final Data v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final List f300196w;

    public j(Data data, ksk.d aboutIssuerWidgetState, n2h.f actionsPanelState, psk.e attributesWidgetState, rsk.c callDateWidgetState, e3h.c historicalChartWidgetState, List list, atk.d investmentNoticeWidgetDomainState, h3h.d investmentsWidgetState, List instrumentBioItems, List list2, Data isInstrumentInWatchlist, Data keyStatsState, k3h.d ratingsWidgetState, ctk.l similarToWidgetState, jtk.i iVar, Data data2, List corporateEventsItems, Data data3, Data data4, Data data5, Data data6, List list3) {
        Intrinsics.checkNotNullParameter(aboutIssuerWidgetState, "aboutIssuerWidgetState");
        Intrinsics.checkNotNullParameter(actionsPanelState, "actionsPanelState");
        Intrinsics.checkNotNullParameter(attributesWidgetState, "attributesWidgetState");
        Intrinsics.checkNotNullParameter(callDateWidgetState, "callDateWidgetState");
        Intrinsics.checkNotNullParameter(historicalChartWidgetState, "historicalChartWidgetState");
        Intrinsics.checkNotNullParameter(investmentNoticeWidgetDomainState, "investmentNoticeWidgetDomainState");
        Intrinsics.checkNotNullParameter(investmentsWidgetState, "investmentsWidgetState");
        Intrinsics.checkNotNullParameter(instrumentBioItems, "instrumentBioItems");
        Intrinsics.checkNotNullParameter(isInstrumentInWatchlist, "isInstrumentInWatchlist");
        Intrinsics.checkNotNullParameter(keyStatsState, "keyStatsState");
        Intrinsics.checkNotNullParameter(ratingsWidgetState, "ratingsWidgetState");
        Intrinsics.checkNotNullParameter(similarToWidgetState, "similarToWidgetState");
        Intrinsics.checkNotNullParameter(corporateEventsItems, "corporateEventsItems");
        this.f300182a = data;
        this.f300183b = aboutIssuerWidgetState;
        this.f300184c = actionsPanelState;
        this.d = attributesWidgetState;
        this.e = callDateWidgetState;
        this.f = historicalChartWidgetState;
        this.f300185g = list;
        this.f300186h = investmentNoticeWidgetDomainState;
        this.i = investmentsWidgetState;
        this.f300187j = instrumentBioItems;
        this.k = list2;
        this.f300188l = isInstrumentInWatchlist;
        this.f300189m = keyStatsState;
        this.f300190n = ratingsWidgetState;
        this.o = similarToWidgetState;
        this.f300191p = iVar;
        this.f300192q = data2;
        this.f300193r = corporateEventsItems;
        this.f300194s = data3;
        this.f300195t = data4;
        this.u = data5;
        this.v = data6;
        this.f300196w = list3;
    }

    public static j f(j jVar, Data data, ksk.d dVar, n2h.f fVar, psk.e eVar, rsk.c cVar, e3h.c cVar2, List list, atk.d dVar2, h3h.d dVar3, List list2, List list3, Data data2, Data data3, k3h.d dVar4, ctk.l lVar, jtk.i iVar, Data data4, List list4, Data data5, Data data6, Data data7, Data data8, List list5, int i) {
        Data data9 = (i & 1) != 0 ? jVar.f300182a : data;
        ksk.d aboutIssuerWidgetState = (i & 2) != 0 ? jVar.f300183b : dVar;
        n2h.f actionsPanelState = (i & 4) != 0 ? jVar.f300184c : fVar;
        psk.e attributesWidgetState = (i & 8) != 0 ? jVar.d : eVar;
        rsk.c callDateWidgetState = (i & 16) != 0 ? jVar.e : cVar;
        e3h.c historicalChartWidgetState = (i & 32) != 0 ? jVar.f : cVar2;
        List list6 = (i & 64) != 0 ? jVar.f300185g : list;
        atk.d investmentNoticeWidgetDomainState = (i & 128) != 0 ? jVar.f300186h : dVar2;
        h3h.d investmentsWidgetState = (i & 256) != 0 ? jVar.i : dVar3;
        List instrumentBioItems = (i & 512) != 0 ? jVar.f300187j : list2;
        List list7 = (i & 1024) != 0 ? jVar.k : list3;
        Data isInstrumentInWatchlist = (i & 2048) != 0 ? jVar.f300188l : data2;
        Data keyStatsState = (i & 4096) != 0 ? jVar.f300189m : data3;
        k3h.d ratingsWidgetState = (i & 8192) != 0 ? jVar.f300190n : dVar4;
        Data data10 = data9;
        ctk.l similarToWidgetState = (i & 16384) != 0 ? jVar.o : lVar;
        jtk.i iVar2 = (i & 32768) != 0 ? jVar.f300191p : iVar;
        Data data11 = (i & 65536) != 0 ? jVar.f300192q : data4;
        List corporateEventsItems = (i & 131072) != 0 ? jVar.f300193r : list4;
        List list8 = list6;
        Data data12 = (i & 262144) != 0 ? jVar.f300194s : data5;
        Data data13 = (i & 524288) != 0 ? jVar.f300195t : data6;
        Data data14 = (i & PKIFailureInfo.badCertTemplate) != 0 ? jVar.u : data7;
        Data data15 = (i & PKIFailureInfo.badSenderNonce) != 0 ? jVar.v : data8;
        List list9 = (i & 4194304) != 0 ? jVar.f300196w : list5;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(aboutIssuerWidgetState, "aboutIssuerWidgetState");
        Intrinsics.checkNotNullParameter(actionsPanelState, "actionsPanelState");
        Intrinsics.checkNotNullParameter(attributesWidgetState, "attributesWidgetState");
        Intrinsics.checkNotNullParameter(callDateWidgetState, "callDateWidgetState");
        Intrinsics.checkNotNullParameter(historicalChartWidgetState, "historicalChartWidgetState");
        Intrinsics.checkNotNullParameter(investmentNoticeWidgetDomainState, "investmentNoticeWidgetDomainState");
        Intrinsics.checkNotNullParameter(investmentsWidgetState, "investmentsWidgetState");
        Intrinsics.checkNotNullParameter(instrumentBioItems, "instrumentBioItems");
        Intrinsics.checkNotNullParameter(isInstrumentInWatchlist, "isInstrumentInWatchlist");
        Intrinsics.checkNotNullParameter(keyStatsState, "keyStatsState");
        Intrinsics.checkNotNullParameter(ratingsWidgetState, "ratingsWidgetState");
        Intrinsics.checkNotNullParameter(similarToWidgetState, "similarToWidgetState");
        Intrinsics.checkNotNullParameter(corporateEventsItems, "corporateEventsItems");
        return new j(data10, aboutIssuerWidgetState, actionsPanelState, attributesWidgetState, callDateWidgetState, historicalChartWidgetState, list8, investmentNoticeWidgetDomainState, investmentsWidgetState, instrumentBioItems, list7, isInstrumentInWatchlist, keyStatsState, ratingsWidgetState, similarToWidgetState, iVar2, data11, corporateEventsItems, data12, data13, data14, data15, list9);
    }

    @Override // fsl.n
    public final Data J0() {
        return this.f300195t;
    }

    @Override // fsl.n
    public final Data a() {
        return this.f300194s;
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
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f300182a, jVar.f300182a) && Intrinsics.f(this.f300183b, jVar.f300183b) && Intrinsics.f(this.f300184c, jVar.f300184c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e) && Intrinsics.f(this.f, jVar.f) && Intrinsics.f(this.f300185g, jVar.f300185g) && Intrinsics.f(this.f300186h, jVar.f300186h) && Intrinsics.f(this.i, jVar.i) && Intrinsics.f(this.f300187j, jVar.f300187j) && Intrinsics.f(this.k, jVar.k) && Intrinsics.f(this.f300188l, jVar.f300188l) && Intrinsics.f(this.f300189m, jVar.f300189m) && Intrinsics.f(this.f300190n, jVar.f300190n) && Intrinsics.f(this.o, jVar.o) && Intrinsics.f(this.f300191p, jVar.f300191p) && Intrinsics.f(this.f300192q, jVar.f300192q) && Intrinsics.f(this.f300193r, jVar.f300193r) && Intrinsics.f(this.f300194s, jVar.f300194s) && Intrinsics.f(this.f300195t, jVar.f300195t) && Intrinsics.f(this.u, jVar.u) && Intrinsics.f(this.v, jVar.v) && Intrinsics.f(this.f300196w, jVar.f300196w);
    }

    public final int hashCode() {
        Data data = this.f300182a;
        int iHashCode = (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + kii.e.c(this.f300184c.f211545a, (this.f300183b.hashCode() + ((data == null ? 0 : data.hashCode()) * 31)) * 31, 31)) * 31)) * 31)) * 31;
        List list = this.f300185g;
        int iD = p.a.d((this.i.hashCode() + kii.e.c(this.f300186h.f9085a, (iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31)) * 31, 31, this.f300187j);
        List list2 = this.k;
        int iHashCode2 = (this.o.hashCode() + ((this.f300190n.hashCode() + kii.e.c(this.f300189m, kii.e.c(this.f300188l, (iD + (list2 == null ? 0 : list2.hashCode())) * 31, 31), 31)) * 31)) * 31;
        jtk.i iVar = this.f300191p;
        int iHashCode3 = (iHashCode2 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        Data data2 = this.f300192q;
        int iD2 = p.a.d((iHashCode3 + (data2 == null ? 0 : data2.hashCode())) * 31, 31, this.f300193r);
        Data data3 = this.f300194s;
        int iHashCode4 = (iD2 + (data3 == null ? 0 : data3.hashCode())) * 31;
        Data data4 = this.f300195t;
        int iHashCode5 = (iHashCode4 + (data4 == null ? 0 : data4.hashCode())) * 31;
        Data data5 = this.u;
        int iHashCode6 = (iHashCode5 + (data5 == null ? 0 : data5.hashCode())) * 31;
        Data data6 = this.v;
        int iHashCode7 = (iHashCode6 + (data6 == null ? 0 : data6.hashCode())) * 31;
        List list3 = this.f300196w;
        return iHashCode7 + (list3 != null ? list3.hashCode() : 0);
    }
}
