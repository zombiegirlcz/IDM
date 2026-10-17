package nze;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.topup_screen.impl.flows.topup_flows.mandate.MandateTopupFlow;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ MandateTopupFlow u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(MandateTopupFlow mandateTopupFlow, Continuation continuation) {
        super(2, continuation);
        this.u = mandateTopupFlow;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        MandateTopupFlow mandateTopupFlow = this.u;
        j60.a.v((j60.a) mandateTopupFlow.P.getValue(), false, null, 3);
        t tVar = (t) ((k) mandateTopupFlow.N.getValue());
        tVar.getClass();
        tVar.n2(new q(tVar, null, 1), new whi.b(6));
        return Unit.f186387a;
    }
}
