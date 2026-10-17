package pzd;

import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.statements.api.models.CustomisationState;
import com.revolut.feature.statements.impl.ui.consolidated.screen.ConsolidatedStatementScreen;
import com.revolut.feature.statements.impl.ui.consolidated.screen.ConsolidatedStatementScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ConsolidatedStatementScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ConsolidatedStatementScreen consolidatedStatementScreen, Continuation continuation) {
        super(2, continuation);
        this.v = consolidatedStatementScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((SmallActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FlowStep flowStep;
        SmallActionButtonDelegate.Model model = (SmallActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        o oVarE3 = this.v.R2();
        String listId = model.f53337a;
        com.revolut.feature.statements.impl.ui.consolidated.screen.a aVar2 = (com.revolut.feature.statements.impl.ui.consolidated.screen.a) oVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "PRODUCT_FILTER_ITEM_ID")) {
            flowStep = ConsolidatedStatementScreenContract$ModalStep.ChooseProduct.f88315a;
        } else {
            ConsolidatedStatementScreenContract$ModalStep.ChooseFilters chooseFilters = null;
            if (Intrinsics.f(listId, "FILTER_ITEM_ID")) {
                Data data = ((p) ((j2) aVar2.f88322x.f22677a).getValue()).f240973h;
                CustomisationState customisationState = data != null ? (CustomisationState) data.getContent() : null;
                if (customisationState != null) {
                    chooseFilters = new ConsolidatedStatementScreenContract$ModalStep.ChooseFilters(customisationState);
                }
            }
            flowStep = chooseFilters;
        }
        if (flowStep != null) {
            oki.h.v2(aVar2.f88323y, flowStep, ModalDestination.Style.POPUP.f98311a);
        }
        return Unit.f186387a;
    }
}
