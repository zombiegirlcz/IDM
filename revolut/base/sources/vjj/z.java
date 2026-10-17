package vjj;

import com.revolut.retail.feature.esim.api.model.EsimDescriptorValue;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final class z extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ EsimDescriptorValue.Link f289796w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.c cVar, EsimDescriptorValue.Link link, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
        this.f289796w = link;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new z(this.v, this.f289796w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((z) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
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
        wli.x xVar = this.v.f101207p;
        String str = this.f289796w.f100253a;
        lg0.a aVar2 = lg0.a.OPEN_BROWSER;
        this.u = 1;
        Object objX1 = lg0.b.x1(xVar, str, aVar2, null, this, 4);
        return objX1 == aVar ? aVar : objX1;
    }
}
