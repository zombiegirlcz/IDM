package r37;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.freelancer.impl.ui.tax_hub.payment.tax_type_picker.TaxHubPaymentTypePickerScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TaxHubPaymentTypePickerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(TaxHubPaymentTypePickerScreen taxHubPaymentTypePickerScreen, Continuation continuation) {
        super(2, continuation);
        this.v = taxHubPaymentTypePickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVar = (g) this.v.P.getValue();
        String listId = model.f52373a;
        com.revolut.feature.freelancer.impl.ui.tax_hub.payment.tax_type_picker.a aVar2 = (com.revolut.feature.freelancer.impl.ui.tax_hub.payment.tax_type_picker.a) gVar;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "ERROR_STATE_ID")) {
            aVar2.f74335r.a();
        }
        return Unit.f186387a;
    }
}
