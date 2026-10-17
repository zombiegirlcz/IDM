package ef5;

import com.revolut.core.ui_kit.delegates.ActionCardDelegate;
import com.revolut.feature.crypto.earn.assets.shared.impl.ui.assets.EarnAssetsScreenContract$ModalStep;
import com.revolut.feature.crypto.earn.assets.shared.impl.ui.assets.EarnAssetsScreenController;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EarnAssetsScreenController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(EarnAssetsScreenController earnAssetsScreenController, Continuation continuation) {
        super(2, continuation);
        this.v = earnAssetsScreenController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((ActionCardDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ActionCardDelegate.Model model = (ActionCardDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        a aVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.kompot.navigable.vc.modal.a aVar2 = ((com.revolut.feature.crypto.earn.assets.shared.impl.ui.assets.a) aVarE3).f70802y;
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f51573a;
        boolean zF = Intrinsics.f(str, "MONTH_REWARDS_ITEM_ID");
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        if (zF) {
            oki.h.v2(aVar2, EarnAssetsScreenContract$ModalStep.MonthRewards.f70794a, bottom_dialog);
        } else if (Intrinsics.f(str, "ALL_TIME_REWARDS_ITEM_ID")) {
            oki.h.v2(aVar2, EarnAssetsScreenContract$ModalStep.AllTimeRewards.f70789a, bottom_dialog);
        }
        return Unit.f186387a;
    }
}
