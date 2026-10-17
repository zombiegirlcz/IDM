package g27;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.freelancer.impl.ui.sales.order_init_page.details.OrderInitPageDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ OrderInitPageDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(OrderInitPageDetailsScreen orderInitPageDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = orderInitPageDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((ActionsView.Item) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ActionsView.Item item = (ActionsView.Item) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        o oVarE3 = this.v.R2();
        String listId = item.f58316a;
        t tVar = (t) oVarE3;
        tVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        tVar.n2(new g0a.e(listId, tVar, null, 2), new whi.b(6));
        return Unit.f186387a;
    }
}
