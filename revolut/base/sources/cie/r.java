package cie;

import com.revolut.core.ui_kit.views.navbar.NavBarScrollingViewBehavior;
import com.revolut.feature.tab.accounts.impl.ui.tab.AccountsController;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class r extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AccountsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(AccountsController accountsController, Continuation continuation) {
        super(2, continuation);
        this.v = accountsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        r rVar = new r(this.v, continuation);
        rVar.u = obj2;
        return rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((r) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object obj3 = this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        AccountsController accountsController = this.v;
        e0 e0VarG3 = accountsController.R2();
        yx4.a aVar2 = yx4.b.Companion;
        Intrinsics.h(obj3);
        aVar2.getClass();
        yx4.b click = yx4.a.a(obj3);
        com.revolut.feature.tab.accounts.impl.ui.tab.d dVar = (com.revolut.feature.tab.accounts.impl.ui.tab.d) e0VarG3;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(click, "click");
        if (dVar.M.b3(click)) {
            return Unit.f186387a;
        }
        if (obj3 instanceof ty0.a) {
            ty0.a aVar3 = (ty0.a) obj3;
            if (Intrinsics.f(aVar3.f275445a, "discover_item_footer_link_id")) {
                Object obj4 = aVar3.d;
                ProductAccountDescriptor$Value.Discover descriptor = obj4 instanceof ProductAccountDescriptor$Value.Discover ? (ProductAccountDescriptor$Value.Discover) obj4 : null;
                if (descriptor != null) {
                    com.revolut.feature.tab.accounts.impl.ui.tab.d dVar2 = (com.revolut.feature.tab.accounts.impl.ui.tab.d) accountsController.R2();
                    dVar2.getClass();
                    Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                    dVar2.l2(new z0(dVar2, descriptor, null), new yi5.b(26));
                    return Unit.f186387a;
                }
            }
        } else if ((obj3 instanceof qv0.p) && Intrinsics.f(((qv0.p) obj3).getF(), "PARCEL_SCROLL_TO_TOP")) {
            ControllerContainerCoordinatorLayout tabAccountsContentContainer = accountsController.e3().f152171c;
            Intrinsics.checkNotNullExpressionValue(tabAccountsContentContainer, "tabAccountsContentContainer");
            NavBarScrollingViewBehavior navBarScrollingViewBehaviorD3 = AccountsController.d3(tabAccountsContentContainer);
            if (navBarScrollingViewBehaviorD3 != null) {
                navBarScrollingViewBehaviorD3.f(true);
            }
        }
        ((com.revolut.feature.tab.accounts.impl.ui.tab.d) accountsController.R2()).O2(obj3);
        return Unit.f186387a;
    }
}
