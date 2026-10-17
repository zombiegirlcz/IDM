package n23;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.card_order_new.impl.kompot.ordernewcard.tab.OrderNewCardTabController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mll.c0;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ OrderNewCardTabController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(OrderNewCardTabController orderNewCardTabController, Continuation continuation) {
        super(2, continuation);
        this.v = orderNewCardTabController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        k kVarE3 = this.v.R2();
        String listId = model.f53228a;
        Object obj3 = model.u;
        kVarE3.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        kVarE3.n2(new c0(kVarE3, listId, obj3, (Continuation) null), new whi.b(6));
        return Unit.f186387a;
    }
}
