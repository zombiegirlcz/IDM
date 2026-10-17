package i55;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class g0 {

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0005\u0010\u0010¨\u0006\u0012"}, d2 = {"Li55/g0$a;", "Li55/g0;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "dueDate", "", "J", "c", "()J", "principal", "Li55/b;", "Li55/b;", "()Li55/b;", "accruedInterest", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a extends g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("dueDate")
        @NotNull
        private final String dueDate;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("principal")
        private final long principal;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("accruedInterest")
        @NotNull
        private final i55.b accruedInterest;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final i55.b getAccruedInterest() {
            return this.accruedInterest;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDueDate() {
            return this.dueDate;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getPrincipal() {
            return this.principal;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.dueDate, aVar.dueDate) && this.principal == aVar.principal && Intrinsics.f(this.accruedInterest, aVar.accruedInterest);
        }

        public final int hashCode() {
            return this.accruedInterest.hashCode() + a0.d.c(this.dueDate.hashCode() * 31, 31, this.principal);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Li55/g0$b;", "Li55/g0;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "renegotiationType", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b extends g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("renegotiationType")
        @NotNull
        private final String renegotiationType;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getRenegotiationType() {
            return this.renegotiationType;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.renegotiationType, ((b) obj2).renegotiationType);
        }

        public final int hashCode() {
            return this.renegotiationType.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li55/g0$c;", "Li55/g0;", "<init>", "()V", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c extends g0 {
        private c() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u0006\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0007\u001a\u0004\b\u0013\u0010\t¨\u0006\u0015"}, d2 = {"Li55/g0$d;", "Li55/g0;", "", "toString", "()Ljava/lang/String;", "", "a", "J", "b", "()J", "outstandingPrincipal", "Ljava/lang/Long;", "c", "()Ljava/lang/Long;", "outstandingRescheduledPrincipal", "Li55/b;", "Li55/b;", "()Li55/b;", "outstandingInterest", "d", "outstandingTotal", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d extends g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("outstandingPrincipal")
        private final long outstandingPrincipal;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("outstandingRescheduledPrincipal")
        private final Long outstandingRescheduledPrincipal;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("outstandingInterest")
        @NotNull
        private final i55.b outstandingInterest;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("outstandingTotal")
        private final long outstandingTotal;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final i55.b getOutstandingInterest() {
            return this.outstandingInterest;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getOutstandingPrincipal() {
            return this.outstandingPrincipal;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Long getOutstandingRescheduledPrincipal() {
            return this.outstandingRescheduledPrincipal;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final long getOutstandingTotal() {
            return this.outstandingTotal;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof d)) {
                return false;
            }
            d dVar = (d) obj2;
            return this.outstandingPrincipal == dVar.outstandingPrincipal && Intrinsics.f(this.outstandingRescheduledPrincipal, dVar.outstandingRescheduledPrincipal) && Intrinsics.f(this.outstandingInterest, dVar.outstandingInterest) && this.outstandingTotal == dVar.outstandingTotal;
        }

        public final int hashCode() {
            int iHashCode = Long.hashCode(this.outstandingPrincipal) * 31;
            Long l2 = this.outstandingRescheduledPrincipal;
            return Long.hashCode(this.outstandingTotal) + ((this.outstandingInterest.hashCode() + ((iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31)) * 31);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0017\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0007\u001a\u0004\b\u0016\u0010\tR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u001a"}, d2 = {"Li55/g0$e;", "Li55/g0;", "", "toString", "()Ljava/lang/String;", "", "a", "J", "c", "()J", "overduePrincipal", "b", "Ljava/lang/Long;", "d", "()Ljava/lang/Long;", "overdueRescheduledPrincipal", "Li55/b;", "Li55/b;", "()Li55/b;", "overdueAccruedInterest", "f", "penaltyInterest", "e", "overdueTotal", "Ljava/lang/String;", "latePaymentRisk", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class e extends g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("overduePrincipal")
        private final long overduePrincipal;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("overdueRescheduledPrincipal")
        private final Long overdueRescheduledPrincipal;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("overdueAccruedInterest")
        @NotNull
        private final i55.b overdueAccruedInterest;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("penaltyInterest")
        private final i55.b penaltyInterest;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("overdueTotal")
        private final long overdueTotal;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("latePaymentRisk")
        private final String latePaymentRisk;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getLatePaymentRisk() {
            return this.latePaymentRisk;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final i55.b getOverdueAccruedInterest() {
            return this.overdueAccruedInterest;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getOverduePrincipal() {
            return this.overduePrincipal;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Long getOverdueRescheduledPrincipal() {
            return this.overdueRescheduledPrincipal;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final long getOverdueTotal() {
            return this.overdueTotal;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof e)) {
                return false;
            }
            e eVar = (e) obj2;
            return this.overduePrincipal == eVar.overduePrincipal && Intrinsics.f(this.overdueRescheduledPrincipal, eVar.overdueRescheduledPrincipal) && Intrinsics.f(this.overdueAccruedInterest, eVar.overdueAccruedInterest) && Intrinsics.f(this.penaltyInterest, eVar.penaltyInterest) && this.overdueTotal == eVar.overdueTotal && Intrinsics.f(this.latePaymentRisk, eVar.latePaymentRisk);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final i55.b getPenaltyInterest() {
            return this.penaltyInterest;
        }

        public final int hashCode() {
            int iHashCode = Long.hashCode(this.overduePrincipal) * 31;
            Long l2 = this.overdueRescheduledPrincipal;
            int iHashCode2 = (this.overdueAccruedInterest.hashCode() + ((iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31)) * 31;
            i55.b bVar = this.penaltyInterest;
            int iC = a0.d.c((iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.overdueTotal);
            String str = this.latePaymentRisk;
            return iC + (str != null ? str.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li55/g0$f;", "Li55/g0;", "<init>", "()V", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class f extends g0 {
        private f() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Li55/g0$g;", "Li55/g0;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "repaidDate", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class g extends g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("repaidDate")
        @NotNull
        private final String repaidDate;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getRepaidDate() {
            return this.repaidDate;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof g) && Intrinsics.f(this.repaidDate, ((g) obj2).repaidDate);
        }

        public final int hashCode() {
            return this.repaidDate.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0005\u0010\u0012¨\u0006\u0014"}, d2 = {"Li55/g0$h;", "Li55/g0;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "terminationDate", "", "b", "J", "c", "()J", "terminatedLateTotal", "postTerminationPaymentPlanId", "Li55/b;", "Li55/b;", "()Li55/b;", "penaltyInterest", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class h extends g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("terminationDate")
        @NotNull
        private final String terminationDate;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("terminatedLateTotal")
        private final long terminatedLateTotal;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("postTerminationPaymentPlanId")
        private final String postTerminationPaymentPlanId;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("penaltyInterest")
        private final i55.b penaltyInterest;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final i55.b getPenaltyInterest() {
            return this.penaltyInterest;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getPostTerminationPaymentPlanId() {
            return this.postTerminationPaymentPlanId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getTerminatedLateTotal() {
            return this.terminatedLateTotal;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getTerminationDate() {
            return this.terminationDate;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof h)) {
                return false;
            }
            h hVar = (h) obj2;
            return Intrinsics.f(this.terminationDate, hVar.terminationDate) && this.terminatedLateTotal == hVar.terminatedLateTotal && Intrinsics.f(this.postTerminationPaymentPlanId, hVar.postTerminationPaymentPlanId) && Intrinsics.f(this.penaltyInterest, hVar.penaltyInterest);
        }

        public final int hashCode() {
            int iC = a0.d.c(this.terminationDate.hashCode() * 31, 31, this.terminatedLateTotal);
            String str = this.postTerminationPaymentPlanId;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            i55.b bVar = this.penaltyInterest;
            return iHashCode + (bVar != null ? bVar.hashCode() : 0);
        }
    }

    private g0() {
    }
}
