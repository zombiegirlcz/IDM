package r4k;

import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.review.BankTransferReviewScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BankTransferReviewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(BankTransferReviewScreen bankTransferReviewScreen, Continuation continuation) {
        super(2, continuation);
        this.v = bankTransferReviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((SuggestionsBarDelegate.Suggestion) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        SuggestionsBarDelegate.Suggestion item = (SuggestionsBarDelegate.Suggestion) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        r rVarE3 = this.v.R2();
        Intrinsics.h(item);
        com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.review.a aVar2 = (com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.review.a) rVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(item, "item");
        vrf.h hVar = aVar2.D;
        xrf.b bVar = (xrf.b) hVar;
        bVar.b(item.f53496h, item.f53492a);
        return Unit.f186387a;
    }
}
