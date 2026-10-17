package ou1;

import com.revolut.feature.apm.blik.api.navigation.BlikFlowDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends i implements Function2 {
    public com.revolut.feature.apm.blik.impl.ui.flow.a u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.blik.impl.ui.flow.a f229769w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.feature.apm.blik.impl.ui.flow.a aVar, Continuation continuation) {
        super(2, continuation);
        this.f229769w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.f229769w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.feature.apm.blik.impl.ui.flow.a aVar;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            com.revolut.feature.apm.blik.impl.ui.flow.a aVar3 = this.f229769w;
            BlikFlowDestination.StartType startType = aVar3.f61684y.f61648a;
            this.u = aVar3;
            this.v = 1;
            Object objO2 = com.revolut.feature.apm.blik.impl.ui.flow.a.O2(aVar3, startType, this);
            if (objO2 == aVar2) {
                return aVar2;
            }
            aVar = aVar3;
            obj2 = objO2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = this.u;
            o.b(obj2);
        }
        g.F2(aVar, (FlowStep) obj2, false, TransitionAnimation.NONE.f98393a, 8);
        return Unit.f186387a;
    }
}
