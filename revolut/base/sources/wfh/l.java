package wfh;

import com.revolut.data.model.Data;
import java.util.List;
import java.util.Set;
import jel.w;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements cli.j, fsl.n, v2h.e {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f297120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f297121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f297122c;
    public final Data d;
    public final Data e;
    public final j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f297123g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f297124h;
    public final e3h.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Data f297125j;
    public final Data k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f297126l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Data f297127m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Data f297128n;
    public final n2h.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Data f297129p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Data f297130q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d1h.g f297131r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Data f297132s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Data f297133t;
    public final Data u;

    public l(String selectedFundShareRef, Data selectedFundShare, Data selectedFundShareTicker, Data instrumentDetails, Data holdingInstruments, j jVar, Set expandedAllocationItems, boolean z, e3h.c historicalChartDomainState, Data data, Data data2, List list, Data fundShares, Data account, n2h.f actionsPanelState, Data data3, Data data4, d1h.g gVar, Data instrumentBalance, Data orderLimits, Data wasTraded) {
        Intrinsics.checkNotNullParameter(selectedFundShareRef, "selectedFundShareRef");
        Intrinsics.checkNotNullParameter(selectedFundShare, "selectedFundShare");
        Intrinsics.checkNotNullParameter(selectedFundShareTicker, "selectedFundShareTicker");
        Intrinsics.checkNotNullParameter(instrumentDetails, "instrumentDetails");
        Intrinsics.checkNotNullParameter(holdingInstruments, "holdingInstruments");
        Intrinsics.checkNotNullParameter(expandedAllocationItems, "expandedAllocationItems");
        Intrinsics.checkNotNullParameter(historicalChartDomainState, "historicalChartDomainState");
        Intrinsics.checkNotNullParameter(fundShares, "fundShares");
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(actionsPanelState, "actionsPanelState");
        Intrinsics.checkNotNullParameter(instrumentBalance, "instrumentBalance");
        Intrinsics.checkNotNullParameter(orderLimits, "orderLimits");
        Intrinsics.checkNotNullParameter(wasTraded, "wasTraded");
        this.f297120a = selectedFundShareRef;
        this.f297121b = selectedFundShare;
        this.f297122c = selectedFundShareTicker;
        this.d = instrumentDetails;
        this.e = holdingInstruments;
        this.f = jVar;
        this.f297123g = expandedAllocationItems;
        this.f297124h = z;
        this.i = historicalChartDomainState;
        this.f297125j = data;
        this.k = data2;
        this.f297126l = list;
        this.f297127m = fundShares;
        this.f297128n = account;
        this.o = actionsPanelState;
        this.f297129p = data3;
        this.f297130q = data4;
        this.f297131r = gVar;
        this.f297132s = instrumentBalance;
        this.f297133t = orderLimits;
        this.u = wasTraded;
    }

    public static l e(l lVar, Data data, Data data2, Data data3, Data data4, j jVar, Set set, boolean z, e3h.c cVar, Data data5, Data data6, List list, Data data7, Data data8, n2h.f fVar, Data data9, Data data10, d1h.g gVar, Data data11, Data data12, Data data13, int i) {
        String selectedFundShareRef = lVar.f297120a;
        Data selectedFundShare = (i & 2) != 0 ? lVar.f297121b : data;
        Data selectedFundShareTicker = (i & 4) != 0 ? lVar.f297122c : data2;
        Data instrumentDetails = (i & 8) != 0 ? lVar.d : data3;
        Data holdingInstruments = (i & 16) != 0 ? lVar.e : data4;
        j jVar2 = (i & 32) != 0 ? lVar.f : jVar;
        Set expandedAllocationItems = (i & 64) != 0 ? lVar.f297123g : set;
        boolean z3 = (i & 128) != 0 ? lVar.f297124h : z;
        e3h.c historicalChartDomainState = (i & 256) != 0 ? lVar.i : cVar;
        Data data14 = (i & 512) != 0 ? lVar.f297125j : data5;
        Data data15 = (i & 1024) != 0 ? lVar.k : data6;
        List list2 = (i & 2048) != 0 ? lVar.f297126l : list;
        Data fundShares = (i & 4096) != 0 ? lVar.f297127m : data7;
        Data account = (i & 8192) != 0 ? lVar.f297128n : data8;
        j jVar3 = jVar2;
        n2h.f actionsPanelState = (i & 16384) != 0 ? lVar.o : fVar;
        Data data16 = (i & 32768) != 0 ? lVar.f297129p : data9;
        Data data17 = (i & 65536) != 0 ? lVar.f297130q : data10;
        d1h.g gVar2 = (i & 131072) != 0 ? lVar.f297131r : gVar;
        Data instrumentBalance = (i & 262144) != 0 ? lVar.f297132s : data11;
        boolean z4 = z3;
        Data orderLimits = (i & 524288) != 0 ? lVar.f297133t : data12;
        Data data18 = data14;
        Data wasTraded = (i & PKIFailureInfo.badCertTemplate) != 0 ? lVar.u : data13;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(selectedFundShareRef, "selectedFundShareRef");
        Intrinsics.checkNotNullParameter(selectedFundShare, "selectedFundShare");
        Intrinsics.checkNotNullParameter(selectedFundShareTicker, "selectedFundShareTicker");
        Intrinsics.checkNotNullParameter(instrumentDetails, "instrumentDetails");
        Intrinsics.checkNotNullParameter(holdingInstruments, "holdingInstruments");
        Intrinsics.checkNotNullParameter(expandedAllocationItems, "expandedAllocationItems");
        Intrinsics.checkNotNullParameter(historicalChartDomainState, "historicalChartDomainState");
        Intrinsics.checkNotNullParameter(fundShares, "fundShares");
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(actionsPanelState, "actionsPanelState");
        Intrinsics.checkNotNullParameter(instrumentBalance, "instrumentBalance");
        Intrinsics.checkNotNullParameter(orderLimits, "orderLimits");
        Intrinsics.checkNotNullParameter(wasTraded, "wasTraded");
        return new l(selectedFundShareRef, selectedFundShare, selectedFundShareTicker, instrumentDetails, holdingInstruments, jVar3, expandedAllocationItems, z4, historicalChartDomainState, data18, data15, list2, fundShares, account, actionsPanelState, data16, data17, gVar2, instrumentBalance, orderLimits, wasTraded);
    }

    @Override // fsl.n
    public final Data J0() {
        return this.k;
    }

    @Override // fsl.n
    public final Data a() {
        return this.f297125j;
    }

    @Override // v2h.e
    public final Data c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f297120a, lVar.f297120a) && Intrinsics.f(this.f297121b, lVar.f297121b) && Intrinsics.f(this.f297122c, lVar.f297122c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e) && this.f == lVar.f && Intrinsics.f(this.f297123g, lVar.f297123g) && this.f297124h == lVar.f297124h && Intrinsics.f(this.i, lVar.i) && Intrinsics.f(this.f297125j, lVar.f297125j) && Intrinsics.f(this.k, lVar.k) && Intrinsics.f(this.f297126l, lVar.f297126l) && Intrinsics.f(this.f297127m, lVar.f297127m) && Intrinsics.f(this.f297128n, lVar.f297128n) && Intrinsics.f(this.o, lVar.o) && Intrinsics.f(this.f297129p, lVar.f297129p) && Intrinsics.f(this.f297130q, lVar.f297130q) && Intrinsics.f(this.f297131r, lVar.f297131r) && Intrinsics.f(this.f297132s, lVar.f297132s) && Intrinsics.f(this.f297133t, lVar.f297133t) && Intrinsics.f(this.u, lVar.u);
    }

    public final boolean f() {
        nel.n nVar = (nel.n) this.f297121b.getContent();
        return (nVar != null ? ifk.b.i(nVar) : null) == w.VENTURE_CAPITAL;
    }

    public final int hashCode() {
        int iC = kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f297122c, kii.e.c(this.f297121b, this.f297120a.hashCode() * 31, 31), 31), 31), 31);
        j jVar = this.f;
        int iHashCode = (this.i.hashCode() + j6.a.c(p.a.f((iC + (jVar == null ? 0 : jVar.hashCode())) * 31, 31, this.f297123g), 31, this.f297124h)) * 31;
        Data data = this.f297125j;
        int iHashCode2 = (iHashCode + (data == null ? 0 : data.hashCode())) * 31;
        Data data2 = this.k;
        int iHashCode3 = (iHashCode2 + (data2 == null ? 0 : data2.hashCode())) * 31;
        List list = this.f297126l;
        int iC2 = kii.e.c(this.o.f211545a, kii.e.c(this.f297128n, kii.e.c(this.f297127m, (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31, 31), 31), 31);
        Data data3 = this.f297129p;
        int iHashCode4 = (iC2 + (data3 == null ? 0 : data3.hashCode())) * 31;
        Data data4 = this.f297130q;
        int iHashCode5 = (iHashCode4 + (data4 == null ? 0 : data4.hashCode())) * 31;
        d1h.g gVar = this.f297131r;
        return this.u.hashCode() + kii.e.c(this.f297133t, kii.e.c(this.f297132s, (iHashCode5 + (gVar != null ? gVar.hashCode() : 0)) * 31, 31), 31);
    }
}
