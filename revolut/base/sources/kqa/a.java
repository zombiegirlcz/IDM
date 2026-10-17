package kqa;

import com.revolut.feature.transfer.models.quotes.CreditCardInterest;
import com.revolut.feature.transfer.models.quotes.TransferAvailability;
import com.revolut.feature.transfer.models.quotes.TransferQuoteSplit;
import com.revolut.feature.transfer.models.withholding_tax.WithholdingTaxTreatmentConfiguration;
import dj0.d;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import nrf.e;
import pyd.c;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f188350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f188351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f188352c;
    public final d d;
    public final double e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f188353g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f188354h;
    public final e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TransferQuoteSplit f188355j;
    public final CreditCardInterest k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f188356l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TransferAvailability f188357m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f188358n;
    public final WithholdingTaxTreatmentConfiguration o;

    public a(d from, d to6, d fxFee, d fee2, double d, long j2, b transferLimits, boolean z, e eVar, TransferQuoteSplit transferQuoteSplit, CreditCardInterest creditCardInterest, String str, TransferAvailability transferAvailability, String str2, WithholdingTaxTreatmentConfiguration withholdingTaxTreatmentConfiguration) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        Intrinsics.checkNotNullParameter(fxFee, "fxFee");
        Intrinsics.checkNotNullParameter(fee2, "fee");
        Intrinsics.checkNotNullParameter(transferLimits, "transferLimits");
        this.f188350a = from;
        this.f188351b = to6;
        this.f188352c = fxFee;
        this.d = fee2;
        this.e = d;
        this.f = j2;
        this.f188353g = transferLimits;
        this.f188354h = z;
        this.i = eVar;
        this.f188355j = transferQuoteSplit;
        this.k = creditCardInterest;
        this.f188356l = str;
        this.f188357m = transferAvailability;
        this.f188358n = str2;
        this.o = withholdingTaxTreatmentConfiguration;
    }

    public final d a() {
        d dVarO = c.O(this.f188352c, this.d);
        e eVar = this.i;
        return c.O(dVarO, c.M(eVar != null ? x5d.b.i(eVar, nrf.a.TransferFtt) : null));
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f188350a, aVar.f188350a) && Intrinsics.f(this.f188351b, aVar.f188351b) && Intrinsics.f(this.f188352c, aVar.f188352c) && Intrinsics.f(this.d, aVar.d) && Double.compare(this.e, aVar.e) == 0 && this.f == aVar.f && Intrinsics.f(this.f188353g, aVar.f188353g) && this.f188354h == aVar.f188354h && Intrinsics.f(this.i, aVar.i) && Intrinsics.f(this.f188355j, aVar.f188355j) && Intrinsics.f(this.k, aVar.k) && Intrinsics.f(this.f188356l, aVar.f188356l) && Intrinsics.f(this.f188357m, aVar.f188357m) && Intrinsics.f(this.f188358n, aVar.f188358n) && Intrinsics.f(this.o, aVar.o);
    }

    public final int hashCode() {
        int iC = j6.a.c((this.f188353g.hashCode() + a0.d.c(m72.b.c(v7.c(v7.c(v7.c(this.f188350a.hashCode() * 31, 31, this.f188351b), 31, this.f188352c), 31, this.d), this.e, 31), 31, this.f)) * 31, 31, this.f188354h);
        e eVar = this.i;
        int iHashCode = (iC + (eVar == null ? 0 : eVar.hashCode())) * 31;
        TransferQuoteSplit transferQuoteSplit = this.f188355j;
        int iHashCode2 = (iHashCode + (transferQuoteSplit == null ? 0 : transferQuoteSplit.f92287a.hashCode())) * 31;
        CreditCardInterest creditCardInterest = this.k;
        int iHashCode3 = (iHashCode2 + (creditCardInterest == null ? 0 : creditCardInterest.hashCode())) * 31;
        String str = this.f188356l;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        TransferAvailability transferAvailability = this.f188357m;
        int iHashCode5 = (iHashCode4 + (transferAvailability == null ? 0 : transferAvailability.hashCode())) * 31;
        String str2 = this.f188358n;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        WithholdingTaxTreatmentConfiguration withholdingTaxTreatmentConfiguration = this.o;
        return iHashCode6 + (withholdingTaxTreatmentConfiguration != null ? withholdingTaxTreatmentConfiguration.hashCode() : 0);
    }
}
