package lbc;

import com.revolut.core.ui_kit.models.AppTipUIModel;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details.OrderDetailsScreen;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.l0;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ OrderDetailsScreen f193634w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(OrderDetailsScreen orderDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f193634w = orderDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f193634w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            case 1:
                e eVar2 = new e(this.f193634w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
            default:
                e eVar3 = new e(this.f193634w, continuation, 2);
                eVar3.v = obj2;
                return eVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((e) create((AppTipUIModel) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        OrderDetailsScreen orderDetailsScreen = this.f193634w;
        switch (i) {
            case 0:
                String listId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s sVarE3 = orderDetailsScreen.R2();
                Intrinsics.h(listId);
                com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details.a aVar2 = (com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details.a) sVarE3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                if (listId.equals("ID_ORDER_DETAILS_THREE_DOTS")) {
                    List list = (List) ((m) ((j2) aVar2.f84630y.f22677a).getValue()).f193639c.getContent();
                    List list2 = list;
                    if (list2 == null || list2.isEmpty()) {
                        IllegalStateException illegalStateException = new IllegalStateException("Pop Up menu clicked with no items");
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                    } else {
                        l0.f(aVar2.f84624q, "ID_ORDER_DETAILS_THREE_DOTS", zi0.c.d(list), null, null, 12);
                    }
                }
                break;
            case 1:
                AppTipUIModel appTipUIModel = (AppTipUIModel) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s sVarE32 = orderDetailsScreen.R2();
                String listId2 = appTipUIModel.f57725a;
                com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details.a aVar4 = (com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details.a) sVarE32;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(listId2, "listId");
                if (Intrinsics.f(listId2, "ADD_TRACKING_WIDGET_TIP_ID")) {
                    aVar4.l2(new x(1, aVar4, continuation), new yi5.b(26));
                }
                break;
            default:
                AppTipUIModel appTipUIModel2 = (AppTipUIModel) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s sVarE33 = orderDetailsScreen.R2();
                String listId3 = appTipUIModel2.f57725a;
                com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details.a aVar6 = (com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details.a) sVarE33;
                aVar6.getClass();
                Intrinsics.checkNotNullParameter(listId3, "listId");
                if (Intrinsics.f(listId3, "ADD_TRACKING_WIDGET_TIP_ID")) {
                    aVar6.l2(new x(0, aVar6, continuation), new yi5.b(26));
                }
                break;
        }
        return Unit.f186387a;
    }
}
