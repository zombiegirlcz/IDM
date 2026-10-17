package m07;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.freelancer.impl.ui.profile.merchant_terms.FreelancerMerchantTermsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FreelancerMerchantTermsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(FreelancerMerchantTermsScreen freelancerMerchantTermsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = freelancerMerchantTermsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVarD3 = this.v.R2();
        String listId = model.f53228a;
        com.revolut.feature.freelancer.impl.ui.profile.merchant_terms.a aVar2 = (com.revolut.feature.freelancer.impl.ui.profile.merchant_terms.a) gVarD3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "ITEM_ID_PAYMENT_ACCEPTANCE")) {
            aVar2.C2(f.f201092a);
        }
        return Unit.f186387a;
    }
}
