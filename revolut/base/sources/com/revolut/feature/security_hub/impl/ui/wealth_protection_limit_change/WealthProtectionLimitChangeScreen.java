package com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.q;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.WealthProtectionLimitChangeScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import in0.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pqc.k;
import pt4.d;
import pwc.c;
import pwc.f;
import pwc.o;
import pwc.p;
import te0.w;
import vc.s;
import vtc.f0;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/wealth_protection_limit_change/WealthProtectionLimitChangeScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lpwc/o;", "Ldli/a;", "Lpwc/q;", "Lin0/g;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WealthProtectionLimitChangeScreen extends ViewController<o> implements dli.a, g {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(WealthProtectionLimitChangeScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final int K;
    public final h L;
    public final Object M;
    public final Object N;
    public final RowDelegate O;
    public final Object P;
    public final ActionWidgetDelegate Q;
    public final Object R;
    public final Object S;

    public WealthProtectionLimitChangeScreen(WealthProtectionLimitChangeScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_footer_nextbutton;
        this.L = s.t(this, c.f);
        this.M = w.y0(new d(this, inputData, 8));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: pwc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WealthProtectionLimitChangeScreen f240398b;

            {
                this.f240398b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                WealthProtectionLimitChangeScreen wealthProtectionLimitChangeScreen = this.f240398b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = WealthProtectionLimitChangeScreen.T;
                        return (p) ((f0) wealthProtectionLimitChangeScreen.M.getValue()).f291976h.get();
                    case 1:
                        KProperty[] kPropertyArr2 = WealthProtectionLimitChangeScreen.T;
                        return new CenteredAmountDelegate(new pu4.d(wealthProtectionLimitChangeScreen, 8));
                    default:
                        KProperty[] kPropertyArr3 = WealthProtectionLimitChangeScreen.T;
                        int i3 = R$id.screenRecyclerNavbarFooterNextbutton_recyclerView;
                        WealthProtectionLimitChangeScreen wealthProtectionLimitChangeScreen2 = this.f240398b;
                        return dli.f.a(wealthProtectionLimitChangeScreen2, wealthProtectionLimitChangeScreen2.e3(), zhm.v.k((CenteredAmountDelegate) wealthProtectionLimitChangeScreen2.P.getValue(), wealthProtectionLimitChangeScreen2.O, new RowLoadingDelegate(), wealthProtectionLimitChangeScreen2.Q), i3, null, null, null, 56);
                }
            }
        });
        this.O = new RowDelegate(null, null, 7);
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: pwc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WealthProtectionLimitChangeScreen f240398b;

            {
                this.f240398b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                WealthProtectionLimitChangeScreen wealthProtectionLimitChangeScreen = this.f240398b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WealthProtectionLimitChangeScreen.T;
                        return (p) ((f0) wealthProtectionLimitChangeScreen.M.getValue()).f291976h.get();
                    case 1:
                        KProperty[] kPropertyArr2 = WealthProtectionLimitChangeScreen.T;
                        return new CenteredAmountDelegate(new pu4.d(wealthProtectionLimitChangeScreen, 8));
                    default:
                        KProperty[] kPropertyArr3 = WealthProtectionLimitChangeScreen.T;
                        int i3 = R$id.screenRecyclerNavbarFooterNextbutton_recyclerView;
                        WealthProtectionLimitChangeScreen wealthProtectionLimitChangeScreen2 = this.f240398b;
                        return dli.f.a(wealthProtectionLimitChangeScreen2, wealthProtectionLimitChangeScreen2.e3(), zhm.v.k((CenteredAmountDelegate) wealthProtectionLimitChangeScreen2.P.getValue(), wealthProtectionLimitChangeScreen2.O, new RowLoadingDelegate(), wealthProtectionLimitChangeScreen2.Q), i3, null, null, null, 56);
                }
            }
        });
        this.Q = new ActionWidgetDelegate();
        this.R = w.y0(new pni.a(16));
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: pwc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WealthProtectionLimitChangeScreen f240398b;

            {
                this.f240398b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                WealthProtectionLimitChangeScreen wealthProtectionLimitChangeScreen = this.f240398b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WealthProtectionLimitChangeScreen.T;
                        return (p) ((f0) wealthProtectionLimitChangeScreen.M.getValue()).f291976h.get();
                    case 1:
                        KProperty[] kPropertyArr2 = WealthProtectionLimitChangeScreen.T;
                        return new CenteredAmountDelegate(new pu4.d(wealthProtectionLimitChangeScreen, 8));
                    default:
                        KProperty[] kPropertyArr3 = WealthProtectionLimitChangeScreen.T;
                        int i32 = R$id.screenRecyclerNavbarFooterNextbutton_recyclerView;
                        WealthProtectionLimitChangeScreen wealthProtectionLimitChangeScreen2 = this.f240398b;
                        return dli.f.a(wealthProtectionLimitChangeScreen2, wealthProtectionLimitChangeScreen2.e3(), zhm.v.k((CenteredAmountDelegate) wealthProtectionLimitChangeScreen2.P.getValue(), wealthProtectionLimitChangeScreen2.O, new RowLoadingDelegate(), wealthProtectionLimitChangeScreen2.Q), i32, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, q qVar) {
        pwc.q uiState = (pwc.q) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174558c.setTextClause(uiState.d);
        LargeActionButton largeActionButton = d3().f174557b;
        largeActionButton.setEnabled(uiState.f240413a);
        largeActionButton.setText(uiState.e);
        NavBarWithToolbar navBarWithToolbar = d3().e;
        navBarWithToolbar.setToolbarTitle(uiState.f240415c);
        navBarWithToolbar.setMenuItems(uiState.f);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f0) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().e;
        NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
        navBarWithToolbar.j0(false);
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        ((j60.a) ((f0) this.M.getValue()).e.get()).d(u.c((LargeActionButtonDelegate) this.R.getValue()));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().e.f59410q), new pwc.d(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().e.o.f57403b), new pwc.d(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174557b.o), new pwc.d(this, continuation, 2), 3);
        RowDelegate rowDelegate = this.O;
        ViewController.P2(this, rd0.e.b(rowDelegate.f53225r), new pwc.e(this, null), 3);
        ViewController.P2(this, vkm.q.J(rd0.e.b(rowDelegate.k), rd0.e.b(rowDelegate.f53218h)), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f51589c.f121375b), new k(this, continuation, 21), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.L.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final p R2() {
        return (p) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }
}
