package i3e;

import com.revolut.feature.store.impl.ui.home.StoreHomeFlow;
import com.revolut.feature.store.impl.ui.home.StoreHomeFlowContract$ModalStep;
import com.revolut.feature.store.impl.ui.home.a;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ StoreHomeFlow v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(StoreHomeFlow storeHomeFlow, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = storeHomeFlow;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            case 1:
                return new d(this.v, continuation, 1);
            default:
                return new d(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        StoreHomeFlow storeHomeFlow = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.store.impl.ui.home.b) storeHomeFlow.e3()).B2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                oki.h.v2(((com.revolut.feature.store.impl.ui.home.b) storeHomeFlow.e3()).v, StoreHomeFlowContract$ModalStep.BrandFilters.f88694a, ModalDestination.Style.POPUP.f98311a);
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.store.impl.ui.home.b) storeHomeFlow.e3()).C2(a.C0552a.f88699a);
                break;
        }
        return Unit.f186387a;
    }
}
