package yo7;

import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.data.model.AdditionalDriver;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.driver.details.AdditionalDriverDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ AdditionalDriverDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(AdditionalDriverDetailsScreen additionalDriverDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = additionalDriverDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            case 1:
                return new c(this.v, continuation, 1);
            case 2:
                return new c(this.v, continuation, 2);
            default:
                return new c(this.v, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AdditionalDriverDetailsScreen additionalDriverDetailsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                additionalDriverDetailsScreen.m2().onBackPressed();
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s sVar = (s) additionalDriverDetailsScreen.T2();
                AdditionalDriver additionalDriverA = a.a((h) sVar.t2());
                if (additionalDriverA == null) {
                    throw new IllegalStateException("button must be disabled until the info is filled completely");
                }
                sVar.v2(new j(additionalDriverA));
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s sVar2 = (s) additionalDriverDetailsScreen.T2();
                tl7.f.S(sVar2.f315633q, R$string.car_insurance_common_are_you_sure, R$string.car_insurance_create_driver_warning_remove, 0, new m(sVar2, 1), 12);
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s sVar3 = (s) additionalDriverDetailsScreen.T2();
                AdditionalDriver additionalDriverA2 = a.a((h) sVar3.t2());
                if (additionalDriverA2 == null) {
                    throw new IllegalStateException("button must be disabled until the info is filled completely");
                }
                sVar3.v2(new j(additionalDriverA2));
                return Unit.f186387a;
        }
    }
}
