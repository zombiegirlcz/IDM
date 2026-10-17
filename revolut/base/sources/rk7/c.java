package rk7;

import com.revolut.feature.insurance.api.models.cfac.CFACClaimDetails;
import com.revolut.feature.insurance.api.models.cfac.CFACClaimProgress;
import com.revolut.feature.insurance.impl.ui.cfac.CFACInsuranceFlowContract$Step;
import com.revolut.feature.insurance.impl.ui.cfac.claim.supporting_documents.CFACInsuranceSupportingDocumentsScreen;
import com.revolut.feature.insurance.impl.ui.cfac.claim.supporting_documents.CFACInsuranceSupportingDocumentsScreenContract$InputData;
import com.revolut.feature.insurance.impl.ui.cfac.my_claims.claim_details.CFACClaimDetailsScreen;
import com.revolut.feature.insurance.impl.ui.cfac.my_claims.status_update.CFACClaimStatusUpdateScreenContract$InputData;
import com.revolut.feature.insurance_embedded.api.navigation.InsuranceEmbeddedDestinations;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import ip0.x10;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;
import zhm.d0;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CFACClaimDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(CFACClaimDetailsScreen cFACClaimDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = cFACClaimDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            case 1:
                return new c(this.v, continuation, 1);
            case 2:
                return new c(this.v, continuation, 2);
            default:
                return new c(this.v, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((c) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((x10) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CFACClaimStatusUpdateScreenContract$InputData inReviewProgress;
        int i = this.u;
        CFACClaimDetailsScreen cFACClaimDetailsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVar = (l) cFACClaimDetailsScreen.i3();
                lVar.C1(new BridgeDestination(new FeatureCommand(InsuranceEmbeddedDestinations.a("123", ((e) lVar.t2()).f254755c))));
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                cFACClaimDetailsScreen.m2().onBackPressed();
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVar2 = (l) cFACClaimDetailsScreen.i3();
                CFACClaimDetails cFACClaimDetails = (CFACClaimDetails) ((e) lVar2.t2()).f254753a.getContent();
                if (cFACClaimDetails != null) {
                    String str = ((CFACClaimProgress) d0.m0(cFACClaimDetails.d)).f74963c;
                    if (str != null) {
                        inReviewProgress = new CFACClaimStatusUpdateScreenContract$InputData.DeclinedProgress(((e) lVar2.t2()).f254755c, "123", str);
                    } else {
                        inReviewProgress = new CFACClaimStatusUpdateScreenContract$InputData.InReviewProgress("123", ((e) lVar2.t2()).f254755c);
                    }
                    lVar2.v2(new h(new CFACInsuranceFlowContract$Step.ClaimStatusUpdate(inReviewProgress)));
                }
                break;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVar3 = (l) cFACClaimDetailsScreen.i3();
                CFACClaimDetails cFACClaimDetails2 = (CFACClaimDetails) ((e) lVar3.t2()).f254753a.getContent();
                if (cFACClaimDetails2 != null) {
                    yji.l.g2(lVar3, new CFACInsuranceSupportingDocumentsScreen(new CFACInsuranceSupportingDocumentsScreenContract$InputData(null, cp5.c.Q(cFACClaimDetails2.f.f74936b), false, true)), ModalDestination.Style.FULLSCREEN_FADE.f98307a, null, 2);
                }
                break;
        }
        return Unit.f186387a;
    }
}
