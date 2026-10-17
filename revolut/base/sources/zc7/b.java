package zc7;

import amd.j;
import com.revolut.feature.spending_analytics.api.models.NetWorthAccount;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f321239w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, j jVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
        this.f321239w = jVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, this.f321239w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        c cVar = this.v;
        if (i == 0) {
            o.b(obj2);
            frd.i iVar = cVar.f321241b;
            this.u = 1;
            obj2 = iVar.f(this.f321239w, NetWorthAccount.Personal.f87455a, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        emd.c cVar2 = (emd.c) obj2;
        if (cVar2 instanceof emd.a) {
            cVar.f321242c.b(new fc7.d(((emd.a) cVar2).f127650a));
        } else {
            if (!(cVar2 instanceof emd.b)) {
                throw new NoWhenBranchMatchedException();
            }
            cVar.f321240a.b(((emd.b) cVar2).f127651a);
        }
        return Unit.f186387a;
    }
}
