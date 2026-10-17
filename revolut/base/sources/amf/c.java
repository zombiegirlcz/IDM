package amf;

import ael.l0;
import elf.n0;
import klf.h0;
import klf.n2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.SharedFlow;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f6368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n2 f6369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f6370c;
    public final n0 d;

    public c(h0 commonDataSource, n2 splitBillDataSource, b hideTransactionMenuAvailabilityChecker, n0 hideTransactionClickHandler) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(splitBillDataSource, "splitBillDataSource");
        Intrinsics.checkNotNullParameter(hideTransactionMenuAvailabilityChecker, "hideTransactionMenuAvailabilityChecker");
        Intrinsics.checkNotNullParameter(hideTransactionClickHandler, "hideTransactionClickHandler");
        this.f6368a = commonDataSource;
        this.f6369b = splitBillDataSource;
        this.f6370c = hideTransactionMenuAvailabilityChecker;
        this.d = hideTransactionClickHandler;
    }

    public final cmf.k a() {
        return new cmf.k(new t38.e(this.f6368a.d(), 24, (SharedFlow) this.f6369b.f185540g.getValue(), new l0(3, this, c.class, "buildMenuItems", "buildMenuItems(Lcom/revolut/feature/transactions/models/Transaction;Lcom/revolut/feature/transactions/impl/ui/kompot/details/data_source/SplitBillDataState;)Ljava/util/List;", 4, 2)), u.c(this.d), "HideTransaction");
    }
}
