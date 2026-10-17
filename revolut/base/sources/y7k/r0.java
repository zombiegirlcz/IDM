package y7k;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.PaymentLinksAmountScreenContract$ModalStep;
import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.transfer.PaymentLinksTransferData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final class r0 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a aVar, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new r0(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((r0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a aVar = this.v;
        com.revolut.kompot.navigable.vc.modal.a aVar2 = aVar.I;
        fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            aVar.D.f194072c = true;
            f fVar = aVar.f102209q;
            hrf.f f102201c = aVar.o.getF102201c();
            PaymentLinksTransferData paymentLinksTransferDataN2 = aVar.N2();
            this.u = 1;
            obj2 = fVar.a(f102201c, paymentLinksTransferDataN2, this);
            if (obj2 == aVar3) {
                return aVar3;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        c cVar = (c) obj2;
        boolean z = cVar instanceof a;
        ModalDestination.Style.FULLSCREEN_FADE fullscreen_fade = ModalDestination.Style.FULLSCREEN_FADE.f98307a;
        if (z) {
            oki.h.v2(aVar2, new PaymentLinksAmountScreenContract$ModalStep.CurrencyChooser(((a) cVar).f311531a), fullscreen_fade);
        } else {
            if (!(cVar instanceof b)) {
                throw new NoWhenBranchMatchedException();
            }
            oki.h.v2(aVar2, new PaymentLinksAmountScreenContract$ModalStep.DualCurrencyChooser(((b) cVar).f311532a), fullscreen_fade);
        }
        return Unit.f186387a;
    }
}
