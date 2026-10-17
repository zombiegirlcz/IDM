package dce;

import com.revolut.core.model.account.AccountId;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class u0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ qua.p f112901w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f112902x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar, qua.p pVar, String str, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
        this.f112901w = pVar;
        this.f112902x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new u0(this.v, this.f112901w, this.f112902x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((u0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            this.u = 1;
            obj2 = com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c.J2(cVar, this.f112901w, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return cVar.C1(zh9.u0.b(((rae.d) cVar.u).i((AccountId) obj2, this.f112902x)));
    }
}
