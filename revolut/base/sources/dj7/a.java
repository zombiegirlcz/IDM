package dj7;

import aii.u;
import com.revolut.feature.insurance.api.navigation.CFACInsuranceFeatureConfig;
import com.revolut.feature.insurance.impl.ui.cfac.CFACInsuranceFlow;
import com.revolut.feature.insurance.impl.ui.cfac.CFACInsuranceFlowContract$InputData;
import com.revolut.feature.insurance.impl.ui.cfac.CFACInsuranceFlowContract$Step;
import com.revolut.feature.insurance.impl.ui.cfac.claim.CFACInsuranceClaimFlow;
import com.revolut.feature.insurance.impl.ui.cfac.claim.CFACInsuranceClaimFlowContract$InputData;
import com.revolut.feature.insurance.impl.ui.cfac.details.CFACInsuranceDetailsScreenContract$InputData;
import com.revolut.feature.insurance.impl.ui.cfac.documents.CFACInsuranceDocumentsScreenContract$InputData;
import com.revolut.feature.insurance.impl.ui.cfac.my_claims.claim_details.CFACClaimDetailsScreenContract$InputData;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof CFACInsuranceFeatureConfig.DetailsDestination) {
            CFACInsuranceFeatureConfig.DetailsDestination detailsDestination = (CFACInsuranceFeatureConfig.DetailsDestination) destination;
            return new CFACInsuranceFlow(new CFACInsuranceFlowContract$InputData(new CFACInsuranceFlowContract$Step.Details(new CFACInsuranceDetailsScreenContract$InputData(detailsDestination.f75018a, detailsDestination.f75019b))));
        }
        if (destination instanceof CFACInsuranceFeatureConfig.DocumentsDestination) {
            CFACInsuranceFeatureConfig.DocumentsDestination documentsDestination = (CFACInsuranceFeatureConfig.DocumentsDestination) destination;
            return new CFACInsuranceFlow(new CFACInsuranceFlowContract$InputData(new CFACInsuranceFlowContract$Step.Documents(new CFACInsuranceDocumentsScreenContract$InputData(documentsDestination.f75023a, documentsDestination.f75024b, documentsDestination.f75025c))));
        }
        if (destination instanceof CFACInsuranceFeatureConfig.MakeClaimDestination) {
            CFACInsuranceFeatureConfig.MakeClaimDestination makeClaimDestination = (CFACInsuranceFeatureConfig.MakeClaimDestination) destination;
            return new CFACInsuranceClaimFlow(new CFACInsuranceClaimFlowContract$InputData.MakeClaim(makeClaimDestination.f75029a, makeClaimDestination.f75030b, makeClaimDestination.f75031c));
        }
        if (destination instanceof CFACInsuranceFeatureConfig.ClaimDetailsDestination) {
            return new CFACInsuranceFlow(new CFACInsuranceFlowContract$InputData(new CFACInsuranceFlowContract$Step.ClaimDetails(new CFACClaimDetailsScreenContract$InputData(((CFACInsuranceFeatureConfig.ClaimDetailsDestination) destination).f75015a))));
        }
        return null;
    }
}
