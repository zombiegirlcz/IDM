package lfk;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012¨\u0006\u0014"}, d2 = {"Llfk/g;", "", "", "toString", "()Ljava/lang/String;", "Llfk/a;", "a", "Llfk/a;", "()Llfk/a;", "family", "Lgfk/c;", "b", "Lgfk/c;", "c", "()Lgfk/c;", "refundAmountCharge", "Llfk/g$a;", "Llfk/g$a;", "()Llfk/g$a;", "offboarding", "feature_retail_pricing_plans_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("family")
    @NotNull
    private final lfk.a family;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("refundAmountCharge")
    private final gfk.c refundAmountCharge;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("offboarding")
    private final a offboarding;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004¨\u0006\u0011"}, d2 = {"Llfk/g$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "gracePeriod", "Lgfk/c;", "b", "Lgfk/c;", "c", "()Lgfk/c;", "newPlanCharge", "newPlanBillingPeriod", "d", "newPlanTier", "feature_retail_pricing_plans_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("gracePeriod")
        private final String gracePeriod;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("newPlanCharge")
        private final gfk.c newPlanCharge;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("newPlanBillingPeriod")
        private final String newPlanBillingPeriod;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("newPlanTier")
        private final String newPlanTier;

        public a(String str, gfk.c cVar, String str2, String str3) {
            this.gracePeriod = str;
            this.newPlanCharge = cVar;
            this.newPlanBillingPeriod = str2;
            this.newPlanTier = str3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getGracePeriod() {
            return this.gracePeriod;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getNewPlanBillingPeriod() {
            return this.newPlanBillingPeriod;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final gfk.c getNewPlanCharge() {
            return this.newPlanCharge;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getNewPlanTier() {
            return this.newPlanTier;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.gracePeriod, aVar.gracePeriod) && Intrinsics.f(this.newPlanCharge, aVar.newPlanCharge) && Intrinsics.f(this.newPlanBillingPeriod, aVar.newPlanBillingPeriod) && Intrinsics.f(this.newPlanTier, aVar.newPlanTier);
        }

        public final int hashCode() {
            String str = this.gracePeriod;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            gfk.c cVar = this.newPlanCharge;
            int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
            String str2 = this.newPlanBillingPeriod;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.newPlanTier;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }
    }

    public g(lfk.a family, gfk.c cVar, a aVar) {
        Intrinsics.checkNotNullParameter(family, "family");
        this.family = family;
        this.refundAmountCharge = cVar;
        this.offboarding = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final lfk.a getFamily() {
        return this.family;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getOffboarding() {
        return this.offboarding;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final gfk.c getRefundAmountCharge() {
        return this.refundAmountCharge;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.family, gVar.family) && Intrinsics.f(this.refundAmountCharge, gVar.refundAmountCharge) && Intrinsics.f(this.offboarding, gVar.offboarding);
    }

    public final int hashCode() {
        int iHashCode = this.family.hashCode() * 31;
        gfk.c cVar = this.refundAmountCharge;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        a aVar = this.offboarding;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }
}
