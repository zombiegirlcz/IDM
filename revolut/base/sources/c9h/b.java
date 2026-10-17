package c9h;

import a94.q;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f22455b;

    public /* synthetic */ b(k kVar, int i) {
        this.f22454a = i;
        this.f22455b = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f22454a) {
            case 0:
                kel.b cashHolding = (kel.b) obj2;
                Intrinsics.checkNotNullParameter(cashHolding, "cashHolding");
                return nim.a.v(wzg.a.a(this.f22455b, cashHolding, null, 2), new c(cashHolding, 0));
            case 1:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                kel.b bVar = (kel.b) pair.f186385a;
                if (!(((TradingAccount) pair.f186386b) instanceof TradingAccount.Margin)) {
                    return new go.g(zi0.c.P(bVar.e, false, null, 3), 2);
                }
                xi0.b bVarF = yoj.b.f(bVar);
                k kVar = this.f22455b;
                return nim.a.v(p2b.j.b(kVar.e, bVar.f183148a.f183146b, bVarF, 4), new q(kVar, bVarF, 14));
            default:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                xi0.b bVar2 = (xi0.b) pair2.f186385a;
                return this.f22455b.f((List) pair2.f186386b, bVar2, null);
        }
    }
}
