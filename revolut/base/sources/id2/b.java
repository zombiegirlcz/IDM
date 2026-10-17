package id2;

import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.feature.apm.services.ideal.impl.ui.confirmation.IDealPaymentConfirmedScreen;
import com.revolut.feature.apm.services.ideal.impl.ui.confirmation.IDealPaymentConfirmedScreenContract$PaymentFlowEntryPoint;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ IDealPaymentConfirmedScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(IDealPaymentConfirmedScreen iDealPaymentConfirmedScreen, Continuation continuation) {
        super(2, continuation);
        this.u = iDealPaymentConfirmedScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((PromptContentDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        com.revolut.feature.apm.services.ideal.impl.ui.confirmation.b bVar = (com.revolut.feature.apm.services.ideal.impl.ui.confirmation.b) ((e) this.u.O.getValue());
        IDealPaymentConfirmedScreenContract$PaymentFlowEntryPoint iDealPaymentConfirmedScreenContract$PaymentFlowEntryPoint = bVar.o.f62841a;
        if (iDealPaymentConfirmedScreenContract$PaymentFlowEntryPoint instanceof IDealPaymentConfirmedScreenContract$PaymentFlowEntryPoint.Mobile) {
            bVar.n2(new com.revolut.feature.apm.services.ideal.impl.ui.confirmation.a(bVar, iDealPaymentConfirmedScreenContract$PaymentFlowEntryPoint, null), new whi.b(6));
        } else {
            if (!Intrinsics.f(iDealPaymentConfirmedScreenContract$PaymentFlowEntryPoint, IDealPaymentConfirmedScreenContract$PaymentFlowEntryPoint.Desktop.f62842a)) {
                throw new NoWhenBranchMatchedException();
            }
            com.google.android.gms.internal.mlkit_vision_face.a.C(null, null, null, 7, bVar.f62845q);
        }
        return Unit.f186387a;
    }
}
