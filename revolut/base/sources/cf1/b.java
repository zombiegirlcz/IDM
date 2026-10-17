package cf1;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.acquiring.lite_pos.api.model.TaxRate;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.select_tax_rate.SelectTaxRateScreen;
import dd1.a;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SelectTaxRateScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(SelectTaxRateScreen selectTaxRateScreen, Continuation continuation) {
        super(2, continuation);
        this.v = selectTaxRateScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVar = (e) this.v.U.getValue();
        TaxRate taxRate = (TaxRate) model.u;
        g gVar = (g) eVar;
        if (taxRate == null) {
            gVar.C2(a.C0672a.f113082a);
        } else {
            gVar.getClass();
            gVar.C2(new dd1.b(taxRate));
        }
        return Unit.f186387a;
    }
}
