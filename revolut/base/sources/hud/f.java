package hud;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.staking.impl.confirmation.StakingConfirmationController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ StakingConfirmationController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(StakingConfirmationController stakingConfirmationController, Continuation continuation) {
        super(2, continuation);
        this.v = stakingConfirmationController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.o;
        if (obj3 != null) {
            ((com.revolut.feature.staking.impl.confirmation.a) this.v.R2()).I2(obj3);
        }
        return Unit.f186387a;
    }
}
