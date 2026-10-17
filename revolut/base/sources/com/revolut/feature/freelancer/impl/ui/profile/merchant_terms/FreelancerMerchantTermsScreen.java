package com.revolut.feature.freelancer.impl.ui.profile.merchant_terms;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.freelancer.impl.ui.profile.merchant_terms.FreelancerMerchantTermsScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import m07.b;
import m07.d;
import m07.f;
import m07.g;
import te0.w;
import tki.c;
import us6.a0;
import us6.p0;
import us6.z;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/profile/merchant_terms/FreelancerMerchantTermsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lm07/f;", "Ltki/c;", "Lm07/h;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FreelancerMerchantTermsScreen extends ViewController<f> implements c {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(FreelancerMerchantTermsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final h K = s.t(this, a.f);
    public final CellDetailsDelegate L = new CellDetailsDelegate();
    public final FullScreenStateDelegate M = new FullScreenStateDelegate();
    public final ListSubheaderDelegate N = new ListSubheaderDelegate();
    public final RowDelegate O = new RowDelegate(null, null, 7);
    public final int P = R$layout.screen_recycler_navbar;
    public final Object Q;
    public final Object R;
    public final Object S;

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

    public FreelancerMerchantTermsScreen() {
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: m07.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerMerchantTermsScreen f201090b;

            {
                this.f201090b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FreelancerMerchantTermsScreen freelancerMerchantTermsScreen = this.f201090b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerMerchantTermsScreen.T;
                        FreelancerMerchantTermsScreen freelancerMerchantTermsScreen2 = this.f201090b;
                        return tki.g.a(freelancerMerchantTermsScreen2, freelancerMerchantTermsScreen2.R2(), v.k(freelancerMerchantTermsScreen2.L, freelancerMerchantTermsScreen2.M, freelancerMerchantTermsScreen2.N, freelancerMerchantTermsScreen2.O, new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerMerchantTermsScreen.T;
                        qji.b bVarU2 = freelancerMerchantTermsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.profile.merchant_terms.di.FreelancerMerchantTermsScreenInjector");
                        us6.q qVar = ((p0) bVarU2).f282658b;
                        a0 a0Var = new a0();
                        a0Var.f282444a = e4m.b.b(new z(qVar, 0));
                        return a0Var;
                    default:
                        KProperty[] kPropertyArr3 = FreelancerMerchantTermsScreen.T;
                        return (g) ((a0) freelancerMerchantTermsScreen.R.getValue()).f282444a.get();
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: m07.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerMerchantTermsScreen f201090b;

            {
                this.f201090b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FreelancerMerchantTermsScreen freelancerMerchantTermsScreen = this.f201090b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerMerchantTermsScreen.T;
                        FreelancerMerchantTermsScreen freelancerMerchantTermsScreen2 = this.f201090b;
                        return tki.g.a(freelancerMerchantTermsScreen2, freelancerMerchantTermsScreen2.R2(), v.k(freelancerMerchantTermsScreen2.L, freelancerMerchantTermsScreen2.M, freelancerMerchantTermsScreen2.N, freelancerMerchantTermsScreen2.O, new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerMerchantTermsScreen.T;
                        qji.b bVarU2 = freelancerMerchantTermsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.profile.merchant_terms.di.FreelancerMerchantTermsScreenInjector");
                        us6.q qVar = ((p0) bVarU2).f282658b;
                        a0 a0Var = new a0();
                        a0Var.f282444a = e4m.b.b(new z(qVar, 0));
                        return a0Var;
                    default:
                        KProperty[] kPropertyArr3 = FreelancerMerchantTermsScreen.T;
                        return (g) ((a0) freelancerMerchantTermsScreen.R.getValue()).f282444a.get();
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: m07.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerMerchantTermsScreen f201090b;

            {
                this.f201090b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                FreelancerMerchantTermsScreen freelancerMerchantTermsScreen = this.f201090b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerMerchantTermsScreen.T;
                        FreelancerMerchantTermsScreen freelancerMerchantTermsScreen2 = this.f201090b;
                        return tki.g.a(freelancerMerchantTermsScreen2, freelancerMerchantTermsScreen2.R2(), v.k(freelancerMerchantTermsScreen2.L, freelancerMerchantTermsScreen2.M, freelancerMerchantTermsScreen2.N, freelancerMerchantTermsScreen2.O, new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerMerchantTermsScreen.T;
                        qji.b bVarU2 = freelancerMerchantTermsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.profile.merchant_terms.di.FreelancerMerchantTermsScreenInjector");
                        us6.q qVar = ((p0) bVarU2).f282658b;
                        a0 a0Var = new a0();
                        a0Var.f282444a = e4m.b.b(new z(qVar, 0));
                        return a0Var;
                    default:
                        KProperty[] kPropertyArr3 = FreelancerMerchantTermsScreen.T;
                        return (g) ((a0) freelancerMerchantTermsScreen.R.getValue()).f282444a.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((m07.h) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (a0) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.K.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.freelancer_merchant_terms_header_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.freelancer_merchant_terms_header_title, null, null, 14), null);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.freelancer_merchant_terms_header_subtitle, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.K.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new lpl.c(this, null, 11), 3);
        ViewController.P2(this, rd0.e.b(this.O.f53218h), new b(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.M.f52371h.f121375b), new m07.c(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.d), new d(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final g R2() {
        return (g) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.Q.getValue();
    }
}
