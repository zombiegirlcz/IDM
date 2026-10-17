package com.revolut.retail.feature.crypto.asset_details.common.api.ui;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import aw0.o9;
import aw0.q0;
import c8j.d;
import cli.j;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.HeaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TabsDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.ButtonsActionsView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.crypto.asset_details.common.api.R$id;
import com.revolut.retail.feature.crypto.asset_details.common.api.R$layout;
import com.revolut.retail.feature.crypto.asset_details.common.api.ui.BaseCryptoAssetDetailsScreen;
import czc.d0;
import d8j.g;
import efm.r;
import ihm.f;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import rd0.e;
import te0.w;
import tx0.t3;
import vc.s;
import w7j.c;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b&\u0018\u0000 \u000b*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0012\u0004\u0012\u00028\u00010\u00072\u00020\b:\u0001\fB\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/revolut/retail/feature/crypto/asset_details/common/api/ui/BaseCryptoAssetDetailsScreen;", "Lcli/j;", "DomainState", "Ld8j/g;", "UiState", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "", "<init>", "()V", "Companion", "a", "feature_crypto_asset_details_common_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BaseCryptoAssetDetailsScreen<DomainState extends j, UiState extends g> extends ViewController<q> implements dli.a, y7j.a, d, c {
    public final Object U;
    public final Object V;
    public final Object X;
    public static final /* synthetic */ KProperty[] Y = {o0.f186429a.j(new h0(BaseCryptoAssetDetailsScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/crypto/asset_details/common/api/databinding/ScreenCryptoAssetDetailsBinding;", 0))};

    @NotNull
    private static final a Companion = new a();
    public final int K = R$layout.screen_crypto_asset_details;
    public final h L = s.t(this, b.f);
    public final Object M = w.y0(new d0(27));
    public final Object N = w.y0(new d0(28));
    public final Object O = w.y0(new d0(29));
    public final Object P = w.y0(new d8j.b(0));
    public final Object Q = w.y0(new d8j.b(1));
    public final Object R = w.y0(new d8j.b(2));
    public final Object S = w.y0(new d8j.b(3));
    public final Object T = w.y0(new d8j.b(4));
    public final f0 W = f0.f322471a;

    public static final class a {
        private a() {
        }
    }

    public static final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function1 {
        public static final b f = new b();

        public b() {
            super(1, z7j.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/retail/feature/crypto/asset_details/common/api/databinding/ScreenCryptoAssetDetailsBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.cryptoAssetDetails_buttonsActions;
            ButtonsActionsView buttonsActionsView = (ButtonsActionsView) ViewBindings.findChildViewById(p0, i);
            if (buttonsActionsView != null) {
                i = R$id.cryptoAssetDetails_navBarWithToolbar;
                NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
                if (navBarWithToolbar != null) {
                    i = R$id.cryptoAssetDetails_recycler;
                    ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
                    if (screenContentRecyclerView != null) {
                        return new z7j.a((ControllerContainerCoordinatorLayout) p0, buttonsActionsView, navBarWithToolbar, screenContentRecyclerView);
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public BaseCryptoAssetDetailsScreen() {
        final int i = 2;
        this.U = w.y0(new Function0(this) { // from class: d8j.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BaseCryptoAssetDetailsScreen f112283b;

            {
                this.f112283b = this;
            }

            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BaseCryptoAssetDetailsScreen baseCryptoAssetDetailsScreen = this.f112283b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BaseCryptoAssetDetailsScreen.Y;
                        return v.k((TrendViewDelegate) baseCryptoAssetDetailsScreen.M.getValue(), (FixedTabsDelegate) baseCryptoAssetDetailsScreen.N.getValue(), (TabsDelegate) baseCryptoAssetDetailsScreen.O.getValue(), new FixedTabsLoadingDelegate(), new TextDelegate(), new PlainTextDelegate(), (HeaderDelegate) baseCryptoAssetDetailsScreen.T.getValue(), baseCryptoAssetDetailsScreen.j0(), baseCryptoAssetDetailsScreen.c(), (CellDetailsDelegate) baseCryptoAssetDetailsScreen.Q.getValue(), (CellDetailsActionDelegate) baseCryptoAssetDetailsScreen.R.getValue(), new HeaderLoadingDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), (SwipeToActionDelegate) baseCryptoAssetDetailsScreen.U.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = BaseCryptoAssetDetailsScreen.Y;
                        BaseCryptoAssetDetailsScreen baseCryptoAssetDetailsScreen2 = this.f112283b;
                        return dli.f.a(baseCryptoAssetDetailsScreen2, baseCryptoAssetDetailsScreen2.f3(), zhm.d0.E0(baseCryptoAssetDetailsScreen2.getC0(), (List) baseCryptoAssetDetailsScreen2.V.getValue()), R$id.cryptoAssetDetails_recycler, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = BaseCryptoAssetDetailsScreen.Y;
                        return new SwipeToActionDelegate(baseCryptoAssetDetailsScreen.c(), true);
                }
            }
        });
        final int i2 = 0;
        this.V = w.y0(new Function0(this) { // from class: d8j.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BaseCryptoAssetDetailsScreen f112283b;

            {
                this.f112283b = this;
            }

            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BaseCryptoAssetDetailsScreen baseCryptoAssetDetailsScreen = this.f112283b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BaseCryptoAssetDetailsScreen.Y;
                        return v.k((TrendViewDelegate) baseCryptoAssetDetailsScreen.M.getValue(), (FixedTabsDelegate) baseCryptoAssetDetailsScreen.N.getValue(), (TabsDelegate) baseCryptoAssetDetailsScreen.O.getValue(), new FixedTabsLoadingDelegate(), new TextDelegate(), new PlainTextDelegate(), (HeaderDelegate) baseCryptoAssetDetailsScreen.T.getValue(), baseCryptoAssetDetailsScreen.j0(), baseCryptoAssetDetailsScreen.c(), (CellDetailsDelegate) baseCryptoAssetDetailsScreen.Q.getValue(), (CellDetailsActionDelegate) baseCryptoAssetDetailsScreen.R.getValue(), new HeaderLoadingDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), (SwipeToActionDelegate) baseCryptoAssetDetailsScreen.U.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = BaseCryptoAssetDetailsScreen.Y;
                        BaseCryptoAssetDetailsScreen baseCryptoAssetDetailsScreen2 = this.f112283b;
                        return dli.f.a(baseCryptoAssetDetailsScreen2, baseCryptoAssetDetailsScreen2.f3(), zhm.d0.E0(baseCryptoAssetDetailsScreen2.getC0(), (List) baseCryptoAssetDetailsScreen2.V.getValue()), R$id.cryptoAssetDetails_recycler, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = BaseCryptoAssetDetailsScreen.Y;
                        return new SwipeToActionDelegate(baseCryptoAssetDetailsScreen.c(), true);
                }
            }
        });
        final int i3 = 1;
        this.X = w.y0(new Function0(this) { // from class: d8j.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BaseCryptoAssetDetailsScreen f112283b;

            {
                this.f112283b = this;
            }

            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BaseCryptoAssetDetailsScreen baseCryptoAssetDetailsScreen = this.f112283b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BaseCryptoAssetDetailsScreen.Y;
                        return v.k((TrendViewDelegate) baseCryptoAssetDetailsScreen.M.getValue(), (FixedTabsDelegate) baseCryptoAssetDetailsScreen.N.getValue(), (TabsDelegate) baseCryptoAssetDetailsScreen.O.getValue(), new FixedTabsLoadingDelegate(), new TextDelegate(), new PlainTextDelegate(), (HeaderDelegate) baseCryptoAssetDetailsScreen.T.getValue(), baseCryptoAssetDetailsScreen.j0(), baseCryptoAssetDetailsScreen.c(), (CellDetailsDelegate) baseCryptoAssetDetailsScreen.Q.getValue(), (CellDetailsActionDelegate) baseCryptoAssetDetailsScreen.R.getValue(), new HeaderLoadingDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), (SwipeToActionDelegate) baseCryptoAssetDetailsScreen.U.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = BaseCryptoAssetDetailsScreen.Y;
                        BaseCryptoAssetDetailsScreen baseCryptoAssetDetailsScreen2 = this.f112283b;
                        return dli.f.a(baseCryptoAssetDetailsScreen2, baseCryptoAssetDetailsScreen2.f3(), zhm.d0.E0(baseCryptoAssetDetailsScreen2.getC0(), (List) baseCryptoAssetDetailsScreen2.V.getValue()), R$id.cryptoAssetDetails_recycler, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = BaseCryptoAssetDetailsScreen.Y;
                        return new SwipeToActionDelegate(baseCryptoAssetDetailsScreen.c(), true);
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar cryptoAssetDetailsNavBarWithToolbar = e3().f320023c;
        Intrinsics.checkNotNullExpressionValue(cryptoAssetDetailsNavBarWithToolbar, "cryptoAssetDetailsNavBarWithToolbar");
        t3 t3Var = t3.PROFILE;
        NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
        cryptoAssetDetailsNavBarWithToolbar.I0(t3Var, false);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = e3().f320023c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        Continuation continuation = null;
        ViewController.P2(this, e.b(navBarWithToolbar.f59410q), new co7.c(this, continuation, 22), 3);
        ViewController.P2(this, e.b((f) navBarWithToolbar.f59406n.f258290b), new d8j.c(this, continuation, 0), 3);
        navBarWithToolbar.setCompactDescriptions(true);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public RowDelegate c() {
        return (RowDelegate) this.S.getValue();
    }

    /* JADX INFO: renamed from: d3 */
    public List getC0() {
        return this.W;
    }

    public final z7j.a e3() {
        ViewBinding value = this.L.getValue(this, Y[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (z7j.a) value;
    }

    public abstract d8j.f f3();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    public final vkm.f g3() {
        f fVar = ((FixedTabsDelegate) this.N.getValue()).f52339c.f121375b;
        d8j.d dVar = d8j.d.f;
        r map = fVar.map(new cie.b(26));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        vkm.d dVarB = e.b(map);
        f fVar2 = ((TabsDelegate) this.O.getValue()).f53515c.f121375b;
        d8j.e eVar = d8j.e.f;
        r map2 = fVar2.map(new cie.b(27));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        return vkm.q.J(dVarB, e.b(map2));
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final vkm.d h3() {
        r rVarThrottleLast = ((TrendViewDelegate) this.M.getValue()).r().throttleLast(150L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(rVarThrottleLast, "throttleLast(...)");
        return e.b(rVarThrottleLast);
    }

    @Override // cli.w
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public void B(g uiState, Object obj2) {
        Clause textClause;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = e3().f320023c;
        Clause clauseE = uiState.e();
        Clause clauseI = uiState.i();
        if (clauseI == null) {
            m70.a.c(t0.f186434a);
            textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        } else {
            textClause = clauseI;
        }
        NavBarWithToolbar.setToolbar$default(navBarWithToolbar, clauseE, textClause, null, 4, null);
        navBarWithToolbar.setHeaderDisclaimerSticky(uiState.h());
        p9j.a aVar = (p9j.a) uiState.g().getContent();
        if (aVar != null) {
            Clause clause = aVar.f234323a;
            navBarWithToolbar.l0();
            navBarWithToolbar.setTitle(clause == null ? uiState.i() : clause, null);
            navBarWithToolbar.setEndIconImage(aVar.e);
            navBarWithToolbar.setTitleTopDescription(aVar.f234324b);
            navBarWithToolbar.setSecondDescriptionText(aVar.f234325c);
            navBarWithToolbar.setThirdDescriptionText(aVar.d);
            navBarWithToolbar.setTitleVisible((clause == null && uiState.i() == null) ? false : true);
            navBarWithToolbar.setSecondDescriptionVisible(true);
            navBarWithToolbar.setThirdDescriptionVisible(true);
            navBarWithToolbar.setDescriptionVisible(false);
            navBarWithToolbar.setTitleTopDescriptionVisible(true);
            navBarWithToolbar.H0(true);
        }
        ButtonsActionsView cryptoAssetDetailsButtonsActions = e3().f320022b;
        Intrinsics.checkNotNullExpressionValue(cryptoAssetDetailsButtonsActions, "cryptoAssetDetailsButtonsActions");
        cryptoAssetDetailsButtonsActions.setVisibility(uiState.o() == null ? 8 : 0);
        q0 q0VarO = uiState.o();
        if (q0VarO != null) {
            e3().f320022b.b(q0VarO);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ListSubheaderDelegate j0() {
        return (ListSubheaderDelegate) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.X.getValue();
    }
}
