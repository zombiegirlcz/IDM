package hub;

import com.revolut.feature.rev_points.params.RevPointsTransactionPageParams;
import d73.n;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f155602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f155603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RevPointsTransactionPageParams f155604c;
    public final n d;

    public g(String selectedTransactionId, List transactionsList, n nVar) {
        RevPointsTransactionPageParams pageParams = new RevPointsTransactionPageParams(0, null, null, null, null, null, null, null, null, 511);
        Intrinsics.checkNotNullParameter(selectedTransactionId, "selectedTransactionId");
        Intrinsics.checkNotNullParameter(transactionsList, "transactionsList");
        Intrinsics.checkNotNullParameter(pageParams, "pageParams");
        this.f155602a = selectedTransactionId;
        this.f155603b = transactionsList;
        this.f155604c = pageParams;
        this.d = nVar;
    }

    public final RevPointsTransactionPageParams b() {
        return this.f155604c;
    }

    public final n c() {
        return this.d;
    }

    public final String d() {
        return this.f155602a;
    }

    public final List e() {
        return this.f155603b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f155602a, gVar.f155602a) && Intrinsics.f(this.f155603b, gVar.f155603b) && Intrinsics.f(this.f155604c, gVar.f155604c) && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f155604c.hashCode() + j6.a.c(p.a.d(this.f155602a.hashCode() * 31, 31, this.f155603b), 31, false)) * 31;
        n nVar = this.d;
        return iHashCode + (nVar != null ? nVar.hashCode() : 0);
    }
}
