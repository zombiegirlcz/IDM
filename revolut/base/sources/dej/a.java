package dej;

import com.revolut.retail.feature.esim.api.model.EsimAutoRenewalTerms;
import com.revolut.retail.feature.esim.api.model.EsimCheckoutPorting;
import com.revolut.retail.feature.esim.api.model.EsimDataPlanOfferInfo;
import com.revolut.retail.feature.esim.api.model.EsimPriceBreakdown;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionRefund;
import com.revolut.retail.feature.esim.api.model.EsimTerms;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimDataPlanOfferInfo f113472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f113473c;
    public final String d;
    public final String e;
    public final EsimTerms f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final EsimAutoRenewalTerms f113474g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v3 f113475h;
    public final EsimPriceBreakdown i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final EsimCheckoutPorting f113476j;
    public final EsimSubscriptionRefund k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Instant f113477l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e f113478m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f113479n;
    public final b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f113480p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l2 f113481q;

    public a(String str, EsimDataPlanOfferInfo esimDataPlanOfferInfo, h hVar, String str2, String str3, EsimTerms terms, EsimAutoRenewalTerms esimAutoRenewalTerms, v3 v3Var, EsimPriceBreakdown priceBreakdown, EsimCheckoutPorting esimCheckoutPorting, EsimSubscriptionRefund esimSubscriptionRefund, Instant instant, e eVar, String str4, b bVar, c cVar, l2 l2Var) {
        Intrinsics.checkNotNullParameter(terms, "terms");
        Intrinsics.checkNotNullParameter(priceBreakdown, "priceBreakdown");
        this.f113471a = str;
        this.f113472b = esimDataPlanOfferInfo;
        this.f113473c = hVar;
        this.d = str2;
        this.e = str3;
        this.f = terms;
        this.f113474g = esimAutoRenewalTerms;
        this.f113475h = v3Var;
        this.i = priceBreakdown;
        this.f113476j = esimCheckoutPorting;
        this.k = esimSubscriptionRefund;
        this.f113477l = instant;
        this.f113478m = eVar;
        this.f113479n = str4;
        this.o = bVar;
        this.f113480p = cVar;
        this.f113481q = l2Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f113471a, aVar.f113471a) && Intrinsics.f(this.f113472b, aVar.f113472b) && Intrinsics.f(this.f113473c, aVar.f113473c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f113474g, aVar.f113474g) && Intrinsics.f(this.f113475h, aVar.f113475h) && Intrinsics.f(this.i, aVar.i) && Intrinsics.f(this.f113476j, aVar.f113476j) && Intrinsics.f(this.k, aVar.k) && Intrinsics.f(this.f113477l, aVar.f113477l) && this.f113478m == aVar.f113478m && Intrinsics.f(this.f113479n, aVar.f113479n) && Intrinsics.f(this.o, aVar.o) && Intrinsics.f(this.f113480p, aVar.f113480p) && Intrinsics.f(this.f113481q, aVar.f113481q);
    }

    public final int hashCode() {
        String str = this.f113471a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        EsimDataPlanOfferInfo esimDataPlanOfferInfo = this.f113472b;
        int iHashCode2 = (iHashCode + (esimDataPlanOfferInfo == null ? 0 : esimDataPlanOfferInfo.hashCode())) * 31;
        h hVar = this.f113473c;
        int iHashCode3 = (iHashCode2 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (this.f.hashCode() + ((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        EsimAutoRenewalTerms esimAutoRenewalTerms = this.f113474g;
        int iHashCode6 = (iHashCode5 + (esimAutoRenewalTerms == null ? 0 : esimAutoRenewalTerms.hashCode())) * 31;
        v3 v3Var = this.f113475h;
        int iHashCode7 = (this.i.hashCode() + ((iHashCode6 + (v3Var == null ? 0 : v3Var.hashCode())) * 31)) * 31;
        EsimCheckoutPorting esimCheckoutPorting = this.f113476j;
        int iHashCode8 = (iHashCode7 + (esimCheckoutPorting == null ? 0 : esimCheckoutPorting.f100192a.hashCode())) * 31;
        EsimSubscriptionRefund esimSubscriptionRefund = this.k;
        int iHashCode9 = (iHashCode8 + (esimSubscriptionRefund == null ? 0 : esimSubscriptionRefund.hashCode())) * 31;
        Instant instant = this.f113477l;
        int iHashCode10 = (iHashCode9 + (instant == null ? 0 : instant.hashCode())) * 31;
        e eVar = this.f113478m;
        int iHashCode11 = (iHashCode10 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        String str4 = this.f113479n;
        int iHashCode12 = (iHashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        b bVar = this.o;
        int iHashCode13 = (iHashCode12 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        c cVar = this.f113480p;
        int iHashCode14 = (iHashCode13 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        l2 l2Var = this.f113481q;
        return iHashCode14 + (l2Var != null ? l2Var.hashCode() : 0);
    }
}
