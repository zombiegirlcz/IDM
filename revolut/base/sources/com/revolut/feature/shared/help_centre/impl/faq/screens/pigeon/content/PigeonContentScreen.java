package com.revolut.feature.shared.help_centre.impl.faq.screens.pigeon.content;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.ActionsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSingleButtonDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsTwinButtonsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.shared.help_centre.impl.R$string;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import java.util.List;
import jii.u;
import jki.o;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ljd.e;
import ltf.b;
import m8d.a;
import m8d.c;
import m8d.d;
import m8d.f;
import m8d.g;
import m8d.i;
import m8d.j;
import m8d.l;
import m8d.t;
import m8d.x;
import m8d.y;
import no.k;
import r7d.q;
import te0.w;
import tx0.j0;
import tx0.t3;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/faq/screens/pigeon/content/PigeonContentScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lm8d/y;", "Lcom/revolut/feature/shared/help_centre/impl/faq/screens/pigeon/content/PigeonContentScreenContract$InputData;", "Lm8d/t;", "Lno/k;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PigeonContentScreen extends BaseRecyclerViewScreen<y, PigeonContentScreenContract$InputData, t> implements k {

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f86281k0 = {o0.f186429a.j(new h0(PigeonContentScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int U;
    public final int V;
    public final h W;
    public final ActionsDelegate X;
    public final CellDetailsSingleButtonDelegate Y;
    public final CellDetailsTwinButtonsDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final ListSubheaderDelegate f86282a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final RowDelegate f86283b0;
    public final PlainTextDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final InputTextDelegate f86284d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final LargeActionButtonDelegate f86285e0;
    public final List f0;
    public final Object g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Object f86286h0;
    public AnalyticsContext i0;
    public int j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PigeonContentScreen(PigeonContentScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_recycler_navbar_nextbutton;
        this.V = R$id.recyclerView;
        this.W = s.t(this, a.f);
        ActionsDelegate actionsDelegate = new ActionsDelegate();
        this.X = actionsDelegate;
        CellDetailsChevronDelegate cellDetailsChevronDelegate = new CellDetailsChevronDelegate();
        CellDetailsSingleButtonDelegate cellDetailsSingleButtonDelegate = new CellDetailsSingleButtonDelegate();
        this.Y = cellDetailsSingleButtonDelegate;
        CellDetailsTwinButtonsDelegate cellDetailsTwinButtonsDelegate = new CellDetailsTwinButtonsDelegate();
        this.Z = cellDetailsTwinButtonsDelegate;
        ListSubheaderDelegate listSubheaderDelegate = new ListSubheaderDelegate();
        this.f86282a0 = listSubheaderDelegate;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.f86283b0 = rowDelegate;
        PlainTextDelegate plainTextDelegate = new PlainTextDelegate();
        this.c0 = plainTextDelegate;
        this.f86284d0 = new InputTextDelegate(null);
        this.f86285e0 = new LargeActionButtonDelegate();
        this.f0 = v.k(new ActionsLoadingDelegate(), new CellDetailsLoadingDelegate(), new FullScreenStateDelegate(), new PlainTextLoadingDelegate(), new RowLoadingDelegate(), actionsDelegate, cellDetailsChevronDelegate, cellDetailsSingleButtonDelegate, cellDetailsTwinButtonsDelegate, listSubheaderDelegate, plainTextDelegate, rowDelegate);
        this.g0 = w.y0(new b(this, inputData, 20));
        this.f86286h0 = w.y0(new e(this, 29));
        this.i0 = l7d.a.b(inputData.f86287a);
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.i0 = analyticsContext;
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getL() {
        return this.i0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (q) this.g0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f174565c.f59410q), null, new g(this, continuation, 0), 3);
        int i = 1;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f174565c.o.f57403b), null, new d(this, continuation, i), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f174564b.o), null, new g(this, continuation, i), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.c0.d.f121375b), null, new d(this, continuation, 2), 3);
        RowDelegate rowDelegate = this.f86283b0;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53218h), null, new m8d.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53226s), null, new d(this, continuation, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.i), null, new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53219j), null, new j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Y.f.f121375b), null, new m8d.k(this, null), 3);
        CellDetailsTwinButtonsDelegate cellDetailsTwinButtonsDelegate = this.Z;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(cellDetailsTwinButtonsDelegate.e.f121375b), null, new m8d.b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(cellDetailsTwinButtonsDelegate.f.f121375b), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.X.f51611c.f121375b), null, new d(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.f86285e0.d.f121375b), null, new m8d.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.f86284d0.e.f121375b), null, new f(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        pd.b.p(view, new TextLocalisedClause(R$string.help_center_article, null, null, 14));
        NavBarWithToolbar navBarWithToolbar = h3().f174565c;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        ((j60.a) ((q) this.g0.getValue()).e.get()).d(v.k(this.X, this.f86282a0, this.f86284d0, this.f86285e0, new ActionsLoadingDelegate(), new LargeActionButtonLoadingDelegate()));
        this.j0 = h3().d.getPaddingBottom();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF87670b0() {
        return this.f0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(y uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f174565c;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        x xVar = uiState.f203526a;
        l lVar = uiState.f203527b;
        if (xVar instanceof m8d.v) {
            t3 t3Var = t3.DEFAULT;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar.I0(t3Var, false);
        } else {
            if (!(xVar instanceof m8d.w)) {
                throw new NoWhenBranchMatchedException();
            }
            navBarWithToolbar.setToolbarTitle(((m8d.w) xVar).f203525a);
            navBarWithToolbar.setTitle(((m8d.w) xVar).f203525a, null);
            navBarWithToolbar.l0();
            navBarWithToolbar.setMenuItems(uiState.f203528c);
        }
        LargeActionButton goToButton = h3().f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        if (lVar == null) {
            goToButton.setVisibility(8);
            ScreenContentRecyclerView recyclerView = h3().d;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
            knm.b.v(0, recyclerView);
            return;
        }
        goToButton.setText(lVar.f203510a);
        goToButton.setAnalyticsContext(lVar.f203511b);
        goToButton.setVisibility(0);
        ScreenContentRecyclerView recyclerView2 = h3().d;
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "recyclerView");
        knm.b.v(this.j0, recyclerView2);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.U;
    }

    public final u h3() {
        ViewBinding value = this.W.getValue(this, f86281k0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final m8d.u T2() {
        return (m8d.u) this.f86286h0.getValue();
    }
}
