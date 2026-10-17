package amk;

import com.revolut.feature.pricingplans.models.documents.PricingPlanDocument;
import igk.k;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PricingPlanDocument f6472w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, PricingPlanDocument pricingPlanDocument, Continuation continuation) {
        super(2, continuation);
        this.v = hVar;
        this.f6472w = pricingPlanDocument;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.v, this.f6472w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            h hVar = this.v;
            ajk.b bVar = hVar.f6474q;
            PricingPlanDocument pricingPlanDocument = this.f6472w;
            String str = pricingPlanDocument.f81187b;
            agh.b bVar2 = new agh.b(hVar, pricingPlanDocument, 14);
            this.u = 1;
            if (k.b(hVar, bVar, str, bVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
