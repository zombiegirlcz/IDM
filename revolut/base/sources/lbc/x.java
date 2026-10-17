package lbc;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class x extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details.a f193652w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i, com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f193652w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new x(0, this.f193652w, continuation);
            case 1:
                return new x(1, this.f193652w, continuation);
            default:
                return new x(2, this.f193652w, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((x) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details.a aVar2 = this.f193652w;
                w wVar = new w(1, aVar2, null);
                this.v = 1;
                Object objB = pu7.a.B(aVar2.k, "dismiss_home_delivery_widget_tip", wVar, this);
                return objB == aVar ? aVar : objB;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details.a aVar4 = this.f193652w;
                w wVar2 = new w(2, aVar4, null);
                this.v = 1;
                Object objB2 = pu7.a.B(aVar4.k, "open_add_delivery_widget_flow", wVar2, this);
                return objB2 == aVar3 ? aVar3 : objB2;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details.a aVar6 = this.f193652w;
                    tul.b bVar = aVar6.f84625r;
                    String str = aVar6.o.f84619a;
                    this.v = 1;
                    Object objB3 = ((qac.i) bVar.f274637b).e.b(str, false, this);
                    if (objB3 != aVar5) {
                        objB3 = Unit.f186387a;
                    }
                    if (objB3 != aVar5) {
                        objB3 = Unit.f186387a;
                    }
                    if (objB3 == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
