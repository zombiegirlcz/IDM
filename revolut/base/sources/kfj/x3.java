package kfj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0005\u0010\u0010R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0017"}, d2 = {"Lkfj/x3;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "pocketId", "", "b", "J", "()J", "dueDate", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "amount", "", "d", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "useRevPoints", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class x3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("pocketId")
    private final String pocketId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("dueDate")
    private final long dueDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    private final jo3.a amount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("useRevPoints")
    private final Boolean useRevPoints;

    public x3(String str, long j2, jo3.a aVar, Boolean bool) {
        this.pocketId = str;
        this.dueDate = j2;
        this.amount = aVar;
        this.useRevPoints = bool;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getDueDate() {
        return this.dueDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPocketId() {
        return this.pocketId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Boolean getUseRevPoints() {
        return this.useRevPoints;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x3)) {
            return false;
        }
        x3 x3Var = (x3) obj2;
        return Intrinsics.f(this.pocketId, x3Var.pocketId) && this.dueDate == x3Var.dueDate && Intrinsics.f(this.amount, x3Var.amount) && Intrinsics.f(this.useRevPoints, x3Var.useRevPoints);
    }

    public final int hashCode() {
        String str = this.pocketId;
        int iC = a0.d.c((str == null ? 0 : str.hashCode()) * 31, 31, this.dueDate);
        jo3.a aVar = this.amount;
        int iHashCode = (iC + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Boolean bool = this.useRevPoints;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }
}
