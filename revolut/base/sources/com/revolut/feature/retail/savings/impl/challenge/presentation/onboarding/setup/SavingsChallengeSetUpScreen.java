package com.revolut.feature.retail.savings.impl.challenge.presentation.onboarding.setup;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeSliderDelegate;
import com.revolut.core.ui_kit.delegates.LargeSliderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SimpleMediaDelegate;
import com.revolut.core.ui_kit.delegates.TagDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import com.revolut.core.ui_kit.views.navbar.l;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.feature.retail.savings.impl.R$id;
import com.revolut.feature.retail.savings.impl.R$layout;
import com.revolut.feature.retail.savings.impl.challenge.presentation.onboarding.setup.SavingsChallengeSetUpScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import d73.n;
import dg3.d;
import dkb.b;
import dkb.e;
import dkb.f;
import dkb.g;
import efm.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import vjb.c;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/challenge/presentation/onboarding/setup/SavingsChallengeSetUpScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ldkb/e;", "Ldli/a;", "Ldkb/g;", "<init>", "()V", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SavingsChallengeSetUpScreen extends ViewController<e> implements dli.a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(SavingsChallengeSetUpScreen.class, "binding", "getBinding()Lcom/revolut/feature/retail/savings/impl/databinding/ScreenSavingsChallengeSetUpBinding;", 0))};
    public final int K = R$layout.screen_savings_challenge_set_up;
    public final h L = s.t(this, a.f);
    public final LargeSliderDelegate M = new LargeSliderDelegate();
    public final RowDelegate N = new RowDelegate(null, null, 7);
    public final FullScreenStateDelegate O = new FullScreenStateDelegate();
    public final TagDelegate P = new TagDelegate();
    public final Object Q;
    public final Object R;
    public final Object S;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, xmb.e.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/retail/savings/impl/databinding/ScreenSavingsChallengeSetUpBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.challengeSetUp_largeActionButton;
            LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
            if (largeActionButton != null) {
                i = R$id.challengeSetUp_navBarLargeCentred;
                NavBarLargeCentred navBarLargeCentred = (NavBarLargeCentred) ViewBindings.findChildViewById(p0, i);
                if (navBarLargeCentred != null) {
                    i = R$id.challengeSetUp_recyclerView;
                    if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                        return new xmb.e((ControllerContainerCoordinatorLayout) p0, largeActionButton, navBarLargeCentred);
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public SavingsChallengeSetUpScreen() {
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: dkb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsChallengeSetUpScreen f115493b;

            {
                this.f115493b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SavingsChallengeSetUpScreen savingsChallengeSetUpScreen = this.f115493b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SavingsChallengeSetUpScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(savingsChallengeSetUpScreen.m2()).a().get(vjb.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vjb.g.class, " is not found"));
                        }
                        vjb.g gVar = ((vjb.g) aVar2.b()).f;
                        vjb.c cVar = new vjb.c();
                        cVar.f289684a = e4m.b.b(new ux8.b(gVar, 20));
                        return cVar;
                    case 1:
                        KProperty[] kPropertyArr2 = SavingsChallengeSetUpScreen.T;
                        return (f) ((vjb.c) savingsChallengeSetUpScreen.Q.getValue()).f289684a.get();
                    default:
                        KProperty[] kPropertyArr3 = SavingsChallengeSetUpScreen.T;
                        SavingsChallengeSetUpScreen savingsChallengeSetUpScreen2 = this.f115493b;
                        return dli.f.a(savingsChallengeSetUpScreen2, savingsChallengeSetUpScreen2.d(), v.k(savingsChallengeSetUpScreen2.M, savingsChallengeSetUpScreen2.N, savingsChallengeSetUpScreen2.O, savingsChallengeSetUpScreen2.P, new ListSubheaderDelegate(), new LargeSliderLoadingDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new SimpleMediaDelegate(), new TextDelegate()), R$id.challengeSetUp_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: dkb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsChallengeSetUpScreen f115493b;

            {
                this.f115493b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SavingsChallengeSetUpScreen savingsChallengeSetUpScreen = this.f115493b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SavingsChallengeSetUpScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(savingsChallengeSetUpScreen.m2()).a().get(vjb.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vjb.g.class, " is not found"));
                        }
                        vjb.g gVar = ((vjb.g) aVar2.b()).f;
                        vjb.c cVar = new vjb.c();
                        cVar.f289684a = e4m.b.b(new ux8.b(gVar, 20));
                        return cVar;
                    case 1:
                        KProperty[] kPropertyArr2 = SavingsChallengeSetUpScreen.T;
                        return (f) ((vjb.c) savingsChallengeSetUpScreen.Q.getValue()).f289684a.get();
                    default:
                        KProperty[] kPropertyArr3 = SavingsChallengeSetUpScreen.T;
                        SavingsChallengeSetUpScreen savingsChallengeSetUpScreen2 = this.f115493b;
                        return dli.f.a(savingsChallengeSetUpScreen2, savingsChallengeSetUpScreen2.d(), v.k(savingsChallengeSetUpScreen2.M, savingsChallengeSetUpScreen2.N, savingsChallengeSetUpScreen2.O, savingsChallengeSetUpScreen2.P, new ListSubheaderDelegate(), new LargeSliderLoadingDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new SimpleMediaDelegate(), new TextDelegate()), R$id.challengeSetUp_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: dkb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsChallengeSetUpScreen f115493b;

            {
                this.f115493b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SavingsChallengeSetUpScreen savingsChallengeSetUpScreen = this.f115493b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SavingsChallengeSetUpScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(savingsChallengeSetUpScreen.m2()).a().get(vjb.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vjb.g.class, " is not found"));
                        }
                        vjb.g gVar = ((vjb.g) aVar2.b()).f;
                        vjb.c cVar = new vjb.c();
                        cVar.f289684a = e4m.b.b(new ux8.b(gVar, 20));
                        return cVar;
                    case 1:
                        KProperty[] kPropertyArr2 = SavingsChallengeSetUpScreen.T;
                        return (f) ((vjb.c) savingsChallengeSetUpScreen.Q.getValue()).f289684a.get();
                    default:
                        KProperty[] kPropertyArr3 = SavingsChallengeSetUpScreen.T;
                        SavingsChallengeSetUpScreen savingsChallengeSetUpScreen2 = this.f115493b;
                        return dli.f.a(savingsChallengeSetUpScreen2, savingsChallengeSetUpScreen2.d(), v.k(savingsChallengeSetUpScreen2.M, savingsChallengeSetUpScreen2.N, savingsChallengeSetUpScreen2.O, savingsChallengeSetUpScreen2.P, new ListSubheaderDelegate(), new LargeSliderLoadingDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new SimpleMediaDelegate(), new TextDelegate()), R$id.challengeSetUp_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f307107b.setEnabled(uiState.f115499b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (c) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f307108c.setModel(new NavBarLargeCentred.Model(new l(new TextLocalisedClause(R$string.savings_challenge_onboarding_set_up_title, null, null, 14)), null, null, null, new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 990));
        d3().f307107b.setText(new TextLocalisedClause(R$string.savings_common_action_continue, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f307108c.f59292m), null, new b(this, continuation, 0), 3);
        r map = this.M.f52627c.filter(new n(new d(16), 27)).map(new n(new d(17), 28));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(map), null, new d8j.c(this, continuation, 22), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f307107b.o), null, new b(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f52371h.f121375b), null, new dkb.c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.d), null, new b(this, continuation, 2), 3);
    }

    public final xmb.e d3() {
        ViewBinding value = this.L.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (xmb.e) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final f d() {
        return (f) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
