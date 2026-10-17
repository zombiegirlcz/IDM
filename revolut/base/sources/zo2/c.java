package zo2;

import com.revolut.feature.bank_account_switching.impl.ui.review.BankAccountSwitchingReviewScreen;
import com.revolut.feature.bank_account_switching.impl.ui.review.BankAccountSwitchingReviewScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ BankAccountSwitchingReviewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(BankAccountSwitchingReviewScreen bankAccountSwitchingReviewScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = bankAccountSwitchingReviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            case 1:
                return new c(this.v, continuation, 1);
            default:
                return new c(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        BankAccountSwitchingReviewScreen bankAccountSwitchingReviewScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                bankAccountSwitchingReviewScreen.m2().onBackPressed();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.bank_account_switching.impl.ui.review.b bVar = (com.revolut.feature.bank_account_switching.impl.ui.review.b) ((f) bankAccountSwitchingReviewScreen.Q.getValue());
                bVar.getClass();
                bVar.l2(new k(bVar, null, 1), new yi5.b(26));
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.bank_account_switching.impl.ui.review.b bVar2 = (com.revolut.feature.bank_account_switching.impl.ui.review.b) ((f) bankAccountSwitchingReviewScreen.Q.getValue());
                bp2.e eVar = (bp2.e) ((d) ((j2) bVar2.f63971t.f22677a).getValue()).f.getContent();
                List list = eVar != null ? eVar.f17549c : null;
                List list2 = list;
                if (list2 == null || list2.isEmpty()) {
                    bVar2.l2(new k(bVar2, null, 2), new yi5.b(26));
                } else if (list.size() == 1) {
                    bVar2.l2(new zah.f(bVar2, list, null, 22), new yi5.b(26));
                } else {
                    oki.h.v2(bVar2.u, new BankAccountSwitchingReviewScreenContract$ModalStep.LinkList(list), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                    Unit unit = Unit.f186387a;
                }
                break;
        }
        return Unit.f186387a;
    }
}
