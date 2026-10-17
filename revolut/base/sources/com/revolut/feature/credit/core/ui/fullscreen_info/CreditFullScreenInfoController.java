package com.revolut.feature.credit.core.ui.fullscreen_info;

import aii.q;
import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import ax4.f;
import bx4.c;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.credit.core.ui.fullscreen_info.CreditFullScreenInfoController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import ey4.b;
import ey4.d;
import ey4.g;
import grl.k9;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/core/ui/fullscreen_info/CreditFullScreenInfoController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Ley4/b;", "Lbx4/c;", "Lno/m;", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditFullScreenInfoController extends ViewController<q> implements a, c, m {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(CreditFullScreenInfoController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final g K;
    public final AnalyticsProduct.Retail L;
    public final int M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public CreditFullScreenInfoController(g inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.L = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        this.M = R$layout.screen_recycler_navbar_nextbutton;
        this.N = s.t(this, d.f);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: ey4.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditFullScreenInfoController f130568b;

            {
                this.f130568b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CreditFullScreenInfoController creditFullScreenInfoController = this.f130568b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditFullScreenInfoController.R;
                        phm.a aVar = (phm.a) ue0.e.j(creditFullScreenInfoController.m2()).a().get(ax4.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ax4.e.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.credit.core.constructor.api.CreditConstructorComponent");
                        ax4.e eVar = ((ax4.e) objB).e;
                        g gVar = creditFullScreenInfoController.K;
                        gVar.getClass();
                        return new ax4.f(eVar, creditFullScreenInfoController, gVar);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditFullScreenInfoController.R;
                        return (a) ((ax4.f) creditFullScreenInfoController.O.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = CreditFullScreenInfoController.R;
                        CreditFullScreenInfoController creditFullScreenInfoController2 = this.f130568b;
                        return dli.f.a(creditFullScreenInfoController2, (a) creditFullScreenInfoController2.P.getValue(), ((ax4.f) creditFullScreenInfoController2.O.getValue()).c().Q(), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: ey4.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditFullScreenInfoController f130568b;

            {
                this.f130568b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CreditFullScreenInfoController creditFullScreenInfoController = this.f130568b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditFullScreenInfoController.R;
                        phm.a aVar = (phm.a) ue0.e.j(creditFullScreenInfoController.m2()).a().get(ax4.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ax4.e.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.credit.core.constructor.api.CreditConstructorComponent");
                        ax4.e eVar = ((ax4.e) objB).e;
                        g gVar = creditFullScreenInfoController.K;
                        gVar.getClass();
                        return new ax4.f(eVar, creditFullScreenInfoController, gVar);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditFullScreenInfoController.R;
                        return (a) ((ax4.f) creditFullScreenInfoController.O.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = CreditFullScreenInfoController.R;
                        CreditFullScreenInfoController creditFullScreenInfoController2 = this.f130568b;
                        return dli.f.a(creditFullScreenInfoController2, (a) creditFullScreenInfoController2.P.getValue(), ((ax4.f) creditFullScreenInfoController2.O.getValue()).c().Q(), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: ey4.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditFullScreenInfoController f130568b;

            {
                this.f130568b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CreditFullScreenInfoController creditFullScreenInfoController = this.f130568b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditFullScreenInfoController.R;
                        phm.a aVar = (phm.a) ue0.e.j(creditFullScreenInfoController.m2()).a().get(ax4.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ax4.e.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.credit.core.constructor.api.CreditConstructorComponent");
                        ax4.e eVar = ((ax4.e) objB).e;
                        g gVar = creditFullScreenInfoController.K;
                        gVar.getClass();
                        return new ax4.f(eVar, creditFullScreenInfoController, gVar);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditFullScreenInfoController.R;
                        return (a) ((ax4.f) creditFullScreenInfoController.O.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = CreditFullScreenInfoController.R;
                        CreditFullScreenInfoController creditFullScreenInfoController2 = this.f130568b;
                        return dli.f.a(creditFullScreenInfoController2, (a) creditFullScreenInfoController2.P.getValue(), ((ax4.f) creditFullScreenInfoController2.O.getValue()).c().Q(), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        b uiState = (b) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        TextClause textClause = uiState.f130564a;
        Clause clause = uiState.f130566c;
        navBarWithToolbar.setTitle(textClause, null);
        navBarWithToolbar.setToolbarTitle(textClause);
        Clause clause2 = uiState.f130565b;
        navBarWithToolbar.setDescriptionVisible(clause2 != null);
        if (clause2 != null) {
            navBarWithToolbar.setDescriptionText(clause2);
        }
        LargeActionButton goToButton = d3().f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        goToButton.setVisibility(clause == null ? 8 : 0);
        if (clause != null) {
            LargeActionButton goToButton2 = d3().f174564b;
            Intrinsics.checkNotNullExpressionValue(goToButton2, "goToButton");
            goToButton2.setText(clause);
        }
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getP() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (ey4.a) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setTitleAutoSize(false);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new ey4.e(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new ey4.e(this, null, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // bx4.c
    public final ax4.d d() {
        return (ey4.a) this.P.getValue();
    }

    public final u d3() {
        ViewBinding value = this.N.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getF0() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
