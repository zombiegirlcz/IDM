package com.revolut.feature.freelancer.impl.ui.ecommerce.auth.screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.freelancer.impl.ui.ecommerce.auth.screen.FreelancerPluginAuthScreen;
import com.revolut.feature.freelancer.impl.ui.ecommerce.auth.screen.FreelancerPluginAuthScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ow6.b;
import ow6.c;
import ow6.e;
import ow6.f;
import ow6.g;
import te0.w;
import us6.i0;
import us6.j0;
import us6.q;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/ecommerce/auth/screen/FreelancerPluginAuthScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Low6/e;", "Ldli/a;", "Low6/g;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FreelancerPluginAuthScreen extends ViewController<e> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(FreelancerPluginAuthScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final FreelancerPluginAuthScreenContract$InputData K;
    public final h L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;

    public FreelancerPluginAuthScreen(FreelancerPluginAuthScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = R$layout.screen_recycler_navbar_footer_nextbutton;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: ow6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerPluginAuthScreen f230310b;

            {
                this.f230310b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FreelancerPluginAuthScreen freelancerPluginAuthScreen = this.f230310b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerPluginAuthScreen.Q;
                        FreelancerPluginAuthScreen freelancerPluginAuthScreen2 = this.f230310b;
                        return dli.f.a(freelancerPluginAuthScreen2, (f) freelancerPluginAuthScreen2.P.getValue(), v.k(new RowDelegate(null, null, 7), new ListSubheaderDelegate()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerPluginAuthScreen.Q;
                        qji.b bVarU2 = freelancerPluginAuthScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.ecommerce.auth.screen.di.FreelancerPluginAuthScreenInjector");
                        i0 i0Var = (i0) bVarU2;
                        q qVar = i0Var.f282573b;
                        i0 i0Var2 = i0Var.f282574c;
                        FreelancerPluginAuthScreenContract$InputData freelancerPluginAuthScreenContract$InputData = freelancerPluginAuthScreen.K;
                        freelancerPluginAuthScreenContract$InputData.getClass();
                        return new j0(qVar, i0Var2, freelancerPluginAuthScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = FreelancerPluginAuthScreen.Q;
                        return (f) ((j0) freelancerPluginAuthScreen.O.getValue()).f282588c.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: ow6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerPluginAuthScreen f230310b;

            {
                this.f230310b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FreelancerPluginAuthScreen freelancerPluginAuthScreen = this.f230310b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerPluginAuthScreen.Q;
                        FreelancerPluginAuthScreen freelancerPluginAuthScreen2 = this.f230310b;
                        return dli.f.a(freelancerPluginAuthScreen2, (f) freelancerPluginAuthScreen2.P.getValue(), v.k(new RowDelegate(null, null, 7), new ListSubheaderDelegate()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerPluginAuthScreen.Q;
                        qji.b bVarU2 = freelancerPluginAuthScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.ecommerce.auth.screen.di.FreelancerPluginAuthScreenInjector");
                        i0 i0Var = (i0) bVarU2;
                        q qVar = i0Var.f282573b;
                        i0 i0Var2 = i0Var.f282574c;
                        FreelancerPluginAuthScreenContract$InputData freelancerPluginAuthScreenContract$InputData = freelancerPluginAuthScreen.K;
                        freelancerPluginAuthScreenContract$InputData.getClass();
                        return new j0(qVar, i0Var2, freelancerPluginAuthScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = FreelancerPluginAuthScreen.Q;
                        return (f) ((j0) freelancerPluginAuthScreen.O.getValue()).f282588c.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: ow6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerPluginAuthScreen f230310b;

            {
                this.f230310b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                FreelancerPluginAuthScreen freelancerPluginAuthScreen = this.f230310b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerPluginAuthScreen.Q;
                        FreelancerPluginAuthScreen freelancerPluginAuthScreen2 = this.f230310b;
                        return dli.f.a(freelancerPluginAuthScreen2, (f) freelancerPluginAuthScreen2.P.getValue(), v.k(new RowDelegate(null, null, 7), new ListSubheaderDelegate()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerPluginAuthScreen.Q;
                        qji.b bVarU2 = freelancerPluginAuthScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.ecommerce.auth.screen.di.FreelancerPluginAuthScreenInjector");
                        i0 i0Var = (i0) bVarU2;
                        q qVar = i0Var.f282573b;
                        i0 i0Var2 = i0Var.f282574c;
                        FreelancerPluginAuthScreenContract$InputData freelancerPluginAuthScreenContract$InputData = freelancerPluginAuthScreen.K;
                        freelancerPluginAuthScreenContract$InputData.getClass();
                        return new j0(qVar, i0Var2, freelancerPluginAuthScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = FreelancerPluginAuthScreen.Q;
                        return (f) ((j0) freelancerPluginAuthScreen.O.getValue()).f282588c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((g) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (j0) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().e;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.freelancer_ecommerce_checkout_extension_header_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.freelancer_ecommerce_checkout_extension_header_title, null, null, 14), null);
        navBarWithToolbar.setHeaderTitleMode(tx0.j0.MULTILINE_LARGE);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.freelancer_ecommerce_checkout_extension_header_subtitle, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        LargeActionButton largeActionButton = d3().f174557b;
        largeActionButton.setText(new TextLocalisedClause(R$string.freelancer_ecommerce_checkout_extension_action_authorise, null, null, 14));
        largeActionButton.setLoadingButtonTag("AUTHORISE_BUTTON_LOADING_TAG");
        d3().f174558c.setTextClause(new TextLocalisedClause(R$string.freelancer_ecommerce_checkout_extension_footer, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.f59410q), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174557b.o), null, new c(this, null, 1), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
