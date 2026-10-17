package rhe;

import com.revolut.feature.tab.accounts.models.ProductId;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ m v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ProductId f254423w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ List f254424x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Set f254425y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m mVar, ProductId productId, List list, Set set, Continuation continuation) {
        super(2, continuation);
        this.v = mVar;
        this.f254423w = productId;
        this.f254424x = list;
        this.f254425y = set;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new i(this.v, this.f254423w, this.f254424x, this.f254425y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Exception {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        Set set = this.f254425y;
        m mVar = this.v;
        h hVar = new h(mVar, this.f254423w, this.f254424x, set, null);
        this.u = 1;
        Object objB = m.b(mVar, hVar, this);
        return objB == aVar ? aVar : objB;
    }
}
