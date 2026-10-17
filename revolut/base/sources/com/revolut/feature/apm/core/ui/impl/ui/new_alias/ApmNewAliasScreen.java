package com.revolut.feature.apm.core.ui.impl.ui.new_alias;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import c12.e;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.PhoneEditorDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.ui.api.mapper.ApmFooterContent;
import com.revolut.feature.apm.core.ui.api.navigation.ApmNewAliasNavigation$InputData;
import com.revolut.feature.apm.core.ui.impl.ui.new_alias.ApmNewAliasScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mx0.c7;
import nwf.b;
import o22.c;
import o22.d;
import o22.f;
import o22.g;
import o22.i;
import o22.j;
import o22.n;
import p12.y;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/ui/impl/ui/new_alias/ApmNewAliasScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lc12/e;", "Ldli/a;", "Lo22/c;", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ApmNewAliasScreen extends ViewController<e> implements a {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(ApmNewAliasScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final ApmNewAliasNavigation$InputData K;
    public final com.revolut.feature.apm.core.ui.api.navigation.a L;
    public final int M;
    public final boolean N;
    public final h O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;

    public ApmNewAliasScreen(ApmNewAliasNavigation$InputData inputData, com.revolut.feature.apm.core.ui.api.navigation.a extension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(extension, "extension");
        this.K = inputData;
        this.L = extension;
        this.M = R$layout.screen_recycler_navbar_footer_nextbutton;
        this.N = true;
        this.O = s.t(this, f.f);
        this.P = w.y0(new b(23));
        this.Q = w.y0(new b(24));
        this.R = w.y0(new b(25));
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: o22.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ApmNewAliasScreen f221424b;

            {
                this.f221424b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ApmNewAliasScreen apmNewAliasScreen = this.f221424b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ApmNewAliasScreen.V;
                        ApmNewAliasScreen apmNewAliasScreen2 = this.f221424b;
                        return dli.f.a(apmNewAliasScreen2, apmNewAliasScreen2.R2(), v.k((FixedTabsDelegate) apmNewAliasScreen2.P.getValue(), (InputTextDelegate) apmNewAliasScreen2.Q.getValue(), (PhoneEditorDelegate) apmNewAliasScreen2.R.getValue()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ApmNewAliasScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(apmNewAliasScreen.m2()).a().get(p12.v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p12.v.class, " is not found"));
                        }
                        p12.v vVar = ((p12.v) aVar2.b()).K;
                        com.revolut.feature.apm.core.ui.api.navigation.a aVar3 = apmNewAliasScreen.L;
                        aVar3.getClass();
                        ApmNewAliasNavigation$InputData apmNewAliasNavigation$InputData = apmNewAliasScreen.K;
                        apmNewAliasNavigation$InputData.getClass();
                        return new y(vVar, aVar3, apmNewAliasNavigation$InputData);
                    default:
                        KProperty[] kPropertyArr3 = ApmNewAliasScreen.V;
                        return (d) ((y) apmNewAliasScreen.T.getValue()).f.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: o22.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ApmNewAliasScreen f221424b;

            {
                this.f221424b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ApmNewAliasScreen apmNewAliasScreen = this.f221424b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ApmNewAliasScreen.V;
                        ApmNewAliasScreen apmNewAliasScreen2 = this.f221424b;
                        return dli.f.a(apmNewAliasScreen2, apmNewAliasScreen2.R2(), v.k((FixedTabsDelegate) apmNewAliasScreen2.P.getValue(), (InputTextDelegate) apmNewAliasScreen2.Q.getValue(), (PhoneEditorDelegate) apmNewAliasScreen2.R.getValue()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ApmNewAliasScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(apmNewAliasScreen.m2()).a().get(p12.v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p12.v.class, " is not found"));
                        }
                        p12.v vVar = ((p12.v) aVar2.b()).K;
                        com.revolut.feature.apm.core.ui.api.navigation.a aVar3 = apmNewAliasScreen.L;
                        aVar3.getClass();
                        ApmNewAliasNavigation$InputData apmNewAliasNavigation$InputData = apmNewAliasScreen.K;
                        apmNewAliasNavigation$InputData.getClass();
                        return new y(vVar, aVar3, apmNewAliasNavigation$InputData);
                    default:
                        KProperty[] kPropertyArr3 = ApmNewAliasScreen.V;
                        return (d) ((y) apmNewAliasScreen.T.getValue()).f.get();
                }
            }
        });
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: o22.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ApmNewAliasScreen f221424b;

            {
                this.f221424b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ApmNewAliasScreen apmNewAliasScreen = this.f221424b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ApmNewAliasScreen.V;
                        ApmNewAliasScreen apmNewAliasScreen2 = this.f221424b;
                        return dli.f.a(apmNewAliasScreen2, apmNewAliasScreen2.R2(), v.k((FixedTabsDelegate) apmNewAliasScreen2.P.getValue(), (InputTextDelegate) apmNewAliasScreen2.Q.getValue(), (PhoneEditorDelegate) apmNewAliasScreen2.R.getValue()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ApmNewAliasScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(apmNewAliasScreen.m2()).a().get(p12.v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p12.v.class, " is not found"));
                        }
                        p12.v vVar = ((p12.v) aVar2.b()).K;
                        com.revolut.feature.apm.core.ui.api.navigation.a aVar3 = apmNewAliasScreen.L;
                        aVar3.getClass();
                        ApmNewAliasNavigation$InputData apmNewAliasNavigation$InputData = apmNewAliasScreen.K;
                        apmNewAliasNavigation$InputData.getClass();
                        return new y(vVar, aVar3, apmNewAliasNavigation$InputData);
                    default:
                        KProperty[] kPropertyArr3 = ApmNewAliasScreen.V;
                        return (d) ((y) apmNewAliasScreen.T.getValue()).f.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        c uiState = (c) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174557b.setEnabled(uiState.f221422b);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((n) R2()).C2(c12.c.f20323a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (y) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().e;
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        ApmNewAliasNavigation$InputData apmNewAliasNavigation$InputData = this.K;
        navBarWithToolbar.setToolbarTitle(apmNewAliasNavigation$InputData.f62243a);
        navBarWithToolbar.setTitle(apmNewAliasNavigation$InputData.f62243a, null);
        LargeActionButton largeActionButton = d3().f174557b;
        largeActionButton.setText(apmNewAliasNavigation$InputData.f62245c.f62239a);
        largeActionButton.setLoadingButtonTag("ALIAS_CTA_BUTTON_TAG");
        FooterTextView footerTextView = d3().f174558c;
        ApmFooterContent apmFooterContent = apmNewAliasNavigation$InputData.e;
        ApmFooterContent.TextOnly textOnly = apmFooterContent instanceof ApmFooterContent.TextOnly ? (ApmFooterContent.TextOnly) apmFooterContent : null;
        footerTextView.setVisibility(textOnly != null ? 0 : 8);
        if (textOnly != null) {
            footerTextView.setContent(new c7(textOnly.f62233a, false, null, 6));
        }
    }

    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v25, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.f59410q), null, new g(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174557b.o), null, new g(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174558c.f58608l), null, new o22.h(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FixedTabsDelegate) this.P.getValue()).f52339c.f121375b), null, new o22.h(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputTextDelegate) this.Q.getValue()).e.f121375b), null, new i(this, null), 3);
        ?? r56 = this.R;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((PhoneEditorDelegate) r56.getValue()).e.f121375b), null, new j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((PhoneEditorDelegate) r56.getValue()).f52894c.f121375b), null, new g(this, continuation, 2), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.O.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final d R2() {
        return (d) this.U.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.N);
    }
}
