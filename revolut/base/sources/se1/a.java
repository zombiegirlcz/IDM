package se1;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.acquiring.lite_pos.api.navigation.SelectTaxRateScreenProvider$InputData;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.new_sale.SaleScreen;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.select_tax_rate.SelectTaxRateScreen;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends gim.i implements Function2 {
    public final /* synthetic */ SaleScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(SaleScreen saleScreen, Continuation continuation) {
        super(2, continuation);
        this.u = saleScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((ActionsView.Item) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        i iVar = (i) this.u.T2();
        iVar.getClass();
        iVar.f2(new SelectTaxRateScreen(new SelectTaxRateScreenProvider$InputData(((d) iVar.t2()).e, true, true)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new g(iVar, 2));
        return Unit.f186387a;
    }
}
