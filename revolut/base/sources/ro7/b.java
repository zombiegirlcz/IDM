package ro7;

import com.revolut.feature.insurance_car.impl.data.model.CarVariation;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.car.manual_input.CarManualInputScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.car.manual_input.CarManualInputScreenContract$ManualCarInfo;
import kl7.m2;
import kl7.o0;
import kl7.s0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CarManualInputScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(CarManualInputScreen carManualInputScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = carManualInputScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            default:
                return new b(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CarManualInputScreen carManualInputScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                carManualInputScreen.m2().onBackPressed();
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVar = (o) ((i) carManualInputScreen.Y.getValue());
                f fVar = (f) oVar.t2();
                String str = fVar.f255913a;
                String str2 = fVar.f255915c;
                if (str2 == null) {
                    throw new IllegalStateException("make can not be null");
                }
                String str3 = fVar.d;
                if (str3 == null) {
                    throw new IllegalStateException("make can not be null");
                }
                Integer num = fVar.f;
                if (num == null) {
                    throw new IllegalStateException("make can not be null");
                }
                int iIntValue = num.intValue();
                s0 s0Var = fVar.e;
                if (s0Var == null) {
                    throw new IllegalStateException("fuel type can not be null");
                }
                m2 m2Var = fVar.f255916g;
                if (m2Var == null) {
                    throw new IllegalStateException("fuel type can not be null");
                }
                CarVariation carVariation = fVar.f255917h;
                if (carVariation == null) {
                    throw new IllegalStateException("variation can not be null");
                }
                wi0.b bVar = fVar.f255914b;
                if (bVar == null) {
                    throw new IllegalStateException("country code can not be null");
                }
                o0 o0Var = fVar.i;
                if (o0Var == null) {
                    throw new IllegalStateException("estimated value not be null");
                }
                Integer num2 = fVar.f255918j;
                if (num2 == null) {
                    throw new IllegalStateException("purchase year can not be null");
                }
                oVar.v2(new g(new CarManualInputScreenContract$ManualCarInfo(str, bVar, str2, str3, s0Var, iIntValue, m2Var, carVariation, o0Var, num2.intValue())));
                return Unit.f186387a;
        }
    }
}
