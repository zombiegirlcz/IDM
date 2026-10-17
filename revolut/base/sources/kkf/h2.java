package kkf;

import com.revolut.feature.transactions.api.navigation.TransactionDetailsDestination;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class h2 extends yji.n implements elf.s0 {

    @NotNull
    public static final f2 Companion = new f2();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f184715l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final nhf.a f184716m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f184717n;
    public final thf.g o;

    public h2(com.revolut.domain.interactors.transactions.a transactionsInteractor, klf.h0 commonDataSource, nhf.a unitedWalletInteractor, thf.g transactionsItemMapper) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(unitedWalletInteractor, "unitedWalletInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(transactionsItemMapper, "transactionsItemMapper");
        this.f184715l = commonDataSource;
        this.f184716m = unitedWalletInteractor;
        this.f184717n = transactionsInteractor;
        this.o = transactionsItemMapper;
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        boolean z;
        if (obj2 instanceof tof.a3) {
            A2(new TransactionDetailsDestination(ofm.q.P((tof.a3) obj2), (rhf.d) null, 6));
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
