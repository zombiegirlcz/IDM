package ask;

import aii.e;
import aii.g;
import aii.p;
import aii.u;
import com.revolut.retail.feature.stockdetails.api.StockDetailsApi$Toggles$DetailedStatsKompotMigration;
import com.revolut.retail.feature.stockdetails.api.StockDetailsApi$Toggles$FinancialsStatementsKompotMigration;
import com.revolut.retail.feature.stockdetails.api.StockDetailsApi$Toggles$HighYieldBonds;
import com.revolut.retail.feature.stockdetails.api.StockDetailsApi$Toggles$InstrumentSuggestion;
import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;
import com.revolut.retail.feature.stockdetails.api.navigation.InstrumentAttrsFeatureConfig$InstrumentAttrsDestination;
import com.revolut.retail.feature.stockdetails.api.navigation.RecommendedBuyInfoDestination;
import com.revolut.retail.feature.stockdetails.api.navigation.StockFinancialsStatementsDestination;
import com.revolut.retail.feature.stockdetails.impl.navigation.destinations.EditKeyStatsDestination;
import com.revolut.retail.feature.stockdetails.impl.navigation.destinations.GlossaryDestination;
import com.revolut.retail.feature.stockdetails.impl.navigation.destinations.InsightsDestination;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.asset_details.AssetDetailsFlow;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.InsightsFlow;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.InsightsFlowContract$InputData;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.analyst_details_screen.AnalystDetailsDestination;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.analyst_details_screen.AnalystDetailsScreen;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.attrs.AttributesScreen;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.attrs.AttributesScreenContract$InputData;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.detailed_stats.DetailedStatsController;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.detailed_stats.DetailedStatsDestination;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.financials_statements.StockFinancialsStatementsController;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.financials_statements.StockFinancialsStatementsControllerContract$InputData;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.glossary.GlossaryScreen;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.recommended_buy_info.RecommendedBuyInfoScreen;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements p, nte.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof vqk.b) {
            return ((vqk.b) descriptor).a(new RecommendedBuyInfoScreen());
        }
        if (descriptor instanceof vqk.a) {
            vqk.a aVar = (vqk.a) descriptor;
            return aVar.a(new AssetDetailsFlow(aVar.b()));
        }
        super.c(descriptor);
        return null;
    }

    @Override // nte.a
    public final List e() {
        return v.k(StockDetailsApi$Toggles$HighYieldBonds.f103734c, StockDetailsApi$Toggles$InstrumentSuggestion.f103735c, StockDetailsApi$Toggles$FinancialsStatementsKompotMigration.f103733c, StockDetailsApi$Toggles$DetailedStatsKompotMigration.f103732c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof AnalystDetailsDestination) {
            return new AnalystDetailsScreen(((AnalystDetailsDestination) destination).f103879a);
        }
        if (destination instanceof InstrumentAttrsFeatureConfig$InstrumentAttrsDestination) {
            return new AttributesScreen(new AttributesScreenContract$InputData(((InstrumentAttrsFeatureConfig$InstrumentAttrsDestination) destination).f103739a));
        }
        if (destination instanceof DetailedStatsDestination) {
            return new DetailedStatsController(((DetailedStatsDestination) destination).getF103920b());
        }
        if (destination instanceof GlossaryDestination) {
            return new GlossaryScreen(((GlossaryDestination) destination).getF103784a());
        }
        if (destination instanceof EditKeyStatsDestination) {
            return gc0.c.b(b.a((EditKeyStatsDestination) destination), new a(0));
        }
        if (destination instanceof InsightsDestination) {
            InsightsDestination insightsDestination = (InsightsDestination) destination;
            return new InsightsFlow(new InsightsFlowContract$InputData(insightsDestination.getF103785b().getF103786a(), insightsDestination.getF103785b().getF103787b()));
        }
        if (destination instanceof AssetDetailsDestination) {
            return new AssetDetailsFlow((AssetDetailsDestination) destination);
        }
        if (destination instanceof RecommendedBuyInfoDestination) {
            return new RecommendedBuyInfoScreen();
        }
        if (!(destination instanceof StockFinancialsStatementsDestination)) {
            return null;
        }
        StockFinancialsStatementsDestination stockFinancialsStatementsDestination = (StockFinancialsStatementsDestination) destination;
        return new StockFinancialsStatementsController(new StockFinancialsStatementsControllerContract$InputData(stockFinancialsStatementsDestination.getF103749a(), stockFinancialsStatementsDestination.getF103750b()));
    }
}
