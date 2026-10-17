package com.revolut.feature.apm.core.ui.impl.ui.registration.terms.scopes;

import abf.n;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import c12.l0;
import c12.n0;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.WebViewDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.models.onboarding.ApmOnboardingStatusTerms;
import com.revolut.feature.apm.core.ui.api.navigation.ApmRegistrationTermsScope$InputData;
import com.revolut.feature.apm.core.ui.impl.ui.registration.terms.scopes.ApmTermsScopeScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import fyh.k;
import g1k.i;
import g42.b;
import g42.d;
import g42.f;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import p12.i0;
import te0.w;
import vc.s;
import vkm.j2;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/ui/impl/ui/registration/terms/scopes/ApmTermsScopeScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lc12/n0;", "Ldli/a;", "Lg42/b;", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ApmTermsScopeScreen extends ViewController<n0> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(ApmTermsScopeScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final ApmRegistrationTermsScope$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public ApmTermsScopeScreen(ApmRegistrationTermsScope$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, d.f);
        this.N = w.y0(new k(28));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: g42.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ApmTermsScopeScreen f140327b;

            {
                this.f140327b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ApmTermsScopeScreen apmTermsScopeScreen = this.f140327b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ApmTermsScopeScreen.R;
                        ApmTermsScopeScreen apmTermsScopeScreen2 = this.f140327b;
                        return dli.f.a(apmTermsScopeScreen2, (f) apmTermsScopeScreen2.Q.getValue(), v.k(new PlainTextLoadingDelegate(), new WebViewDelegate(), new RowLoadingDelegate(), (LargeActionButtonDelegate) apmTermsScopeScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ApmTermsScopeScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(apmTermsScopeScreen.m2()).a().get(p12.v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p12.v.class, " is not found"));
                        }
                        p12.v vVar = ((p12.v) aVar2.b()).K;
                        ApmRegistrationTermsScope$InputData apmRegistrationTermsScope$InputData = apmTermsScopeScreen.K;
                        apmRegistrationTermsScope$InputData.getClass();
                        return new i0(vVar, apmRegistrationTermsScope$InputData);
                    default:
                        KProperty[] kPropertyArr3 = ApmTermsScopeScreen.R;
                        return (f) ((i0) apmTermsScopeScreen.P.getValue()).f231684c.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: g42.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ApmTermsScopeScreen f140327b;

            {
                this.f140327b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ApmTermsScopeScreen apmTermsScopeScreen = this.f140327b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ApmTermsScopeScreen.R;
                        ApmTermsScopeScreen apmTermsScopeScreen2 = this.f140327b;
                        return dli.f.a(apmTermsScopeScreen2, (f) apmTermsScopeScreen2.Q.getValue(), v.k(new PlainTextLoadingDelegate(), new WebViewDelegate(), new RowLoadingDelegate(), (LargeActionButtonDelegate) apmTermsScopeScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ApmTermsScopeScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(apmTermsScopeScreen.m2()).a().get(p12.v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p12.v.class, " is not found"));
                        }
                        p12.v vVar = ((p12.v) aVar2.b()).K;
                        ApmRegistrationTermsScope$InputData apmRegistrationTermsScope$InputData = apmTermsScopeScreen.K;
                        apmRegistrationTermsScope$InputData.getClass();
                        return new i0(vVar, apmRegistrationTermsScope$InputData);
                    default:
                        KProperty[] kPropertyArr3 = ApmTermsScopeScreen.R;
                        return (f) ((i0) apmTermsScopeScreen.P.getValue()).f231684c.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: g42.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ApmTermsScopeScreen f140327b;

            {
                this.f140327b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ApmTermsScopeScreen apmTermsScopeScreen = this.f140327b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ApmTermsScopeScreen.R;
                        ApmTermsScopeScreen apmTermsScopeScreen2 = this.f140327b;
                        return dli.f.a(apmTermsScopeScreen2, (f) apmTermsScopeScreen2.Q.getValue(), v.k(new PlainTextLoadingDelegate(), new WebViewDelegate(), new RowLoadingDelegate(), (LargeActionButtonDelegate) apmTermsScopeScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ApmTermsScopeScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(apmTermsScopeScreen.m2()).a().get(p12.v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p12.v.class, " is not found"));
                        }
                        p12.v vVar = ((p12.v) aVar2.b()).K;
                        ApmRegistrationTermsScope$InputData apmRegistrationTermsScope$InputData = apmTermsScopeScreen.K;
                        apmRegistrationTermsScope$InputData.getClass();
                        return new i0(vVar, apmRegistrationTermsScope$InputData);
                    default:
                        KProperty[] kPropertyArr3 = ApmTermsScopeScreen.R;
                        return (f) ((i0) apmTermsScopeScreen.P.getValue()).f231684c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        b uiState = (b) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setTitle(uiState.f140324b, null);
        navBarWithToolbar.setDescriptionText(uiState.f140325c);
        navBarWithToolbar.setDescriptionVisible(true);
        d3().f174564b.setEnabled(uiState.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        f fVar = (f) this.Q.getValue();
        int i = ((g42.a) ((j2) fVar.f140329q.f22677a).getValue()).f140321b;
        if (i == 0) {
            fVar.C2(l0.f20341a);
            return true;
        }
        int i2 = i - 1;
        fVar.H2(fVar.f140329q, new n(i2, fVar, 10));
        fVar.l2(new i(fVar, (ApmOnboardingStatusTerms) fVar.f140328p.f62275a.get(i2), null, 5), new yi5.b(26));
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i0) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174564b.setText(new TextLocalisedClause(R$string.apm_registration_terms_action, null, null, 14));
        d3().f174564b.setLoadingButtonTag("SIGN_TERMS_BUTTON_LOADING_TAG");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new g42.e(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new g42.e(this, null, 1), 3);
    }

    public final u d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.O.getValue();
    }
}
