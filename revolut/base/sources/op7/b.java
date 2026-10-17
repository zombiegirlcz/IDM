package op7;

import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.proof_of_driving_number.driving_number_prompt.DrivingNumberPromptScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import op7.d;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ DrivingNumberPromptScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(DrivingNumberPromptScreen drivingNumberPromptScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = drivingNumberPromptScreen;
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

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        DrivingNumberPromptScreen drivingNumberPromptScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                drivingNumberPromptScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((g) ((e) drivingNumberPromptScreen.O.getValue())).C2(d.a.f227531a);
                break;
        }
        return Unit.f186387a;
    }
}
