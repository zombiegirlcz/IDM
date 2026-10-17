package mk5;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.crypto.remittance.impl.ui.currency_picker.CurrencyChooserScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CurrencyChooserScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(CurrencyChooserScreen currencyChooserScreen, Continuation continuation) {
        super(2, continuation);
        this.v = currencyChooserScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.crypto.remittance.impl.ui.currency_picker.a aVar2 = (com.revolut.feature.crypto.remittance.impl.ui.currency_picker.a) nVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        aVar2.f70964s.d3(model, aVar2, aVar2.D);
        return Unit.f186387a;
    }
}
