package ptb;

import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.core.ui_kit.views.scrolling.HideOnScrollViewBehavior;
import com.revolut.data.model.Data;
import com.revolut.feature.debug_tools.DebugScreenFeatureConfig;
import com.revolut.feature.rev10_main_screen.impl.ui.MainContainerFlow;
import com.revolut.feature.rev10_main_screen.impl.ui.MainContainerFlowContract$Step$Modal$CustomizationMenu;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import mw0.m;
import mx0.p6;
import mx0.r6;
import rp0.l0;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MainContainerFlow f239639w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(MainContainerFlow mainContainerFlow, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f239639w = mainContainerFlow;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f239639w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            case 1:
                c cVar2 = new c(this.f239639w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
            case 2:
                c cVar3 = new c(this.f239639w, continuation, 2);
                cVar3.v = obj2;
                return cVar3;
            case 3:
                c cVar4 = new c(this.f239639w, continuation, 3);
                cVar4.v = obj2;
                return cVar4;
            case 4:
                c cVar5 = new c(this.f239639w, continuation, 4);
                cVar5.v = obj2;
                return cVar5;
            default:
                c cVar6 = new c(this.f239639w, continuation, 5);
                cVar6.v = obj2;
                return cVar6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((k) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((c) create((p6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((c) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((PopupMenuItem) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        MainContainerFlow mainContainerFlow = this.f239639w;
        switch (i) {
            case 0:
                k kVar = (k) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l0 l0Var = mainContainerFlow.P;
                if (l0Var != null) {
                    l0Var.c(kVar.f239651a, kVar.f239652b, mw0.o.VIEW_BOUNDS, m.f209296a);
                    return Unit.f186387a;
                }
                Intrinsics.r("popupMenuDialogDisplayer");
                throw null;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                boolean zJ = pd.b.j((Boolean) data.getContent());
                KProperty[] kPropertyArr = MainContainerFlow.T;
                r6 r6Var = zJ ? r6.VISIBILITY : r6.COMPRESSED;
                mainContainerFlow.O.setScrollAnimationMode(r6Var);
                boolean z = r6Var != r6.NONE;
                ViewGroup.LayoutParams layoutParams = mainContainerFlow.d3().f189515b.getLayoutParams();
                Intrinsics.i(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
                CoordinatorLayout.LayoutParams layoutParams2 = (CoordinatorLayout.LayoutParams) layoutParams;
                boolean z3 = layoutParams2.getBehavior() instanceof HideOnScrollViewBehavior;
                if (z && !z3) {
                    layoutParams2.setBehavior(new HideOnScrollViewBehavior(null, null));
                    mainContainerFlow.d3().f189515b.requestLayout();
                } else if (!z && z3) {
                    layoutParams2.setBehavior(null);
                    mainContainerFlow.d3().f189515b.requestLayout();
                }
                return Unit.f186387a;
            case 2:
                p6 p6Var = (p6) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.rev10_main_screen.impl.ui.a) mainContainerFlow.d()).J2(p6Var.f209928b);
                return Unit.f186387a;
            case 3:
                String tabId = (String) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h hVarD = mainContainerFlow.d();
                Intrinsics.h(tabId);
                com.revolut.feature.rev10_main_screen.impl.ui.a aVar5 = (com.revolut.feature.rev10_main_screen.impl.ui.a) hVarD;
                aVar5.getClass();
                Intrinsics.checkNotNullParameter(tabId, "tabId");
                aVar5.n2(new pnf.f(aVar5, tabId, null, 15), new whi.b(6));
                return Unit.f186387a;
            case 4:
                List updatedItemIds = (List) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h hVarD2 = mainContainerFlow.d();
                Intrinsics.h(updatedItemIds);
                com.revolut.feature.rev10_main_screen.impl.ui.a aVar7 = (com.revolut.feature.rev10_main_screen.impl.ui.a) hVarD2;
                aVar7.getClass();
                Intrinsics.checkNotNullParameter(updatedItemIds, "updatedItemIds");
                aVar7.l2(new pnf.f(aVar7, updatedItemIds, null, 14), new yi5.b(26));
                return Unit.f186387a;
            default:
                PopupMenuItem popupMenuItem = (PopupMenuItem) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h hVarD3 = mainContainerFlow.d();
                String itemId = popupMenuItem.getF53929a();
                com.revolut.feature.rev10_main_screen.impl.ui.a aVar9 = (com.revolut.feature.rev10_main_screen.impl.ui.a) hVarD3;
                aVar9.getClass();
                Intrinsics.checkNotNullParameter(itemId, "itemId");
                if (Intrinsics.f(itemId, "POPUP_ITEM_ID_DEBUG_SCREEN")) {
                    aVar9.f83441s.getClass();
                    aVar9.C1(new BridgeDestination(new FeatureCommand(DebugScreenFeatureConfig.f71623a)));
                } else if (Intrinsics.f(itemId, "POPUP_ITEM_ID_CUSTOMIZE")) {
                    oki.h.w2(aVar9.f83444x, MainContainerFlowContract$Step$Modal$CustomizationMenu.f83434a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
                return Unit.f186387a;
        }
    }
}
