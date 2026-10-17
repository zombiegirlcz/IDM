package qwd;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.staking.api.zerobalance.ZeroBalanceBottomSheetProvider$ZeroBalanceParcel;
import com.revolut.feature.staking.impl.stake.v2.StakeController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ StakeController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(StakeController stakeController, Continuation continuation) {
        super(2, continuation);
        this.v = stakeController;
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
        com.revolut.feature.staking.impl.stake.v2.b bVar = (com.revolut.feature.staking.impl.stake.v2.b) jVarR2;
        Continuation continuation = null;
        j60.a.v(bVar.u, false, null, 3);
        if (obj3 instanceof ZeroBalanceBottomSheetProvider$ZeroBalanceParcel) {
            bVar.n2(new qu4.s(bVar, ((ZeroBalanceBottomSheetProvider$ZeroBalanceParcel) obj3).f88104a, continuation, 6), new whi.b(6));
        }
        return Unit.f186387a;
    }
}
