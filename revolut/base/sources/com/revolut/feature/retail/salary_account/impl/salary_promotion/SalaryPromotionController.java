package com.revolut.feature.retail.salary_account.impl.salary_promotion;

import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.c1;
import au0.m0;
import au0.s0;
import au0.u0;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.retail.salary_account.impl.R$id;
import com.revolut.feature.retail.salary_account.impl.R$layout;
import com.revolut.feature.retail.salary_account.impl.salary_promotion.SalaryPromotionController;
import com.revolut.feature.retail.salary_account.impl.salary_promotion.SalaryPromotionControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import grl.k9;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import vc.s;
import wfb.n;
import wgb.c;
import wgb.d;
import wgb.f;
import wgb.g;
import wgb.i;
import wgb.j;
import wgb.k;
import wgb.l;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/salary_promotion/SalaryPromotionController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lwgb/j;", "Ldli/a;", "Lwgb/m;", "Lno/m;", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SalaryPromotionController extends ViewController<j> implements dli.a, m {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(SalaryPromotionController.class, "binding", "getBinding()Lcom/revolut/feature/retail/salary_account/impl/databinding/ScreenSalaryPromotionBinding;", 0))};
    public final SalaryPromotionControllerContract$InputData K;
    public final h L;
    public final CellDetailsChevronDelegate M;
    public final TextDelegate N;
    public final FullScreenStateDelegate O;
    public final RowDelegate P;
    public final Object Q;
    public final k9 R;
    public final Object S;
    public final Object T;
    public final int U;

    public SalaryPromotionController(SalaryPromotionControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, c.f);
        this.M = new CellDetailsChevronDelegate();
        this.N = new TextDelegate();
        this.O = new FullScreenStateDelegate();
        this.P = new RowDelegate(null, null, 7);
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: wgb.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SalaryPromotionController f297278b;

            {
                this.f297278b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SalaryPromotionController salaryPromotionController = this.f297278b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SalaryPromotionController.V;
                        return (i) ((wfb.n) salaryPromotionController.T.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SalaryPromotionController.V;
                        SalaryPromotionController salaryPromotionController2 = this.f297278b;
                        return dli.f.a(salaryPromotionController2, salaryPromotionController2.R2(), zhm.v.k(new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), new PlainTextDelegate(), salaryPromotionController2.M, new ListSubheaderDelegate(), salaryPromotionController2.P, salaryPromotionController2.O, salaryPromotionController2.N), R$id.screenSalaryPromotion_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = SalaryPromotionController.V;
                        phm.a aVar = (phm.a) ue0.e.j(salaryPromotionController.m2()).a().get(wfb.u.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", wfb.u.class, " is not found"));
                        }
                        wfb.i iVar = ((wfb.i) ((wfb.u) aVar2.b())).f297052t;
                        SalaryPromotionControllerContract$InputData salaryPromotionControllerContract$InputData = salaryPromotionController.K;
                        salaryPromotionControllerContract$InputData.getClass();
                        return new wfb.n(iVar, salaryPromotionController, salaryPromotionControllerContract$InputData);
                }
            }
        });
        k9 value = k9.Premium;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        this.R = value;
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: wgb.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SalaryPromotionController f297278b;

            {
                this.f297278b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SalaryPromotionController salaryPromotionController = this.f297278b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SalaryPromotionController.V;
                        return (i) ((wfb.n) salaryPromotionController.T.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SalaryPromotionController.V;
                        SalaryPromotionController salaryPromotionController2 = this.f297278b;
                        return dli.f.a(salaryPromotionController2, salaryPromotionController2.R2(), zhm.v.k(new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), new PlainTextDelegate(), salaryPromotionController2.M, new ListSubheaderDelegate(), salaryPromotionController2.P, salaryPromotionController2.O, salaryPromotionController2.N), R$id.screenSalaryPromotion_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = SalaryPromotionController.V;
                        phm.a aVar = (phm.a) ue0.e.j(salaryPromotionController.m2()).a().get(wfb.u.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", wfb.u.class, " is not found"));
                        }
                        wfb.i iVar = ((wfb.i) ((wfb.u) aVar2.b())).f297052t;
                        SalaryPromotionControllerContract$InputData salaryPromotionControllerContract$InputData = salaryPromotionController.K;
                        salaryPromotionControllerContract$InputData.getClass();
                        return new wfb.n(iVar, salaryPromotionController, salaryPromotionControllerContract$InputData);
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: wgb.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SalaryPromotionController f297278b;

            {
                this.f297278b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SalaryPromotionController salaryPromotionController = this.f297278b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SalaryPromotionController.V;
                        return (i) ((wfb.n) salaryPromotionController.T.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SalaryPromotionController.V;
                        SalaryPromotionController salaryPromotionController2 = this.f297278b;
                        return dli.f.a(salaryPromotionController2, salaryPromotionController2.R2(), zhm.v.k(new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), new PlainTextDelegate(), salaryPromotionController2.M, new ListSubheaderDelegate(), salaryPromotionController2.P, salaryPromotionController2.O, salaryPromotionController2.N), R$id.screenSalaryPromotion_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = SalaryPromotionController.V;
                        phm.a aVar = (phm.a) ue0.e.j(salaryPromotionController.m2()).a().get(wfb.u.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", wfb.u.class, " is not found"));
                        }
                        wfb.i iVar = ((wfb.i) ((wfb.u) aVar2.b())).f297052t;
                        SalaryPromotionControllerContract$InputData salaryPromotionControllerContract$InputData = salaryPromotionController.K;
                        salaryPromotionControllerContract$InputData.getClass();
                        return new wfb.n(iVar, salaryPromotionController, salaryPromotionControllerContract$InputData);
                }
            }
        });
        this.U = R$layout.screen_salary_promotion;
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        wgb.m uiState = (wgb.m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        l lVar = uiState.f297285a;
        NavBarWithBigTile navBarWithBigTile = d3().f279637c;
        if (lVar != null) {
            navBarWithBigTile.setToolbarTitle(lVar.f297283a);
            c1.S(navBarWithBigTile, lVar.f297284b, null, null, 6);
        } else {
            navBarWithBigTile.setToolbarTitle(null);
            c1.S(navBarWithBigTile, u.c(new u0(NavBarWithContainerBackground.TransparentBackground.f57882a, null, null, null)), null, null, 6);
        }
        k kVar = uiState.f297286b;
        ActionFooterView actionFooterView = d3().f279636b;
        if (kVar == null) {
            actionFooterView.setVisibility(8);
        } else {
            actionFooterView.setVisibility(0);
            actionFooterView.setModel(kVar.f297282a);
        }
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getK() {
        return new AnalyticsProduct.Retail(this.R);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (n) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithBigTile navBarWithBigTile = d3().f279637c;
        navBarWithBigTile.setLayoutType(s0.CENTERED_HORIZONTALLY);
        navBarWithBigTile.setBackgroundOverlayDecoration(m0.FULL_GRADIENT);
        navBarWithBigTile.setThemeBasedColorSchemeEnabled(true);
        navBarWithBigTile.setNavigationButtonIcon(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f279637c.f59357t), new w65.c(this, continuation, 19), 3);
        ViewController.P2(this, rd0.e.b(this.M.f51821c), new d(this, null), 3);
        RowDelegate rowDelegate = this.P;
        ViewController.P2(this, rd0.e.b(rowDelegate.f53218h), new wgb.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.d), new f(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.O.f52371h.f121375b), new g(this, null), 3);
        ViewController.P2(this, vkm.q.J(rd0.e.b(d3().f279636b.f), rd0.e.b(d3().f279636b.f58955g)), new f(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(rowDelegate.f53226s), new f(this, continuation, 2), 3);
    }

    public final ufb.a d3() {
        ViewBinding value = this.L.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ufb.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i R2() {
        return (i) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
