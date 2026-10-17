package com.revolut.feature.rev_points.impl.ui.personalisation_targeting_onboarding;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.c1;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.feature.rev_points.impl.R$id;
import com.revolut.feature.rev_points.impl.R$layout;
import com.revolut.feature.rev_points.impl.ui.personalisation_targeting_onboarding.RevPointsPersonalisationTargetingOnboardingScreen;
import com.revolut.feature.rev_points.impl.ui.personalisation_targeting_onboarding.RevPointsPersonalisationTargetingOnboardingScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tzb.b;
import tzb.c;
import tzb.e;
import tzb.f;
import tzb.i;
import vc.s;
import wxb.g;
import zhm.v;
import zxb.p;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/personalisation_targeting_onboarding/RevPointsPersonalisationTargetingOnboardingScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Ltzb/f;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevPointsPersonalisationTargetingOnboardingScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(RevPointsPersonalisationTargetingOnboardingScreen.class, "binding", "getBinding()Lcom/revolut/feature/rev_points/impl/databinding/ScreenRevPointsPersonalisationTargetingOnboardingBinding;", 0))};
    public final RevPointsPersonalisationTargetingOnboardingScreenContract$InputData K;
    public final int L;
    public final RowDelegate M;
    public final Object N;
    public final h O;
    public final Object P;
    public final Object Q;

    public RevPointsPersonalisationTargetingOnboardingScreen(RevPointsPersonalisationTargetingOnboardingScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_rev_points_personalisation_targeting_onboarding;
        this.M = new RowDelegate(null, null, 7);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: tzb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsPersonalisationTargetingOnboardingScreen f275900b;

            {
                this.f275900b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RevPointsPersonalisationTargetingOnboardingScreen revPointsPersonalisationTargetingOnboardingScreen = this.f275900b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsPersonalisationTargetingOnboardingScreen.R;
                        RevPointsPersonalisationTargetingOnboardingScreen revPointsPersonalisationTargetingOnboardingScreen2 = this.f275900b;
                        return dli.f.a(revPointsPersonalisationTargetingOnboardingScreen2, (i) revPointsPersonalisationTargetingOnboardingScreen2.Q.getValue(), v.k(new TextDelegate(), revPointsPersonalisationTargetingOnboardingScreen2.M), R$id.revPointsPersonalisationTargetingOnboardingScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsPersonalisationTargetingOnboardingScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsPersonalisationTargetingOnboardingScreen.m2()).a().get(zxb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", zxb.e.class, " is not found"));
                        }
                        zxb.e eVar = ((zxb.e) aVar2.b()).V;
                        RevPointsPersonalisationTargetingOnboardingScreenContract$InputData revPointsPersonalisationTargetingOnboardingScreenContract$InputData = revPointsPersonalisationTargetingOnboardingScreen.K;
                        revPointsPersonalisationTargetingOnboardingScreenContract$InputData.getClass();
                        return new p(eVar, revPointsPersonalisationTargetingOnboardingScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = RevPointsPersonalisationTargetingOnboardingScreen.R;
                        return (i) ((p) revPointsPersonalisationTargetingOnboardingScreen.P.getValue()).f326239c.get();
                }
            }
        });
        this.O = s.t(this, b.f);
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: tzb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsPersonalisationTargetingOnboardingScreen f275900b;

            {
                this.f275900b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RevPointsPersonalisationTargetingOnboardingScreen revPointsPersonalisationTargetingOnboardingScreen = this.f275900b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsPersonalisationTargetingOnboardingScreen.R;
                        RevPointsPersonalisationTargetingOnboardingScreen revPointsPersonalisationTargetingOnboardingScreen2 = this.f275900b;
                        return dli.f.a(revPointsPersonalisationTargetingOnboardingScreen2, (i) revPointsPersonalisationTargetingOnboardingScreen2.Q.getValue(), v.k(new TextDelegate(), revPointsPersonalisationTargetingOnboardingScreen2.M), R$id.revPointsPersonalisationTargetingOnboardingScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsPersonalisationTargetingOnboardingScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsPersonalisationTargetingOnboardingScreen.m2()).a().get(zxb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", zxb.e.class, " is not found"));
                        }
                        zxb.e eVar = ((zxb.e) aVar2.b()).V;
                        RevPointsPersonalisationTargetingOnboardingScreenContract$InputData revPointsPersonalisationTargetingOnboardingScreenContract$InputData = revPointsPersonalisationTargetingOnboardingScreen.K;
                        revPointsPersonalisationTargetingOnboardingScreenContract$InputData.getClass();
                        return new p(eVar, revPointsPersonalisationTargetingOnboardingScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = RevPointsPersonalisationTargetingOnboardingScreen.R;
                        return (i) ((p) revPointsPersonalisationTargetingOnboardingScreen.P.getValue()).f326239c.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: tzb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsPersonalisationTargetingOnboardingScreen f275900b;

            {
                this.f275900b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RevPointsPersonalisationTargetingOnboardingScreen revPointsPersonalisationTargetingOnboardingScreen = this.f275900b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsPersonalisationTargetingOnboardingScreen.R;
                        RevPointsPersonalisationTargetingOnboardingScreen revPointsPersonalisationTargetingOnboardingScreen2 = this.f275900b;
                        return dli.f.a(revPointsPersonalisationTargetingOnboardingScreen2, (i) revPointsPersonalisationTargetingOnboardingScreen2.Q.getValue(), v.k(new TextDelegate(), revPointsPersonalisationTargetingOnboardingScreen2.M), R$id.revPointsPersonalisationTargetingOnboardingScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsPersonalisationTargetingOnboardingScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsPersonalisationTargetingOnboardingScreen.m2()).a().get(zxb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", zxb.e.class, " is not found"));
                        }
                        zxb.e eVar = ((zxb.e) aVar2.b()).V;
                        RevPointsPersonalisationTargetingOnboardingScreenContract$InputData revPointsPersonalisationTargetingOnboardingScreenContract$InputData = revPointsPersonalisationTargetingOnboardingScreen.K;
                        revPointsPersonalisationTargetingOnboardingScreenContract$InputData.getClass();
                        return new p(eVar, revPointsPersonalisationTargetingOnboardingScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = RevPointsPersonalisationTargetingOnboardingScreen.R;
                        return (i) ((p) revPointsPersonalisationTargetingOnboardingScreen.P.getValue()).f326239c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f300823b.setModel(uiState.f275907c);
        NavBarWithBigTile navBarWithBigTile = d3().f300824c;
        navBarWithBigTile.setThemeBasedColorSchemeEnabled(true);
        e eVar = uiState.f275906b;
        c1.S(navBarWithBigTile, eVar.f275903a, null, null, 6);
        navBarWithBigTile.setToolbarTitle(eVar.f275904b);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (p) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (i) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f300823b.f), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f300823b.f58955g), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f300823b.e), null, new c(this, null, 2), 3);
    }

    public final g d3() {
        ViewBinding value = this.O.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (g) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
