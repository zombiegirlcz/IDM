package com.revolut.feature.cryptocommodity_invest.impl.ui.collections_v2.collection_details;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import aw0.q0;
import cli.o;
import com.revolut.core.ui_kit.delegates.ActionCardDelegate;
import com.revolut.core.ui_kit.delegates.ActionCardLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RewardsGridDelegate;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.ButtonsActionsView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cryptocommodity_invest.impl.R$layout;
import com.revolut.feature.cryptocommodity_invest.impl.ui.collections_v2.collection_details.CryptoCollectionDetailsController;
import com.revolut.kompot.navigable.vc.ViewController;
import cvi.j;
import cy5.b;
import cy5.f;
import dli.a;
import ey5.e;
import fy5.d;
import hy5.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u00062\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/cryptocommodity_invest/impl/ui/collections_v2/collection_details/CryptoCollectionDetailsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lcy5/f;", "Ley5/e;", "Lfy5/d;", "Lhy5/c;", "feature_cryptocommodity_invest_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoCollectionDetailsController extends ViewController<q> implements a, e, d, c {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(CryptoCollectionDetailsController.class, "binding", "getBinding()Lcom/revolut/feature/cryptocommodity_invest/impl/databinding/ScreenCryptoCollectionDetailsBinding;", 0))};
    public final int K;
    public final Object L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public CryptoCollectionDetailsController(CryptoCollectionDetailsControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_crypto_collection_details;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: cy5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoCollectionDetailsController f110045b;

            {
                this.f110045b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoCollectionDetailsController.U;
                        return (d) ((mw5.f) this.f110045b.N.getValue()).f209352q.get();
                    default:
                        KProperty[] kPropertyArr2 = CryptoCollectionDetailsController.U;
                        CryptoCollectionDetailsController cryptoCollectionDetailsController = this.f110045b;
                        return dli.f.a(cryptoCollectionDetailsController, (d) cryptoCollectionDetailsController.L.getValue(), v.k(new ListSubheaderDelegate(), new FullScreenStateDelegate(), new PlainTextDelegate(), (TrendViewDelegate) cryptoCollectionDetailsController.S.getValue(), (FixedTabsDelegate) cryptoCollectionDetailsController.P.getValue(), (CellDetailsChevronDelegate) cryptoCollectionDetailsController.Q.getValue(), (RewardsGridDelegate) cryptoCollectionDetailsController.R.getValue(), new GridBoxDelegate(v.k((ActionCardDelegate) cryptoCollectionDetailsController.O.getValue(), new ActionCardLoadingDelegate()), 8.0f, 8.0f, 2)), 0, null, null, null, 60);
                }
            }
        });
        this.M = s.t(this, b.f);
        this.N = w.y0(new cvi.b(this, inputData, 3));
        this.O = w.y0(new cpi.b(24));
        this.P = w.y0(new cpi.b(25));
        this.Q = w.y0(new cpi.b(26));
        this.R = w.y0(new cpi.b(27));
        this.S = w.y0(new cpi.b(28));
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: cy5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoCollectionDetailsController f110045b;

            {
                this.f110045b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoCollectionDetailsController.U;
                        return (d) ((mw5.f) this.f110045b.N.getValue()).f209352q.get();
                    default:
                        KProperty[] kPropertyArr2 = CryptoCollectionDetailsController.U;
                        CryptoCollectionDetailsController cryptoCollectionDetailsController = this.f110045b;
                        return dli.f.a(cryptoCollectionDetailsController, (d) cryptoCollectionDetailsController.L.getValue(), v.k(new ListSubheaderDelegate(), new FullScreenStateDelegate(), new PlainTextDelegate(), (TrendViewDelegate) cryptoCollectionDetailsController.S.getValue(), (FixedTabsDelegate) cryptoCollectionDetailsController.P.getValue(), (CellDetailsChevronDelegate) cryptoCollectionDetailsController.Q.getValue(), (RewardsGridDelegate) cryptoCollectionDetailsController.R.getValue(), new GridBoxDelegate(v.k((ActionCardDelegate) cryptoCollectionDetailsController.O.getValue(), new ActionCardLoadingDelegate()), 8.0f, 8.0f, 2)), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        Clause textClause;
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f178930c;
        ky5.a aVar = uiState.f110049a;
        q0 q0Var = uiState.f110051c;
        if (aVar != null) {
            Clause clause = aVar.d;
            CompositeClause compositeClause = aVar.f190632c;
            Clause clause2 = aVar.f190631b;
            TextClause textClause2 = aVar.f190630a;
            if (clause2 == null) {
                m70.a.c(t0.f186434a);
                textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            } else {
                textClause = clause2;
            }
            NavBarWithToolbar.setToolbar$default(navBarWithToolbar, textClause2, textClause, null, 4, null);
            navBarWithToolbar.setHeaderDisclaimerSticky(uiState.f110050b);
            navBarWithToolbar.l0();
            navBarWithToolbar.setTitleTopDescription(textClause2);
            navBarWithToolbar.setTitle(clause2, null);
            navBarWithToolbar.setEndIconImage(aVar.e);
            navBarWithToolbar.setSecondDescriptionText(compositeClause);
            navBarWithToolbar.setSecondDescriptionClickable(true);
            navBarWithToolbar.setThirdDescriptionText(clause);
            navBarWithToolbar.setTitleVisible(true);
            navBarWithToolbar.setSecondDescriptionVisible(true);
            navBarWithToolbar.setThirdDescriptionVisible(clause != null);
            navBarWithToolbar.setDescriptionVisible(false);
            navBarWithToolbar.setTitleTopDescriptionVisible(true);
            navBarWithToolbar.H0(true);
        }
        ButtonsActionsView cryptoCollectionDetailsButtonsActions = d3().f178929b;
        Intrinsics.checkNotNullExpressionValue(cryptoCollectionDetailsButtonsActions, "cryptoCollectionDetailsButtonsActions");
        cryptoCollectionDetailsButtonsActions.setVisibility(q0Var == null ? 8 : 0);
        if (q0Var != null) {
            d3().f178929b.b(q0Var);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (mw5.f) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (cy5.d) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f178930c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setCompactDescriptions(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f178930c;
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.f59410q), new cy5.c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.y0()), new cy5.c(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b((ihm.f) navBarWithToolbar.f59406n.f258290b), new j(this, continuation, 8), 3);
    }

    public final jw5.b d3() {
        ViewBinding value = this.M.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jw5.b) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.T.getValue();
    }
}
