package lik;

import com.revolut.feature.pricingplans.models.PricingPlanOffer;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;
import yji.n;
import zfk.k;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends i implements Function1 {
    public final /* synthetic */ g u;
    public final /* synthetic */ hha.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ hha.i f195543w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ PricingPlanOffer f195544x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Function1 f195545y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, hha.d dVar, hha.i iVar, PricingPlanOffer pricingPlanOffer, Function1 function1, Continuation continuation) {
        super(1, continuation);
        this.u = gVar;
        this.v = dVar;
        this.f195543w = iVar;
        this.f195544x = pricingPlanOffer;
        this.f195545y = function1;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new d(this.u, this.v, this.f195543w, this.f195544x, this.f195545y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((d) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVar = this.u;
        zfk.c cVar = gVar.f195554n;
        hha.d dVar = this.v;
        String str = dVar.f152287a;
        PricingPlanOffer pricingPlanOffer = this.f195544x;
        return n.j2(gVar, cVar.b3(str, this.f195543w, pricingPlanOffer != null ? pricingPlanOffer.f81123a : null, new k(null)), null, new c(this.f195545y, dVar, null), 3);
    }
}
