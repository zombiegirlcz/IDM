package kp7;

import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.MotorPlanSelectorScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.MotorPlanSelectorScreenContract$InputData;
import java.io.IOException;
import java.util.Map;
import kl7.f1;
import kl7.g1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ MotorPlanSelectorScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(MotorPlanSelectorScreen motorPlanSelectorScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = motorPlanSelectorScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            case 1:
                return new e(this.v, continuation, 1);
            default:
                return new e(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws IOException {
        int i = this.u;
        MotorPlanSelectorScreen motorPlanSelectorScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                motorPlanSelectorScreen.m2().onBackPressed();
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.e eVar = (com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.e) motorPlanSelectorScreen.T2();
                g1 g1VarB2 = eVar.B2();
                Map map = ((j) eVar.t2()).d;
                String str = g1VarB2.f185319a;
                Boolean bool = (Boolean) map.get(str);
                if (bool == null) {
                    throw new IllegalStateException("value can not be null");
                }
                f1 f1Var = bool.booleanValue() ? f1.ANNUAL : f1.MONTHLY;
                Boolean bool2 = (Boolean) ((j) eVar.t2()).f188179c.get(str);
                if (bool2 == null) {
                    throw new IllegalStateException("value can not be null");
                }
                boolean z = bool2.booleanValue() && g1VarB2.e != null;
                String str2 = ((j) eVar.t2()).f188178b;
                if (str2 == null) {
                    throw new IllegalStateException("selected tab can not be null");
                }
                eVar.v2(new m(str2, f1Var, z));
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.e eVar2 = (com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.e) motorPlanSelectorScreen.T2();
                MotorPlanSelectorScreenContract$InputData motorPlanSelectorScreenContract$InputData = eVar2.f75613p;
                Intrinsics.i(motorPlanSelectorScreenContract$InputData, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.MotorPlanSelectorScreenContract.InputData.RenewalPolicy");
                eVar2.v2(new l(((MotorPlanSelectorScreenContract$InputData.RenewalPolicy) motorPlanSelectorScreenContract$InputData).f75609a));
                return Unit.f186387a;
        }
    }
}
