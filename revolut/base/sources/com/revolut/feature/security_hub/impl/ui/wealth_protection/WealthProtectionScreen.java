package com.revolut.feature.security_hub.impl.ui.wealth_protection;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.security_hub.api.R$string;
import com.revolut.feature.security_hub.impl.R$id;
import com.revolut.feature.security_hub.impl.R$layout;
import com.revolut.feature.security_hub.impl.ui.wealth_protection.WealthProtectionScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import in0.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nsh.e;
import nwc.b;
import nwc.c;
import nwc.d;
import nwc.f;
import nwc.k;
import nwc.l;
import nwc.m;
import te0.w;
import vc.s;
import vtc.g0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/wealth_protection/WealthProtectionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lnwc/k;", "Ldli/a;", "Lnwc/m;", "Lin0/g;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WealthProtectionScreen extends ViewController<k> implements a, g {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(WealthProtectionScreen.class, "binding", "getBinding()Lcom/revolut/feature/security_hub/impl/databinding/ScreenWealthProtectionBinding;", 0))};
    public final int K;
    public final h L;
    public final Object M;
    public final Object N;
    public final boolean O;
    public final RowDelegate P;
    public final LargeActionButtonDelegate Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public WealthProtectionScreen(WealthProtectionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_wealth_protection;
        this.L = s.t(this, b.f);
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: nwc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WealthProtectionScreen f219818b;

            {
                this.f219818b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                WealthProtectionScreen wealthProtectionScreen = this.f219818b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = WealthProtectionScreen.U;
                        ViewBinding value = wealthProtectionScreen.L.getValue(wealthProtectionScreen, WealthProtectionScreen.U[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return ((utc.g) value).f283092c;
                    case 1:
                        KProperty[] kPropertyArr2 = WealthProtectionScreen.U;
                        ViewBinding value2 = wealthProtectionScreen.L.getValue(wealthProtectionScreen, WealthProtectionScreen.U[0]);
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return ((utc.g) value2).f283091b;
                    case 2:
                        KProperty[] kPropertyArr3 = WealthProtectionScreen.U;
                        return (l) ((g0) wealthProtectionScreen.S.getValue()).f291982g.get();
                    default:
                        KProperty[] kPropertyArr4 = WealthProtectionScreen.U;
                        int i3 = R$id.wealthProtection_recyclerView;
                        WealthProtectionScreen wealthProtectionScreen2 = this.f219818b;
                        return dli.f.a(wealthProtectionScreen2, wealthProtectionScreen2.R2(), v.k(wealthProtectionScreen2.P, new RowLoadingDelegate(), new FullScreenStateDelegate()), i3, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: nwc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WealthProtectionScreen f219818b;

            {
                this.f219818b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                WealthProtectionScreen wealthProtectionScreen = this.f219818b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WealthProtectionScreen.U;
                        ViewBinding value = wealthProtectionScreen.L.getValue(wealthProtectionScreen, WealthProtectionScreen.U[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return ((utc.g) value).f283092c;
                    case 1:
                        KProperty[] kPropertyArr2 = WealthProtectionScreen.U;
                        ViewBinding value2 = wealthProtectionScreen.L.getValue(wealthProtectionScreen, WealthProtectionScreen.U[0]);
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return ((utc.g) value2).f283091b;
                    case 2:
                        KProperty[] kPropertyArr3 = WealthProtectionScreen.U;
                        return (l) ((g0) wealthProtectionScreen.S.getValue()).f291982g.get();
                    default:
                        KProperty[] kPropertyArr4 = WealthProtectionScreen.U;
                        int i3 = R$id.wealthProtection_recyclerView;
                        WealthProtectionScreen wealthProtectionScreen2 = this.f219818b;
                        return dli.f.a(wealthProtectionScreen2, wealthProtectionScreen2.R2(), v.k(wealthProtectionScreen2.P, new RowLoadingDelegate(), new FullScreenStateDelegate()), i3, null, null, null, 56);
                }
            }
        });
        this.O = true;
        this.P = new RowDelegate(null, null, 7);
        this.Q = new LargeActionButtonDelegate();
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: nwc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WealthProtectionScreen f219818b;

            {
                this.f219818b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                WealthProtectionScreen wealthProtectionScreen = this.f219818b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WealthProtectionScreen.U;
                        ViewBinding value = wealthProtectionScreen.L.getValue(wealthProtectionScreen, WealthProtectionScreen.U[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return ((utc.g) value).f283092c;
                    case 1:
                        KProperty[] kPropertyArr2 = WealthProtectionScreen.U;
                        ViewBinding value2 = wealthProtectionScreen.L.getValue(wealthProtectionScreen, WealthProtectionScreen.U[0]);
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return ((utc.g) value2).f283091b;
                    case 2:
                        KProperty[] kPropertyArr3 = WealthProtectionScreen.U;
                        return (l) ((g0) wealthProtectionScreen.S.getValue()).f291982g.get();
                    default:
                        KProperty[] kPropertyArr4 = WealthProtectionScreen.U;
                        int i32 = R$id.wealthProtection_recyclerView;
                        WealthProtectionScreen wealthProtectionScreen2 = this.f219818b;
                        return dli.f.a(wealthProtectionScreen2, wealthProtectionScreen2.R2(), v.k(wealthProtectionScreen2.P, new RowLoadingDelegate(), new FullScreenStateDelegate()), i32, null, null, null, 56);
                }
            }
        });
        this.S = w.y0(new e(this, inputData, 7));
        final int i5 = 3;
        this.T = w.y0(new Function0(this) { // from class: nwc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WealthProtectionScreen f219818b;

            {
                this.f219818b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                WealthProtectionScreen wealthProtectionScreen = this.f219818b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WealthProtectionScreen.U;
                        ViewBinding value = wealthProtectionScreen.L.getValue(wealthProtectionScreen, WealthProtectionScreen.U[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return ((utc.g) value).f283092c;
                    case 1:
                        KProperty[] kPropertyArr2 = WealthProtectionScreen.U;
                        ViewBinding value2 = wealthProtectionScreen.L.getValue(wealthProtectionScreen, WealthProtectionScreen.U[0]);
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return ((utc.g) value2).f283091b;
                    case 2:
                        KProperty[] kPropertyArr3 = WealthProtectionScreen.U;
                        return (l) ((g0) wealthProtectionScreen.S.getValue()).f291982g.get();
                    default:
                        KProperty[] kPropertyArr4 = WealthProtectionScreen.U;
                        int i32 = R$id.wealthProtection_recyclerView;
                        WealthProtectionScreen wealthProtectionScreen2 = this.f219818b;
                        return dli.f.a(wealthProtectionScreen2, wealthProtectionScreen2.R2(), v.k(wealthProtectionScreen2.P, new RowLoadingDelegate(), new FullScreenStateDelegate()), i32, null, null, null, 56);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ((NavBarWithToolbar) this.M.getValue()).setSecondDescriptionText(uiState.f219828b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (g0) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) this.M.getValue();
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.security_hub_wealth_protection_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.security_hub_wealth_protection_title, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithToolbar.setMenuItems(u.c(IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "WEALTH_PROTECTION_FAQ_MENU_ITEM_ID", new ResourceImage(R$drawable.uikit_icn_24_question_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124)));
        ((FooterTextView) this.N.getValue()).setTextClause(new TextLocalisedClause(R$string.security_hub_wealth_protection_home_footer, null, null, 14));
        ((j60.a) ((g0) this.S.getValue()).e.get()).d(v.k(this.P, this.Q));
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r62 = this.M;
        NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) r62.getValue();
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.f59410q), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.x0()), new c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.P.f53218h), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Q.d.f121375b), new nwc.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(((NavBarWithToolbar) r62.getValue()).o.f57403b), new f(this, null, 0), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final l R2() {
        return (l) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
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
        return Boolean.valueOf(this.O);
    }
}
