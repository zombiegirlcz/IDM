package com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.list;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.ActionNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.list.IncomeSortersListController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nqd.d;
import nqd.e;
import nqd.g;
import nqd.i;
import ppd.j0;
import ppd.n0;
import te0.w;
import vc.s;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/list/IncomeSortersListController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lnqd/e;", "<init>", "()V", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IncomeSortersListController extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(IncomeSortersListController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object M;
    public final Object N;
    public final Object Q;
    public final int K = R$layout.screen_recycler_navbar;
    public final h L = s.t(this, a.f);
    public final FullScreenStateDelegate O = new FullScreenStateDelegate();
    public final RowDelegate P = new RowDelegate(null, null, 7);

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
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

    public IncomeSortersListController() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: nqd.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IncomeSortersListController f218413b;

            {
                this.f218413b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                IncomeSortersListController incomeSortersListController = this.f218413b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = IncomeSortersListController.R;
                        qji.b bVarU2 = incomeSortersListController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.list.di.IncomeSortersListControllerInjector");
                        j0 j0Var = (j0) bVarU2;
                        return new n0(j0Var.f238443b, j0Var.f238444c);
                    case 1:
                        KProperty[] kPropertyArr2 = IncomeSortersListController.R;
                        return (d) ((n0) incomeSortersListController.M.getValue()).f238514b.get();
                    default:
                        KProperty[] kPropertyArr3 = IncomeSortersListController.R;
                        IncomeSortersListController incomeSortersListController2 = this.f218413b;
                        return dli.f.a(incomeSortersListController2, incomeSortersListController2.d(), v.k(incomeSortersListController2.O, new RowLoadingDelegate(), incomeSortersListController2.P), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: nqd.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IncomeSortersListController f218413b;

            {
                this.f218413b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                IncomeSortersListController incomeSortersListController = this.f218413b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = IncomeSortersListController.R;
                        qji.b bVarU2 = incomeSortersListController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.list.di.IncomeSortersListControllerInjector");
                        j0 j0Var = (j0) bVarU2;
                        return new n0(j0Var.f238443b, j0Var.f238444c);
                    case 1:
                        KProperty[] kPropertyArr2 = IncomeSortersListController.R;
                        return (d) ((n0) incomeSortersListController.M.getValue()).f238514b.get();
                    default:
                        KProperty[] kPropertyArr3 = IncomeSortersListController.R;
                        IncomeSortersListController incomeSortersListController2 = this.f218413b;
                        return dli.f.a(incomeSortersListController2, incomeSortersListController2.d(), v.k(incomeSortersListController2.O, new RowLoadingDelegate(), incomeSortersListController2.P), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: nqd.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IncomeSortersListController f218413b;

            {
                this.f218413b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                IncomeSortersListController incomeSortersListController = this.f218413b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = IncomeSortersListController.R;
                        qji.b bVarU2 = incomeSortersListController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.list.di.IncomeSortersListControllerInjector");
                        j0 j0Var = (j0) bVarU2;
                        return new n0(j0Var.f238443b, j0Var.f238444c);
                    case 1:
                        KProperty[] kPropertyArr2 = IncomeSortersListController.R;
                        return (d) ((n0) incomeSortersListController.M.getValue()).f238514b.get();
                    default:
                        KProperty[] kPropertyArr3 = IncomeSortersListController.R;
                        IncomeSortersListController incomeSortersListController2 = this.f218413b;
                        return dli.f.a(incomeSortersListController2, incomeSortersListController2.d(), v.k(incomeSortersListController2.O, new RowLoadingDelegate(), incomeSortersListController2.P), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((e) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (n0) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.analytics_income_sorter_list_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.analytics_income_sorter_list_title, null, null, 14));
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.analytics_income_sorter_list_subtitle, null, null, 14));
        navBarWithToolbar.setMenuItems(u.c(new ActionNavBarMenuItem(new TextLocalisedClause(R$string.analytics_income_sorter_list_create_cta, null, null, 14), LayeredImage.Companion.c(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_plus, Integer.valueOf(R$attr.uikit_colorBlack), new Color.Solid(R$attr.uikit_colorWhite), 4.0f, null, 48), "add_destinations")));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new g(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.o.f57403b), null, new g(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f52371h.f121375b), null, new nqd.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f53218h), null, new i(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final d d() {
        return (d) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.Q.getValue();
    }
}
