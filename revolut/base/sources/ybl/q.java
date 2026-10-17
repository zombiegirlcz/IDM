package ybl;

import ael.e1;
import ael.j1;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import nel.y;
import zhm.q0;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
public interface q {
    static akg.n a(q qVar, nel.n instrument, TradingAccountType accountType) {
        j1 j1Var = (j1) qVar;
        j1Var.getClass();
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(j1Var.c(q0.c(new Pair(instrument.f214596b, u.c(new y(instrument, accountType)))), loadingStrategy), new e1(instrument, 0));
    }
}
