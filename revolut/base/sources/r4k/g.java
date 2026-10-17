package r4k;

import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.review.BankTransferReviewScreen;
import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.review.BankTransferReviewScreenContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ BankTransferReviewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(BankTransferReviewScreen bankTransferReviewScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = bankTransferReviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.v, continuation, 0);
            case 1:
                return new g(this.v, continuation, 1);
            default:
                return new g(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        BankTransferReviewScreen bankTransferReviewScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bankTransferReviewScreen.m2().onBackPressed();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bankTransferReviewScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.review.a aVar4 = (com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.review.a) bankTransferReviewScreen.R2();
                BankTransferReviewScreenContract$InputData bankTransferReviewScreenContract$InputData = aVar4.o;
                cli.y yVar = aVar4.H;
                j2 j2Var = (j2) yVar.f22677a;
                j2 j2Var2 = (j2) yVar.f22677a;
                if (n1l.b.d(((l) j2Var.getValue()).f251480c.i, ((l80.f) aVar4.f102133w).f())) {
                    aVar4.C2(new o(((l) j2Var2.getValue()).f251480c, aVar4.J2(), bankTransferReviewScreenContract$InputData.f102122a, bankTransferReviewScreenContract$InputData.f102123b.getF92255a()));
                } else {
                    aVar4.C2(new p(((l) j2Var2.getValue()).f251480c, aVar4.J2(), bankTransferReviewScreenContract$InputData.f102122a, bankTransferReviewScreenContract$InputData.f102123b.getF92255a()));
                }
                break;
        }
        return Unit.f186387a;
    }
}
