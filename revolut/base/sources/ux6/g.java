package ux6;

import com.revolut.core.ui_kit.delegates.SearchButtonDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.customer_list.InvoiceCustomerListScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ InvoiceCustomerListScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(InvoiceCustomerListScreen invoiceCustomerListScreen, Continuation continuation) {
        super(2, continuation);
        this.u = invoiceCustomerListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((SearchButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        InvoiceCustomerListScreen invoiceCustomerListScreen = this.u;
        com.revolut.feature.freelancer.impl.ui.invoice.screen.customer_list.a aVar2 = (com.revolut.feature.freelancer.impl.ui.invoice.screen.customer_list.a) invoiceCustomerListScreen.d();
        aVar2.H2(aVar2.v, new rk.b(true, 27));
        invoiceCustomerListScreen.d3().f174539b.E0();
        NavBarWithToolbar navBarWithToolbar = invoiceCustomerListScreen.d3().f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        kli.c.f(navBarWithToolbar);
        return Unit.f186387a;
    }
}
