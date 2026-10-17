package qt7;

import com.revolut.feature.insurance_credit.impl.data.model.coverages.CoverageDetailsLayout;
import com.revolut.feature.insurance_credit.impl.ui.screen.coverage_details.CoverageDetailsScreen;
import com.revolut.feature.insurance_credit.impl.ui.screen.coverage_details.CoverageDetailsScreenContract$InputData;
import com.revolut.kompot.common.ExternalDestination;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CoverageDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(CoverageDetailsScreen coverageDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = coverageDetailsScreen;
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

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CoverageDetailsScreen coverageDetailsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                coverageDetailsScreen.m2().onBackPressed();
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.insurance_credit.impl.ui.screen.coverage_details.a aVar3 = (com.revolut.feature.insurance_credit.impl.ui.screen.coverage_details.a) coverageDetailsScreen.R2();
                CoverageDetailsScreenContract$InputData coverageDetailsScreenContract$InputData = aVar3.o;
                CoverageDetailsLayout.FooterButton footerButton = coverageDetailsScreenContract$InputData.f75826b.f75791g;
                if (footerButton != null) {
                    if (!(footerButton.f75796b instanceof CoverageDetailsLayout.FooterButton.Action.MakeClaim)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String str = coverageDetailsScreenContract$InputData.f75827c;
                    if (str == null || aVar3.C1(new ExternalDestination.Browser(str, null)) == null) {
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "CoverageDetailsScreenModel", j6.a.q("Claim action was called on coverage details screen but claim link is null for ", coverageDetailsScreenContract$InputData.f75825a), null, h0Var);
                    }
                }
                return Unit.f186387a;
        }
    }
}
