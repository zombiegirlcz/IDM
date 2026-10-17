package com.revolut.feature.support.impl.transfer_tracker.ui.inbound_transaction_list;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.support.impl.transfer_tracker.ui.inbound_transaction_list.InboundTransactionListScreen;
import com.revolut.feature.support.impl.transfer_tracker.ui.inbound_transaction_list.a;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import fb6.j;
import fee.c;
import fee.g;
import fee.i;
import fee.l;
import jii.m;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rde.d;
import te0.w;
import tx0.j0;
import tx0.t3;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/support/impl/transfer_tracker/ui/inbound_transaction_list/InboundTransactionListScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lfee/g;", "Ldli/a;", "Lfee/i;", "feature_support_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InboundTransactionListScreen extends ViewController<g> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(InboundTransactionListScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K;
    public final h L;
    public final Object M;
    public final Object N;
    public final RowDelegate O;
    public final FullScreenStateDelegate P;
    public final Object Q;

    public InboundTransactionListScreen(InboundTransactionListScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar;
        this.L = s.t(this, fee.b.f);
        this.M = w.y0(new j(this, inputData, 4));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: fee.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InboundTransactionListScreen f134591b;

            {
                this.f134591b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = InboundTransactionListScreen.R;
                        return (l) ((rde.d) this.f134591b.M.getValue()).f253422c.get();
                    default:
                        KProperty[] kPropertyArr2 = InboundTransactionListScreen.R;
                        InboundTransactionListScreen inboundTransactionListScreen = this.f134591b;
                        return dli.f.a(inboundTransactionListScreen, (l) inboundTransactionListScreen.N.getValue(), v.k(inboundTransactionListScreen.O, new RowLoadingDelegate(), inboundTransactionListScreen.P), 0, null, null, null, 60);
                }
            }
        });
        this.O = new RowDelegate(null, null, 7);
        this.P = new FullScreenStateDelegate();
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: fee.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InboundTransactionListScreen f134591b;

            {
                this.f134591b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InboundTransactionListScreen.R;
                        return (l) ((rde.d) this.f134591b.M.getValue()).f253422c.get();
                    default:
                        KProperty[] kPropertyArr2 = InboundTransactionListScreen.R;
                        InboundTransactionListScreen inboundTransactionListScreen = this.f134591b;
                        return dli.f.a(inboundTransactionListScreen, (l) inboundTransactionListScreen.N.getValue(), v.k(inboundTransactionListScreen.O, new RowLoadingDelegate(), inboundTransactionListScreen.P), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        a aVar = uiState.f134597b;
        if (aVar.equals(a.C0555a.f89410a)) {
            NavBarWithToolbar navBarWithToolbar = d3().f174539b;
            Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
            t3 t3Var = t3.TWO_LINES;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar.I0(t3Var, false);
            Unit unit = Unit.f186387a;
            return;
        }
        if (!(aVar instanceof fee.h)) {
            throw new NoWhenBranchMatchedException();
        }
        NavBarWithToolbar navBarWithToolbar2 = d3().f174539b;
        navBarWithToolbar2.l0();
        fee.h hVar = (fee.h) aVar;
        TextLocalisedClause textLocalisedClause = hVar.f134594a;
        navBarWithToolbar2.setTitle(textLocalisedClause, null);
        navBarWithToolbar2.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar2.setSecondDescriptionText(hVar.f134595b);
        navBarWithToolbar2.setSecondDescriptionVisible(true);
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar2, "apply(...)");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (l) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new ev7.b(this, null, 26), 3);
        ViewController.P2(this, rd0.e.b(this.O.f53218h), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.P.f52371h.f121375b), new fee.d(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
