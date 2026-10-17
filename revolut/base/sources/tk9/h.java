package tk9;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;
import vi9.c0;
import vkm.q;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f271917w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ bi9.f f271918x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(j jVar, bi9.f fVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f271917w = jVar;
        this.f271918x = fVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.f271917w, this.f271918x, continuation, 0);
            default:
                return new h(this.f271917w, this.f271918x, continuation, 1);
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
                if (i == 0) {
                    o.b(obj2);
                    xh9.a aVar2 = this.f271917w.f271919p;
                    bi9.f fVar = this.f271918x;
                    ti9.g gVar = (ti9.g) aVar2;
                    pfm.a aVarP = gVar.p(fVar.f15452b, fVar.f15451a.f322326a);
                    this.v = 1;
                    if (nim.a.a(aVarP, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                bi9.f fVar2 = this.f271918x;
                int i3 = 2;
                Continuation continuation = null;
                j jVar = this.f271917w;
                if (i2 == 0) {
                    o.b(obj2);
                    j60.a.v(jVar.f271921r, false, null, 3);
                    h hVar = new h(jVar, fVar2, continuation, 0);
                    this.v = 1;
                    if (jVar.p2(this, hVar) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        jVar.u2();
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                }
                jVar.f271920q.getClass();
                Flow flowX1 = jVar.X1(c0.g(fVar2));
                i iVar = new i(i3, 0, continuation);
                this.v = 2;
                if (q.y(flowX1, iVar, this) == aVar3) {
                    return aVar3;
                }
                jVar.u2();
                return Unit.f186387a;
        }
    }
}
