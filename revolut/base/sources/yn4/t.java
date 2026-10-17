package yn4;

import ip0.v7;
import java.time.LocalDate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0006\fJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lyn4/t;", "", "", "toString", "()Ljava/lang/String;", "Lyn4/t$a;", "a", "Lyn4/t$a;", "()Lyn4/t$a;", "current", "", "Lyn4/t$b;", "b", "Ljava/util/List;", "()Ljava/util/List;", "updatedInstalments", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("current")
    @NotNull
    private final a current;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("updatedInstalments")
    @NotNull
    private final List<b> updatedInstalments;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001a\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0007\u001a\u0004\b\u000f\u0010\bR\u001a\u0010\u0013\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u0012\u0010\bR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016¨\u0006\u0018"}, d2 = {"Lyn4/t$a;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "()Ljo3/a;", "dueAmount", "Ljava/time/LocalDate;", "b", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "dueDate", "c", "estimatedInterest", "d", "e", "totalToRepay", "", "Ljava/lang/Double;", "()Ljava/lang/Double;", "referenceRateValue", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("dueAmount")
        @NotNull
        private final jo3.a dueAmount;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("dueDate")
        @NotNull
        private final LocalDate dueDate;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("estimatedInterest")
        @NotNull
        private final jo3.a estimatedInterest;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("totalToRepay")
        @NotNull
        private final jo3.a totalToRepay;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("referenceRateValue")
        private final Double referenceRateValue;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final jo3.a getDueAmount() {
            return this.dueAmount;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final LocalDate getDueDate() {
            return this.dueDate;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final jo3.a getEstimatedInterest() {
            return this.estimatedInterest;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Double getReferenceRateValue() {
            return this.referenceRateValue;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final jo3.a getTotalToRepay() {
            return this.totalToRepay;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.dueAmount, aVar.dueAmount) && Intrinsics.f(this.dueDate, aVar.dueDate) && Intrinsics.f(this.estimatedInterest, aVar.estimatedInterest) && Intrinsics.f(this.totalToRepay, aVar.totalToRepay) && Intrinsics.f(this.referenceRateValue, aVar.referenceRateValue);
        }

        public final int hashCode() {
            int iJ = v7.j(this.totalToRepay, v7.j(this.estimatedInterest, wp5.y.a(this.dueAmount.hashCode() * 31, 31, this.dueDate), 31), 31);
            Double d = this.referenceRateValue;
            return iJ + (d == null ? 0 : d.hashCode());
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\f\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0014\u0010\u000fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0006\u0010\u000f¨\u0006\u0017"}, d2 = {"Lyn4/t$b;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "d", "()I", "newTerm", "Ljo3/a;", "b", "Ljo3/a;", "f", "()Ljo3/a;", "totalToRepay", "c", "monthlyPrincipal", "estimatedInterest", "e", "nextDueAmount", "dailyInterest", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("newTerm")
        private final int newTerm;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("totalToRepay")
        @NotNull
        private final jo3.a totalToRepay;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("monthlyPrincipal")
        @NotNull
        private final jo3.a monthlyPrincipal;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("estimatedInterest")
        @NotNull
        private final jo3.a estimatedInterest;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("nextDueAmount")
        @NotNull
        private final jo3.a nextDueAmount;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("dailyInterest")
        private final jo3.a dailyInterest;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final jo3.a getDailyInterest() {
            return this.dailyInterest;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final jo3.a getEstimatedInterest() {
            return this.estimatedInterest;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final jo3.a getMonthlyPrincipal() {
            return this.monthlyPrincipal;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getNewTerm() {
            return this.newTerm;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final jo3.a getNextDueAmount() {
            return this.nextDueAmount;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return this.newTerm == bVar.newTerm && Intrinsics.f(this.totalToRepay, bVar.totalToRepay) && Intrinsics.f(this.monthlyPrincipal, bVar.monthlyPrincipal) && Intrinsics.f(this.estimatedInterest, bVar.estimatedInterest) && Intrinsics.f(this.nextDueAmount, bVar.nextDueAmount) && Intrinsics.f(this.dailyInterest, bVar.dailyInterest);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final jo3.a getTotalToRepay() {
            return this.totalToRepay;
        }

        public final int hashCode() {
            int iJ = v7.j(this.nextDueAmount, v7.j(this.estimatedInterest, v7.j(this.monthlyPrincipal, v7.j(this.totalToRepay, Integer.hashCode(this.newTerm) * 31, 31), 31), 31), 31);
            jo3.a aVar = this.dailyInterest;
            return iJ + (aVar == null ? 0 : aVar.hashCode());
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getCurrent() {
        return this.current;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getUpdatedInstalments() {
        return this.updatedInstalments;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.current, tVar.current) && Intrinsics.f(this.updatedInstalments, tVar.updatedInstalments);
    }

    public final int hashCode() {
        return this.updatedInstalments.hashCode() + (this.current.hashCode() * 31);
    }
}
