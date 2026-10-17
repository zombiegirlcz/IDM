package n0c;

import com.revolut.feature.rev_points.models.RevPointsTransaction;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsTransaction f210983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final whf.p f210984b;

    public i(RevPointsTransaction revPointsTransaction, whf.p pVar) {
        Intrinsics.checkNotNullParameter(revPointsTransaction, "revPointsTransaction");
        this.f210983a = revPointsTransaction;
        this.f210984b = pVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f210983a, iVar.f210983a) && Intrinsics.f(this.f210984b, iVar.f210984b);
    }

    public final int hashCode() {
        int iHashCode = this.f210983a.hashCode() * 31;
        whf.p pVar = this.f210984b;
        return iHashCode + (pVar == null ? 0 : pVar.hashCode());
    }
}
