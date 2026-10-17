package c9h;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kel.b f22457b;

    public /* synthetic */ c(kel.b bVar, int i) {
        this.f22456a = i;
        this.f22457b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        switch (this.f22456a) {
            case 0:
                TradingAccount tradingAccount = (TradingAccount) obj2;
                Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
                return new Pair(this.f22457b, tradingAccount);
            default:
                List tradingAccounts = (List) obj2;
                Intrinsics.checkNotNullParameter(tradingAccounts, "tradingAccounts");
                Iterator it8 = tradingAccounts.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        List listJ = ((TradingAccount) next).J();
                        if (!(listJ instanceof Collection) || !listJ.isEmpty()) {
                            Iterator it9 = listJ.iterator();
                            while (it9.hasNext()) {
                                if (Intrinsics.f(((TradingAccount.Portfolio) it9.next()).f105210a.toString(), this.f22457b.f183148a.f183146b)) {
                                }
                            }
                        }
                    } else {
                        next = null;
                    }
                }
                return (TradingAccount) next;
        }
    }
}
