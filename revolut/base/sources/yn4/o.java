package yn4;

import ip0.v7;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\tR\u001a\u0010\u0012\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u0011\u0010\tR\u001a\u0010\u0016\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u0006\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\u000b\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u000e\u0010\u0015¨\u0006\u0019"}, d2 = {"Lyn4/o;", "", "", "toString", "()Ljava/lang/String;", "Ljava/time/LocalDate;", "a", "Ljava/time/LocalDate;", "g", "()Ljava/time/LocalDate;", "oldMaturingDate", "b", "e", "newMaturingDate", "c", "f", "oldDueDate", "d", "newDueDate", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "anticipatedAmount", "carryoverAmount", "discountAmount", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("oldMaturingDate")
    @NotNull
    private final LocalDate oldMaturingDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("newMaturingDate")
    @NotNull
    private final LocalDate newMaturingDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("oldDueDate")
    @NotNull
    private final LocalDate oldDueDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("newDueDate")
    @NotNull
    private final LocalDate newDueDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("anticipatedAmount")
    @NotNull
    private final jo3.a anticipatedAmount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("carryoverAmount")
    @NotNull
    private final jo3.a carryoverAmount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("discountAmount")
    @NotNull
    private final jo3.a discountAmount;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getAnticipatedAmount() {
        return this.anticipatedAmount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.a getCarryoverAmount() {
        return this.carryoverAmount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.a getDiscountAmount() {
        return this.discountAmount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final LocalDate getNewDueDate() {
        return this.newDueDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final LocalDate getNewMaturingDate() {
        return this.newMaturingDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.oldMaturingDate, oVar.oldMaturingDate) && Intrinsics.f(this.newMaturingDate, oVar.newMaturingDate) && Intrinsics.f(this.oldDueDate, oVar.oldDueDate) && Intrinsics.f(this.newDueDate, oVar.newDueDate) && Intrinsics.f(this.anticipatedAmount, oVar.anticipatedAmount) && Intrinsics.f(this.carryoverAmount, oVar.carryoverAmount) && Intrinsics.f(this.discountAmount, oVar.discountAmount);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final LocalDate getOldDueDate() {
        return this.oldDueDate;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final LocalDate getOldMaturingDate() {
        return this.oldMaturingDate;
    }

    public final int hashCode() {
        return this.discountAmount.hashCode() + v7.j(this.carryoverAmount, v7.j(this.anticipatedAmount, wp5.y.a(wp5.y.a(wp5.y.a(this.oldMaturingDate.hashCode() * 31, 31, this.newMaturingDate), 31, this.oldDueDate), 31, this.newDueDate), 31), 31);
    }
}
