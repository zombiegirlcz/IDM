package com.revolut.feature.payments.who_to_transfer.impl.transfer.new_transfer;

import aii.q;
import android.content.Context;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.IconDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SearchButtonDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.payments.who_to_transfer.impl.R$string;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.new_transfer.NewTransferScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.a;
import k4a.e;
import k4a.f;
import k4a.g;
import k4a.i;
import k4a.j;
import k4a.l;
import k4a.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import s3a.c;
import te0.w;
import vc.s;
import zhm.d0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/transfer/new_transfer/NewTransferScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lk4a/m;", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NewTransferScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(NewTransferScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K;
    public final h L;
    public final SearchButtonDelegate M;
    public final Integer N;
    public final Object O;
    public final Object P;
    public final RowDelegate Q;
    public final SmallActionButtonDelegate R;
    public final IconDelegate S;
    public final Object T;

    public NewTransferScreen(NewTransferScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar;
        this.L = s.t(this, e.f);
        this.M = new SearchButtonDelegate();
        this.N = inputData.f80121c ? Integer.valueOf(R$style.UiKitTheme_TransparentSlider) : null;
        this.O = w.y0(new jnf.a(this, inputData, 26));
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: k4a.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewTransferScreen f180870b;

            {
                this.f180870b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = NewTransferScreen.U;
                        return (l) ((s3a.c) this.f180870b.O.getValue()).f259500w.get();
                    default:
                        KProperty[] kPropertyArr2 = NewTransferScreen.U;
                        NewTransferScreen newTransferScreen = this.f180870b;
                        return dli.f.a(newTransferScreen, newTransferScreen.d(), d0.E0(((fd6.a) ((s3a.c) newTransferScreen.O.getValue()).d.get()).e, zhm.v.k(new ListSubheaderDelegate(), newTransferScreen.Q, newTransferScreen.R, newTransferScreen.M, new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), newTransferScreen.S)), R$id.recyclerView, new k0d.c(newTransferScreen, 18), null, null, 48);
                }
            }
        });
        this.Q = new RowDelegate(null, null, 7);
        this.R = new SmallActionButtonDelegate();
        this.S = new IconDelegate();
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: k4a.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewTransferScreen f180870b;

            {
                this.f180870b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = NewTransferScreen.U;
                        return (l) ((s3a.c) this.f180870b.O.getValue()).f259500w.get();
                    default:
                        KProperty[] kPropertyArr2 = NewTransferScreen.U;
                        NewTransferScreen newTransferScreen = this.f180870b;
                        return dli.f.a(newTransferScreen, newTransferScreen.d(), d0.E0(((fd6.a) ((s3a.c) newTransferScreen.O.getValue()).d.get()).e, zhm.v.k(new ListSubheaderDelegate(), newTransferScreen.Q, newTransferScreen.R, newTransferScreen.M, new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), newTransferScreen.S)), R$id.recyclerView, new k0d.c(newTransferScreen, 18), null, null, 48);
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2, reason: from getter */
    public final Integer getN() {
        return this.N;
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Clause clause = uiState.f180876a;
        navBarWithToolbar.setSecondDescriptionVisible(clause != null);
        navBarWithToolbar.setSecondDescriptionText(clause);
        navBarWithToolbar.setMenuItems(uiState.f180878c);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final void J() {
        super.J();
        m2();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (c) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final void W() {
        super.W();
        m2();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.payments_new_transfer_title, null, null, 14);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        d3().f174539b.setToolbarTitle(textLocalisedClause);
        ScreenContentRecyclerView screenContentRecyclerView = d3().f174540c;
        ScreenContentRecyclerView recyclerView = d3().f174540c;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        ((c) this.O.getValue()).getClass();
        k4a.c itemMatcher = new k4a.c();
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(itemMatcher, "itemMatcher");
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        screenContentRecyclerView.addItemDecoration(new k4a.a(itemMatcher, recyclerView, kli.a.k(context, 16.0f)));
        d3().f174540c.setTag("NewTransferScreen_RecyclerView");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        SearchButtonDelegate searchButtonDelegate = this.M;
        ViewController.P2(this, rd0.e.b(searchButtonDelegate.f53283c.f121375b), new f(this, null), 3);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setSearchButtonActive(false);
        navBarWithToolbar.setDescriptionVisible(false);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.f59410q), new k22.c(this, null, 4), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f53218h), new g(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.S.p()), new k4a.h(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.R.f53336c.f121375b), new i(this, null), 3);
        ViewController.P2(this, rd0.e.b(searchButtonDelegate.d.f121375b), new j(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.o.f57403b), new j(this, null, 1), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.L.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final l d() {
        return (l) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.T.getValue();
    }
}
