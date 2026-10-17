package kkf;

import com.revolut.feature.transactions.api.navigation.TransactionDetailsDestination;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class t2 extends yji.n implements elf.s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f184949l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f184950m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final nhf.a f184951n;
    public final thf.g o;

    public t2(com.revolut.domain.interactors.transactions.a transactionsInteractor, klf.h0 commonDataSource, nhf.a unitedWalletInteractor, thf.g transactionsRowMapper) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(unitedWalletInteractor, "unitedWalletInteractor");
        Intrinsics.checkNotNullParameter(transactionsRowMapper, "transactionsRowMapper");
        this.f184949l = commonDataSource;
        this.f184950m = transactionsInteractor;
        this.f184951n = unitedWalletInteractor;
        this.o = transactionsRowMapper;
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        boolean z = false;
        if (kotlin.text.a0.H(str, "TransactionListItem_", false) && (obj2 instanceof tof.a3)) {
            A2(new TransactionDetailsDestination(ofm.q.P((tof.a3) obj2), (rhf.d) null, 6));
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
