package vha;

import com.revolut.feature.statements.api.navigation.AccountStatementProduct;
import com.revolut.feature.statements.api.navigation.AccountsStatementFeatureConfig;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import q97.g3;

/* JADX INFO: loaded from: classes5.dex */
public final class j0 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ q0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(q0 q0Var, Continuation continuation) {
        super(1, continuation);
        this.v = q0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new j0(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((j0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        q0 q0Var = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            g3 g3Var = new g3(mo3.a.g(rd0.e.b(q0Var.o.b(sfe.a.FULL)), null, new vgg.a0(10), 1), 29);
            this.u = 1;
            obj2 = vkm.q.x(g3Var, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return q0Var.A2(new AccountsStatementFeatureConfig.AccountsStatementDestination((Set) obj2, AccountStatementProduct.Pro.f88238a));
    }
}
