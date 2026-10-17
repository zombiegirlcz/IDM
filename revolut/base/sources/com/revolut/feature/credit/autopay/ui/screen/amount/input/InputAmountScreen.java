package com.revolut.feature.credit.autopay.ui.screen.amount.input;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.credit.autopay.ui.screen.amount.input.InputAmountScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jk4.c;
import jk4.d;
import jk4.f;
import jk4.i;
import jk4.l;
import jk4.m;
import jm4.i3;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import te0.w;
import vc.s;
import xki.e;
import yhm.j;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/autopay/ui/screen/amount/input/InputAmountScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ljk4/i;", "Ldli/a;", "Ljk4/m;", "Lno/k;", "feature_credit_autopay_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InputAmountScreen extends ViewController<i> implements dli.a, k {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(InputAmountScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final int K;
    public AnalyticsContext L;
    public final Object M;
    public final h N;
    public final Lazy O;
    public final CenteredAmountDelegate P;
    public final FullScreenStateDelegate Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public InputAmountScreen(InputAmountScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_footer_nextbutton;
        this.L = inputData.f68605c;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: jk4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputAmountScreen f175067b;

            {
                this.f175067b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                int i3 = 1;
                InputAmountScreen inputAmountScreen = this.f175067b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InputAmountScreen.U;
                        qd0.b bVarN = ((i3) inputAmountScreen.S.getValue()).f176122b.k.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = InputAmountScreen.U;
                        return new AmountEditDelegate(new b(inputAmountScreen, i3));
                    case 2:
                        KProperty[] kPropertyArr3 = InputAmountScreen.U;
                        InputAmountScreen inputAmountScreen2 = this.f175067b;
                        return dli.f.a(inputAmountScreen2, inputAmountScreen2.e3(), v.k((AmountEditDelegate) inputAmountScreen2.O.getValue(), new TextDelegate(), inputAmountScreen2.P, inputAmountScreen2.Q), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = InputAmountScreen.U;
                        return (j) ((i3) inputAmountScreen.S.getValue()).d.get();
                }
            }
        });
        this.N = s.t(this, c.f);
        final int i2 = 1;
        this.O = j.b(new Function0(this) { // from class: jk4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputAmountScreen f175067b;

            {
                this.f175067b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                int i3 = 1;
                InputAmountScreen inputAmountScreen = this.f175067b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InputAmountScreen.U;
                        qd0.b bVarN = ((i3) inputAmountScreen.S.getValue()).f176122b.k.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = InputAmountScreen.U;
                        return new AmountEditDelegate(new b(inputAmountScreen, i3));
                    case 2:
                        KProperty[] kPropertyArr3 = InputAmountScreen.U;
                        InputAmountScreen inputAmountScreen2 = this.f175067b;
                        return dli.f.a(inputAmountScreen2, inputAmountScreen2.e3(), v.k((AmountEditDelegate) inputAmountScreen2.O.getValue(), new TextDelegate(), inputAmountScreen2.P, inputAmountScreen2.Q), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = InputAmountScreen.U;
                        return (j) ((i3) inputAmountScreen.S.getValue()).d.get();
                }
            }
        });
        this.P = new CenteredAmountDelegate(new jk4.b(this, 0));
        this.Q = new FullScreenStateDelegate();
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: jk4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputAmountScreen f175067b;

            {
                this.f175067b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                int i32 = 1;
                InputAmountScreen inputAmountScreen = this.f175067b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InputAmountScreen.U;
                        qd0.b bVarN = ((i3) inputAmountScreen.S.getValue()).f176122b.k.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = InputAmountScreen.U;
                        return new AmountEditDelegate(new b(inputAmountScreen, i32));
                    case 2:
                        KProperty[] kPropertyArr3 = InputAmountScreen.U;
                        InputAmountScreen inputAmountScreen2 = this.f175067b;
                        return dli.f.a(inputAmountScreen2, inputAmountScreen2.e3(), v.k((AmountEditDelegate) inputAmountScreen2.O.getValue(), new TextDelegate(), inputAmountScreen2.P, inputAmountScreen2.Q), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = InputAmountScreen.U;
                        return (j) ((i3) inputAmountScreen.S.getValue()).d.get();
                }
            }
        });
        this.S = w.y0(new j68.a(this, inputData, 24));
        final int i5 = 3;
        this.T = w.y0(new Function0(this) { // from class: jk4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputAmountScreen f175067b;

            {
                this.f175067b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                int i32 = 1;
                InputAmountScreen inputAmountScreen = this.f175067b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InputAmountScreen.U;
                        qd0.b bVarN = ((i3) inputAmountScreen.S.getValue()).f176122b.k.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = InputAmountScreen.U;
                        return new AmountEditDelegate(new b(inputAmountScreen, i32));
                    case 2:
                        KProperty[] kPropertyArr3 = InputAmountScreen.U;
                        InputAmountScreen inputAmountScreen2 = this.f175067b;
                        return dli.f.a(inputAmountScreen2, inputAmountScreen2.e3(), v.k((AmountEditDelegate) inputAmountScreen2.O.getValue(), new TextDelegate(), inputAmountScreen2.P, inputAmountScreen2.Q), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = InputAmountScreen.U;
                        return (j) ((i3) inputAmountScreen.S.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar screenRecyclerNavbarFooterNextbuttonToolbar = d3().e;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonToolbar, "screenRecyclerNavbarFooterNextbuttonToolbar");
        l lVar = uiState.f175078a;
        NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
        screenRecyclerNavbarFooterNextbuttonToolbar.j0(false);
        screenRecyclerNavbarFooterNextbuttonToolbar.setTitle(null, null);
        screenRecyclerNavbarFooterNextbuttonToolbar.setToolbarTitle(lVar.f175077a);
        LargeActionButton screenRecyclerNavbarFooterNextbuttonButton = d3().f174557b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonButton, "screenRecyclerNavbarFooterNextbuttonButton");
        jk4.k kVar = uiState.d;
        knm.b.z(screenRecyclerNavbarFooterNextbuttonButton, true, null, 14);
        screenRecyclerNavbarFooterNextbuttonButton.setEnabled(kVar.f175075a);
        screenRecyclerNavbarFooterNextbuttonButton.setText(kVar.f175076b);
        FooterTextView screenRecyclerNavbarFooterNextbuttonFooterView = d3().f174558c;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonFooterView, "screenRecyclerNavbarFooterNextbuttonFooterView");
        Clause clause = uiState.f175080c;
        knm.b.z(screenRecyclerNavbarFooterNextbuttonFooterView, true, null, 14);
        screenRecyclerNavbarFooterNextbuttonFooterView.setTextClause(clause);
        d3().d.setNestedScrollingEnabled(false);
        d3().d.setOverScrollMode(2);
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.L = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i3) this.S.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getM() {
        return this.L;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().e.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.f59410q), null, new d(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174557b.o), null, new d(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.f52371h.f121375b), null, new jk4.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.e.f121375b), null, new f(this, null), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.N.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final jk4.j d() {
        return (jk4.j) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
