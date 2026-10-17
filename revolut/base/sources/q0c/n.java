package q0c;

import com.revolut.feature.rev_points.models.RevPointsTransaction;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsTransaction f241240a;

    public n(RevPointsTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f241240a = transaction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f241240a, ((n) obj2).f241240a);
    }

    public final int hashCode() {
        return this.f241240a.hashCode();
    }
}
