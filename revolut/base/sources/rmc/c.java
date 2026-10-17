package rmc;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.robo.api.ui.providers.models.RoboTransaction;
import com.revolut.feature.robo.impl.ui.providers.invest.transactions.InvestRoboAccountTransactionsContract$Transaction;
import com.revolut.feature.wealth.api.domain.model.transactions.InvestTransaction;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import yhm.m;
import yhm.n;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f255240a;

    public c(b tradeItemMapper) {
        Intrinsics.checkNotNullParameter(tradeItemMapper, "tradeItemMapper");
        this.f255240a = tradeItemMapper;
    }

    @Override // q1h.e
    public final RowDelegate.Model a(InvestTransaction transaction, q1h.b options, Object obj2) throws Throwable {
        Object objA;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(options, "options");
        try {
            m.Companion companion = m.INSTANCE;
            InvestRoboAccountTransactionsContract$Transaction investRoboAccountTransactionsContract$Transaction = (InvestRoboAccountTransactionsContract$Transaction) transaction;
            RoboTransaction roboTransaction = investRoboAccountTransactionsContract$Transaction.f85127c;
            objA = this.f255240a.a(investRoboAccountTransactionsContract$Transaction.d, roboTransaction, options.f241442a, obj2);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        Throwable thA = m.a(objA);
        if (thA != null) {
            hx7.e.n(thA);
        }
        if (objA instanceof n) {
            objA = null;
        }
        return (RowDelegate.Model) objA;
    }
}
