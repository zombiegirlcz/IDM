package wh3;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.pricingplans.models.PricingPlanOffer;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import pi3.h;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AccountId f297375w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h f297376x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Function1 f297377y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, AccountId accountId, h hVar, Function1 function1, Continuation continuation) {
        super(1, continuation);
        this.v = iVar;
        this.f297375w = accountId;
        this.f297376x = hVar;
        this.f297377y = function1;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new g(this.v, this.f297375w, this.f297376x, this.f297377y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((g) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        i iVar = this.v;
        h hVar = this.f297376x;
        if (i == 0) {
            o.b(obj2);
            di3.k kVar = iVar.f297378l;
            this.u = 1;
            obj2 = kVar.b(this.f297375w, hVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        di3.c cVar = (di3.c) obj2;
        boolean z = cVar instanceof di3.a;
        Function1 function1 = this.f297377y;
        if (z) {
            function1.invoke(((di3.a) cVar).f114872a);
            return Unit.f186387a;
        }
        zfk.c cVar2 = iVar.f297380n;
        String str = hVar.f236404a.f152287a;
        hha.i iVar2 = hVar.f236405b;
        if (iVar2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        PricingPlanOffer pricingPlanOffer = hVar.f236406c;
        return yji.n.j2(iVar, rd0.e.e(new v0b.b(cVar2.g3(iVar2, str, pricingPlanOffer != null ? pricingPlanOffer.f81123a : null), hVar, 20), h0.f322473a, new e(3, null)), null, new ex6.c(6, null, function1), 3);
    }
}
