package com.revolut.feature.security_hub.impl.ui.linked_wallets.host;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.security_hub.impl.R$id;
import com.revolut.feature.security_hub.impl.R$layout;
import com.revolut.feature.security_hub.impl.ui.linked_wallets.host.LinkedWalletsScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vb2.r;
import vc.s;
import vrl.d;
import vuc.b;
import vuc.c;
import vuc.j;
import vuc.l;
import vuc.n;
import xki.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/linked_wallets/host/LinkedWalletsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lvuc/j;", "Lski/a;", "Lvuc/o;", "Lcom/revolut/feature/security_hub/impl/ui/linked_wallets/host/LinkedWalletsScreenContract$TabItem;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LinkedWalletsScreen extends ViewController<j> implements ski.a {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(LinkedWalletsScreen.class, "binding", "getBinding()Lcom/revolut/feature/security_hub/impl/databinding/ScreenLinkedWalletsBinding;", 0))};
    public final h K;
    public final Object L;
    public final Object M;
    public final int N;
    public final Object O;

    public LinkedWalletsScreen(LinkedWalletsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, b.f);
        this.L = w.y0(new vqd.b(this, inputData, 11));
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: vuc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LinkedWalletsScreen f292312b;

            {
                this.f292312b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                LinkedWalletsScreen linkedWalletsScreen = this.f292312b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = LinkedWalletsScreen.P;
                        return (l) ((vtc.l) linkedWalletsScreen.L.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr2 = LinkedWalletsScreen.P;
                        return czi.c.c(linkedWalletsScreen, R$id.linkedWalletsScreen_pager, linkedWalletsScreen.R2());
                }
            }
        });
        this.N = R$layout.screen_linked_wallets;
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: vuc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LinkedWalletsScreen f292312b;

            {
                this.f292312b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                LinkedWalletsScreen linkedWalletsScreen = this.f292312b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LinkedWalletsScreen.P;
                        return (l) ((vtc.l) linkedWalletsScreen.L.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr2 = LinkedWalletsScreen.P;
                        return czi.c.c(linkedWalletsScreen, R$id.linkedWalletsScreen_pager, linkedWalletsScreen.R2());
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        vuc.o uiState = (vuc.o) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        n nVar = qVar instanceof n ? (n) qVar : null;
        if (pd.b.k(nVar != null ? Boolean.valueOf(nVar.f292329a) : null)) {
            NavBarWithToolbar navBarWithToolbar = d3().f283080b;
            navBarWithToolbar.setTitle(uiState.f292332a, null);
            navBarWithToolbar.setToolbarTitle(uiState.f292332a);
        }
        if (pd.b.k(nVar != null ? Boolean.valueOf(nVar.f292330b) : null)) {
            NavBarWithToolbar navBarWithToolbar2 = d3().f283080b;
            navBarWithToolbar2.setSecondDescriptionText(uiState.f292333b);
            navBarWithToolbar2.setSecondDescriptionVisible(true);
        }
        if (pd.b.k(nVar != null ? Boolean.valueOf(nVar.f292331c) : null)) {
            d3().f283081c.setItems(uiState.f292334c, uiState.d);
            Tabs linkedWalletsScreenTabs = d3().f283081c;
            Intrinsics.checkNotNullExpressionValue(linkedWalletsScreenTabs, "linkedWalletsScreenTabs");
            linkedWalletsScreenTabs.setVisibility((uiState.f292334c.isEmpty() || uiState.e) ? 8 : 0);
        }
        if (!pd.b.k(nVar != null ? Boolean.valueOf(nVar.d) : null) || uiState.d == null) {
            return;
        }
        Tabs linkedWalletsScreenTabs2 = d3().f283081c;
        Intrinsics.checkNotNullExpressionValue(linkedWalletsScreenTabs2, "linkedWalletsScreenTabs");
        Tabs.u(linkedWalletsScreenTabs2, uiState.d, true, false, false, 12);
    }

    @Override // ali.g
    public final void Q1(PagerItem pagerItem) {
        LinkedWalletsScreenContract$TabItem pagerItem2 = (LinkedWalletsScreenContract$TabItem) pagerItem;
        Intrinsics.checkNotNullParameter(pagerItem2, "pagerItem");
        l lVarR2 = R2();
        String selectedId = pagerItem2.getF94249a();
        a aVar = (a) lVarR2;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(selectedId, "selectedId");
        aVar.H2(aVar.u, new r(selectedId, 18));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (vtc.l) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (vtc.l) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f283080b;
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f283080b.f59410q), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f283080b.x0()), new c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f283081c.f58882b), new d(this, null, 4), 3);
    }

    public final utc.c d3() {
        ViewBinding value = this.K.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (utc.c) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final l d() {
        return (l) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (ski.c) this.O.getValue();
    }
}
