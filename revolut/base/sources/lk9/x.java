package lk9;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;
import vi9.c0;

/* JADX INFO: loaded from: classes5.dex */
public final class x extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y f196332w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ bi9.f f196333x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(y yVar, bi9.f fVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f196332w = yVar;
        this.f196333x = fVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new x(this.f196332w, this.f196333x, continuation, 0);
            default:
                return new x(this.f196332w, this.f196333x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((x) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    xh9.a aVar2 = this.f196332w.f196335q;
                    bi9.f fVar = this.f196333x;
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
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                bi9.f fVar2 = this.f196333x;
                Continuation continuation = null;
                y yVar = this.f196332w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    j60.a.v(yVar.u, false, null, 3);
                    x xVar = new x(yVar, fVar2, continuation, 0);
                    this.v = 1;
                    if (yVar.p2(this, xVar) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        yVar.u2();
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                yVar.f196338t.getClass();
                Flow flowX1 = yVar.X1(c0.g(fVar2));
                ie6.q qVar = new ie6.q(2, 24, null);
                this.v = 2;
                if (vkm.q.y(flowX1, qVar, this) == aVar3) {
                    return aVar3;
                }
                yVar.u2();
                return Unit.f186387a;
        }
    }
}
