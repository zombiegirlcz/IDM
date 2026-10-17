package bh9;

import a3i.w;
import efm.d0;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class s extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t f15283w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(t tVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f15283w = tVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new s(this.f15283w, continuation, 0);
            case 1:
                return new s(this.f15283w, continuation, 1);
            default:
                return new s(this.f15283w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((s) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                t tVar = this.f15283w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    wo1.b bVar = tVar.f15285q;
                    b bVar2 = tVar.o;
                    xo1.d dVar = new xo1.d(bVar2.f15269a, bVar2.f15270b.f61145a, "2.0", 10);
                    this.v = 1;
                    obj2 = ((vp1.c) bVar).b(dVar, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                tVar.H2(tVar.f15289w, new beg.k((List) obj2, tVar, 6));
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                t tVar2 = this.f15283w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    d0 d0VarF = tVar2.v.f(false);
                    this.v = 1;
                    obj2 = nim.a.b(d0VarF, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                Intrinsics.checkNotNullExpressionValue(obj2, "await(...)");
                tVar2.H2(tVar2.f15289w, new w(3, do3.q.y((do3.n) obj2)));
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    t tVar3 = this.f15283w;
                    a3i.q qVar = new a3i.q(tVar3, null, 12);
                    this.v = 1;
                    if (u0.b0(tVar3.X(), "CONTINUE_BUTTON_TAG", qVar, this) == aVar3) {
                        return aVar3;
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
