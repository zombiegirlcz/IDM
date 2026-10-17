package cie;

import com.revolut.feature.globalsearch.api.navigation.GlobalSearchScreenDestination;
import com.revolut.feature.globalsearch.models.RetailGlobalSearchContext;
import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import com.revolut.feature.tab.accounts.impl.ui.tab.AccountsController;
import com.revolut.feature.tab.accounts.impl.ui.tab.TabAccountsScreenContract$State;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ AccountsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(AccountsController accountsController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = accountsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.v, continuation, 0);
            case 1:
                return new j(this.v, continuation, 1);
            case 2:
                return new j(this.v, continuation, 2);
            case 3:
                return new j(this.v, continuation, 3);
            case 4:
                return new j(this.v, continuation, 4);
            case 5:
                return new j(this.v, continuation, 5);
            case 6:
                return new j(this.v, continuation, 6);
            case 7:
                return new j(this.v, continuation, 7);
            default:
                return new j(this.v, continuation, 8);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((j) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AccountsController accountsController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                accountsController.getP().h();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.tab.accounts.impl.ui.tab.d dVar = (com.revolut.feature.tab.accounts.impl.ui.tab.d) accountsController.R2();
                dVar.getClass();
                dVar.C1(new MainContainerScreenDestination.Slide(dy0.o.BOTTOM, false));
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.tab.accounts.impl.ui.tab.d dVar2 = (com.revolut.feature.tab.accounts.impl.ui.tab.d) accountsController.R2();
                dVar2.getClass();
                dVar2.C1(new MainContainerScreenDestination.Slide(dy0.o.BOTTOM, false));
                break;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.tab.accounts.impl.ui.tab.d dVar3 = (com.revolut.feature.tab.accounts.impl.ui.tab.d) accountsController.R2();
                ProductAccountDescriptor$Value productAccountDescriptor$Value = ((TabAccountsScreenContract$State) ((j2) dVar3.i0.f22677a).getValue()).k;
                if (productAccountDescriptor$Value != null) {
                    dVar3.n2(new w0(dVar3, productAccountDescriptor$Value, null, 1), new whi.b(6));
                }
                break;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.tab.accounts.impl.ui.tab.d dVar4 = (com.revolut.feature.tab.accounts.impl.ui.tab.d) accountsController.R2();
                dVar4.getClass();
                dVar4.l2(new d1(dVar4, true, null, null), new yi5.b(26));
                break;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.tab.accounts.impl.ui.tab.d dVar5 = (com.revolut.feature.tab.accounts.impl.ui.tab.d) accountsController.R2();
                ProductAccountDescriptor$Value productAccountDescriptor$Value2 = ((TabAccountsScreenContract$State) ((j2) dVar5.i0.f22677a).getValue()).k;
                if (productAccountDescriptor$Value2 != null) {
                    dVar5.n2(new w0(dVar5, productAccountDescriptor$Value2, null, 2), new whi.b(6));
                }
                break;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.tab.accounts.impl.ui.tab.d dVar6 = (com.revolut.feature.tab.accounts.impl.ui.tab.d) accountsController.R2();
                dVar6.getClass();
                dVar6.C1(new MainContainerScreenDestination.Slide(dy0.o.RIGHT, false));
                break;
            case 7:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.tab.accounts.impl.ui.tab.d dVar7 = (com.revolut.feature.tab.accounts.impl.ui.tab.d) accountsController.R2();
                if (dVar7.X.E()) {
                    yji.l.j2(dVar7, dVar7.e1(h9b.a.f150222a), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
                }
                break;
            default:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.tab.accounts.impl.ui.tab.d dVar8 = (com.revolut.feature.tab.accounts.impl.ui.tab.d) accountsController.R2();
                dVar8.getClass();
                dVar8.C1(new GlobalSearchScreenDestination(RetailGlobalSearchContext.MAIN_HOME));
                break;
        }
        return Unit.f186387a;
    }
}
