package g50;

import g50.c;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import q30.h;
import v30.c0;
import v30.m;
import v30.n;
import v30.p;
import yhm.o;

/* JADX INFO: loaded from: classes19.dex */
public final class e extends i implements Function2 {
    public int u;
    public final /* synthetic */ f v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Continuation continuation) {
        super(2, continuation);
        this.v = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        f fVar = this.v;
        if (i == 0) {
            o.b(obj2);
            q30.a aVar2 = fVar.f140599p;
            c0 c0Var = fVar.o.f51172a;
            this.u = 1;
            obj2 = ((h) aVar2).d(c0Var, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        p pVar = (p) obj2;
        if (pVar instanceof v30.o) {
            fVar.H2(fVar.f140600q, new g4k.e((v30.o) pVar, 1));
        } else {
            if (!(pVar instanceof n) && !(pVar instanceof m) && pVar != null) {
                throw new NoWhenBranchMatchedException();
            }
            fVar.C2(c.a.f140595a);
        }
        return Unit.f186387a;
    }
}
