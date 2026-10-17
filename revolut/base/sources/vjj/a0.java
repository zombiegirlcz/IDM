package vjj;

import com.revolut.retail.feature.esim.api.model.EsimDescriptorValue;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes11.dex */
public final class a0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ EsimDescriptorValue.Link f289756w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.c cVar, EsimDescriptorValue.Link link, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
        this.f289756w = link;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a0(this.v, this.f289756w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
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
        EsimDescriptorValue.Link link = this.f289756w;
        com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.c cVar = this.v;
        z zVar = new z(cVar, link, null);
        this.u = 1;
        Object objP2 = cVar.p2(this, zVar);
        return objP2 == aVar ? aVar : objP2;
    }
}
