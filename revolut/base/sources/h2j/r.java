package h2j;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public final class r extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.retail.feature.balance.picker.impl.new_picker.dual.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f148851w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.revolut.retail.feature.balance.picker.impl.new_picker.dual.a aVar, Object obj2, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
        this.f148851w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new r(this.v, this.f148851w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((r) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
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
        Object obj3 = this.f148851w;
        com.revolut.retail.feature.balance.picker.impl.new_picker.dual.a aVar2 = this.v;
        q qVar = new q(aVar2, obj3, null);
        this.u = 1;
        Object objP2 = aVar2.p2(this, qVar);
        return objP2 == aVar ? aVar : objP2;
    }
}
