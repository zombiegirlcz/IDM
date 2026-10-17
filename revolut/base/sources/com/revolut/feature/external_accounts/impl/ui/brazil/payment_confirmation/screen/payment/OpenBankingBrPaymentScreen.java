package com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.screen.payment;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.screen.payment.OpenBankingBrPaymentScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.common.ui.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import dli.a;
import dli.c;
import h30.l;
import jii.t;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lea.b;
import lk6.d;
import lk6.f;
import lk6.g;
import lk6.j;
import lk6.n;
import lk6.r;
import org.jetbrains.annotations.NotNull;
import te0.w;
import tx0.t3;
import vc.s;
import xf6.t2;
import xki.e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/payment_confirmation/screen/payment/OpenBankingBrPaymentScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Llk6/n;", "Ldli/a;", "Llk6/r;", "Companion", "a", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OpenBankingBrPaymentScreen extends ViewController<n> implements a {
    public final h K;
    public final RowDelegate L;
    public final CellDetailsSwitcherDelegate M;
    public final CellDetailsDelegate N;
    public final int O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(OpenBankingBrPaymentScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterTwoButtonsBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.screen.payment.OpenBankingBrPaymentScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public OpenBankingBrPaymentScreen(j inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, d.f);
        this.L = new RowDelegate(null, null, 7);
        this.M = new CellDetailsSwitcherDelegate();
        this.N = new CellDetailsDelegate();
        this.O = R$layout.screen_recycler_navbar_footer_two_buttons;
        this.P = w.y0(new b(this, inputData, 7));
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: lk6.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OpenBankingBrPaymentScreen f196236b;

            {
                this.f196236b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        OpenBankingBrPaymentScreen.Companion companion = OpenBankingBrPaymentScreen.INSTANCE;
                        return (q) ((t2) this.f196236b.P.getValue()).d.get();
                    default:
                        OpenBankingBrPaymentScreen.Companion companion2 = OpenBankingBrPaymentScreen.INSTANCE;
                        OpenBankingBrPaymentScreen openBankingBrPaymentScreen = this.f196236b;
                        return dli.f.a(openBankingBrPaymentScreen, openBankingBrPaymentScreen.d(), zhm.v.k(openBankingBrPaymentScreen.L, new ListCellDelegate(), new ListSubheaderDelegate(), new CellDetailsActionDelegate(), openBankingBrPaymentScreen.M, openBankingBrPaymentScreen.N, new CellDetailsLoadingDelegate(), new RowLoadingDelegate(), new TextDelegate()), R$id.screenRecyclerNavbarFooterTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: lk6.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OpenBankingBrPaymentScreen f196236b;

            {
                this.f196236b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        OpenBankingBrPaymentScreen.Companion companion = OpenBankingBrPaymentScreen.INSTANCE;
                        return (q) ((t2) this.f196236b.P.getValue()).d.get();
                    default:
                        OpenBankingBrPaymentScreen.Companion companion2 = OpenBankingBrPaymentScreen.INSTANCE;
                        OpenBankingBrPaymentScreen openBankingBrPaymentScreen = this.f196236b;
                        return dli.f.a(openBankingBrPaymentScreen, openBankingBrPaymentScreen.d(), zhm.v.k(openBankingBrPaymentScreen.L, new ListCellDelegate(), new ListSubheaderDelegate(), new CellDetailsActionDelegate(), openBankingBrPaymentScreen.M, openBankingBrPaymentScreen.N, new CellDetailsLoadingDelegate(), new RowLoadingDelegate(), new TextDelegate()), R$id.screenRecyclerNavbarFooterTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        r uiState = (r) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        if (uiState.d) {
            t tVarD3 = d3();
            NavBarWithToolbar screenRecyclerNavbarFooterTwoButtonsToolbar = tVarD3.f174562g;
            Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterTwoButtonsToolbar, "screenRecyclerNavbarFooterTwoButtonsToolbar");
            t3 t3Var = t3.TWO_LINES;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            screenRecyclerNavbarFooterTwoButtonsToolbar.I0(t3Var, false);
            LargeActionButton largeActionButton = tVarD3.f174560b;
            LargeActionButton.ButtonStyle.FlatButton flatButton = LargeActionButton.ButtonStyle.f58737s;
            largeActionButton.o(flatButton);
            tVarD3.f.o(flatButton);
            return;
        }
        Clause clause = uiState.f196263b;
        Clause clause2 = uiState.f196264c;
        t tVarD32 = d3();
        if (clause != null) {
            NavBarWithToolbar screenRecyclerNavbarFooterTwoButtonsToolbar2 = tVarD32.f174562g;
            screenRecyclerNavbarFooterTwoButtonsToolbar2.l0();
            Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterTwoButtonsToolbar2, "screenRecyclerNavbarFooterTwoButtonsToolbar");
            screenRecyclerNavbarFooterTwoButtonsToolbar2.setTitle(clause, null);
            screenRecyclerNavbarFooterTwoButtonsToolbar2.setToolbarTitle(clause);
        }
        if (clause2 != null) {
            tVarD32.d.setTextClause(clause2);
        }
        LargeActionButton largeActionButton2 = tVarD32.f174560b;
        LargeActionButton largeActionButton3 = tVarD32.f;
        largeActionButton2.setText(new TextLocalisedClause(R$string.common_action_confirm, null, null, 14));
        tVarD32.f174560b.o(LargeActionButton.ButtonStyle.f58725a);
        l.A(R.string.common_action_reject, null, null, 14, largeActionButton3);
        largeActionButton3.o(LargeActionButton.ButtonStyle.f58726b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (t2) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        t tVarD3 = d3();
        ScreenContentRecyclerView screenRecyclerNavbarFooterTwoButtonsRecyclerView = tVarD3.e;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterTwoButtonsRecyclerView, "screenRecyclerNavbarFooterTwoButtonsRecyclerView");
        knm.b.v(kli.a.k(m2(), 180.0f), screenRecyclerNavbarFooterTwoButtonsRecyclerView);
        tVarD3.f174561c.setBackgroundResource(R$drawable.uikit_bottom_container_gradient);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        t tVarD3 = d3();
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(tVarD3.f174560b.o), new lk6.e(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(tVarD3.f.o), new lk6.e(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.N.e), new f(this, null), 3);
        CellDetailsSwitcherDelegate cellDetailsSwitcherDelegate = this.M;
        ViewController.P2(this, rd0.e.b(cellDetailsSwitcherDelegate.f51912c), new g(this, null), 3);
        ViewController.P2(this, rd0.e.b(cellDetailsSwitcherDelegate.d), new lk6.h(this, null), 3);
    }

    public final t d3() {
        ViewBinding value = this.K.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (t) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final lk6.q d() {
        return (lk6.q) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.R.getValue();
    }
}
