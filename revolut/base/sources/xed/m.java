package xed;

import com.revolut.core.ui_kit.delegates.vh;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
public final class m extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f304628w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ vh f304629x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, vh vhVar, Continuation continuation) {
        super(2, continuation);
        this.f304628w = nVar;
        this.f304629x = vhVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        m mVar = new m(this.f304628w, this.f304629x, continuation);
        mVar.v = obj2;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        vh vhVar = this.f304629x;
        n nVar = this.f304628w;
        l lVar = new l(vhVar, null, coroutineScope, nVar);
        this.v = null;
        this.u = 1;
        Object objB = pu7.a.B(nVar.k, "onSwipeActionClick", lVar, this);
        return objB == aVar ? aVar : objB;
    }
}
