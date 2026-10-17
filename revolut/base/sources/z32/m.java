package z32;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.feature.apm.core.ui.impl.ui.recipients.details.ApmRecipientDetailsNewScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public final class m extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ApmRecipientDetailsNewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ApmRecipientDetailsNewScreen apmRecipientDetailsNewScreen, Continuation continuation) {
        super(2, continuation);
        this.v = apmRecipientDetailsNewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        m mVar = new m(this.v, continuation);
        mVar.u = obj2;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((CellDetailsChevronDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsChevronDelegate.Model model = (CellDetailsChevronDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((com.revolut.feature.apm.core.ui.impl.ui.recipients.details.a) this.v.d()).J2(model.f51822a);
        return Unit.f186387a;
    }
}
