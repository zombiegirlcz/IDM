package ff1;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.tax_rates.TaxRatesScreen;
import ff1.f;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TaxRatesScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TaxRatesScreen taxRatesScreen, Continuation continuation) {
        super(2, continuation);
        this.v = taxRatesScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVar = (h) this.v.Y.getValue();
        String listId = model.f52373a;
        j jVar = (j) hVar;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "EMPTY_TAX_RATES_ID")) {
            jVar.v2(f.a.f134693a);
        }
        return Unit.f186387a;
    }
}
