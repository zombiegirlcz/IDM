package d27;

import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.OrderInitPageCreateScreen;
import com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserFeatureConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ OrderInitPageCreateScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(OrderInitPageCreateScreen orderInitPageCreateScreen, Continuation continuation) {
        super(2, continuation);
        this.u = orderInitPageCreateScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new i(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((AmountEditDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a aVar2 = (com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a) this.u.d();
        cli.y yVar = aVar2.E;
        aVar2.C1(u0.c(new CurrencyChooserFeatureConfig.CurrencyChooser((xi0.b) zi0.c.I(((u) ((j2) yVar.f22677a).getValue()).f110773b.f110756a), zhm.d0.d1(((u) ((j2) yVar.f22677a).getValue()).f110772a), (Integer) 4, 4)));
        return Unit.f186387a;
    }
}
