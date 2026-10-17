package com.revolut.feature.selfserve.sot.impl.ui.status;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bzc.g;
import bzc.i;
import bzc.k;
import bzc.o;
import bzc.p;
import cli.q;
import com.revolut.core.ui_kit.delegates.ErrorDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PermissionDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.selfserve.sot.impl.ui.status.StatusController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import java.util.List;
import jyc.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import pki.b;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/selfserve/sot/impl/ui/status/StatusController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lbzc/o;", "Ldli/a;", "Lbzc/p;", "Companion", "a", "feature_selfserve_sot_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StatusController extends ViewController<o> implements dli.a {
    public final boolean K;
    public final int L = R$layout.screen_recycler_navbar;
    public final h M = s.t(this, g.f);
    public final RowDelegate N = new RowDelegate(null, null, 7);
    public final ErrorDelegate O = new ErrorDelegate();
    public final Object P;
    public final Object Q;
    public final Object R;
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(StatusController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public StatusController(boolean z) {
        this.K = z;
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: bzc.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StatusController f19956b;

            {
                this.f19956b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                StatusController statusController = this.f19956b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = StatusController.S;
                        phm.a aVar = (phm.a) ue0.e.j(statusController.m2()).a().get(gyc.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gyc.a.class, " is not found"));
                        }
                        jt0.b bVarK = ((jyc.r) aVar2.b()).k();
                        bVarK.d = Boolean.valueOf(statusController.K);
                        bVarK.f178266c = statusController;
                        return (jyc.m) bVarK.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = StatusController.S;
                        jyc.m mVar = (jyc.m) statusController.P.getValue();
                        boolean zBooleanValue = mVar.f179399a.booleanValue();
                        jyc.h hVar = mVar.f179400b;
                        djf.c cVar = hVar.d;
                        thf.m mVarG = cVar.g();
                        vc.s.j(mVarG);
                        thf.d dVarD = cVar.d();
                        vc.s.j(dVarD);
                        d0 d0Var = new d0(new v(mVarG, dVarD), new xyc.a());
                        kpj.f fVarM = hVar.m();
                        kpj.f fVarM2 = hVar.m();
                        com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) hVar.f179384c).c();
                        vc.s.j(aVarC);
                        return new s(zBooleanValue, d0Var, fVarM, new zq.a(fVarM2, aVarC), new xyc.a());
                    default:
                        KProperty[] kPropertyArr3 = StatusController.S;
                        StatusController statusController2 = this.f19956b;
                        return dli.f.a(statusController2, (s) statusController2.Q.getValue(), zhm.v.k(new ListSubheaderDelegate(), new PlainTextWarningDelegate(), new PermissionDelegate(), new RowLoadingDelegate(), new TextDelegate(), statusController2.O, statusController2.N), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: bzc.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StatusController f19956b;

            {
                this.f19956b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                StatusController statusController = this.f19956b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = StatusController.S;
                        phm.a aVar = (phm.a) ue0.e.j(statusController.m2()).a().get(gyc.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gyc.a.class, " is not found"));
                        }
                        jt0.b bVarK = ((jyc.r) aVar2.b()).k();
                        bVarK.d = Boolean.valueOf(statusController.K);
                        bVarK.f178266c = statusController;
                        return (jyc.m) bVarK.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = StatusController.S;
                        jyc.m mVar = (jyc.m) statusController.P.getValue();
                        boolean zBooleanValue = mVar.f179399a.booleanValue();
                        jyc.h hVar = mVar.f179400b;
                        djf.c cVar = hVar.d;
                        thf.m mVarG = cVar.g();
                        vc.s.j(mVarG);
                        thf.d dVarD = cVar.d();
                        vc.s.j(dVarD);
                        d0 d0Var = new d0(new v(mVarG, dVarD), new xyc.a());
                        kpj.f fVarM = hVar.m();
                        kpj.f fVarM2 = hVar.m();
                        com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) hVar.f179384c).c();
                        vc.s.j(aVarC);
                        return new s(zBooleanValue, d0Var, fVarM, new zq.a(fVarM2, aVarC), new xyc.a());
                    default:
                        KProperty[] kPropertyArr3 = StatusController.S;
                        StatusController statusController2 = this.f19956b;
                        return dli.f.a(statusController2, (s) statusController2.Q.getValue(), zhm.v.k(new ListSubheaderDelegate(), new PlainTextWarningDelegate(), new PermissionDelegate(), new RowLoadingDelegate(), new TextDelegate(), statusController2.O, statusController2.N), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: bzc.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StatusController f19956b;

            {
                this.f19956b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                StatusController statusController = this.f19956b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = StatusController.S;
                        phm.a aVar = (phm.a) ue0.e.j(statusController.m2()).a().get(gyc.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gyc.a.class, " is not found"));
                        }
                        jt0.b bVarK = ((jyc.r) aVar2.b()).k();
                        bVarK.d = Boolean.valueOf(statusController.K);
                        bVarK.f178266c = statusController;
                        return (jyc.m) bVarK.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = StatusController.S;
                        jyc.m mVar = (jyc.m) statusController.P.getValue();
                        boolean zBooleanValue = mVar.f179399a.booleanValue();
                        jyc.h hVar = mVar.f179400b;
                        djf.c cVar = hVar.d;
                        thf.m mVarG = cVar.g();
                        vc.s.j(mVarG);
                        thf.d dVarD = cVar.d();
                        vc.s.j(dVarD);
                        d0 d0Var = new d0(new v(mVarG, dVarD), new xyc.a());
                        kpj.f fVarM = hVar.m();
                        kpj.f fVarM2 = hVar.m();
                        com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) hVar.f179384c).c();
                        vc.s.j(aVarC);
                        return new s(zBooleanValue, d0Var, fVarM, new zq.a(fVarM2, aVarC), new xyc.a());
                    default:
                        KProperty[] kPropertyArr3 = StatusController.S;
                        StatusController statusController2 = this.f19956b;
                        return dli.f.a(statusController2, (s) statusController2.Q.getValue(), zhm.v.k(new ListSubheaderDelegate(), new PlainTextWarningDelegate(), new PermissionDelegate(), new RowLoadingDelegate(), new TextDelegate(), statusController2.O, statusController2.N), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, q qVar) {
        p uiState = (p) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        k kVar = uiState.f19967a;
        navBarWithToolbar.setTitle(kVar.f19960a, null);
        navBarWithToolbar.setToolbarTitle(kVar.f19961b);
        navBarWithToolbar.setDescriptionVisible(false);
        Clause clause = kVar.f19962c;
        if (clause != null) {
            navBarWithToolbar.setSecondDescriptionText(clause);
            navBarWithToolbar.setSecondDescriptionVisible(true);
        } else {
            navBarWithToolbar.setSecondDescriptionText(null);
            navBarWithToolbar.setSecondDescriptionVisible(false);
        }
        navBarWithToolbar.setEndIconImage(kVar.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (m) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (bzc.s) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        if (this.K) {
            navBarWithToolbar.setMenuItems(u.c(IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "NAV_BAR_ICON_ID", new ResourceImage(R$drawable.uikit_icn_24_question, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124)));
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new bzc.h(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.o.f57403b), new bzc.h(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.N.f53218h), new i(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.O.f52226c), new bzc.h(this, null, 2), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.R.getValue();
    }
}
