package com.revolut.feature.payees.impl.ui.payees_select;

import an9.d;
import an9.g;
import an9.i;
import an9.j;
import an9.k;
import an9.l;
import an9.q;
import an9.r;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.RewardLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RewardsGridDelegate;
import com.revolut.core.ui_kit.delegates.RewardsGridLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerBoxDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.payees.impl.ui.payees_select.PayeesSelectScreen;
import com.revolut.feature.security_hub.api.R$string;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payees/impl/ui/payees_select/PayeesSelectScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lan9/q;", "Ldli/a;", "Lan9/s;", "feature_payees_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PayeesSelectScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(PayeesSelectScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int K;
    public final h L;
    public final ActionsDelegate M;
    public final SelectableDelegate N;
    public final RewardsGridDelegate O;
    public final FullScreenStateDelegate P;
    public final ReferralContactDelegate Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public PayeesSelectScreen(PayeesSelectScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_nextbutton;
        this.L = s.t(this, d.f);
        this.M = new ActionsDelegate();
        this.N = new SelectableDelegate(new RowDelegate(null, null, 7));
        this.O = new RewardsGridDelegate();
        this.P = new FullScreenStateDelegate();
        this.Q = new ReferralContactDelegate();
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: an9.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayeesSelectScreen f6581b;

            {
                this.f6581b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = PayeesSelectScreen.U;
                        PayeesSelectScreen payeesSelectScreen = this.f6581b;
                        return dli.f.a(payeesSelectScreen, payeesSelectScreen.d(), zhm.v.k(payeesSelectScreen.M, payeesSelectScreen.N, new ListSubheaderDelegate(), payeesSelectScreen.O, payeesSelectScreen.P, new ScrollerBoxDelegate(zhm.u.c(payeesSelectScreen.Q)), new RewardsGridLoadingDelegate(), new RewardLoadingDelegate(), new RowLoadingDelegate()), 0, null, null, null, 60);
                    default:
                        KProperty[] kPropertyArr2 = PayeesSelectScreen.U;
                        return (r) ((hm9.h) this.f6581b.S.getValue()).f153567c.get();
                }
            }
        });
        this.S = w.y0(new agh.b(this, inputData, 16));
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: an9.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayeesSelectScreen f6581b;

            {
                this.f6581b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PayeesSelectScreen.U;
                        PayeesSelectScreen payeesSelectScreen = this.f6581b;
                        return dli.f.a(payeesSelectScreen, payeesSelectScreen.d(), zhm.v.k(payeesSelectScreen.M, payeesSelectScreen.N, new ListSubheaderDelegate(), payeesSelectScreen.O, payeesSelectScreen.P, new ScrollerBoxDelegate(zhm.u.c(payeesSelectScreen.Q)), new RewardsGridLoadingDelegate(), new RewardLoadingDelegate(), new RowLoadingDelegate()), 0, null, null, null, 60);
                    default:
                        KProperty[] kPropertyArr2 = PayeesSelectScreen.U;
                        return (r) ((hm9.h) this.f6581b.S.getValue()).f153567c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        an9.s uiState = (an9.s) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f6599b);
        d3().f174564b.setText(uiState.f6600c);
        d3().f174565c.setMenuItems(uiState.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (hm9.h) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.security_hub_payees_select_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.security_hub_payees_select_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setSearchButtonActive(true);
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.security_hub_payees_select_search_hint, null, null, 14));
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setEnabled(false);
        largeActionButton.o(LargeActionButton.ButtonStyle.f58725a);
        largeActionButton.setLoadingButtonTag("PAYEES_SELECTION_CTA_LOADING_TAG");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        int i = 0;
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new k(this, continuation, i), 3);
        int i2 = 1;
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new k(this, continuation, i2), 3);
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59409p.f57337m), new j(this, continuation, 2), 3);
        ViewController.P2(this, new a15.d(rd0.e.b(this.M.f51611c.f121375b), 29), new j(this, continuation, 3), 3);
        ViewController.P2(this, new g(vkm.q.J(rd0.e.b(this.O.f53209c.d), rd0.e.b(this.N.r())), 0), new j(this, continuation, 4), 3);
        ViewController.P2(this, rd0.e.b(this.P.f52371h.f121375b), new l(this, null), 3);
        ViewController.P2(this, new i(rd0.e.b(this.Q.q()), i), new j(this, continuation, i), 3);
        ViewController.P2(this, rd0.e.b(d3().f174565c.o.f57403b), new j(this, continuation, i2), 3);
    }

    public final u d3() {
        ViewBinding value = this.L.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final r d() {
        return (r) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.R.getValue();
    }
}
