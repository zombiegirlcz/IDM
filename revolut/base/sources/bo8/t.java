package bo8;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class t extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b0 f17325w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(b0 b0Var, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f17325w = b0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new t(this.f17325w, continuation, 0);
            default:
                return new t(this.f17325w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((t) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                b0 b0Var = this.f17325w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    a87.b bVar = new a87.b(mo3.a.g(b0Var.f17302s.e(w4l.h.f294642c), null, new bn4.y(5), 1), 3);
                    this.v = 1;
                    obj2 = vkm.q.x(bVar, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                b0Var.C2(new g((io3.d) obj2));
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                b0 b0Var2 = this.f17325w;
                a87.b bVar2 = new a87.b(mo3.a.g(rd0.e.b(te8.z.b(b0Var2.f17300q, b0Var2.o.f17307a, false, 6)), null, new bn4.y(6), 1), 4);
                this.v = 1;
                Object objX = vkm.q.x(bVar2, this);
                return objX == aVar2 ? aVar2 : objX;
        }
    }
}
