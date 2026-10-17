package su4;

import com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review.CreditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData;
import dx4.g2;
import dx4.z2;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f265641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xm4.f f265642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j1j.d f265643c;
    public final dj0.d d;
    public final List e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f265644g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g2 f265645h;
    public final dj0.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final z2 f265646j;
    public final CreditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f265647l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final xm4.a f265648m;

    public h(dj0.d moneyToRepay, xm4.f fVar, j1j.d dVar, dj0.d dVar2, List availablePockets, boolean z, boolean z3, g2 g2Var, dj0.d dVar3, z2 z2Var, CreditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData creditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData, List discounts, xm4.a aVar) {
        Intrinsics.checkNotNullParameter(moneyToRepay, "moneyToRepay");
        Intrinsics.checkNotNullParameter(availablePockets, "availablePockets");
        Intrinsics.checkNotNullParameter(discounts, "discounts");
        this.f265641a = moneyToRepay;
        this.f265642b = fVar;
        this.f265643c = dVar;
        this.d = dVar2;
        this.e = availablePockets;
        this.f = z;
        this.f265644g = z3;
        this.f265645h = g2Var;
        this.i = dVar3;
        this.f265646j = z2Var;
        this.k = creditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData;
        this.f265647l = discounts;
        this.f265648m = aVar;
    }

    public static h a(h hVar, j1j.d dVar, dj0.d dVar2, boolean z, boolean z3, CreditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData creditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData, xm4.a aVar, int i) {
        dj0.d moneyToRepay = hVar.f265641a;
        xm4.f fVar = hVar.f265642b;
        if ((i & 4) != 0) {
            dVar = hVar.f265643c;
        }
        j1j.d dVar3 = dVar;
        dj0.d dVar4 = (i & 8) != 0 ? hVar.d : dVar2;
        List availablePockets = hVar.e;
        boolean z4 = (i & 32) != 0 ? hVar.f : z;
        boolean z6 = (i & 64) != 0 ? hVar.f265644g : z3;
        g2 g2Var = hVar.f265645h;
        dj0.d dVar5 = hVar.i;
        z2 z2Var = hVar.f265646j;
        CreditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData creditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData2 = (i & 1024) != 0 ? hVar.k : creditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData;
        List discounts = hVar.f265647l;
        xm4.a aVar2 = (i & 4096) != 0 ? hVar.f265648m : aVar;
        Intrinsics.checkNotNullParameter(moneyToRepay, "moneyToRepay");
        Intrinsics.checkNotNullParameter(availablePockets, "availablePockets");
        Intrinsics.checkNotNullParameter(discounts, "discounts");
        return new h(moneyToRepay, fVar, dVar3, dVar4, availablePockets, z4, z6, g2Var, dVar5, z2Var, creditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData2, discounts, aVar2);
    }

    public final dj0.d b() {
        dj0.d dVar;
        dj0.d dVar2 = this.f265641a;
        long j2 = dVar2.f115082a;
        xm4.a aVar = this.f265648m;
        return new dj0.d(j2 - ((aVar == null || (dVar = aVar.f307072a) == null) ? 0L : dVar.f115082a), dVar2.f115083b);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f265641a, hVar.f265641a) && Intrinsics.f(this.f265642b, hVar.f265642b) && Intrinsics.f(this.f265643c, hVar.f265643c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && this.f == hVar.f && this.f265644g == hVar.f265644g && Intrinsics.f(this.f265645h, hVar.f265645h) && Intrinsics.f(this.i, hVar.i) && Intrinsics.f(this.f265646j, hVar.f265646j) && Intrinsics.f(this.k, hVar.k) && Intrinsics.f(this.f265647l, hVar.f265647l) && Intrinsics.f(this.f265648m, hVar.f265648m);
    }

    public final int hashCode() {
        int iHashCode = this.f265641a.hashCode() * 31;
        xm4.f fVar = this.f265642b;
        int iHashCode2 = (iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        j1j.d dVar = this.f265643c;
        int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        dj0.d dVar2 = this.d;
        int iC = j6.a.c(j6.a.c(p.a.d((iHashCode3 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.f265644g);
        g2 g2Var = this.f265645h;
        int iHashCode4 = (iC + (g2Var == null ? 0 : g2Var.hashCode())) * 31;
        dj0.d dVar3 = this.i;
        int iHashCode5 = (iHashCode4 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
        z2 z2Var = this.f265646j;
        int iHashCode6 = (iHashCode5 + (z2Var == null ? 0 : z2Var.hashCode())) * 31;
        CreditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData creditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData = this.k;
        int iD = p.a.d((iHashCode6 + (creditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData == null ? 0 : creditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData.hashCode())) * 31, 31, this.f265647l);
        xm4.a aVar = this.f265648m;
        return iD + (aVar != null ? aVar.hashCode() : 0);
    }
}
