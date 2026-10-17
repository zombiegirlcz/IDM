package zn6;

import com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.ReviewAccountLinkingDetailsScreen;
import com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.a;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ ReviewAccountLinkingDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(ReviewAccountLinkingDetailsScreen reviewAccountLinkingDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = reviewAccountLinkingDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ReviewAccountLinkingDetailsScreen reviewAccountLinkingDetailsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.c) reviewAccountLinkingDetailsScreen.e3()).C2(a.b.f73059a);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.c cVar = (com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.c) reviewAccountLinkingDetailsScreen.e3();
                cVar.getClass();
                cVar.l2(new m(cVar, null, 0), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
