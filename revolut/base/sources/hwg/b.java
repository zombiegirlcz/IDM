package hwg;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccounts;
import com.revolut.shared.feature.wealth.models.trading_accounts.d;
import efm.i;
import hhm.f;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KClass;
import qfm.t0;
import vf0.q;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f156174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KClass f156175b;

    public /* synthetic */ b(KClass kClass, int i) {
        this.f156174a = i;
        this.f156175b = kClass;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f156174a;
        boolean z = false;
        KClass kClass = this.f156175b;
        switch (i) {
            case 0:
                TradingAccounts accounts = (TradingAccounts) obj2;
                Intrinsics.checkNotNullParameter(accounts, "accounts");
                List<TradingAccount> list = accounts.f105278a;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (TradingAccount tradingAccount : list) {
                        if (kClass.l(tradingAccount) && (d.g(tradingAccount) || d.e(tradingAccount))) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 1:
                i a7 = (i) obj2;
                Intrinsics.checkNotNullParameter(a7, "errors");
                i b4 = i.k(0, Integer.MAX_VALUE);
                Intrinsics.checkNotNullExpressionValue(b4, "range(...)");
                Intrinsics.checkNotNullParameter(a7, "a");
                Intrinsics.checkNotNullParameter(b4, "b");
                t0 t0VarS = i.s(a7, b4, new q(0));
                Intrinsics.checkNotNullExpressionValue(t0VarS, "zip(...)");
                u3a.q qVar = new u3a.q(new b(kClass, 2), 27);
                int i2 = i.f125385a;
                return t0VarS.f(qVar, i2, i2);
            default:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Throwable th10 = (Throwable) pair.f186385a;
                Integer num = (Integer) pair.f186386b;
                if (!o0.f186429a.b(th10.getClass()).equals(kClass) || num.intValue() >= 3) {
                    return i.c(th10);
                }
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                int i3 = i.f125385a;
                return i.r(1000L, f.f152430b);
        }
    }
}
