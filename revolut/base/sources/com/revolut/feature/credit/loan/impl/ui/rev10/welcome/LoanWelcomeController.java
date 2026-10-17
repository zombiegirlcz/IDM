package com.revolut.feature.credit.loan.impl.ui.rev10.welcome;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SimpleMediaDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.loan.impl.ui.rev10.welcome.LoanWelcomeController;
import com.revolut.feature.credit.loan.impl.ui.rev10.welcome.LoanWelcomeControllerContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import tzh.g;
import u45.p0;
import u7k.f0;
import u85.b;
import u85.f;
import u85.i;
import u85.j;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/welcome/LoanWelcomeController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lu85/i;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LoanWelcomeController extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(LoanWelcomeController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final LoanWelcomeControllerContract$InputData K;
    public final h L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final int T;

    public LoanWelcomeController(LoanWelcomeControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: u85.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanWelcomeController f278108b;

            {
                this.f278108b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                LoanWelcomeController loanWelcomeController = this.f278108b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = LoanWelcomeController.U;
                        return (j) ((p0) loanWelcomeController.S.getValue()).f277198h.get();
                    case 1:
                        KProperty[] kPropertyArr2 = LoanWelcomeController.U;
                        return (j60.a) ((p0) loanWelcomeController.S.getValue()).d.get();
                    case 2:
                        KProperty[] kPropertyArr3 = LoanWelcomeController.U;
                        LoanWelcomeController loanWelcomeController2 = this.f278108b;
                        return dli.f.a(loanWelcomeController2, loanWelcomeController2.d(), v.k((TextDelegate) loanWelcomeController2.N.getValue(), (FullScreenStateDelegate) loanWelcomeController2.P.getValue(), new RowDelegate(null, null, 7), new RowLoadingDelegate(), new ListSubheaderDelegate(), new SimpleMediaDelegate(), new CellDetailsDelegate()), 0, null, null, null, 60);
                    default:
                        KProperty[] kPropertyArr4 = LoanWelcomeController.U;
                        u45.h hVar = czi.c.o(loanWelcomeController.m2()).B;
                        LoanWelcomeControllerContract$InputData loanWelcomeControllerContract$InputData = loanWelcomeController.K;
                        loanWelcomeControllerContract$InputData.getClass();
                        return new p0(hVar, loanWelcomeController, loanWelcomeControllerContract$InputData);
                }
            }
        });
        this.N = w.y0(new u6h.h(5));
        this.O = w.y0(new u6h.h(6));
        this.P = w.y0(new u6h.h(7));
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: u85.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanWelcomeController f278108b;

            {
                this.f278108b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                LoanWelcomeController loanWelcomeController = this.f278108b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LoanWelcomeController.U;
                        return (j) ((p0) loanWelcomeController.S.getValue()).f277198h.get();
                    case 1:
                        KProperty[] kPropertyArr2 = LoanWelcomeController.U;
                        return (j60.a) ((p0) loanWelcomeController.S.getValue()).d.get();
                    case 2:
                        KProperty[] kPropertyArr3 = LoanWelcomeController.U;
                        LoanWelcomeController loanWelcomeController2 = this.f278108b;
                        return dli.f.a(loanWelcomeController2, loanWelcomeController2.d(), v.k((TextDelegate) loanWelcomeController2.N.getValue(), (FullScreenStateDelegate) loanWelcomeController2.P.getValue(), new RowDelegate(null, null, 7), new RowLoadingDelegate(), new ListSubheaderDelegate(), new SimpleMediaDelegate(), new CellDetailsDelegate()), 0, null, null, null, 60);
                    default:
                        KProperty[] kPropertyArr4 = LoanWelcomeController.U;
                        u45.h hVar = czi.c.o(loanWelcomeController.m2()).B;
                        LoanWelcomeControllerContract$InputData loanWelcomeControllerContract$InputData = loanWelcomeController.K;
                        loanWelcomeControllerContract$InputData.getClass();
                        return new p0(hVar, loanWelcomeController, loanWelcomeControllerContract$InputData);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: u85.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanWelcomeController f278108b;

            {
                this.f278108b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                LoanWelcomeController loanWelcomeController = this.f278108b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LoanWelcomeController.U;
                        return (j) ((p0) loanWelcomeController.S.getValue()).f277198h.get();
                    case 1:
                        KProperty[] kPropertyArr2 = LoanWelcomeController.U;
                        return (j60.a) ((p0) loanWelcomeController.S.getValue()).d.get();
                    case 2:
                        KProperty[] kPropertyArr3 = LoanWelcomeController.U;
                        LoanWelcomeController loanWelcomeController2 = this.f278108b;
                        return dli.f.a(loanWelcomeController2, loanWelcomeController2.d(), v.k((TextDelegate) loanWelcomeController2.N.getValue(), (FullScreenStateDelegate) loanWelcomeController2.P.getValue(), new RowDelegate(null, null, 7), new RowLoadingDelegate(), new ListSubheaderDelegate(), new SimpleMediaDelegate(), new CellDetailsDelegate()), 0, null, null, null, 60);
                    default:
                        KProperty[] kPropertyArr4 = LoanWelcomeController.U;
                        u45.h hVar = czi.c.o(loanWelcomeController.m2()).B;
                        LoanWelcomeControllerContract$InputData loanWelcomeControllerContract$InputData = loanWelcomeController.K;
                        loanWelcomeControllerContract$InputData.getClass();
                        return new p0(hVar, loanWelcomeController, loanWelcomeControllerContract$InputData);
                }
            }
        });
        final int i5 = 3;
        this.S = w.y0(new Function0(this) { // from class: u85.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanWelcomeController f278108b;

            {
                this.f278108b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                LoanWelcomeController loanWelcomeController = this.f278108b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LoanWelcomeController.U;
                        return (j) ((p0) loanWelcomeController.S.getValue()).f277198h.get();
                    case 1:
                        KProperty[] kPropertyArr2 = LoanWelcomeController.U;
                        return (j60.a) ((p0) loanWelcomeController.S.getValue()).d.get();
                    case 2:
                        KProperty[] kPropertyArr3 = LoanWelcomeController.U;
                        LoanWelcomeController loanWelcomeController2 = this.f278108b;
                        return dli.f.a(loanWelcomeController2, loanWelcomeController2.d(), v.k((TextDelegate) loanWelcomeController2.N.getValue(), (FullScreenStateDelegate) loanWelcomeController2.P.getValue(), new RowDelegate(null, null, 7), new RowLoadingDelegate(), new ListSubheaderDelegate(), new SimpleMediaDelegate(), new CellDetailsDelegate()), 0, null, null, null, 60);
                    default:
                        KProperty[] kPropertyArr4 = LoanWelcomeController.U;
                        u45.h hVar = czi.c.o(loanWelcomeController.m2()).B;
                        LoanWelcomeControllerContract$InputData loanWelcomeControllerContract$InputData = loanWelcomeController.K;
                        loanWelcomeControllerContract$InputData.getClass();
                        return new p0(hVar, loanWelcomeController, loanWelcomeControllerContract$InputData);
                }
            }
        });
        this.T = R$layout.screen_recycler_navbar_nextbutton;
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setTitle(uiState.f278114a, null);
        navBarWithToolbar.setSecondDescriptionText(uiState.f278115b);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        d3().f174564b.setText(uiState.f278116c);
        j jVarD = d();
        h60.b bVar = uiState.d;
        if (bVar != null) {
            jVarD.f278120s.R(bVar);
        } else {
            jVarD.getClass();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (p0) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) this.Q.getValue()).d(v.k((LargeActionButtonDelegate) this.O.getValue(), new CellDetailsDelegate()));
    }

    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v22, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new f(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new f(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, vkm.q.J(new g(rd0.e.b(((LargeActionButtonDelegate) this.O.getValue()).d.f121375b), 5), new g(rd0.e.b(((TextDelegate) this.N.getValue()).d), 6), new g(rd0.e.b(((FullScreenStateDelegate) this.P.getValue()).f52371h.f121375b), 7)), null, new f0(this, null, 4), 3);
    }

    public final u d3() {
        ViewBinding value = this.L.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j d() {
        return (j) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getT() {
        return this.T;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.R.getValue();
    }
}
