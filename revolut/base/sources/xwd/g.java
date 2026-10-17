package xwd;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.staking.impl.unstake.v2.UnstakeController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ UnstakeController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(UnstakeController unstakeController, Continuation continuation) {
        super(2, continuation);
        this.v = unstakeController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVarR2 = this.v.R2();
        Object obj3 = model.i;
        com.revolut.feature.staking.impl.unstake.v2.a aVar2 = (com.revolut.feature.staking.impl.unstake.v2.a) jVarR2;
        j60.a aVar3 = aVar2.f88167w;
        int i = 15;
        if (obj3 instanceof dxd.d) {
            j60.a.v(aVar3, false, new xge.h(aVar2, 15), 1);
        } else {
            Continuation continuation = null;
            if (obj3 instanceof bud.a) {
                j60.a.v(aVar3, false, null, 3);
                aVar2.n2(new xb4.e(aVar2, continuation, i), new whi.b(6));
            } else {
                j60.a.v(aVar3, false, null, 3);
            }
        }
        return Unit.f186387a;
    }
}
