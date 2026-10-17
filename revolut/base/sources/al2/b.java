package al2;

import afa.q;
import ah1.p;
import ai0.j;
import ang.f;
import efm.d0;
import ffk.t;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import r10.v;
import rp0.u0;
import te0.w;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends i implements Function2 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        d dVar = this.v;
        if (i == 0) {
            o.b(obj2);
            v vVar = dVar.f6137m;
            t tVar = (t) vVar.f250863b;
            d0 d0VarFirstOrError = m70.a.g(nim.a.w(tVar.t(false), new aik.d(21)), null, new p(20), 1).firstOrError();
            Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
            d0 d0VarFirstOrError2 = m70.a.g(tVar.x(), null, new p(21), 1).firstOrError();
            Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError2, "firstOrError(...)");
            d0 d0VarFirstOrError3 = m70.a.g(((f) vVar.f250864c).k(false), null, new p(22), 1).firstOrError();
            Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError3, "firstOrError(...)");
            ufm.i iVar = new ufm.i(w.I0(d0VarFirstOrError, d0VarFirstOrError2, d0VarFirstOrError3), new j(new q(vVar, 22), 3), 1);
            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
            this.u = 1;
            obj2 = nim.a.b(iVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        u0 u0Var = (u0) obj2;
        r60.b bVar = dVar.f6136l;
        Intrinsics.h(u0Var);
        ((r60.d) bVar).R(u0Var);
        return Unit.f186387a;
    }
}
