package ccb;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class y extends gim.i implements Function1 {
    public zbb.a u;
    public xi0.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f23024w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c0 f23025x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(c0 c0Var, Continuation continuation) {
        super(1, continuation);
        this.f23025x = c0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new y(this.f23025x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((y) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        zbb.a aVar;
        xi0.b bVar;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.f23024w;
        if (i == 0) {
            yhm.o.b(obj2);
            c0 c0Var = this.f23025x;
            zbb.a aVar3 = c0Var.u;
            xi0.b bVar2 = ((i) c0Var.t2()).f.f115083b;
            ybb.d dVar = c0Var.f22975q;
            String str = c0Var.f22974p.f82766a;
            this.u = aVar3;
            this.v = bVar2;
            this.f23024w = 1;
            obj2 = dVar.f(str, this);
            if (obj2 != aVar2) {
                aVar = aVar3;
                bVar = bVar2;
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        bVar = this.v;
        aVar = this.u;
        yhm.o.b(obj2);
        this.u = null;
        this.v = null;
        this.f23024w = 2;
        Object objB = ((zbb.i) aVar).b(bVar, (zbb.f) obj2, this);
        return objB == aVar2 ? aVar2 : objB;
    }
}
