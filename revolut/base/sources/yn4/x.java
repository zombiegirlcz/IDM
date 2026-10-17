package yn4;

import ip0.v7;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001a\u0010\u0013\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R\u001a\u0010\u001a\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u0006\u0010\u0012R\u001a\u0010\u001e\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001c\u001a\u0004\b\u000f\u0010\u001dR\u001a\u0010\"\u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010 \u001a\u0004\b\u000b\u0010!¨\u0006#"}, d2 = {"Lyn4/x;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "e", "()I", "newTerm", "b", "g", "repaidTerm", "Ljo3/a;", "c", "Ljo3/a;", "d", "()Ljo3/a;", "newPlanAmount", "h", "repaymentAmount", "i", "savedInterest", "f", "regularAmount", "lastAmount", "Ljava/time/LocalDate;", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "lastMaturingDate", "Lyn4/m;", "Lyn4/m;", "()Lyn4/m;", "lastAmountBreakdown", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("newTerm")
    private final int newTerm;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("repaidTerm")
    private final int repaidTerm;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("newPlanAmount")
    @NotNull
    private final jo3.a newPlanAmount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("repaymentAmount")
    @NotNull
    private final jo3.a repaymentAmount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("savedInterest")
    private final jo3.a savedInterest;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("regularAmount")
    @NotNull
    private final jo3.a regularAmount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("lastAmount")
    @NotNull
    private final jo3.a lastAmount;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("lastMaturingDate")
    @NotNull
    private final LocalDate lastMaturingDate;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("lastAmountBreakdown")
    @NotNull
    private final m lastAmountBreakdown;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getLastAmount() {
        return this.lastAmount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final m getLastAmountBreakdown() {
        return this.lastAmountBreakdown;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final LocalDate getLastMaturingDate() {
        return this.lastMaturingDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.a getNewPlanAmount() {
        return this.newPlanAmount;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getNewTerm() {
        return this.newTerm;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return this.newTerm == xVar.newTerm && this.repaidTerm == xVar.repaidTerm && Intrinsics.f(this.newPlanAmount, xVar.newPlanAmount) && Intrinsics.f(this.repaymentAmount, xVar.repaymentAmount) && Intrinsics.f(this.savedInterest, xVar.savedInterest) && Intrinsics.f(this.regularAmount, xVar.regularAmount) && Intrinsics.f(this.lastAmount, xVar.lastAmount) && Intrinsics.f(this.lastMaturingDate, xVar.lastMaturingDate) && Intrinsics.f(this.lastAmountBreakdown, xVar.lastAmountBreakdown);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final jo3.a getRegularAmount() {
        return this.regularAmount;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getRepaidTerm() {
        return this.repaidTerm;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final jo3.a getRepaymentAmount() {
        return this.repaymentAmount;
    }

    public final int hashCode() {
        int iJ = v7.j(this.repaymentAmount, v7.j(this.newPlanAmount, j6.a.b(this.repaidTerm, Integer.hashCode(this.newTerm) * 31, 31), 31), 31);
        jo3.a aVar = this.savedInterest;
        return this.lastAmountBreakdown.hashCode() + wp5.y.a(v7.j(this.lastAmount, v7.j(this.regularAmount, (iJ + (aVar == null ? 0 : aVar.hashCode())) * 31, 31), 31), 31, this.lastMaturingDate);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final jo3.a getSavedInterest() {
        return this.savedInterest;
    }
}
