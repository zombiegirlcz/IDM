package vif;

import com.revolut.feature.transactions.impl.data.network.CryptoExchangeTransactionsService;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoExchangeTransactionsService f289588a;

    public b(CryptoExchangeTransactionsService cryptoExchangeTransactionsService, aif.b transactionsConfigProvider) {
        Intrinsics.checkNotNullParameter(cryptoExchangeTransactionsService, "cryptoExchangeTransactionsService");
        Intrinsics.checkNotNullParameter(transactionsConfigProvider, "transactionsConfigProvider");
        this.f289588a = cryptoExchangeTransactionsService;
    }

    @Override // vif.f
    public final d0 a(String id10, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        CryptoExchangeTransactionsService.Companion companion = CryptoExchangeTransactionsService.INSTANCE;
        return this.f289588a.getLastUserTransactions(100, null, null, null, null);
    }

    @Override // vif.f
    public final d0 b(long j2, String id10, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        CryptoExchangeTransactionsService.Companion companion = CryptoExchangeTransactionsService.INSTANCE;
        return this.f289588a.getTransactionsBeforeDate(j2, 0L, 100, null, null, null, null);
    }

    @Override // vif.f
    public final d0 c(long j2, String id10, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        CryptoExchangeTransactionsService.Companion companion = CryptoExchangeTransactionsService.INSTANCE;
        return this.f289588a.getTransactionsAfterDate(j2, 100, null, null, null, null);
    }
}
