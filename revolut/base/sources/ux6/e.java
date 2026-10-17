package ux6;

import cli.y;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.customer_list.InvoiceCustomerListScreen;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.customer_list.InvoiceCustomerListScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ InvoiceCustomerListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(InvoiceCustomerListScreen invoiceCustomerListScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = invoiceCustomerListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            default:
                return new e(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        InvoiceCustomerListScreen invoiceCustomerListScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.freelancer.impl.ui.invoice.screen.customer_list.a aVar2 = (com.revolut.feature.freelancer.impl.ui.invoice.screen.customer_list.a) invoiceCustomerListScreen.d();
                y yVar = aVar2.v;
                if (((j) ((j2) yVar.f22677a).getValue()).f283882c) {
                    aVar2.H2(yVar, new rk.b(false, 27));
                } else {
                    aVar2.B2();
                }
                NavBarWithToolbar navBarWithToolbar = invoiceCustomerListScreen.d3().f174539b;
                Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
                kli.c.c(navBarWithToolbar, true);
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oki.h.v2(((com.revolut.feature.freelancer.impl.ui.invoice.screen.customer_list.a) invoiceCustomerListScreen.d()).f73888w, new InvoiceCustomerListScreenContract$ModalStep.AddCustomer(null, null), ModalDestination.Style.POPUP.f98311a);
                break;
        }
        return Unit.f186387a;
    }
}
