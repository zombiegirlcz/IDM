package com.revolut.feature.credit.application.plugins.impl.ui.preapplication;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.i;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.credit.application.plugins.impl.R$id;
import com.revolut.feature.credit.application.plugins.impl.R$layout;
import com.revolut.feature.credit.application.plugins.impl.ui.preapplication.PreApplicationChecksScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.preapplication.PreApplicationChecksScreenContract$InputData;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.navigable.vc.ViewController;
import dw3.b1;
import dw3.c1;
import dw3.e5;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import re3.d;
import rg4.j;
import rg4.k;
import rg4.l;
import rg4.m;
import rg4.r;
import rg4.t;
import te0.w;
import tki.c;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/preapplication/PreApplicationChecksScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lrg4/r;", "Ltki/c;", "Lrg4/t;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PreApplicationChecksScreen extends ViewController<r> implements c {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(PreApplicationChecksScreen.class, "binding", "getBinding()Lcom/revolut/feature/credit/application/plugins/impl/databinding/ScreenPreApplicationChecksBinding;", 0))};
    public final PreApplicationChecksScreenContract$InputData K;
    public final h L;
    public final Object M;
    public final Object N;
    public final int O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public PreApplicationChecksScreen(PreApplicationChecksScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, j.f);
        this.M = w.y0(new d(5));
        this.N = w.y0(new d(6));
        this.O = R$layout.screen_pre_application_checks;
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: rg4.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreApplicationChecksScreen f254026b;

            {
                this.f254026b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PreApplicationChecksScreen preApplicationChecksScreen = this.f254026b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PreApplicationChecksScreen.S;
                        qji.b bVarU2 = preApplicationChecksScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.preapplication.di.PreApplicationChecksScreenComponentInjector");
                        b1 b1Var = (b1) ((i54.a) bVarU2);
                        c1 c1Var = b1Var.f118318b;
                        b1 b1Var2 = b1Var.f118319c;
                        PreApplicationChecksScreenContract$InputData preApplicationChecksScreenContract$InputData = preApplicationChecksScreen.K;
                        preApplicationChecksScreenContract$InputData.getClass();
                        mki.b bVarQ2 = preApplicationChecksScreen.q2();
                        bVarQ2.getClass();
                        return new e5(c1Var, b1Var2, preApplicationChecksScreenContract$InputData, bVarQ2);
                    case 1:
                        KProperty[] kPropertyArr2 = PreApplicationChecksScreen.S;
                        return (s) ((e5) preApplicationChecksScreen.P.getValue()).f118648c.get();
                    default:
                        KProperty[] kPropertyArr3 = PreApplicationChecksScreen.S;
                        PreApplicationChecksScreen preApplicationChecksScreen2 = this.f254026b;
                        return tki.g.a(preApplicationChecksScreen2, preApplicationChecksScreen2.R2(), zhm.v.k(new RowLoadingDelegate(), new ListSubheaderDelegate(), (RowDelegate) preApplicationChecksScreen2.M.getValue(), (FullScreenStateDelegate) preApplicationChecksScreen2.N.getValue()), R$id.preApplicationChecks_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: rg4.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreApplicationChecksScreen f254026b;

            {
                this.f254026b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PreApplicationChecksScreen preApplicationChecksScreen = this.f254026b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PreApplicationChecksScreen.S;
                        qji.b bVarU2 = preApplicationChecksScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.preapplication.di.PreApplicationChecksScreenComponentInjector");
                        b1 b1Var = (b1) ((i54.a) bVarU2);
                        c1 c1Var = b1Var.f118318b;
                        b1 b1Var2 = b1Var.f118319c;
                        PreApplicationChecksScreenContract$InputData preApplicationChecksScreenContract$InputData = preApplicationChecksScreen.K;
                        preApplicationChecksScreenContract$InputData.getClass();
                        mki.b bVarQ2 = preApplicationChecksScreen.q2();
                        bVarQ2.getClass();
                        return new e5(c1Var, b1Var2, preApplicationChecksScreenContract$InputData, bVarQ2);
                    case 1:
                        KProperty[] kPropertyArr2 = PreApplicationChecksScreen.S;
                        return (s) ((e5) preApplicationChecksScreen.P.getValue()).f118648c.get();
                    default:
                        KProperty[] kPropertyArr3 = PreApplicationChecksScreen.S;
                        PreApplicationChecksScreen preApplicationChecksScreen2 = this.f254026b;
                        return tki.g.a(preApplicationChecksScreen2, preApplicationChecksScreen2.R2(), zhm.v.k(new RowLoadingDelegate(), new ListSubheaderDelegate(), (RowDelegate) preApplicationChecksScreen2.M.getValue(), (FullScreenStateDelegate) preApplicationChecksScreen2.N.getValue()), R$id.preApplicationChecks_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: rg4.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreApplicationChecksScreen f254026b;

            {
                this.f254026b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PreApplicationChecksScreen preApplicationChecksScreen = this.f254026b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PreApplicationChecksScreen.S;
                        qji.b bVarU2 = preApplicationChecksScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.preapplication.di.PreApplicationChecksScreenComponentInjector");
                        b1 b1Var = (b1) ((i54.a) bVarU2);
                        c1 c1Var = b1Var.f118318b;
                        b1 b1Var2 = b1Var.f118319c;
                        PreApplicationChecksScreenContract$InputData preApplicationChecksScreenContract$InputData = preApplicationChecksScreen.K;
                        preApplicationChecksScreenContract$InputData.getClass();
                        mki.b bVarQ2 = preApplicationChecksScreen.q2();
                        bVarQ2.getClass();
                        return new e5(c1Var, b1Var2, preApplicationChecksScreenContract$InputData, bVarQ2);
                    case 1:
                        KProperty[] kPropertyArr2 = PreApplicationChecksScreen.S;
                        return (s) ((e5) preApplicationChecksScreen.P.getValue()).f118648c.get();
                    default:
                        KProperty[] kPropertyArr3 = PreApplicationChecksScreen.S;
                        PreApplicationChecksScreen preApplicationChecksScreen2 = this.f254026b;
                        return tki.g.a(preApplicationChecksScreen2, preApplicationChecksScreen2.R2(), zhm.v.k(new RowLoadingDelegate(), new ListSubheaderDelegate(), (RowDelegate) preApplicationChecksScreen2.M.getValue(), (FullScreenStateDelegate) preApplicationChecksScreen2.N.getValue()), R$id.preApplicationChecks_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        t uiState = (t) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        hx4.c cVar = uiState.f254033b;
        i iVar = uiState.f254034c;
        if (cVar != null) {
            NavBarWithToolbar preApplicationChecksNavBar = d3().f10720c;
            Intrinsics.checkNotNullExpressionValue(preApplicationChecksNavBar, "preApplicationChecksNavBar");
            hx7.i.z(preApplicationChecksNavBar, cVar);
        }
        ActionFooterView preApplicationChecksActionFooterView = d3().f10719b;
        Intrinsics.checkNotNullExpressionValue(preApplicationChecksActionFooterView, "preApplicationChecksActionFooterView");
        preApplicationChecksActionFooterView.setVisibility(iVar != null ? 0 : 8);
        if (iVar != null) {
            ActionFooterView preApplicationChecksActionFooterView2 = d3().f10719b;
            Intrinsics.checkNotNullExpressionValue(preApplicationChecksActionFooterView2, "preApplicationChecksActionFooterView");
            preApplicationChecksActionFooterView2.setModel(iVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (e5) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_pre_application_checks_informative_title, null, null, 14);
        NavBarWithToolbar preApplicationChecksNavBar = d3().f10720c;
        Intrinsics.checkNotNullExpressionValue(preApplicationChecksNavBar, "preApplicationChecksNavBar");
        preApplicationChecksNavBar.setTitle(textLocalisedClause, null);
        d3().f10720c.setToolbarTitle(textLocalisedClause);
    }

    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f10720c.f59410q), new k(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f10719b.f), new k(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f10719b.f58955g), new k(this, null, 2), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.N.getValue()).f52371h.f121375b), new l(this, null), 3);
        ViewController.P2(this, rd0.e.b(((RowDelegate) this.M.getValue()).f53218h), new m(this, null), 3);
    }

    public final aw3.r d3() {
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (aw3.r) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final rg4.s R2() {
        return (rg4.s) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.R.getValue();
    }
}
