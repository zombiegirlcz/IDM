package nnj;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nme.j0;

/* JADX INFO: loaded from: classes11.dex */
public final class t extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.c f217709w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(int i, com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.c cVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f217709w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                t tVar = new t(0, this.f217709w, continuation);
                tVar.v = obj2;
                return tVar;
            case 1:
                t tVar2 = new t(1, this.f217709w, continuation);
                tVar2.v = obj2;
                return tVar2;
            case 2:
                t tVar3 = new t(2, this.f217709w, continuation);
                tVar3.v = obj2;
                return tVar3;
            default:
                t tVar4 = new t(3, this.f217709w, continuation);
                tVar4.v = obj2;
                return tVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Data data = (Data) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((t) create(data, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.c cVar = this.f217709w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.f101474x, new j0(data, 13));
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.f101474x, new j0(data2, 14));
                break;
            case 2:
                Data data3 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.f101474x, new j0(data3, 15));
                break;
            default:
                Data data4 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.f101474x, new j0(data4, 16));
                break;
        }
        return Unit.f186387a;
    }
}
