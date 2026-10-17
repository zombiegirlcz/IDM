package mx5;

import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.retail.RetailCryptoTradeFlow;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RetailCryptoTradeFlow f210209w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(RetailCryptoTradeFlow retailCryptoTradeFlow, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f210209w = retailCryptoTradeFlow;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f210209w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            case 1:
                c cVar2 = new c(this.f210209w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
            default:
                c cVar3 = new c(this.f210209w, continuation, 2);
                cVar3.v = obj2;
                return cVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((iw5.h) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        RetailCryptoTradeFlow retailCryptoTradeFlow = this.f210209w;
        switch (i) {
            case 0:
                String query = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                e eVarE3 = retailCryptoTradeFlow.e3();
                Intrinsics.h(query);
                com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.retail.a aVar2 = (com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.retail.a) eVarE3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                lx5.b bVar = (lx5.b) aVar2.f71557q;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                bVar.f200528b.k(new iw5.f(query));
                return Unit.f186387a;
            case 1:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                e eVarE32 = retailCryptoTradeFlow.e3();
                Intrinsics.h(clickData);
                com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.retail.a aVar4 = (com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.retail.a) eVarE32;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                lx5.b bVar2 = (lx5.b) aVar4.f71557q;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                bVar2.f200528b.k(new iw5.d(clickData));
                return Unit.f186387a;
            default:
                iw5.h hVar = (iw5.h) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (!Intrinsics.f(hVar, iw5.h.f168966a)) {
                    throw new NoWhenBranchMatchedException();
                }
                KProperty[] kPropertyArr = RetailCryptoTradeFlow.P;
                retailCryptoTradeFlow.d3().f178927b.i0();
                return Unit.f186387a;
        }
    }
}
