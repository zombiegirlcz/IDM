package aah;

import android.view.Window;
import android.view.WindowManager;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.feature.cryptocommodity_invest.impl.ui.collections_v2.collection_details.CryptoCollectionDetailsController;
import com.revolut.feature.defi.asset_details.impl.ui.screen.DeFiAssetDetailsScreen;
import com.revolut.feature.defi.exchange.impl.ui.exchange_summary.DeFiExchangeSummaryScreen;
import com.revolut.feature.tab.crypto.impl.portfolio.CryptoPortfolioScreen;
import com.revolut.feature.tab.invest.impl.ui.home.TabInvestController;
import com.revolut.feature.trading.managed_portfolios.impl.ui.compare.ManagedPortfoliosCompareController;
import com.revolut.feature.wealth.assetdetails.ui.impl.instrument_account_chooser.InstrumentAccountChooserController;
import com.revolut.feature.wealth.impl.ui.screens.composite_add_money.WealthAddMoneyScreen;
import com.revolut.feature_crypto_order_flow.impl.order_summary.OrderSummaryScreen;
import com.revolut.retail.feature.airport.security_fast_track.api.AsftApi$Toggles$AsftQrCodeBrightness;
import com.revolut.retail.feature.crypto.asset_details.common.api.ui.BaseCryptoAssetDetailsScreen;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.asset_details.CryptoAssetDetailsScreen;
import efm.r;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import m1h.t;
import ql6.s;
import te0.w;
import vkm.q;
import vkm.v1;
import z0h.s1;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends yji.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2827c = 1;
    public final Object d;
    public final Object e;

    public g(b2b.e view, b2b.c controllerModelExtension) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.d = view;
        this.e = controllerModelExtension;
    }

    /* JADX WARN: Type inference failed for: r1v67, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, kotlin.Lazy] */
    @Override // yji.d
    public final void M() {
        int i = this.f2827c;
        int i2 = 19;
        int i3 = 25;
        int i5 = 10;
        int i6 = 2;
        Object obj2 = this.e;
        int i21 = 1;
        Object obj3 = this.d;
        Continuation continuation = null;
        int i22 = 3;
        switch (i) {
            case 0:
                yji.d.H(this, ((s1) obj3).r(), new a1a.a(this, continuation, 27), 3);
                break;
            case 1:
                yji.d.H(this, rd0.e.b(((b2b.e) obj3).c().f), new avk.i(this, continuation, 26), 3);
                break;
            case 2:
                CryptoAssetDetailsScreen cryptoAssetDetailsScreen = (CryptoAssetDetailsScreen) ((d9j.f) obj3);
                yji.d.H(this, new an9.g(q.J(new d83.i(rd0.e.b(cryptoAssetDetailsScreen.l0.f53378c), i21), new d83.i(rd0.e.b(cryptoAssetDetailsScreen.f99958r0.f51572n), i6)), 4), new d8j.c(this, continuation, i21), 3);
                break;
            case 3:
                yji.d.H(this, rd0.e.b(((DeFiExchangeSummaryScreen) ((e46.a) obj3)).M.d), new e46.b(this, null), 3);
                break;
            case 4:
                yji.d.H(this, rd0.e.b(((BaseCryptoAssetDetailsScreen) ((w7j.c) obj3)).c().f53218h), new e8j.c(this, null), 3);
                break;
            case 5:
                yji.d.H(this, new eq8.g(rd0.e.b(((CryptoCollectionDetailsController) ((ey5.e) obj3)).d3().f178929b.e.f121375b), 15), new ew1.d(this, continuation, i5), 3);
                break;
            case 6:
                yji.d.H(this, rd0.e.b(((CryptoPortfolioScreen) ((pr5.c) obj3)).X.f53218h), new fs5.a(this, null), 3);
                break;
            case 7:
                yji.d.H(this, rd0.e.b(((DeFiExchangeSummaryScreen) ((g46.b) obj3)).M.d), new g46.c(this, null), 3);
                break;
            case 8:
                yji.d.H(this, rd0.e.b(((g5b.d) obj3).f().d), new g5b.f(this, null), 3);
                break;
            case 9:
                ManagedPortfoliosCompareController managedPortfoliosCompareController = (ManagedPortfoliosCompareController) ((g6f.d) obj3);
                yji.d.H(this, rd0.e.b(managedPortfoliosCompareController.P.f52339c.f121375b), new g06.k(this, continuation, i2), 3);
                yji.d.H(this, rd0.e.b(managedPortfoliosCompareController.Q.r()), new g6f.e(this, null), 3);
                break;
            case 10:
                d1h.j jVar = (d1h.j) obj3;
                yji.d.H(this, q.J(rd0.e.b(jVar.getZ().e.f121375b), jVar.y()), new gaa.g(this, continuation, i22), 3);
                yji.d.H(this, rd0.e.b(jVar.getU().f52371h.f121375b), new gah.d(this, null), 3);
                break;
            case 11:
                AtomicBoolean atomicBoolean = ((kk8.e) obj2).f184505a;
                if (atomicBoolean.get()) {
                    atomicBoolean.set(false);
                    ((h60.d) obj3).R(h60.a.f149577a);
                }
                break;
            case 12:
                vkm.d dVarK = q.k(new gm6.j((gti.h) obj3, continuation, 12));
                Intrinsics.checkNotNullParameter(dVarK, "<this>");
                yji.d.H(this, new v1(new fa7.d(dVarK, continuation, i21)), new exe.k(2, (gti.c) obj2, gti.c.class, "onBrightnessChanged", "onBrightnessChanged(Lcom/revolut/retail/feature/airport/security_fast_track/impl/analytics/brightness/AsftScreenBrightness;)V", 4, 19), 3);
                break;
            case 13:
                yji.d.H(this, rd0.e.b(((CryptoPortfolioScreen) ((qr5.b) obj3)).X.f53218h), new hs5.a(this, null), 3);
                break;
            case 14:
                inh.a aVar = (inh.a) obj3;
                r rVarMerge = r.merge(aVar.f162939c.f51572n, aVar.f162937a.f52707c);
                Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
                yji.d.H(this, rd0.e.b(w.a0(rVarMerge, new im3.e(i2))), new ibg.g(this, continuation, 21), 3);
                break;
            case 15:
                BaseCryptoAssetDetailsScreen baseCryptoAssetDetailsScreen = (BaseCryptoAssetDetailsScreen) ((c8j.d) obj3);
                yji.d.H(this, rd0.e.b(baseCryptoAssetDetailsScreen.j0().d), new k8j.a(this, null), 3);
                yji.d.H(this, rd0.e.b(((CellDetailsActionDelegate) baseCryptoAssetDetailsScreen.R.getValue()).d), new k8j.b(this, null), 3);
                break;
            case 16:
                WealthAddMoneyScreen wealthAddMoneyScreen = (WealthAddMoneyScreen) ((t) obj2);
                NavBarWithAvatar navBarWithAvatar = wealthAddMoneyScreen.d3().f243078b;
                Intrinsics.checkNotNullExpressionValue(navBarWithAvatar, "wealthAddMoneyScreenNavBar");
                LargeActionButtonDelegate largeActionButtonDelegate = wealthAddMoneyScreen.R;
                j60.a bottomExpandableDialogControllerExtension = (j60.a) wealthAddMoneyScreen.N.getValue();
                Intrinsics.checkNotNullParameter(navBarWithAvatar, "navBarWithAvatar");
                Intrinsics.checkNotNullParameter(largeActionButtonDelegate, "largeActionButtonDelegate");
                Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
                yji.d.H(this, rd0.e.b(navBarWithAvatar.f59343j), new la8.h(this, continuation, 13), 3);
                break;
            case 17:
                n2h.g gVar = (n2h.g) obj3;
                yji.d.H(this, rd0.e.b(gVar.G0()), new m3h.b(this, null, 0), 3);
                yji.d.H(this, rd0.e.b(gVar.C0()), new m3h.b(this, null, 1), 3);
                break;
            case 18:
                yji.d.H(this, rd0.e.b(((InstrumentAccountChooserController) ((n4h.i) obj3)).S.f53218h), new n4h.l(this, null), 3);
                break;
            case 19:
                yji.d.H(this, rd0.e.b(((DeFiAssetDetailsScreen) ((o26.b) obj3)).e3().f320022b.e.f121375b), new nwc.f(this, continuation, 14), 3);
                break;
            case 20:
                BaseCryptoAssetDetailsScreen baseCryptoAssetDetailsScreen2 = (BaseCryptoAssetDetailsScreen) ((y7j.a) obj2);
                yji.d.H(this, baseCryptoAssetDetailsScreen2.g3(), new ox5.r(this, continuation, 5), 3);
                yji.d.H(this, baseCryptoAssetDetailsScreen2.h3(), new p26.d(this, null), 3);
                break;
            case 21:
                yji.d.H(this, ((pyg.f) obj3).r(), new pqc.k(this, continuation, 23), 3);
                break;
            case 22:
                yji.d.H(this, rd0.e.b(((OrderSummaryScreen) ((pzh.b) obj3)).U.d), new pqc.k(this, continuation, i3), 3);
                break;
            case 23:
                qmh.d dVar = (qmh.d) obj2;
                r rVarMerge2 = r.merge(dVar.f247843b.f51572n, dVar.f247844c.f52707c);
                Intrinsics.checkNotNullExpressionValue(rVarMerge2, "merge(...)");
                yji.d.H(this, rd0.e.b(w.a0(rVarMerge2, new s(i3))), new qc3.c(this, continuation, 28), 3);
                break;
            case 24:
                rmh.c cVar = (rmh.c) obj3;
                r rVarMerge3 = r.merge(cVar.f255321a.f52707c, cVar.f255322b.f51572n, cVar.f255323c.f51715c);
                Intrinsics.checkNotNullExpressionValue(rVarMerge3, "merge(...)");
                yji.d.H(this, rd0.e.b(w.a0(rVarMerge3, new rm2.s(11))), new rk9.d(this, continuation, 6), 3);
                break;
            case 25:
                yji.d.H(this, rd0.e.b(((CryptoPortfolioScreen) ((bi5.e) obj3)).t()), new sbb.w(this, continuation, i5), 3);
                break;
            case 26:
                if (((jte.d) ((gte.a) obj2)).c(AsftApi$Toggles$AsftQrCodeBrightness.f98706c)) {
                    Window window = ((com.revolut.kompot.navigable.a) obj3).m2().getWindow();
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    attributes.screenBrightness = 1.0f;
                    window.setAttributes(attributes);
                    break;
                }
                break;
            case 27:
                yji.d.H(this, rd0.e.b(((o5d.b) obj3).f222421a.f), new t5d.a(this, null), 3);
                break;
            case 28:
                TabInvestController tabInvestController = (TabInvestController) ((bih.l) obj3);
                yji.d.H(this, tabInvestController.O1(), new tjh.a(this, null), 3);
                yji.d.H(this, rd0.e.b(tabInvestController.Q.f53227t), new tjh.b(this, null), 3);
                yji.d.H(this, rd0.e.b(tabInvestController.S.d.f121375b), new tjh.c(this, null), 3);
                yji.d.H(this, rd0.e.b(tabInvestController.Q.f53226s), new tjh.d(this, null, 0), 3);
                yji.d.H(this, rd0.e.b(tabInvestController.Q.k), new tjh.e(this, null), 3);
                yji.d.H(this, tabInvestController.f89832e0, new tjh.d(this, null, 1), 3);
                yji.d.H(this, rd0.e.b(tabInvestController.c0.f), new tjh.d(this, null, 2), 3);
                break;
            default:
                yji.d.H(this, rd0.e.b(((OrderSummaryScreen) ((uzh.b) obj3)).P.d), new uzh.c(this, null), 3);
                break;
        }
    }

    @Override // yji.d
    public void N() {
        switch (this.f2827c) {
            case 12:
                ((gti.c) this.e).e = null;
                break;
            case 26:
                Window window = ((com.revolut.kompot.navigable.a) this.d).m2().getWindow();
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.screenBrightness = -1.0f;
                window.setAttributes(attributes);
                break;
        }
    }

    public g(bi5.e view, bi5.a controllerExtension) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(controllerExtension, "controllerExtension");
        this.d = view;
        this.e = controllerExtension;
    }

    public g(bih.l view, bih.a controllerModelExtension) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.d = view;
        this.e = controllerModelExtension;
    }

    public g(c84.c screenModelExtension, t view) {
        Intrinsics.checkNotNullParameter(screenModelExtension, "screenModelExtension");
        Intrinsics.checkNotNullParameter(view, "view");
        this.d = screenModelExtension;
        this.e = view;
    }

    public g(c8j.d view, c8j.c model) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        this.d = view;
        this.e = model;
    }

    public g(com.revolut.kompot.navigable.a controller, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.d = controller;
        this.e = featureToggleInteractor;
    }

    public g(d1h.j view, d1h.e controllerModelExtension) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.d = view;
        this.e = controllerModelExtension;
    }

    public g(d9j.f view, d9j.e model) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        this.d = view;
        this.e = model;
    }

    public g(e46.a view, c76.a modelExtension) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(modelExtension, "modelExtension");
        this.d = view;
        this.e = modelExtension;
    }

    public g(ey5.e view, ey5.d model) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        this.d = view;
        this.e = model;
    }

    public g(g46.b view, g46.a modelExtension) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(modelExtension, "modelExtension");
        this.d = view;
        this.e = modelExtension;
    }

    public g(g5b.d view, g5b.a controllerModelExtension) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.d = view;
        this.e = controllerModelExtension;
    }

    public g(g6f.d view, g6f.c model) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        this.d = view;
        this.e = model;
    }

    public g(gti.h brightnessObserver, gti.c brightnessChangeReporter) {
        Intrinsics.checkNotNullParameter(brightnessObserver, "brightnessObserver");
        Intrinsics.checkNotNullParameter(brightnessChangeReporter, "brightnessChangeReporter");
        this.d = brightnessObserver;
        this.e = brightnessChangeReporter;
    }

    public g(h60.d lottieAnimationControllerExtension, kk8.e juniorProgressionConfettiInteractor) {
        Intrinsics.checkNotNullParameter(lottieAnimationControllerExtension, "lottieAnimationControllerExtension");
        Intrinsics.checkNotNullParameter(juniorProgressionConfettiInteractor, "juniorProgressionConfettiInteractor");
        this.d = lottieAnimationControllerExtension;
        this.e = juniorProgressionConfettiInteractor;
    }

    public g(inh.a delegates, inh.h controllerModelExtension) {
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.d = delegates;
        this.e = controllerModelExtension;
    }

    public g(n2h.g view, n2h.a controllerModelExtension) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.d = view;
        this.e = controllerModelExtension;
    }

    public g(n4h.i view, n4h.g controllerModel) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(controllerModel, "controllerModel");
        this.d = view;
        this.e = controllerModel;
    }

    public g(o26.b view, o26.a model) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        this.d = view;
        this.e = model;
    }

    public g(o5d.b delegates, t5d.c controllerModelExtension) {
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.d = delegates;
        this.e = controllerModelExtension;
    }

    public g(p26.f model, y7j.a view) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(view, "view");
        this.d = model;
        this.e = view;
    }

    public g(pr5.c view, pr5.a controllerModel) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(controllerModel, "controllerModel");
        this.d = view;
        this.e = controllerModel;
    }

    public g(pyg.f view, pyg.a controllerModel) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(controllerModel, "controllerModel");
        this.d = view;
        this.e = controllerModel;
    }

    public g(pzh.b view, pzh.a modelExtension) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(modelExtension, "modelExtension");
        this.d = view;
        this.e = modelExtension;
    }

    public g(qmh.j controllerModelExtension, qmh.d delegates) {
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        this.d = controllerModelExtension;
        this.e = delegates;
    }

    public g(qr5.b view, qr5.a controllerModel) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(controllerModel, "controllerModel");
        this.d = view;
        this.e = controllerModel;
    }

    public g(rmh.c delegates, rmh.b controllerModelExtension) {
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.d = delegates;
        this.e = controllerModelExtension;
    }

    public g(uzh.b view, uzh.a controllerModelExtension) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.d = view;
        this.e = controllerModelExtension;
    }

    public g(w7j.c view, w7j.a model) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        this.d = view;
        this.e = model;
    }

    public g(s1 view, h controllerModelExtension) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.d = view;
        this.e = controllerModelExtension;
    }
}
