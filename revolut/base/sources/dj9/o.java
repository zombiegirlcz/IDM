package dj9;

import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0001JJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\u0004R\u001a\u0010\u001f\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010!\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b \u0010\u001eR\u001a\u0010#\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b\u0005\u0010\u001eR\u001a\u0010&\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\u001eR\u001a\u0010(\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b'\u0010\u001eR\u001c\u0010,\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010-\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b\u0014\u0010\u001eR\u001a\u0010.\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001a\u00101\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\u0006\u001a\u0004\b0\u0010\u0004R\u001a\u00107\u001a\u0002028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001a\u00108\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b\u001b\u0010\u0004R\u001a\u00109\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b3\u0010\u0004R\u001a\u0010;\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010<\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u0006\u001a\u0004\b\"\u0010\u0004R\u001a\u0010A\u001a\u00020=8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010B\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010\u001c\u001a\u0004\b/\u0010\u001eR\u001c\u0010C\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010G\u001a\u0004\u0018\u00010D8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010E\u001a\u0004\b:\u0010FR\u001c\u0010I\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0006\u001a\u0004\bH\u0010\u0004R\u001a\u0010M\u001a\u00020J8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010K\u001a\u0004\b\u0017\u0010LR \u0010R\u001a\b\u0012\u0004\u0012\u00020O0N8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010P\u001a\u0004\b$\u0010Q¨\u0006S"}, d2 = {"Ldj9/o;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "i", "id", "b", "e", "facilityId", "c", "y", "transactionId", "d", "o", "merchantName", "n", "merchantLogoUrl", "f", "m", "merchantLogoName", "g", "l", "merchantCategory", "", "h", "J", "v", "()J", "startDateTime", "z", "updateDateTime", "j", "amount", "k", "r", "paidAmount", "s", "remainingAmount", "Ljava/lang/Long;", "u", "()Ljava/lang/Long;", "revPoints", "fee", "currency", "p", "w", "state", "", "q", "Z", "B", "()Z", "isLimitWithdrawn", "feeType", "origin", "t", "countryCode", "instalmentType", "Ljava/math/BigDecimal;", "Ljava/math/BigDecimal;", "x", "()Ljava/math/BigDecimal;", "termFeeRate", "minFeeAmount", "cancellationOrigin", "", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "rescheduleCount", "A", "withdrawalTransactionId", "Ldj9/n;", "Ldj9/n;", "()Ldj9/n;", "feeDetails", "", "Ldj9/e;", "Ljava/util/List;", "()Ljava/util/List;", "instalments", "feature_pay_later_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class o {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @lg.b("lateFeeDetail")
    @NotNull
    private final n feeDetails;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @lg.b("instalments")
    @NotNull
    private final List<e> instalments;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("facilityId")
    @NotNull
    private final String facilityId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("transactionId")
    @NotNull
    private final String transactionId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("merchantName")
    private final String merchantName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("merchantLogoUrl")
    private final String merchantLogoUrl;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("merchantLogoName")
    private final String merchantLogoName;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("merchantCategory")
    private final String merchantCategory;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("startDateTime")
    private final long startDateTime;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("updateDateTime")
    private final long updateDateTime;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    private final long amount;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("paidAmount")
    private final long paidAmount;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("remainingAmount")
    private final long remainingAmount;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("revPoints")
    private final Long revPoints;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("fee")
    private final long fee;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("currency")
    @NotNull
    private final String currency;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("isCreditLimitWithdrawn")
    private final boolean isLimitWithdrawn;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("feeType")
    @NotNull
    private final String feeType;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("origin")
    @NotNull
    private final String origin;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("countryCode")
    @NotNull
    private final String countryCode;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("instalmentType")
    @NotNull
    private final String instalmentType;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("termFeeRate")
    @NotNull
    private final BigDecimal termFeeRate;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @lg.b("minFeeAmount")
    private final long minFeeAmount;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @lg.b("cancellationOrigin")
    private final String cancellationOrigin;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @lg.b("rescheduleCount")
    private final Integer rescheduleCount;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @lg.b("withdrawalTransactionId")
    private final String withdrawalTransactionId;

    /* JADX INFO: renamed from: A, reason: from getter */
    public final String getWithdrawalTransactionId() {
        return this.withdrawalTransactionId;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final boolean getIsLimitWithdrawn() {
        return this.isLimitWithdrawn;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCancellationOrigin() {
        return this.cancellationOrigin;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getFacilityId() {
        return this.facilityId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.id, oVar.id) && Intrinsics.f(this.facilityId, oVar.facilityId) && Intrinsics.f(this.transactionId, oVar.transactionId) && Intrinsics.f(this.merchantName, oVar.merchantName) && Intrinsics.f(this.merchantLogoUrl, oVar.merchantLogoUrl) && Intrinsics.f(this.merchantLogoName, oVar.merchantLogoName) && Intrinsics.f(this.merchantCategory, oVar.merchantCategory) && this.startDateTime == oVar.startDateTime && this.updateDateTime == oVar.updateDateTime && this.amount == oVar.amount && this.paidAmount == oVar.paidAmount && this.remainingAmount == oVar.remainingAmount && Intrinsics.f(this.revPoints, oVar.revPoints) && this.fee == oVar.fee && Intrinsics.f(this.currency, oVar.currency) && Intrinsics.f(this.state, oVar.state) && this.isLimitWithdrawn == oVar.isLimitWithdrawn && Intrinsics.f(this.feeType, oVar.feeType) && Intrinsics.f(this.origin, oVar.origin) && Intrinsics.f(this.countryCode, oVar.countryCode) && Intrinsics.f(this.instalmentType, oVar.instalmentType) && Intrinsics.f(this.termFeeRate, oVar.termFeeRate) && this.minFeeAmount == oVar.minFeeAmount && Intrinsics.f(this.cancellationOrigin, oVar.cancellationOrigin) && Intrinsics.f(this.rescheduleCount, oVar.rescheduleCount) && Intrinsics.f(this.withdrawalTransactionId, oVar.withdrawalTransactionId) && Intrinsics.f(this.feeDetails, oVar.feeDetails) && Intrinsics.f(this.instalments, oVar.instalments);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getFee() {
        return this.fee;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final n getFeeDetails() {
        return this.feeDetails;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getFeeType() {
        return this.feeType;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.facilityId), 31, this.transactionId);
        String str = this.merchantName;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.merchantLogoUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.merchantLogoName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.merchantCategory;
        int iC2 = a0.d.c(a0.d.c(a0.d.c(a0.d.c(a0.d.c((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.startDateTime), 31, this.updateDateTime), 31, this.amount), 31, this.paidAmount), 31, this.remainingAmount);
        Long l2 = this.revPoints;
        int iC3 = a0.d.c(t61.a.d(this.termFeeRate, p.a.c(p.a.c(p.a.c(p.a.c(j6.a.c(p.a.c(p.a.c(a0.d.c((iC2 + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.fee), 31, this.currency), 31, this.state), 31, this.isLimitWithdrawn), 31, this.feeType), 31, this.origin), 31, this.countryCode), 31, this.instalmentType), 31), 31, this.minFeeAmount);
        String str5 = this.cancellationOrigin;
        int iHashCode4 = (iC3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.rescheduleCount;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.withdrawalTransactionId;
        return this.instalments.hashCode() + ((this.feeDetails.hashCode() + ((iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getInstalmentType() {
        return this.instalmentType;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final List getInstalments() {
        return this.instalments;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getMerchantCategory() {
        return this.merchantCategory;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getMerchantLogoName() {
        return this.merchantLogoName;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getMerchantLogoUrl() {
        return this.merchantLogoUrl;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getMerchantName() {
        return this.merchantName;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final long getMinFeeAmount() {
        return this.minFeeAmount;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getOrigin() {
        return this.origin;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final long getPaidAmount() {
        return this.paidAmount;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final long getRemainingAmount() {
        return this.remainingAmount;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final Integer getRescheduleCount() {
        return this.rescheduleCount;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final Long getRevPoints() {
        return this.revPoints;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final long getStartDateTime() {
        return this.startDateTime;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final BigDecimal getTermFeeRate() {
        return this.termFeeRate;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final long getUpdateDateTime() {
        return this.updateDateTime;
    }
}
