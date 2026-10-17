package rmc;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.robo.api.ui.providers.models.RoboTransaction;
import com.revolut.feature.wealth.models.robo.RoboPortfolioInfo;
import glc.k;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import yhm.m;
import yhm.n;
import yhm.o;
import yoc.m;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f255239a;

    public b(m roboTransactionResourcesProvider) {
        Intrinsics.checkNotNullParameter(roboTransactionResourcesProvider, "roboTransactionResourcesProvider");
        this.f255239a = roboTransactionResourcesProvider;
    }

    public final RowDelegate.Model a(RoboPortfolioInfo portfolio, RoboTransaction transaction, q1h.a dateTimeFormat, Object obj2) throws Throwable {
        Object objA;
        k kVar;
        Intrinsics.checkNotNullParameter(portfolio, "portfolio");
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(dateTimeFormat, "dateTimeFormat");
        try {
            m.Companion companion = yhm.m.INSTANCE;
            objA = transaction.getD();
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion2 = yhm.m.INSTANCE;
            objA = o.a(th10);
        }
        if (objA == null) {
            throw new IllegalStateException(("tradeId is null for transaction: " + transaction).toString());
        }
        Throwable thA = yhm.m.a(objA);
        if (thA != null) {
            hx7.e.n(thA);
        }
        if (objA instanceof n) {
            objA = null;
        }
        String strP = (String) objA;
        if (strP == null) {
            strP = j6.a.p("toString(...)");
        }
        String strQ = j6.a.q("transaction-cell-", strP);
        yoc.m mVar = this.f255239a;
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(mVar.c(transaction, portfolio), mVar.d(transaction), null, false, 28);
        Clause clauseF = mVar.f(transaction, portfolio);
        int i = a.f255238a[dateTimeFormat.ordinal()];
        if (i == 1) {
            kVar = k.DATETIME;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            kVar = k.ONLY_TIME;
        }
        return new RowDelegate.Model(strQ, image40, clauseF, null, 0, mVar.e(transaction, kVar), null, null, 0, new RowDelegate.Model.c.b(mVar.g(transaction), null, null, false, 126), false, null, false, null, null, null, null, null, null, obj2, null, 0, 0, 0, 0, 532675544);
    }
}
