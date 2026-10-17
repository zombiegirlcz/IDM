package o9c;

import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.feature.revolutpay.impl.ui.summary_screen.RevolutPaySummaryScreen;
import com.revolut.feature.revolutpay.impl.ui.summary_screen.RevolutPaySummaryScreenContract$ModalStep;
import com.revolut.feature.revolutpay.shared.ui.summary_screen.mapper.RevPointsEarningItemMapper;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class l extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RevolutPaySummaryScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(RevolutPaySummaryScreen revolutPaySummaryScreen, Continuation continuation) {
        super(2, continuation);
        this.v = revolutPaySummaryScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l lVar = new l(this.v, continuation);
        lVar.u = obj2;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((HighlightTileDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        HighlightTileDelegate.Model model = (HighlightTileDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        u uVarE3 = this.v.R2();
        Object obj3 = model.i;
        com.revolut.kompot.navigable.vc.modal.a aVar2 = ((com.revolut.feature.revolutpay.impl.ui.summary_screen.f) uVarE3).P;
        boolean z = obj3 instanceof RevPointsEarningItemMapper.RevPointsEarningParcel;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        if (z) {
            oki.h.v2(aVar2, new RevolutPaySummaryScreenContract$ModalStep.RevPointsEarningInfo((RevPointsEarningItemMapper.RevPointsEarningParcel) obj3), bottom_dialog);
        } else if (obj3 instanceof r) {
            oki.h.v2(aVar2, new RevolutPaySummaryScreenContract$ModalStep.CashbackExplainer(((r) obj3).f223222a), bottom_dialog);
        }
        return Unit.f186387a;
    }
}
