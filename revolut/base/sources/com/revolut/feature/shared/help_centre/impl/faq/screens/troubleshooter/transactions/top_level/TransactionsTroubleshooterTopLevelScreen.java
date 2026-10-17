package com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.top_level;

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
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.top_level.TransactionsTroubleshooterTopLevelScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import e0b.c;
import e58.d;
import e9d.e;
import e9d.f;
import e9d.g;
import e9d.i;
import e9d.j;
import e9d.s;
import e9d.t;
import e9d.u;
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
import r7d.y;
import sji.b;
import te0.w;
import tx0.j0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/faq/screens/troubleshooter/transactions/top_level/TransactionsTroubleshooterTopLevelScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Le9d/u;", "Lcom/revolut/feature/shared/help_centre/impl/faq/screens/troubleshooter/transactions/top_level/TransactionsTroubleshooterTopLevelScreenContract$InputData;", "Le9d/s;", "Lno/k;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransactionsTroubleshooterTopLevelScreen extends BaseRecyclerViewScreen<u, TransactionsTroubleshooterTopLevelScreenContract$InputData, s> implements k {

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f86343k0 = {o0.f186429a.j(new h0(TransactionsTroubleshooterTopLevelScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int U;
    public final boolean V;
    public final boolean W;
    public final h X;
    public final CellDetailsChevronDelegate Y;
    public final FullScreenStateDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final LargeActionButtonDelegate f86344a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final ListSubheaderDelegate f86345b0;
    public final ListSubheaderLoadingDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final RowDelegate f86346d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final RowLoadingDelegate f86347e0;
    public final SwipeToActionDelegate f0;
    public final Object g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Object f86348h0;
    public final Object i0;
    public AnalyticsContext j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionsTroubleshooterTopLevelScreen(TransactionsTroubleshooterTopLevelScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_recycler_navbar;
        this.V = true;
        this.W = true;
        this.X = vc.s.t(this, e.f);
        this.Y = new CellDetailsChevronDelegate();
        this.Z = new FullScreenStateDelegate();
        this.f86344a0 = new LargeActionButtonDelegate();
        this.f86345b0 = new ListSubheaderDelegate();
        this.c0 = new ListSubheaderLoadingDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.f86346d0 = rowDelegate;
        this.f86347e0 = new RowLoadingDelegate();
        this.f0 = new SwipeToActionDelegate(rowDelegate, false);
        final int i = 0;
        this.g0 = w.y0(new Function0(this) { // from class: e9d.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionsTroubleshooterTopLevelScreen f123952b;

            {
                this.f123952b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TransactionsTroubleshooterTopLevelScreen transactionsTroubleshooterTopLevelScreen = this.f123952b;
                switch (i2) {
                    case 0:
                        return zhm.v.k(transactionsTroubleshooterTopLevelScreen.Y, transactionsTroubleshooterTopLevelScreen.Z, transactionsTroubleshooterTopLevelScreen.f86344a0, transactionsTroubleshooterTopLevelScreen.f86345b0, transactionsTroubleshooterTopLevelScreen.c0, transactionsTroubleshooterTopLevelScreen.f86346d0, transactionsTroubleshooterTopLevelScreen.f86347e0, transactionsTroubleshooterTopLevelScreen.f0);
                    default:
                        KProperty[] kPropertyArr = TransactionsTroubleshooterTopLevelScreen.f86343k0;
                        return (t) ((r7d.y) transactionsTroubleshooterTopLevelScreen.f86348h0.getValue()).f252194c.get();
                }
            }
        });
        this.f86348h0 = w.y0(new d(this, inputData, 9));
        final int i2 = 1;
        this.i0 = w.y0(new Function0(this) { // from class: e9d.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionsTroubleshooterTopLevelScreen f123952b;

            {
                this.f123952b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TransactionsTroubleshooterTopLevelScreen transactionsTroubleshooterTopLevelScreen = this.f123952b;
                switch (i22) {
                    case 0:
                        return zhm.v.k(transactionsTroubleshooterTopLevelScreen.Y, transactionsTroubleshooterTopLevelScreen.Z, transactionsTroubleshooterTopLevelScreen.f86344a0, transactionsTroubleshooterTopLevelScreen.f86345b0, transactionsTroubleshooterTopLevelScreen.c0, transactionsTroubleshooterTopLevelScreen.f86346d0, transactionsTroubleshooterTopLevelScreen.f86347e0, transactionsTroubleshooterTopLevelScreen.f0);
                    default:
                        KProperty[] kPropertyArr = TransactionsTroubleshooterTopLevelScreen.f86343k0;
                        return (t) ((r7d.y) transactionsTroubleshooterTopLevelScreen.f86348h0.getValue()).f252194c.get();
                }
            }
        });
        this.j0 = a.b(inputData.f86349a);
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.j0 = analyticsContext;
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getM() {
        return this.j0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (y) this.f86348h0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithToolbar.f59410q), null, new f(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithToolbar.o.f57403b), null, new c(this, continuation, 28), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithToolbar.v0()), null, new f(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Y.f51821c), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.f86344a0.d.f121375b), null, new e9d.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.f86345b0.f52707c), null, new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.f86346d0.f53218h), null, new j(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(q.k(q2())));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.f59417v0 = false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getY() {
        return (List) this.g0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: f3, reason: from getter */
    public final boolean getW() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(u uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        navBarWithToolbar.setTitle(uiState.f123964a, null);
        navBarWithToolbar.setMenuItems(uiState.f123966c);
        TextLocalisedClause textLocalisedClause = uiState.d;
        navBarWithToolbar.setSearchButtonActive(true);
        navBarWithToolbar.setHint(textLocalisedClause);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.U;
    }

    public final m h3() {
        ViewBinding value = this.X.getValue(this, f86343k0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final t T2() {
        return (t) this.i0.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.W);
    }
}
