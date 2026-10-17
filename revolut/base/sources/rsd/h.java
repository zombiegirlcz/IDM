package rsd;

import com.revolut.retail.trading.core.domain.account_closure.AccountClosureStatus;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f257057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TradingAccount.Portfolio f257058b;

    public /* synthetic */ h(TradingAccount.Portfolio portfolio, int i) {
        this.f257057a = i;
        this.f257058b = portfolio;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f257057a) {
            case 0:
                del.b it8 = (del.b) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new Pair(this.f257058b, it8);
            case 1:
                AccountClosureStatus it9 = (AccountClosureStatus) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new Pair(this.f257058b.f105210a.toString(), it9);
            default:
                return new Pair(this.f257058b.f105210a.toString(), (del.b) obj2);
        }
    }
}
