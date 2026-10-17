package s3h;

import ael.d0;
import android.os.Parcelable;
import aw0.n6;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature_pdf_view.PdfViewFeatureConfiguration;
import com.revolut.feature_web_view.WebViewFeatureConfig;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import com.revolut.retail.wealth.resources.R$string;
import grl.k9;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import nel.n;
import qij.s;
import vkm.j2;
import ybl.l;
import zh9.u0;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class k extends s2h.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d0 f259687l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final l f259688m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p3h.a f259689n;
    public final r3h.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vki.a f259690p;

    public k(d0 stocksInteractor, l tradingConfigInteractor, p3h.a mapper, r3h.a urlToFeatureConfigMapper) {
        Intrinsics.checkNotNullParameter(stocksInteractor, "stocksInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(urlToFeatureConfigMapper, "urlToFeatureConfigMapper");
        this.f259687l = stocksInteractor;
        this.f259688m = tradingConfigInteractor;
        this.f259689n = mapper;
        this.o = urlToFeatureConfigMapper;
        this.f259690p = pyd.c.a(this, new s2h.g(false));
    }

    @Override // s2h.e
    public final jhi.b Z2(n instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        return mo3.a.f(rd0.e.n(u0.i(l.d(this.f259688m), rd0.e.b(this.f259687l.a(instrument.f214596b, false)), new s((j2) this.f259690p.f22677a, 6)), h0.f322473a), new s20.c(10), new h(this, instrument, 0), new s20.c(11));
    }

    @Override // s2h.e
    public final jhi.b b3(n instrument, n cfdInstrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(cfdInstrument, "cfdInstrument");
        String str = instrument.f214596b;
        d0 d0Var = this.f259687l;
        return mo3.a.f(rd0.e.n(u0.i(rd0.e.b(d0Var.a(str, false)), rd0.e.b(d0Var.a(cfdInstrument.f214596b, false)), new s((j2) this.f259690p.f22677a, 7)), h0.f322473a), new s20.c(12), new h(this, instrument, 1), new s20.c(13));
    }

    @Override // s2h.e
    public final void c3(String url2) {
        FeatureConfig webViewFeatureConfig;
        Intrinsics.checkNotNullParameter(url2, "url");
        r3h.a aVar = this.o;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(url2, "url");
        if (a0.y(url2, "pdf", false)) {
            String authority = ((f80.b) aVar.f251293a).f(url2).getAuthority();
            webViewFeatureConfig = new PdfViewFeatureConfiguration(url2, authority != null ? new TextClause(authority, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, false, false, 44);
        } else {
            webViewFeatureConfig = new WebViewFeatureConfig(url2, null, 0, false, true, false, 130958);
        }
        A2(u0.c(webViewFeatureConfig));
    }

    @Override // s2h.e
    public final void d3(String assetName) {
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        this.f259689n.getClass();
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.wealth_index_details_about_title, u.c(assetName), null, 12), new TextLocalisedClause(com.revolut.feature.wealth.assetdetails.ui.impl.R$string.wealth_asset_details_etf_kid_info, u.c(assetName), null, 12), null, null, false, 28);
        aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
        k9 k9Var = k9.Wealth;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        yji.n.P2(this, new ActionsBottomSheetController(new dii.a(aVar, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
    }

    @Override // s2h.e
    public final void e3(boolean z) {
        X2(this.f259690p, new rk.b(z, 3));
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.f259690p;
    }
}
