package lv6;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.freelancer.impl.ui.cashback.screen.booster.FreelancerCashbackBoosterScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FreelancerCashbackBoosterScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(FreelancerCashbackBoosterScreen freelancerCashbackBoosterScreen, Continuation continuation) {
        super(2, continuation);
        this.v = freelancerCashbackBoosterScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        p pVarE3 = this.v.d();
        String listId = model.f52708a;
        com.revolut.feature.freelancer.impl.ui.cashback.screen.booster.b bVar = (com.revolut.feature.freelancer.impl.ui.cashback.screen.booster.b) pVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "LIST_ID_PAYOUT_HEADER_ITEM")) {
            bVar.C2(new m(bVar.f73753r));
        } else if (Intrinsics.f(listId, "LIST_ID_TRANSACTION_HEADER_ITEM")) {
            bVar.C2(new m(bVar.f73754s));
        }
        return Unit.f186387a;
    }
}
