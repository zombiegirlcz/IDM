package vb4;

import ft3.h1;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;
import vkm.j2;

/* JADX INFO: loaded from: classes22.dex */
public final class p extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f287414w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(s sVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f287414w = sVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new p(this.f287414w, continuation, 0);
            default:
                return new p(this.f287414w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((p) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        s sVar = this.f287414w;
        switch (i) {
            case 0:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    Set set = ((f) zi0.c.I(((g) ((j2) sVar.f287419q.f22677a).getValue()).f287405a)).f287403b;
                    sb4.c cVar = sVar.o;
                    this.v = 1;
                    hx3.a aVar = cVar.f261499a;
                    h1 h1VarC = cVar.c();
                    j34.g gVar = ((hx3.g) aVar).f156379a;
                    gVar.getClass();
                    im9.h hVar = new im9.h(gVar, h1VarC, set, (Continuation) null, 4);
                    p0 p0Var = p0.f264001a;
                    Object objJ = e0.J(elm.f.f127540b, hVar, this);
                    if (objJ != obj3) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ != obj3) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ != obj3) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ == obj3) {
                        return obj3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                sVar.C2(l.f287409a);
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    p pVar = new p(sVar, null, 0);
                    this.v = 1;
                    if (sVar.p2(this, pVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
