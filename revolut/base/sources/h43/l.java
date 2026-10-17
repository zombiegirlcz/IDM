package h43;

import com.revolut.feature.card_payment_method.impl.flows.link_card.screens.chooser.ChooserScreen;
import com.revolut.feature.card_payment_method.impl.flows.selector.screens.selector.d;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class l extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ChooserScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ChooserScreen chooserScreen, Continuation continuation) {
        super(2, continuation);
        this.v = chooserScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l lVar = new l(this.v, continuation);
        lVar.u = obj2;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((d.m) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        d.m model = (d.m) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        s sVar = (s) this.v.d();
        sVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        j60.a.v(sVar.f149304r, false, null, 3);
        sVar.K2();
        return Unit.f186387a;
    }
}
