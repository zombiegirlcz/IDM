package xwd;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.staking.impl.unstake.v2.UnstakeController;
import com.revolut.feature.staking.impl.unstake.v2.UnstakeControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ UnstakeController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(UnstakeController unstakeController, Continuation continuation) {
        super(2, continuation);
        this.u = unstakeController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.staking.impl.unstake.v2.a aVar2 = (com.revolut.feature.staking.impl.unstake.v2.a) this.u.R2();
        oki.h.v2(aVar2.A, new UnstakeControllerContract$ModalStep.LockUpDialog(aVar2.o.f88082b.f88087b.f88062c), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        return Unit.f186387a;
    }
}
