package q87;

import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.core.ui_kit.models.IndexBarModel;
import com.revolut.feature.global_markets.api.navigation.GlobalMarketsFeatureConfig$IndexDetailsDestination;
import com.revolut.feature.global_markets.impl.ui.redesign.screen.market.MarketDetailsRedesignScreen;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MarketDetailsRedesignScreen f243018w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(MarketDetailsRedesignScreen marketDetailsRedesignScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f243018w = marketDetailsRedesignScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i iVar = new i(this.f243018w, continuation, 0);
                iVar.v = obj2;
                return iVar;
            default:
                i iVar2 = new i(this.f243018w, continuation, 1);
                iVar2.v = obj2;
                return iVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((i) create((g6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((i) create((IndexBarModel) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Continuation continuation;
        Object next;
        int i = this.u;
        MarketDetailsRedesignScreen marketDetailsRedesignScreen = this.f243018w;
        switch (i) {
            case 0:
                g6 selectedData = (g6) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                k kVarD = marketDetailsRedesignScreen.d();
                Intrinsics.h(selectedData);
                com.revolut.feature.global_markets.impl.ui.redesign.screen.market.a aVar2 = (com.revolut.feature.global_markets.impl.ui.redesign.screen.market.a) kVarD;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(selectedData, "selectedData");
                Iterator it8 = t87.m.f268859a.iterator();
                while (true) {
                    continuation = null;
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (Intrinsics.f(((eel.c) next).getId(), selectedData.f54199a)) {
                        }
                    } else {
                        next = null;
                    }
                }
                eel.c cVar = (eel.c) next;
                if (cVar != null) {
                    aVar2.n2(new q03.m(aVar2, cVar, continuation, 21), new whi.b(6));
                }
                break;
            default:
                IndexBarModel indexBarModel = (IndexBarModel) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                k kVarD2 = marketDetailsRedesignScreen.d();
                Intrinsics.h(indexBarModel);
                com.revolut.feature.global_markets.impl.ui.redesign.screen.market.a aVar4 = (com.revolut.feature.global_markets.impl.ui.redesign.screen.market.a) kVarD2;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(indexBarModel, "indexBarModel");
                j77.b descriptor = indexBarModel.e;
                aVar4.z.getClass();
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                aVar4.C1(new GlobalMarketsFeatureConfig$IndexDetailsDestination(descriptor.f171863a, descriptor.f171864b));
                break;
        }
        return Unit.f186387a;
    }
}
