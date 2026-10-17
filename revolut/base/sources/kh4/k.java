package kh4;

import efm.d0;
import ff4.m;
import ff4.q;
import ff4.t;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kp0.w0;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class k extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer.b f184061w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ q f184062x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer.b bVar, q qVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f184061w = bVar;
        this.f184062x = qVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.f184061w, this.f184062x, continuation, 0);
            default:
                return new k(this.f184061w, this.f184062x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((k) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer.b bVar = this.f184061w;
                if (i == 0) {
                    o.b(obj2);
                    t tVar = bVar.f68294r;
                    m mVar = (m) this.f184062x;
                    d0 d0VarA = tVar.a(new bv3.a(mVar.f134730b, mVar.f134731c, mVar.d), w0.F(bVar.f68292p.f68284a));
                    this.v = 1;
                    obj2 = nim.a.b(d0VarA, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                }
                this.v = 2;
                if (c84.t.N2(bVar, (it3.d) obj2, this, 2) == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer.b bVar2 = this.f184061w;
                    k kVar = new k(bVar2, this.f184062x, null, 0);
                    this.v = 1;
                    if (bVar2.p2(this, kVar) == aVar2) {
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
