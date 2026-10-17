package xid;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes7.dex */
public final class k extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f306335w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ double f306336x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, double d, Continuation continuation) {
        super(2, continuation);
        this.f306335w = lVar;
        this.f306336x = d;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.f306335w, this.f306336x, continuation);
        kVar.v = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
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
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        double d = this.f306336x;
        l lVar = this.f306335w;
        j jVar = new j(lVar, coroutineScope, d, null);
        this.v = null;
        this.u = 1;
        Object objB0 = u0.b0(lVar.X(), "BID_BUTTON_TAG", jVar, this);
        return objB0 == aVar ? aVar : objB0;
    }
}
