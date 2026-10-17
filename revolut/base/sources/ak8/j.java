package ak8;

import a2g.m;
import ah1.p;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vkm.q;
import vkm.y;
import yhm.o;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f5743w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(k kVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f5743w = kVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.f5743w, continuation, 0);
            default:
                return new j(this.f5743w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                k kVar = this.f5743w;
                if (i == 0) {
                    o.b(obj2);
                    y yVarE = rd0.e.e(mo3.a.h(hj8.a.a(kVar.f5744p, kVar.o.f5738a, w4l.h.f294642c), new m(19), new p(13), 2), h0.f322473a, new a35.k(3, 8, null));
                    this.v = 1;
                    obj2 = q.x(yVarE, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                kVar.H2(kVar.f5745q, new ak7.g((String) obj2, 1));
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    k kVar2 = this.f5743w;
                    a3i.q qVar = new a3i.q(kVar2, null, 3);
                    this.v = 1;
                    if (u0.b0(kVar2.X(), "UPDATE_MAIL_CTA_LOADING_TAG", qVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
