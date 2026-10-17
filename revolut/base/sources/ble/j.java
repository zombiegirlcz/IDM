package ble;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.tab.invest.impl.ui.home.TabInvestController;
import com.revolut.feature.tab.invest.impl.ui.home.TabInvestControllerContract$ModalStep;
import com.revolut.feature.wealth.ui.api.actions.WealthAction;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TabInvestController f16579w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(TabInvestController tabInvestController, Continuation continuation) {
        super(2, continuation);
        this.f16579w = tabInvestController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.f16579w, continuation);
        jVar.v = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((ActionsView.Item) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Unit unit;
        ActionsView.Item item = (ActionsView.Item) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            q qVarR2 = this.f16579w.R2();
            Intrinsics.h(item);
            this.v = null;
            this.u = 1;
            com.revolut.feature.tab.invest.impl.ui.home.f fVar = (com.revolut.feature.tab.invest.impl.ui.home.f) qVarR2;
            fVar.getClass();
            Object obj3 = item.f58324n;
            WealthAction wealthAction = obj3 instanceof WealthAction ? (WealthAction) obj3 : null;
            if (wealthAction == null) {
                unit = Unit.f186387a;
            } else {
                if (wealthAction instanceof WealthAction.Theme) {
                    oki.h.v2(fVar.f0, TabInvestControllerContract$ModalStep.ThemeCustomisation.f89852a, ModalDestination.Style.POPUP.f98311a);
                } else {
                    fVar.n2(new a1(fVar, wealthAction, null), new whi.b(6));
                }
                unit = Unit.f186387a;
            }
            if (unit == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
