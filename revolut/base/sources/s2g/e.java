package s2g;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.travel.experiences.impl.ui.screen.options_v2.TravelExperiencesOptionsV2Screen;
import com.revolut.feature.travel.experiences.impl.ui.screen.selection.visitors.TravelExperiencesVisitorsSelectionScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.selection.visitors.TravelExperiencesVisitorsSelectionScreenContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelExperiencesOptionsV2Screen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TravelExperiencesOptionsV2Screen travelExperiencesOptionsV2Screen, Continuation continuation) {
        super(2, continuation);
        this.v = travelExperiencesOptionsV2Screen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((ActionsView.Item) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ActionsView.Item item = (ActionsView.Item) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        o oVarH3 = this.v.T2();
        Intrinsics.h(item);
        w wVar = (w) oVarH3;
        wVar.getClass();
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f58316a;
        if (Intrinsics.f(str, "QUICK_FILTER_DATE_ITEM_ID")) {
            wVar.z2();
        } else if (Intrinsics.f(str, "QUICK_FILTER_VISITORS_ITEM_ID")) {
            wVar.Y1(new TravelExperiencesVisitorsSelectionScreen(new TravelExperiencesVisitorsSelectionScreenContract$InputData(((j) wVar.t2()).d.f240825b)), ModalDestination.Style.POPUP.f98311a, new q(wVar, 0));
        }
        return Unit.f186387a;
    }
}
