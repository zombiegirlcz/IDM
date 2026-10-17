package k1e;

import com.revolut.feature.stock_lending.impl.ui.screens.transaction.StockLendingTransactionDetailsScreenContract$InputData;
import jki.i;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends jki.g implements e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f180222p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p stateMapper, StockLendingTransactionDetailsScreenContract$InputData inputData) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f180222p = new d(inputData.f88410a);
    }

    @Override // jki.g
    public final i r2() {
        return this.f180222p;
    }
}
