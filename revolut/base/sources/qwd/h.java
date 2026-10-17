package qwd;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.feature.staking.api.tierrate.v2.TiersRateItemMapper$Parcel;
import com.revolut.feature.staking.impl.stake.v2.StakeController;
import com.revolut.feature.staking.impl.stake.v2.StakeControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ StakeController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(StakeController stakeController, Continuation continuation) {
        super(2, continuation);
        this.v = stakeController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CellDetailsActionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsActionDelegate.Model model = (CellDetailsActionDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVarR2 = this.v.R2();
        Object obj3 = model.f51787l;
        com.revolut.feature.staking.impl.stake.v2.b bVar = (com.revolut.feature.staking.impl.stake.v2.b) jVarR2;
        if (obj3 instanceof TiersRateItemMapper$Parcel) {
            oki.h.v2(bVar.L, new StakeControllerContract$ModalStep.EarnRateBottomSheet((TiersRateItemMapper$Parcel) obj3), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        } else {
            bVar.getClass();
        }
        return Unit.f186387a;
    }
}
