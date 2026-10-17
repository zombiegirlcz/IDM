package j61;

import efm.d0;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import pfm.h;
import tof.i1;
import tof.q6;
import ufm.f;
import wsg.n;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f171655a;

    public b(com.revolut.domain.interactors.transactions.a transactionsInteractor, x71.b pendingTransactionsLoaderRepository, n walletInteractor, y91.b accountsProductFeatureChecker) {
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(pendingTransactionsLoaderRepository, "pendingTransactionsLoaderRepository");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(accountsProductFeatureChecker, "accountsProductFeatureChecker");
        this.f171655a = transactionsInteractor;
    }

    public static pfm.a b(b bVar) {
        pfm.a aVar = new pfm.a(bVar.a(), new j4e.c(9, new a(bVar, 1)), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    public static h c(b bVar) {
        return v7.x(new f(bVar.a(), new j4e.c(8, new a(bVar, 0)), 3), "ignoreElement(...)");
    }

    public final d0 a() {
        return d0.m(new q6[]{i1.f272794a});
    }
}
