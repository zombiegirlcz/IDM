package com.revolut.feature.security_hub.impl.ui.transactions_limits_change;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.security_hub.api.R$string;
import com.revolut.feature.security_hub.impl.ui.transactions_limits_change.TransactionsLimitsChangeScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import in0.g;
import java.util.List;
import jwc.c;
import jwc.d;
import jwc.j;
import jwc.k;
import jwc.l;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import vtc.a0;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/transactions_limits_change/TransactionsLimitsChangeScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ljwc/j;", "Ldli/a;", "Ljwc/l;", "Lin0/g;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransactionsLimitsChangeScreen extends ViewController<j> implements dli.a, g {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(TransactionsLimitsChangeScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final int K;
    public final h L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final boolean P;
    public final RowDelegate Q;
    public final CellDetailsActionDelegate R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;

    public TransactionsLimitsChangeScreen(TransactionsLimitsChangeScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_footer_nextbutton;
        this.L = s.t(this, c.f);
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: jwc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionsLimitsChangeScreen f178954b;

            {
                this.f178954b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TransactionsLimitsChangeScreen transactionsLimitsChangeScreen = this.f178954b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TransactionsLimitsChangeScreen.W;
                        return transactionsLimitsChangeScreen.d3().f174558c;
                    case 1:
                        KProperty[] kPropertyArr2 = TransactionsLimitsChangeScreen.W;
                        return transactionsLimitsChangeScreen.d3().f174557b;
                    case 2:
                        KProperty[] kPropertyArr3 = TransactionsLimitsChangeScreen.W;
                        return transactionsLimitsChangeScreen.d3().e;
                    case 3:
                        KProperty[] kPropertyArr4 = TransactionsLimitsChangeScreen.W;
                        return new CenteredAmountDelegate(new jnf.d(transactionsLimitsChangeScreen, 18));
                    case 4:
                        KProperty[] kPropertyArr5 = TransactionsLimitsChangeScreen.W;
                        int i3 = R$id.screenRecyclerNavbarFooterNextbutton_recyclerView;
                        TransactionsLimitsChangeScreen transactionsLimitsChangeScreen2 = this.f178954b;
                        return dli.f.a(transactionsLimitsChangeScreen2, transactionsLimitsChangeScreen2.R2(), v.k(transactionsLimitsChangeScreen2.Q, (CenteredAmountDelegate) transactionsLimitsChangeScreen2.S.getValue(), new FullScreenStateDelegate(), new RowLoadingDelegate(), transactionsLimitsChangeScreen2.R), i3, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr6 = TransactionsLimitsChangeScreen.W;
                        return (k) ((a0) transactionsLimitsChangeScreen.U.getValue()).f291950c.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: jwc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionsLimitsChangeScreen f178954b;

            {
                this.f178954b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TransactionsLimitsChangeScreen transactionsLimitsChangeScreen = this.f178954b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransactionsLimitsChangeScreen.W;
                        return transactionsLimitsChangeScreen.d3().f174558c;
                    case 1:
                        KProperty[] kPropertyArr2 = TransactionsLimitsChangeScreen.W;
                        return transactionsLimitsChangeScreen.d3().f174557b;
                    case 2:
                        KProperty[] kPropertyArr3 = TransactionsLimitsChangeScreen.W;
                        return transactionsLimitsChangeScreen.d3().e;
                    case 3:
                        KProperty[] kPropertyArr4 = TransactionsLimitsChangeScreen.W;
                        return new CenteredAmountDelegate(new jnf.d(transactionsLimitsChangeScreen, 18));
                    case 4:
                        KProperty[] kPropertyArr5 = TransactionsLimitsChangeScreen.W;
                        int i3 = R$id.screenRecyclerNavbarFooterNextbutton_recyclerView;
                        TransactionsLimitsChangeScreen transactionsLimitsChangeScreen2 = this.f178954b;
                        return dli.f.a(transactionsLimitsChangeScreen2, transactionsLimitsChangeScreen2.R2(), v.k(transactionsLimitsChangeScreen2.Q, (CenteredAmountDelegate) transactionsLimitsChangeScreen2.S.getValue(), new FullScreenStateDelegate(), new RowLoadingDelegate(), transactionsLimitsChangeScreen2.R), i3, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr6 = TransactionsLimitsChangeScreen.W;
                        return (k) ((a0) transactionsLimitsChangeScreen.U.getValue()).f291950c.get();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: jwc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionsLimitsChangeScreen f178954b;

            {
                this.f178954b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TransactionsLimitsChangeScreen transactionsLimitsChangeScreen = this.f178954b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransactionsLimitsChangeScreen.W;
                        return transactionsLimitsChangeScreen.d3().f174558c;
                    case 1:
                        KProperty[] kPropertyArr2 = TransactionsLimitsChangeScreen.W;
                        return transactionsLimitsChangeScreen.d3().f174557b;
                    case 2:
                        KProperty[] kPropertyArr3 = TransactionsLimitsChangeScreen.W;
                        return transactionsLimitsChangeScreen.d3().e;
                    case 3:
                        KProperty[] kPropertyArr4 = TransactionsLimitsChangeScreen.W;
                        return new CenteredAmountDelegate(new jnf.d(transactionsLimitsChangeScreen, 18));
                    case 4:
                        KProperty[] kPropertyArr5 = TransactionsLimitsChangeScreen.W;
                        int i32 = R$id.screenRecyclerNavbarFooterNextbutton_recyclerView;
                        TransactionsLimitsChangeScreen transactionsLimitsChangeScreen2 = this.f178954b;
                        return dli.f.a(transactionsLimitsChangeScreen2, transactionsLimitsChangeScreen2.R2(), v.k(transactionsLimitsChangeScreen2.Q, (CenteredAmountDelegate) transactionsLimitsChangeScreen2.S.getValue(), new FullScreenStateDelegate(), new RowLoadingDelegate(), transactionsLimitsChangeScreen2.R), i32, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr6 = TransactionsLimitsChangeScreen.W;
                        return (k) ((a0) transactionsLimitsChangeScreen.U.getValue()).f291950c.get();
                }
            }
        });
        this.P = true;
        this.Q = new RowDelegate(null, null, 7);
        this.R = new CellDetailsActionDelegate();
        final int i5 = 3;
        this.S = w.y0(new Function0(this) { // from class: jwc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionsLimitsChangeScreen f178954b;

            {
                this.f178954b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                TransactionsLimitsChangeScreen transactionsLimitsChangeScreen = this.f178954b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransactionsLimitsChangeScreen.W;
                        return transactionsLimitsChangeScreen.d3().f174558c;
                    case 1:
                        KProperty[] kPropertyArr2 = TransactionsLimitsChangeScreen.W;
                        return transactionsLimitsChangeScreen.d3().f174557b;
                    case 2:
                        KProperty[] kPropertyArr3 = TransactionsLimitsChangeScreen.W;
                        return transactionsLimitsChangeScreen.d3().e;
                    case 3:
                        KProperty[] kPropertyArr4 = TransactionsLimitsChangeScreen.W;
                        return new CenteredAmountDelegate(new jnf.d(transactionsLimitsChangeScreen, 18));
                    case 4:
                        KProperty[] kPropertyArr5 = TransactionsLimitsChangeScreen.W;
                        int i32 = R$id.screenRecyclerNavbarFooterNextbutton_recyclerView;
                        TransactionsLimitsChangeScreen transactionsLimitsChangeScreen2 = this.f178954b;
                        return dli.f.a(transactionsLimitsChangeScreen2, transactionsLimitsChangeScreen2.R2(), v.k(transactionsLimitsChangeScreen2.Q, (CenteredAmountDelegate) transactionsLimitsChangeScreen2.S.getValue(), new FullScreenStateDelegate(), new RowLoadingDelegate(), transactionsLimitsChangeScreen2.R), i32, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr6 = TransactionsLimitsChangeScreen.W;
                        return (k) ((a0) transactionsLimitsChangeScreen.U.getValue()).f291950c.get();
                }
            }
        });
        final int i6 = 4;
        this.T = w.y0(new Function0(this) { // from class: jwc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionsLimitsChangeScreen f178954b;

            {
                this.f178954b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                TransactionsLimitsChangeScreen transactionsLimitsChangeScreen = this.f178954b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransactionsLimitsChangeScreen.W;
                        return transactionsLimitsChangeScreen.d3().f174558c;
                    case 1:
                        KProperty[] kPropertyArr2 = TransactionsLimitsChangeScreen.W;
                        return transactionsLimitsChangeScreen.d3().f174557b;
                    case 2:
                        KProperty[] kPropertyArr3 = TransactionsLimitsChangeScreen.W;
                        return transactionsLimitsChangeScreen.d3().e;
                    case 3:
                        KProperty[] kPropertyArr4 = TransactionsLimitsChangeScreen.W;
                        return new CenteredAmountDelegate(new jnf.d(transactionsLimitsChangeScreen, 18));
                    case 4:
                        KProperty[] kPropertyArr5 = TransactionsLimitsChangeScreen.W;
                        int i32 = R$id.screenRecyclerNavbarFooterNextbutton_recyclerView;
                        TransactionsLimitsChangeScreen transactionsLimitsChangeScreen2 = this.f178954b;
                        return dli.f.a(transactionsLimitsChangeScreen2, transactionsLimitsChangeScreen2.R2(), v.k(transactionsLimitsChangeScreen2.Q, (CenteredAmountDelegate) transactionsLimitsChangeScreen2.S.getValue(), new FullScreenStateDelegate(), new RowLoadingDelegate(), transactionsLimitsChangeScreen2.R), i32, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr6 = TransactionsLimitsChangeScreen.W;
                        return (k) ((a0) transactionsLimitsChangeScreen.U.getValue()).f291950c.get();
                }
            }
        });
        this.U = w.y0(new jnf.a(this, inputData, 11));
        final int i21 = 5;
        this.V = w.y0(new Function0(this) { // from class: jwc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionsLimitsChangeScreen f178954b;

            {
                this.f178954b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i21;
                TransactionsLimitsChangeScreen transactionsLimitsChangeScreen = this.f178954b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransactionsLimitsChangeScreen.W;
                        return transactionsLimitsChangeScreen.d3().f174558c;
                    case 1:
                        KProperty[] kPropertyArr2 = TransactionsLimitsChangeScreen.W;
                        return transactionsLimitsChangeScreen.d3().f174557b;
                    case 2:
                        KProperty[] kPropertyArr3 = TransactionsLimitsChangeScreen.W;
                        return transactionsLimitsChangeScreen.d3().e;
                    case 3:
                        KProperty[] kPropertyArr4 = TransactionsLimitsChangeScreen.W;
                        return new CenteredAmountDelegate(new jnf.d(transactionsLimitsChangeScreen, 18));
                    case 4:
                        KProperty[] kPropertyArr5 = TransactionsLimitsChangeScreen.W;
                        int i32 = R$id.screenRecyclerNavbarFooterNextbutton_recyclerView;
                        TransactionsLimitsChangeScreen transactionsLimitsChangeScreen2 = this.f178954b;
                        return dli.f.a(transactionsLimitsChangeScreen2, transactionsLimitsChangeScreen2.R2(), v.k(transactionsLimitsChangeScreen2.Q, (CenteredAmountDelegate) transactionsLimitsChangeScreen2.S.getValue(), new FullScreenStateDelegate(), new RowLoadingDelegate(), transactionsLimitsChangeScreen2.R), i32, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr6 = TransactionsLimitsChangeScreen.W;
                        return (k) ((a0) transactionsLimitsChangeScreen.U.getValue()).f291950c.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        ((LargeActionButton) this.N.getValue()).setEnabled(uiState.f178962b);
        ((FooterTextView) this.M.getValue()).setTextClause(uiState.d);
        ?? r4 = this.O;
        ((NavBarWithToolbar) r4.getValue()).setToolbarTitle(uiState.f178963c);
        List<? extends NavBarMenuItem> list = uiState.e;
        if (list != null) {
            ((NavBarWithToolbar) r4.getValue()).setMenuItems(list);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (a0) this.U.getValue();
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) this.O.getValue();
        NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
        navBarWithToolbar.j0(false);
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        ((LargeActionButton) this.N.getValue()).setText(new TextLocalisedClause(R$string.security_hub_transactions_limits_amount_action, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r62 = this.O;
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(((NavBarWithToolbar) r62.getValue()).f59410q), new d(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(((LargeActionButton) this.N.getValue()).o), new d(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(((NavBarWithToolbar) r62.getValue()).o.f57403b), new jv.o(this, continuation, 4), 3);
        ViewController.P2(this, rd0.e.b(this.R.d), new jwc.e(this, null), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.L.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final k d() {
        return (k) this.V.getValue();
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

    @Override // in0.g
    public final boolean p0() {
        return true;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.P);
    }
}
