package dj9;

import ip0.v7;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\t\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b\u0010\u0010\u001cR\u001a\u0010!\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001f\u001a\u0004\b\u000b\u0010 ¨\u0006\""}, d2 = {"Ldj9/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "pocketId", "b", "accountVariant", "c", "balanceState", "d", "countryCode", "Ljo3/a;", "e", "Ljo3/a;", "g", "()Ljo3/a;", "totalToRepay", "Ldj9/a$b;", "Ldj9/a$b;", "h", "()Ldj9/a$b;", "userToggleConfig", "Ldj9/a$a;", "Ldj9/a$a;", "()Ldj9/a$a;", "merchantCheckoutConfig", "", "Z", "()Z", "cancellable", "feature_pay_later_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("pocketId")
    @NotNull
    private final String pocketId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("accountVariant")
    private final String accountVariant;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("balanceState")
    @NotNull
    private final String balanceState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("countryCode")
    @NotNull
    private final String countryCode;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("totalToRepay")
    @NotNull
    private final jo3.a totalToRepay;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("userToggleConfig")
    private final b userToggleConfig;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("merchantCheckoutConfig")
    private final C0683a merchantCheckoutConfig;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("cancellable")
    private final boolean cancellable;

    /* JADX INFO: renamed from: dj9.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Ldj9/a$a;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "()Ljo3/a;", "totalToRepay", "feature_pay_later_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C0683a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("totalToRepay")
        @NotNull
        private final jo3.a totalToRepay;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final jo3.a getTotalToRepay() {
            return this.totalToRepay;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof C0683a) && Intrinsics.f(this.totalToRepay, ((C0683a) obj2).totalToRepay);
        }

        public final int hashCode() {
            return this.totalToRepay.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0005\u0010\rR\u001a\u0010\u0013\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\rR\u001a\u0010\u0017\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\n\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u0018\u0010\u0016R\u001a\u0010\u001f\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\"\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0015\u001a\u0004\b!\u0010\u0016R\u001a\u0010#\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b\u001b\u0010\u001eR\u001a\u0010%\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b$\u0010\u0016R\u001a\u0010'\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0015\u001a\u0004\b&\u0010\u0016R\u001c\u0010)\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010,\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u0006\u001a\u0004\b+\u0010\u0004R\u001a\u0010-\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010.\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b*\u0010\u001eR\u001c\u0010/\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0006\u001a\u0004\b(\u0010\u0004R\u001c\u00100\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b \u0010\u0004¨\u00061"}, d2 = {"Ldj9/a$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "facilityId", "Ljava/math/BigDecimal;", "b", "Ljava/math/BigDecimal;", "f", "()Ljava/math/BigDecimal;", "feeRate", "c", "aprRate", "d", "i", "lateInterestRate", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "availableToSpend", "j", "maxPurchaseAmount", "", "g", "Z", "q", "()Z", "isCardIssueAvailable", "h", "k", "minFeeAmount", "hasUpfrontPayment", "p", "totalToRepay", "o", "totalCreditLimit", "l", "deactivationReason", "m", "n", "terminationDate", "creditLimitState", "showTotalToRepayInHeader", "preferredInstalmentType", "homeScreenType", "feature_pay_later_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("facilityId")
        @NotNull
        private final String facilityId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("feeRate")
        @NotNull
        private final BigDecimal feeRate;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("apr")
        @NotNull
        private final BigDecimal aprRate;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("lateInterestRate")
        @NotNull
        private final BigDecimal lateInterestRate;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("availableToSpend")
        @NotNull
        private final jo3.a availableToSpend;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("maxPurchaseAmount")
        @NotNull
        private final jo3.a maxPurchaseAmount;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("isCardIssueAvailable")
        private final boolean isCardIssueAvailable;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @lg.b("minFeeAmount")
        @NotNull
        private final jo3.a minFeeAmount;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @lg.b("hasUpfrontPayment")
        private final boolean hasUpfrontPayment;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @lg.b("totalToRepay")
        @NotNull
        private final jo3.a totalToRepay;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @lg.b("totalCreditLimit")
        @NotNull
        private final jo3.a totalCreditLimit;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        @lg.b("deactivationReason")
        private final String deactivationReason;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        @lg.b("terminationDate")
        private final String terminationDate;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        @lg.b("creditLimitState")
        @NotNull
        private final String creditLimitState;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        @lg.b("showTotalToRepayInHeader")
        private final boolean showTotalToRepayInHeader;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        @lg.b("preferredInstalmentType")
        private final String preferredInstalmentType;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        @lg.b("homeScreenType")
        private final String homeScreenType;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BigDecimal getAprRate() {
            return this.aprRate;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final jo3.a getAvailableToSpend() {
            return this.availableToSpend;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getCreditLimitState() {
            return this.creditLimitState;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getDeactivationReason() {
            return this.deactivationReason;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getFacilityId() {
            return this.facilityId;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.facilityId, bVar.facilityId) && Intrinsics.f(this.feeRate, bVar.feeRate) && Intrinsics.f(this.aprRate, bVar.aprRate) && Intrinsics.f(this.lateInterestRate, bVar.lateInterestRate) && Intrinsics.f(this.availableToSpend, bVar.availableToSpend) && Intrinsics.f(this.maxPurchaseAmount, bVar.maxPurchaseAmount) && this.isCardIssueAvailable == bVar.isCardIssueAvailable && Intrinsics.f(this.minFeeAmount, bVar.minFeeAmount) && this.hasUpfrontPayment == bVar.hasUpfrontPayment && Intrinsics.f(this.totalToRepay, bVar.totalToRepay) && Intrinsics.f(this.totalCreditLimit, bVar.totalCreditLimit) && Intrinsics.f(this.deactivationReason, bVar.deactivationReason) && Intrinsics.f(this.terminationDate, bVar.terminationDate) && Intrinsics.f(this.creditLimitState, bVar.creditLimitState) && this.showTotalToRepayInHeader == bVar.showTotalToRepayInHeader && Intrinsics.f(this.preferredInstalmentType, bVar.preferredInstalmentType) && Intrinsics.f(this.homeScreenType, bVar.homeScreenType);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final BigDecimal getFeeRate() {
            return this.feeRate;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getHasUpfrontPayment() {
            return this.hasUpfrontPayment;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getHomeScreenType() {
            return this.homeScreenType;
        }

        public final int hashCode() {
            int iJ = v7.j(this.totalCreditLimit, v7.j(this.totalToRepay, j6.a.c(v7.j(this.minFeeAmount, j6.a.c(v7.j(this.maxPurchaseAmount, v7.j(this.availableToSpend, t61.a.d(this.lateInterestRate, t61.a.d(this.aprRate, t61.a.d(this.feeRate, this.facilityId.hashCode() * 31, 31), 31), 31), 31), 31), 31, this.isCardIssueAvailable), 31), 31, this.hasUpfrontPayment), 31), 31);
            String str = this.deactivationReason;
            int iHashCode = (iJ + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.terminationDate;
            int iC = j6.a.c(p.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.creditLimitState), 31, this.showTotalToRepayInHeader);
            String str3 = this.preferredInstalmentType;
            int iHashCode2 = (iC + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.homeScreenType;
            return iHashCode2 + (str4 != null ? str4.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final BigDecimal getLateInterestRate() {
            return this.lateInterestRate;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final jo3.a getMaxPurchaseAmount() {
            return this.maxPurchaseAmount;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final jo3.a getMinFeeAmount() {
            return this.minFeeAmount;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final String getPreferredInstalmentType() {
            return this.preferredInstalmentType;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final boolean getShowTotalToRepayInHeader() {
            return this.showTotalToRepayInHeader;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final String getTerminationDate() {
            return this.terminationDate;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final jo3.a getTotalCreditLimit() {
            return this.totalCreditLimit;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final jo3.a getTotalToRepay() {
            return this.totalToRepay;
        }

        /* JADX INFO: renamed from: q, reason: from getter */
        public final boolean getIsCardIssueAvailable() {
            return this.isCardIssueAvailable;
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAccountVariant() {
        return this.accountVariant;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBalanceState() {
        return this.balanceState;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getCancellable() {
        return this.cancellable;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C0683a getMerchantCheckoutConfig() {
        return this.merchantCheckoutConfig;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.pocketId, aVar.pocketId) && Intrinsics.f(this.accountVariant, aVar.accountVariant) && Intrinsics.f(this.balanceState, aVar.balanceState) && Intrinsics.f(this.countryCode, aVar.countryCode) && Intrinsics.f(this.totalToRepay, aVar.totalToRepay) && Intrinsics.f(this.userToggleConfig, aVar.userToggleConfig) && Intrinsics.f(this.merchantCheckoutConfig, aVar.merchantCheckoutConfig) && this.cancellable == aVar.cancellable;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPocketId() {
        return this.pocketId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final jo3.a getTotalToRepay() {
        return this.totalToRepay;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final b getUserToggleConfig() {
        return this.userToggleConfig;
    }

    public final int hashCode() {
        int iHashCode = this.pocketId.hashCode() * 31;
        String str = this.accountVariant;
        int iJ = v7.j(this.totalToRepay, p.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.balanceState), 31, this.countryCode), 31);
        b bVar = this.userToggleConfig;
        int iHashCode2 = (iJ + (bVar == null ? 0 : bVar.hashCode())) * 31;
        C0683a c0683a = this.merchantCheckoutConfig;
        return Boolean.hashCode(this.cancellable) + ((iHashCode2 + (c0683a != null ? c0683a.hashCode() : 0)) * 31);
    }
}
