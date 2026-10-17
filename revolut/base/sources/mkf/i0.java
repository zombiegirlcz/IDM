package mkf;

import com.revolut.feature.transactions.api.navigation.TransactionDetailsDestination;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class i0 extends yji.n implements elf.s0 {

    @NotNull
    public static final g0 Companion = new g0();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f206247l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f206248m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final nhf.a f206249n;
    public final thf.g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final thf.d f206250p;

    public i0(klf.h0 commonDataSource, com.revolut.domain.interactors.transactions.a transactionsInteractor, nhf.a unitedWalletInteractor, thf.g transactionsItemMapper, thf.d transactionIconResourcesMapper) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(unitedWalletInteractor, "unitedWalletInteractor");
        Intrinsics.checkNotNullParameter(transactionsItemMapper, "transactionsItemMapper");
        Intrinsics.checkNotNullParameter(transactionIconResourcesMapper, "transactionIconResourcesMapper");
        this.f206247l = commonDataSource;
        this.f206248m = transactionsInteractor;
        this.f206249n = unitedWalletInteractor;
        this.o = transactionsItemMapper;
        this.f206250p = transactionIconResourcesMapper;
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        boolean z;
        if (obj2 instanceof a3) {
            A2(new TransactionDetailsDestination(ofm.q.P((a3) obj2), (rhf.d) null, 6));
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
