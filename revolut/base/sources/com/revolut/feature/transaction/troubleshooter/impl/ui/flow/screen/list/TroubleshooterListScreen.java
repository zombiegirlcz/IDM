package com.revolut.feature.transaction.troubleshooter.impl.ui.flow.screen.list;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.transaction.troubleshooter.impl.R$string;
import com.revolut.feature.transaction.troubleshooter.impl.ui.flow.screen.list.TroubleshooterListScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import grl.k9;
import grl.od;
import grl.q6;
import grl.w2;
import grl.x0;
import java.util.List;
import jki.n;
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
import no.m;
import off.d;
import rd0.e;
import te0.w;
import tx0.j0;
import vc.s;
import yff.b;
import yff.c;
import yff.f;
import yff.h;
import yff.j;
import yff.l;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/transaction/troubleshooter/impl/ui/flow/screen/list/TroubleshooterListScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lyff/l;", "Lcom/revolut/feature/transaction/troubleshooter/impl/ui/flow/screen/list/TroubleshooterListScreenContract$InputData;", "Lyff/h;", "Lno/k;", "Lno/m;", "feature_troubleshooter_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TroubleshooterListScreen extends BaseRecyclerViewScreen<l, TroubleshooterListScreenContract$InputData, h> implements k, m {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f91887h0 = {o0.f186429a.j(new h0(TroubleshooterListScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final ao.h U;
    public final FullScreenStateDelegate V;
    public final RowDelegate W;
    public final boolean X;
    public final int Y;
    public final int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final TwinHorizontalButtonDelegate f91888a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f91889b0;
    public AnalyticsContext c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final AnalyticsProduct.Shared f91890d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f91891e0;
    public final Object f0;
    public final Object g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TroubleshooterListScreen(TroubleshooterListScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = s.t(this, c.f);
        this.V = new FullScreenStateDelegate();
        this.W = new RowDelegate(null, null, 7);
        this.X = true;
        this.Y = R$layout.screen_recycler_navbar;
        this.Z = R$id.recyclerView;
        this.f91888a0 = new TwinHorizontalButtonDelegate();
        final int i = 0;
        this.f91889b0 = w.y0(new Function0(this) { // from class: yff.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TroubleshooterListScreen f313333b;

            {
                this.f313333b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TroubleshooterListScreen troubleshooterListScreen = this.f313333b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TroubleshooterListScreen.f91887h0;
                        return (j60.a) ((off.d) troubleshooterListScreen.f0.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TroubleshooterListScreen.f91887h0;
                        return v.k(new RowLoadingDelegate(), troubleshooterListScreen.V, troubleshooterListScreen.W, new CounterTextDelegate());
                    default:
                        KProperty[] kPropertyArr3 = TroubleshooterListScreen.f91887h0;
                        return (j) ((off.d) troubleshooterListScreen.f0.getValue()).f224828g.get();
                }
            }
        });
        this.c0 = a.d(4, inputData.f91892a, inputData.f91894c);
        this.f91890d0 = new AnalyticsProduct.Shared(k9.HelpCenter, x0.HelpCenter, q6.HelpCenter, w2.HelpCenter, od.Terminal);
        final int i2 = 1;
        this.f91891e0 = w.y0(new Function0(this) { // from class: yff.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TroubleshooterListScreen f313333b;

            {
                this.f313333b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TroubleshooterListScreen troubleshooterListScreen = this.f313333b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TroubleshooterListScreen.f91887h0;
                        return (j60.a) ((off.d) troubleshooterListScreen.f0.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TroubleshooterListScreen.f91887h0;
                        return v.k(new RowLoadingDelegate(), troubleshooterListScreen.V, troubleshooterListScreen.W, new CounterTextDelegate());
                    default:
                        KProperty[] kPropertyArr3 = TroubleshooterListScreen.f91887h0;
                        return (j) ((off.d) troubleshooterListScreen.f0.getValue()).f224828g.get();
                }
            }
        });
        this.f0 = w.y0(new b(this, inputData, 0));
        final int i3 = 2;
        this.g0 = w.y0(new Function0(this) { // from class: yff.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TroubleshooterListScreen f313333b;

            {
                this.f313333b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TroubleshooterListScreen troubleshooterListScreen = this.f313333b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TroubleshooterListScreen.f91887h0;
                        return (j60.a) ((off.d) troubleshooterListScreen.f0.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TroubleshooterListScreen.f91887h0;
                        return v.k(new RowLoadingDelegate(), troubleshooterListScreen.V, troubleshooterListScreen.W, new CounterTextDelegate());
                    default:
                        KProperty[] kPropertyArr3 = TroubleshooterListScreen.f91887h0;
                        return (j) ((off.d) troubleshooterListScreen.f0.getValue()).f224828g.get();
                }
            }
        });
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.c0 = analyticsContext;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(jki.m mVar, o oVar) {
        l uiState = (l) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        this.c0 = uiState.f313350c;
        g3().f174539b.setMenuItems(uiState.f313349b);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getO() {
        return this.f91890d0;
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getC0() {
        return this.c0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (d) this.f0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(g3().f174539b.f59410q), null, new yff.d(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(g3().f174539b.o.f57403b), null, new y83.d(this, continuation, 22), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.V.f52371h.f121375b), null, new yff.e(this, null), 3);
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = this.f91888a0;
        com.revolut.kompot.navigable.a.g2(this, e.b(twinHorizontalButtonDelegate.f53572c.f121375b), null, new yff.d(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(twinHorizontalButtonDelegate.d.f121375b), null, new yff.d(this, continuation, 2), 3);
        RowDelegate rowDelegate = this.W;
        com.revolut.kompot.navigable.a.g2(this, h30.l.y(rowDelegate.f53218h, rowDelegate.k, "merge(...)"), null, new f(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = g3().f174539b;
        Clause textLocalisedClause = ((TroubleshooterListScreenContract$InputData) this.G).f91895g;
        if (textLocalisedClause == null) {
            textLocalisedClause = new TextLocalisedClause(R$string.troubleshooter_list_header, null, null, 14);
        }
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setDescriptionVisible(false);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        ((j60.a) this.f91889b0.getValue()).d(u.c(this.f91888a0));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final void Z2(n nVar, o oVar) {
        l uiState = (l) nVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        this.c0 = uiState.f313350c;
        g3().f174539b.setMenuItems(uiState.f313349b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF101877e0() {
        return (List) this.f91891e0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getZ() {
        return this.Z;
    }

    public final jii.m g3() {
        ViewBinding value = this.U.getValue(this, f91887h0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.Y;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: h3, reason: merged with bridge method [inline-methods] */
    public final j T2() {
        return (j) this.g0.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.X);
    }
}
