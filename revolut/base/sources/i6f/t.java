package i6f;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class t implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f158969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f158970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t6f.h f158971c;
    public final r6f.e d;
    public final v6f.e e;
    public final o6f.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j6f.a f158972g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g7f.c f158973h;
    public final b7f.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e7f.e f158974j;
    public final Data k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i7f.b f158975l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a7f.c f158976m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Data f158977n;
    public final y6f.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d0 f158978p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d1h.g f158979q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Data f158980r;

    public t(Data portfolioData, Data portfolioHeader, t6f.h portfolioInfo, r6f.e fees, v6f.e portfolioInvestments, o6f.a chartItems, j6f.a allocationItems, g7f.c reference, b7f.c performance, e7f.e performanceSummary, Data status, i7f.b transactions, a7f.c orders, Data data, y6f.c performanceType, d0 lastSelectedBenchmark, d1h.g disclaimers, Data data2) {
        Intrinsics.checkNotNullParameter(portfolioData, "portfolioData");
        Intrinsics.checkNotNullParameter(portfolioHeader, "portfolioHeader");
        Intrinsics.checkNotNullParameter(portfolioInfo, "portfolioInfo");
        Intrinsics.checkNotNullParameter(fees, "fees");
        Intrinsics.checkNotNullParameter(portfolioInvestments, "portfolioInvestments");
        Intrinsics.checkNotNullParameter(chartItems, "chartItems");
        Intrinsics.checkNotNullParameter(allocationItems, "allocationItems");
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(performance, "performance");
        Intrinsics.checkNotNullParameter(performanceSummary, "performanceSummary");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(orders, "orders");
        Intrinsics.checkNotNullParameter(performanceType, "performanceType");
        Intrinsics.checkNotNullParameter(lastSelectedBenchmark, "lastSelectedBenchmark");
        Intrinsics.checkNotNullParameter(disclaimers, "disclaimers");
        this.f158969a = portfolioData;
        this.f158970b = portfolioHeader;
        this.f158971c = portfolioInfo;
        this.d = fees;
        this.e = portfolioInvestments;
        this.f = chartItems;
        this.f158972g = allocationItems;
        this.f158973h = reference;
        this.i = performance;
        this.f158974j = performanceSummary;
        this.k = status;
        this.f158975l = transactions;
        this.f158976m = orders;
        this.f158977n = data;
        this.o = performanceType;
        this.f158978p = lastSelectedBenchmark;
        this.f158979q = disclaimers;
        this.f158980r = data2;
    }

    public static t a(t tVar, Data data, Data data2, t6f.h hVar, r6f.e eVar, v6f.e eVar2, o6f.a aVar, j6f.a aVar2, g7f.c cVar, b7f.c cVar2, e7f.e eVar3, Data data3, i7f.b bVar, a7f.c cVar3, Data data4, y6f.c cVar4, d0 d0Var, d1h.g gVar, Data data5, int i) {
        Data portfolioData = (i & 1) != 0 ? tVar.f158969a : data;
        Data portfolioHeader = (i & 2) != 0 ? tVar.f158970b : data2;
        t6f.h portfolioInfo = (i & 4) != 0 ? tVar.f158971c : hVar;
        r6f.e fees = (i & 8) != 0 ? tVar.d : eVar;
        v6f.e portfolioInvestments = (i & 16) != 0 ? tVar.e : eVar2;
        o6f.a chartItems = (i & 32) != 0 ? tVar.f : aVar;
        j6f.a allocationItems = (i & 64) != 0 ? tVar.f158972g : aVar2;
        g7f.c reference = (i & 128) != 0 ? tVar.f158973h : cVar;
        b7f.c performance = (i & 256) != 0 ? tVar.i : cVar2;
        e7f.e performanceSummary = (i & 512) != 0 ? tVar.f158974j : eVar3;
        Data status = (i & 1024) != 0 ? tVar.k : data3;
        i7f.b transactions = (i & 2048) != 0 ? tVar.f158975l : bVar;
        a7f.c orders = (i & 4096) != 0 ? tVar.f158976m : cVar3;
        Data data6 = (i & 8192) != 0 ? tVar.f158977n : data4;
        y6f.c performanceType = (i & 16384) != 0 ? tVar.o : cVar4;
        d0 lastSelectedBenchmark = (i & 32768) != 0 ? tVar.f158978p : d0Var;
        d1h.g disclaimers = (i & 65536) != 0 ? tVar.f158979q : gVar;
        Data data7 = (i & 131072) != 0 ? tVar.f158980r : data5;
        tVar.getClass();
        Intrinsics.checkNotNullParameter(portfolioData, "portfolioData");
        Intrinsics.checkNotNullParameter(portfolioHeader, "portfolioHeader");
        Intrinsics.checkNotNullParameter(portfolioInfo, "portfolioInfo");
        Intrinsics.checkNotNullParameter(fees, "fees");
        Intrinsics.checkNotNullParameter(portfolioInvestments, "portfolioInvestments");
        Intrinsics.checkNotNullParameter(chartItems, "chartItems");
        Intrinsics.checkNotNullParameter(allocationItems, "allocationItems");
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(performance, "performance");
        Intrinsics.checkNotNullParameter(performanceSummary, "performanceSummary");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(orders, "orders");
        Intrinsics.checkNotNullParameter(performanceType, "performanceType");
        Intrinsics.checkNotNullParameter(lastSelectedBenchmark, "lastSelectedBenchmark");
        Intrinsics.checkNotNullParameter(disclaimers, "disclaimers");
        return new t(portfolioData, portfolioHeader, portfolioInfo, fees, portfolioInvestments, chartItems, allocationItems, reference, performance, performanceSummary, status, transactions, orders, data6, performanceType, lastSelectedBenchmark, disclaimers, data7);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f158969a, tVar.f158969a) && Intrinsics.f(this.f158970b, tVar.f158970b) && Intrinsics.f(this.f158971c, tVar.f158971c) && Intrinsics.f(this.d, tVar.d) && Intrinsics.f(this.e, tVar.e) && Intrinsics.f(this.f, tVar.f) && Intrinsics.f(this.f158972g, tVar.f158972g) && Intrinsics.f(this.f158973h, tVar.f158973h) && Intrinsics.f(this.i, tVar.i) && Intrinsics.f(this.f158974j, tVar.f158974j) && Intrinsics.f(this.k, tVar.k) && Intrinsics.f(this.f158975l, tVar.f158975l) && Intrinsics.f(this.f158976m, tVar.f158976m) && Intrinsics.f(this.f158977n, tVar.f158977n) && this.o == tVar.o && Intrinsics.f(this.f158978p, tVar.f158978p) && Intrinsics.f(this.f158979q, tVar.f158979q) && Intrinsics.f(this.f158980r, tVar.f158980r);
    }

    public final int hashCode() {
        int iHashCode = (this.f158976m.hashCode() + ((this.f158975l.hashCode() + kii.e.c(this.k, (this.f158974j.hashCode() + kii.e.c(this.i.f13035a, kii.e.c(this.f158973h.f141198a, (this.f158972g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.f158971c.hashCode() + kii.e.c(this.f158970b, this.f158969a.hashCode() * 31, 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31), 31)) * 31, 31)) * 31)) * 31;
        Data data = this.f158977n;
        int iHashCode2 = (this.f158979q.hashCode() + ((this.f158978p.hashCode() + ((this.o.hashCode() + ((iHashCode + (data == null ? 0 : data.hashCode())) * 31)) * 31)) * 31)) * 31;
        Data data2 = this.f158980r;
        return iHashCode2 + (data2 != null ? data2.hashCode() : 0);
    }
}
