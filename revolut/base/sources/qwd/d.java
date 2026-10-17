package qwd;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.feature.staking.impl.stake.v2.StakeController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import rp0.y;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ StakeController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(StakeController stakeController, Continuation continuation) {
        super(2, continuation);
        this.v = stakeController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CenteredAmountDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        y yVarB;
        CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVarR2 = this.v.R2();
        bw0.m mVar = model.e;
        Object obj3 = mVar != null ? mVar.e : null;
        com.revolut.feature.staking.impl.stake.v2.b bVar = (com.revolut.feature.staking.impl.stake.v2.b) jVarR2;
        if (obj3 instanceof yqi.b) {
            yqi.b bVar2 = (yqi.b) obj3;
            zwd.a aVarA = bVar.f88153t.a(bVar2);
            if (aVarA != null && (yVarB = aVarA.b(bVar2)) != null) {
                bVar.u.x(yVarB);
            }
        } else {
            bVar.getClass();
        }
        return Unit.f186387a;
    }
}
