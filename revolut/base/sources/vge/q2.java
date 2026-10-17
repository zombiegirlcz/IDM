package vge;

import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class q2 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ t2 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ProductAccountDescriptor$Value.Discover f288982w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(t2 t2Var, ProductAccountDescriptor$Value.Discover discover, Continuation continuation) {
        super(2, continuation);
        this.v = t2Var;
        this.f288982w = discover;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new q2(this.v, this.f288982w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q2) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            t2 t2Var = this.v;
            mk0.a aVar2 = t2Var.f289011b;
            String str = t2Var.f289012c.h2().f253772c;
            vkm.z1 z1Var = t2Var.f;
            v73.c cVar = new v73.c(t2Var, this.f288982w, 25);
            this.u = 1;
            if (t2Var.p(aVar2, str, z1Var, cVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
