package com.revolut.feature.paynow.impl.screens.amount;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.n6;
import b7a.b;
import b7a.c;
import b7a.e;
import b7a.i;
import b7a.r;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.feature.paynow.api.R$string;
import com.revolut.feature.paynow.impl.screens.amount.PayNowAmountScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jii.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import te0.w;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/paynow/impl/screens/amount/PayNowAmountScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lb7a/i;", "Ldli/a;", "Lb7a/o;", "Companion", "a", "feature_paynow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PayNowAmountScreen extends ViewController<i> implements a {
    public final int K;
    public final Object L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(PayNowAmountScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.paynow.impl.screens.amount.PayNowAmountScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public PayNowAmountScreen(e inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_action_footer;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: b7a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayNowAmountScreen f12975b;

            {
                this.f12975b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PayNowAmountScreen payNowAmountScreen = this.f12975b;
                switch (i2) {
                    case 0:
                        PayNowAmountScreen.Companion companion = PayNowAmountScreen.INSTANCE;
                        return (r) ((t6a.a) payNowAmountScreen.P.getValue()).e.get();
                    case 1:
                        PayNowAmountScreen.Companion companion2 = PayNowAmountScreen.INSTANCE;
                        qd0.b bVarN = ((t6a.a) payNowAmountScreen.P.getValue()).f268272b.f268274a.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 2:
                        PayNowAmountScreen.Companion companion3 = PayNowAmountScreen.INSTANCE;
                        return new CenteredAmountDelegate(new av8.n(payNowAmountScreen, 29));
                    default:
                        PayNowAmountScreen.Companion companion4 = PayNowAmountScreen.INSTANCE;
                        PayNowAmountScreen payNowAmountScreen2 = this.f12975b;
                        return dli.f.a(payNowAmountScreen2, payNowAmountScreen2.d(), u.c((CenteredAmountDelegate) payNowAmountScreen2.O.getValue()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        this.M = s.t(this, b.f);
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: b7a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayNowAmountScreen f12975b;

            {
                this.f12975b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PayNowAmountScreen payNowAmountScreen = this.f12975b;
                switch (i22) {
                    case 0:
                        PayNowAmountScreen.Companion companion = PayNowAmountScreen.INSTANCE;
                        return (r) ((t6a.a) payNowAmountScreen.P.getValue()).e.get();
                    case 1:
                        PayNowAmountScreen.Companion companion2 = PayNowAmountScreen.INSTANCE;
                        qd0.b bVarN = ((t6a.a) payNowAmountScreen.P.getValue()).f268272b.f268274a.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 2:
                        PayNowAmountScreen.Companion companion3 = PayNowAmountScreen.INSTANCE;
                        return new CenteredAmountDelegate(new av8.n(payNowAmountScreen, 29));
                    default:
                        PayNowAmountScreen.Companion companion4 = PayNowAmountScreen.INSTANCE;
                        PayNowAmountScreen payNowAmountScreen2 = this.f12975b;
                        return dli.f.a(payNowAmountScreen2, payNowAmountScreen2.d(), u.c((CenteredAmountDelegate) payNowAmountScreen2.O.getValue()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: b7a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayNowAmountScreen f12975b;

            {
                this.f12975b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PayNowAmountScreen payNowAmountScreen = this.f12975b;
                switch (i22) {
                    case 0:
                        PayNowAmountScreen.Companion companion = PayNowAmountScreen.INSTANCE;
                        return (r) ((t6a.a) payNowAmountScreen.P.getValue()).e.get();
                    case 1:
                        PayNowAmountScreen.Companion companion2 = PayNowAmountScreen.INSTANCE;
                        qd0.b bVarN = ((t6a.a) payNowAmountScreen.P.getValue()).f268272b.f268274a.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 2:
                        PayNowAmountScreen.Companion companion3 = PayNowAmountScreen.INSTANCE;
                        return new CenteredAmountDelegate(new av8.n(payNowAmountScreen, 29));
                    default:
                        PayNowAmountScreen.Companion companion4 = PayNowAmountScreen.INSTANCE;
                        PayNowAmountScreen payNowAmountScreen2 = this.f12975b;
                        return dli.f.a(payNowAmountScreen2, payNowAmountScreen2.d(), u.c((CenteredAmountDelegate) payNowAmountScreen2.O.getValue()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = w.y0(new at4.b(this, inputData, 22));
        final int i5 = 3;
        this.Q = w.y0(new Function0(this) { // from class: b7a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayNowAmountScreen f12975b;

            {
                this.f12975b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                PayNowAmountScreen payNowAmountScreen = this.f12975b;
                switch (i22) {
                    case 0:
                        PayNowAmountScreen.Companion companion = PayNowAmountScreen.INSTANCE;
                        return (r) ((t6a.a) payNowAmountScreen.P.getValue()).e.get();
                    case 1:
                        PayNowAmountScreen.Companion companion2 = PayNowAmountScreen.INSTANCE;
                        qd0.b bVarN = ((t6a.a) payNowAmountScreen.P.getValue()).f268272b.f268274a.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 2:
                        PayNowAmountScreen.Companion companion3 = PayNowAmountScreen.INSTANCE;
                        return new CenteredAmountDelegate(new av8.n(payNowAmountScreen, 29));
                    default:
                        PayNowAmountScreen.Companion companion4 = PayNowAmountScreen.INSTANCE;
                        PayNowAmountScreen payNowAmountScreen2 = this.f12975b;
                        return dli.f.a(payNowAmountScreen2, payNowAmountScreen2.d(), u.c((CenteredAmountDelegate) payNowAmountScreen2.O.getValue()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        b7a.o uiState = (b7a.o) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174533b.setModel(new aw0.e(true, null, null, new n6(new TextLocalisedClause(R$string.topup_paynow_action_set_amount, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, uiState.f12986b, null, null, 988), null, null, 54));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (t6a.a) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        k kVarD3 = d3();
        kVarD3.f174534c.setToolbarTitle(new TextLocalisedClause(R$string.topup_paynow_action_set_amount, null, null, 14));
        NavBarWithToolbar screenRecyclerNavbarActionFooterNavBar = kVarD3.f174534c;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterNavBar, "screenRecyclerNavbarActionFooterNavBar");
        screenRecyclerNavbarActionFooterNavBar.j0(false);
        screenRecyclerNavbarActionFooterNavBar.setMenuItems(u.c(new TextNavBarMenuItem("LIST_ID_MENU_ITEM_REMOVE", new TextLocalisedClause(R$string.topup_paynow_action_remove, null, null, 14), null, null, 12)));
        screenRecyclerNavbarActionFooterNavBar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(((CenteredAmountDelegate) this.O.getValue()).d.f121375b), new b74.e(this, null, 3), 3);
        ViewController.P2(this, rd0.e.b(d3().f174533b.f), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174534c.f59410q), new c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174534c.o.f57403b), new c(this, null, 2), 3);
    }

    public final k d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final r d() {
        return (r) this.L.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getT() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
