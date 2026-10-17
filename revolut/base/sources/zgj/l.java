package zgj;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.retail.feature.esim.impl.ui.screens.checkout.EsimCheckoutScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EsimCheckoutScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(EsimCheckoutScreen esimCheckoutScreen, Continuation continuation) {
        super(2, continuation);
        this.v = esimCheckoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l lVar = new l(this.v, continuation);
        lVar.u = obj2;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((InputChecklistDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputChecklistDelegate.Model model = (InputChecklistDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        y yVarE3 = this.v.d();
        boolean z = !model.f52521c;
        Object obj3 = model.i;
        com.revolut.retail.feature.esim.impl.ui.screens.checkout.a aVar2 = (com.revolut.retail.feature.esim.impl.ui.screens.checkout.a) yVarE3;
        aVar2.getClass();
        String str = obj3 instanceof String ? (String) obj3 : null;
        if (str != null) {
            aVar2.H2(aVar2.H, new a31.i(z, str, 23));
        }
        return Unit.f186387a;
    }
}
