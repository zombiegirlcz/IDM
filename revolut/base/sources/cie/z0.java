package cie;

import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vge.t3;
import vge.z2;

/* JADX INFO: loaded from: classes8.dex */
public final class z0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.tab.accounts.impl.ui.tab.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ProductAccountDescriptor$Value.Discover f24541w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(com.revolut.feature.tab.accounts.impl.ui.tab.d dVar, ProductAccountDescriptor$Value.Discover discover, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
        this.f24541w = discover;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new z0(this.v, this.f24541w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((z0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.tab.accounts.impl.ui.tab.d dVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            z2 z2Var = dVar.f89710s;
            this.u = 1;
            if (((t3) z2Var).j(this.f24541w, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        dVar.K.getClass();
        return dVar.X1(fhe.a.a());
    }
}
