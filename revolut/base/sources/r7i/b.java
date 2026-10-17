package r7i;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f252211a;

    public b(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f252211a = featureToggleInteractor;
    }

    public static boolean a(kel.b bVar, TradingAccount.Margin margin) {
        ArrayList arrayList = margin.f105192g;
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            if (Intrinsics.f(((TradingAccount.Portfolio) it8.next()).f105210a.toString(), bVar.f183148a.f183146b)) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(TradingAccount.Margin margin, x5i.d dVar, kel.b bVar) {
        Object next;
        com.revolut.shared.feature.wealth.models.trading_accounts.a aVar;
        Iterator it8 = margin.f105192g.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((TradingAccount.Portfolio) next).f105210a.toString(), bVar.f183148a.f183146b)) {
                break;
            }
        }
        TradingAccount.Portfolio portfolio = (TradingAccount.Portfolio) next;
        if (portfolio == null || (aVar = portfolio.f105211b) == null) {
            return false;
        }
        int i = a.f252207a[dVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (!com.revolut.shared.feature.wealth.models.trading_accounts.d.i(margin) || aVar != com.revolut.shared.feature.wealth.models.trading_accounts.a.ACTIVE) {
                return false;
            }
        } else {
            if (!com.revolut.shared.feature.wealth.models.trading_accounts.d.k(margin)) {
                return false;
            }
            com.revolut.shared.feature.wealth.models.trading_accounts.a[] elements = {com.revolut.shared.feature.wealth.models.trading_accounts.a.ACTIVE, com.revolut.shared.feature.wealth.models.trading_accounts.a.OFFBOARDING};
            Intrinsics.checkNotNullParameter(elements, "elements");
            if (!kotlin.collections.d.y0(elements).contains(aVar)) {
                return false;
            }
        }
        return true;
    }
}
