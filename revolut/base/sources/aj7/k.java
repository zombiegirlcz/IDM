package aj7;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0006\u0010\u0012¨\u0006\u0014"}, d2 = {"Laj7/k;", "", "", "toString", "()Ljava/lang/String;", "Laj7/j;", "a", "Laj7/j;", "c", "()Laj7/j;", "transaction", "Laj7/h;", "b", "Laj7/h;", "()Laj7/h;", "event", "Laj7/g;", "Laj7/g;", "()Laj7/g;", "cancellation", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("transaction")
    @NotNull
    private final j transaction;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("event")
    @NotNull
    private final h event;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("cancellation")
    @NotNull
    private final g cancellation;

    public k(j transaction, h event, g cancellation) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(cancellation, "cancellation");
        this.transaction = transaction;
        this.event = event;
        this.cancellation = cancellation;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final g getCancellation() {
        return this.cancellation;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final h getEvent() {
        return this.event;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final j getTransaction() {
        return this.transaction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.transaction, kVar.transaction) && Intrinsics.f(this.event, kVar.event) && Intrinsics.f(this.cancellation, kVar.cancellation);
    }

    public final int hashCode() {
        return this.cancellation.hashCode() + ((this.event.hashCode() + (this.transaction.hashCode() * 31)) * 31);
    }
}
