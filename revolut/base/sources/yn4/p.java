package yn4;

import ip0.v7;
import java.time.LocalDate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u0012\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u001a\u0010\u001c\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0006\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0015\u001a\u0004\b\u000e\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R \u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010!\u001a\u0004\b\u0019\u0010\"R\u001a\u0010%\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0015\u001a\u0004\b$\u0010\u0017¨\u0006&"}, d2 = {"Lyn4/p;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "h", "()I", "newInstalmentsCount", "b", "anticipatedInstalmentsCount", "Ljava/time/LocalDate;", "c", "Ljava/time/LocalDate;", "g", "()Ljava/time/LocalDate;", "lastInstalmentNewDueDate", "Ljo3/a;", "d", "Ljo3/a;", "i", "()Ljo3/a;", "newPlanAmount", "e", "f", "instalmentAmount", "anticipatedAmount", "carryoverAmount", "discountAmount", "", "Lyn4/o;", "Ljava/util/List;", "()Ljava/util/List;", "discounts", "j", "newStatementBalance", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("newInstalmentsCount")
    private final int newInstalmentsCount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("anticipatedInstalmentsCount")
    private final int anticipatedInstalmentsCount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("lastInstalmentNewDueDate")
    @NotNull
    private final LocalDate lastInstalmentNewDueDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("newPlanAmount")
    @NotNull
    private final jo3.a newPlanAmount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("instalmentAmount")
    @NotNull
    private final jo3.a instalmentAmount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("anticipatedAmount")
    @NotNull
    private final jo3.a anticipatedAmount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("carryoverAmount")
    @NotNull
    private final jo3.a carryoverAmount;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("discountAmount")
    @NotNull
    private final jo3.a discountAmount;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("discounts")
    @NotNull
    private final List<o> discounts;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("newStatementBalance")
    @NotNull
    private final jo3.a newStatementBalance;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getAnticipatedAmount() {
        return this.anticipatedAmount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getAnticipatedInstalmentsCount() {
        return this.anticipatedInstalmentsCount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.a getCarryoverAmount() {
        return this.carryoverAmount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.a getDiscountAmount() {
        return this.discountAmount;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getDiscounts() {
        return this.discounts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.newInstalmentsCount == pVar.newInstalmentsCount && this.anticipatedInstalmentsCount == pVar.anticipatedInstalmentsCount && Intrinsics.f(this.lastInstalmentNewDueDate, pVar.lastInstalmentNewDueDate) && Intrinsics.f(this.newPlanAmount, pVar.newPlanAmount) && Intrinsics.f(this.instalmentAmount, pVar.instalmentAmount) && Intrinsics.f(this.anticipatedAmount, pVar.anticipatedAmount) && Intrinsics.f(this.carryoverAmount, pVar.carryoverAmount) && Intrinsics.f(this.discountAmount, pVar.discountAmount) && Intrinsics.f(this.discounts, pVar.discounts) && Intrinsics.f(this.newStatementBalance, pVar.newStatementBalance);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final jo3.a getInstalmentAmount() {
        return this.instalmentAmount;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final LocalDate getLastInstalmentNewDueDate() {
        return this.lastInstalmentNewDueDate;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getNewInstalmentsCount() {
        return this.newInstalmentsCount;
    }

    public final int hashCode() {
        return this.newStatementBalance.hashCode() + p.a.d(v7.j(this.discountAmount, v7.j(this.carryoverAmount, v7.j(this.anticipatedAmount, v7.j(this.instalmentAmount, v7.j(this.newPlanAmount, wp5.y.a(j6.a.b(this.anticipatedInstalmentsCount, Integer.hashCode(this.newInstalmentsCount) * 31, 31), 31, this.lastInstalmentNewDueDate), 31), 31), 31), 31), 31), 31, this.discounts);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final jo3.a getNewPlanAmount() {
        return this.newPlanAmount;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final jo3.a getNewStatementBalance() {
        return this.newStatementBalance;
    }
}
