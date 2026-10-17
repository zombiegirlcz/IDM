package lik;

import com.revolut.feature.pricingplans.models.PricingPlanOffer;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends i implements Function2 {
    public int u;
    public final /* synthetic */ g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ hha.d f195546w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ hha.i f195547x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ PricingPlanOffer f195548y;
    public final /* synthetic */ Function1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, hha.d dVar, hha.i iVar, PricingPlanOffer pricingPlanOffer, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.v = gVar;
        this.f195546w = dVar;
        this.f195547x = iVar;
        this.f195548y = pricingPlanOffer;
        this.z = function1;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.v, this.f195546w, this.f195547x, this.f195548y, this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
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
        Function1 function1 = this.z;
        g gVar = this.v;
        d dVar = new d(gVar, this.f195546w, this.f195547x, this.f195548y, function1, null);
        this.u = 1;
        Object objY2 = gVar.Y2(this, dVar);
        return objY2 == aVar ? aVar : objY2;
    }
}
