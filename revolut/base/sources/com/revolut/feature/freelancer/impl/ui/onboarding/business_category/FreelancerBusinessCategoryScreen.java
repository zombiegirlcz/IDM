package com.revolut.feature.freelancer.impl.ui.onboarding.business_category;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import au0.j4;
import cli.o;
import cli.y;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.freelancer.impl.ui.onboarding.business_category.FreelancerBusinessCategoryScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import h30.l;
import hp2.d;
import hsl.c;
import hwi.l0;
import hz6.e;
import hz6.f;
import hz6.h;
import hz6.i;
import hz6.j;
import hz6.k;
import jii.m;
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
import tx0.j0;
import us6.d0;
import us6.r;
import vc.s;
import vkm.j2;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/onboarding/business_category/FreelancerBusinessCategoryScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lhz6/h;", "Ldli/a;", "Lhz6/j;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FreelancerBusinessCategoryScreen extends ViewController<h> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(FreelancerBusinessCategoryScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar;
    public final ao.h L = s.t(this, a.f);
    public final FullScreenStateDelegate M = new FullScreenStateDelegate();
    public final RowDelegate N = new RowDelegate(null, null, 7);
    public final Object O;
    public final Object P;
    public final Object Q;

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

    public FreelancerBusinessCategoryScreen() {
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: hz6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerBusinessCategoryScreen f157037b;

            {
                this.f157037b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FreelancerBusinessCategoryScreen freelancerBusinessCategoryScreen = this.f157037b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerBusinessCategoryScreen.R;
                        qji.b bVarU2 = freelancerBusinessCategoryScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.onboarding.business_category.di.FreelancerBusinessCategoryScreenInjector");
                        d0 d0Var = (d0) bVarU2;
                        us6.q qVar = d0Var.f282487c;
                        d0 d0Var2 = d0Var.d;
                        r rVar = new r();
                        int i3 = 16;
                        rVar.f282727a = e4m.b.b(new r7d.w(qVar, d0Var2, rVar, 1, i3));
                        rVar.f282728b = e4m.b.b(new r7d.w(qVar, d0Var2, rVar, 0, i3));
                        return rVar;
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerBusinessCategoryScreen.R;
                        return (k) ((r) freelancerBusinessCategoryScreen.O.getValue()).f282728b.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerBusinessCategoryScreen.R;
                        FreelancerBusinessCategoryScreen freelancerBusinessCategoryScreen2 = this.f157037b;
                        return dli.f.a(freelancerBusinessCategoryScreen2, freelancerBusinessCategoryScreen2.R2(), v.k(freelancerBusinessCategoryScreen2.M, freelancerBusinessCategoryScreen2.N, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: hz6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerBusinessCategoryScreen f157037b;

            {
                this.f157037b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FreelancerBusinessCategoryScreen freelancerBusinessCategoryScreen = this.f157037b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerBusinessCategoryScreen.R;
                        qji.b bVarU2 = freelancerBusinessCategoryScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.onboarding.business_category.di.FreelancerBusinessCategoryScreenInjector");
                        d0 d0Var = (d0) bVarU2;
                        us6.q qVar = d0Var.f282487c;
                        d0 d0Var2 = d0Var.d;
                        r rVar = new r();
                        int i3 = 16;
                        rVar.f282727a = e4m.b.b(new r7d.w(qVar, d0Var2, rVar, 1, i3));
                        rVar.f282728b = e4m.b.b(new r7d.w(qVar, d0Var2, rVar, 0, i3));
                        return rVar;
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerBusinessCategoryScreen.R;
                        return (k) ((r) freelancerBusinessCategoryScreen.O.getValue()).f282728b.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerBusinessCategoryScreen.R;
                        FreelancerBusinessCategoryScreen freelancerBusinessCategoryScreen2 = this.f157037b;
                        return dli.f.a(freelancerBusinessCategoryScreen2, freelancerBusinessCategoryScreen2.R2(), v.k(freelancerBusinessCategoryScreen2.M, freelancerBusinessCategoryScreen2.N, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: hz6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerBusinessCategoryScreen f157037b;

            {
                this.f157037b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                FreelancerBusinessCategoryScreen freelancerBusinessCategoryScreen = this.f157037b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerBusinessCategoryScreen.R;
                        qji.b bVarU2 = freelancerBusinessCategoryScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.onboarding.business_category.di.FreelancerBusinessCategoryScreenInjector");
                        d0 d0Var = (d0) bVarU2;
                        us6.q qVar = d0Var.f282487c;
                        d0 d0Var2 = d0Var.d;
                        r rVar = new r();
                        int i32 = 16;
                        rVar.f282727a = e4m.b.b(new r7d.w(qVar, d0Var2, rVar, 1, i32));
                        rVar.f282728b = e4m.b.b(new r7d.w(qVar, d0Var2, rVar, 0, i32));
                        return rVar;
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerBusinessCategoryScreen.R;
                        return (k) ((r) freelancerBusinessCategoryScreen.O.getValue()).f282728b.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerBusinessCategoryScreen.R;
                        FreelancerBusinessCategoryScreen freelancerBusinessCategoryScreen2 = this.f157037b;
                        return dli.f.a(freelancerBusinessCategoryScreen2, freelancerBusinessCategoryScreen2.R2(), v.k(freelancerBusinessCategoryScreen2.M, freelancerBusinessCategoryScreen2.N, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        i iVar = uiState.f157047a;
        navBarWithToolbar.setMenuItems(iVar.f157046b);
        if (iVar.f157045a) {
            navBarWithToolbar.j0(false);
            navBarWithToolbar.K0(j4.FROM_CLICKED_BUTTON);
        } else {
            navBarWithToolbar.H0(false);
            navBarWithToolbar.m0(j4.FROM_CLICKED_BUTTON);
            navBarWithToolbar.i0();
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        if (!((e) ((j2) R2().f157051r.f22677a).getValue()).f157042c) {
            return super.F2();
        }
        k kVarR2 = R2();
        y yVar = kVarR2.f157051r;
        if (((e) ((j2) yVar.f22677a).getValue()).f157042c) {
            kVarR2.H2(yVar, new g7b.q(false, 17));
            return true;
        }
        kVarR2.C2(f.f157043a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (r) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.freelancer_business_category_picker_header_title, null, null, 14);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.freelancer_business_category_picker_header_caption, null, null, 14));
        navBarWithToolbar.setDescriptionVisible(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, l.y(d3().f174539b.f59410q, d3().f174539b.f59409p.f57336l, "merge(...)"), null, new l0(this, continuation, 4), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.o.f57403b), null, new d(this, continuation, 22), 3);
        com.revolut.kompot.navigable.a.g2(this, t1.d(rd0.e.b(d3().f174539b.f59409p.f57337m), 300L), null, new hp4.e(2, R2(), k.class, "onSearchQueryChanged", "onSearchQueryChanged(Ljava/lang/String;)V", 4, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, new c(rd0.e.b(this.M.f52371h.f121375b), 11), null, new hz6.d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new c(rd0.e.b(this.N.f53218h), 12), null, new hp4.e(2, R2(), k.class, "onBusinessCategoryClicked", "onBusinessCategoryClicked(Lcom/revolut/feature/freelancer/common/models/onboarding/BusinessCategory;)V", 4, 3), 3);
    }

    public final m d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final k R2() {
        return (k) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
