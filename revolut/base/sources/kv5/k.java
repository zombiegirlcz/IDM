package kv5;

import com.revolut.feature.crypto_investments.api.widget.investments.sorting.CryptoInvestmentsSortingType;
import com.revolut.feature.crypto_investments.models.SplitAccountsItemGroup;
import java.util.Iterator;
import java.util.List;
import kkf.x5;
import kkf.z7;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import vkm.c2;
import vkm.d2;
import vkm.t1;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements ut5.g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ppk.f f189966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o76.d f189967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineScope f189968c;
    public final Lazy d;
    public final t1 e;
    public final t1 f;

    public k(k18.c derivativesBalanceInteractor, xv5.c cryptoCommodityBaseCurrencyInteractor, ppk.f ratesInteractor, o76.d derivativesEnabledStateChecker, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(derivativesBalanceInteractor, "derivativesBalanceInteractor");
        Intrinsics.checkNotNullParameter(cryptoCommodityBaseCurrencyInteractor, "cryptoCommodityBaseCurrencyInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(derivativesEnabledStateChecker, "derivativesEnabledStateChecker");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f189966a = ratesInteractor;
        this.f189967b = derivativesEnabledStateChecker;
        this.f189968c = coroutineScope;
        this.d = yhm.j.b(new kob.a(this, 7));
        Flow flowD = k18.c.D(derivativesBalanceInteractor);
        c2 c2Var = d2.Companion;
        this.e = vkm.q.M(flowD, coroutineScope, c2.a(c2Var, 500L, 2), 1);
        this.f = vkm.q.M(rd0.e.b(xv5.c.b(cryptoCommodityBaseCurrencyInteractor)), coroutineScope, c2.a(c2Var, 500L, 2), 1);
    }

    public static dj0.d c(dj0.d dVar, List list, xi0.b bVar) {
        Object next;
        if (list == null) {
            return dVar;
        }
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((qta.c) next).f249047b, bVar)) {
                break;
            }
        }
        qta.c cVar = (qta.c) next;
        return (cVar == null || Intrinsics.f(dVar.f115083b, bVar)) ? dVar : pyd.c.L(dVar, cVar.f249048c, cVar.f249047b);
    }

    @Override // ut5.g
    public final Flow a(st5.b itemsLimit, CryptoInvestmentsSortingType sortingType) {
        Intrinsics.checkNotNullParameter(itemsLimit, "itemsLimit");
        Intrinsics.checkNotNullParameter(sortingType, "sortingType");
        return this.f189967b.a() ? new z7((Flow) this.d.getValue(), this, 14) : new go.g(SplitAccountsItemGroup.Empty.f71455a, 2);
    }

    @Override // ut5.g
    public final Flow b() {
        return this.f189967b.a() ? new x5((Flow) this.d.getValue(), 18) : new go.g(ut5.j.HIDDEN, 2);
    }
}
