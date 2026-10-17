package com.revolut.feature.shared.help_centre.impl.faq.screens.faqsearch;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.j4;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.shared.help_centre.impl.R$string;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import gqh.o;
import h8d.a;
import h8d.b;
import h8d.c;
import h8d.d;
import h8d.f;
import h8d.g;
import h8d.n;
import h8d.p;
import java.util.List;
import jii.m;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import rd0.e;
import vc.s;
import yhm.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/faq/screens/faqsearch/FaqSearchRev10Screen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lh8d/p;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "", "Lno/k;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FaqSearchRev10Screen extends BaseRecyclerViewScreen<p, IOData$EmptyInput, Object> implements k {
    public static final /* synthetic */ KProperty[] l0 = {o0.f186429a.j(new h0(FaqSearchRev10Screen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int U;
    public final h V;
    public final boolean W;
    public final Lazy X;
    public final Lazy Y;
    public final boolean Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public AnalyticsContext f86244a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Lazy f86245b0;
    public final ActionsDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final ListSubheaderDelegate f86246d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final InputDisclosureDelegate f86247e0;
    public final RowDelegate f0;
    public final RowLoadingDelegate g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final CellDetailsLoadingDelegate f86248h0;
    public final FullScreenStateDelegate i0;
    public final TextDelegate j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final g f86249k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaqSearchRev10Screen(FaqSearchRev10ScreenContract$InputData inputData) {
        super(IOData$EmptyInput.f98299a);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_recycler_navbar;
        this.V = s.t(this, b.f);
        this.W = true;
        this.X = j.b(new a(this, inputData));
        this.Y = j.b(new a(this, 1));
        this.Z = true;
        this.f86245b0 = j.b(new a(this, 2));
        this.c0 = new ActionsDelegate();
        this.f86246d0 = new ListSubheaderDelegate();
        this.f86247e0 = new InputDisclosureDelegate();
        this.f0 = new RowDelegate(null, null, 7);
        this.g0 = new RowLoadingDelegate();
        this.f86248h0 = new CellDetailsLoadingDelegate();
        this.i0 = new FullScreenStateDelegate();
        this.j0 = new TextDelegate();
        this.f86249k0 = new g();
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.f86244a0 = analyticsContext;
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getF96939t0() {
        return this.f86244a0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: R2, reason: from getter */
    public final boolean getF78907d0() {
        return this.Z;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (r7d.j) this.X.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174539b.f59409p.f57336l), null, new o(this, continuation, 21), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174539b.f59409p.f57337m), null, new c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174539b.f59409p.o), null, new c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.c0.f51611c.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f86247e0.f52538c), null, new h8d.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f0.f53218h), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.i0.d), null, new c(this, continuation, 2), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        m mVarH3 = h3();
        mVarH3.f174539b.setTag("FaqSearchRev10Screen_navBarWithToolbar");
        mVarH3.f174540c.setTag("FaqSearchRev10Screen_recycler");
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        navBarWithToolbar.j0(false);
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.help_center_search_placeholder_common, null, null, 14));
        navBarWithToolbar.K0(j4.NO_ANIMATION);
        navBarWithToolbar.setActivated(false);
        navBarWithToolbar.E0();
        View currentFocus = m2().getCurrentFocus();
        if (currentFocus != null) {
            kli.c.d(currentFocus, 0L);
            Unit unit = Unit.f186387a;
        }
        h().addOnScrollListener(this.f86249k0);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void X2() {
        h().removeOnScrollListener(this.f86249k0);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF0() {
        return (List) this.f86245b0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(p uiState, jki.o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        h8d.o oVar2 = uiState.f150003b;
        if (oVar2.f150000b) {
            h3().f174539b.setSearchInputSilently(new TextClause(oVar2.f149999a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            h3().f174539b.setSearchInputSelection(oVar2.f149999a.length());
        }
        this.f86244a0 = uiState.f150004c;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.U;
    }

    public final m h3() {
        ViewBinding value = this.V.getValue(this, l0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final n T2() {
        return (n) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.W);
    }
}
