package pu5;

import com.revolut.domain.interactors.transactions.TransactionContext;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import tof.i7;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g8i.a f239832a;

    public e(g8i.a navigationChecker) {
        Intrinsics.checkNotNullParameter(navigationChecker, "navigationChecker");
        this.f239832a = navigationChecker;
    }

    public final rhf.e a(a3 transaction, i7 filter, String searchQuery) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        return new rhf.e(transaction, filter, new TransactionContext(null, TransactionContext.DataSet.AllIncluded.f60268a, 1), searchQuery, rhf.d.CRYPTO);
    }

    public final boolean b(a3 transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return this.f239832a.a();
    }
}
