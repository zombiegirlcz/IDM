package kq2;

import com.revolut.feature.transfer.models.quotes.CreditCardInterest;
import com.revolut.feature.transfer.models.quotes.TransferAvailability;
import com.revolut.feature.transfer.models.quotes.TransferQuoteSplit;
import com.revolut.feature.transfer.models.withholding_tax.WithholdingTaxTreatmentConfiguration;
import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f188302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f188303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f188304c;
    public final dj0.d d;
    public final dj0.d e;
    public final dj0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f188305g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f188306h;
    public final d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d f188307j;
    public final d k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d f188308l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f188309m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final z3l.a f188310n;
    public final CreditCardInterest o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f188311p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final nrf.e f188312q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TransferQuoteSplit f188313r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final dj0.d f188314s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f188315t;
    public final String u;
    public final z3l.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TransferAvailability f188316w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final WithholdingTaxTreatmentConfiguration f188317x;

    public f(dj0.d from, dj0.d to6, dj0.d exchangeFee, dj0.d dVar, dj0.d dVar2, dj0.d totalFee, double d, long j2, d dVar3, d dVar4, d dVar5, d dVar6, List list, z3l.a aVar, CreditCardInterest creditCardInterest, boolean z, nrf.e eVar, TransferQuoteSplit transferQuoteSplit, dj0.d dVar7, String str, String str2, z3l.a aVar2, TransferAvailability transferAvailability, WithholdingTaxTreatmentConfiguration withholdingTaxTreatmentConfiguration) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        Intrinsics.checkNotNullParameter(exchangeFee, "exchangeFee");
        Intrinsics.checkNotNullParameter(totalFee, "totalFee");
        this.f188302a = from;
        this.f188303b = to6;
        this.f188304c = exchangeFee;
        this.d = dVar;
        this.e = dVar2;
        this.f = totalFee;
        this.f188305g = d;
        this.f188306h = j2;
        this.i = dVar3;
        this.f188307j = dVar4;
        this.k = dVar5;
        this.f188308l = dVar6;
        this.f188309m = list;
        this.f188310n = aVar;
        this.o = creditCardInterest;
        this.f188311p = z;
        this.f188312q = eVar;
        this.f188313r = transferQuoteSplit;
        this.f188314s = dVar7;
        this.f188315t = str;
        this.u = str2;
        this.v = aVar2;
        this.f188316w = transferAvailability;
        this.f188317x = withholdingTaxTreatmentConfiguration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f188302a, fVar.f188302a) && Intrinsics.f(this.f188303b, fVar.f188303b) && Intrinsics.f(this.f188304c, fVar.f188304c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f) && Double.compare(this.f188305g, fVar.f188305g) == 0 && this.f188306h == fVar.f188306h && Intrinsics.f(this.i, fVar.i) && Intrinsics.f(this.f188307j, fVar.f188307j) && Intrinsics.f(this.k, fVar.k) && Intrinsics.f(this.f188308l, fVar.f188308l) && Intrinsics.f(this.f188309m, fVar.f188309m) && Intrinsics.f(this.f188310n, fVar.f188310n) && Intrinsics.f(this.o, fVar.o) && this.f188311p == fVar.f188311p && Intrinsics.f(this.f188312q, fVar.f188312q) && Intrinsics.f(this.f188313r, fVar.f188313r) && Intrinsics.f(this.f188314s, fVar.f188314s) && Intrinsics.f(this.f188315t, fVar.f188315t) && Intrinsics.f(this.u, fVar.u) && Intrinsics.f(this.v, fVar.v) && Intrinsics.f(this.f188316w, fVar.f188316w) && Intrinsics.f(this.f188317x, fVar.f188317x);
    }

    public final int hashCode() {
        int iC = v7.c(v7.c(this.f188302a.hashCode() * 31, 31, this.f188303b), 31, this.f188304c);
        dj0.d dVar = this.d;
        int iHashCode = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
        dj0.d dVar2 = this.e;
        int iC2 = a0.d.c(m72.b.c(v7.c((iHashCode + (dVar2 == null ? 0 : dVar2.hashCode())) * 31, 31, this.f), this.f188305g, 31), 31, this.f188306h);
        d dVar3 = this.i;
        int iHashCode2 = (iC2 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
        d dVar4 = this.f188307j;
        int iHashCode3 = (iHashCode2 + (dVar4 == null ? 0 : dVar4.hashCode())) * 31;
        d dVar5 = this.k;
        int iHashCode4 = (iHashCode3 + (dVar5 == null ? 0 : dVar5.hashCode())) * 31;
        d dVar6 = this.f188308l;
        int iHashCode5 = (iHashCode4 + (dVar6 == null ? 0 : dVar6.hashCode())) * 31;
        List list = this.f188309m;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        z3l.a aVar = this.f188310n;
        int iHashCode7 = (iHashCode6 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        CreditCardInterest creditCardInterest = this.o;
        int iC3 = j6.a.c((iHashCode7 + (creditCardInterest == null ? 0 : creditCardInterest.hashCode())) * 31, 31, this.f188311p);
        nrf.e eVar = this.f188312q;
        int iHashCode8 = (iC3 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        TransferQuoteSplit transferQuoteSplit = this.f188313r;
        int iHashCode9 = (iHashCode8 + (transferQuoteSplit == null ? 0 : transferQuoteSplit.f92287a.hashCode())) * 31;
        dj0.d dVar7 = this.f188314s;
        int iHashCode10 = (iHashCode9 + (dVar7 == null ? 0 : dVar7.hashCode())) * 31;
        String str = this.f188315t;
        int iHashCode11 = (iHashCode10 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.u;
        int iHashCode12 = (iHashCode11 + (str2 == null ? 0 : str2.hashCode())) * 31;
        z3l.a aVar2 = this.v;
        int iHashCode13 = (iHashCode12 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        TransferAvailability transferAvailability = this.f188316w;
        int iHashCode14 = (iHashCode13 + (transferAvailability == null ? 0 : transferAvailability.hashCode())) * 31;
        WithholdingTaxTreatmentConfiguration withholdingTaxTreatmentConfiguration = this.f188317x;
        return iHashCode14 + (withholdingTaxTreatmentConfiguration != null ? withholdingTaxTreatmentConfiguration.hashCode() : 0);
    }
}
