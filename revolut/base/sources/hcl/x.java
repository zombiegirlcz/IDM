package hcl;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0003\u0006\r\u000bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012¨\u0006\u0014"}, d2 = {"Lhcl/x;", "", "", "toString", "()Ljava/lang/String;", "Lhcl/x$a;", "a", "Lhcl/x$a;", "()Lhcl/x$a;", "performanceIncentives", "Lhcl/x$c;", "b", "Lhcl/x$c;", "c", "()Lhcl/x$c;", "subscriptions", "Lhcl/x$b;", "Lhcl/x$b;", "()Lhcl/x$b;", "redemptions", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("performanceIncentives")
    private final a performanceIncentives;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("subscriptions")
    private final c subscriptions;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("redemptions")
    private final b redemptions;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\r¨\u0006\u000f"}, d2 = {"Lhcl/x$a;", "", "", "toString", "()Ljava/lang/String;", "Ljava/math/BigDecimal;", "a", "Ljava/math/BigDecimal;", "b", "()Ljava/math/BigDecimal;", "hurdleRate", "", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "highWaterMark", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("hurdleRate")
        private final BigDecimal hurdleRate;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("highWaterMark")
        private final Boolean highWaterMark;

        public a(BigDecimal bigDecimal, Boolean bool) {
            this.hurdleRate = bigDecimal;
            this.highWaterMark = bool;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Boolean getHighWaterMark() {
            return this.highWaterMark;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final BigDecimal getHurdleRate() {
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
            BigDecimal bigDecimal = this.hurdleRate;
            int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
            Boolean bool = this.highWaterMark;
            return iHashCode + (bool != null ? bool.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"Lhcl/x$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "frequency", "Ljava/math/BigDecimal;", "b", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "liquidityGate", "", "c", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "liquidityGateApplied", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("frequency")
        private final String frequency;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("liquidityGate")
        private final BigDecimal liquidityGate;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("liquidityGateApplied")
        private final Boolean liquidityGateApplied;

        public b(String str, BigDecimal bigDecimal, Boolean bool) {
            this.frequency = str;
            this.liquidityGate = bigDecimal;
            this.liquidityGateApplied = bool;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFrequency() {
            return this.frequency;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final BigDecimal getLiquidityGate() {
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
            BigDecimal bigDecimal = this.liquidityGate;
            int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
            Boolean bool = this.liquidityGateApplied;
            return iHashCode2 + (bool != null ? bool.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lhcl/x$c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "frequency", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("frequency")
        private final String frequency;

        public c(String str) {
            this.frequency = str;
        }

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

    public x(a aVar, c cVar, b bVar) {
        this.performanceIncentives = aVar;
        this.subscriptions = cVar;
        this.redemptions = bVar;
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
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.performanceIncentives, xVar.performanceIncentives) && Intrinsics.f(this.subscriptions, xVar.subscriptions) && Intrinsics.f(this.redemptions, xVar.redemptions);
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
