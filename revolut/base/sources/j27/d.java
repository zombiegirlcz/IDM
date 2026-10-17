package j27;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.freelancer.impl.ui.sales.order_init_page.orders.OrderInitPageHistoryScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ OrderInitPageHistoryScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(OrderInitPageHistoryScreen orderInitPageHistoryScreen, Continuation continuation) {
        super(2, continuation);
        this.v = orderInitPageHistoryScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVarD3 = this.v.R2();
        String searchQuery = textData.f52598b.toString();
        j jVar = (j) gVarD3;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        jVar.H2(jVar.f170719s, new ik3.a(searchQuery, 16));
        return Unit.f186387a;
    }
}
