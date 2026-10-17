package k09;

import efm.d0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import u09.q;
import u09.y;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f179999w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ q f180000x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(m mVar, q qVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f179999w = mVar;
        this.f180000x = qVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.f179999w, this.f180000x, continuation, 0);
            default:
                return new k(this.f179999w, this.f180000x, continuation, 1);
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
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                d0 d0VarB = this.f179999w.f180003l.b(this.f180000x.f276145a, y.CONTENT_STARTED);
                this.v = 1;
                Object objB = nim.a.b(d0VarB, this);
                return objB == aVar ? aVar : objB;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                m mVar = this.f179999w;
                k kVar = new k(mVar, this.f180000x, null, 0);
                this.v = 1;
                Object objY2 = mVar.Y2(this, kVar);
                return objY2 == aVar2 ? aVar2 : objY2;
        }
    }
}
