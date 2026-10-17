package m9d;

import f7d.b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
public final class r0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ g1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f203738w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(g1 g1Var, Object obj2, Continuation continuation) {
        super(2, continuation);
        this.v = g1Var;
        this.f203738w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new r0(this.v, this.f203738w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((r0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        g1 g1Var = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            s7d.e eVar = g1Var.f203699q;
            this.u = 1;
            obj2 = eVar.d(this.f203738w, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        f7d.b bVar = (f7d.b) obj2;
        if (bVar instanceof f7d.c) {
            return g1Var.C1(((f7d.c) bVar).f132594a);
        }
        if (Intrinsics.f(bVar, b.C0776b.f132593a) || Intrinsics.f(bVar, b.a.f132592a)) {
            return Unit.f186387a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
