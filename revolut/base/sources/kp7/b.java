package kp7;

import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.MotorPlanSelectorScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.a;
import ip0.kx;
import java.io.IOException;
import java.time.YearMonth;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MotorPlanSelectorScreen f188176w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(MotorPlanSelectorScreen motorPlanSelectorScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f188176w = motorPlanSelectorScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                b bVar = new b(this.f188176w, continuation, 0);
                bVar.v = obj2;
                return bVar;
            case 1:
                b bVar2 = new b(this.f188176w, continuation, 1);
                bVar2.v = obj2;
                return bVar2;
            case 2:
                b bVar3 = new b(this.f188176w, continuation, 2);
                bVar3.v = obj2;
                return bVar3;
            case 3:
                b bVar4 = new b(this.f188176w, continuation, 3);
                bVar4.v = obj2;
                return bVar4;
            default:
                b bVar5 = new b(this.f188176w, continuation, 4);
                bVar5.v = obj2;
                return bVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((b) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws IOException {
        int i = this.u;
        MotorPlanSelectorScreen motorPlanSelectorScreen = this.f188176w;
        switch (i) {
            case 0:
                String str = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.e eVar = (com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.e) motorPlanSelectorScreen.T2();
                eVar.getClass();
                if (str != null) {
                    eVar.x2(new k7c.n(str, 17));
                }
                break;
            case 1:
                ty0.a aVar2 = (ty0.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarT2 = motorPlanSelectorScreen.T2();
                com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.e eVar2 = (com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.e) nVarT2;
                eVar2.y2(aVar2.d, aVar2.f275445a);
                break;
            case 2:
                kx kxVar = (kx) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarT22 = motorPlanSelectorScreen.T2();
                YearMonth month = kxVar.f165093b;
                com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.e eVar3 = (com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.e) nVarT22;
                eVar3.getClass();
                Intrinsics.checkNotNullParameter(month, "month");
                eVar3.x2(new q(month, 0));
                break;
            case 3:
                ty0.a aVar5 = (ty0.a) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarT23 = motorPlanSelectorScreen.T2();
                String id10 = aVar5.f275445a;
                com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.e eVar4 = (com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.e) nVarT23;
                eVar4.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                if (Intrinsics.f(id10, "EDIT_APPLICATION_BUTTON_ID")) {
                    eVar4.v2(a.C0505a.f75611a);
                }
                break;
            default:
                ty0.a aVar7 = (ty0.a) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarT24 = motorPlanSelectorScreen.T2();
                com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.e eVar5 = (com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.e) nVarT24;
                eVar5.z2(aVar7.d, aVar7.f275445a);
                break;
        }
        return Unit.f186387a;
    }
}
