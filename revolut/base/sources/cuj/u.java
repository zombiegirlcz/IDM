package cuj;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes11.dex */
public final class u extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y f109059w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h f109060x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(y yVar, h hVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f109059w = yVar;
        this.f109060x = hVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new u(this.f109059w, this.f109060x, continuation, 0);
            default:
                return new u(this.f109059w, this.f109060x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((u) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        h hVar = this.f109060x;
        y yVar = this.f109059w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                stj.h hVar2 = yVar.f109067r;
                String str = hVar.f109036a;
                String str2 = hVar.f109038c.f110436a;
                this.v = 1;
                mtj.q qVar = (mtj.q) hVar2.f265610a;
                qVar.getClass();
                mtj.i iVar = new mtj.i(qVar, str, str2, (Continuation) null, 0);
                p0 p0Var = p0.f264001a;
                Object objJ = e0.J(elm.f.f127540b, iVar, this);
                return objJ == aVar ? aVar : objJ;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                stj.h hVar3 = yVar.f109067r;
                String str3 = hVar.f109036a;
                String str4 = hVar.f109038c.f110436a;
                this.v = 1;
                mtj.q qVar2 = (mtj.q) hVar3.f265610a;
                qVar2.getClass();
                mtj.p pVar = new mtj.p(qVar2, str3, str4, null, 1);
                p0 p0Var2 = p0.f264001a;
                Object objJ2 = e0.J(elm.f.f127540b, pVar, this);
                return objJ2 == aVar2 ? aVar2 : objJ2;
        }
    }
}
