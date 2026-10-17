package com.revolut.feature.pix.impl.flow.pix_area.screens.add_trusted_account;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
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
import com.revolut.core.ui_kit.views.navbar.PlusActionNavBarMenuItem;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pix.impl.R$string;
import com.revolut.feature.pix.impl.flow.pix_area.screens.add_trusted_account.PixAddTrustedAccountScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import lt.d;
import maa.f;
import maa.g;
import maa.k;
import maa.m;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/pix_area/screens/add_trusted_account/PixAddTrustedAccountScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lmaa/k;", "Ldli/a;", "Lmaa/m;", "<init>", "()V", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PixAddTrustedAccountScreen extends ViewController<k> implements dli.a {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(PixAddTrustedAccountScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final h K = s.t(this, a.f);
    public final ActionsDelegate L = new ActionsDelegate();
    public final RowDelegate M;
    public final LargeActionButtonDelegate N;
    public final SelectableDelegate O;
    public final RewardsGridDelegate P;
    public final FullScreenStateDelegate Q;
    public final ReferralContactDelegate R;
    public final ScrollerBoxDelegate S;
    public final Object T;
    public final Object U;
    public final int V;
    public final Object W;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, u.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return u.a(p0);
        }
    }

    public PixAddTrustedAccountScreen() {
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.M = rowDelegate;
        this.N = new LargeActionButtonDelegate();
        this.O = new SelectableDelegate(rowDelegate);
        this.P = new RewardsGridDelegate();
        this.Q = new FullScreenStateDelegate();
        ReferralContactDelegate referralContactDelegate = new ReferralContactDelegate();
        this.R = referralContactDelegate;
        this.S = new ScrollerBoxDelegate(zhm.u.c(referralContactDelegate));
        final int i = 0;
        this.T = w.y0(new Function0(this) { // from class: maa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixAddTrustedAccountScreen f203971b;

            {
                this.f203971b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PixAddTrustedAccountScreen pixAddTrustedAccountScreen = this.f203971b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PixAddTrustedAccountScreen.X;
                        return (s) ((p8a.k) pixAddTrustedAccountScreen.U.getValue()).f234003g.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PixAddTrustedAccountScreen.X;
                        qji.b bVarU2 = pixAddTrustedAccountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.pix_area.screens.add_trusted_account.di.PixAddTrustedAccountScreenInjector");
                        p8a.n nVar = (p8a.n) bVarU2;
                        return new p8a.k(nVar.f234031b, nVar.f234032c, pixAddTrustedAccountScreen);
                    default:
                        KProperty[] kPropertyArr3 = PixAddTrustedAccountScreen.X;
                        PixAddTrustedAccountScreen pixAddTrustedAccountScreen2 = this.f203971b;
                        return dli.f.a(pixAddTrustedAccountScreen2, pixAddTrustedAccountScreen2.d(), v.k(pixAddTrustedAccountScreen2.L, pixAddTrustedAccountScreen2.M, pixAddTrustedAccountScreen2.O, new ListSubheaderDelegate(), pixAddTrustedAccountScreen2.P, pixAddTrustedAccountScreen2.Q, pixAddTrustedAccountScreen2.R, pixAddTrustedAccountScreen2.S, new RewardsGridLoadingDelegate(), new RewardLoadingDelegate(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.U = w.y0(new Function0(this) { // from class: maa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixAddTrustedAccountScreen f203971b;

            {
                this.f203971b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PixAddTrustedAccountScreen pixAddTrustedAccountScreen = this.f203971b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PixAddTrustedAccountScreen.X;
                        return (s) ((p8a.k) pixAddTrustedAccountScreen.U.getValue()).f234003g.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PixAddTrustedAccountScreen.X;
                        qji.b bVarU2 = pixAddTrustedAccountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.pix_area.screens.add_trusted_account.di.PixAddTrustedAccountScreenInjector");
                        p8a.n nVar = (p8a.n) bVarU2;
                        return new p8a.k(nVar.f234031b, nVar.f234032c, pixAddTrustedAccountScreen);
                    default:
                        KProperty[] kPropertyArr3 = PixAddTrustedAccountScreen.X;
                        PixAddTrustedAccountScreen pixAddTrustedAccountScreen2 = this.f203971b;
                        return dli.f.a(pixAddTrustedAccountScreen2, pixAddTrustedAccountScreen2.d(), v.k(pixAddTrustedAccountScreen2.L, pixAddTrustedAccountScreen2.M, pixAddTrustedAccountScreen2.O, new ListSubheaderDelegate(), pixAddTrustedAccountScreen2.P, pixAddTrustedAccountScreen2.Q, pixAddTrustedAccountScreen2.R, pixAddTrustedAccountScreen2.S, new RewardsGridLoadingDelegate(), new RewardLoadingDelegate(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.V = R$layout.screen_recycler_navbar_nextbutton;
        final int i3 = 2;
        this.W = w.y0(new Function0(this) { // from class: maa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixAddTrustedAccountScreen f203971b;

            {
                this.f203971b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PixAddTrustedAccountScreen pixAddTrustedAccountScreen = this.f203971b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PixAddTrustedAccountScreen.X;
                        return (s) ((p8a.k) pixAddTrustedAccountScreen.U.getValue()).f234003g.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PixAddTrustedAccountScreen.X;
                        qji.b bVarU2 = pixAddTrustedAccountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.pix_area.screens.add_trusted_account.di.PixAddTrustedAccountScreenInjector");
                        p8a.n nVar = (p8a.n) bVarU2;
                        return new p8a.k(nVar.f234031b, nVar.f234032c, pixAddTrustedAccountScreen);
                    default:
                        KProperty[] kPropertyArr3 = PixAddTrustedAccountScreen.X;
                        PixAddTrustedAccountScreen pixAddTrustedAccountScreen2 = this.f203971b;
                        return dli.f.a(pixAddTrustedAccountScreen2, pixAddTrustedAccountScreen2.d(), v.k(pixAddTrustedAccountScreen2.L, pixAddTrustedAccountScreen2.M, pixAddTrustedAccountScreen2.O, new ListSubheaderDelegate(), pixAddTrustedAccountScreen2.P, pixAddTrustedAccountScreen2.Q, pixAddTrustedAccountScreen2.R, pixAddTrustedAccountScreen2.S, new RewardsGridLoadingDelegate(), new RewardLoadingDelegate(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f203984b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (p8a.k) this.U.getValue();
    }

    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.pix_trust_list_description, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.pix_trusted_list_title, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setSearchButtonActive(true);
        navBarWithToolbar.setHints(zhm.u.c(new TextLocalisedClause(R$string.pix_add_trusted_account_search_hint, null, null, 14)));
        navBarWithToolbar.setMenuItems(zhm.u.c(PlusActionNavBarMenuItem.Companion.a(PlusActionNavBarMenuItem.INSTANCE, "ADD_BENEFICIARY_MENU_ITEM_ID", null, 62)));
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setText(new TextLocalisedClause(R$string.pix_add_trusted_account_action_add, null, null, 14));
        largeActionButton.setEnabled(false);
        largeActionButton.o(LargeActionButton.ButtonStyle.f58725a);
        ((j60.a) ((p8a.k) this.U.getValue()).e.get()).d(v.k(this.M, this.N));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        int i = 2;
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new maa.e(this, continuation, i), 3);
        int i2 = 0;
        ViewController.P2(this, new d(rd0.e.b(this.L.f51611c.f121375b), 11), new g(this, continuation, i2), 3);
        int i3 = 1;
        ViewController.P2(this, new an9.g(vkm.q.J(rd0.e.b(this.P.f53209c.d), rd0.e.b(this.O.r())), 17), new g(this, continuation, i3), 3);
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59409p.f57337m), new g(this, continuation, i), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f52371h.f121375b), new maa.h(this, null), 3);
        ViewController.P2(this, new d(rd0.e.b(this.R.q()), 12), new g(this, continuation, 3), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new maa.e(this, continuation, i2), 3);
        ViewController.P2(this, rd0.e.b(this.N.d.f121375b), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174565c.o.f57403b), new maa.e(this, continuation, i3), 3);
    }

    public final u d3() {
        ViewBinding value = this.K.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final maa.s d() {
        return (maa.s) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.V;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.W.getValue();
    }
}
