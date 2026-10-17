package vif;

import com.revolut.feature.transactions.impl.data.network.SavingsInterestTransactionsService;
import com.revolut.feature.transactions.impl.data.network.TransactionsService;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f289586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f289587b;

    public a(SavingsInterestTransactionsService savingsInterestTransactionsService) {
        this.f289586a = 3;
        Intrinsics.checkNotNullParameter(savingsInterestTransactionsService, "savingsInterestTransactionsService");
        this.f289587b = savingsInterestTransactionsService;
    }

    @Override // vif.f
    public final d0 a(String id10, String str) {
        switch (this.f289586a) {
            case 0:
                Intrinsics.checkNotNullParameter(id10, "id");
                return ((TransactionsService) this.f289587b).getLastUserTransactions(100, (20 & 2) != 0 ? null : null, (20 & 4) != 0 ? null : str, (20 & 8) != 0 ? null : null, (20 & 16) == 0 ? "EXTERNAL" : null, "UPCOMING_REFUNDS");
            case 1:
                Intrinsics.checkNotNullParameter(id10, "id");
                return ((TransactionsService) this.f289587b).getLastUserTransactions(100, (20 & 2) != 0 ? null : null, (20 & 4) != 0 ? null : str, (20 & 8) != 0 ? null : null, (20 & 16) == 0 ? "EXTERNAL" : null, "UPCOMING_REFUNDS");
            case 2:
                Intrinsics.checkNotNullParameter(id10, "id");
                return ((TransactionsService) this.f289587b).getLastUserTransactions(100, (20 & 2) != 0 ? null : id10, (20 & 4) != 0 ? null : null, (20 & 8) != 0 ? null : str, (20 & 16) == 0 ? "EXTERNAL" : null, "UPCOMING_REFUNDS");
            default:
                Intrinsics.checkNotNullParameter(id10, "id");
                return ((SavingsInterestTransactionsService) this.f289587b).getLastUserTransactions(100);
        }
    }

    @Override // vif.f
    public final d0 b(long j2, String id10, String str) {
        switch (this.f289586a) {
            case 0:
                Intrinsics.checkNotNullParameter(id10, "id");
                return ((TransactionsService) this.f289587b).getTransactionsBeforeDate(j2, 100, (40 & 4) != 0 ? null : null, (40 & 8) != 0 ? null : str, (40 & 16) != 0 ? null : null, (40 & 32) == 0 ? "EXTERNAL" : null, "UPCOMING_REFUNDS");
            case 1:
                Intrinsics.checkNotNullParameter(id10, "id");
                return ((TransactionsService) this.f289587b).getTransactionsBeforeDate(j2, 100, (40 & 4) != 0 ? null : null, (40 & 8) != 0 ? null : str, (40 & 16) != 0 ? null : null, (40 & 32) == 0 ? "EXTERNAL" : null, "UPCOMING_REFUNDS");
            case 2:
                Intrinsics.checkNotNullParameter(id10, "id");
                return ((TransactionsService) this.f289587b).getTransactionsBeforeDate(j2, 100, (40 & 4) != 0 ? null : id10, (40 & 8) != 0 ? null : null, (40 & 16) != 0 ? null : str, (40 & 32) == 0 ? "EXTERNAL" : null, "UPCOMING_REFUNDS");
            default:
                Intrinsics.checkNotNullParameter(id10, "id");
                return ((SavingsInterestTransactionsService) this.f289587b).getTransactionsBeforeDate(j2, 100);
        }
    }

    @Override // vif.f
    public final d0 c(long j2, String id10, String str) {
        switch (this.f289586a) {
            case 0:
                Intrinsics.checkNotNullParameter(id10, "id");
                return ((TransactionsService) this.f289587b).getTransactionsAfterDate(j2, 100, (16 & 4) != 0 ? null : null, str, (16 & 16) == 0 ? "EXTERNAL" : null, "UPCOMING_REFUNDS");
            case 1:
                Intrinsics.checkNotNullParameter(id10, "id");
                return ((TransactionsService) this.f289587b).getTransactionsAfterDate(j2, 100, (16 & 4) != 0 ? null : null, str, (16 & 16) == 0 ? "EXTERNAL" : null, "UPCOMING_REFUNDS");
            case 2:
                Intrinsics.checkNotNullParameter(id10, "id");
                return ((TransactionsService) this.f289587b).getTransactionsAfterDate(j2, 100, (16 & 4) != 0 ? null : id10, str, (16 & 16) == 0 ? "EXTERNAL" : null, "UPCOMING_REFUNDS");
            default:
                Intrinsics.checkNotNullParameter(id10, "id");
                return ((SavingsInterestTransactionsService) this.f289587b).getTransactionsAfterDate(j2, 100);
        }
    }

    public a(TransactionsService transactionsService, int i) {
        this.f289586a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(transactionsService, "transactionsService");
                this.f289587b = transactionsService;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(transactionsService, "transactionsService");
                this.f289587b = transactionsService;
                break;
            default:
                Intrinsics.checkNotNullParameter(transactionsService, "transactionsService");
                this.f289587b = transactionsService;
                break;
        }
    }
}
