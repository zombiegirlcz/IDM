package com.revolut.feature.retail.salary_account.impl.salary_hub;

import an9.g;
import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.c1;
import au0.m0;
import au0.s0;
import au0.u0;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PromotionalMediumTileDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.retail.salary_account.impl.salary_hub.SalaryHubController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import grl.k9;
import h23.b;
import hgb.i;
import hgb.j;
import hgb.p;
import hgb.t;
import hgb.u;
import java.util.List;
import jii.l;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import vc.s;
import wfb.k;
import xki.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/salary_hub/SalaryHubController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lhgb/p;", "Ldli/a;", "Lhgb/u;", "Lno/m;", "<init>", "()V", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SalaryHubController extends ViewController<p> implements dli.a, m {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(SalaryHubController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBigTitleNextbuttonBinding;", 0))};
    public final h K = s.t(this, a.f);
    public final Object L;
    public final AnalyticsProduct.Retail M;
    public final RowDelegate N;
    public final ActionWidgetDelegate O;
    public final PromotionalMediumTileDelegate P;
    public final FooterTextDelegate Q;
    public final FullScreenStateDelegate R;
    public final Object S;
    public final Object T;
    public final int U;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, l.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBigTitleNextbuttonBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return l.a(p0);
        }
    }

    public SalaryHubController() {
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: hgb.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SalaryHubController f152138b;

            {
                this.f152138b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SalaryHubController salaryHubController = this.f152138b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SalaryHubController.V;
                        return (l) ((wfb.k) salaryHubController.T.getValue()).f297059a.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SalaryHubController.V;
                        SalaryHubController salaryHubController2 = this.f152138b;
                        return dli.f.a(salaryHubController2, salaryHubController2.d(), zhm.v.k(new RowLoadingDelegate(), salaryHubController2.R, new ListSubheaderDelegate(), salaryHubController2.N, salaryHubController2.O, salaryHubController2.Q, salaryHubController2.P), R$id.screenRecyclerNavbarBigTitleNextbutton_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = SalaryHubController.V;
                        qji.b bVarU2 = salaryHubController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.salary_account.impl.salary_hub.di.SalaryHubControllerComponent.Injector");
                        wfb.i iVar = ((wfb.j) bVarU2).f297057b;
                        wfb.k kVar = new wfb.k();
                        kVar.f297059a = e4m.b.b(new wfb.a(iVar, kVar));
                        return kVar;
                }
            }
        });
        k9 k9Var = k9.Salary;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.M = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        this.N = new RowDelegate(null, null, 7);
        this.O = new ActionWidgetDelegate();
        this.P = new PromotionalMediumTileDelegate();
        this.Q = new FooterTextDelegate();
        this.R = new FullScreenStateDelegate();
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: hgb.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SalaryHubController f152138b;

            {
                this.f152138b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SalaryHubController salaryHubController = this.f152138b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SalaryHubController.V;
                        return (l) ((wfb.k) salaryHubController.T.getValue()).f297059a.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SalaryHubController.V;
                        SalaryHubController salaryHubController2 = this.f152138b;
                        return dli.f.a(salaryHubController2, salaryHubController2.d(), zhm.v.k(new RowLoadingDelegate(), salaryHubController2.R, new ListSubheaderDelegate(), salaryHubController2.N, salaryHubController2.O, salaryHubController2.Q, salaryHubController2.P), R$id.screenRecyclerNavbarBigTitleNextbutton_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = SalaryHubController.V;
                        qji.b bVarU2 = salaryHubController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.salary_account.impl.salary_hub.di.SalaryHubControllerComponent.Injector");
                        wfb.i iVar = ((wfb.j) bVarU2).f297057b;
                        wfb.k kVar = new wfb.k();
                        kVar.f297059a = e4m.b.b(new wfb.a(iVar, kVar));
                        return kVar;
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: hgb.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SalaryHubController f152138b;

            {
                this.f152138b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SalaryHubController salaryHubController = this.f152138b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SalaryHubController.V;
                        return (l) ((wfb.k) salaryHubController.T.getValue()).f297059a.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SalaryHubController.V;
                        SalaryHubController salaryHubController2 = this.f152138b;
                        return dli.f.a(salaryHubController2, salaryHubController2.d(), zhm.v.k(new RowLoadingDelegate(), salaryHubController2.R, new ListSubheaderDelegate(), salaryHubController2.N, salaryHubController2.O, salaryHubController2.Q, salaryHubController2.P), R$id.screenRecyclerNavbarBigTitleNextbutton_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = SalaryHubController.V;
                        qji.b bVarU2 = salaryHubController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.salary_account.impl.salary_hub.di.SalaryHubControllerComponent.Injector");
                        wfb.i iVar = ((wfb.j) bVarU2).f297057b;
                        wfb.k kVar = new wfb.k();
                        kVar.f297059a = e4m.b.b(new wfb.a(iVar, kVar));
                        return kVar;
                }
            }
        });
        this.U = R$layout.screen_recycler_navbar_big_title_nextbutton;
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        u uiState = (u) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithBigTile navBarWithBigTile = d3().f174537c;
        navBarWithBigTile.setLoadingState(uiState.f152155a);
        t tVar = uiState.f152156b;
        if (tVar != null) {
            navBarWithBigTile.setToolbarTitle(tVar.f152153a);
            c1.S(navBarWithBigTile, tVar.f152154b, null, null, 6);
        } else {
            navBarWithBigTile.setToolbarTitle(null);
            c1.S(navBarWithBigTile, zhm.u.c(new u0(NavBarWithContainerBackground.TransparentBackground.f57882a, null, null, null)), null, null, 6);
        }
        Clause clause = uiState.f152157c;
        LargeActionButton largeActionButton = d3().f174536b;
        largeActionButton.setVisibility(clause != null ? 0 : 8);
        if (clause != null) {
            largeActionButton.setText(clause);
        }
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getU() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (k) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithBigTile navBarWithBigTile = d3().f174537c;
        navBarWithBigTile.setLayoutType(s0.CENTERED_HORIZONTALLY);
        navBarWithBigTile.setBackgroundOverlayDecoration(m0.FULL_GRADIENT);
        navBarWithBigTile.setThemeBasedColorSchemeEnabled(true);
        navBarWithBigTile.setNavigationButtonIcon(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174537c.f59357t), new hgb.h(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174536b.o), new hgb.h(this, null, 1), 3);
        ViewController.P2(this, new b(rd0.e.b(this.N.f53218h), 17), new i(this, continuation, 0), 3);
        PromotionalMediumTileDelegate promotionalMediumTileDelegate = this.P;
        ViewController.P2(this, new g(vkm.q.J(rd0.e.b(promotionalMediumTileDelegate.f53038c), rd0.e.b(promotionalMediumTileDelegate.e)), 15), new i(this, continuation, 1), 3);
        ViewController.P2(this, new b(rd0.e.b(this.Q.e.f121375b), 18), new i(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(this.R.f52371h.f121375b), new j(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.O.f51589c.f121375b), new hgb.g(this, null), 3);
    }

    public final l d3() {
        ViewBinding value = this.K.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (l) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final hgb.l d() {
        return (hgb.l) this.L.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.S.getValue();
    }
}
