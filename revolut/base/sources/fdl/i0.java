package fdl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0003\u0006\r\u000bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012¨\u0006\u0014"}, d2 = {"Lfdl/i0;", "", "", "toString", "()Ljava/lang/String;", "Lfdl/i0$a;", "a", "Lfdl/i0$a;", "()Lfdl/i0$a;", "performanceIncentives", "Lfdl/i0$c;", "b", "Lfdl/i0$c;", "c", "()Lfdl/i0$c;", "subscriptions", "Lfdl/i0$b;", "Lfdl/i0$b;", "()Lfdl/i0$b;", "redemptions", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("performanceIncentives")
    private final a performanceIncentives;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("subscriptions")
    private final c subscriptions;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("redemptions")
    private final b redemptions;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lfdl/i0$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "hurdleRate", "", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "highWaterMark", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("hurdleRate")
        private final String hurdleRate;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("highWaterMark")
        private final Boolean highWaterMark;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Boolean getHighWaterMark() {
            return this.highWaterMark;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getHurdleRate() {
            return this.hurdleRate;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.hurdleRate, aVar.hurdleRate) && Intrinsics.f(this.highWaterMark, aVar.highWaterMark);
        }

        public final int hashCode() {
            String str = this.hurdleRate;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.highWaterMark;
            return iHashCode + (bool != null ? bool.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Lfdl/i0$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "frequency", "b", "liquidityGate", "", "c", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "liquidityGateApplied", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("frequency")
        private final String frequency;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("liquidityGate")
        private final String liquidityGate;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("liquidityGateApplied")
        private final Boolean liquidityGateApplied;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFrequency() {
            return this.frequency;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getLiquidityGate() {
            return this.liquidityGate;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Boolean getLiquidityGateApplied() {
            return this.liquidityGateApplied;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.frequency, bVar.frequency) && Intrinsics.f(this.liquidityGate, bVar.liquidityGate) && Intrinsics.f(this.liquidityGateApplied, bVar.liquidityGateApplied);
        }

        public final int hashCode() {
            String str = this.frequency;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.liquidityGate;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.liquidityGateApplied;
            return iHashCode2 + (bool != null ? bool.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lfdl/i0$c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "frequency", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("frequency")
        private final String frequency;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFrequency() {
            return this.frequency;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof c) && Intrinsics.f(this.frequency, ((c) obj2).frequency);
        }

        public final int hashCode() {
            String str = this.frequency;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getPerformanceIncentives() {
        return this.performanceIncentives;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getRedemptions() {
        return this.redemptions;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final c getSubscriptions() {
        return this.subscriptions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return Intrinsics.f(this.performanceIncentives, i0Var.performanceIncentives) && Intrinsics.f(this.subscriptions, i0Var.subscriptions) && Intrinsics.f(this.redemptions, i0Var.redemptions);
    }

    public final int hashCode() {
        a aVar = this.performanceIncentives;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        c cVar = this.subscriptions;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        b bVar = this.redemptions;
        return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }
}
