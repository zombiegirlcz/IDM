package b28;

import avk.i;
import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.invest.smart_notifications.impl.ui.screen.settings_info.InsightSettingsInfoBottomSheetContract$InputData;
import com.revolut.retail.feature.stockdetails.api.StockDetailsApi$Toggles$InstrumentSuggestion;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yji.l;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends h implements dli.b {
    public final z0h.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z0h.a f11924p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f11925q;

    public b(InsightSettingsInfoBottomSheetContract$InputData inputData, d stateMapper, gte.a featureToggleInteractor, z0h.d disclaimersDataProvider, z0h.a clauseDestinationProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(disclaimersDataProvider, "disclaimersDataProvider");
        Intrinsics.checkNotNullParameter(clauseDestinationProvider, "clauseDestinationProvider");
        this.o = disclaimersDataProvider;
        this.f11924p = clauseDestinationProvider;
        this.f11925q = mra.d.b(this, new a(new Data(null, null, true, 3, null), inputData.f76453a, ((jte.d) featureToggleInteractor).c(StockDetailsApi$Toggles$InstrumentSuggestion.f103735c)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, this.o.w0(), null, null, new i(this, null, 17), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f11925q;
    }
}
