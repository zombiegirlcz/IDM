package sc6;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TimeClause;
import fub.k;
import k71.q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import pyb.s;
import thf.f;
import thf.g;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f261636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f261637b;

    public a(g transactionsItemMapper, k revPointsTransactionItemsMapper) {
        Intrinsics.checkNotNullParameter(transactionsItemMapper, "transactionsItemMapper");
        Intrinsics.checkNotNullParameter(revPointsTransactionItemsMapper, "revPointsTransactionItemsMapper");
        this.f261636a = transactionsItemMapper;
        this.f261637b = revPointsTransactionItemsMapper;
    }

    public final RowDelegate.Model a(qa6.c transaction, q transactionsExtraData) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(transactionsExtraData, "transactionsExtraData");
        if (transaction instanceof qa6.a) {
            return ((anf.k) this.f261636a).p(((qa6.a) transaction).f243962a, transactionsExtraData, new f(false, 3));
        }
        if (!(transaction instanceof qa6.b)) {
            throw new NoWhenBranchMatchedException();
        }
        return ((s) this.f261637b).g(((qa6.b) transaction).f243964a, transactionsExtraData, new TimeClause.Format.Pretty(0));
    }
}
