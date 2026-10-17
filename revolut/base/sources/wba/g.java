package wba;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.review.PixQrCodeTransactionReviewScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PixQrCodeTransactionReviewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(PixQrCodeTransactionReviewScreen pixQrCodeTransactionReviewScreen, Continuation continuation) {
        super(2, continuation);
        this.v = pixQrCodeTransactionReviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CellDetailsActionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsActionDelegate.Model model = (CellDetailsActionDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (Intrinsics.f(model.f51781a, "ID_INTEREST_AND_FEE")) {
            ((e0) this.v.R2()).C2(m.f296084a);
        }
        return Unit.f186387a;
    }
}
