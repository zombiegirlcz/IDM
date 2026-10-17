package kv7;

import aw0.o9;
import bu7.y0;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.insurance_embedded.api.models.RemoteDocument;
import com.revolut.feature.insurance_embedded.impl.ui.screen.eligible_cards.InsuranceEligibleCardsScreen;
import com.revolut.feature.insurance_embedded.impl.ui.screen.eligible_cards.InsuranceEligibleCardsScreenContract$InputData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nu7.l;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ InsuranceEligibleCardsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(InsuranceEligibleCardsScreen insuranceEligibleCardsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = insuranceEligibleCardsScreen;
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
        InsuranceEligibleCardsScreen insuranceEligibleCardsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                insuranceEligibleCardsScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVar = (i) insuranceEligibleCardsScreen.R.getValue();
                iVar.getClass();
                InsuranceEligibleCardsScreenContract$InputData insuranceEligibleCardsScreenContract$InputData = iVar.o;
                ou7.a.a(iVar, l.a(new RemoteDocument(insuranceEligibleCardsScreenContract$InputData.f76101b.f75970b, y0.WEBPAGE), new TextClause(insuranceEligibleCardsScreenContract$InputData.f76101b.f75969a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new g(iVar, 0));
                break;
        }
        return Unit.f186387a;
    }
}
