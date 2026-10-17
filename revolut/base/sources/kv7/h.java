package kv7;

import h93.f0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f189990w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f0 f189991x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(i iVar, f0 f0Var, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f189990w = iVar;
        this.f189991x = f0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.f189990w, this.f189991x, continuation, 0);
            default:
                return new h(this.f189990w, this.f189991x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((h) create(continuation)).invokeSuspend(Unit.f186387a);
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
                eu7.b bVar = this.f189990w.f189992p;
                this.v = 1;
                Object objA = bVar.a(this.f189991x, this);
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
                i iVar = this.f189990w;
                h hVar = new h(iVar, this.f189991x, null, 0);
                this.v = 1;
                Object objP2 = iVar.p2(this, hVar);
                return objP2 == aVar2 ? aVar2 : objP2;
        }
    }
}
