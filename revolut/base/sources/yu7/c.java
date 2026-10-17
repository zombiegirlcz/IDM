package yu7;

import aw0.o9;
import bu7.y0;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.insurance_embedded.api.models.RemoteDocument;
import com.revolut.feature.insurance_embedded.impl.ui.screen.coverage_activation.InsuranceCoverageActivationScreen;
import com.revolut.feature.insurance_embedded.impl.ui.screen.coverage_activation.InsuranceCoverageActivationScreenContract$InputData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;
import yo7.p;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ InsuranceCoverageActivationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(InsuranceCoverageActivationScreen insuranceCoverageActivationScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = insuranceCoverageActivationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
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

    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        InsuranceCoverageActivationScreen insuranceCoverageActivationScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                insuranceCoverageActivationScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                k kVar = (k) insuranceCoverageActivationScreen.R.getValue();
                kVar.getClass();
                InsuranceCoverageActivationScreenContract$InputData insuranceCoverageActivationScreenContract$InputData = kVar.o;
                ou7.a.a(kVar, nu7.l.a(new RemoteDocument(insuranceCoverageActivationScreenContract$InputData.f76083c.f75970b, y0.WEBPAGE), new TextClause(insuranceCoverageActivationScreenContract$InputData.f76083c.f75969a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new p(kVar, 29));
                break;
        }
        return Unit.f186387a;
    }
}
