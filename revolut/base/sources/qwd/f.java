package qwd;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.feature.staking.impl.stake.v2.StakeController;
import com.revolut.feature.staking.impl.stake.v2.StakeControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ StakeController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(StakeController stakeController, Continuation continuation) {
        super(2, continuation);
        this.u = stakeController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CenteredAmountDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.staking.impl.stake.v2.b bVar = (com.revolut.feature.staking.impl.stake.v2.b) this.u.R2();
        io3.d dVar = (io3.d) ((m) ((j2) bVar.K.f22677a).getValue()).f249866g.getContent();
        String str = dVar != null ? dVar.f163145a : null;
        com.revolut.kompot.navigable.vc.modal.a aVar2 = bVar.L;
        if (str == null) {
            str = "";
        }
        oki.h.v2(aVar2, new StakeControllerContract$ModalStep.BalancePicker(str), ModalDestination.Style.POPUP.f98311a);
        return Unit.f186387a;
    }
}
