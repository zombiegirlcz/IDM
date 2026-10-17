package ju7;

import aii.u;
import com.revolut.feature.insurance_embedded.api.navigation.InsuranceEmbeddedDestinations;
import com.revolut.feature.insurance_embedded.impl.ui.flow.comparison.PlanComparisonFlow;
import com.revolut.feature.insurance_embedded.impl.ui.flow.comparison.PlanComparisonFlowContract$InputData;
import com.revolut.feature.insurance_embedded.impl.ui.flow.coverage.CoverageFlow;
import com.revolut.feature.insurance_embedded.impl.ui.flow.coverage.CoverageFlowContract$InputData;
import com.revolut.feature.insurance_embedded.impl.ui.flow.detail.EmbeddedDetailFlow;
import com.revolut.feature.insurance_embedded.impl.ui.flow.detail.EmbeddedDetailFlowContract$InputData;
import com.revolut.feature.insurance_embedded.impl.ui.flow.documents_review.InsuranceDocumentsReviewFlow;
import com.revolut.feature.insurance_embedded.impl.ui.flow.documents_review.InsuranceDocumentsReviewFlowContract$InputData;
import com.revolut.feature.insurance_embedded.impl.ui.flow.embedded.InsuranceDetailsFlow;
import com.revolut.feature.insurance_embedded.impl.ui.flow.embedded.InsuranceDetailsFlowContract$InputData;
import com.revolut.feature.insurance_embedded.impl.ui.flow.embedded.InsuranceDetailsFlowContract$Step;
import com.revolut.feature.insurance_embedded.impl.ui.screen.scheme_insurance.SchemeInsuranceDetailsScreen;
import com.revolut.feature.insurance_embedded.impl.ui.screen.scheme_insurance.SchemeInsuranceDetailsScreenContract$InputData;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof InsuranceEmbeddedDestinations.CoverageList) {
            return new CoverageFlow(new CoverageFlowContract$InputData(((InsuranceEmbeddedDestinations.CoverageList) destination).f75854a));
        }
        if (destination instanceof InsuranceEmbeddedDestinations.Detail) {
            InsuranceEmbeddedDestinations.Detail detail = (InsuranceEmbeddedDestinations.Detail) destination;
            return new EmbeddedDetailFlow(new EmbeddedDetailFlowContract$InputData(detail.f75855a, detail.f75856b));
        }
        if (destination instanceof InsuranceEmbeddedDestinations.GetHelp) {
            InsuranceEmbeddedDestinations.GetHelp getHelp = (InsuranceEmbeddedDestinations.GetHelp) destination;
            return new EmbeddedDetailFlow(new EmbeddedDetailFlowContract$InputData(getHelp.f75860a, getHelp.f75861b, tu7.b.GET_HELP));
        }
        if (destination instanceof InsuranceEmbeddedDestinations.PlanComparison) {
            return new PlanComparisonFlow(new PlanComparisonFlowContract$InputData(((InsuranceEmbeddedDestinations.PlanComparison) destination).f75865a));
        }
        if (destination instanceof InsuranceEmbeddedDestinations.InsuranceDocumentsReview) {
            return new InsuranceDocumentsReviewFlow(new InsuranceDocumentsReviewFlowContract$InputData(((InsuranceEmbeddedDestinations.InsuranceDocumentsReview) destination).f75863a));
        }
        if (destination instanceof InsuranceEmbeddedDestinations.SchemeInsurance) {
            return new SchemeInsuranceDetailsScreen(new SchemeInsuranceDetailsScreenContract$InputData(((InsuranceEmbeddedDestinations.SchemeInsurance) destination).f75866a));
        }
        if (destination instanceof InsuranceEmbeddedDestinations.DetailsLayout) {
            InsuranceEmbeddedDestinations.DetailsLayout detailsLayout = (InsuranceEmbeddedDestinations.DetailsLayout) destination;
            return new InsuranceDetailsFlow(new InsuranceDetailsFlowContract$InputData(detailsLayout.getF75857a(), detailsLayout.getF75858b(), InsuranceDetailsFlowContract$Step.InsuranceDetails.f76074a));
        }
        if (destination instanceof InsuranceEmbeddedDestinations.MakeClaimLayout) {
            return new InsuranceDetailsFlow(new InsuranceDetailsFlowContract$InputData(((InsuranceEmbeddedDestinations.MakeClaimLayout) destination).getF75864a(), InsuranceDetailsFlowContract$Step.MakeClaim.f76076a));
        }
        if (destination instanceof InsuranceEmbeddedDestinations.CfacCoverageSelectionLayout) {
            return new InsuranceDetailsFlow(new InsuranceDetailsFlowContract$InputData(((InsuranceEmbeddedDestinations.CfacCoverageSelectionLayout) destination).getF75851a(), InsuranceDetailsFlowContract$Step.MakeCfacClaim.f76075a));
        }
        if (destination instanceof InsuranceEmbeddedDestinations.GetHelpLayout) {
            return new InsuranceDetailsFlow(new InsuranceDetailsFlowContract$InputData(((InsuranceEmbeddedDestinations.GetHelpLayout) destination).getF75862a(), InsuranceDetailsFlowContract$Step.GetHelp.f76073a));
        }
        if (destination instanceof InsuranceEmbeddedDestinations.DocumentsLayout) {
            return new InsuranceDetailsFlow(new InsuranceDetailsFlowContract$InputData(((InsuranceEmbeddedDestinations.DocumentsLayout) destination).getF75859a(), InsuranceDetailsFlowContract$Step.Documents.f76072a));
        }
        if (!(destination instanceof InsuranceEmbeddedDestinations.CoverageDetails)) {
            return null;
        }
        InsuranceEmbeddedDestinations.CoverageDetails coverageDetails = (InsuranceEmbeddedDestinations.CoverageDetails) destination;
        return new InsuranceDetailsFlow(new InsuranceDetailsFlowContract$InputData(coverageDetails.getF75852a(), new InsuranceDetailsFlowContract$Step.Coverage(coverageDetails.getF75853b())));
    }
}
