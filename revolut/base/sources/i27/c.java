package i27;

import cli.y;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list.OrderInitPageListScreen;
import g7b.q;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ OrderInitPageListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(OrderInitPageListScreen orderInitPageListScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = orderInitPageListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        OrderInitPageListScreen orderInitPageListScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list.b bVar = (com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list.b) orderInitPageListScreen.d();
                y yVar = bVar.f74195r;
                if (((com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list.a) ((j2) yVar.f22677a).getValue()).d) {
                    bVar.H2(yVar, new q(false, 19));
                } else {
                    bVar.B2();
                }
                NavBarWithToolbar navBarWithToolbar = orderInitPageListScreen.d3().f174539b;
                Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
                kli.c.c(navBarWithToolbar, true);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list.b bVar2 = (com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list.b) orderInitPageListScreen.d();
                bVar2.H2(bVar2.f74195r, new q(!((com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list.a) ((j2) bVar2.f74195r.f22677a).getValue()).d, 19));
                orderInitPageListScreen.d3().f174539b.E0();
                NavBarWithToolbar navBarWithToolbar2 = orderInitPageListScreen.d3().f174539b;
                Intrinsics.checkNotNullExpressionValue(navBarWithToolbar2, "navBarWithToolbar");
                kli.c.f(navBarWithToolbar2);
                break;
        }
        return Unit.f186387a;
    }
}
