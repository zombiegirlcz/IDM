package xwd;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.feature.staking.impl.unstake.v2.UnstakeController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import rp0.y;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ UnstakeController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(UnstakeController unstakeController, Continuation continuation) {
        super(2, continuation);
        this.v = unstakeController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CenteredAmountDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
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
        com.revolut.feature.staking.impl.unstake.v2.a aVar2 = (com.revolut.feature.staking.impl.unstake.v2.a) jVarR2;
        if (obj3 instanceof yqi.b) {
            yqi.b bVar = (yqi.b) obj3;
            zwd.a aVarA = aVar2.u.a(bVar);
            if (aVarA != null && (yVarB = aVarA.b(bVar)) != null) {
                aVar2.f88167w.x(yVarB);
            }
        } else {
            aVar2.getClass();
        }
        return Unit.f186387a;
    }
}
