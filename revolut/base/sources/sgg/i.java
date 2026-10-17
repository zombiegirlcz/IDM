package sgg;

import com.revolut.feature.travel.miles.api.model.TravelMilesAccountV2;
import com.revolut.feature.travel.miles.impl.ui.screen.account_registration_tax_id.TravelMilesAccountRegistrationTaxIdScreenContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f262656w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(j jVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f262656w = jVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(this.f262656w, continuation, 0);
            default:
                return new i(this.f262656w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((i) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                j jVar = this.f262656w;
                vfg.d dVar = jVar.f262657p;
                TravelMilesAccountRegistrationTaxIdScreenContract$InputData travelMilesAccountRegistrationTaxIdScreenContract$InputData = jVar.o;
                hfg.d dVar2 = new hfg.d(travelMilesAccountRegistrationTaxIdScreenContract$InputData.f94263b.f94103a, travelMilesAccountRegistrationTaxIdScreenContract$InputData.f94262a, travelMilesAccountRegistrationTaxIdScreenContract$InputData.e);
                this.v = 1;
                Object objB = dVar.b(dVar2, this);
                return objB == aVar ? aVar : objB;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                j jVar2 = this.f262656w;
                if (i2 == 0) {
                    o.b(obj2);
                    i iVar = new i(jVar2, null, 0);
                    this.v = 1;
                    obj2 = u0.b0(jVar2.X(), "SUBMIT_BUTTON_LOADING_TAG", iVar, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                jVar2.C2(new d((TravelMilesAccountV2) obj2));
                return Unit.f186387a;
        }
    }
}
