package nme;

import com.revolut.feature.globalsearch.api.navigation.GlobalSearchScreenDestination;
import com.revolut.feature.globalsearch.models.RetailGlobalSearchContext;
import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import com.revolut.feature.rev_points.api.navigation.RevPointsFlowDestination;
import com.revolut.feature.tab.lifestyle.impl.ui.screen.TabLifestyleScreen;
import com.revolut.feature.tab.lifestyle.impl.ui.screen.TabLifestyleScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class t extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TabLifestyleScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(TabLifestyleScreen tabLifestyleScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = tabLifestyleScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new t(this.v, continuation, 0);
            case 1:
                return new t(this.v, continuation, 1);
            case 2:
                return new t(this.v, continuation, 2);
            case 3:
                return new t(this.v, continuation, 3);
            case 4:
                return new t(this.v, continuation, 4);
            case 5:
                return new t(this.v, continuation, 5);
            default:
                return new t(this.v, continuation, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((t) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        TabLifestyleScreen tabLifestyleScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.tab.lifestyle.impl.ui.screen.f fVar = (com.revolut.feature.tab.lifestyle.impl.ui.screen.f) tabLifestyleScreen.d();
                fVar.getClass();
                Intrinsics.checkNotNullParameter("revolut://app/ads/consents/third-party-targeting?utm_source=LifestyleFloatingButton", "originalDeeplink");
                Continuation continuation = null;
                fVar.n2(new n8a.r(fVar, "revolut://app/ads/consents/third-party-targeting?utm_source=LifestyleFloatingButton", continuation, continuation, 18), new whi.b(6));
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oki.h.v2(((com.revolut.feature.tab.lifestyle.impl.ui.screen.f) tabLifestyleScreen.d()).f89945h0, TabLifestyleScreenContract$ModalStep.ThemeCustomisation.f89922a, ModalDestination.Style.POPUP.f98311a);
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oki.h.v2(((com.revolut.feature.tab.lifestyle.impl.ui.screen.f) tabLifestyleScreen.d()).f89945h0, TabLifestyleScreenContract$ModalStep.RevPointsBottomSheet.f89920a, bottom_dialog);
                break;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                pme.b bVar = (pme.b) ((com.revolut.feature.tab.lifestyle.impl.ui.screen.f) tabLifestyleScreen.d()).K;
                bVar.getClass();
                bVar.A2(new RevPointsFlowDestination(new RevPointsFlowDestination.StartType.OpenTransactionList(null, null, 3)));
                break;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                pme.b bVar2 = (pme.b) ((com.revolut.feature.tab.lifestyle.impl.ui.screen.f) tabLifestyleScreen.d()).K;
                bVar2.getClass();
                bVar2.A2(new MainContainerScreenDestination.Slide(dy0.o.RIGHT, false));
                break;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.tab.lifestyle.impl.ui.screen.f fVar2 = (com.revolut.feature.tab.lifestyle.impl.ui.screen.f) tabLifestyleScreen.d();
                if (fVar2.R.E()) {
                    yji.l.j2(fVar2, fVar2.e1(h9b.a.f150222a), bottom_dialog, null, 2);
                }
                break;
            default:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                pme.b bVar3 = (pme.b) ((com.revolut.feature.tab.lifestyle.impl.ui.screen.f) tabLifestyleScreen.d()).K;
                bVar3.getClass();
                bVar3.A2(new GlobalSearchScreenDestination(RetailGlobalSearchContext.LIFESTYLE_HOME));
                break;
        }
        return Unit.f186387a;
    }
}
