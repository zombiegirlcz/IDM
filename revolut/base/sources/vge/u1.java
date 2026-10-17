package vge;

import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class u1 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ v1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ProductAccountDescriptor$Value.Main f289029w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(v1 v1Var, ProductAccountDescriptor$Value.Main main, Continuation continuation) {
        super(2, continuation);
        this.v = v1Var;
        this.f289029w = main;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new u1(this.v, this.f289029w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((u1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            Map map = this.v.f289039b;
            ProductAccountDescriptor$Value.Main main = this.f289029w;
            pfe.b bVar = (pfe.b) map.get(main.f89727a);
            if (bVar != null) {
                ProductAccountId productAccountId = main.f89728b;
                this.u = 1;
                obj2 = bVar.f(productAccountId, this);
                if (obj2 == aVar) {
                    return aVar;
                }
            }
            return nie.d.f215687a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        yhm.o.b(obj2);
        nie.f fVar = (nie.f) obj2;
        if (fVar != null) {
            return fVar;
        }
        return nie.d.f215687a;
    }
}
