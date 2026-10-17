package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_terms_screen;

import android.content.Intent;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenDocumentLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.WebViewDelegate;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_terms_screen.PlanTermsScreen;
import dli.c;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import nnk.b;
import nnk.d;
import nnk.f;
import qgk.i0;
import qgk.m1;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_terms_screen/PlanTermsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lnnk/d;", "Ldli/a;", "Lnnk/f;", "<init>", "()V", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlanTermsScreen extends ViewController<d> implements dli.a {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(PlanTermsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object L;
    public final Object N;
    public final Object O;
    public final int K = R$layout.screen_recycler_navbar;
    public final h M = s.t(this, a.f);

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return m.a(p0);
        }
    }

    public PlanTermsScreen() {
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: nnk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanTermsScreen f217711b;

            {
                this.f217711b = this;
            }

            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PlanTermsScreen planTermsScreen = this.f217711b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PlanTermsScreen.P;
                        PlanTermsScreen planTermsScreen2 = this.f217711b;
                        return dli.f.a(planTermsScreen2, planTermsScreen2.d(), v.k(new WebViewDelegate(), new FullScreenDocumentLoadingDelegate(), new FullScreenStateDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanTermsScreen.P;
                        phm.a aVar = (phm.a) ue0.e.j(planTermsScreen.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new m1(((i0) aVar2.b()).X);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = PlanTermsScreen.P;
                        return (e) ((m1) planTermsScreen.N.getValue()).f246137c.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: nnk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanTermsScreen f217711b;

            {
                this.f217711b = this;
            }

            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PlanTermsScreen planTermsScreen = this.f217711b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanTermsScreen.P;
                        PlanTermsScreen planTermsScreen2 = this.f217711b;
                        return dli.f.a(planTermsScreen2, planTermsScreen2.d(), v.k(new WebViewDelegate(), new FullScreenDocumentLoadingDelegate(), new FullScreenStateDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanTermsScreen.P;
                        phm.a aVar = (phm.a) ue0.e.j(planTermsScreen.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new m1(((i0) aVar2.b()).X);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = PlanTermsScreen.P;
                        return (e) ((m1) planTermsScreen.N.getValue()).f246137c.get();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: nnk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanTermsScreen f217711b;

            {
                this.f217711b = this;
            }

            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PlanTermsScreen planTermsScreen = this.f217711b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanTermsScreen.P;
                        PlanTermsScreen planTermsScreen2 = this.f217711b;
                        return dli.f.a(planTermsScreen2, planTermsScreen2.d(), v.k(new WebViewDelegate(), new FullScreenDocumentLoadingDelegate(), new FullScreenStateDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanTermsScreen.P;
                        phm.a aVar = (phm.a) ue0.e.j(planTermsScreen.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new m1(((i0) aVar2.b()).X);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = PlanTermsScreen.P;
                        return (e) ((m1) planTermsScreen.N.getValue()).f246137c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        TextClause textClause = uiState.f217716a;
        navBarWithToolbar.setToolbarTitle(textClause);
        navBarWithToolbar.setTitle(textClause, null);
        navBarWithToolbar.setMenuItems(uiState.f217717b);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((nnk.h) d()).I2();
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (m1) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void W2(int i, int i2, Intent intent) {
        nnk.h hVar = (nnk.h) d();
        if (i == 10013) {
            hVar.C2(d.b.f217715a);
        } else {
            hVar.getClass();
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new b(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.o.f57403b), null, new b(this, null, 1), 3);
    }

    public final m d3() {
        ViewBinding value = this.M.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final nnk.e d() {
        return (nnk.e) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getT() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.L.getValue();
    }
}
