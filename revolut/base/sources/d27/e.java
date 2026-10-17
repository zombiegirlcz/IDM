package d27;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.OrderInitPageCreateScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ OrderInitPageCreateScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(OrderInitPageCreateScreen orderInitPageCreateScreen, Continuation continuation) {
        super(2, continuation);
        this.v = orderInitPageCreateScreen;
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

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        z zVarD = this.v.d();
        String listId = model.f53228a;
        com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a aVar2 = (com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a) zVarD;
        cli.y yVar = aVar2.E;
        Intrinsics.checkNotNullParameter(listId, "listId");
        switch (listId.hashCode()) {
            case -1644354029:
                if (listId.equals("LIST_ID_ITEM_CUSTOMER_SETS_PRICE")) {
                    aVar2.H2(yVar, new d0(0));
                }
                break;
            case 38865385:
                if (listId.equals("LIST_ID_ITEM_LIMIT_SALES_NUMBER")) {
                    aVar2.H2(yVar, new d0(1));
                }
                break;
            case 878306069:
                if (listId.equals("LIST_ID_ITEM_CUSTOM_FIELD")) {
                    aVar2.H2(yVar, new d0(4));
                }
                break;
            case 1589465489:
                if (listId.equals("LIST_ID_ITEM_EXPIRY_DATE")) {
                    aVar2.H2(yVar, new d0(2));
                }
                break;
        }
        return Unit.f186387a;
    }
}
