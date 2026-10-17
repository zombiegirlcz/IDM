package azi;

import ha3.x;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f11465w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f11466x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(j jVar, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f11465w = jVar;
        this.f11466x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.f11465w, this.f11466x, continuation, 0);
            case 1:
                return new f(this.f11465w, this.f11466x, continuation, 1);
            default:
                return new f(this.f11465w, this.f11466x, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((f) create(continuation)).invokeSuspend(Unit.f186387a);
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
                ufm.b bVarP = ((x) this.f11465w.f11472q).p(this.f11466x);
                this.v = 1;
                Object objB = nim.a.b(bVarP, this);
                return objB == aVar ? aVar : objB;
            case 1:
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
                j jVar = this.f11465w;
                f fVar = new f(jVar, this.f11466x, null, 0);
                this.v = 1;
                Object objP2 = jVar.p2(this, fVar);
                return objP2 == aVar2 ? aVar2 : objP2;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                wli.x xVar = this.f11465w.f11473r;
                lg0.a aVar4 = lg0.a.OPEN_BROWSER;
                this.v = 1;
                Object objX1 = lg0.b.x1(xVar, this.f11466x, aVar4, null, this, 4);
                return objX1 == aVar3 ? aVar3 : objX1;
        }
    }
}
