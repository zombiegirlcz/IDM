package zek;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0013\u0010\u0017R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u001b\u0010\u0004R\u001a\u0010\u001d\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u0019\u0010\u0004R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0011\u001a\u0004\b\u001e\u0010\u0004¨\u0006 "}, d2 = {"Lzek/b0;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "e", "()J", "fee", "Lzek/f;", "b", "Lzek/f;", "()Lzek/f;", "charge", "c", "Ljava/lang/String;", "currency", "d", "duration", "Ljava/lang/Long;", "g", "()Ljava/lang/Long;", "startDate", "f", "endDate", "h", "termsUrl", "postDiscountOption", "i", "type", "feature_retail_pricing_plans_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("fee")
    private final long fee;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("charge")
    private final f charge;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("currency")
    @NotNull
    private final String currency;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("duration")
    private final String duration;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("startDate")
    private final Long startDate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("endDate")
    private final Long endDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("termsUrl")
    private final String termsUrl;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("postDiscountOption")
    @NotNull
    private final String postDiscountOption;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("type")
    private final String type;

    public b0(long j2, f fVar, String currency, String str, Long l2, Long l3, String str2, String postDiscountOption, String str3) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(postDiscountOption, "postDiscountOption");
        this.fee = j2;
        this.charge = fVar;
        this.currency = currency;
        this.duration = str;
        this.startDate = l2;
        this.endDate = l3;
        this.termsUrl = str2;
        this.postDiscountOption = postDiscountOption;
        this.type = str3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final f getCharge() {
        return this.charge;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getEndDate() {
        return this.endDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getFee() {
        return this.fee;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return this.fee == b0Var.fee && Intrinsics.f(this.charge, b0Var.charge) && Intrinsics.f(this.currency, b0Var.currency) && Intrinsics.f(this.duration, b0Var.duration) && Intrinsics.f(this.startDate, b0Var.startDate) && Intrinsics.f(this.endDate, b0Var.endDate) && Intrinsics.f(this.termsUrl, b0Var.termsUrl) && Intrinsics.f(this.postDiscountOption, b0Var.postDiscountOption) && Intrinsics.f(this.type, b0Var.type);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPostDiscountOption() {
        return this.postDiscountOption;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Long getStartDate() {
        return this.startDate;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTermsUrl() {
        return this.termsUrl;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.fee) * 31;
        f fVar = this.charge;
        int iC = p.a.c((iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31, 31, this.currency);
        String str = this.duration;
        int iHashCode2 = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.startDate;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.endDate;
        int iHashCode4 = (iHashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str2 = this.termsUrl;
        int iC2 = p.a.c((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.postDiscountOption);
        String str3 = this.type;
        return iC2 + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
