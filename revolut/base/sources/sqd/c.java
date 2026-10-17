package sqd;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.IncomeSorterReviewContract$ReviewMode;
import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f265045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f265046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a3 f265047c;
    public final k71.q d;
    public final aqd.i0 e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Clause f265048g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final IncomeSorterReviewContract$ReviewMode f265049h;

    public c(List processedDestinations, dj0.d destinationsTotal, a3 transaction, k71.q transactionsExtraData, aqd.i0 sortMethod, List reviewDisclaimers, Clause clause, IncomeSorterReviewContract$ReviewMode reviewMode) {
        Intrinsics.checkNotNullParameter(processedDestinations, "processedDestinations");
        Intrinsics.checkNotNullParameter(destinationsTotal, "destinationsTotal");
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(transactionsExtraData, "transactionsExtraData");
        Intrinsics.checkNotNullParameter(sortMethod, "sortMethod");
        Intrinsics.checkNotNullParameter(reviewDisclaimers, "reviewDisclaimers");
        Intrinsics.checkNotNullParameter(reviewMode, "reviewMode");
        this.f265045a = processedDestinations;
        this.f265046b = destinationsTotal;
        this.f265047c = transaction;
        this.d = transactionsExtraData;
        this.e = sortMethod;
        this.f = reviewDisclaimers;
        this.f265048g = clause;
        this.f265049h = reviewMode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f265045a, cVar.f265045a) && Intrinsics.f(this.f265046b, cVar.f265046b) && Intrinsics.f(this.f265047c, cVar.f265047c) && Intrinsics.f(this.d, cVar.d) && this.e == cVar.e && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f265048g, cVar.f265048g) && Intrinsics.f(this.f265049h, cVar.f265049h);
    }

    public final int hashCode() {
        int iD = p.a.d((this.e.hashCode() + ((this.d.hashCode() + wp5.y.f(this.f265047c, v7.c(this.f265045a.hashCode() * 31, 31, this.f265046b), 31)) * 31)) * 31, 31, this.f);
        Clause clause = this.f265048g;
        return this.f265049h.hashCode() + ((iD + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
