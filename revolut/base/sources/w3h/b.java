package w3h;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.wealth.assetdetails.ui.api.navigation.InstrumentHighRiskWarningDestination;
import com.revolut.feature.wealth.assetdetails.ui.api.navigation.InstrumentRatingsFeatureConfig$Destination;
import com.revolut.feature.wealth.assetdetails.ui.impl.high_risk.InstrumentHighRiskWarningController;
import com.revolut.feature.wealth.assetdetails.ui.impl.high_risk.InstrumentHighRiskWarningControllerContract$InputData;
import com.revolut.feature.wealth.assetdetails.ui.impl.instrument_account_chooser.InstrumentAccountChooserController;
import com.revolut.feature.wealth.assetdetails.ui.impl.investments.screen.InvestmentsController;
import com.revolut.feature.wealth.assetdetails.ui.impl.investments.screen.InvestmentsControllerContract$InputData;
import com.revolut.feature.wealth.assetdetails.ui.impl.investments.screen.InvestmentsDestination;
import com.revolut.feature.wealth.assetdetails.ui.impl.investments_avg_price.InvestmentsAvgPriceController;
import com.revolut.feature.wealth.assetdetails.ui.impl.ratings.credit_quality.CreditQualityScreen;
import com.revolut.feature.wealth.assetdetails.ui.impl.ratings.credit_quality.CreditQualityScreenContract$InputData;
import com.revolut.feature.wealth.assetdetails.ui.impl.ratings.credit_quality.CreditQualityScreenContract$RatingsContext;
import com.revolut.feature.wealth.assetdetails.ui.impl.ratings.details.RatingsDetailsScreen;
import com.revolut.feature.wealth.assetdetails.ui.impl.ratings.details.RatingsDetailsScreenContract$InputData;
import j3h.d;
import kotlin.jvm.internal.Intrinsics;
import t2h.h;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof h) {
            h hVar = (h) descriptor;
            return hVar.a(new InstrumentAccountChooserController(hVar.f267573a));
        }
        if (descriptor instanceof j3h.a) {
            return ((j3h.a) descriptor).a(new CreditQualityScreen(new CreditQualityScreenContract$InputData(new CreditQualityScreenContract$RatingsContext.FitchRatingContext(null))));
        }
        if (descriptor instanceof d) {
            return ((d) descriptor).a(new InvestmentsAvgPriceController());
        }
        if (!(descriptor instanceof j3h.b)) {
            return null;
        }
        j3h.b bVar = (j3h.b) descriptor;
        return bVar.a(new InstrumentHighRiskWarningController(new InstrumentHighRiskWarningControllerContract$InputData(bVar.f171190a)));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof InstrumentRatingsFeatureConfig$Destination.InstrumentCreditRatingsDestination) {
            InstrumentRatingsFeatureConfig$Destination.InstrumentCreditRatingsDestination instrumentCreditRatingsDestination = (InstrumentRatingsFeatureConfig$Destination.InstrumentCreditRatingsDestination) destination;
            return new RatingsDetailsScreen(new RatingsDetailsScreenContract$InputData(instrumentCreditRatingsDestination.f95409a, instrumentCreditRatingsDestination.f95410b));
        }
        if (destination instanceof InstrumentRatingsFeatureConfig$Destination.InstrumentCreditQualityDestination) {
            return new CreditQualityScreen(new CreditQualityScreenContract$InputData(new CreditQualityScreenContract$RatingsContext.FitchRatingContext(((InstrumentRatingsFeatureConfig$Destination.InstrumentCreditQualityDestination) destination).f95408a)));
        }
        if (destination instanceof InstrumentHighRiskWarningDestination) {
            return new InstrumentHighRiskWarningController(new InstrumentHighRiskWarningControllerContract$InputData(((InstrumentHighRiskWarningDestination) destination).f95407a));
        }
        if (!(destination instanceof InvestmentsDestination)) {
            return null;
        }
        InvestmentsDestination.InputData inputData = ((InvestmentsDestination) destination).f95416b;
        return new InvestmentsController(new InvestmentsControllerContract$InputData(inputData.f95418b, inputData.f95417a, inputData.f95419c));
    }
}
