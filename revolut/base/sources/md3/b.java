package md3;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m1c.x0;
import md3.a;
import uc3.f;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f204476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f204477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x0 f204478c;

    public b(f cashbackStatus, List cashbackBoxes, x0 revPointsOptInState) {
        Intrinsics.checkNotNullParameter(cashbackStatus, "cashbackStatus");
        Intrinsics.checkNotNullParameter(cashbackBoxes, "cashbackBoxes");
        Intrinsics.checkNotNullParameter(revPointsOptInState, "revPointsOptInState");
        this.f204476a = cashbackStatus;
        this.f204477b = cashbackBoxes;
        this.f204478c = revPointsOptInState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f204476a, bVar.f204476a) && Intrinsics.f(this.f204477b, bVar.f204477b) && this.f204478c == bVar.f204478c;
    }

    public final int hashCode() {
        return this.f204478c.hashCode() + p.a.d(this.f204476a.hashCode() * 31, 31, this.f204477b);
    }
}
