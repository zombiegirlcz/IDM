package kfj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u0005\u0010\u000fR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\t\u0010\u0013R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0013R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\r\u0010\u0013R\u001a\u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\u0004R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R\u001c\u0010 \u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001e\u001a\u0004\b\u0019\u0010\u001f¨\u0006!"}, d2 = {"Lkfj/f4;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "id", "b", "d", "direction", "", "c", "Z", "()Z", "cancellableUntilDate", "", "Ljava/lang/Long;", "()Ljava/lang/Long;", "cancellationDate", "e", "h", "scheduledDate", "completionDate", "g", "i", "state", "failureReason", "Lkfj/x1;", "Lkfj/x1;", "()Lkfj/x1;", "progress", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("direction")
    @NotNull
    private final String direction;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("cancellableUntilDate")
    private final boolean cancellableUntilDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("cancellationDate")
    private final Long cancellationDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("scheduledDate")
    private final Long scheduledDate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("completionDate")
    private final Long completionDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("failureReason")
    private final String failureReason;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("progress")
    private final x1 progress;

    public f4(String id10, String direction, boolean z, Long l2, Long l3, Long l4, String state, String str, x1 x1Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(state, "state");
        this.id = id10;
        this.direction = direction;
        this.cancellableUntilDate = z;
        this.cancellationDate = l2;
        this.scheduledDate = l3;
        this.completionDate = l4;
        this.state = state;
        this.failureReason = str;
        this.progress = x1Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getCancellableUntilDate() {
        return this.cancellableUntilDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getCancellationDate() {
        return this.cancellationDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getCompletionDate() {
        return this.completionDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDirection() {
        return this.direction;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getFailureReason() {
        return this.failureReason;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f4)) {
            return false;
        }
        f4 f4Var = (f4) obj2;
        return Intrinsics.f(this.id, f4Var.id) && Intrinsics.f(this.direction, f4Var.direction) && this.cancellableUntilDate == f4Var.cancellableUntilDate && Intrinsics.f(this.cancellationDate, f4Var.cancellationDate) && Intrinsics.f(this.scheduledDate, f4Var.scheduledDate) && Intrinsics.f(this.completionDate, f4Var.completionDate) && Intrinsics.f(this.state, f4Var.state) && Intrinsics.f(this.failureReason, f4Var.failureReason) && Intrinsics.f(this.progress, f4Var.progress);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final x1 getProgress() {
        return this.progress;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Long getScheduledDate() {
        return this.scheduledDate;
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.c(this.id.hashCode() * 31, 31, this.direction), 31, this.cancellableUntilDate);
        Long l2 = this.cancellationDate;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.scheduledDate;
        int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.completionDate;
        int iC2 = p.a.c((iHashCode2 + (l4 == null ? 0 : l4.hashCode())) * 31, 31, this.state);
        String str = this.failureReason;
        int iHashCode3 = (iC2 + (str == null ? 0 : str.hashCode())) * 31;
        x1 x1Var = this.progress;
        return iHashCode3 + (x1Var != null ? x1Var.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getState() {
        return this.state;
    }
}
