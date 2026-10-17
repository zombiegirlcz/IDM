package com.revolut.feature.topup_screen.impl.mcy.mcy_exchange_rate;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.topup_screen.impl.R$string;
import com.revolut.feature.topup_screen.impl.mcy.mcy_exchange_rate.McyExchangeRateScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import efm.r;
import java.util.List;
import jii.k;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import qz8.f;
import r0e.i;
import r0f.b;
import r0f.c;
import r0f.d;
import r0f.g;
import r0f.h;
import r0f.j;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/mcy/mcy_exchange_rate/McyExchangeRateScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lr0f/h;", "Ldli/a;", "Lr0f/j;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class McyExchangeRateScreen extends ViewController<h> implements a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(McyExchangeRateScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final int K;
    public final ao.h L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final List Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public McyExchangeRateScreen(McyExchangeRateScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_action_footer;
        this.L = s.t(this, b.f);
        this.M = w.y0(new f(17));
        Lazy lazyY0 = w.y0(new f(18));
        this.N = lazyY0;
        this.O = w.y0(new f(19));
        this.P = w.y0(new f(20));
        final int i = 0;
        final int i2 = 1;
        this.Q = v.k(new PlainTextDelegate(), (CellDetailsDelegate) lazyY0.getValue());
        this.R = w.y0(new qvf.a(this, inputData, 9));
        this.S = w.y0(new Function0(this) { // from class: r0f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ McyExchangeRateScreen f250786b;

            {
                this.f250786b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = McyExchangeRateScreen.U;
                        return (i) ((qve.j) this.f250786b.R.getValue()).f249601g.get();
                    default:
                        KProperty[] kPropertyArr2 = McyExchangeRateScreen.U;
                        McyExchangeRateScreen mcyExchangeRateScreen = this.f250786b;
                        return dli.f.a(mcyExchangeRateScreen, mcyExchangeRateScreen.R2(), v.k((CellDetailsDelegate) mcyExchangeRateScreen.N.getValue(), (CellDetailsActionDelegate) mcyExchangeRateScreen.P.getValue(), (CellDetailsNoteDelegate) mcyExchangeRateScreen.O.getValue(), (ListCellDelegate) mcyExchangeRateScreen.M.getValue(), new CellDetailsLoadingDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        this.T = w.y0(new Function0(this) { // from class: r0f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ McyExchangeRateScreen f250786b;

            {
                this.f250786b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = McyExchangeRateScreen.U;
                        return (i) ((qve.j) this.f250786b.R.getValue()).f249601g.get();
                    default:
                        KProperty[] kPropertyArr2 = McyExchangeRateScreen.U;
                        McyExchangeRateScreen mcyExchangeRateScreen = this.f250786b;
                        return dli.f.a(mcyExchangeRateScreen, mcyExchangeRateScreen.R2(), v.k((CellDetailsDelegate) mcyExchangeRateScreen.N.getValue(), (CellDetailsActionDelegate) mcyExchangeRateScreen.P.getValue(), (CellDetailsNoteDelegate) mcyExchangeRateScreen.O.getValue(), (ListCellDelegate) mcyExchangeRateScreen.M.getValue(), new CellDetailsLoadingDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        g gVar = uiState.f250794b;
        if (gVar != null) {
            f3().setTitle(gVar.f250789a, null);
            f3().setNavBarDescriptionModel(new com.revolut.core.ui_kit.views.navbar.q(62, gVar.f250790b, null));
            f3().setDescriptionVisible(true);
            f3().setEndImage(new yy0.j(gVar.f250791c));
        }
        d3().f174533b.setModel(uiState.f250795c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (qve.j) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbarF3 = f3();
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.topup_mcy_exchange_rate_title, null, null, 14);
        navBarWithToolbarF3.setToolbarTitle(textLocalisedClause);
        navBarWithToolbarF3.setTitle(textLocalisedClause, null);
        navBarWithToolbarF3.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        ((j60.a) ((qve.j) this.R.getValue()).e.get()).d(this.Q);
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(f3().f59410q), null, new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(((CellDetailsDelegate) this.N.getValue()).d), new d(this, null), 3);
        r rVarFilter = ((CellDetailsActionDelegate) this.P.getValue()).d.filter(new qza.a(9, new i(2)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        ViewController.P2(this, rd0.e.b(rVarFilter), new r0f.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174533b.f), new c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174533b.e), new qp7.g(this, null, 19), 3);
    }

    public final k d3() {
        ViewBinding value = this.L.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final r0f.i R2() {
        return (r0f.i) this.S.getValue();
    }

    public final NavBarWithToolbar f3() {
        NavBarWithToolbar screenRecyclerNavbarActionFooterNavBar = d3().f174534c;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterNavBar, "screenRecyclerNavbarActionFooterNavBar");
        return screenRecyclerNavbarActionFooterNavBar;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.T.getValue();
    }
}
