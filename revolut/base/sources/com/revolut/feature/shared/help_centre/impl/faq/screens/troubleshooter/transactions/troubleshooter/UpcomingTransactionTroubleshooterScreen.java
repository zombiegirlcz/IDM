package com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.troubleshooter;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.model.faq.FaqNodeBase;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.shared.help_centre.impl.R$string;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.troubleshooter.UpcomingTransactionTroubleshooterScreen;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.troubleshooter.UpcomingTransactionTroubleshooterScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import f9d.c;
import f9d.d;
import f9d.l;
import f9d.m;
import f9d.n;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import ofm.q;
import r7d.z;
import rd0.e;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/faq/screens/troubleshooter/transactions/troubleshooter/UpcomingTransactionTroubleshooterScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lf9d/n;", "Lcom/revolut/feature/shared/help_centre/impl/faq/screens/troubleshooter/transactions/troubleshooter/UpcomingTransactionTroubleshooterScreenContract$InputData;", "Lf9d/l;", "Lno/k;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UpcomingTransactionTroubleshooterScreen extends BaseRecyclerViewScreen<n, UpcomingTransactionTroubleshooterScreenContract$InputData, l> implements k {
    public static final /* synthetic */ KProperty[] j0 = {o0.f186429a.j(new h0(UpcomingTransactionTroubleshooterScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int U;
    public final boolean V;
    public final boolean W;
    public final CellDetailsChevronDelegate X;
    public final FullScreenStateDelegate Y;
    public final ListSubheaderDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final ListSubheaderLoadingDelegate f86352a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final RowDelegate f86353b0;
    public final RowLoadingDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final SwipeToActionDelegate f86354d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public AnalyticsContext f86355e0;
    public final Object f0;
    public final Object g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final h f86356h0;
    public final Object i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpcomingTransactionTroubleshooterScreen(UpcomingTransactionTroubleshooterScreenContract$InputData.RecurrentPayment inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_recycler_navbar;
        this.V = true;
        this.W = true;
        this.X = new CellDetailsChevronDelegate();
        this.Y = new FullScreenStateDelegate();
        this.Z = new ListSubheaderDelegate();
        this.f86352a0 = new ListSubheaderLoadingDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.f86353b0 = rowDelegate;
        this.c0 = new RowLoadingDelegate();
        this.f86354d0 = new SwipeToActionDelegate(rowDelegate, false);
        String str = inputData.f86358b;
        FaqNodeBase faqNodeBase = inputData.f86357a;
        this.f86355e0 = l7d.a.d(4, str, faqNodeBase != null ? faqNodeBase.getF51434a() : null);
        final int i = 0;
        this.f0 = w.y0(new Function0(this) { // from class: f9d.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpcomingTransactionTroubleshooterScreen f132919b;

            {
                this.f132919b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                UpcomingTransactionTroubleshooterScreen upcomingTransactionTroubleshooterScreen = this.f132919b;
                switch (i2) {
                    case 0:
                        return v.k(upcomingTransactionTroubleshooterScreen.X, upcomingTransactionTroubleshooterScreen.Y, upcomingTransactionTroubleshooterScreen.Z, upcomingTransactionTroubleshooterScreen.f86352a0, upcomingTransactionTroubleshooterScreen.f86353b0, upcomingTransactionTroubleshooterScreen.c0, upcomingTransactionTroubleshooterScreen.f86354d0);
                    default:
                        KProperty[] kPropertyArr = UpcomingTransactionTroubleshooterScreen.j0;
                        return (m) ((z) upcomingTransactionTroubleshooterScreen.g0.getValue()).d.get();
                }
            }
        });
        this.g0 = w.y0(new eq8.b(this, inputData, 27));
        this.f86356h0 = s.t(this, f9d.b.f);
        final int i2 = 1;
        this.i0 = w.y0(new Function0(this) { // from class: f9d.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpcomingTransactionTroubleshooterScreen f132919b;

            {
                this.f132919b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                UpcomingTransactionTroubleshooterScreen upcomingTransactionTroubleshooterScreen = this.f132919b;
                switch (i22) {
                    case 0:
                        return v.k(upcomingTransactionTroubleshooterScreen.X, upcomingTransactionTroubleshooterScreen.Y, upcomingTransactionTroubleshooterScreen.Z, upcomingTransactionTroubleshooterScreen.f86352a0, upcomingTransactionTroubleshooterScreen.f86353b0, upcomingTransactionTroubleshooterScreen.c0, upcomingTransactionTroubleshooterScreen.f86354d0);
                    default:
                        KProperty[] kPropertyArr = UpcomingTransactionTroubleshooterScreen.j0;
                        return (m) ((z) upcomingTransactionTroubleshooterScreen.g0.getValue()).d.get();
                }
            }
        });
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.f86355e0 = analyticsContext;
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getM() {
        return this.f86355e0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (z) this.g0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (m) this.i0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174539b.f59410q), null, new ev7.b(this, continuation, 19), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174539b.o.f57403b), null, new c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f86353b0.f53218h), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.X.f51821c), null, new f9d.e(this, null), 3);
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
    public final List getX() {
        return (List) this.f0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: f3, reason: from getter */
    public final boolean getW() {
        return this.W;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(n uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.help_center_troubleshooting_select_issue, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setMenuItems(uiState.f132933b);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.U;
    }

    public final jii.m h3() {
        ViewBinding value = this.f86356h0.getValue(this, j0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.V);
    }
}
