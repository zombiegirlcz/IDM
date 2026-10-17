package a5i;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature_market_data_api.navigation.TransactionUnitsType;
import com.revolut.feature_market_data_impl.ui.breakdown.kompot.screens.transaction_price_description.TransactionPriceDescriptionScreenContract$InputData;
import java.math.BigDecimal;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;

/* JADX INFO: loaded from: classes10.dex */
public final class p extends oki.h implements o {
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vii.b f1428p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f1429q;

    public p(TransactionPriceDescriptionScreenContract$InputData inputData, c transactionPriceDescriptionDelegate, r stateMapper) {
        BigDecimal ZERO;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(transactionPriceDescriptionDelegate, "transactionPriceDescriptionDelegate");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = transactionPriceDescriptionDelegate;
        this.f1428p = new vii.b();
        TransactionUnitsType transactionUnitsType = inputData.f97177a.d;
        TransactionUnitsType.Lots lots = transactionUnitsType instanceof TransactionUnitsType.Lots ? (TransactionUnitsType.Lots) transactionUnitsType : null;
        if (lots == null) {
            hx7.e.h(new IllegalStateException(j6.a.q("lotQuantity is expected, but unitsType=", o0.f186429a.b(inputData.f97177a.d.getClass()).m())));
            ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        } else {
            ZERO = lots.f97102a;
        }
        this.f1429q = mra.d.b(this, new h(ZERO, new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, vkm.q.Q(this.f1428p, new a0e.m(continuation, this, 7)), null, new a0l.k(this, continuation, 11), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f1429q;
    }
}
