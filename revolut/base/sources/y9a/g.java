package y9a;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.pix.impl.flow.automatico.screens.recurring_payments.PixAutomaticoRecurringPaymentsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PixAutomaticoRecurringPaymentsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(PixAutomaticoRecurringPaymentsScreen pixAutomaticoRecurringPaymentsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = pixAutomaticoRecurringPaymentsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (Intrinsics.f(model.f53228a, "RECURRING_PAYMENTS_ID")) {
            Object obj3 = model.u;
            g8a.k recurringPayment = obj3 instanceof g8a.k ? (g8a.k) obj3 : null;
            if (recurringPayment != null) {
                r rVar = (r) this.v.d();
                rVar.getClass();
                Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
                g8a.s sVar = recurringPayment.f141312b;
                String str = recurringPayment.f141311a;
                int i = sVar == null ? -1 : p.f311822a[sVar.ordinal()];
                if (i == 1) {
                    rVar.C2(new k(str));
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("payment with given state is not supported");
                    }
                    rVar.C2(new l(str));
                }
            }
        }
        return Unit.f186387a;
    }
}
