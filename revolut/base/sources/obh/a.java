package obh;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.wealth.api.domain.model.transactions.InvestTransaction;
import ib6.j;
import kbh.f;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f223955a;

    public a(f tradeUiDataMapper) {
        Intrinsics.checkNotNullParameter(tradeUiDataMapper, "tradeUiDataMapper");
        this.f223955a = tradeUiDataMapper;
    }

    @Override // q1h.e
    public final RowDelegate.Model a(InvestTransaction transaction, q1h.b options, Object obj2) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(options, "options");
        return this.f223955a.c(transaction.getF85125a(), transaction.getF85126b().f95317a, xam.a.E(options.f241442a), null, transaction.getF85126b().f95318b, new j(obj2, 14));
    }
}
