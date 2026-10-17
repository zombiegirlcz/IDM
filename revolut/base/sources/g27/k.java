package g27;

import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.feature.freelancer.impl.ui.sales.order_init_page.details.OrderInitPageDetailsScreen;
import com.revolut.feature.shared.order_initiation.api.domain.OrderInitiationPage;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ OrderInitPageDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(OrderInitPageDetailsScreen orderInitPageDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = orderInitPageDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((CellDetailsNoteDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsNoteDelegate.Model model = (CellDetailsNoteDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        o oVarE3 = this.v.R2();
        String listId = model.f51871a;
        Object obj3 = model.f51877l;
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.shared.order_initiation.api.domain.OrderInitiationPage");
        OrderInitiationPage page = (OrderInitiationPage) obj3;
        t tVar = (t) oVarE3;
        tVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(page, "page");
        tVar.n2(new s(listId, tVar, page, null), new whi.b(6));
        return Unit.f186387a;
    }
}
