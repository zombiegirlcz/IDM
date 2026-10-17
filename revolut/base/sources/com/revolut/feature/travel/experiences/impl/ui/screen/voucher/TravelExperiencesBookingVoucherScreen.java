package com.revolut.feature.travel.experiences.impl.ui.screen.voucher;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.browser.InAppBrowserView;
import com.revolut.feature.travel.experiences.impl.R$layout;
import com.revolut.kompot.navigable.screen.BaseScreen;
import frl.a;
import grl.k9;
import jki.l;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import rd0.e;
import te0.w;
import u3g.b;
import u3g.c;
import vc.s;
import z0g.d;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/screen/voucher/TravelExperiencesBookingVoucherScreen;", "Lcom/revolut/kompot/navigable/screen/BaseScreen;", "Ljki/l;", "Lcom/revolut/feature/travel/experiences/impl/ui/screen/voucher/TravelExperiencesBookingVoucherScreenContract$InputData;", "Laii/q;", "Lno/m;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelExperiencesBookingVoucherScreen extends BaseScreen<l, TravelExperiencesBookingVoucherScreenContract$InputData, q> implements m {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(TravelExperiencesBookingVoucherScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/experiences/impl/databinding/ScreenExperiencesBookingVoucherBinding;", 0))};
    public final AnalyticsProduct.Retail M;
    public final int N;
    public final h O;
    public final Object P;
    public final Object Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelExperiencesBookingVoucherScreen(TravelExperiencesBookingVoucherScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = a.f137510y;
        this.M = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        this.N = R$layout.screen_experiences_booking_voucher;
        this.O = s.t(this, b.f);
        this.P = w.y0(new u3g.a(this, inputData));
        this.Q = w.y0(new u3g.a(this));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(jki.m mVar, o oVar) {
        l uiState = (l) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        InAppBrowserView inAppBrowserView = Z2().f293694b;
        String url2 = ((TravelExperiencesBookingVoucherScreenContract$InputData) this.G).f93176a;
        Intrinsics.checkNotNullParameter(url2, "url");
        inAppBrowserView.getWebView$ui_kit_components_release().loadUrl(url2);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (d) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (u3g.d) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, e.b(Z2().f293694b.e()), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(Z2().f293694b.d()), null, new c(this, null, 1), 3);
    }

    public final w0g.c Z2() {
        ViewBinding value = this.O.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (w0g.c) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.N;
    }
}
