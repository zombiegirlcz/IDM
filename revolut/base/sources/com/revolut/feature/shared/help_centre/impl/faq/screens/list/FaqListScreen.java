package com.revolut.feature.shared.help_centre.impl.faq.screens.list;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.shared.help_centre.impl.faq.screens.list.FaqListScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.tracking.v3.IdContext;
import java.util.List;
import jv.o;
import k8d.c;
import k8d.d;
import k8d.f;
import k8d.l;
import k8d.m;
import kii.e;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import ofm.q;
import r7d.i;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/faq/screens/list/FaqListScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lk8d/m;", "Lcom/revolut/feature/shared/help_centre/impl/faq/screens/list/FaqListScreenContract$InputData;", "Lcom/revolut/feature/shared/help_centre/impl/faq/screens/list/a;", "Lno/k;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FaqListScreen extends BaseRecyclerViewScreen<m, FaqListScreenContract$InputData, a> implements k {
    public static final /* synthetic */ KProperty[] g0 = {o0.f186429a.j(new h0(FaqListScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int U;
    public final h V;
    public final boolean W;
    public final boolean X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final CellDetailsChevronDelegate f86259a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final LargeActionButtonDelegate f86260b0;
    public final ListSubheaderDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final RowDelegate f86261d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final List f86262e0;
    public AnalyticsContext f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaqListScreen(FaqListScreenContract$InputData inputData) {
        String f51434a;
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_recycler_navbar;
        this.V = s.t(this, k8d.a.f);
        this.W = true;
        this.X = true;
        this.Y = w.y0(new jnf.a(this, inputData, 29));
        this.Z = w.y0(new jj2.a(this, 27));
        CellDetailsChevronDelegate cellDetailsChevronDelegate = new CellDetailsChevronDelegate();
        this.f86259a0 = cellDetailsChevronDelegate;
        LargeActionButtonDelegate largeActionButtonDelegate = new LargeActionButtonDelegate();
        this.f86260b0 = largeActionButtonDelegate;
        ListSubheaderDelegate listSubheaderDelegate = new ListSubheaderDelegate();
        this.c0 = listSubheaderDelegate;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.f86261d0 = rowDelegate;
        this.f86262e0 = v.k(new FullScreenStateDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), cellDetailsChevronDelegate, largeActionButtonDelegate, listSubheaderDelegate, rowDelegate, new SwipeToActionDelegate(rowDelegate, false));
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        IdContext.a aVarNewBuilder = IdContext.newBuilder();
        FaqListScreenContract$InputData faqListScreenContract$InputData = (FaqListScreenContract$InputData) this.G;
        if (faqListScreenContract$InputData instanceof FaqListScreenContract$InputData.OpenByFaqKey) {
            f51434a = ((FaqListScreenContract$InputData.OpenByFaqKey) faqListScreenContract$InputData).f86266a;
        } else if (faqListScreenContract$InputData instanceof FaqListScreenContract$InputData.OpenByFaqNode) {
            f51434a = ((FaqListScreenContract$InputData.OpenByFaqNode) faqListScreenContract$InputData).f86269a.getF51434a();
        } else {
            if (!(faqListScreenContract$InputData instanceof FaqListScreenContract$InputData.OpenByDisplayableItems)) {
                throw new NoWhenBranchMatchedException();
            }
            f51434a = ((FaqListScreenContract$InputData.OpenByDisplayableItems) faqListScreenContract$InputData).d;
        }
        this.f0 = new AnalyticsContext(e.d(aVarNewBuilder, f51434a, companion));
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.f0 = analyticsContext;
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getG0() {
        return this.f0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (i) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithToolbar.f59410q), null, new k8d.b(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithToolbar.o.f57403b), null, new o(this, continuation, 24), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithToolbar.v0()), null, new k8d.b(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.f86259a0.f51821c), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.f86260b0.d.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.f86261d0.f53218h), null, new k8d.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.c0.f), null, new f(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        jii.m mVarH3 = h3();
        mVarH3.f174539b.setTag("FaqListScreen_navBarWithToolbar");
        mVarH3.f174540c.setTag("FaqListScreen_recycler");
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(q.k(q2())));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.f59417v0 = false;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF69885d0() {
        return this.f86262e0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: f3, reason: from getter */
    public final boolean getW() {
        return this.W;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(m uiState, jki.o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        Clause clause = uiState.f182118a;
        navBarWithToolbar.setTitle(clause, null);
        navBarWithToolbar.setToolbarTitle(clause);
        navBarWithToolbar.setMenuItems(uiState.f182120c);
        TextLocalisedClause textLocalisedClause = uiState.d;
        navBarWithToolbar.setSearchButtonActive(true);
        navBarWithToolbar.setHint(textLocalisedClause);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.U;
    }

    public final jii.m h3() {
        ViewBinding value = this.V.getValue(this, g0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final l T2() {
        return (l) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.X);
    }
}
