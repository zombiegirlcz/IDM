package ov7;

import com.revolut.feature.insurance_embedded.impl.data.model.CfacPolicy;
import com.revolut.feature.insurance_embedded.impl.data.model.CoverageDetailsLayout;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.coverage_details.CoverageDetailsScreen;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.coverage_details.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CoverageDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(CoverageDetailsScreen coverageDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = coverageDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            default:
                return new d(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CoverageDetailsLayout.FooterButton footerButton;
        int i = this.u;
        CoverageDetailsScreen coverageDetailsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                coverageDetailsScreen.m2().onBackPressed();
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.coverage_details.b bVar = (com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.coverage_details.b) coverageDetailsScreen.R2();
                CoverageDetailsLayout coverageDetailsLayout = (CoverageDetailsLayout) ((j) ((j2) bVar.f76110r.f22677a).getValue()).f229973a.getContent();
                if (coverageDetailsLayout != null && (footerButton = coverageDetailsLayout.f75909h) != null) {
                    CoverageDetailsLayout.FooterButton.Action action = footerButton.f75918b;
                    if (action instanceof CoverageDetailsLayout.FooterButton.Action.MakeClaim) {
                        bVar.C2(a.C0507a.f76107a);
                    } else if (action instanceof CoverageDetailsLayout.FooterButton.Action.MakeCfacClaim) {
                        CfacPolicy cfacPolicy = ((CoverageDetailsLayout.FooterButton.Action.MakeCfacClaim) action).f75922b;
                        bVar.C2(new k(cfacPolicy.f75902a, cfacPolicy.f75903b));
                    } else if (action instanceof CoverageDetailsLayout.FooterButton.Action.Upgrade) {
                        CoverageDetailsLayout.FooterButton.Action.Upgrade upgrade = (CoverageDetailsLayout.FooterButton.Action.Upgrade) action;
                        ou7.a.c(bVar, upgrade.f75925b, upgrade.f75926c);
                    } else {
                        if (!(action instanceof CoverageDetailsLayout.FooterButton.Action.Deeplink)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bVar.n2(new osk.m(bVar, ((CoverageDetailsLayout.FooterButton.Action.Deeplink) action).f75920b, null, 3), new whi.b(6));
                    }
                }
                return Unit.f186387a;
        }
    }
}
