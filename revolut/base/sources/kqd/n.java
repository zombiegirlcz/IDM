package kqd;

import aqd.i0;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.models.RemainingBalanceDestination;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.IncomeSorterReviewContract$ReviewMode;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import wp5.y;

/* JADX INFO: loaded from: classes7.dex */
public final class n extends com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final do3.n f188390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f188391c;
    public final RemainingBalanceDestination d;
    public final a3 e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i0 f188392g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final IncomeSorterReviewContract$ReviewMode f188393h;

    public n(do3.n user, ArrayList destinations, RemainingBalanceDestination remainingBalanceDestination, a3 transaction, List rates, i0 sortMethod, IncomeSorterReviewContract$ReviewMode reviewMode) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(destinations, "destinations");
        Intrinsics.checkNotNullParameter(remainingBalanceDestination, "remainingBalanceDestination");
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(rates, "rates");
        Intrinsics.checkNotNullParameter(sortMethod, "sortMethod");
        Intrinsics.checkNotNullParameter(reviewMode, "reviewMode");
        this.f188390b = user;
        this.f188391c = destinations;
        this.d = remainingBalanceDestination;
        this.e = transaction;
        this.f = rates;
        this.f188392g = sortMethod;
        this.f188393h = reviewMode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f188390b, nVar.f188390b) && this.f188391c.equals(nVar.f188391c) && Intrinsics.f(this.d, nVar.d) && Intrinsics.f(this.e, nVar.e) && Intrinsics.f(this.f, nVar.f) && this.f188392g == nVar.f188392g && this.f188393h.equals(nVar.f188393h);
    }

    public final int hashCode() {
        return this.f188393h.hashCode() + ((this.f188392g.hashCode() + p.a.d(y.f(this.e, (this.d.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f188391c, this.f188390b.hashCode() * 31, 31)) * 31, 31), 31, this.f)) * 31);
    }
}
