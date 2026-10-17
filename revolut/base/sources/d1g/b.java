package d1g;

import com.revolut.feature.rev_points.models.RevPointsTransaction;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RevPointsTransaction f110642b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(RevPointsTransaction transaction) {
        super(transaction.d);
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f110642b = transaction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f110642b, ((b) obj2).f110642b);
    }

    public final int hashCode() {
        return this.f110642b.hashCode();
    }
}
