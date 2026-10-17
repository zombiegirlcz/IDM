package cv7;

import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_embedded.impl.ui.screen.detail.EmbeddedInsuranceDetailScreen;
import com.revolut.feature.insurance_embedded.impl.ui.screen.detail.EmbeddedInsuranceDetailScreenContract$InputData;
import com.revolut.feature.insurance_embedded.impl.ui.screen.help.EmbeddedInsuranceGetHelpScreen;
import com.revolut.feature.insurance_embedded.impl.ui.screen.help.EmbeddedInsuranceGetHelpScreenContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ EmbeddedInsuranceDetailScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(EmbeddedInsuranceDetailScreen embeddedInsuranceDetailScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = embeddedInsuranceDetailScreen;
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

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        EmbeddedInsuranceDetailScreen embeddedInsuranceDetailScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                embeddedInsuranceDetailScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVar = (o) embeddedInsuranceDetailScreen.T2();
                oVar.getClass();
                EmbeddedInsuranceDetailScreenContract$InputData embeddedInsuranceDetailScreenContract$InputData = oVar.f109313p;
                String str = embeddedInsuranceDetailScreenContract$InputData.f76091a;
                yji.l.g2(oVar, new EmbeddedInsuranceGetHelpScreen(new EmbeddedInsuranceGetHelpScreenContract$InputData(R$drawable.uikit_icn_24_cross, embeddedInsuranceDetailScreenContract$InputData.f76092b, str)), ModalDestination.Style.POPUP.f98311a, null, 2);
                break;
        }
        return Unit.f186387a;
    }
}
