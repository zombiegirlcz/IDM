package com.revolut.feature.apm.core.ui.impl.ui.new_contact;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import c12.f;
import c12.j;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.PhoneEditorDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.ui.api.navigation.ApmNewContactNavigation$InputData;
import com.revolut.feature.apm.core.ui.impl.ui.new_contact.ApmNewContactScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import h30.l;
import java.util.List;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import p12.z;
import q22.b;
import q22.c;
import q22.e;
import q22.g;
import q22.i;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/ui/impl/ui/new_contact/ApmNewContactScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lc12/j;", "Ldli/a;", "Lq22/b;", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ApmNewContactScreen extends ViewController<j> implements dli.a {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(ApmNewContactScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final ApmNewContactNavigation$InputData K;
    public final f L;
    public final int M;
    public final boolean N;
    public final h O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;

    public ApmNewContactScreen(ApmNewContactNavigation$InputData inputData, f extension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(extension, "extension");
        this.K = inputData;
        this.L = extension;
        this.M = R$layout.screen_recycler_navbar_nextbutton;
        this.N = true;
        this.O = s.t(this, e.f);
        this.P = w.y0(new q1l.e(1));
        this.Q = w.y0(new q1l.e(2));
        this.R = w.y0(new q1l.e(3));
        this.S = w.y0(new q1l.e(4));
        final int i = 0;
        this.T = w.y0(new Function0(this) { // from class: q22.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ApmNewContactScreen f241491b;

            {
                this.f241491b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ApmNewContactScreen apmNewContactScreen = this.f241491b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ApmNewContactScreen.W;
                        ApmNewContactScreen apmNewContactScreen2 = this.f241491b;
                        return dli.f.a(apmNewContactScreen2, apmNewContactScreen2.R2(), v.k((FixedTabsDelegate) apmNewContactScreen2.P.getValue(), (RowDelegate) apmNewContactScreen2.Q.getValue(), (InputTextDelegate) apmNewContactScreen2.R.getValue(), (PhoneEditorDelegate) apmNewContactScreen2.S.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ApmNewContactScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(apmNewContactScreen.m2()).a().get(p12.v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p12.v.class, " is not found"));
                        }
                        p12.v vVar = ((p12.v) aVar2.b()).K;
                        ApmNewContactNavigation$InputData apmNewContactNavigation$InputData = apmNewContactScreen.K;
                        apmNewContactNavigation$InputData.getClass();
                        c12.f fVar = apmNewContactScreen.L;
                        fVar.getClass();
                        return new z(vVar, apmNewContactNavigation$InputData, fVar);
                    default:
                        KProperty[] kPropertyArr3 = ApmNewContactScreen.W;
                        return (c) ((z) apmNewContactScreen.U.getValue()).f231830g.get();
                }
            }
        });
        final int i2 = 1;
        this.U = w.y0(new Function0(this) { // from class: q22.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ApmNewContactScreen f241491b;

            {
                this.f241491b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ApmNewContactScreen apmNewContactScreen = this.f241491b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ApmNewContactScreen.W;
                        ApmNewContactScreen apmNewContactScreen2 = this.f241491b;
                        return dli.f.a(apmNewContactScreen2, apmNewContactScreen2.R2(), v.k((FixedTabsDelegate) apmNewContactScreen2.P.getValue(), (RowDelegate) apmNewContactScreen2.Q.getValue(), (InputTextDelegate) apmNewContactScreen2.R.getValue(), (PhoneEditorDelegate) apmNewContactScreen2.S.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ApmNewContactScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(apmNewContactScreen.m2()).a().get(p12.v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p12.v.class, " is not found"));
                        }
                        p12.v vVar = ((p12.v) aVar2.b()).K;
                        ApmNewContactNavigation$InputData apmNewContactNavigation$InputData = apmNewContactScreen.K;
                        apmNewContactNavigation$InputData.getClass();
                        c12.f fVar = apmNewContactScreen.L;
                        fVar.getClass();
                        return new z(vVar, apmNewContactNavigation$InputData, fVar);
                    default:
                        KProperty[] kPropertyArr3 = ApmNewContactScreen.W;
                        return (c) ((z) apmNewContactScreen.U.getValue()).f231830g.get();
                }
            }
        });
        final int i3 = 2;
        this.V = w.y0(new Function0(this) { // from class: q22.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ApmNewContactScreen f241491b;

            {
                this.f241491b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ApmNewContactScreen apmNewContactScreen = this.f241491b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ApmNewContactScreen.W;
                        ApmNewContactScreen apmNewContactScreen2 = this.f241491b;
                        return dli.f.a(apmNewContactScreen2, apmNewContactScreen2.R2(), v.k((FixedTabsDelegate) apmNewContactScreen2.P.getValue(), (RowDelegate) apmNewContactScreen2.Q.getValue(), (InputTextDelegate) apmNewContactScreen2.R.getValue(), (PhoneEditorDelegate) apmNewContactScreen2.S.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ApmNewContactScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(apmNewContactScreen.m2()).a().get(p12.v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p12.v.class, " is not found"));
                        }
                        p12.v vVar = ((p12.v) aVar2.b()).K;
                        ApmNewContactNavigation$InputData apmNewContactNavigation$InputData = apmNewContactScreen.K;
                        apmNewContactNavigation$InputData.getClass();
                        c12.f fVar = apmNewContactScreen.L;
                        fVar.getClass();
                        return new z(vVar, apmNewContactNavigation$InputData, fVar);
                    default:
                        KProperty[] kPropertyArr3 = ApmNewContactScreen.W;
                        return (c) ((z) apmNewContactScreen.U.getValue()).f231830g.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        b uiState = (b) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f241489b);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((a) R2()).C2(c12.h.f20332a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (z) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        ApmNewContactNavigation$InputData apmNewContactNavigation$InputData = this.K;
        navBarWithToolbar.setToolbarTitle(apmNewContactNavigation$InputData.d);
        navBarWithToolbar.setTitle(apmNewContactNavigation$InputData.d, null);
        navBarWithToolbar.setMenuItems(apmNewContactNavigation$InputData.f62249g);
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setText(new TextLocalisedClause(R$string.apm_new_contact_action, null, null, 14));
        largeActionButton.setLoadingButtonTag("APM_NEW_CONTACT_CTA_BUTTON_TAG");
    }

    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v31, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new q22.f(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.o.f57403b), null, new g(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new q22.f(this, continuation, 1), 3);
        ?? r56 = this.Q;
        com.revolut.kompot.navigable.a.g2(this, l.y(((RowDelegate) r56.getValue()).f53218h, ((RowDelegate) r56.getValue()).f53225r, "merge(...)"), null, new q22.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FixedTabsDelegate) this.P.getValue()).f52339c.f121375b), null, new g(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputTextDelegate) this.R.getValue()).e.f121375b), null, new i(this, null), 3);
        ?? r59 = this.S;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((PhoneEditorDelegate) r59.getValue()).e.f121375b), null, new q22.j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((PhoneEditorDelegate) r59.getValue()).f52894c.f121375b), null, new q22.f(this, continuation, 2), 3);
    }

    public final u d3() {
        ViewBinding value = this.O.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final c R2() {
        return (c) this.V.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.N);
    }
}
