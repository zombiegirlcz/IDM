package po7;

import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.car.estimated_value.EstimatedCarValuePickerScreen;
import kl7.o0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EstimatedCarValuePickerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(EstimatedCarValuePickerScreen estimatedCarValuePickerScreen, Continuation continuation) {
        super(2, continuation);
        this.v = estimatedCarValuePickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((SingleChoiceDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SingleChoiceDelegate.Model model = (SingleChoiceDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVar = (h) this.v.Y.getValue();
        Object obj3 = model.f;
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.data.model.EstimatedValue");
        o0 estimatedValue = (o0) obj3;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(estimatedValue, "estimatedValue");
        hVar.v2(new e(estimatedValue));
        return Unit.f186387a;
    }
}
