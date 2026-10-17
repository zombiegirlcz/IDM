package yn4;

import ip0.v7;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0007\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0005\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001a\u0010\u001c\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u001b\u0010\u0004R\u001a\u0010\u001d\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010!\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b\f\u0010 ¨\u0006\""}, d2 = {"Lyn4/e0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "f", "state", "", "c", "J", "()J", "createdAt", "", "d", "I", "g", "()I", "term", "Lyn4/e0$b;", "e", "Lyn4/e0$b;", "()Lyn4/e0$b;", "schedule", "h", "transactionId", "repaymentMethod", "Ljava/time/LocalDate;", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "planSettleDate", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("createdAt")
    private final long createdAt;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("term")
    private final int term;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("schedule")
    @NotNull
    private final b schedule;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("transactionId")
    @NotNull
    private final String transactionId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("repaymentMethod")
    @NotNull
    private final String repaymentMethod;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("planSettleDate")
    private final LocalDate planSettleDate;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\tR\u001a\u0010\u0016\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u000b\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0007\u001a\u0004\b\u001b\u0010\tR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0007\u001a\u0004\b\u0012\u0010\tR\u001c\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b\u000e\u0010!R\u001c\u0010#\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b\u0019\u0010!¨\u0006$"}, d2 = {"Lyn4/e0$a;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "j", "()Ljo3/a;", "totalPlanAmount", "b", "k", "totalPrincipalAmount", "c", "i", "totalInterestAmount", "", "d", "I", "h", "()I", "settledInstalmentsCount", "e", "currentInstalmentsCount", "f", "futureInstalmentsCount", "g", "settledInstalmentsAmount", "currentInstalmentsAmount", "futureInstalmentsAmount", "Ljava/time/LocalDate;", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "currentInstalmentsDueDate", "lastInstalmentsDueDate", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("totalPlanAmount")
        @NotNull
        private final jo3.a totalPlanAmount;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("totalPrincipalAmount")
        @NotNull
        private final jo3.a totalPrincipalAmount;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("totalInterestAmount")
        @NotNull
        private final jo3.a totalInterestAmount;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("settledInstalmentsCount")
        private final int settledInstalmentsCount;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("currentInstalmentsCount")
        private final int currentInstalmentsCount;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("futureInstalmentsCount")
        private final int futureInstalmentsCount;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("settledInstalmentsAmount")
        private final jo3.a settledInstalmentsAmount;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @lg.b("currentInstalmentsAmount")
        private final jo3.a currentInstalmentsAmount;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @lg.b("futureInstalmentsAmount")
        private final jo3.a futureInstalmentsAmount;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @lg.b("currentInstalmentsDueDate")
        private final LocalDate currentInstalmentsDueDate;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @lg.b("lastInstalmentsDueDate")
        private final LocalDate lastInstalmentsDueDate;

        public a(jo3.a totalPlanAmount, jo3.a totalPrincipalAmount, jo3.a totalInterestAmount, int i, int i2, int i3, jo3.a aVar, jo3.a aVar2, jo3.a aVar3, LocalDate localDate, LocalDate localDate2) {
            Intrinsics.checkNotNullParameter(totalPlanAmount, "totalPlanAmount");
            Intrinsics.checkNotNullParameter(totalPrincipalAmount, "totalPrincipalAmount");
            Intrinsics.checkNotNullParameter(totalInterestAmount, "totalInterestAmount");
            this.totalPlanAmount = totalPlanAmount;
            this.totalPrincipalAmount = totalPrincipalAmount;
            this.totalInterestAmount = totalInterestAmount;
            this.settledInstalmentsCount = i;
            this.currentInstalmentsCount = i2;
            this.futureInstalmentsCount = i3;
            this.settledInstalmentsAmount = aVar;
            this.currentInstalmentsAmount = aVar2;
            this.futureInstalmentsAmount = aVar3;
            this.currentInstalmentsDueDate = localDate;
            this.lastInstalmentsDueDate = localDate2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final jo3.a getCurrentInstalmentsAmount() {
            return this.currentInstalmentsAmount;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getCurrentInstalmentsCount() {
            return this.currentInstalmentsCount;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final LocalDate getCurrentInstalmentsDueDate() {
            return this.currentInstalmentsDueDate;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final jo3.a getFutureInstalmentsAmount() {
            return this.futureInstalmentsAmount;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getFutureInstalmentsCount() {
            return this.futureInstalmentsCount;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.totalPlanAmount, aVar.totalPlanAmount) && Intrinsics.f(this.totalPrincipalAmount, aVar.totalPrincipalAmount) && Intrinsics.f(this.totalInterestAmount, aVar.totalInterestAmount) && this.settledInstalmentsCount == aVar.settledInstalmentsCount && this.currentInstalmentsCount == aVar.currentInstalmentsCount && this.futureInstalmentsCount == aVar.futureInstalmentsCount && Intrinsics.f(this.settledInstalmentsAmount, aVar.settledInstalmentsAmount) && Intrinsics.f(this.currentInstalmentsAmount, aVar.currentInstalmentsAmount) && Intrinsics.f(this.futureInstalmentsAmount, aVar.futureInstalmentsAmount) && Intrinsics.f(this.currentInstalmentsDueDate, aVar.currentInstalmentsDueDate) && Intrinsics.f(this.lastInstalmentsDueDate, aVar.lastInstalmentsDueDate);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final LocalDate getLastInstalmentsDueDate() {
            return this.lastInstalmentsDueDate;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final jo3.a getSettledInstalmentsAmount() {
            return this.settledInstalmentsAmount;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final int getSettledInstalmentsCount() {
            return this.settledInstalmentsCount;
        }

        public final int hashCode() {
            int iB = j6.a.b(this.futureInstalmentsCount, j6.a.b(this.currentInstalmentsCount, j6.a.b(this.settledInstalmentsCount, v7.j(this.totalInterestAmount, v7.j(this.totalPrincipalAmount, this.totalPlanAmount.hashCode() * 31, 31), 31), 31), 31), 31);
            jo3.a aVar = this.settledInstalmentsAmount;
            int iHashCode = (iB + (aVar == null ? 0 : aVar.hashCode())) * 31;
            jo3.a aVar2 = this.currentInstalmentsAmount;
            int iHashCode2 = (iHashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
            jo3.a aVar3 = this.futureInstalmentsAmount;
            int iHashCode3 = (iHashCode2 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
            LocalDate localDate = this.currentInstalmentsDueDate;
            int iHashCode4 = (iHashCode3 + (localDate == null ? 0 : localDate.hashCode())) * 31;
            LocalDate localDate2 = this.lastInstalmentsDueDate;
            return iHashCode4 + (localDate2 != null ? localDate2.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final jo3.a getTotalInterestAmount() {
            return this.totalInterestAmount;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final jo3.a getTotalPlanAmount() {
            return this.totalPlanAmount;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final jo3.a getTotalPrincipalAmount() {
            return this.totalPrincipalAmount;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\t¨\u0006\f"}, d2 = {"Lyn4/e0$b;", "", "", "toString", "()Ljava/lang/String;", "Lyn4/e0$a;", "a", "Lyn4/e0$a;", "b", "()Lyn4/e0$a;", "initial", "actual", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("initial")
        @NotNull
        private final a initial;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("actual")
        @NotNull
        private final a actual;

        public b(a initial, a actual) {
            Intrinsics.checkNotNullParameter(initial, "initial");
            Intrinsics.checkNotNullParameter(actual, "actual");
            this.initial = initial;
            this.actual = actual;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final a getActual() {
            return this.actual;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final a getInitial() {
            return this.initial;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.initial, bVar.initial) && Intrinsics.f(this.actual, bVar.actual);
        }

        public final int hashCode() {
            return this.actual.hashCode() + (this.initial.hashCode() * 31);
        }
    }

    public e0(String id10, String state, long j2, int i, b schedule, String transactionId, String repaymentMethod, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(schedule, "schedule");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(repaymentMethod, "repaymentMethod");
        this.id = id10;
        this.state = state;
        this.createdAt = j2;
        this.term = i;
        this.schedule = schedule;
        this.transactionId = transactionId;
        this.repaymentMethod = repaymentMethod;
        this.planSettleDate = localDate;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final LocalDate getPlanSettleDate() {
        return this.planSettleDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getRepaymentMethod() {
        return this.repaymentMethod;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final b getSchedule() {
        return this.schedule;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.id, e0Var.id) && Intrinsics.f(this.state, e0Var.state) && this.createdAt == e0Var.createdAt && this.term == e0Var.term && Intrinsics.f(this.schedule, e0Var.schedule) && Intrinsics.f(this.transactionId, e0Var.transactionId) && Intrinsics.f(this.repaymentMethod, e0Var.repaymentMethod) && Intrinsics.f(this.planSettleDate, e0Var.planSettleDate);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getTerm() {
        return this.term;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c((this.schedule.hashCode() + j6.a.b(this.term, a0.d.c(p.a.c(this.id.hashCode() * 31, 31, this.state), 31, this.createdAt), 31)) * 31, 31, this.transactionId), 31, this.repaymentMethod);
        LocalDate localDate = this.planSettleDate;
        return iC + (localDate == null ? 0 : localDate.hashCode());
    }
}
