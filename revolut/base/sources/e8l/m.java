package e8l;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\u0019\u0010\u0011R\u001a\u0010\u001f\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0006\u001a\u0004\b!\u0010\u0004R\u001a\u0010(\u001a\u00020#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010-\u001a\u00020)8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b\u000e\u0010,R\"\u00104\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001c\u00109\u001a\u0004\u0018\u0001058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u00106\u001a\u0004\b7\u00108R\u001c\u0010=\u001a\u0004\u0018\u00010:8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010;\u001a\u0004\b\t\u0010<R\u001c\u0010B\u001a\u0004\u0018\u00010>8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010?\u001a\u0004\b@\u0010AR\u001c\u0010F\u001a\u0004\u0018\u00010C8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010D\u001a\u0004\b\u0013\u0010ER\u001c\u0010H\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010\u0006\u001a\u0004\bG\u0010\u0004R\u001c\u0010N\u001a\u0004\u0018\u00010I8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001c\u0010O\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010P\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u000f\u001a\u0004\b*\u0010\u0011R\u001c\u0010Q\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b$\u0010\u0011R\u001c\u0010R\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b \u0010\u0011R\u001c\u0010V\u001a\u0004\u0018\u00010S8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010T\u001a\u0004\bJ\u0010UR\u001c\u0010Z\u001a\u0004\u0018\u00010W8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bL\u0010X\u001a\u0004\b0\u0010Y¨\u0006["}, d2 = {"Le8l/m;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "n", "orderType", "b", "amountRequestedIn", "c", "baseRateAsset", "Le8l/a;", "d", "Le8l/a;", "g", "()Le8l/a;", "fromAmount", "e", "u", "toAmount", "f", "h", "fromAmountAfterCharges", "v", "toAmountAfterCharges", "", "J", "t", "()J", "timestamp", "i", "s", "targetRate", "Le8l/u;", "j", "Le8l/u;", "o", "()Le8l/u;", "rate", "Le8l/e;", "k", "Le8l/e;", "()Le8l/e;", "charges", "", "Le8l/j;", "l", "Ljava/util/List;", "m", "()Ljava/util/List;", "limits", "Le8l/v;", "Le8l/v;", "p", "()Le8l/v;", "settlementDelay", "Lorf/c;", "Lorf/c;", "()Lorf/c;", "availability", "Le8l/w;", "Le8l/w;", "w", "()Le8l/w;", "transferSplit", "Lorf/a;", "Lorf/a;", "()Lorf/a;", "creditCardInterest", "q", "signedQuote", "", "r", "Ljava/lang/Boolean;", "x", "()Ljava/lang/Boolean;", "isVolatile", "disclaimer", "fromAmountInBaseCurrency", "fromAmountAfterFeesInBaseCurrency", "fromAmountAfterChargesInBaseCurrency", "Le8l/t;", "Le8l/t;", "()Le8l/t;", "slippage", "Le8l/n;", "Le8l/n;", "()Le8l/n;", "lastTrade", "feature_shared_market_data_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("orderType")
    @NotNull
    private final String orderType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("amountRequestedIn")
    @NotNull
    private final String amountRequestedIn;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("baseRateAsset")
    @NotNull
    private final String baseRateAsset;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("fromAmount")
    @NotNull
    private final a fromAmount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("toAmount")
    @NotNull
    private final a toAmount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("fromAmountAfterCharges")
    private final a fromAmountAfterCharges;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("toAmountAfterCharges")
    private final a toAmountAfterCharges;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("timestamp")
    private final long timestamp;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("targetRate")
    private final String targetRate;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("rate")
    @NotNull
    private final u rate;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("charges")
    @NotNull
    private final e charges;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("limits")
    private final List<j> limits;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("settlementDelay")
    private final v settlementDelay;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("availability")
    private final orf.c availability;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("transferSplit")
    private final w transferSplit;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("creditCardInterest")
    private final orf.a creditCardInterest;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("signedQuote")
    private final String signedQuote;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("isVolatile")
    private final Boolean isVolatile;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("disclaimer")
    private final String disclaimer;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("fromAmountInBaseCurrency")
    private final a fromAmountInBaseCurrency;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("fromAmountAfterFeesInBaseCurrency")
    private final a fromAmountAfterFeesInBaseCurrency;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("fromAmountAfterChargesInBaseCurrency")
    private final a fromAmountAfterChargesInBaseCurrency;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @lg.b("slippage")
    private final t slippage;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @lg.b("lastTrade")
    private final n lastTrade;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAmountRequestedIn() {
        return this.amountRequestedIn;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final orf.c getAvailability() {
        return this.availability;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getBaseRateAsset() {
        return this.baseRateAsset;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final e getCharges() {
        return this.charges;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final orf.a getCreditCardInterest() {
        return this.creditCardInterest;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.orderType, mVar.orderType) && Intrinsics.f(this.amountRequestedIn, mVar.amountRequestedIn) && Intrinsics.f(this.baseRateAsset, mVar.baseRateAsset) && Intrinsics.f(this.fromAmount, mVar.fromAmount) && Intrinsics.f(this.toAmount, mVar.toAmount) && Intrinsics.f(this.fromAmountAfterCharges, mVar.fromAmountAfterCharges) && Intrinsics.f(this.toAmountAfterCharges, mVar.toAmountAfterCharges) && this.timestamp == mVar.timestamp && Intrinsics.f(this.targetRate, mVar.targetRate) && Intrinsics.f(this.rate, mVar.rate) && Intrinsics.f(this.charges, mVar.charges) && Intrinsics.f(this.limits, mVar.limits) && Intrinsics.f(this.settlementDelay, mVar.settlementDelay) && Intrinsics.f(this.availability, mVar.availability) && Intrinsics.f(this.transferSplit, mVar.transferSplit) && Intrinsics.f(this.creditCardInterest, mVar.creditCardInterest) && Intrinsics.f(this.signedQuote, mVar.signedQuote) && Intrinsics.f(this.isVolatile, mVar.isVolatile) && Intrinsics.f(this.disclaimer, mVar.disclaimer) && Intrinsics.f(this.fromAmountInBaseCurrency, mVar.fromAmountInBaseCurrency) && Intrinsics.f(this.fromAmountAfterFeesInBaseCurrency, mVar.fromAmountAfterFeesInBaseCurrency) && Intrinsics.f(this.fromAmountAfterChargesInBaseCurrency, mVar.fromAmountAfterChargesInBaseCurrency) && Intrinsics.f(this.slippage, mVar.slippage) && Intrinsics.f(this.lastTrade, mVar.lastTrade);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getDisclaimer() {
        return this.disclaimer;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final a getFromAmount() {
        return this.fromAmount;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final a getFromAmountAfterCharges() {
        return this.fromAmountAfterCharges;
    }

    public final int hashCode() {
        int iHashCode = (this.toAmount.hashCode() + ((this.fromAmount.hashCode() + p.a.c(p.a.c(this.orderType.hashCode() * 31, 31, this.amountRequestedIn), 31, this.baseRateAsset)) * 31)) * 31;
        a aVar = this.fromAmountAfterCharges;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        a aVar2 = this.toAmountAfterCharges;
        int iC = a0.d.c((iHashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31, 31, this.timestamp);
        String str = this.targetRate;
        int iHashCode3 = (this.charges.hashCode() + ((this.rate.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        List<j> list = this.limits;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        v vVar = this.settlementDelay;
        int iHashCode5 = (iHashCode4 + (vVar == null ? 0 : vVar.hashCode())) * 31;
        orf.c cVar = this.availability;
        int iHashCode6 = (iHashCode5 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        w wVar = this.transferSplit;
        int iHashCode7 = (iHashCode6 + (wVar == null ? 0 : wVar.hashCode())) * 31;
        orf.a aVar3 = this.creditCardInterest;
        int iHashCode8 = (iHashCode7 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        String str2 = this.signedQuote;
        int iHashCode9 = (iHashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isVolatile;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.disclaimer;
        int iHashCode11 = (iHashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        a aVar4 = this.fromAmountInBaseCurrency;
        int iHashCode12 = (iHashCode11 + (aVar4 == null ? 0 : aVar4.hashCode())) * 31;
        a aVar5 = this.fromAmountAfterFeesInBaseCurrency;
        int iHashCode13 = (iHashCode12 + (aVar5 == null ? 0 : aVar5.hashCode())) * 31;
        a aVar6 = this.fromAmountAfterChargesInBaseCurrency;
        int iHashCode14 = (iHashCode13 + (aVar6 == null ? 0 : aVar6.hashCode())) * 31;
        t tVar = this.slippage;
        int iHashCode15 = (iHashCode14 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        n nVar = this.lastTrade;
        return iHashCode15 + (nVar != null ? nVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final a getFromAmountAfterChargesInBaseCurrency() {
        return this.fromAmountAfterChargesInBaseCurrency;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final a getFromAmountAfterFeesInBaseCurrency() {
        return this.fromAmountAfterFeesInBaseCurrency;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final a getFromAmountInBaseCurrency() {
        return this.fromAmountInBaseCurrency;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final n getLastTrade() {
        return this.lastTrade;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final List getLimits() {
        return this.limits;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getOrderType() {
        return this.orderType;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final u getRate() {
        return this.rate;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final v getSettlementDelay() {
        return this.settlementDelay;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getSignedQuote() {
        return this.signedQuote;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final t getSlippage() {
        return this.slippage;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getTargetRate() {
        return this.targetRate;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final a getToAmount() {
        return this.toAmount;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final a getToAmountAfterCharges() {
        return this.toAmountAfterCharges;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final w getTransferSplit() {
        return this.transferSplit;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final Boolean getIsVolatile() {
        return this.isVolatile;
    }
}
