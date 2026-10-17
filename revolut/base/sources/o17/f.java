package o17;

import com.revolut.feature.freelancer.impl.ui.sales.details.kompot.screen.FreelancerSaleDetailsScreen;
import ip0.x10;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FreelancerSaleDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(FreelancerSaleDetailsScreen freelancerSaleDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = freelancerSaleDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((x10) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        x10 x10Var = (x10) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarE3 = this.v.d();
        String listId = x10Var.f167082b.f58316a;
        com.revolut.feature.freelancer.impl.ui.sales.details.kompot.screen.a aVar2 = (com.revolut.feature.freelancer.impl.ui.sales.details.kompot.screen.a) mVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "LIST_ID_CARD_PAYMENTS_BLOCKED_LEARN_MORE")) {
            aVar2.n2(new v(aVar2, null), new whi.b(6));
        }
        return Unit.f186387a;
    }
}
