package etk;

import ael.h;
import com.revolut.data.model.Data;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.feature.stockdetails.api.StockDetailsApi$Toggles$DetailedStatsKompotMigration;
import com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.AssetStatsId;
import com.revolut.retail.feature.stockdetails.impl.navigation.destinations.EditKeyStatsDestination;
import com.revolut.retail.feature.stockdetails.impl.ui.activities.stats.DetailedStatsContract$Configuration;
import com.revolut.retail.feature.stockdetails.impl.ui.delegates.stats.kompot.CustomisedStatsDialogProvider;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.detailed_stats.DetailedStatsControllerContract$InputData;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.detailed_stats.DetailedStatsDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import nel.n;
import nel.z;
import ogm.i;
import zh9.u0;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends dtk.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i f129441l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final h f129442m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final CustomisedStatsDialogProvider f129443n;
    public final gte.a o;

    public a(i displayAssetStatsInteractor, h instrumentStatsInteractor, CustomisedStatsDialogProvider customisedStatsDialogProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(displayAssetStatsInteractor, "displayAssetStatsInteractor");
        Intrinsics.checkNotNullParameter(instrumentStatsInteractor, "instrumentStatsInteractor");
        Intrinsics.checkNotNullParameter(customisedStatsDialogProvider, "customisedStatsDialogProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f129441l = displayAssetStatsInteractor;
        this.f129442m = instrumentStatsInteractor;
        this.f129443n = customisedStatsDialogProvider;
        this.o = featureToggleInteractor;
    }

    @Override // dtk.b
    public final Flow Z2(n instrument) {
        trk.a aVar;
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        z zVar = instrument.f214597c;
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        switch (dtk.f.f117467a[zVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                aVar = trk.a.STOCKS;
                break;
            case 5:
            case 6:
            case 7:
                aVar = trk.a.ETF;
                break;
            case 8:
                aVar = trk.a.BONDS;
                break;
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                aVar = null;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (aVar != null) {
            return nim.a.v(u0.m(this.f129442m.a(instrument, w4l.h.f294642c), this.f129441l.i(aVar)), new eq4.c(aVar, instrument, 24));
        }
        return new go.g(new Data(null, new IllegalStateException("stats are not available for instrument type: " + instrument.f214597c), false, 5, null), 2);
    }

    @Override // dtk.b
    public final void b3(trk.a assetType) {
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        A2(new EditKeyStatsDestination(new EditKeyStatsDestination.Input(assetType)));
    }

    @Override // dtk.b
    public final void c3(n instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        if (((jte.d) this.o).c(StockDetailsApi$Toggles$DetailedStatsKompotMigration.f103732c)) {
            A2(new DetailedStatsDestination(new DetailedStatsControllerContract$InputData(instrument)));
        } else {
            hsk.f.Companion.getClass();
            A2(u0.b(new ActivityNavigateCommand(hsk.c.f155073b, new DetailedStatsContract$Configuration("TRADING_STOCK_BUY_FLOW", instrument), null, null, 0, null, null, null, null, false, 1020)));
        }
    }

    @Override // dtk.b
    public final void d3(AssetStatsId assetStatsId) {
        Intrinsics.checkNotNullParameter(assetStatsId, "assetStatsId");
        this.f129443n.getClass();
        Intrinsics.checkNotNullParameter(assetStatsId, "assetStatsId");
        CustomisedStatsDialogProvider.DialogContent dialogContentA = CustomisedStatsDialogProvider.a(assetStatsId);
        ActionsBottomSheetController actionsBottomSheetControllerB = dialogContentA != null ? CustomisedStatsDialogProvider.b(dialogContentA) : null;
        if (actionsBottomSheetControllerB != null) {
            yji.n.P2(this, actionsBottomSheetControllerB, ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
        }
    }
}
