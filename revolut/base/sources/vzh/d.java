package vzh;

import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.tab.invest.impl.ui.home.TabInvestController;
import com.revolut.feature_crypto_order_details.impl.ui.details.CryptoOrderDetailsController;
import com.revolut.feature_crypto_order_flow.impl.exchange.CryptoExchangeScreen;
import com.revolut.feature_crypto_order_flow.impl.order_summary.OrderSummaryScreen;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import vkm.v1;
import whh.k;
import woc.p;
import wxh.m;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends yji.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f293532c = 7;
    public final Object d;
    public final Object e;

    public d(kyh.c view, zyh.c model) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        this.d = view;
        this.e = model;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // yji.d
    public final void M() {
        switch (this.f293532c) {
            case 0:
                yji.d.H(this, rd0.e.b(((OrderSummaryScreen) ((b) this.d)).P.d), new c(this, null), 3);
                break;
            case 1:
                yji.d.H(this, rd0.e.b(((wmh.a) this.d).f298666a.f53378c), new wmh.e(this, null), 3);
                break;
            case 2:
                CryptoOrderDetailsController cryptoOrderDetailsController = (CryptoOrderDetailsController) ((m) this.d);
                yji.d.H(this, rd0.e.b(((LargeActionButtonDelegate) cryptoOrderDetailsController.R.getValue()).d.f121375b), new wxh.a(this, null), 3);
                yji.d.H(this, rd0.e.b(((RowDelegate) cryptoOrderDetailsController.S.getValue()).f53218h), new wxh.b(this, null), 3);
                yji.d.H(this, rd0.e.b(((CellDetailsChevronDelegate) cryptoOrderDetailsController.Q.getValue()).f51821c), new wxh.c(this, null), 3);
                yji.d.H(this, rd0.e.b(((ActionsDelegate) cryptoOrderDetailsController.T.getValue()).f51611c.f121375b), new wxh.d(this, null), 3);
                break;
            case 3:
                yji.d.H(this, rd0.e.b(((TabInvestController) ((k) this.d)).W.f51589c.f121375b), new x64.b(this, null, 28), 3);
                break;
            case 4:
                Continuation continuation = null;
                vkm.d dVarK = q.k(new xnl.f((xvi.g) this.d, continuation, 15));
                Intrinsics.checkNotNullParameter(dVarK, "<this>");
                yji.d.H(this, new v1(new fa7.d(dVarK, continuation, 3)), new p(2, (xvi.c) this.e, xvi.c.class, "onBrightnessChanged", "onBrightnessChanged(Lcom/revolut/retail/feature/airportlounges/impl/analytics/brightness/AirportLoungesScreenBrightness;)V", 4, 15), 3);
                break;
            case 5:
                yji.d.H(this, rd0.e.b(((CryptoExchangeScreen) ((xyh.g) this.d)).d3().f240839c.f), new xni.h(this, null, 19), 3);
                break;
            case 6:
                ((u0k.d) this.d).C((u0k.a) this.e);
                break;
            default:
                yji.d.H(this, ((kyh.c) this.d).C1(), new zyh.b(this, null), 3);
                break;
        }
    }

    @Override // yji.d
    public void N() {
        switch (this.f293532c) {
            case 4:
                ((xvi.c) this.e).e = null;
                break;
            case 6:
                ((u0k.d) this.d).l();
                break;
        }
    }

    public d(u0k.d trendPreviewDelegate, u0k.a view) {
        Intrinsics.checkNotNullParameter(trendPreviewDelegate, "trendPreviewDelegate");
        Intrinsics.checkNotNullParameter(view, "view");
        this.d = trendPreviewDelegate;
        this.e = view;
    }

    public d(b view, a modelExtension) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(modelExtension, "modelExtension");
        this.d = view;
        this.e = modelExtension;
    }

    public d(k accountClosureView, whh.h accountsClosuresControllerModelExtension) {
        Intrinsics.checkNotNullParameter(accountClosureView, "accountClosureView");
        Intrinsics.checkNotNullParameter(accountsClosuresControllerModelExtension, "accountsClosuresControllerModelExtension");
        this.d = accountClosureView;
        this.e = accountsClosuresControllerModelExtension;
    }

    public d(wmh.a delegates, wmh.f controllerModelExtension) {
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.d = delegates;
        this.e = controllerModelExtension;
    }

    public d(m view, wxh.k model) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        this.d = view;
        this.e = model;
    }

    public d(xvi.g brightnessObserver, xvi.c brightnessChangeReporter) {
        Intrinsics.checkNotNullParameter(brightnessObserver, "brightnessObserver");
        Intrinsics.checkNotNullParameter(brightnessChangeReporter, "brightnessChangeReporter");
        this.d = brightnessObserver;
        this.e = brightnessChangeReporter;
    }

    public d(xyh.g view, xyh.c model) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        this.d = view;
        this.e = model;
    }
}
