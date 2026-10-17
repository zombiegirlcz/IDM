package bwf;

import com.revolut.feature.transport.impl.ui.hub.TransportHubFlow;
import com.revolut.feature.transport.impl.ui.location.TransportLocationChooserScreen;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.flow.BaseFlow;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TransportHubFlow v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(TransportHubFlow transportHubFlow, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = transportHubFlow;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            default:
                return new e(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TransportHubFlow transportHubFlow = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                KProperty[] kPropertyArr = TransportHubFlow.X;
                if (!transportHubFlow.F2()) {
                    com.revolut.kompot.navigable.a aVar2 = transportHubFlow.f98405m;
                    BaseFlow baseFlow = aVar2 instanceof BaseFlow ? (BaseFlow) aVar2 : null;
                    if (baseFlow != null) {
                        baseFlow.O2();
                    }
                }
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.transport.impl.ui.hub.a aVar4 = (com.revolut.feature.transport.impl.ui.hub.a) transportHubFlow.Q2();
                aVar4.getClass();
                aVar4.Y1(new TransportLocationChooserScreen(), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a, new i(aVar4, 1));
                break;
        }
        return Unit.f186387a;
    }
}
