package k1g;

import com.revolut.feature.travel.experiences.impl.ui.flow.tabs.TravelExperiencesTabsFlow;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m1c.e0;
import mx0.p6;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TravelExperiencesTabsFlow f180243w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(TravelExperiencesTabsFlow travelExperiencesTabsFlow, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f180243w = travelExperiencesTabsFlow;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f180243w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f180243w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((p6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TravelExperiencesTabsFlow travelExperiencesTabsFlow = this.f180243w;
        switch (i) {
            case 0:
                String menuItemId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d dVarR2 = travelExperiencesTabsFlow.R2();
                Intrinsics.h(menuItemId);
                com.revolut.feature.travel.experiences.impl.ui.flow.tabs.a aVar2 = (com.revolut.feature.travel.experiences.impl.ui.flow.tabs.a) dVarR2;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(menuItemId, "menuItemId");
                if (menuItemId.equals("NAV_BAR_ACTION_ID_REV_POINTS")) {
                    yji.l.j2(aVar2, aVar2.e1(new hub.c(e0.EXPERIENCES)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
                }
                break;
            default:
                p6 p6Var = (p6) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d dVarR22 = travelExperiencesTabsFlow.R2();
                String tabId = p6Var.f209928b;
                com.revolut.feature.travel.experiences.impl.ui.flow.tabs.a aVar4 = (com.revolut.feature.travel.experiences.impl.ui.flow.tabs.a) dVarR22;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(tabId, "tabId");
                aVar4.H2(aVar4.f93008s, new jb8.a(tabId, 18));
                break;
        }
        return Unit.f186387a;
    }
}
