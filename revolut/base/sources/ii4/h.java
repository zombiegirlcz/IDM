package ii4;

import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FinishCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.n1;

/* JADX INFO: loaded from: classes22.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.spinner.a u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.feature.credit.application.plugins.impl.ui.spinner.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.credit.application.plugins.impl.ui.spinner.a aVar2 = this.u;
        if (aVar2.L2()) {
            aVar2.K2(null);
        } else {
            mri.w.r0(aVar2.f68421q, aVar2.f68420p.d.f66892b);
            aVar2.C1(new BridgeDestination(new FinishCommand(new Integer(100), null, null, 6)));
        }
        return Unit.f186387a;
    }
}
