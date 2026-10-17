package osk;

import ael.d0;
import android.os.Parcelable;
import aw0.m6;
import aw0.n6;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.retail.feature.stockdetails.api.StockDetailsApi$Toggles$InstrumentSuggestion;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.wealth.domain.api.interactors.InstrumentTickerInteractor$Companion;
import grl.k9;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
public final class n extends b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f229351l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final gte.a f229352m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final s f229353n;
    public final ybl.l o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d0 f229354p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ybl.b f229355q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vki.a f229356r;

    public n(e inputData, gte.a featureToggleInteractor, s mapper, ybl.l tradingConfigInteractor, d0 stocksInteractor, ybl.b instrumentTickerInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(stocksInteractor, "stocksInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        this.f229351l = inputData;
        this.f229352m = featureToggleInteractor;
        this.f229353n = mapper;
        this.o = tradingConfigInteractor;
        this.f229354p = stocksInteractor;
        this.f229355q = instrumentTickerInteractor;
        this.f229356r = pyd.c.a(this, new c(null, null, null, null));
    }

    @Override // yji.n
    public final void H2() {
        if (((jte.d) this.f229352m).c(StockDetailsApi$Toggles$InstrumentSuggestion.f103735c)) {
            X2(this.f229356r, new os9.f(4));
            return;
        }
        V2(new omg.e(this, null, 10), new yi5.b(29));
        e eVar = this.f229351l;
        yji.n.l2(this, rd0.e.b(this.f229354p.a(eVar.f229345a, false)), null, new l(this, null, 1), 3);
        String str = eVar.f229345a;
        ybl.b.Companion.getClass();
        yji.n.l2(this, ((ael.k) this.f229355q).p(str, w4l.h.f294642c, InstrumentTickerInteractor$Companion.f105074b.a()), null, new l(this, null, 0), 3);
    }

    @Override // osk.b
    public final void Z2(ruk.h tab2) {
        Intrinsics.checkNotNullParameter(tab2, "tab");
        V2(new m(this, tab2, null, 0), new yi5.b(29));
    }

    @Override // osk.b
    public final void b3() {
        this.f229353n.getClass();
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_trading_instrument_details_forecasts_title, null, null, 14);
        List listK = v.k(new TextLocalisedClause(R$string.wealth_trading_instrument_details_forecasts_dialog_disclaimer, null, null, 14), new TextLocalisedClause(R$string.wealth_trading_instrument_details_forecasts_dialog_learn_more, null, new Click(30, (Integer) null, (Object) null, "LEARN_MORE_ANALYSTS_WIDGET_DIALOG", false), 10));
        m70.a.t(t0.f186434a);
        lw0.a aVar = new lw0.a(textLocalisedClause, new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), null, null, false, 28);
        aw0.e eVar = new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R$string.wealth_trading_instrument_details_forecasts_dialog_button, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55);
        k9 k9Var = k9.Wealth;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        N2(new ActionsBottomSheetController(new dii.a(aVar, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new oqk.c(this, 11));
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.f229356r;
    }
}
