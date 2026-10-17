package ff1;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.acquiring.lite_pos.api.model.TaxRate;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.tax_rates.TaxRatesScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TaxRatesScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TaxRatesScreen taxRatesScreen, Continuation continuation) {
        super(2, continuation);
        this.v = taxRatesScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVar = (h) this.v.Y.getValue();
        Object obj3 = model.u;
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.acquiring.lite_pos.api.model.TaxRate");
        TaxRate taxRate = (TaxRate) obj3;
        j jVar = (j) hVar;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(taxRate, "taxRate");
        jVar.v2(new g(taxRate));
        return Unit.f186387a;
    }
}
