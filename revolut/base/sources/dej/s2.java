package dej;

import com.revolut.feature.rev_points.models.RevPointsTransaction;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class s2 extends t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsTransaction f113648a;

    public s2(RevPointsTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f113648a = transaction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s2) && Intrinsics.f(this.f113648a, ((s2) obj2).f113648a);
    }

    public final int hashCode() {
        return this.f113648a.hashCode();
    }
}
