package sqd;

import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.models.RemainingBalanceDestination;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.IncomeSorterReviewContract$ReviewMode;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final do3.n f265050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f265051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RemainingBalanceDestination f265052c;
    public final a3 d;
    public final List e;
    public final aqd.i0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IncomeSorterReviewContract$ReviewMode f265053g;

    public d(do3.n user, ArrayList destinations, RemainingBalanceDestination remainingBalanceDestination, a3 transaction, List rates, aqd.i0 sortMethod, IncomeSorterReviewContract$ReviewMode reviewMode) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(destinations, "destinations");
        Intrinsics.checkNotNullParameter(remainingBalanceDestination, "remainingBalanceDestination");
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(rates, "rates");
        Intrinsics.checkNotNullParameter(sortMethod, "sortMethod");
        Intrinsics.checkNotNullParameter(reviewMode, "reviewMode");
        this.f265050a = user;
        this.f265051b = destinations;
        this.f265052c = remainingBalanceDestination;
        this.d = transaction;
        this.e = rates;
        this.f = sortMethod;
        this.f265053g = reviewMode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f265050a, dVar.f265050a) && this.f265051b.equals(dVar.f265051b) && Intrinsics.f(this.f265052c, dVar.f265052c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && this.f == dVar.f && Intrinsics.f(this.f265053g, dVar.f265053g);
    }

    public final int hashCode() {
        return this.f265053g.hashCode() + ((this.f.hashCode() + p.a.d(wp5.y.f(this.d, (this.f265052c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f265051b, this.f265050a.hashCode() * 31, 31)) * 31, 31), 31, this.e)) * 31);
    }
}
