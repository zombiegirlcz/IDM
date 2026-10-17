package v77;

import com.revolut.feature.global_markets.domain.MarketAsset;
import gim.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ List f286567w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, List list, Continuation continuation) {
        super(2, continuation);
        this.v = eVar;
        this.f286567w = list;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, this.f286567w, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((xi0.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Pair pair;
        Pair pair2;
        xi0.b bVar = (xi0.b) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        List<MarketAsset> list = this.f286567w;
        ArrayList arrayList = new ArrayList();
        for (MarketAsset marketAsset : list) {
            if (marketAsset instanceof MarketAsset.Index) {
                pair2 = null;
            } else {
                if (marketAsset instanceof MarketAsset.Commodity) {
                    pair = new Pair(((MarketAsset.Commodity) marketAsset).f74568a, bVar);
                } else {
                    if (!(marketAsset instanceof MarketAsset.CurrencyPair)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    MarketAsset.CurrencyPair currencyPair = (MarketAsset.CurrencyPair) marketAsset;
                    pair = new Pair(currencyPair.f74569a, currencyPair.f74570b);
                }
                pair2 = pair;
            }
            if (pair2 != null) {
                arrayList.add(pair2);
            }
        }
        b bVar2 = e.Companion;
        return rd0.e.b(arrayList.isEmpty() ? zi0.c.j(f0.f322471a) : this.v.f286568a.d(arrayList, e.d));
    }
}
