package rp9;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.payments.bills_chooser.impl.ui.bills_selection.BillsChooserScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ BillsChooserScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(BillsChooserScreen billsChooserScreen, Continuation continuation) {
        super(2, continuation);
        this.u = billsChooserScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        m mVar = (m) this.u.T2();
        mVar.getClass();
        mVar.n2(new l(mVar, null), new whi.b(6));
        return Unit.f186387a;
    }
}
