package z32;

import com.revolut.core.ui_kit.delegates.RectangularButtonDelegate;
import com.revolut.feature.apm.core.ui.impl.ui.recipients.details.ApmRecipientDetailsNewScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ApmRecipientDetailsNewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ApmRecipientDetailsNewScreen apmRecipientDetailsNewScreen, Continuation continuation) {
        super(2, continuation);
        this.v = apmRecipientDetailsNewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((RectangularButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RectangularButtonDelegate.Model model = (RectangularButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((com.revolut.feature.apm.core.ui.impl.ui.recipients.details.a) this.v.d()).J2(model.f53150a);
        return Unit.f186387a;
    }
}
