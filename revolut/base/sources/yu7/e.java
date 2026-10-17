package yu7;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.insurance_embedded.impl.ui.screen.coverage_activation.InsuranceCoverageActivationScreen;
import com.revolut.feature.insurance_embedded.impl.ui.screen.coverage_activation.InsuranceCoverageActivationScreenContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ InsuranceCoverageActivationScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InsuranceCoverageActivationScreen insuranceCoverageActivationScreen, Continuation continuation) {
        super(2, continuation);
        this.u = insuranceCoverageActivationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        k kVar = (k) this.u.R.getValue();
        InsuranceCoverageActivationScreenContract$InputData insuranceCoverageActivationScreenContract$InputData = kVar.o;
        kVar.C2(new g(insuranceCoverageActivationScreenContract$InputData.f76082b, insuranceCoverageActivationScreenContract$InputData.f76083c));
        return Unit.f186387a;
    }
}
