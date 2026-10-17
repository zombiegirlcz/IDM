package dlk;

import efm.d0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import pfm.z;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e f115785w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e eVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f115785w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.f115785w, continuation, 0);
            case 1:
                return new g(this.f115785w, continuation, 1);
            default:
                return new g(this.f115785w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object value;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    pfm.a aVarB = ((wik.n) this.f115785w.u).b(null);
                    this.v = 1;
                    if (nim.a.a(aVarB, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e eVar = this.f115785w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    d0 d0VarFirstOrError = m70.a.g(eVar.f103501r.f25048g.f235709c.f(Unit.f186387a, false), null, null, 3).map(new ch6.d(new cjj.j(15), 11)).firstOrError();
                    Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                    z zVarF = ue0.e.F(d0VarFirstOrError, Boolean.FALSE);
                    this.v = 1;
                    obj2 = nim.a.b(zVarF, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                Boolean bool = (Boolean) obj2;
                j2 j2Var = eVar.B;
                do {
                    value = j2Var.getValue();
                    ((c) value).getClass();
                } while (!j2Var.h(value, new c(bool)));
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e eVar2 = this.f115785w;
                    com.revolut.feature.credit.application.plugins.impl.ui.form.a aVar4 = new com.revolut.feature.credit.application.plugins.impl.ui.form.a(eVar2, null);
                    this.v = 1;
                    if (eVar2.p2(this, aVar4) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
