package jj7;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Ljj7/n0;", "", "", "toString", "()Ljava/lang/String;", "Ljj7/p0;", "a", "Ljj7/p0;", "getTransaction", "()Ljj7/p0;", "transaction", "Ljj7/m0;", "b", "Ljj7/m0;", "getEvent", "()Ljj7/m0;", "event", "Ljj7/l0;", "c", "Ljj7/l0;", "getCancellation", "()Ljj7/l0;", "cancellation", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("transaction")
    @NotNull
    private final p0 transaction;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("event")
    @NotNull
    private final m0 event;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("cancellation")
    @NotNull
    private final l0 cancellation;

    public n0(p0 transaction, m0 event, l0 cancellation) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(cancellation, "cancellation");
        this.transaction = transaction;
        this.event = event;
        this.cancellation = cancellation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj2;
        return Intrinsics.f(this.transaction, n0Var.transaction) && Intrinsics.f(this.event, n0Var.event) && Intrinsics.f(this.cancellation, n0Var.cancellation);
    }

    public final int hashCode() {
        return this.cancellation.hashCode() + ((this.event.hashCode() + (this.transaction.hashCode() * 31)) * 31);
    }
}
