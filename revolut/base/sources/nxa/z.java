package nxa;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class z extends gim.i implements Function1 {
    public final /* synthetic */ int u = 1;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.referrals.impl.personalized_tracking.a f220540w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ t0 f220541x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ g0 f220542y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.revolut.feature.referrals.impl.personalized_tracking.a aVar, t0 t0Var, g0 g0Var, Continuation continuation) {
        super(1, continuation);
        this.f220540w = aVar;
        this.f220541x = t0Var;
        this.f220542y = g0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new z(this.f220541x, this.f220540w, this.f220542y, continuation);
            default:
                return new z(this.f220540w, this.f220541x, this.f220542y, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((z) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                t0 t0Var = this.f220541x;
                pwa.n nVar = t0Var.f220531j;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.referrals.impl.personalized_tracking.a aVar2 = this.f220540w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    if (!pwa.l.c(nVar) && t0Var.f220527b == i0.CREATED) {
                        this.v = 1;
                        if (com.revolut.feature.referrals.impl.personalized_tracking.a.I2(aVar2, this) != aVar) {
                        }
                    }
                    return aVar;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                wli.x xVar = aVar2.f81794q;
                String str = this.f220542y.f220499b;
                Boolean bool = pwa.l.c(nVar) ? Boolean.FALSE : null;
                this.v = 2;
                Object objX1 = lg0.b.x1(xVar, str, null, bool, this, 2);
                if (objX1 != aVar) {
                    return objX1;
                }
                return aVar;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                g0 g0Var = this.f220542y;
                t0 t0Var2 = this.f220541x;
                com.revolut.feature.referrals.impl.personalized_tracking.a aVar4 = this.f220540w;
                z zVar = new z(t0Var2, aVar4, g0Var, (Continuation) null);
                this.v = 1;
                Object objB0 = zh9.u0.b0(aVar4.X(), "PERSONALIZATION_TRACKING_CTA_BUTTON_TAG", zVar, this);
                return objB0 == aVar3 ? aVar3 : objB0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(t0 t0Var, com.revolut.feature.referrals.impl.personalized_tracking.a aVar, g0 g0Var, Continuation continuation) {
        super(1, continuation);
        this.f220541x = t0Var;
        this.f220540w = aVar;
        this.f220542y = g0Var;
    }
}
