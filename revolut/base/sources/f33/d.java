package f33;

import com.revolut.feature.card_order_new.impl.kompot.screen.delivery_methods.DeliveryMethodsController;
import f33.l;
import ip0.l00;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ DeliveryMethodsController f131880w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(DeliveryMethodsController deliveryMethodsController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f131880w = deliveryMethodsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f131880w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            default:
                d dVar2 = new d(this.f131880w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((l00) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        DeliveryMethodsController deliveryMethodsController = this.f131880w;
        switch (i) {
            case 0:
                l00 model = (l00) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i iVarE3 = deliveryMethodsController.e3();
                Intrinsics.h(model);
                h hVar = (h) iVarE3;
                hVar.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                hVar.J2();
                break;
            default:
                String id10 = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i iVarE32 = deliveryMethodsController.e3();
                Intrinsics.h(id10);
                h hVar2 = (h) iVarE32;
                hVar2.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                if (Intrinsics.f(id10, "MENU_NOT_NOW_LIST_ID")) {
                    hVar2.C2(l.b.f131897a);
                }
                break;
        }
        return Unit.f186387a;
    }
}
