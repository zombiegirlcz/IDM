package cxe;

import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$CheckoutContent$Order;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$CheckoutTarget;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.model.CheckoutCardPlan;
import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheckoutScreenContract$CheckoutContent$Order f109920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hha.d f109921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f109922c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final yt8.i f109923g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jxe.c f109924h;
    public final jxe.l i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final jxe.m f109925j;
    public final dj0.d k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final dj0.d f109926l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final CheckoutScreenContract$CheckoutTarget f109927m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final dj0.d f109928n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l71.d f109929p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f109930q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f109931r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final CheckoutCardPlan f109932s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e93.c f109933t;
    public final e93.j0 u;
    public final m1c.x v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final re7.i f109934w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f109935x;

    public b(CheckoutScreenContract$CheckoutContent$Order order, hha.d dVar, boolean z, boolean z3, boolean z4, boolean z6, yt8.i kycStatus, jxe.c cVar, jxe.l lVar, jxe.m selectedTopUpMethodData, dj0.d moneyLeftToTopUp, dj0.d balance, CheckoutScreenContract$CheckoutTarget checkoutTarget, dj0.d discount, boolean z11, l71.d userCompany, List list, boolean z12, CheckoutCardPlan checkoutCardPlan, e93.c cVar2, e93.j0 j0Var, m1c.x xVar, re7.i freeCardDeliveryOffer, String str) {
        Intrinsics.checkNotNullParameter(order, "order");
        Intrinsics.checkNotNullParameter(kycStatus, "kycStatus");
        Intrinsics.checkNotNullParameter(selectedTopUpMethodData, "selectedTopUpMethodData");
        Intrinsics.checkNotNullParameter(moneyLeftToTopUp, "moneyLeftToTopUp");
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(checkoutTarget, "checkoutTarget");
        Intrinsics.checkNotNullParameter(discount, "discount");
        Intrinsics.checkNotNullParameter(userCompany, "userCompany");
        Intrinsics.checkNotNullParameter(freeCardDeliveryOffer, "freeCardDeliveryOffer");
        this.f109920a = order;
        this.f109921b = dVar;
        this.f109922c = z;
        this.d = z3;
        this.e = z4;
        this.f = z6;
        this.f109923g = kycStatus;
        this.f109924h = cVar;
        this.i = lVar;
        this.f109925j = selectedTopUpMethodData;
        this.k = moneyLeftToTopUp;
        this.f109926l = balance;
        this.f109927m = checkoutTarget;
        this.f109928n = discount;
        this.o = z11;
        this.f109929p = userCompany;
        this.f109930q = list;
        this.f109931r = z12;
        this.f109932s = checkoutCardPlan;
        this.f109933t = cVar2;
        this.u = j0Var;
        this.v = xVar;
        this.f109934w = freeCardDeliveryOffer;
        this.f109935x = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f109920a, bVar.f109920a) && Intrinsics.f(this.f109921b, bVar.f109921b) && this.f109922c == bVar.f109922c && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f && this.f109923g == bVar.f109923g && Intrinsics.f(this.f109924h, bVar.f109924h) && Intrinsics.f(this.i, bVar.i) && Intrinsics.f(this.f109925j, bVar.f109925j) && Intrinsics.f(this.k, bVar.k) && Intrinsics.f(this.f109926l, bVar.f109926l) && Intrinsics.f(this.f109927m, bVar.f109927m) && Intrinsics.f(this.f109928n, bVar.f109928n) && this.o == bVar.o && Intrinsics.f(this.f109929p, bVar.f109929p) && Intrinsics.f(this.f109930q, bVar.f109930q) && this.f109931r == bVar.f109931r && Intrinsics.f(this.f109932s, bVar.f109932s) && Intrinsics.f(this.f109933t, bVar.f109933t) && Intrinsics.f(this.u, bVar.u) && Intrinsics.f(this.v, bVar.v) && Intrinsics.f(this.f109934w, bVar.f109934w) && Intrinsics.f(this.f109935x, bVar.f109935x);
    }

    public final int hashCode() {
        int iHashCode = this.f109920a.hashCode() * 31;
        hha.d dVar = this.f109921b;
        int iHashCode2 = (this.f109923g.hashCode() + j6.a.c(j6.a.c(j6.a.c(j6.a.c((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.f109922c), 31, this.d), 31, this.e), 31, this.f)) * 31;
        jxe.c cVar = this.f109924h;
        int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        jxe.l lVar = this.i;
        int iHashCode4 = (this.f109929p.hashCode() + j6.a.c(v7.c((this.f109927m.hashCode() + v7.c(v7.c((this.f109925j.hashCode() + ((iHashCode3 + (lVar == null ? 0 : lVar.hashCode())) * 31)) * 31, 31, this.k), 31, this.f109926l)) * 31, 31, this.f109928n), 31, this.o)) * 31;
        List list = this.f109930q;
        int iC = j6.a.c((iHashCode4 + (list == null ? 0 : list.hashCode())) * 31, 31, this.f109931r);
        CheckoutCardPlan checkoutCardPlan = this.f109932s;
        int iHashCode5 = (iC + (checkoutCardPlan == null ? 0 : checkoutCardPlan.hashCode())) * 31;
        e93.c cVar2 = this.f109933t;
        int iHashCode6 = (iHashCode5 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        e93.j0 j0Var = this.u;
        int iHashCode7 = (iHashCode6 + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        m1c.x xVar = this.v;
        int iHashCode8 = (this.f109934w.hashCode() + ((iHashCode7 + (xVar == null ? 0 : xVar.hashCode())) * 31)) * 31;
        String str = this.f109935x;
        return iHashCode8 + (str != null ? str.hashCode() : 0);
    }
}
