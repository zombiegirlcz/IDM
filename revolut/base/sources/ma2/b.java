package ma2;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.feature.apm.payid.impl.screen.createpayid.addpayid.AddPayIdScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ AddPayIdScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(AddPayIdScreen addPayIdScreen, Continuation continuation) {
        super(2, continuation);
        this.u = addPayIdScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CellDetailsActionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((com.revolut.feature.apm.payid.impl.screen.createpayid.addpayid.a) this.u.R2()).I2(i.f203926a);
        return Unit.f186387a;
    }
}
