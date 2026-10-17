package com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.upcoming;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.model.faq.FaqNodeBase;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.shared.help_centre.impl.R$string;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.upcoming.UpcomingTransactionsScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import hwi.l0;
import i13.d;
import i1d.b;
import i9d.c;
import i9d.i;
import i9d.j;
import java.util.List;
import jii.m;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import l7d.a;
import no.k;
import ofm.q;
import r7d.a0;
import rd0.e;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/faq/screens/troubleshooter/transactions/upcoming/UpcomingTransactionsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Li9d/j;", "Lcom/revolut/feature/shared/help_centre/impl/faq/screens/troubleshooter/transactions/upcoming/UpcomingTransactionsScreenContract$InputData;", "Li9d/i;", "Lno/k;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UpcomingTransactionsScreen extends BaseRecyclerViewScreen<j, UpcomingTransactionsScreenContract$InputData, i> implements k {
    public static final /* synthetic */ KProperty[] i0 = {o0.f186429a.j(new h0(UpcomingTransactionsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int U;
    public final boolean V;
    public final boolean W;
    public final h X;
    public final FullScreenStateDelegate Y;
    public final ListSubheaderDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final ListSubheaderLoadingDelegate f86365a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final RowDelegate f86366b0;
    public final RowLoadingDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final SwipeToActionDelegate f86367d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public AnalyticsContext f86368e0;
    public final Object f0;
    public final Object g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Object f86369h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpcomingTransactionsScreen(UpcomingTransactionsScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_recycler_navbar;
        this.V = true;
        this.W = true;
        this.X = s.t(this, c.f);
        this.Y = new FullScreenStateDelegate();
        this.Z = new ListSubheaderDelegate();
        this.f86365a0 = new ListSubheaderLoadingDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.f86366b0 = rowDelegate;
        this.c0 = new RowLoadingDelegate();
        this.f86367d0 = new SwipeToActionDelegate(rowDelegate, false);
        FaqNodeBase faqNodeBase = inputData.f86370a;
        this.f86368e0 = a.b(faqNodeBase != null ? faqNodeBase.getF51434a() : null);
        final int i = 0;
        this.f0 = w.y0(new Function0(this) { // from class: i9d.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpcomingTransactionsScreen f159631b;

            {
                this.f159631b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                UpcomingTransactionsScreen upcomingTransactionsScreen = this.f159631b;
                switch (i2) {
                    case 0:
                        return v.k(upcomingTransactionsScreen.Y, upcomingTransactionsScreen.Z, upcomingTransactionsScreen.f86365a0, upcomingTransactionsScreen.f86366b0, upcomingTransactionsScreen.c0, upcomingTransactionsScreen.f86367d0);
                    default:
                        KProperty[] kPropertyArr = UpcomingTransactionsScreen.i0;
                        return (k) ((a0) upcomingTransactionsScreen.g0.getValue()).f252090c.get();
                }
            }
        });
        this.g0 = w.y0(new b(this, inputData, 10));
        final int i2 = 1;
        this.f86369h0 = w.y0(new Function0(this) { // from class: i9d.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpcomingTransactionsScreen f159631b;

            {
                this.f159631b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                UpcomingTransactionsScreen upcomingTransactionsScreen = this.f159631b;
                switch (i22) {
                    case 0:
                        return v.k(upcomingTransactionsScreen.Y, upcomingTransactionsScreen.Z, upcomingTransactionsScreen.f86365a0, upcomingTransactionsScreen.f86366b0, upcomingTransactionsScreen.c0, upcomingTransactionsScreen.f86367d0);
                    default:
                        KProperty[] kPropertyArr = UpcomingTransactionsScreen.i0;
                        return (k) ((a0) upcomingTransactionsScreen.g0.getValue()).f252090c.get();
                }
            }
        });
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.f86368e0 = analyticsContext;
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getW() {
        return this.f86368e0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (a0) this.g0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (i9d.k) this.f86369h0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174539b.f59410q), null, new l0(this, continuation, 28), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174539b.o.f57403b), null, new d(this, continuation, 27), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f86366b0.f53218h), null, new i9d.d(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(q.k(q2())));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getV() {
        return (List) this.f0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: f3, reason: from getter */
    public final boolean getW() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(j uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.help_center_section_select_transaction_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setMenuItems(uiState.f159639b);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.U;
    }

    public final m h3() {
        ViewBinding value = this.X.getValue(this, i0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.W);
    }
}
