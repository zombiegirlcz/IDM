package i06;

import cli.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.k0;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f157304w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(q qVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f157304w = qVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new p(this.f157304w, continuation, 0);
            default:
                return new p(this.f157304w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((p) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                q qVar = this.f157304w;
                y yVar = qVar.f157307r;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    qVar.H2(yVar, new hy2.k(23));
                    qVar.f157306q.Q();
                    this.v = 1;
                    if (k0.b(100L, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                qVar.H2(yVar, new hy2.k(24));
                return Unit.f186387a;
            default:
                q qVar2 = this.f157304w;
                y yVar2 = qVar2.f157307r;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    t53.a aVar3 = qVar2.o;
                    wz5.a aVar4 = new wz5.a(((g) ((j2) yVar2.f22677a).getValue()).f157290a, ((g) ((j2) yVar2.f22677a).getValue()).f157291b);
                    this.v = 1;
                    Object objA = ((q53.c) aVar3.f268036a).a(aVar4, this);
                    if (objA != aVar2) {
                        objA = Unit.f186387a;
                    }
                    if (objA == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
