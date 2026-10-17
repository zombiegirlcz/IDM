package d27;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.OrderInitPageCreateScreen;
import com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.OrderInitPageCreateScreenContract$Step;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ OrderInitPageCreateScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(OrderInitPageCreateScreen orderInitPageCreateScreen, Continuation continuation) {
        super(2, continuation);
        this.v = orderInitPageCreateScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        v vVar;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        z zVarD = this.v.d();
        String listId = model.f53228a;
        com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a aVar2 = (com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a) zVarD;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        com.revolut.kompot.navigable.vc.modal.a aVar3 = aVar2.F;
        int iHashCode = listId.hashCode();
        if (iHashCode == -1644354029) {
            if (listId.equals("LIST_ID_ITEM_CUSTOMER_SETS_PRICE")) {
                vVar = v.CUSTOMER_SETS_PRICE;
                oki.h.v2(aVar3, new OrderInitPageCreateScreenContract$Step.CustomisationInfo(vVar), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                return Unit.f186387a;
            }
            throw new IllegalStateException(listId.concat(" cannot be handled by onTitleBadgeClicked."));
        }
        if (iHashCode == 38865385) {
            if (listId.equals("LIST_ID_ITEM_LIMIT_SALES_NUMBER")) {
                vVar = v.REUSABLE_PAYMENT_LINK;
                oki.h.v2(aVar3, new OrderInitPageCreateScreenContract$Step.CustomisationInfo(vVar), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                return Unit.f186387a;
            }
            throw new IllegalStateException(listId.concat(" cannot be handled by onTitleBadgeClicked."));
        }
        if (iHashCode == 1589465489 && listId.equals("LIST_ID_ITEM_EXPIRY_DATE")) {
            vVar = v.EXPIRY_DATE;
            oki.h.v2(aVar3, new OrderInitPageCreateScreenContract$Step.CustomisationInfo(vVar), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            return Unit.f186387a;
        }
        throw new IllegalStateException(listId.concat(" cannot be handled by onTitleBadgeClicked."));
    }
}
