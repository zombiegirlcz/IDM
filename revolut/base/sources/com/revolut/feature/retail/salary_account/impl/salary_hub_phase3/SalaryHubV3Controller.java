package com.revolut.feature.retail.salary_account.impl.salary_hub_phase3;

import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.c1;
import au0.m0;
import au0.s0;
import au0.u0;
import aw0.i;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PromotionalMediumTileDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.SalaryHubV3Controller;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.c;
import grl.k9;
import ihm.f;
import java.util.List;
import jii.c0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import mkd.g;
import no.m;
import om4.m1;
import p73.d;
import pgb.j;
import pgb.n;
import pgb.r;
import te0.w;
import vc.s;
import wfb.l;
import wp5.y;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/salary_hub_phase3/SalaryHubV3Controller;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lpgb/n;", "Ldli/a;", "Lpgb/s;", "Lno/m;", "Lmkd/g;", "<init>", "()V", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SalaryHubV3Controller extends ViewController<n> implements dli.a, m, g {
    public static final /* synthetic */ KProperty[] Z = {o0.f186429a.j(new h0(SalaryHubV3Controller.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarwithbigtileActionfooterBinding;", 0))};
    public final h K = s.t(this, a.f);
    public final Object L;
    public final AnalyticsProduct.Retail M;
    public final RowDelegate N;
    public final PromotionalMediumTileDelegate O;
    public final FooterTextDelegate P;
    public final FullScreenStateDelegate Q;
    public final ListSubheaderDelegate R;
    public final ActionWidgetDelegate S;
    public final HeroBannerDelegate T;
    public final ScrollerDelegate U;
    public final f V;
    public final Object W;
    public final Object X;
    public final int Y;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, c0.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarwithbigtileActionfooterBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return c0.a(p0);
        }
    }

    public SalaryHubV3Controller() {
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: pgb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SalaryHubV3Controller f235835b;

            {
                this.f235835b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SalaryHubV3Controller salaryHubV3Controller = this.f235835b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SalaryHubV3Controller.Z;
                        return (j) ((wfb.l) salaryHubV3Controller.X.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SalaryHubV3Controller.Z;
                        SalaryHubV3Controller salaryHubV3Controller2 = this.f235835b;
                        return dli.f.a(salaryHubV3Controller2, salaryHubV3Controller2.R2(), zhm.v.k(new RowLoadingDelegate(), salaryHubV3Controller2.Q, salaryHubV3Controller2.R, salaryHubV3Controller2.N, salaryHubV3Controller2.P, salaryHubV3Controller2.O, salaryHubV3Controller2.S, salaryHubV3Controller2.T, salaryHubV3Controller2.U), R$id.screenRecyclerNavBarWithBigTileActionFooter_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = SalaryHubV3Controller.Z;
                        qji.b bVarU2 = salaryHubV3Controller.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.di.SalaryHubV3ControllerComponent.Injector");
                        wfb.j jVar = (wfb.j) bVarU2;
                        return new wfb.l(jVar.f297057b, jVar.f297058c, salaryHubV3Controller);
                }
            }
        });
        k9 k9Var = k9.Salary;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.M = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        this.N = new RowDelegate(null, null, 7);
        this.O = new PromotionalMediumTileDelegate();
        this.P = new FooterTextDelegate();
        this.Q = new FullScreenStateDelegate();
        this.R = new ListSubheaderDelegate();
        ActionWidgetDelegate actionWidgetDelegate = new ActionWidgetDelegate();
        this.S = actionWidgetDelegate;
        HeroBannerDelegate heroBannerDelegate = new HeroBannerDelegate(0);
        this.T = heroBannerDelegate;
        final int i2 = 2;
        final int i3 = 1;
        this.U = new ScrollerDelegate(v.k(actionWidgetDelegate, heroBannerDelegate), false);
        this.V = v0.a.d("create(...)");
        this.W = w.y0(new Function0(this) { // from class: pgb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SalaryHubV3Controller f235835b;

            {
                this.f235835b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SalaryHubV3Controller salaryHubV3Controller = this.f235835b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SalaryHubV3Controller.Z;
                        return (j) ((wfb.l) salaryHubV3Controller.X.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SalaryHubV3Controller.Z;
                        SalaryHubV3Controller salaryHubV3Controller2 = this.f235835b;
                        return dli.f.a(salaryHubV3Controller2, salaryHubV3Controller2.R2(), zhm.v.k(new RowLoadingDelegate(), salaryHubV3Controller2.Q, salaryHubV3Controller2.R, salaryHubV3Controller2.N, salaryHubV3Controller2.P, salaryHubV3Controller2.O, salaryHubV3Controller2.S, salaryHubV3Controller2.T, salaryHubV3Controller2.U), R$id.screenRecyclerNavBarWithBigTileActionFooter_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = SalaryHubV3Controller.Z;
                        qji.b bVarU2 = salaryHubV3Controller.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.di.SalaryHubV3ControllerComponent.Injector");
                        wfb.j jVar = (wfb.j) bVarU2;
                        return new wfb.l(jVar.f297057b, jVar.f297058c, salaryHubV3Controller);
                }
            }
        });
        this.X = w.y0(new Function0(this) { // from class: pgb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SalaryHubV3Controller f235835b;

            {
                this.f235835b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SalaryHubV3Controller salaryHubV3Controller = this.f235835b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SalaryHubV3Controller.Z;
                        return (j) ((wfb.l) salaryHubV3Controller.X.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SalaryHubV3Controller.Z;
                        SalaryHubV3Controller salaryHubV3Controller2 = this.f235835b;
                        return dli.f.a(salaryHubV3Controller2, salaryHubV3Controller2.R2(), zhm.v.k(new RowLoadingDelegate(), salaryHubV3Controller2.Q, salaryHubV3Controller2.R, salaryHubV3Controller2.N, salaryHubV3Controller2.P, salaryHubV3Controller2.O, salaryHubV3Controller2.S, salaryHubV3Controller2.T, salaryHubV3Controller2.U), R$id.screenRecyclerNavBarWithBigTileActionFooter_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = SalaryHubV3Controller.Z;
                        qji.b bVarU2 = salaryHubV3Controller.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.di.SalaryHubV3ControllerComponent.Injector");
                        wfb.j jVar = (wfb.j) bVarU2;
                        return new wfb.l(jVar.f297057b, jVar.f297058c, salaryHubV3Controller);
                }
            }
        });
        this.Y = R$layout.screen_recycler_navbarwithbigtile_actionfooter;
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        pgb.s uiState = (pgb.s) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithBigTile navBarWithBigTile = d3().f174505c;
        boolean z = uiState.f235851a;
        i iVar = uiState.f235853c;
        navBarWithBigTile.setLoadingState(z);
        r rVar = uiState.f235852b;
        if (rVar != null) {
            navBarWithBigTile.setToolbarTitle(rVar.f235849a);
            c1.S(navBarWithBigTile, rVar.f235850b, null, null, 6);
        } else {
            navBarWithBigTile.setToolbarTitle(null);
            c1.S(navBarWithBigTile, u.c(new u0(NavBarWithContainerBackground.TransparentBackground.f57882a, null, null, null)), null, null, 6);
        }
        ActionFooterView actionFooterView = d3().f174504b;
        actionFooterView.setVisibility(iVar != null ? 0 : 8);
        if (iVar != null) {
            actionFooterView.setModel(iVar);
        }
    }

    @Override // mkd.g
    public final efm.r F1() {
        return this.U.i;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l) this.X.getValue();
    }

    @Override // jkd.b
    public final efm.r X1() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithBigTile navBarWithBigTile = d3().f174505c;
        navBarWithBigTile.setLayoutType(s0.CENTERED_HORIZONTALLY);
        navBarWithBigTile.setBackgroundOverlayDecoration(m0.FULL_GRADIENT);
        navBarWithBigTile.setThemeBasedColorSchemeEnabled(true);
        navBarWithBigTile.setNavigationButtonIcon(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        xv0.w wVar = new xv0.w(new m1(1, this.V, f.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 25), null);
        ScreenContentRecyclerView screenContentRecyclerView = d3().d;
        Intrinsics.checkNotNullExpressionValue(screenContentRecyclerView, "screenRecyclerNavBarWith…eActionFooterRecyclerView");
        wVar.b(screenContentRecyclerView);
        d3().d.setTag(com.revolut.core.ui_kit.R$id.uikit_main_scrollable_view, "MAIN_SCROLLABLE_TAG");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174505c.f59357t), new pgb.f(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174504b.f), new pgb.f(this, continuation, 1), 3);
        ViewController.P2(this, new d(rd0.e.b(d3().f174504b.e), 5), new pgb.g(this, null, 0), 3);
        RowDelegate rowDelegate = this.N;
        ViewController.P2(this, y.x(rowDelegate.f53218h, rowDelegate.f53220l, "mergeWith(...)"), new pgb.h(this, null), 3);
        PromotionalMediumTileDelegate promotionalMediumTileDelegate = this.O;
        ViewController.P2(this, new an9.g(vkm.q.J(rd0.e.b(promotionalMediumTileDelegate.f53038c), rd0.e.b(promotionalMediumTileDelegate.e)), 20), new pgb.g(this, null, 1), 3);
        ViewController.P2(this, new d(rd0.e.b(this.P.e.f121375b), 6), new pgb.g(this, null, 2), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f52371h.f121375b), new pgb.e(this, null), 3);
    }

    public final c0 d3() {
        ViewBinding value = this.K.getValue(this, Z[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (c0) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j R2() {
        return (j) this.L.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.Y;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.W.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // mkd.g
    public final koi.c v0() {
        return ((c) this.W.getValue()).w().f;
    }
}
