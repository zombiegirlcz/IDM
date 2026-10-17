package zek;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\t\u0010\u0014R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\r\u0010\u0018R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u001c\u0010 \u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u001f\u0010\u0010R\u001c\u0010$\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\"\u001a\u0004\b\u0005\u0010#¨\u0006%"}, d2 = {"Lzek/l;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "g", "period", "b", "e", "fixedTermPeriod", "Ljo3/b;", "c", "Ljo3/b;", "d", "()Ljo3/b;", "fee", "Lzek/f;", "Lzek/f;", "()Lzek/f;", "charge", "Lzek/l$a;", "Lzek/l$a;", "()Lzek/l$a;", "discount", "Lzek/i;", "f", "Lzek/i;", "()Lzek/i;", "freeTrial", "h", "reward", "Lzek/b;", "Lzek/b;", "()Lzek/b;", "cashbackBoostCampaign", "feature_retail_pricing_plans_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("period")
    @NotNull
    private final String period;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("fixedTermPeriod")
    private final String fixedTermPeriod;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("fee")
    @NotNull
    private final jo3.b fee;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("charge")
    private final f charge;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("discount")
    private final a discount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("freeTrial")
    private final i freeTrial;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("reward")
    private final jo3.b reward;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("cashbackBoostCampaign")
    private final b cashbackBoostCampaign;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0010\u0010\u0019R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u0004R\u001a\u0010\u001e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001b\u0010\u0004¨\u0006\u001f"}, d2 = {"Lzek/l$a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "d", "()J", "fee", "Lzek/f;", "b", "Lzek/f;", "()Lzek/f;", "charge", "c", "Ljava/lang/String;", "currency", "", "Ljava/lang/Integer;", "e", "()Ljava/lang/Integer;", "periodsCount", "Ljava/lang/Long;", "()Ljava/lang/Long;", "endDate", "f", "g", "termsUrl", "postDiscountOption", "feature_retail_pricing_plans_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

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
        @lg.b("periodsCount")
        private final Integer periodsCount;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("endDate")
        private final Long endDate;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("termsUrl")
        private final String termsUrl;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("postDiscountOption")
        @NotNull
        private final String postDiscountOption;

        public a(long j2, f fVar, String currency, Integer num, Long l2, String str, String postDiscountOption) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(postDiscountOption, "postDiscountOption");
            this.fee = j2;
            this.charge = fVar;
            this.currency = currency;
            this.periodsCount = num;
            this.endDate = l2;
            this.termsUrl = str;
            this.postDiscountOption = postDiscountOption;
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
        public final Long getEndDate() {
            return this.endDate;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final long getFee() {
            return this.fee;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Integer getPeriodsCount() {
            return this.periodsCount;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return this.fee == aVar.fee && Intrinsics.f(this.charge, aVar.charge) && Intrinsics.f(this.currency, aVar.currency) && Intrinsics.f(this.periodsCount, aVar.periodsCount) && Intrinsics.f(this.endDate, aVar.endDate) && Intrinsics.f(this.termsUrl, aVar.termsUrl) && Intrinsics.f(this.postDiscountOption, aVar.postDiscountOption);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getPostDiscountOption() {
            return this.postDiscountOption;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getTermsUrl() {
            return this.termsUrl;
        }

        public final int hashCode() {
            int iHashCode = Long.hashCode(this.fee) * 31;
            f fVar = this.charge;
            int iC = p.a.c((iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31, 31, this.currency);
            Integer num = this.periodsCount;
            int iHashCode2 = (iC + (num == null ? 0 : num.hashCode())) * 31;
            Long l2 = this.endDate;
            int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
            String str = this.termsUrl;
            return this.postDiscountOption.hashCode() + ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31);
        }
    }

    public l(String period, String str, jo3.b fee2, f fVar, a aVar, i iVar, jo3.b bVar, b bVar2) {
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(fee2, "fee");
        this.period = period;
        this.fixedTermPeriod = str;
        this.fee = fee2;
        this.charge = fVar;
        this.discount = aVar;
        this.freeTrial = iVar;
        this.reward = bVar;
        this.cashbackBoostCampaign = bVar2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getCashbackBoostCampaign() {
        return this.cashbackBoostCampaign;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final f getCharge() {
        return this.charge;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a getDiscount() {
        return this.discount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.b getFee() {
        return this.fee;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getFixedTermPeriod() {
        return this.fixedTermPeriod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.period, lVar.period) && Intrinsics.f(this.fixedTermPeriod, lVar.fixedTermPeriod) && Intrinsics.f(this.fee, lVar.fee) && Intrinsics.f(this.charge, lVar.charge) && Intrinsics.f(this.discount, lVar.discount) && Intrinsics.f(this.freeTrial, lVar.freeTrial) && Intrinsics.f(this.reward, lVar.reward) && Intrinsics.f(this.cashbackBoostCampaign, lVar.cashbackBoostCampaign);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final i getFreeTrial() {
        return this.freeTrial;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getPeriod() {
        return this.period;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final jo3.b getReward() {
        return this.reward;
    }

    public final int hashCode() {
        int iHashCode = this.period.hashCode() * 31;
        String str = this.fixedTermPeriod;
        int iE = wp5.y.e(this.fee, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        f fVar = this.charge;
        int iHashCode2 = (iE + (fVar == null ? 0 : fVar.hashCode())) * 31;
        a aVar = this.discount;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        i iVar = this.freeTrial;
        int iHashCode4 = (iHashCode3 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        jo3.b bVar = this.reward;
        int iHashCode5 = (iHashCode4 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        b bVar2 = this.cashbackBoostCampaign;
        return iHashCode5 + (bVar2 != null ? bVar2.hashCode() : 0);
    }
}
