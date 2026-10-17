package m07;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.freelancer.impl.ui.profile.merchant_terms.FreelancerMerchantTermsScreen;
import com.revolut.feature.freelancer.impl.ui.profile.merchant_terms.FreelancerMerchantTermsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FreelancerMerchantTermsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(FreelancerMerchantTermsScreen freelancerMerchantTermsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = freelancerMerchantTermsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVarD3 = this.v.R2();
        String listId = model.f52708a;
        com.revolut.feature.freelancer.impl.ui.profile.merchant_terms.a aVar2 = (com.revolut.feature.freelancer.impl.ui.profile.merchant_terms.a) gVarD3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "ITEM_ID_SETTLEMENT_TIME_HEADER")) {
            oki.h.v2(aVar2.f74051q, FreelancerMerchantTermsScreenContract$ModalStep.SettlementTimeInfo.f74049a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
