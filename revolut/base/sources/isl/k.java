package isl;

import ip0.qn0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import rp0.y;
import vkm.q;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes12.dex */
public final class k extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f168314w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(m mVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f168314w = mVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.f168314w, continuation, 0);
            default:
                return new k(this.f168314w, continuation, 1);
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
                m mVar = this.f168314w;
                if (i == 0) {
                    o.b(obj2);
                    ybl.b bVar = mVar.f168317m;
                    c cVar = mVar.f168316l;
                    Continuation continuation = null;
                    jhi.b bVarH = mo3.a.h(nim.a.v(u0.m(xam.a.h(new l(mVar, continuation, 1), rd0.e.b(((ael.k) bVar).f(cVar.f168307a))), xam.a.h(new l(mVar, continuation, 0), rd0.e.b(((ael.k) mVar.f168317m).f(cVar.f168307a)))), new isd.a(9)), new igh.o(mVar, 14), new qn0(26), 2);
                    this.v = 1;
                    obj2 = q.x(bVarH, this);
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
                efm.b bVarG = mVar.o.G((y) obj2);
                this.v = 2;
                if (nim.a.a(bVarG, this) == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    m mVar2 = this.f168314w;
                    k kVar = new k(mVar2, null, 0);
                    this.v = 1;
                    if (mVar2.Y2(this, kVar) == aVar2) {
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
