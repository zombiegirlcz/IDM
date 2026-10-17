package com.revolut.feature.tab.accounts.impl.total_wealth.category_list;

import aii.q;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.tab.accounts.api.R$string;
import com.revolut.feature.tab.accounts.api.mode.TabAccountsMode;
import com.revolut.feature.tab.accounts.impl.R$id;
import com.revolut.feature.tab.accounts.impl.R$layout;
import com.revolut.feature.tab.accounts.impl.total_wealth.category_list.TotalWealthCategoryListContract$InputData;
import com.revolut.feature.tab.accounts.impl.total_wealth.category_list.TotalWealthCategoryListScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import efm.r;
import grl.t4;
import ihm.f;
import java.util.List;
import khe.d;
import khe.e;
import khe.i;
import khe.j;
import khe.l;
import khe.m;
import khe.n;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import skm.a2;
import te0.w;
import tki.c;
import vc.s;
import zhm.d0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/tab/accounts/impl/total_wealth/category_list/TotalWealthCategoryListScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Lkhe/e;", "Lno/k;", "feature_tab_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TotalWealthCategoryListScreen extends ViewController<q> implements c, k {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(TotalWealthCategoryListScreen.class, "binding", "getBinding()Lcom/revolut/feature/tab/accounts/impl/databinding/ScreenTotalWealthCategoryListBinding;", 0))};
    public final TotalWealthCategoryListContract$InputData K;
    public final ListSubheaderDelegate L;
    public final CellDetailsDelegate M;
    public final RowDelegate N;
    public final SwipeToActionDelegate O;
    public final h P;
    public final i Q;
    public final int R;
    public final int S;
    public AnalyticsContext T;
    public final Object U;
    public final Object V;
    public final Object W;

    public TotalWealthCategoryListScreen(TotalWealthCategoryListContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = new ListSubheaderDelegate();
        this.M = new CellDetailsDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.N = rowDelegate;
        this.O = new SwipeToActionDelegate(rowDelegate, false);
        this.P = s.t(this, khe.h.f);
        this.Q = new i(this);
        this.R = R$style.UiKitTheme_TransparentSlider;
        this.S = R$layout.screen_total_wealth_category_list;
        this.T = new AnalyticsContext(jhe.c.b(inputData.f89587a, t4.ACTIVE));
        final int i = 0;
        this.U = w.y0(new Function0(this) { // from class: khe.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TotalWealthCategoryListScreen f184103b;

            {
                this.f184103b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TotalWealthCategoryListScreen totalWealthCategoryListScreen = this.f184103b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TotalWealthCategoryListScreen.X;
                        return ((lhe.a) totalWealthCategoryListScreen.V.getValue()).a();
                    case 1:
                        KProperty[] kPropertyArr2 = TotalWealthCategoryListScreen.X;
                        phm.a aVar = (phm.a) ue0.e.j(totalWealthCategoryListScreen.m2()).a().get(ige.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ige.a.class, " is not found"));
                        }
                        ehe.d dVar = (ehe.d) ((rge.b) ((jge.m) aVar2.b()).f174022n.get()).b(TabAccountsMode.Home.f89466a).j().mo3808a(totalWealthCategoryListScreen);
                        TotalWealthCategoryListContract$InputData totalWealthCategoryListContract$InputData = totalWealthCategoryListScreen.K;
                        switch (dVar.f126001a) {
                            case 0:
                                totalWealthCategoryListContract$InputData.getClass();
                                dVar.d = totalWealthCategoryListContract$InputData;
                                break;
                            default:
                                totalWealthCategoryListContract$InputData.getClass();
                                dVar.d = totalWealthCategoryListContract$InputData;
                                break;
                        }
                        return (lhe.a) dVar.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = TotalWealthCategoryListScreen.X;
                        TotalWealthCategoryListScreen totalWealthCategoryListScreen2 = this.f184103b;
                        return tki.g.a(totalWealthCategoryListScreen2, totalWealthCategoryListScreen2.d(), d0.E0(((lhe.a) totalWealthCategoryListScreen2.V.getValue()).h().e, zhm.v.k(totalWealthCategoryListScreen2.L, totalWealthCategoryListScreen2.M, totalWealthCategoryListScreen2.O, totalWealthCategoryListScreen2.N)), R$id.screenTotalWealthCategoryList_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.V = w.y0(new Function0(this) { // from class: khe.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TotalWealthCategoryListScreen f184103b;

            {
                this.f184103b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TotalWealthCategoryListScreen totalWealthCategoryListScreen = this.f184103b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TotalWealthCategoryListScreen.X;
                        return ((lhe.a) totalWealthCategoryListScreen.V.getValue()).a();
                    case 1:
                        KProperty[] kPropertyArr2 = TotalWealthCategoryListScreen.X;
                        phm.a aVar = (phm.a) ue0.e.j(totalWealthCategoryListScreen.m2()).a().get(ige.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ige.a.class, " is not found"));
                        }
                        ehe.d dVar = (ehe.d) ((rge.b) ((jge.m) aVar2.b()).f174022n.get()).b(TabAccountsMode.Home.f89466a).j().mo3808a(totalWealthCategoryListScreen);
                        TotalWealthCategoryListContract$InputData totalWealthCategoryListContract$InputData = totalWealthCategoryListScreen.K;
                        switch (dVar.f126001a) {
                            case 0:
                                totalWealthCategoryListContract$InputData.getClass();
                                dVar.d = totalWealthCategoryListContract$InputData;
                                break;
                            default:
                                totalWealthCategoryListContract$InputData.getClass();
                                dVar.d = totalWealthCategoryListContract$InputData;
                                break;
                        }
                        return (lhe.a) dVar.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = TotalWealthCategoryListScreen.X;
                        TotalWealthCategoryListScreen totalWealthCategoryListScreen2 = this.f184103b;
                        return tki.g.a(totalWealthCategoryListScreen2, totalWealthCategoryListScreen2.d(), d0.E0(((lhe.a) totalWealthCategoryListScreen2.V.getValue()).h().e, zhm.v.k(totalWealthCategoryListScreen2.L, totalWealthCategoryListScreen2.M, totalWealthCategoryListScreen2.O, totalWealthCategoryListScreen2.N)), R$id.screenTotalWealthCategoryList_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.W = w.y0(new Function0(this) { // from class: khe.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TotalWealthCategoryListScreen f184103b;

            {
                this.f184103b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TotalWealthCategoryListScreen totalWealthCategoryListScreen = this.f184103b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TotalWealthCategoryListScreen.X;
                        return ((lhe.a) totalWealthCategoryListScreen.V.getValue()).a();
                    case 1:
                        KProperty[] kPropertyArr2 = TotalWealthCategoryListScreen.X;
                        phm.a aVar = (phm.a) ue0.e.j(totalWealthCategoryListScreen.m2()).a().get(ige.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ige.a.class, " is not found"));
                        }
                        ehe.d dVar = (ehe.d) ((rge.b) ((jge.m) aVar2.b()).f174022n.get()).b(TabAccountsMode.Home.f89466a).j().mo3808a(totalWealthCategoryListScreen);
                        TotalWealthCategoryListContract$InputData totalWealthCategoryListContract$InputData = totalWealthCategoryListScreen.K;
                        switch (dVar.f126001a) {
                            case 0:
                                totalWealthCategoryListContract$InputData.getClass();
                                dVar.d = totalWealthCategoryListContract$InputData;
                                break;
                            default:
                                totalWealthCategoryListContract$InputData.getClass();
                                dVar.d = totalWealthCategoryListContract$InputData;
                                break;
                        }
                        return (lhe.a) dVar.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = TotalWealthCategoryListScreen.X;
                        TotalWealthCategoryListScreen totalWealthCategoryListScreen2 = this.f184103b;
                        return tki.g.a(totalWealthCategoryListScreen2, totalWealthCategoryListScreen2.d(), d0.E0(((lhe.a) totalWealthCategoryListScreen2.V.getValue()).h().e, zhm.v.k(totalWealthCategoryListScreen2.L, totalWealthCategoryListScreen2.M, totalWealthCategoryListScreen2.O, totalWealthCategoryListScreen2.N)), R$id.screenTotalWealthCategoryList_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getL() {
        return Integer.valueOf(this.R);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        e uiState = (e) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d dVar = uiState.f184101b;
        int i = dVar.f184098a;
        if (i == -1) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = ((tki.b) k()).f271959b.h().getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            int iFindFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
            int iFindLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
            if (iFindFirstCompletelyVisibleItemPosition <= i && i <= iFindLastCompletelyVisibleItemPosition) {
                a aVar = (a) d();
                a2 a2Var = aVar.E;
                if (a2Var != null) {
                    a2Var.f(null);
                }
                aVar.f89598t.a();
                aVar.H2(aVar.F, new kh4.b(5));
                return;
            }
        }
        ((tki.b) k()).f271959b.h().post(new k0.b(dVar, this, 4));
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.T = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (lhe.a) this.V.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getT() {
        return this.T;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        pd.b.p(view, new TextLocalisedClause(R$string.home_account_switcher, null, null, 14));
        BasicNavBar basicNavBar = d3().f152174c;
        basicNavBar.setAnalyticsContext(this.T);
        basicNavBar.setBackground(tx0.d0.TRANSPARENT);
        basicNavBar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        LargeActionButton largeActionButton = d3().f152173b;
        largeActionButton.setText(new TextLocalisedClause(R$string.account_switcher_main_button_title, null, null, 14));
        largeActionButton.setIcon(new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorOnAccent), (List) null, (ImageTransformations) null, (Clause) null, 246));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        ((tki.b) k()).f271959b.h().removeOnScrollListener(this.Q);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((tki.b) k()).f271959b.h().addOnScrollListener(this.Q);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f152174c.f59211b), null, new j(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f152173b.o), null, new j(this, continuation, 1), 3);
        RowDelegate rowDelegate = this.N;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53218h), null, new khe.k(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53220l), null, new l(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53227t), null, new m(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f), null, new n(this, null), 3);
        SwipeToActionDelegate swipeToActionDelegate = this.O;
        f fVar = swipeToActionDelegate.f;
        r rVarHide = swipeToActionDelegate.f53503g.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        r rVarFilter = rVarHide.filter(new kce.c(new kh4.b(4), 12));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.F0(fVar, rVarFilter)), null, new khe.o(this, null), 3);
    }

    public final hge.c d3() {
        ViewBinding value = this.P.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (hge.c) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final khe.b d() {
        return (khe.b) this.U.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    /* JADX INFO: renamed from: f3, reason: merged with bridge method [inline-methods] */
    public final tki.a k() {
        return (tki.a) this.W.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.S;
    }
}
