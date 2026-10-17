package rx6;

import cli.y;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.freelancer.impl.ui.invoice.list.InvoiceListScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ InvoiceListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(InvoiceListScreen invoiceListScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = invoiceListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.v, continuation, 0);
            default:
                return new h(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((h) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        InvoiceListScreen invoiceListScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.freelancer.impl.ui.invoice.list.a aVar2 = (com.revolut.feature.freelancer.impl.ui.invoice.list.a) invoiceListScreen.d();
                y yVar = aVar2.f73878r;
                if (((m) ((j2) yVar.f22677a).getValue()).f258046c) {
                    aVar2.H2(yVar, new rk.b(false, 1));
                } else {
                    aVar2.B2();
                }
                NavBarWithToolbar navBarWithToolbar = invoiceListScreen.d3().f174539b;
                Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
                kli.c.c(navBarWithToolbar, true);
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.freelancer.impl.ui.invoice.list.a aVar4 = (com.revolut.feature.freelancer.impl.ui.invoice.list.a) invoiceListScreen.d();
                aVar4.H2(aVar4.f73878r, new rk.b(true, 1));
                invoiceListScreen.d3().f174539b.E0();
                NavBarWithToolbar navBarWithToolbar2 = invoiceListScreen.d3().f174539b;
                Intrinsics.checkNotNullExpressionValue(navBarWithToolbar2, "navBarWithToolbar");
                kli.c.f(navBarWithToolbar2);
                break;
        }
        return Unit.f186387a;
    }
}
