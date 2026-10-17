package com.revolut.feature.rev_points.impl.ui.post_onboarding_personalisation.preferences;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.i;
import cli.o;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.FiltersDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.rev_points.api.R$string;
import com.revolut.feature.rev_points.impl.R$id;
import com.revolut.feature.rev_points.impl.R$layout;
import com.revolut.feature.rev_points.impl.ui.post_onboarding_personalisation.preferences.RevPointsPostOnboardingPersonalisationPreferencesScreen;
import com.revolut.feature.rev_points.impl.ui.post_onboarding_personalisation.preferences.RevPointsPostOnboardingPersonalisationPreferencesScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import tx0.t3;
import vc.s;
import xki.e;
import zxb.r;
import zzb.b;
import zzb.c;
import zzb.d;
import zzb.f;
import zzb.g;
import zzb.n;
import zzb.o;
import zzb.p;
import zzb.t;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/post_onboarding_personalisation/preferences/RevPointsPostOnboardingPersonalisationPreferencesScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lzzb/p;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevPointsPostOnboardingPersonalisationPreferencesScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(RevPointsPostOnboardingPersonalisationPreferencesScreen.class, "binding", "getBinding()Lcom/revolut/feature/rev_points/impl/databinding/ScreenRevPointsPostOnboardingPersonalisationPreferencesBinding;", 0))};
    public final RevPointsPostOnboardingPersonalisationPreferencesScreenContract$InputData K;
    public final int L;
    public final int M;
    public final ActionsDelegate N;
    public final FiltersDelegate O;
    public final FullScreenStateDelegate P;
    public final FooterTextDelegate Q;
    public final Object R;
    public final h S;
    public final Object T;
    public final Object U;

    public RevPointsPostOnboardingPersonalisationPreferencesScreen(RevPointsPostOnboardingPersonalisationPreferencesScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_rev_points_post_onboarding_personalisation_preferences;
        this.M = R$style.UiKitTheme_Mono;
        this.N = new ActionsDelegate();
        this.O = new FiltersDelegate();
        this.P = new FullScreenStateDelegate();
        this.Q = new FooterTextDelegate();
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: zzb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsPostOnboardingPersonalisationPreferencesScreen f326648b;

            {
                this.f326648b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RevPointsPostOnboardingPersonalisationPreferencesScreen revPointsPostOnboardingPersonalisationPreferencesScreen = this.f326648b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsPostOnboardingPersonalisationPreferencesScreen.V;
                        RevPointsPostOnboardingPersonalisationPreferencesScreen revPointsPostOnboardingPersonalisationPreferencesScreen2 = this.f326648b;
                        return dli.f.a(revPointsPostOnboardingPersonalisationPreferencesScreen2, revPointsPostOnboardingPersonalisationPreferencesScreen2.R2(), zhm.v.k(revPointsPostOnboardingPersonalisationPreferencesScreen2.O, revPointsPostOnboardingPersonalisationPreferencesScreen2.P, revPointsPostOnboardingPersonalisationPreferencesScreen2.N, revPointsPostOnboardingPersonalisationPreferencesScreen2.Q), R$id.revPointsPostOnboardingPersonalisationPreferencesScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsPostOnboardingPersonalisationPreferencesScreen.V;
                        qji.b bVarU2 = revPointsPostOnboardingPersonalisationPreferencesScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.rev_points.impl.ui.post_onboarding_personalisation.preferences.di.RevPointsPostOnboardingPersonalisationPreferencesScreenInjector");
                        zxb.q qVar = (zxb.q) bVarU2;
                        zxb.e eVar = qVar.f326244b;
                        zxb.q qVar2 = qVar.f326245c;
                        RevPointsPostOnboardingPersonalisationPreferencesScreenContract$InputData revPointsPostOnboardingPersonalisationPreferencesScreenContract$InputData = revPointsPostOnboardingPersonalisationPreferencesScreen.K;
                        revPointsPostOnboardingPersonalisationPreferencesScreenContract$InputData.getClass();
                        return new zxb.r(eVar, qVar2, revPointsPostOnboardingPersonalisationPreferencesScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = RevPointsPostOnboardingPersonalisationPreferencesScreen.V;
                        return (t) ((zxb.r) revPointsPostOnboardingPersonalisationPreferencesScreen.T.getValue()).f326251c.get();
                }
            }
        });
        this.S = s.t(this, c.f);
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: zzb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsPostOnboardingPersonalisationPreferencesScreen f326648b;

            {
                this.f326648b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RevPointsPostOnboardingPersonalisationPreferencesScreen revPointsPostOnboardingPersonalisationPreferencesScreen = this.f326648b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsPostOnboardingPersonalisationPreferencesScreen.V;
                        RevPointsPostOnboardingPersonalisationPreferencesScreen revPointsPostOnboardingPersonalisationPreferencesScreen2 = this.f326648b;
                        return dli.f.a(revPointsPostOnboardingPersonalisationPreferencesScreen2, revPointsPostOnboardingPersonalisationPreferencesScreen2.R2(), zhm.v.k(revPointsPostOnboardingPersonalisationPreferencesScreen2.O, revPointsPostOnboardingPersonalisationPreferencesScreen2.P, revPointsPostOnboardingPersonalisationPreferencesScreen2.N, revPointsPostOnboardingPersonalisationPreferencesScreen2.Q), R$id.revPointsPostOnboardingPersonalisationPreferencesScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsPostOnboardingPersonalisationPreferencesScreen.V;
                        qji.b bVarU2 = revPointsPostOnboardingPersonalisationPreferencesScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.rev_points.impl.ui.post_onboarding_personalisation.preferences.di.RevPointsPostOnboardingPersonalisationPreferencesScreenInjector");
                        zxb.q qVar = (zxb.q) bVarU2;
                        zxb.e eVar = qVar.f326244b;
                        zxb.q qVar2 = qVar.f326245c;
                        RevPointsPostOnboardingPersonalisationPreferencesScreenContract$InputData revPointsPostOnboardingPersonalisationPreferencesScreenContract$InputData = revPointsPostOnboardingPersonalisationPreferencesScreen.K;
                        revPointsPostOnboardingPersonalisationPreferencesScreenContract$InputData.getClass();
                        return new zxb.r(eVar, qVar2, revPointsPostOnboardingPersonalisationPreferencesScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = RevPointsPostOnboardingPersonalisationPreferencesScreen.V;
                        return (t) ((zxb.r) revPointsPostOnboardingPersonalisationPreferencesScreen.T.getValue()).f326251c.get();
                }
            }
        });
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: zzb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsPostOnboardingPersonalisationPreferencesScreen f326648b;

            {
                this.f326648b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RevPointsPostOnboardingPersonalisationPreferencesScreen revPointsPostOnboardingPersonalisationPreferencesScreen = this.f326648b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsPostOnboardingPersonalisationPreferencesScreen.V;
                        RevPointsPostOnboardingPersonalisationPreferencesScreen revPointsPostOnboardingPersonalisationPreferencesScreen2 = this.f326648b;
                        return dli.f.a(revPointsPostOnboardingPersonalisationPreferencesScreen2, revPointsPostOnboardingPersonalisationPreferencesScreen2.R2(), zhm.v.k(revPointsPostOnboardingPersonalisationPreferencesScreen2.O, revPointsPostOnboardingPersonalisationPreferencesScreen2.P, revPointsPostOnboardingPersonalisationPreferencesScreen2.N, revPointsPostOnboardingPersonalisationPreferencesScreen2.Q), R$id.revPointsPostOnboardingPersonalisationPreferencesScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsPostOnboardingPersonalisationPreferencesScreen.V;
                        qji.b bVarU2 = revPointsPostOnboardingPersonalisationPreferencesScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.rev_points.impl.ui.post_onboarding_personalisation.preferences.di.RevPointsPostOnboardingPersonalisationPreferencesScreenInjector");
                        zxb.q qVar = (zxb.q) bVarU2;
                        zxb.e eVar = qVar.f326244b;
                        zxb.q qVar2 = qVar.f326245c;
                        RevPointsPostOnboardingPersonalisationPreferencesScreenContract$InputData revPointsPostOnboardingPersonalisationPreferencesScreenContract$InputData = revPointsPostOnboardingPersonalisationPreferencesScreen.K;
                        revPointsPostOnboardingPersonalisationPreferencesScreenContract$InputData.getClass();
                        return new zxb.r(eVar, qVar2, revPointsPostOnboardingPersonalisationPreferencesScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = RevPointsPostOnboardingPersonalisationPreferencesScreen.V;
                        return (t) ((zxb.r) revPointsPostOnboardingPersonalisationPreferencesScreen.T.getValue()).f326251c.get();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getW() {
        return Integer.valueOf(this.M);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        p uiState = (p) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().d;
        zzb.o oVar2 = uiState.f326660b;
        i iVar = uiState.f326661c;
        if (oVar2 instanceof n) {
            navBarWithToolbar.l0();
            n nVar = (n) oVar2;
            TextLocalisedClause textLocalisedClause = nVar.f326655a;
            navBarWithToolbar.setTitle(textLocalisedClause, null);
            navBarWithToolbar.setToolbarTitle(textLocalisedClause);
            navBarWithToolbar.setSecondDescriptionVisible(true);
            navBarWithToolbar.setSecondDescriptionText(nVar.f326656b);
        } else if (oVar2 instanceof o.a) {
            navBarWithToolbar.l0();
            navBarWithToolbar.setTitle(null);
        } else {
            if (!(oVar2 instanceof o.b)) {
                throw new NoWhenBranchMatchedException();
            }
            t3 t3Var = t3.DEFAULT;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar.I0(t3Var, false);
        }
        navBarWithToolbar.setMenuItems(uiState.d);
        ActionFooterView actionFooterView = d3().f300827c;
        actionFooterView.setVisibility(iVar == null ? 8 : 0);
        if (iVar != null) {
            actionFooterView.setModel(iVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (r) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        int i;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().d;
        int i2 = b.f326649a[this.K.f83842a.ordinal()];
        if (i2 == 1) {
            i = R$string.rev_points_personalisation_preferences_title;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.rev_points_personalisation_brands_title_v2;
        }
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(i, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(i, null, null, 14), null);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f300826b.setBackgroundType(AnimatedBackgroundType.DEFAULT.f51471a);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().d.f59410q), new d(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().d.o.f57403b), new zzb.e(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.P.f52371h.f121375b), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.O.f52338c.f121375b), new zzb.e(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.N.f51611c.f121375b), new g(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Q.e.f121375b), new zzb.e(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(d3().f300827c.f), new d(this, continuation, 1), 3);
    }

    public final wxb.h d3() {
        ViewBinding value = this.S.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (wxb.h) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final t R2() {
        return (t) this.U.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
