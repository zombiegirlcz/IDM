package una;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.feature.profile.impl.ui.profile.screens.auto_earn_rewards.AutoEarnRewardsController;
import com.revolut.feature.profile.impl.ui.profile.screens.auto_earn_rewards.AutoEarnRewardsControllerContract$Steps;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AutoEarnRewardsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(AutoEarnRewardsController autoEarnRewardsController, Continuation continuation) {
        super(2, continuation);
        this.v = autoEarnRewardsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        d dVar = (d) this.v.M.getValue();
        Intrinsics.h(model);
        com.revolut.kompot.navigable.vc.modal.a aVar2 = ((com.revolut.feature.profile.impl.ui.profile.screens.auto_earn_rewards.a) dVar).f81446s;
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f53228a, "AUTO_EARN_SWITCH_LIST_ID")) {
            RowDelegate.Model.c cVar = model.k;
            vf vfVar = cVar instanceof vf ? (vf) cVar : null;
            if (vfVar != null ? vfVar.f54880a : false) {
                h.v2(aVar2, AutoEarnRewardsControllerContract$Steps.DisableConsentStep.f81441a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            } else {
                h.v2(aVar2, AutoEarnRewardsControllerContract$Steps.FlexibleConsentDialogStep.f81442a, ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
            }
        }
        return Unit.f186387a;
    }
}
