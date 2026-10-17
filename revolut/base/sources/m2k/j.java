package m2k;

import ip0.v7;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u0012\u0010\tR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0007\u001a\u0004\b\u000e\u0010\tR\u001a\u0010\u0018\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0007\u001a\u0004\b\u0017\u0010\tR \u0010 \u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010&\u001a\u00020!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010+\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010-\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010(\u001a\u0004\b,\u0010*R\u001c\u0010.\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b\u001a\u0010*R\u001c\u0010/\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b\u0014\u0010*R\"\u00106\u001a\n\u0012\u0004\u0012\u000201\u0018\u0001008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001c\u0010;\u001a\u0004\u0018\u0001078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u00108\u001a\u0004\b9\u0010:R\u001c\u0010@\u001a\u0004\u0018\u00010<8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b\u0016\u0010?R\u001c\u0010D\u001a\u0004\u0018\u00010A8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010B\u001a\u0004\b2\u0010CR\u001c\u0010I\u001a\u0004\u0018\u00010E8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\b\u0011\u0010HR\u001c\u0010N\u001a\u0004\u0018\u00010J8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010K\u001a\u0004\bL\u0010MR\u001c\u0010O\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001c\u0010Q\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010P\u001a\u0004\b\"\u0010\u0004R\u001c\u0010R\u001a\u0004\u0018\u0001078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00108\u001a\u0004\bF\u0010:R\u001c\u0010V\u001a\u0004\u0018\u00010S8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010T\u001a\u0004\b\u000b\u0010UR\u001c\u0010Z\u001a\u0004\u0018\u00010W8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bL\u0010X\u001a\u0004\b=\u0010Y¨\u0006["}, d2 = {"Lm2k/j;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "l", "()Ljo3/a;", "from", "b", "s", "to", "c", "i", "exchangeFee", "d", "u", "transferFee", "e", "cashAdvanceFee", "f", "t", "totalFee", "", "g", "D", "n", "()D", "getRate$annotations", "()V", "rate", "", "h", "J", "r", "()J", "timestamp", "Lm2k/v;", "Lm2k/v;", "j", "()Lm2k/v;", "exchangeRareCurrencyFee", "k", "exchangeWeekendFee", "cryptoFee", "commodityFee", "", "Lm2k/y;", "m", "Ljava/util/List;", "v", "()Ljava/util/List;", "transferFeeOptions", "La4l/b;", "La4l/b;", "p", "()La4l/b;", "taxesDto", "Lorf/a;", "o", "Lorf/a;", "()Lorf/a;", "creditCardInterest", "Lm2k/w;", "Lm2k/w;", "()Lm2k/w;", "fxRate", "Lm2k/g;", "q", "Lm2k/g;", "()Lm2k/g;", "charges", "Lm2k/z;", "Lm2k/z;", "w", "()Lm2k/z;", "transferSplit", "amountWithoutCharges", "Ljava/lang/String;", "disclaimer", "taxesInTransactionCcy", "Lorf/c;", "Lorf/c;", "()Lorf/c;", "availability", "Lrrf/a;", "Lrrf/a;", "()Lrrf/a;", "taxTreatment", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("from")
    @NotNull
    private final jo3.a from;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("to")
    @NotNull
    private final jo3.a to;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("fxFee")
    @NotNull
    private final jo3.a exchangeFee;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("transferFee")
    private final jo3.a transferFee;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("cashAdvanceFee")
    private final jo3.a cashAdvanceFee;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("fee")
    @NotNull
    private final jo3.a totalFee;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("rate")
    private final double rate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("timestamp")
    private final long timestamp;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("fxRareCurrencyFee")
    private final v exchangeRareCurrencyFee;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("fxWeekendFee")
    private final v exchangeWeekendFee;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("cryptoFee")
    private final v cryptoFee;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("commodityFee")
    private final v commodityFee;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("transferFeeOptions")
    private final List<y> transferFeeOptions;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("taxes")
    private final a4l.b taxesDto;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("creditCardInterest")
    private final orf.a creditCardInterest;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("fxRate")
    private final w fxRate;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("charges")
    private final g charges;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("transferSplit")
    private final z transferSplit;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("amountWithoutCharges")
    private final jo3.a amountWithoutCharges;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("disclaimer")
    private final String disclaimer;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("taxesInTransactionCcy")
    private final a4l.b taxesInTransactionCcy;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("availability")
    private final orf.c availability;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @lg.b("taxTreatment")
    private final rrf.a taxTreatment;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getAmountWithoutCharges() {
        return this.amountWithoutCharges;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final orf.c getAvailability() {
        return this.availability;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.a getCashAdvanceFee() {
        return this.cashAdvanceFee;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final g getCharges() {
        return this.charges;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final v getCommodityFee() {
        return this.commodityFee;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.from, jVar.from) && Intrinsics.f(this.to, jVar.to) && Intrinsics.f(this.exchangeFee, jVar.exchangeFee) && Intrinsics.f(this.transferFee, jVar.transferFee) && Intrinsics.f(this.cashAdvanceFee, jVar.cashAdvanceFee) && Intrinsics.f(this.totalFee, jVar.totalFee) && Double.compare(this.rate, jVar.rate) == 0 && this.timestamp == jVar.timestamp && Intrinsics.f(this.exchangeRareCurrencyFee, jVar.exchangeRareCurrencyFee) && Intrinsics.f(this.exchangeWeekendFee, jVar.exchangeWeekendFee) && Intrinsics.f(this.cryptoFee, jVar.cryptoFee) && Intrinsics.f(this.commodityFee, jVar.commodityFee) && Intrinsics.f(this.transferFeeOptions, jVar.transferFeeOptions) && Intrinsics.f(this.taxesDto, jVar.taxesDto) && Intrinsics.f(this.creditCardInterest, jVar.creditCardInterest) && Intrinsics.f(this.fxRate, jVar.fxRate) && Intrinsics.f(this.charges, jVar.charges) && Intrinsics.f(this.transferSplit, jVar.transferSplit) && Intrinsics.f(this.amountWithoutCharges, jVar.amountWithoutCharges) && Intrinsics.f(this.disclaimer, jVar.disclaimer) && Intrinsics.f(this.taxesInTransactionCcy, jVar.taxesInTransactionCcy) && Intrinsics.f(this.availability, jVar.availability) && Intrinsics.f(this.taxTreatment, jVar.taxTreatment);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final orf.a getCreditCardInterest() {
        return this.creditCardInterest;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final v getCryptoFee() {
        return this.cryptoFee;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getDisclaimer() {
        return this.disclaimer;
    }

    public final int hashCode() {
        int iJ = v7.j(this.exchangeFee, v7.j(this.to, this.from.hashCode() * 31, 31), 31);
        jo3.a aVar = this.transferFee;
        int iHashCode = (iJ + (aVar == null ? 0 : aVar.hashCode())) * 31;
        jo3.a aVar2 = this.cashAdvanceFee;
        int iC = a0.d.c(m72.b.c(v7.j(this.totalFee, (iHashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31, 31), this.rate, 31), 31, this.timestamp);
        v vVar = this.exchangeRareCurrencyFee;
        int iHashCode2 = (iC + (vVar == null ? 0 : vVar.hashCode())) * 31;
        v vVar2 = this.exchangeWeekendFee;
        int iHashCode3 = (iHashCode2 + (vVar2 == null ? 0 : vVar2.hashCode())) * 31;
        v vVar3 = this.cryptoFee;
        int iHashCode4 = (iHashCode3 + (vVar3 == null ? 0 : vVar3.hashCode())) * 31;
        v vVar4 = this.commodityFee;
        int iHashCode5 = (iHashCode4 + (vVar4 == null ? 0 : vVar4.hashCode())) * 31;
        List<y> list = this.transferFeeOptions;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        a4l.b bVar = this.taxesDto;
        int iHashCode7 = (iHashCode6 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        orf.a aVar3 = this.creditCardInterest;
        int iHashCode8 = (iHashCode7 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        w wVar = this.fxRate;
        int iHashCode9 = (iHashCode8 + (wVar == null ? 0 : wVar.hashCode())) * 31;
        g gVar = this.charges;
        int iHashCode10 = (iHashCode9 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        z zVar = this.transferSplit;
        int iHashCode11 = (iHashCode10 + (zVar == null ? 0 : zVar.hashCode())) * 31;
        jo3.a aVar4 = this.amountWithoutCharges;
        int iHashCode12 = (iHashCode11 + (aVar4 == null ? 0 : aVar4.hashCode())) * 31;
        String str = this.disclaimer;
        int iHashCode13 = (iHashCode12 + (str == null ? 0 : str.hashCode())) * 31;
        a4l.b bVar2 = this.taxesInTransactionCcy;
        int iHashCode14 = (iHashCode13 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        orf.c cVar = this.availability;
        int iHashCode15 = (iHashCode14 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        rrf.a aVar5 = this.taxTreatment;
        return iHashCode15 + (aVar5 != null ? aVar5.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final jo3.a getExchangeFee() {
        return this.exchangeFee;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final v getExchangeRareCurrencyFee() {
        return this.exchangeRareCurrencyFee;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final v getExchangeWeekendFee() {
        return this.exchangeWeekendFee;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final jo3.a getFrom() {
        return this.from;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final w getFxRate() {
        return this.fxRate;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final double getRate() {
        return this.rate;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final rrf.a getTaxTreatment() {
        return this.taxTreatment;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final a4l.b getTaxesDto() {
        return this.taxesDto;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final a4l.b getTaxesInTransactionCcy() {
        return this.taxesInTransactionCcy;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final jo3.a getTo() {
        return this.to;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final jo3.a getTotalFee() {
        return this.totalFee;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final jo3.a getTransferFee() {
        return this.transferFee;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final List getTransferFeeOptions() {
        return this.transferFeeOptions;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final z getTransferSplit() {
        return this.transferSplit;
    }
}
