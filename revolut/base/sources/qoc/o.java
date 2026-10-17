package qoc;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class o extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f248130w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f248131x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(r rVar, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f248130w = rVar;
        this.f248131x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new o(this.f248130w, this.f248131x, continuation, 0);
            default:
                return new o(this.f248130w, this.f248131x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((o) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                r rVar = this.f248130w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    zjh.f fVar = rVar.B;
                    this.v = 1;
                    if (fVar.f(this.f248131x, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                rVar.A.getClass();
                return rVar.L2(jmc.d.a());
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
                r rVar2 = this.f248130w;
                o oVar = new o(rVar2, this.f248131x, null, 0);
                this.v = 1;
                Object objY2 = rVar2.Y2(this, oVar);
                return objY2 == aVar2 ? aVar2 : objY2;
        }
    }
}
