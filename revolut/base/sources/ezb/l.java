package ezb;

import efm.d0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import m1c.l0;

/* JADX INFO: loaded from: classes6.dex */
public final class l extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ l0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.rev_points.impl.ui.challenges.home.b f130930w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(l0 l0Var, com.revolut.feature.rev_points.impl.ui.challenges.home.b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = l0Var;
        this.f130930w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new l(this.v, this.f130930w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            String str = this.v.i;
            if (str == null) {
                return null;
            }
            d0 d0VarC = ((s06.j) this.f130930w.f83788t).c(str, false, lg0.a.IGNORE);
            this.u = 1;
            obj2 = nim.a.b(d0VarC, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return (Boolean) obj2;
    }
}
