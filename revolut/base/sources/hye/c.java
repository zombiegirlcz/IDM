package hye;

import com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod;
import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kye.n3;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SelectedMethod f156844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f156845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f156846c;
    public final dj0.d d;
    public final qte.g e;
    public final jye.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f156847g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f156848h;
    public final dj0.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final fb3.d f156849j;
    public final n3 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f156850l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final bue.b f156851m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final aue.a f156852n;
    public final List o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f156853p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f156854q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f156855r;

    public c(SelectedMethod selectedMethod, dj0.d amount, String amountString, dj0.d minTopUp, qte.g gVar, jye.a aVar, boolean z, boolean z3, dj0.d remainingAnnualLimit, fb3.d dVar, n3 n3Var, String baseCurrency, bue.b bVar, aue.a aVar2, List list, List list2, List list3, List list4) {
        Intrinsics.checkNotNullParameter(selectedMethod, "selectedMethod");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(amountString, "amountString");
        Intrinsics.checkNotNullParameter(minTopUp, "minTopUp");
        Intrinsics.checkNotNullParameter(remainingAnnualLimit, "remainingAnnualLimit");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        this.f156844a = selectedMethod;
        this.f156845b = amount;
        this.f156846c = amountString;
        this.d = minTopUp;
        this.e = gVar;
        this.f = aVar;
        this.f156847g = z;
        this.f156848h = z3;
        this.i = remainingAnnualLimit;
        this.f156849j = dVar;
        this.k = n3Var;
        this.f156850l = baseCurrency;
        this.f156851m = bVar;
        this.f156852n = aVar2;
        this.o = list;
        this.f156853p = list2;
        this.f156854q = list3;
        this.f156855r = list4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f156844a, cVar.f156844a) && Intrinsics.f(this.f156845b, cVar.f156845b) && Intrinsics.f(this.f156846c, cVar.f156846c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && this.f156847g == cVar.f156847g && this.f156848h == cVar.f156848h && Intrinsics.f(this.i, cVar.i) && Intrinsics.f(this.f156849j, cVar.f156849j) && Intrinsics.f(this.k, cVar.k) && Intrinsics.f(this.f156850l, cVar.f156850l) && Intrinsics.f(this.f156851m, cVar.f156851m) && Intrinsics.f(this.f156852n, cVar.f156852n) && Intrinsics.f(this.o, cVar.o) && Intrinsics.f(this.f156853p, cVar.f156853p) && Intrinsics.f(this.f156854q, cVar.f156854q) && Intrinsics.f(this.f156855r, cVar.f156855r);
    }

    public final int hashCode() {
        int iC = v7.c(p.a.c(v7.c(this.f156844a.hashCode() * 31, 31, this.f156845b), 31, this.f156846c), 31, this.d);
        qte.g gVar = this.e;
        int iHashCode = (iC + (gVar == null ? 0 : gVar.hashCode())) * 31;
        jye.a aVar = this.f;
        int iC2 = v7.c(j6.a.c(j6.a.c((iHashCode + (aVar == null ? 0 : aVar.f179415a.hashCode())) * 31, 31, this.f156847g), 31, this.f156848h), 31, this.i);
        fb3.d dVar = this.f156849j;
        int iHashCode2 = (iC2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        n3 n3Var = this.k;
        int iC3 = p.a.c((iHashCode2 + (n3Var == null ? 0 : n3Var.hashCode())) * 31, 31, this.f156850l);
        bue.b bVar = this.f156851m;
        int iHashCode3 = (iC3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        aue.a aVar2 = this.f156852n;
        int iHashCode4 = (iHashCode3 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        List list = this.o;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f156853p;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f156854q;
        int iHashCode7 = (iHashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.f156855r;
        return iHashCode7 + (list4 != null ? list4.hashCode() : 0);
    }
}
