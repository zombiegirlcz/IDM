package d27;

import aw0.n6;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.OrderInitPageCreateScreen;
import com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.OrderInitPageCreateScreenContract$Step;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ OrderInitPageCreateScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(OrderInitPageCreateScreen orderInitPageCreateScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = orderInitPageCreateScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.v, continuation, 0);
            case 1:
                return new g(this.v, continuation, 1);
            default:
                return new g(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((g) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 1;
        OrderInitPageCreateScreen orderInitPageCreateScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a) orderInitPageCreateScreen.d()).B2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                KProperty[] kPropertyArr = OrderInitPageCreateScreen.W;
                ActionFooterView screenRecyclerNavbarActionFooterActionFooterView = orderInitPageCreateScreen.d3().f174533b;
                Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterActionFooterView, "screenRecyclerNavbarActionFooterActionFooterView");
                kli.c.c(screenRecyclerNavbarActionFooterActionFooterView, true);
                com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a aVar3 = (com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a) orderInitPageCreateScreen.d();
                com.revolut.kompot.navigable.vc.modal.a aVar4 = aVar3.F;
                cli.y yVar = aVar3.E;
                long j2 = ((u) ((j2) yVar.f22677a).getValue()).f110773b.f110757b;
                j2 j2Var = (j2) yVar.f22677a;
                xi0.b bVar = (xi0.b) ((u) j2Var.getValue()).f110773b.f110756a.getContent();
                if (bVar != null) {
                    dj0.d dVar = new dj0.d(j2, bVar);
                    String str = ((u) j2Var.getValue()).k;
                    if (str.length() != 0) {
                        oki.h.v2(aVar4, new OrderInitPageCreateScreenContract$Step.Preview(dVar, str, ((u) j2Var.getValue()).f ? i6d.a.CUSTOM_AMOUNT : i6d.a.PAYMENT_METHODS), ModalDestination.Style.POPUP.f98311a);
                    }
                }
                break;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                KProperty[] kPropertyArr2 = OrderInitPageCreateScreen.W;
                ActionFooterView screenRecyclerNavbarActionFooterActionFooterView2 = orderInitPageCreateScreen.d3().f174533b;
                Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterActionFooterView2, "screenRecyclerNavbarActionFooterActionFooterView");
                kli.c.c(screenRecyclerNavbarActionFooterActionFooterView2, true);
                com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a aVar6 = (com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a) orderInitPageCreateScreen.d();
                aVar6.getClass();
                aVar6.l2(new l0(aVar6, null, i2), new e0(aVar6, 0));
                break;
        }
        return Unit.f186387a;
    }
}
