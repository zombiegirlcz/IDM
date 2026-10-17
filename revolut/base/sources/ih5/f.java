package ih5;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.crypto.locked.balance.api.model.CryptoBalanceBreakdown;
import com.revolut.feature.crypto.locked.balance.api.navigation.CryptoBalanceBreakdownInputData;
import com.revolut.feature.crypto.locked.balance.impl.ui.balance_breakdown.CryptoBalanceBreakdownContract$ModalStep;
import com.revolut.feature.crypto.locked.balance.impl.ui.balance_breakdown.CryptoBalanceBreakdownScreen;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.flow.FlowStep;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import oki.h;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CryptoBalanceBreakdownScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CryptoBalanceBreakdownScreen cryptoBalanceBreakdownScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cryptoBalanceBreakdownScreen;
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

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FlowStep openOrders;
        StakingPocket stakingPocket;
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        b bVar = (b) this.v.U.getValue();
        Object obj3 = model.o;
        com.revolut.feature.crypto.locked.balance.impl.ui.balance_breakdown.a aVar2 = (com.revolut.feature.crypto.locked.balance.impl.ui.balance_breakdown.a) bVar;
        CryptoBalanceBreakdownInputData cryptoBalanceBreakdownInputData = aVar2.o;
        CryptoBalanceBreakdownContract$ModalStep.LockedUnstake lockedUnstake = null;
        eh5.a aVar3 = obj3 instanceof eh5.a ? (eh5.a) obj3 : null;
        if (aVar3 != null) {
            int i = e.f161295a[aVar3.ordinal()];
            if (i == 1) {
                CryptoBalanceBreakdown cryptoBalanceBreakdown = (CryptoBalanceBreakdown) ((a) ((j2) aVar2.f70881r.f22677a).getValue()).f161293a.getContent();
                if (cryptoBalanceBreakdown != null && (stakingPocket = cryptoBalanceBreakdown.f) != null) {
                    lockedUnstake = new CryptoBalanceBreakdownContract$ModalStep.LockedUnstake(stakingPocket);
                }
                openOrders = lockedUnstake;
            } else if (i == 2) {
                openOrders = new CryptoBalanceBreakdownContract$ModalStep.OpenOrders(cryptoBalanceBreakdownInputData.f70872a);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                openOrders = new CryptoBalanceBreakdownContract$ModalStep.LockedGift(cryptoBalanceBreakdownInputData.f70872a);
            }
            if (openOrders != null) {
                h.v2(aVar2.f70882s, openOrders, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            }
        }
        return Unit.f186387a;
    }
}
