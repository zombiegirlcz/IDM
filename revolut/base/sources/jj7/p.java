package jj7;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0006\u0010\u0012¨\u0006\u0014"}, d2 = {"Ljj7/p;", "", "", "toString", "()Ljava/lang/String;", "Ljj7/o;", "a", "Ljj7/o;", "c", "()Ljj7/o;", "transaction", "Ljj7/m;", "b", "Ljj7/m;", "()Ljj7/m;", "event", "Ljj7/l;", "Ljj7/l;", "()Ljj7/l;", "cancellation", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("transaction")
    @NotNull
    private final o transaction;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("event")
    @NotNull
    private final m event;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("cancellation")
    @NotNull
    private final l cancellation;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final l getCancellation() {
        return this.cancellation;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final m getEvent() {
        return this.event;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final o getTransaction() {
        return this.transaction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.transaction, pVar.transaction) && Intrinsics.f(this.event, pVar.event) && Intrinsics.f(this.cancellation, pVar.cancellation);
    }

    public final int hashCode() {
        return this.cancellation.hashCode() + ((this.event.hashCode() + (this.transaction.hashCode() * 31)) * 31);
    }
}
