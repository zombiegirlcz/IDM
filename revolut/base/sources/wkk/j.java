package wkk;

import com.revolut.data.model.Data;
import hha.s;
import hha.w0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import wgd.k;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits.a f298298w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f298298w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                j jVar = new j(this.f298298w, continuation, 0);
                jVar.v = obj2;
                return jVar;
            default:
                j jVar2 = new j(this.f298298w, continuation, 1);
                jVar2.v = obj2;
                return jVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Data data = (Data) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((j) create(data, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        w0 w0VarF;
        int i = this.u;
        com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits.a aVar = this.f298298w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                aVar.H2(aVar.v, new k(data, 7));
                break;
            default:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                hha.d dVar = (hha.d) data2.getContent();
                if (dVar != null && (w0VarF = s.f(dVar)) != null) {
                    aVar.H2(aVar.v, new cjk.h(w0VarF, 2));
                }
                break;
        }
        return Unit.f186387a;
    }
}
