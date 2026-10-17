package ku1;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes20.dex */
public final class c0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ e0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(e0 e0Var, Continuation continuation) {
        super(2, continuation);
        this.v = e0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c0(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        e0 e0Var = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            c02.j jVarY2 = e0.y2(e0Var);
            a0 a0Var = new a0(e0Var, jVarY2, 1);
            b0 b0Var = new b0(e0Var, jVarY2, null, 4);
            this.u = 1;
            obj2 = n14.k.Q(e0Var, null, null, a0Var, b0Var, this, 2);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        nii.e eVar = (nii.e) obj2;
        if (!(eVar instanceof nii.c)) {
            if (!(eVar instanceof nii.d)) {
                throw new NoWhenBranchMatchedException();
            }
            nii.d dVar = (nii.d) eVar;
            h32.j jVar = new h32.j(dVar, 3);
            q qVar = e0.Companion;
            e0Var.x2(jVar);
            Object obj3 = dVar.f216133a;
            Intrinsics.checkNotNullExpressionValue(obj3, "<get-data>(...)");
            e0Var.v2(new j((String) obj3));
        }
        return Unit.f186387a;
    }
}
