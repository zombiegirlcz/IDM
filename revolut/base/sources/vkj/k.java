package vkj;

import com.revolut.retail.feature.esim.api.model.EsimDescriptorValue;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ EsimDescriptorValue.Link f289975w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, EsimDescriptorValue.Link link, Continuation continuation) {
        super(2, continuation);
        this.v = nVar;
        this.f289975w = link;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new k(this.v, this.f289975w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
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
        EsimDescriptorValue.Link link = this.f289975w;
        n nVar = this.v;
        j jVar = new j(nVar, link, null);
        this.u = 1;
        Object objP2 = nVar.p2(this, jVar);
        return objP2 == aVar ? aVar : objP2;
    }
}
