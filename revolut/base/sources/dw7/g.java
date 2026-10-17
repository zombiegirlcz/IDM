package dw7;

import gim.i;
import h93.f0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f120342w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f0 f120343x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, f0 f0Var, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f120342w = hVar;
        this.f120343x = f0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.f120342w, this.f120343x, continuation, 0);
            default:
                return new g(this.f120342w, this.f120343x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((g) create(continuation)).invokeSuspend(Unit.f186387a);
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
                eu7.b bVar = this.f120342w.f120344p;
                this.v = 1;
                Object objA = bVar.a(this.f120343x, this);
                return objA == aVar ? aVar : objA;
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
                h hVar = this.f120342w;
                g gVar = new g(hVar, this.f120343x, null, 0);
                this.v = 1;
                Object objP2 = hVar.p2(this, gVar);
                return objP2 == aVar2 ? aVar2 : objP2;
        }
    }
}
