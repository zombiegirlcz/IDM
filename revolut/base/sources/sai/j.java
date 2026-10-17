package sai;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import sa6.y;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f261415w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f261416x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(k kVar, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f261415w = kVar;
        this.f261416x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.f261415w, this.f261416x, continuation, 0);
            default:
                return new j(this.f261415w, this.f261416x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((j) create(continuation)).invokeSuspend(Unit.f186387a);
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
                pai.a aVar2 = this.f261415w.f261417p;
                this.v = 1;
                Object objB = ((pai.e) aVar2).b(this.f261416x, this);
                return objB == aVar ? aVar : objB;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                Continuation continuation = null;
                k kVar = this.f261415w;
                if (i2 == 0) {
                    o.b(obj2);
                    j jVar = new j(kVar, this.f261416x, continuation, 0);
                    this.v = 1;
                    obj2 = kVar.p2(this, jVar);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                pai.j jVar2 = (pai.j) obj2;
                if (Intrinsics.f(jVar2, pai.i.f234566a) || Intrinsics.f(jVar2, pai.g.f234564a)) {
                    kVar.f261418q.getClass();
                    yji.l.a1(kVar, kVar.X1(pai.f.b()), null, null, new s1k.b(kVar, continuation, 20), 3);
                } else {
                    if (!Intrinsics.f(jVar2, pai.h.f234565a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    kVar.H2(kVar.u, new y(6));
                    kVar.f261418q.getClass();
                    kVar.X1(pai.f.a());
                }
                return Unit.f186387a;
        }
    }
}
