package rhe;

import com.revolut.feature.tab.accounts.models.ProductId;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ m v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ProductId f254415w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ List f254416x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(m mVar, ProductId productId, List list, Continuation continuation) {
        super(2, continuation);
        this.v = mVar;
        this.f254415w = productId;
        this.f254416x = list;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.v, this.f254415w, this.f254416x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
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
        List list = this.f254416x;
        m mVar = this.v;
        e eVar = new e(mVar, this.f254415w, list, null);
        this.u = 1;
        Object objB = m.b(mVar, eVar, this);
        return objB == aVar ? aVar : objB;
    }
}
