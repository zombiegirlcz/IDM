package com.revolut.feature.semi_independent_onboarding.impl.ui.details;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.e;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.semi_independent_onboarding.impl.ui.details.SemiIndependentOnboardingDetailsScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dze.n;
import e0b.c;
import e1d.f;
import e1d.g;
import jii.k;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/semi_independent_onboarding/impl/ui/details/SemiIndependentOnboardingDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Le1d/g;", "<init>", "()V", "feature_semi_independent_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SemiIndependentOnboardingDetailsScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(SemiIndependentOnboardingDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final Object K;
    public final int L = R$layout.screen_recycler_navbar_action_footer;
    public final h M = s.t(this, a.f);
    public final ListSubheaderDelegate N = new ListSubheaderDelegate();
    public final RowLoadingDelegate O = new RowLoadingDelegate();
    public final FullScreenStateDelegate P = new FullScreenStateDelegate();
    public final RowDelegate Q = new RowDelegate(null, null, 7);
    public final Object R;
    public final Object S;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, k.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return k.a(p0);
        }
    }

    public SemiIndependentOnboardingDetailsScreen() {
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: e1d.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SemiIndependentOnboardingDetailsScreen f121963b;

            {
                this.f121963b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SemiIndependentOnboardingDetailsScreen semiIndependentOnboardingDetailsScreen = this.f121963b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SemiIndependentOnboardingDetailsScreen.T;
                        return (e) ((c1d.b) semiIndependentOnboardingDetailsScreen.S.getValue()).f20451c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SemiIndependentOnboardingDetailsScreen.T;
                        SemiIndependentOnboardingDetailsScreen semiIndependentOnboardingDetailsScreen2 = this.f121963b;
                        return dli.f.a(semiIndependentOnboardingDetailsScreen2, semiIndependentOnboardingDetailsScreen2.d(), v.k(semiIndependentOnboardingDetailsScreen2.N, semiIndependentOnboardingDetailsScreen2.O, semiIndependentOnboardingDetailsScreen2.P, semiIndependentOnboardingDetailsScreen2.Q), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = SemiIndependentOnboardingDetailsScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(semiIndependentOnboardingDetailsScreen.m2()).a().get(c1d.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new c1d.b(((c1d.a) ((c1d.e) aVar2.b())).f20448g);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", c1d.e.class, " is not found"));
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: e1d.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SemiIndependentOnboardingDetailsScreen f121963b;

            {
                this.f121963b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SemiIndependentOnboardingDetailsScreen semiIndependentOnboardingDetailsScreen = this.f121963b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SemiIndependentOnboardingDetailsScreen.T;
                        return (e) ((c1d.b) semiIndependentOnboardingDetailsScreen.S.getValue()).f20451c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SemiIndependentOnboardingDetailsScreen.T;
                        SemiIndependentOnboardingDetailsScreen semiIndependentOnboardingDetailsScreen2 = this.f121963b;
                        return dli.f.a(semiIndependentOnboardingDetailsScreen2, semiIndependentOnboardingDetailsScreen2.d(), v.k(semiIndependentOnboardingDetailsScreen2.N, semiIndependentOnboardingDetailsScreen2.O, semiIndependentOnboardingDetailsScreen2.P, semiIndependentOnboardingDetailsScreen2.Q), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = SemiIndependentOnboardingDetailsScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(semiIndependentOnboardingDetailsScreen.m2()).a().get(c1d.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new c1d.b(((c1d.a) ((c1d.e) aVar2.b())).f20448g);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", c1d.e.class, " is not found"));
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: e1d.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SemiIndependentOnboardingDetailsScreen f121963b;

            {
                this.f121963b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SemiIndependentOnboardingDetailsScreen semiIndependentOnboardingDetailsScreen = this.f121963b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SemiIndependentOnboardingDetailsScreen.T;
                        return (e) ((c1d.b) semiIndependentOnboardingDetailsScreen.S.getValue()).f20451c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SemiIndependentOnboardingDetailsScreen.T;
                        SemiIndependentOnboardingDetailsScreen semiIndependentOnboardingDetailsScreen2 = this.f121963b;
                        return dli.f.a(semiIndependentOnboardingDetailsScreen2, semiIndependentOnboardingDetailsScreen2.d(), v.k(semiIndependentOnboardingDetailsScreen2.N, semiIndependentOnboardingDetailsScreen2.O, semiIndependentOnboardingDetailsScreen2.P, semiIndependentOnboardingDetailsScreen2.Q), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = SemiIndependentOnboardingDetailsScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(semiIndependentOnboardingDetailsScreen.m2()).a().get(c1d.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new c1d.b(((c1d.a) ((c1d.e) aVar2.b())).f20448g);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", c1d.e.class, " is not found"));
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        navBarWithToolbar.setToolbarTitle(uiState.f121968a.f121966a);
        f fVar = uiState.f121968a;
        navBarWithToolbar.setTitle(fVar.f121966a, null);
        navBarWithToolbar.setSecondDescriptionText(fVar.f121967b);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        ActionFooterView actionFooterView = d3().f174533b;
        e eVar = uiState.f121969b;
        actionFooterView.setVisibility(eVar != null ? 0 : 8);
        if (eVar != null) {
            actionFooterView.setModel(eVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (c1d.b) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174534c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174534c.f59410q), null, new n(this, continuation, 5), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174533b.f), null, new c(this, continuation, 4), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.f53220l), null, new e1d.b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f52371h.f121375b), null, new e1d.c(this, null), 3);
    }

    public final k d3() {
        ViewBinding value = this.M.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final e1d.e d() {
        return (e1d.e) this.K.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
