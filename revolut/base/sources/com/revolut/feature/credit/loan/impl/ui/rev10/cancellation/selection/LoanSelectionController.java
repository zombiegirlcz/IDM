package com.revolut.feature.credit.loan.impl.ui.rev10.cancellation.selection;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.loan.impl.ui.rev10.cancellation.selection.LoanSelectionController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import ft.d;
import g53.e;
import g65.b;
import g65.c;
import g65.f;
import g65.g;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import u45.k0;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/cancellation/selection/LoanSelectionController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lg65/f;", "Ldli/a;", "Lg65/h;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LoanSelectionController extends ViewController<f> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(LoanSelectionController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final h K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final int Q;

    public LoanSelectionController(LoanSelectionControllerContract$InputData inputModel) {
        Intrinsics.checkNotNullParameter(inputModel, "inputModel");
        this.K = s.t(this, b.f);
        this.L = w.y0(new e(3));
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: g65.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanSelectionController f140875b;

            {
                this.f140875b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                LoanSelectionController loanSelectionController = this.f140875b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = LoanSelectionController.R;
                        return v.k((RowDelegate) loanSelectionController.L.getValue(), new ListSubheaderDelegate());
                    case 1:
                        KProperty[] kPropertyArr2 = LoanSelectionController.R;
                        return (g) ((k0) loanSelectionController.P.getValue()).f277166c.get();
                    default:
                        KProperty[] kPropertyArr3 = LoanSelectionController.R;
                        LoanSelectionController loanSelectionController2 = this.f140875b;
                        return dli.f.a(loanSelectionController2, (g) loanSelectionController2.N.getValue(), (List) loanSelectionController2.M.getValue(), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: g65.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanSelectionController f140875b;

            {
                this.f140875b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                LoanSelectionController loanSelectionController = this.f140875b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LoanSelectionController.R;
                        return v.k((RowDelegate) loanSelectionController.L.getValue(), new ListSubheaderDelegate());
                    case 1:
                        KProperty[] kPropertyArr2 = LoanSelectionController.R;
                        return (g) ((k0) loanSelectionController.P.getValue()).f277166c.get();
                    default:
                        KProperty[] kPropertyArr3 = LoanSelectionController.R;
                        LoanSelectionController loanSelectionController2 = this.f140875b;
                        return dli.f.a(loanSelectionController2, (g) loanSelectionController2.N.getValue(), (List) loanSelectionController2.M.getValue(), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: g65.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanSelectionController f140875b;

            {
                this.f140875b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                LoanSelectionController loanSelectionController = this.f140875b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LoanSelectionController.R;
                        return v.k((RowDelegate) loanSelectionController.L.getValue(), new ListSubheaderDelegate());
                    case 1:
                        KProperty[] kPropertyArr2 = LoanSelectionController.R;
                        return (g) ((k0) loanSelectionController.P.getValue()).f277166c.get();
                    default:
                        KProperty[] kPropertyArr3 = LoanSelectionController.R;
                        LoanSelectionController loanSelectionController2 = this.f140875b;
                        return dli.f.a(loanSelectionController2, (g) loanSelectionController2.N.getValue(), (List) loanSelectionController2.M.getValue(), 0, null, null, null, 60);
                }
            }
        });
        this.P = w.y0(new fx5.a(this, inputModel, 11));
        this.Q = R$layout.screen_recycler_navbar;
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        g65.h uiState = (g65.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        ViewBinding value = this.K.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setTitle(uiState.f140878a, null);
        navBarWithToolbar.setToolbarTitle(uiState.f140878a);
        navBarWithToolbar.setSecondDescriptionText(uiState.f140879b);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        navBarWithToolbar.setSecondDescriptionVisible(true);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (k0) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (g) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.K.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((m) value).f174539b.f59410q), null, new d(this, null, 26), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.L.getValue()).f53218h), null, new c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
