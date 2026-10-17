package z27;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.freelancer.common.models.tax_hub.TaxHubAssessmentStep;
import com.revolut.feature.freelancer.common.models.tax_hub.TaxHubCalendarEvent;
import com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.assessment.TaxHubAssessmentScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TaxHubAssessmentScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TaxHubAssessmentScreen taxHubAssessmentScreen, Continuation continuation) {
        super(2, continuation);
        this.v = taxHubAssessmentScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarE3 = this.v.d();
        Object obj3 = model.u;
        com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.assessment.f fVar = (com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.assessment.f) lVarE3;
        if (obj3 instanceof y) {
            fVar.H2(fVar.v, new sx4.b(obj3, 21));
            y yVar = (y) obj3;
            TaxHubCalendarEvent taxHubCalendarEvent = yVar.f319005c;
            TaxHubAssessmentStep taxHubAssessmentStep = yVar.f319003a;
            int i = s.f318996a[taxHubAssessmentStep.f73481b.ordinal()];
            if (i == 1) {
                fVar.C2(new j(taxHubAssessmentStep, taxHubCalendarEvent));
            } else if (i == 2) {
                fVar.C2(new h(yVar.f319004b));
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                fVar.C2(new i(taxHubAssessmentStep, taxHubCalendarEvent));
            }
        } else {
            fVar.getClass();
        }
        return Unit.f186387a;
    }
}
