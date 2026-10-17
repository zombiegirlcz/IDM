package cie;

import com.revolut.core.ui_kit.views.navbar.NavBarScrollingViewBehavior;
import com.revolut.feature.tab.accounts.impl.ui.tab.AccountsController;
import com.revolut.feature.tab.accounts.impl.ui.tab.TabAccountsScreenContract$State;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes8.dex */
public final class u0 extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.tab.accounts.impl.ui.tab.d f24522w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(com.revolut.feature.tab.accounts.impl.ui.tab.d dVar, Continuation continuation) {
        super(2, continuation);
        this.f24522w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        u0 u0Var = new u0(this.f24522w, continuation);
        u0Var.v = obj2;
        return u0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((u0) create((fc7.g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fc7.g gVar = (fc7.g) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            boolean z = gVar instanceof fc7.d;
            com.revolut.feature.tab.accounts.impl.ui.tab.d dVar = this.f24522w;
            if (z) {
                dVar.C1(((fc7.d) gVar).f133652a);
            } else if (gVar instanceof fc7.e) {
                ControllerContainerCoordinatorLayout tabAccountsContentContainer = ((AccountsController) dVar.O).e3().f152171c;
                Intrinsics.checkNotNullExpressionValue(tabAccountsContentContainer, "tabAccountsContentContainer");
                NavBarScrollingViewBehavior navBarScrollingViewBehaviorD3 = AccountsController.d3(tabAccountsContentContainer);
                if (navBarScrollingViewBehaviorD3 != null) {
                    navBarScrollingViewBehaviorD3.f(true);
                }
            } else if (gVar instanceof fc7.a) {
                dVar.T.d3();
            } else if (gVar instanceof fc7.c) {
                ProductAccountDescriptor$Value productAccountDescriptor$Value = ((TabAccountsScreenContract$State) ((j2) dVar.i0.f22677a).getValue()).k;
                if (productAccountDescriptor$Value == null) {
                    return Unit.f186387a;
                }
                the.a aVar2 = dVar.v;
                ProductId f89727a = productAccountDescriptor$Value.getF89727a();
                fc7.c cVar = (fc7.c) gVar;
                sfe.r rVar = new sfe.r(cVar.f133649a, productAccountDescriptor$Value.getF89728b(), cVar.f133650b, cVar.f133651c);
                this.v = null;
                this.u = 1;
                if (aVar2.a(f89727a, rVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (!(gVar instanceof fc7.f)) {
                    throw new NoWhenBranchMatchedException();
                }
                dVar.X1(((fc7.f) gVar).f133654a);
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
