package ff1;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.tax_rates.TaxRatesScreen;
import ff1.f;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TaxRatesScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(TaxRatesScreen taxRatesScreen, Continuation continuation) {
        super(2, continuation);
        this.v = taxRatesScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVar = (h) this.v.Y.getValue();
        String listId = model.f52708a;
        j jVar = (j) hVar;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "TAX_RATES_SUBHEADER_ID")) {
            jVar.v2(f.a.f134693a);
        }
        return Unit.f186387a;
    }
}
