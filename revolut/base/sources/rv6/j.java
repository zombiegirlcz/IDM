package rv6;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.freelancer.impl.ui.cashback.screen.plan.FreelancerCashbackPlanScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FreelancerCashbackPlanScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(FreelancerCashbackPlanScreen freelancerCashbackPlanScreen, Continuation continuation) {
        super(2, continuation);
        this.v = freelancerCashbackPlanScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVarE3 = this.v.d();
        String listId = model.f52708a;
        u uVar = (u) qVarE3;
        uVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "LIST_ID_PAYOUT_HEADER_ITEM")) {
            uVar.C2(new m(uVar.f257717t));
        } else if (Intrinsics.f(listId, "LIST_ID_TRANSACTION_HEADER_ITEM")) {
            uVar.C2(new m(uVar.u));
        }
        return Unit.f186387a;
    }
}
