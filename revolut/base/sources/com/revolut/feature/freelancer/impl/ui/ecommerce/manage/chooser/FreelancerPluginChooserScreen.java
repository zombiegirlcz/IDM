package com.revolut.feature.freelancer.impl.ui.ecommerce.manage.chooser;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.freelancer.impl.ui.ecommerce.manage.chooser.FreelancerPluginChooserScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import qg4.d;
import qw6.b;
import qw6.c;
import qw6.g;
import qw6.i;
import te0.w;
import us6.k0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/ecommerce/manage/chooser/FreelancerPluginChooserScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lqw6/g;", "Ldli/a;", "Lqw6/h;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FreelancerPluginChooserScreen extends ViewController<g> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(FreelancerPluginChooserScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K;
    public final h L;
    public final RowDelegate M;
    public final Object N;
    public final Object O;
    public final Object P;

    public FreelancerPluginChooserScreen(FreelancerPluginChooserScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar;
        this.L = s.t(this, b.f);
        this.M = new RowDelegate(null, null, 7);
        this.N = w.y0(new qvf.a(this, inputData, 2));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: qw6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerPluginChooserScreen f249784b;

            {
                this.f249784b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerPluginChooserScreen.Q;
                        return (i) ((k0) this.f249784b.N.getValue()).f282599b.get();
                    default:
                        KProperty[] kPropertyArr2 = FreelancerPluginChooserScreen.Q;
                        FreelancerPluginChooserScreen freelancerPluginChooserScreen = this.f249784b;
                        return dli.f.a(freelancerPluginChooserScreen, (i) freelancerPluginChooserScreen.O.getValue(), v.k(freelancerPluginChooserScreen.M, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: qw6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerPluginChooserScreen f249784b;

            {
                this.f249784b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerPluginChooserScreen.Q;
                        return (i) ((k0) this.f249784b.N.getValue()).f282599b.get();
                    default:
                        KProperty[] kPropertyArr2 = FreelancerPluginChooserScreen.Q;
                        FreelancerPluginChooserScreen freelancerPluginChooserScreen = this.f249784b;
                        return dli.f.a(freelancerPluginChooserScreen, (i) freelancerPluginChooserScreen.O.getValue(), v.k(freelancerPluginChooserScreen.M, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((qw6.h) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (k0) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (i) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.freelancer_ecommerce_options_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.freelancer_ecommerce_options_description, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new d(this, null, 24), 3);
        ViewController.P2(this, rd0.e.b(this.M.f53218h), new c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getX() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
