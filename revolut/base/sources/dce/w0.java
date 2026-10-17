package dce;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class w0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c f112906w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f112907x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0(com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f112906w = cVar;
        this.f112907x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new w0(this.f112906w, this.f112907x, continuation, 0);
            default:
                return new w0(this.f112906w, this.f112907x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((w0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar = this.f112906w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    rfm.z zVarB = ((wl3.h) cVar.D).b(this.f112907x);
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
                    return cVar.C1(zh9.u0.b(((rae.d) cVar.u).c(lVar)));
                }
                return null;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar2 = this.f112906w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    jhi.b bVarG = mo3.a.g(rd0.e.b(((ypg.p) cVar2.E).j(this.f112907x, w4l.j.f294644c)), null, null, 3);
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
                return cVar2.C1(zh9.u0.b(((aqg.b) cVar2.F).a((pcd.s) obj2)));
        }
    }
}
