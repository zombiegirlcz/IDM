package dce;

import com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class p0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c f112885w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f112886x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ qua.p f112887y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar, String str, qua.p pVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f112885w = cVar;
        this.f112886x = str;
        this.f112887y = pVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new p0(this.f112885w, this.f112886x, this.f112887y, continuation, 0);
            default:
                return new p0(this.f112885w, this.f112886x, this.f112887y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((p0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar = this.f112885w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    rfm.z zVarB = ((wl3.h) cVar.D).b(this.f112886x);
                    this.v = 1;
                    obj2 = nim.a.i(zVarB, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                zm3.a aVar2 = (zm3.a) obj2;
                zm3.l lVar = aVar2 instanceof zm3.l ? (zm3.l) aVar2 : null;
                if (lVar != null) {
                    return cVar.C1(zh9.u0.b(((rae.d) cVar.u).l(lVar, this.f112887y)));
                }
                return null;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar2 = this.f112885w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    jhi.b bVarG = mo3.a.g(cVar2.J.d(this.f112886x), null, null, 3);
                    this.v = 1;
                    obj2 = vkm.q.x(bVarG, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return cVar2.C1(zh9.u0.b(((rae.d) cVar2.u).b(this.f112887y, (PaymentCounterpartyInfo) obj2)));
        }
    }
}
