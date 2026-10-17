package com.revolut.feature.revolutpay.shared.ui.pay_with_any;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.i;
import bec.a0;
import bec.p;
import bec.r;
import bec.u;
import bec.v;
import bec.x;
import bec.y;
import bec.z;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.revolutpay.api.shared.navigation.PayWithAnyControllerDescriptor$InputData;
import com.revolut.feature.revolutpay.shared.R$id;
import com.revolut.feature.revolutpay.shared.R$layout;
import com.revolut.feature.revolutpay.shared.ui.pay_with_any.PayWithAnyScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import h30.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import p7c.k;
import te0.w;
import vc.s;
import wcc.b;
import xki.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/shared/ui/pay_with_any/PayWithAnyScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lbec/p;", "Ldli/a;", "Lbec/s;", "feature_revolut_pay_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PayWithAnyScreen extends ViewController<p> implements dli.a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(PayWithAnyScreen.class, "binding", "getBinding()Lcom/revolut/feature/revolutpay/shared/databinding/ScreenPayWithAnyBinding;", 0))};
    public final int K;
    public final Integer L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final ListSubheaderDelegate Q;
    public final RowDelegate R;
    public final FullScreenStateDelegate S;
    public final LargeActionButtonDelegate T;

    public PayWithAnyScreen(PayWithAnyControllerDescriptor$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_pay_with_any;
        this.L = inputData.f84434h ? Integer.valueOf(R$style.UiKitTheme_Transparent) : null;
        this.M = s.t(this, u.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: bec.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayWithAnyScreen f14812b;

            {
                this.f14812b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PayWithAnyScreen payWithAnyScreen = this.f14812b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PayWithAnyScreen.U;
                        qji.b bVarU2 = payWithAnyScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.revolutpay.shared.ui.pay_with_any.di.PayWithAnyScreenInjector");
                        p7c.j jVar = (p7c.j) bVarU2;
                        return new p7c.k(jVar.f233625b, jVar.f233626c);
                    case 1:
                        KProperty[] kPropertyArr2 = PayWithAnyScreen.U;
                        return (q) ((p7c.k) payWithAnyScreen.N.getValue()).f233634c.get();
                    default:
                        KProperty[] kPropertyArr3 = PayWithAnyScreen.U;
                        PayWithAnyScreen payWithAnyScreen2 = this.f14812b;
                        return dli.f.a(payWithAnyScreen2, payWithAnyScreen2.d(), zhm.d0.E0(((fd6.a) ((h9c.b) ((p7c.k) payWithAnyScreen2.N.getValue()).f233633b.i.get()).d.getValue()).e, zhm.v.k(payWithAnyScreen2.Q, payWithAnyScreen2.R, payWithAnyScreen2.S, new RowLoadingDelegate(), payWithAnyScreen2.T)), R$id.payWithAny_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: bec.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayWithAnyScreen f14812b;

            {
                this.f14812b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PayWithAnyScreen payWithAnyScreen = this.f14812b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PayWithAnyScreen.U;
                        qji.b bVarU2 = payWithAnyScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.revolutpay.shared.ui.pay_with_any.di.PayWithAnyScreenInjector");
                        p7c.j jVar = (p7c.j) bVarU2;
                        return new p7c.k(jVar.f233625b, jVar.f233626c);
                    case 1:
                        KProperty[] kPropertyArr2 = PayWithAnyScreen.U;
                        return (q) ((p7c.k) payWithAnyScreen.N.getValue()).f233634c.get();
                    default:
                        KProperty[] kPropertyArr3 = PayWithAnyScreen.U;
                        PayWithAnyScreen payWithAnyScreen2 = this.f14812b;
                        return dli.f.a(payWithAnyScreen2, payWithAnyScreen2.d(), zhm.d0.E0(((fd6.a) ((h9c.b) ((p7c.k) payWithAnyScreen2.N.getValue()).f233633b.i.get()).d.getValue()).e, zhm.v.k(payWithAnyScreen2.Q, payWithAnyScreen2.R, payWithAnyScreen2.S, new RowLoadingDelegate(), payWithAnyScreen2.T)), R$id.payWithAny_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: bec.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayWithAnyScreen f14812b;

            {
                this.f14812b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PayWithAnyScreen payWithAnyScreen = this.f14812b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PayWithAnyScreen.U;
                        qji.b bVarU2 = payWithAnyScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.revolutpay.shared.ui.pay_with_any.di.PayWithAnyScreenInjector");
                        p7c.j jVar = (p7c.j) bVarU2;
                        return new p7c.k(jVar.f233625b, jVar.f233626c);
                    case 1:
                        KProperty[] kPropertyArr2 = PayWithAnyScreen.U;
                        return (q) ((p7c.k) payWithAnyScreen.N.getValue()).f233634c.get();
                    default:
                        KProperty[] kPropertyArr3 = PayWithAnyScreen.U;
                        PayWithAnyScreen payWithAnyScreen2 = this.f14812b;
                        return dli.f.a(payWithAnyScreen2, payWithAnyScreen2.d(), zhm.d0.E0(((fd6.a) ((h9c.b) ((p7c.k) payWithAnyScreen2.N.getValue()).f233633b.i.get()).d.getValue()).e, zhm.v.k(payWithAnyScreen2.Q, payWithAnyScreen2.R, payWithAnyScreen2.S, new RowLoadingDelegate(), payWithAnyScreen2.T)), R$id.payWithAny_recyclerView, null, null, null, 56);
                }
            }
        });
        this.Q = new ListSubheaderDelegate();
        this.R = new RowDelegate(null, null, 7);
        this.S = new FullScreenStateDelegate();
        this.T = new LargeActionButtonDelegate();
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2, reason: from getter */
    public final Integer getL() {
        return this.L;
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        bec.s uiState = (bec.s) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        r rVar = uiState.f14809b;
        List<? extends NavBarMenuItem> list = uiState.f14810c;
        NavBarWithToolbar navBarWithToolbar = d3().f296395c;
        TextLocalisedClause textLocalisedClause = rVar.f14805a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        Clause clause = rVar.f14806b;
        if (clause != null) {
            navBarWithToolbar.setDescriptionText(clause);
            navBarWithToolbar.setDescriptionVisible(true);
            navBarWithToolbar.setToolbar(textLocalisedClause, clause, null);
        } else {
            navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        }
        navBarWithToolbar.setMenuItems(list);
        if (rVar.f14807c) {
            navBarWithToolbar.H0(false);
        } else {
            navBarWithToolbar.j0(false);
        }
        i iVar = uiState.d;
        ActionFooterView actionFooterView = d3().f296394b;
        if (iVar == null) {
            actionFooterView.setVisibility(8);
        } else {
            actionFooterView.setModel(iVar);
            actionFooterView.setVisibility(0);
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((a) d()).onBackPressed();
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (k) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f296395c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f296395c.f59410q), new v(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f296395c.o.f57403b), new b74.e(this, continuation, 20), 3);
        ViewController.P2(this, rd0.e.b(this.S.f52371h.f121375b), new bec.w(this, null), 3);
        ListSubheaderDelegate listSubheaderDelegate = this.Q;
        ViewController.P2(this, l.y(listSubheaderDelegate.f52707c, listSubheaderDelegate.f, "merge(...)"), new x(this, null), 3);
        RowDelegate rowDelegate = this.R;
        ViewController.P2(this, rd0.e.b(rowDelegate.f53218h), new y(this, null), 3);
        ViewController.P2(this, rd0.e.b(rowDelegate.k), new z(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.T.d.f121375b), new a0(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f296394b.f), new v(this, continuation, 1), 3);
    }

    public final b d3() {
        ViewBinding value = this.M.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final bec.q d() {
        return (bec.q) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.P.getValue();
    }
}
