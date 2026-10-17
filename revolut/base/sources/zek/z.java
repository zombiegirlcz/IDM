package zek;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\n\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\n\u0010\rR\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0016\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0005\u0010\u0019¨\u0006\u001b"}, d2 = {"Lzek/z;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "planId", "", "b", "Z", "f", "()Z", "recommended", "c", "current", "d", "displayCode", "Lzek/z$b;", "Lzek/z$b;", "()Lzek/z$b;", "loyaltyRate", "Lzek/z$a;", "Lzek/z$a;", "()Lzek/z$a;", "billing", "feature_retail_pricing_plans_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("planId")
    @NotNull
    private final String planId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("recommended")
    private final boolean recommended;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("current")
    private final boolean current;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("displayCode")
    @NotNull
    private final String displayCode;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("loyaltyRate")
    @NotNull
    private final b loyaltyRate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("billing")
    private final a billing;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lzek/z$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "period", "Ljo3/b;", "Ljo3/b;", "()Ljo3/b;", "fee", "feature_retail_pricing_plans_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("period")
        @NotNull
        private final String period;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("fee")
        @NotNull
        private final jo3.b fee;

        public a(String period, jo3.b fee2) {
            Intrinsics.checkNotNullParameter(period, "period");
            Intrinsics.checkNotNullParameter(fee2, "fee");
            this.period = period;
            this.fee = fee2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final jo3.b getFee() {
            return this.fee;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getPeriod() {
            return this.period;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.period, aVar.period) && Intrinsics.f(this.fee, aVar.fee);
        }

        public final int hashCode() {
            return this.fee.hashCode() + (this.period.hashCode() * 31);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\r¨\u0006\u000f"}, d2 = {"Lzek/z$b;", "", "", "toString", "()Ljava/lang/String;", "", "a", "D", "b", "()D", "pointsForCardSpend", "Ljo3/b;", "Ljo3/b;", "()Ljo3/b;", "cashForCardSpend", "feature_retail_pricing_plans_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("pointsForCardSpend")
        private final double pointsForCardSpend;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("cashForCardSpend")
        @NotNull
        private final jo3.b cashForCardSpend;

        public b(double d, jo3.b cashForCardSpend) {
            Intrinsics.checkNotNullParameter(cashForCardSpend, "cashForCardSpend");
            this.pointsForCardSpend = d;
            this.cashForCardSpend = cashForCardSpend;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final jo3.b getCashForCardSpend() {
            return this.cashForCardSpend;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final double getPointsForCardSpend() {
            return this.pointsForCardSpend;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Double.compare(this.pointsForCardSpend, bVar.pointsForCardSpend) == 0 && Intrinsics.f(this.cashForCardSpend, bVar.cashForCardSpend);
        }

        public final int hashCode() {
            return this.cashForCardSpend.hashCode() + (Double.hashCode(this.pointsForCardSpend) * 31);
        }
    }

    public z(String planId, boolean z, boolean z3, String displayCode, b loyaltyRate, a aVar) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(displayCode, "displayCode");
        Intrinsics.checkNotNullParameter(loyaltyRate, "loyaltyRate");
        this.planId = planId;
        this.recommended = z;
        this.current = z3;
        this.displayCode = displayCode;
        this.loyaltyRate = loyaltyRate;
        this.billing = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getBilling() {
        return this.billing;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getCurrent() {
        return this.current;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDisplayCode() {
        return this.displayCode;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b getLoyaltyRate() {
        return this.loyaltyRate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPlanId() {
        return this.planId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.planId, zVar.planId) && this.recommended == zVar.recommended && this.current == zVar.current && Intrinsics.f(this.displayCode, zVar.displayCode) && Intrinsics.f(this.loyaltyRate, zVar.loyaltyRate) && Intrinsics.f(this.billing, zVar.billing);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getRecommended() {
        return this.recommended;
    }

    public final int hashCode() {
        int iHashCode = (this.loyaltyRate.hashCode() + p.a.c(j6.a.c(j6.a.c(this.planId.hashCode() * 31, 31, this.recommended), 31, this.current), 31, this.displayCode)) * 31;
        a aVar = this.billing;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }
}
