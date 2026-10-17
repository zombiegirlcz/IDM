package d27;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.OrderInitPageCreateScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ OrderInitPageCreateScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(OrderInitPageCreateScreen orderInitPageCreateScreen, Continuation continuation) {
        super(2, continuation);
        this.v = orderInitPageCreateScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l lVar = new l(this.v, continuation);
        lVar.u = obj2;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        z zVarD = this.v.d();
        String listId = textData.f52597a;
        CharSequence text = textData.f52598b;
        com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a aVar2 = (com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a) zVarD;
        cli.y yVar = aVar2.E;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(text, "text");
        int iHashCode = listId.hashCode();
        if (iHashCode != -1444528838) {
            if (iHashCode != -246660608) {
                if (iHashCode == 628619732 && listId.equals("LIST_ID_ITEM_LIMIT_SALES_NUMBER_INPUT")) {
                    aVar2.H2(yVar, new a2f.k(3, text));
                }
            } else if (listId.equals("LIST_ID_ITEM_CUSTOM_FIELD_INPUT")) {
                aVar2.H2(yVar, new a2f.k(1, text));
            }
        } else if (listId.equals("LIST_ID_ITEM_TITLE_INPUT")) {
            aVar2.H2(yVar, new a2f.k(2, text));
        }
        return Unit.f186387a;
    }
}
