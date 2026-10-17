package so4;

import ip0.v7;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001a\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001a\u0010\u0016\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u000e\u0010\u001cR\u001a\u0010\u001f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u001e\u0010\u0004R\u001c\u0010 \u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015¨\u0006!"}, d2 = {"Lso4/b;", "", "", "toString", "()Ljava/lang/String;", "Ljava/time/LocalDate;", "a", "Ljava/time/LocalDate;", "d", "()Ljava/time/LocalDate;", "referenceDate", "b", "f", "startDate", "c", "endDate", "dueDate", "Ljo3/a;", "e", "Ljo3/a;", "h", "()Ljo3/a;", "statementBalance", "Ljava/lang/String;", "g", "state", "Lso4/b$a;", "Lso4/b$a;", "()Lso4/b$a;", "outstandingBalance", "i", "status", "remainingAmount", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("referenceDate")
    @NotNull
    private final LocalDate referenceDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("startDate")
    @NotNull
    private final LocalDate startDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("endDate")
    @NotNull
    private final LocalDate endDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("dueDate")
    @NotNull
    private final LocalDate dueDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("statementBalance")
    @NotNull
    private final jo3.a statementBalance;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("outstandingBalance")
    private final a outstandingBalance;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("status")
    @NotNull
    private final String status;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("remainingAmount")
    private final jo3.a remainingAmount;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Lso4/b$a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "()Z", "overdue", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("overdue")
        private final boolean overdue;

        public a(boolean z) {
            this.overdue = z;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getOverdue() {
            return this.overdue;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && this.overdue == ((a) obj2).overdue;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.overdue);
        }
    }

    public b(LocalDate referenceDate, LocalDate startDate, LocalDate endDate, LocalDate dueDate, jo3.a statementBalance, String state, a aVar, String status, jo3.a aVar2) {
        Intrinsics.checkNotNullParameter(referenceDate, "referenceDate");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Intrinsics.checkNotNullParameter(dueDate, "dueDate");
        Intrinsics.checkNotNullParameter(statementBalance, "statementBalance");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(status, "status");
        this.referenceDate = referenceDate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.dueDate = dueDate;
        this.statementBalance = statementBalance;
        this.state = state;
        this.outstandingBalance = aVar;
        this.status = status;
        this.remainingAmount = aVar2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final LocalDate getDueDate() {
        return this.dueDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final LocalDate getEndDate() {
        return this.endDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a getOutstandingBalance() {
        return this.outstandingBalance;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final LocalDate getReferenceDate() {
        return this.referenceDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final jo3.a getRemainingAmount() {
        return this.remainingAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.referenceDate, bVar.referenceDate) && Intrinsics.f(this.startDate, bVar.startDate) && Intrinsics.f(this.endDate, bVar.endDate) && Intrinsics.f(this.dueDate, bVar.dueDate) && Intrinsics.f(this.statementBalance, bVar.statementBalance) && Intrinsics.f(this.state, bVar.state) && Intrinsics.f(this.outstandingBalance, bVar.outstandingBalance) && Intrinsics.f(this.status, bVar.status) && Intrinsics.f(this.remainingAmount, bVar.remainingAmount);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final LocalDate getStartDate() {
        return this.startDate;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final jo3.a getStatementBalance() {
        return this.statementBalance;
    }

    public final int hashCode() {
        int iC = p.a.c(v7.j(this.statementBalance, y.a(y.a(y.a(this.referenceDate.hashCode() * 31, 31, this.startDate), 31, this.endDate), 31, this.dueDate), 31), 31, this.state);
        a aVar = this.outstandingBalance;
        int iC2 = p.a.c((iC + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.status);
        jo3.a aVar2 = this.remainingAmount;
        return iC2 + (aVar2 != null ? aVar2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getStatus() {
        return this.status;
    }
}
