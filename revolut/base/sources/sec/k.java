package sec;

import cli.y;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.revolutpay.shipping.api.domain.models.deliverymethod.DeliveryMethods;
import com.revolut.feature.revolutpay.shipping.shared.ui.delivery_methods.DeliveryMethodsScreen;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ DeliveryMethodsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(DeliveryMethodsScreen deliveryMethodsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = deliveryMethodsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        DeliveryMethods.DeliveryMethod deliveryMethod;
        Object next;
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        f fVarE3 = this.v.R2();
        String id10 = ((RowDelegate.Model) model.f53305b).f53228a;
        o oVar = (o) fVarE3;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        y yVar = oVar.f262177r;
        List list = (List) ((b) ((j2) yVar.f22677a).getValue()).f262165a.getContent();
        if (list != null) {
            Iterator it8 = list.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(((DeliveryMethods.DeliveryMethod) next).f84737a, id10)) {
                    break;
                }
            }
            deliveryMethod = (DeliveryMethods.DeliveryMethod) next;
        } else {
            deliveryMethod = null;
        }
        if (deliveryMethod != null) {
            oVar.H2(yVar, new scl.e(deliveryMethod, 11));
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("Delivery Methods not loaded on item click");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        }
        return Unit.f186387a;
    }
}
