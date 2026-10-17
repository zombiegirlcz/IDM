package ma2;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.apm.payid.impl.screen.createpayid.addpayid.AddPayIdScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AddPayIdScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AddPayIdScreen addPayIdScreen, Continuation continuation) {
        super(2, continuation);
        this.v = addPayIdScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (Intrinsics.f(model.f52373a, "ERROR_STATE_ID")) {
            ((com.revolut.feature.apm.payid.impl.screen.createpayid.addpayid.a) this.v.R2()).I2(k.f203928a);
        }
        return Unit.f186387a;
    }
}
