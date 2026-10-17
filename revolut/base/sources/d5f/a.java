package d5f;

import av8.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.wealth.api.domain.model.transactions.InvestTransaction;
import kbh.f;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f111409a;

    public a(f tradeUiDataMapper) {
        Intrinsics.checkNotNullParameter(tradeUiDataMapper, "tradeUiDataMapper");
        this.f111409a = tradeUiDataMapper;
    }

    @Override // q1h.e
    public final RowDelegate.Model a(InvestTransaction transaction, q1h.b options, Object obj2) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(options, "options");
        return this.f111409a.c(transaction.getF85125a(), transaction.getF85126b().f95317a, xam.a.E(options.f241442a), null, transaction.getF85126b().f95318b, new o(obj2, 6));
    }
}
