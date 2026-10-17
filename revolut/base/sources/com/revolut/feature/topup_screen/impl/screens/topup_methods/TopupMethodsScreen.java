package com.revolut.feature.topup_screen.impl.screens.topup_methods;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.AppTipDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.topup_screen.impl.R$id;
import com.revolut.feature.topup_screen.impl.R$layout;
import com.revolut.feature.topup_screen.impl.R$string;
import com.revolut.feature.topup_screen.impl.screens.topup_methods.TopupMethodsScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import in0.g;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import qve.y;
import te0.w;
import vc.s;
import xki.e;
import ys.i;
import z0f.b;
import z0f.d;
import z0f.f;
import z0f.k;
import z0f.p;
import z0f.x;
import z0f.z;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/screens/topup_methods/TopupMethodsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lz0f/x;", "Ldli/a;", "Lz0f/z;", "Lin0/g;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TopupMethodsScreen extends ViewController<x> implements a, g {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(TopupMethodsScreen.class, "binding", "getBinding()Lcom/revolut/feature/topup_screen/impl/databinding/ScreenTopupMethodsBinding;", 0))};
    public final int K;
    public final h L;
    public final ActionsDelegate M;
    public final RowDelegate N;
    public final LargeActionButtonDelegate O;
    public final AppTipDelegate P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public TopupMethodsScreen(TopupMethodsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_topup_methods;
        this.L = s.t(this, b.f);
        this.M = new ActionsDelegate();
        this.N = new RowDelegate(null, null, 7);
        this.O = new LargeActionButtonDelegate();
        this.P = new AppTipDelegate();
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: z0f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TopupMethodsScreen f318242b;

            {
                this.f318242b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TopupMethodsScreen topupMethodsScreen = this.f318242b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TopupMethodsScreen.U;
                        TopupMethodsScreen topupMethodsScreen2 = this.f318242b;
                        return dli.f.a(topupMethodsScreen2, topupMethodsScreen2.d(), zhm.d0.E0(((fd6.a) ((qve.y) topupMethodsScreen2.R.getValue()).f249689h.get()).e, zhm.v.k(topupMethodsScreen2.M, topupMethodsScreen2.P, new RowLoadingDelegate(), new FullScreenStateDelegate(), new ListSubheaderDelegate(), topupMethodsScreen2.O, topupMethodsScreen2.N)), R$id.screenTopUpMethods_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TopupMethodsScreen.U;
                        return (y) ((qve.y) topupMethodsScreen.R.getValue()).f249692m.get();
                    default:
                        KProperty[] kPropertyArr3 = TopupMethodsScreen.U;
                        return (j60.a) ((qve.y) topupMethodsScreen.R.getValue()).f249691l.get();
                }
            }
        });
        this.R = w.y0(new ywi.b(this, inputData, 7));
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: z0f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TopupMethodsScreen f318242b;

            {
                this.f318242b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TopupMethodsScreen topupMethodsScreen = this.f318242b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TopupMethodsScreen.U;
                        TopupMethodsScreen topupMethodsScreen2 = this.f318242b;
                        return dli.f.a(topupMethodsScreen2, topupMethodsScreen2.d(), zhm.d0.E0(((fd6.a) ((qve.y) topupMethodsScreen2.R.getValue()).f249689h.get()).e, zhm.v.k(topupMethodsScreen2.M, topupMethodsScreen2.P, new RowLoadingDelegate(), new FullScreenStateDelegate(), new ListSubheaderDelegate(), topupMethodsScreen2.O, topupMethodsScreen2.N)), R$id.screenTopUpMethods_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TopupMethodsScreen.U;
                        return (y) ((qve.y) topupMethodsScreen.R.getValue()).f249692m.get();
                    default:
                        KProperty[] kPropertyArr3 = TopupMethodsScreen.U;
                        return (j60.a) ((qve.y) topupMethodsScreen.R.getValue()).f249691l.get();
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: z0f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TopupMethodsScreen f318242b;

            {
                this.f318242b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TopupMethodsScreen topupMethodsScreen = this.f318242b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TopupMethodsScreen.U;
                        TopupMethodsScreen topupMethodsScreen2 = this.f318242b;
                        return dli.f.a(topupMethodsScreen2, topupMethodsScreen2.d(), zhm.d0.E0(((fd6.a) ((qve.y) topupMethodsScreen2.R.getValue()).f249689h.get()).e, zhm.v.k(topupMethodsScreen2.M, topupMethodsScreen2.P, new RowLoadingDelegate(), new FullScreenStateDelegate(), new ListSubheaderDelegate(), topupMethodsScreen2.O, topupMethodsScreen2.N)), R$id.screenTopUpMethods_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TopupMethodsScreen.U;
                        return (y) ((qve.y) topupMethodsScreen.R.getValue()).f249692m.get();
                    default:
                        KProperty[] kPropertyArr3 = TopupMethodsScreen.U;
                        return (j60.a) ((qve.y) topupMethodsScreen.R.getValue()).f249691l.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        z uiState = (z) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        LargeActionButton largeActionButton = d3().f200370c;
        largeActionButton.setVisibility(uiState.f318291c ? 0 : 8);
        largeActionButton.setEnabled(uiState.f318290b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (y) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.topup_title_how_to_add_money, null, null, 14);
        BasicNavBar basicNavBar = d3().f200369b;
        basicNavBar.setTitle(textLocalisedClause);
        basicNavBar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        ((j60.a) this.T.getValue()).d(u.c(this.O));
        d3().f200370c.setText(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_done, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f200369b.f59211b), null, new d(this, continuation, 3), 3);
        RowDelegate rowDelegate = this.N;
        ViewController.P2(this, new yph.b(rd0.e.b(rowDelegate.f53218h), 22), new i(2, d(), z0f.y.class, "onMethodClicked", "onMethodClicked(Lcom/revolut/domain/models/topup/methods/TopupMethod;)V", 4, 6), 3);
        ViewController.P2(this, new yph.b(rd0.e.b(rowDelegate.k), 23), new p(2, 4, z0f.y.class, d(), "onInfoIconClicked", "onInfoIconClicked(Lcom/revolut/domain/models/topup/methods/TopupMethod$StoredMethod;)V"), 3);
        ViewController.P2(this, new yph.b(rd0.e.b(this.M.f51611c.f121375b), 17), new i(2, d(), z0f.y.class, "onCurrencyActionClicked", "onCurrencyActionClicked(Ljava/lang/String;)V", 4, 5), 3);
        LargeActionButtonDelegate largeActionButtonDelegate = this.O;
        ViewController.P2(this, new yph.b(rd0.e.b(largeActionButtonDelegate.d.f121375b), 18), new f(this, null), 3);
        ViewController.P2(this, new yph.b(rd0.e.b(largeActionButtonDelegate.d.f121375b), 19), new z0f.h(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f200370c.o), new d(this, continuation, 0), 3);
        AppTipDelegate appTipDelegate = this.P;
        ViewController.P2(this, new v0f.p(new yph.b(rd0.e.b(appTipDelegate.d), 20), 29), new d(this, continuation, 1), 3);
        ViewController.P2(this, new k(new yph.b(rd0.e.b(appTipDelegate.f51654g), 21), 0), new d(this, continuation, 2), 3);
    }

    public final lve.d d3() {
        ViewBinding value = this.L.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (lve.d) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final z0f.y d() {
        return (z0f.y) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.Q.getValue();
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }
}
