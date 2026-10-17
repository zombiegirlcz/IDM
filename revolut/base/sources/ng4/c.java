package ng4;

import a31.w;
import c84.t;
import com.revolut.feature.pricingplans.models.PricingPlanOffer;
import elm.f;
import gim.i;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.plan_selection.a f215108w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ hha.d f215109x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ hha.i f215110y;
    public final /* synthetic */ PricingPlanOffer z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(com.revolut.feature.credit.application.plugins.impl.ui.plan_selection.a aVar, hha.d dVar, hha.i iVar, PricingPlanOffer pricingPlanOffer, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f215108w = aVar;
        this.f215109x = dVar;
        this.f215110y = iVar;
        this.z = pricingPlanOffer;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.f215108w, this.f215109x, this.f215110y, this.z, continuation, 0);
            default:
                return new c(this.f215108w, this.f215109x, this.f215110y, this.z, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((c) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.credit.application.plugins.impl.ui.plan_selection.a aVar2 = this.f215108w;
                if (i == 0) {
                    o.b(obj2);
                    xx3.a aVar3 = aVar2.f68210q;
                    String str = aVar2.f68209p.f68207c.f66892b;
                    String str2 = this.f215109x.f152287a;
                    this.v = 1;
                    b44.a aVar4 = aVar3.f309394a;
                    aVar4.getClass();
                    w wVar = new w((Object) aVar4, str, str2, (Object) this.f215110y, (Serializable) this.z, (Continuation) null, 7);
                    p0 p0Var = p0.f264001a;
                    obj2 = e0.J(f.f127540b, wVar, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                }
                this.v = 2;
                if (t.N2(aVar2, (it3.d) obj2, this, 2) == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.plan_selection.a aVar6 = this.f215108w;
                c cVar = new c(aVar6, this.f215109x, this.f215110y, this.z, null, 0);
                this.v = 1;
                Object objB = pu7.a.B(aVar6.k, "submit plan selection", cVar, this);
                return objB == aVar5 ? aVar5 : objB;
        }
    }
}
