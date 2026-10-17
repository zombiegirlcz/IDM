package com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.cancellation;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import buf.u;
import c65.i;
import c9d.d;
import c9d.f;
import c9d.j;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.model.faq.FaqNodeBase;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.cancellation.SubscriptionCancellationScreen;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.cancellation.SubscriptionCancellationScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jii.m;
import jki.o;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import rd0.e;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/faq/screens/troubleshooter/transactions/cancellation/SubscriptionCancellationScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lc9d/j;", "Lcom/revolut/feature/shared/help_centre/impl/faq/screens/troubleshooter/transactions/cancellation/SubscriptionCancellationScreenContract$InputData;", "Laii/q;", "Lno/k;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SubscriptionCancellationScreen extends BaseRecyclerViewScreen<j, SubscriptionCancellationScreenContract$InputData, q> implements k {
    public static final /* synthetic */ KProperty[] m0 = {o0.f186429a.j(new h0(SubscriptionCancellationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int U;
    public final boolean V;
    public final boolean W;
    public final CellDetailsChevronDelegate X;
    public final FullScreenStateDelegate Y;
    public final LargeActionButtonDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final ListSubheaderDelegate f86325a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final ListSubheaderLoadingDelegate f86326b0;
    public final PlainTextDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final RowDelegate f86327d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final RowLoadingDelegate f86328e0;
    public final SwipeToActionDelegate f0;
    public final TwinHorizontalButtonDelegate g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public AnalyticsContext f86329h0;
    public final Object i0;
    public final Object j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final h f86330k0;
    public final Object l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionCancellationScreen(SubscriptionCancellationScreenContract$InputData.RecurrentPayment inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_recycler_navbar;
        this.V = true;
        this.W = true;
        this.X = new CellDetailsChevronDelegate();
        this.Y = new FullScreenStateDelegate();
        this.Z = new LargeActionButtonDelegate();
        this.f86325a0 = new ListSubheaderDelegate();
        this.f86326b0 = new ListSubheaderLoadingDelegate();
        this.c0 = new PlainTextDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.f86327d0 = rowDelegate;
        this.f86328e0 = new RowLoadingDelegate();
        this.f0 = new SwipeToActionDelegate(rowDelegate, false);
        this.g0 = new TwinHorizontalButtonDelegate();
        String str = inputData.f86331a;
        FaqNodeBase faqNodeBase = inputData.f86332b;
        this.f86329h0 = l7d.a.d(4, str, faqNodeBase != null ? faqNodeBase.getF51434a() : null);
        final int i = 0;
        this.i0 = w.y0(new Function0(this) { // from class: c9d.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SubscriptionCancellationScreen f22353b;

            {
                this.f22353b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SubscriptionCancellationScreen subscriptionCancellationScreen = this.f22353b;
                switch (i2) {
                    case 0:
                        return v.k(subscriptionCancellationScreen.X, subscriptionCancellationScreen.Y, subscriptionCancellationScreen.Z, subscriptionCancellationScreen.f86325a0, subscriptionCancellationScreen.f86326b0, subscriptionCancellationScreen.c0, subscriptionCancellationScreen.f86327d0, subscriptionCancellationScreen.f86328e0, subscriptionCancellationScreen.f0);
                    default:
                        KProperty[] kPropertyArr = SubscriptionCancellationScreen.m0;
                        return (i) ((r7d.v) subscriptionCancellationScreen.j0.getValue()).f252185h.get();
                }
            }
        });
        this.j0 = w.y0(new u(this, inputData, 23));
        this.f86330k0 = s.t(this, c9d.b.f);
        final int i2 = 1;
        this.l0 = w.y0(new Function0(this) { // from class: c9d.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SubscriptionCancellationScreen f22353b;

            {
                this.f22353b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SubscriptionCancellationScreen subscriptionCancellationScreen = this.f22353b;
                switch (i22) {
                    case 0:
                        return v.k(subscriptionCancellationScreen.X, subscriptionCancellationScreen.Y, subscriptionCancellationScreen.Z, subscriptionCancellationScreen.f86325a0, subscriptionCancellationScreen.f86326b0, subscriptionCancellationScreen.c0, subscriptionCancellationScreen.f86327d0, subscriptionCancellationScreen.f86328e0, subscriptionCancellationScreen.f0);
                    default:
                        KProperty[] kPropertyArr = SubscriptionCancellationScreen.m0;
                        return (i) ((r7d.v) subscriptionCancellationScreen.j0.getValue()).f252185h.get();
                }
            }
        });
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.f86329h0 = analyticsContext;
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getO() {
        return this.f86329h0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (r7d.v) this.j0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174539b.f59410q), null, new i(this, continuation, 5), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174539b.o.f57403b), null, new c9d.c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.Z.d.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.c0.f52925c), null, new c9d.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f86327d0.f53218h), null, new f(this, null), 3);
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = this.g0;
        com.revolut.kompot.navigable.a.g2(this, e.b(twinHorizontalButtonDelegate.f53572c.f121375b), null, new c9d.c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(twinHorizontalButtonDelegate.d.f121375b), null, new c9d.c(this, continuation, 2), 3);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        ((j60.a) ((r7d.v) this.j0.getValue()).e.get()).d(zhm.u.c(this.g0));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF0() {
        return (List) this.i0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: f3, reason: from getter */
    public final boolean getV() {
        return this.W;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(j uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        SubscriptionCancellationScreenContract$InputData subscriptionCancellationScreenContract$InputData = (SubscriptionCancellationScreenContract$InputData) this.G;
        if (!(subscriptionCancellationScreenContract$InputData instanceof SubscriptionCancellationScreenContract$InputData.RecurrentPayment)) {
            throw new NoWhenBranchMatchedException();
        }
        TextClause textClause = new TextClause(((SubscriptionCancellationScreenContract$InputData.RecurrentPayment) subscriptionCancellationScreenContract$InputData).d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        navBarWithToolbar.setToolbarTitle(textClause);
        navBarWithToolbar.setTitle(textClause, null);
        navBarWithToolbar.setMenuItems(uiState.f22360b);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.U;
    }

    public final m h3() {
        ViewBinding value = this.f86330k0.getValue(this, m0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final c9d.i T2() {
        return (c9d.i) this.l0.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.V);
    }
}
