package yn4;

import ip0.v7;
import java.time.LocalDate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yn4.z;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u001a\u0010\u001d\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001a\u0010\u001f\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001e\u0010\u001cR\u001c\u0010 \u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u0011\u0010\u001cR\u001c\u0010$\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\"\u001a\u0004\b\u0016\u0010#R \u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020%8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010-\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010+\u001a\u0004\b\u0005\u0010,R\u001c\u0010/\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010\u0006\u001a\u0004\b.\u0010\u0004¨\u00060"}, d2 = {"Lyn4/a0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "id", "", "b", "J", "()J", "createdAt", "i", "state", "", "d", "I", "j", "()I", "term", "e", "h", "settledInstalments", "Ljo3/a;", "f", "Ljo3/a;", "()Ljo3/a;", "principalAmount", "g", "remainingTotalAmount", "nextDueAmount", "Ljava/time/LocalDate;", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "nextDueDate", "", "Ljava/util/List;", "k", "()Ljava/util/List;", "transactionIds", "Lyn4/z$a;", "Lyn4/z$a;", "()Lyn4/z$a;", "cancellation", "l", "type", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("createdAt")
    private final long createdAt;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("term")
    private final int term;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("settledInstalments")
    private final int settledInstalments;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("principalAmount")
    @NotNull
    private final jo3.a principalAmount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("remainingTotalAmount")
    @NotNull
    private final jo3.a remainingTotalAmount;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("nextDueAmount")
    private final jo3.a nextDueAmount;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("nextDueDate")
    private final LocalDate nextDueDate;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("transactionIds")
    @NotNull
    private final List<String> transactionIds;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("cancellation")
    private final z.a cancellation;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    private final String type;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final z.a getCancellation() {
        return this.cancellation;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.a getNextDueAmount() {
        return this.nextDueAmount;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final LocalDate getNextDueDate() {
        return this.nextDueDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.id, a0Var.id) && this.createdAt == a0Var.createdAt && Intrinsics.f(this.state, a0Var.state) && this.term == a0Var.term && this.settledInstalments == a0Var.settledInstalments && Intrinsics.f(this.principalAmount, a0Var.principalAmount) && Intrinsics.f(this.remainingTotalAmount, a0Var.remainingTotalAmount) && Intrinsics.f(this.nextDueAmount, a0Var.nextDueAmount) && Intrinsics.f(this.nextDueDate, a0Var.nextDueDate) && Intrinsics.f(this.transactionIds, a0Var.transactionIds) && Intrinsics.f(this.cancellation, a0Var.cancellation) && Intrinsics.f(this.type, a0Var.type);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final jo3.a getPrincipalAmount() {
        return this.principalAmount;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final jo3.a getRemainingTotalAmount() {
        return this.remainingTotalAmount;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getSettledInstalments() {
        return this.settledInstalments;
    }

    public final int hashCode() {
        int iJ = v7.j(this.remainingTotalAmount, v7.j(this.principalAmount, j6.a.b(this.settledInstalments, j6.a.b(this.term, p.a.c(a0.d.c(this.id.hashCode() * 31, 31, this.createdAt), 31, this.state), 31), 31), 31), 31);
        jo3.a aVar = this.nextDueAmount;
        int iHashCode = (iJ + (aVar == null ? 0 : aVar.hashCode())) * 31;
        LocalDate localDate = this.nextDueDate;
        int iD = p.a.d((iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31, 31, this.transactionIds);
        z.a aVar2 = this.cancellation;
        int iHashCode2 = (iD + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        String str = this.type;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getTerm() {
        return this.term;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final List getTransactionIds() {
        return this.transactionIds;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
