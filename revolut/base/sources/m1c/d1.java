package m1c;

import com.revolut.feature.rev_points.models.RevPointsTransaction;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d1 extends e1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RevPointsTransaction f201353c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(RevPointsTransaction revPointsTransaction) {
        super(revPointsTransaction.f84054a, revPointsTransaction.d);
        Intrinsics.checkNotNullParameter(revPointsTransaction, "revPointsTransaction");
        this.f201353c = revPointsTransaction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d1) && Intrinsics.f(this.f201353c, ((d1) obj2).f201353c);
    }

    public final int hashCode() {
        return this.f201353c.hashCode();
    }
}
