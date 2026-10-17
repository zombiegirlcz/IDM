package qee;

import com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.CardDeliveryDetailsController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CardDeliveryDetailsController f245126w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(CardDeliveryDetailsController cardDeliveryDetailsController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f245126w = cardDeliveryDetailsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g(this.f245126w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            case 1:
                g gVar2 = new g(this.f245126w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
            default:
                g gVar3 = new g(this.f245126w, continuation, 2);
                gVar3.v = obj2;
                return gVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((g) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CardDeliveryDetailsController cardDeliveryDetailsController = this.f245126w;
        switch (i) {
            case 0:
                String str = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (Intrinsics.f(str, "NAVBAR_DONE_BUTTON_ID")) {
                    ((com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.a) cardDeliveryDetailsController.e3()).B2();
                }
                break;
            case 1:
                ty0.a aVar2 = (ty0.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                a aVarE3 = cardDeliveryDetailsController.e3();
                Intrinsics.h(aVar2);
                ((com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.a) aVarE3).L2(aVar2);
                break;
            default:
                ty0.a aVar4 = (ty0.a) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                a aVarE32 = cardDeliveryDetailsController.e3();
                Intrinsics.h(aVar4);
                ((com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.a) aVarE32).L2(aVar4);
                break;
        }
        return Unit.f186387a;
    }
}
