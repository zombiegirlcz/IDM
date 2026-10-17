package qgg;

import com.revolut.feature.travel.miles.api.model.TravelMilesAccountV2;
import com.revolut.feature.travel.miles.impl.ui.screen.account_registration.TravelMilesAccountRegistrationScreenContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import zh9.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class n extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f245841w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f245841w = oVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n(this.f245841w, continuation, 0);
            default:
                return new n(this.f245841w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((n) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        switch (this.u) {
            case 0:
                o oVar = this.f245841w;
                TravelMilesAccountRegistrationScreenContract$InputData travelMilesAccountRegistrationScreenContract$InputData = oVar.f245842p;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                vfg.d dVar = oVar.f245844r;
                hfg.d dVar2 = new hfg.d(travelMilesAccountRegistrationScreenContract$InputData.f94259a.f94103a, ((h) oVar.t2()).f245834b, travelMilesAccountRegistrationScreenContract$InputData.f94261c);
                this.v = 1;
                Object objB = dVar.b(dVar2, this);
                return objB == aVar ? aVar : objB;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                o oVar2 = this.f245841w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    n nVar = new n(oVar2, null, 0);
                    this.v = 1;
                    obj2 = u0.b0(oVar2.X(), "REGISTER_ACCOUNT_BUTTON_TAG", nVar, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                oVar2.v2(new i((TravelMilesAccountV2) obj2));
                return Unit.f186387a;
        }
    }
}
