package ga9;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class r extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.onboarding.impl.onboarding.v f142100w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ pa9.c f142101x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(com.revolut.feature.onboarding.impl.onboarding.v vVar, pa9.c cVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f142100w = vVar;
        this.f142101x = cVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new r(this.f142100w, this.f142101x, continuation, 0);
            default:
                return new r(this.f142100w, this.f142101x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((r) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    pa9.d dVar = (pa9.d) this.f142101x;
                    wi0.b bVar = dVar.f234453a;
                    t89.a aVar2 = dVar.f234454b;
                    this.v = 1;
                    if (com.revolut.feature.onboarding.impl.onboarding.v.I2(this.f142100w, bVar, aVar2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                pa9.c cVar = this.f142101x;
                com.revolut.feature.onboarding.impl.onboarding.v vVar = this.f142100w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    wi0.b bVar2 = ((pa9.d) cVar).f234453a;
                    this.v = 1;
                    obj2 = com.revolut.feature.onboarding.impl.onboarding.v.K2(vVar, bVar2, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return (Unit) obj2;
                    }
                    yhm.o.b(obj2);
                }
                Continuation continuation = null;
                if (!((Boolean) obj2).booleanValue()) {
                    vVar.n2(new g06.k(vVar, ((pa9.d) cVar).f234453a, continuation, 29), new whi.b(6));
                    return Unit.f186387a;
                }
                r rVar = new r(vVar, cVar, continuation, 0);
                this.v = 2;
                obj2 = pu7.a.B(vVar.k, "acceptTermAndCountrySubmissionTask", rVar, this);
                if (obj2 == aVar3) {
                    return aVar3;
                }
                return (Unit) obj2;
        }
    }
}
