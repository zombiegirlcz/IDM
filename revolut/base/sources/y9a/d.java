package y9a;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.pix.impl.flow.automatico.screens.recurring_payments.PixAutomaticoRecurringPaymentsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PixAutomaticoRecurringPaymentsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(PixAutomaticoRecurringPaymentsScreen pixAutomaticoRecurringPaymentsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = pixAutomaticoRecurringPaymentsScreen;
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
        String str = model.f52373a;
        boolean zF = Intrinsics.f(str, "NO_PAYMENTS_ID");
        PixAutomaticoRecurringPaymentsScreen pixAutomaticoRecurringPaymentsScreen = this.v;
        if (zF) {
            ((r) pixAutomaticoRecurringPaymentsScreen.d()).C2(i.f311817a);
        } else if (Intrinsics.f(str, "RETRY_LIST_ID")) {
            ((r) pixAutomaticoRecurringPaymentsScreen.d()).f311826q.k(Unit.f186387a);
        } else {
            int i = jli.h.f175850a;
        }
        return Unit.f186387a;
    }
}
