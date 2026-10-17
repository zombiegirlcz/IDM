package nrf;

import com.revolut.feature.transfer.models.quotes.CreditCardInterest;
import com.revolut.feature.transfer.models.quotes.TransferAvailability;
import com.revolut.feature.transfer.models.quotes.TransferQuoteSplit;
import com.revolut.feature.transfer.models.withholding_tax.WithholdingTaxTreatmentConfiguration;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lrf.a f218622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f218623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f218624c;
    public final g d;
    public final e e;
    public final TransferQuoteSplit f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CreditCardInterest f218625g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TransferAvailability f218626h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f218627j;
    public final WithholdingTaxTreatmentConfiguration k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final dj0.d f218628l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f218629m;

    public c(lrf.a rate, dj0.d recipientAmount, dj0.d billAmount, g gVar, e charges, TransferQuoteSplit transferQuoteSplit, CreditCardInterest creditCardInterest, TransferAvailability transferAvailability, String str, String str2, WithholdingTaxTreatmentConfiguration withholdingTaxTreatmentConfiguration) {
        Intrinsics.checkNotNullParameter(rate, "rate");
        Intrinsics.checkNotNullParameter(recipientAmount, "recipientAmount");
        Intrinsics.checkNotNullParameter(billAmount, "billAmount");
        Intrinsics.checkNotNullParameter(charges, "charges");
        this.f218622a = rate;
        this.f218623b = recipientAmount;
        this.f218624c = billAmount;
        this.d = gVar;
        this.e = charges;
        this.f = transferQuoteSplit;
        this.f218625g = creditCardInterest;
        this.f218626h = transferAvailability;
        this.i = str;
        this.f218627j = str2;
        this.k = withholdingTaxTreatmentConfiguration;
        this.f218628l = new dj0.d(billAmount.f115082a + charges.f218633a.f115082a, billAmount.f115083b);
        this.f218629m = !r3.k();
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f218622a, cVar.f218622a) && Intrinsics.f(this.f218623b, cVar.f218623b) && Intrinsics.f(this.f218624c, cVar.f218624c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f218625g, cVar.f218625g) && Intrinsics.f(this.f218626h, cVar.f218626h) && Intrinsics.f(this.i, cVar.i) && Intrinsics.f(this.f218627j, cVar.f218627j) && Intrinsics.f(this.k, cVar.k);
    }

    public final int hashCode() {
        int iC = v7.c(v7.c(this.f218622a.hashCode() * 31, 31, this.f218623b), 31, this.f218624c);
        g gVar = this.d;
        int iHashCode = (this.e.hashCode() + ((iC + (gVar == null ? 0 : gVar.hashCode())) * 31)) * 31;
        TransferQuoteSplit transferQuoteSplit = this.f;
        int iHashCode2 = (iHashCode + (transferQuoteSplit == null ? 0 : transferQuoteSplit.f92287a.hashCode())) * 31;
        CreditCardInterest creditCardInterest = this.f218625g;
        int iHashCode3 = (iHashCode2 + (creditCardInterest == null ? 0 : creditCardInterest.hashCode())) * 31;
        TransferAvailability transferAvailability = this.f218626h;
        int iHashCode4 = (iHashCode3 + (transferAvailability == null ? 0 : transferAvailability.hashCode())) * 31;
        String str = this.i;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f218627j;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        WithholdingTaxTreatmentConfiguration withholdingTaxTreatmentConfiguration = this.k;
        return iHashCode6 + (withholdingTaxTreatmentConfiguration != null ? withholdingTaxTreatmentConfiguration.hashCode() : 0);
    }
}
