package cie;

import com.revolut.core.ui_kit.views.navbar.NavBarScrollingViewBehavior;
import com.revolut.feature.tab.accounts.impl.ui.tab.AccountsController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class y0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ com.revolut.feature.tab.accounts.impl.ui.tab.d v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(int i, com.revolut.feature.tab.accounts.impl.ui.tab.d dVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.v = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new y0(0, this.v, continuation);
            case 1:
                return new y0(1, this.v, continuation);
            case 2:
                return new y0(2, this.v, continuation);
            default:
                return new y0(3, this.v, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((y0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((y0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((y0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((y0) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        com.revolut.feature.tab.accounts.impl.ui.tab.d dVar = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dVar.Q2();
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ControllerContainerCoordinatorLayout tabAccountsContentContainer = ((AccountsController) dVar.O).e3().f152171c;
                Intrinsics.checkNotNullExpressionValue(tabAccountsContentContainer, "tabAccountsContentContainer");
                NavBarScrollingViewBehavior navBarScrollingViewBehaviorD3 = AccountsController.d3(tabAccountsContentContainer);
                if (navBarScrollingViewBehaviorD3 != null) {
                    navBarScrollingViewBehaviorD3.f(false);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return dVar.l1().M0(new oii.d());
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dVar.R2();
                return Unit.f186387a;
        }
    }
}
