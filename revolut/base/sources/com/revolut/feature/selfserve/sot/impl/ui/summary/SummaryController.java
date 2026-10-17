package com.revolut.feature.selfserve.sot.impl.ui.summary;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.selfserve.core.R$string;
import com.revolut.feature.selfserve.sot.impl.ui.flow.SotFlowContract$Step;
import com.revolut.feature.selfserve.sot.impl.ui.summary.SummaryController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import czc.a0;
import czc.k;
import czc.l;
import czc.m;
import czc.n;
import czc.p;
import czc.v;
import dli.a;
import dli.c;
import java.util.List;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/selfserve/sot/impl/ui/summary/SummaryController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lczc/v;", "Ldli/a;", "Lczc/a0;", "feature_selfserve_sot_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SummaryController extends ViewController<v> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(SummaryController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final SotFlowContract$Step.Summary K;
    public final int L;
    public final h M;
    public final RowDelegate N;
    public final CellDetailsDelegate O;
    public final CellDetailsNoteDelegate P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public SummaryController(SotFlowContract$Step.Summary step) {
        Intrinsics.checkNotNullParameter(step, "step");
        this.K = step;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, k.f);
        this.N = new RowDelegate(null, null, 7);
        this.O = new CellDetailsDelegate();
        this.P = new CellDetailsNoteDelegate();
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: czc.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SummaryController f110203b;

            {
                this.f110203b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SummaryController summaryController = this.f110203b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SummaryController.T;
                        phm.a aVar = (phm.a) ue0.e.j(summaryController.m2()).a().get(gyc.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gyc.a.class, " is not found"));
                        }
                        jyc.n nVarL = ((jyc.r) aVar2.b()).l();
                        SotFlowContract$Step.Summary summary = summaryController.K;
                        summary.getClass();
                        nVarL.f179403c = summary;
                        nVarL.f179402b = summaryController;
                        return (dzc.a) nVarL.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = SummaryController.T;
                        jyc.o oVar = (jyc.o) ((dzc.a) summaryController.Q.getValue());
                        SotFlowContract$Step.Summary summary2 = oVar.f179404a;
                        jyc.h hVar = oVar.f179405b;
                        djf.c cVar = hVar.d;
                        thf.m mVarG = cVar.g();
                        vc.s.j(mVarG);
                        thf.d dVarD = cVar.d();
                        vc.s.j(dVarD);
                        m0 m0Var = new m0(new g0(mVarG, dVarD));
                        com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) hVar.f179384c).c();
                        vc.s.j(aVarC);
                        return new c0(summary2, m0Var, aVarC);
                    default:
                        KProperty[] kPropertyArr3 = SummaryController.T;
                        SummaryController summaryController2 = this.f110203b;
                        return dli.f.a(summaryController2, (p) summaryController2.R.getValue(), zhm.v.k(new ListSubheaderDelegate(), summaryController2.O, new PlainTextWarningDelegate(), summaryController2.N, summaryController2.P), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: czc.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SummaryController f110203b;

            {
                this.f110203b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SummaryController summaryController = this.f110203b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SummaryController.T;
                        phm.a aVar = (phm.a) ue0.e.j(summaryController.m2()).a().get(gyc.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gyc.a.class, " is not found"));
                        }
                        jyc.n nVarL = ((jyc.r) aVar2.b()).l();
                        SotFlowContract$Step.Summary summary = summaryController.K;
                        summary.getClass();
                        nVarL.f179403c = summary;
                        nVarL.f179402b = summaryController;
                        return (dzc.a) nVarL.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = SummaryController.T;
                        jyc.o oVar = (jyc.o) ((dzc.a) summaryController.Q.getValue());
                        SotFlowContract$Step.Summary summary2 = oVar.f179404a;
                        jyc.h hVar = oVar.f179405b;
                        djf.c cVar = hVar.d;
                        thf.m mVarG = cVar.g();
                        vc.s.j(mVarG);
                        thf.d dVarD = cVar.d();
                        vc.s.j(dVarD);
                        m0 m0Var = new m0(new g0(mVarG, dVarD));
                        com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) hVar.f179384c).c();
                        vc.s.j(aVarC);
                        return new c0(summary2, m0Var, aVarC);
                    default:
                        KProperty[] kPropertyArr3 = SummaryController.T;
                        SummaryController summaryController2 = this.f110203b;
                        return dli.f.a(summaryController2, (p) summaryController2.R.getValue(), zhm.v.k(new ListSubheaderDelegate(), summaryController2.O, new PlainTextWarningDelegate(), summaryController2.N, summaryController2.P), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: czc.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SummaryController f110203b;

            {
                this.f110203b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SummaryController summaryController = this.f110203b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SummaryController.T;
                        phm.a aVar = (phm.a) ue0.e.j(summaryController.m2()).a().get(gyc.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gyc.a.class, " is not found"));
                        }
                        jyc.n nVarL = ((jyc.r) aVar2.b()).l();
                        SotFlowContract$Step.Summary summary = summaryController.K;
                        summary.getClass();
                        nVarL.f179403c = summary;
                        nVarL.f179402b = summaryController;
                        return (dzc.a) nVarL.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = SummaryController.T;
                        jyc.o oVar = (jyc.o) ((dzc.a) summaryController.Q.getValue());
                        SotFlowContract$Step.Summary summary2 = oVar.f179404a;
                        jyc.h hVar = oVar.f179405b;
                        djf.c cVar = hVar.d;
                        thf.m mVarG = cVar.g();
                        vc.s.j(mVarG);
                        thf.d dVarD = cVar.d();
                        vc.s.j(dVarD);
                        m0 m0Var = new m0(new g0(mVarG, dVarD));
                        com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) hVar.f179384c).c();
                        vc.s.j(aVarC);
                        return new c0(summary2, m0Var, aVarC);
                    default:
                        KProperty[] kPropertyArr3 = SummaryController.T;
                        SummaryController summaryController2 = this.f110203b;
                        return dli.f.a(summaryController2, (p) summaryController2.R.getValue(), zhm.v.k(new ListSubheaderDelegate(), summaryController2.O, new PlainTextWarningDelegate(), summaryController2.N, summaryController2.P), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        a0 uiState = (a0) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        u uVarD3 = d3();
        NavBarWithToolbar navBarWithToolbar = uVarD3.f174565c;
        LargeActionButton goToButton = uVarD3.f174564b;
        czc.q qVar2 = uiState.f110182a;
        if (qVar2 != null) {
            navBarWithToolbar.setTitle(qVar2.f110214a, null);
            navBarWithToolbar.setToolbarTitle(qVar2.f110215b);
            navBarWithToolbar.setDescriptionText(qVar2.f110216c);
            navBarWithToolbar.setDescriptionVisible(true);
            navBarWithToolbar.setSecondDescriptionText(qVar2.d);
            navBarWithToolbar.setSecondDescriptionVisible(true);
            navBarWithToolbar.setEndIconImage(qVar2.e);
            navBarWithToolbar.setEndIconBadgeImage(qVar2.f);
        }
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        goToButton.setVisibility(uiState.f110183b ? 0 : 8);
        goToButton.setEnabled(uiState.f110184c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (dzc.a) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (p) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        d3().f174564b.setText(new TextLocalisedClause(R$string.sow_home_submit_button_title, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new l(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(this.P.d), new m(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.f53218h), new n(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new l(this, null, 1), 3);
    }

    public final u d3() {
        ViewBinding value = this.M.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.S.getValue();
    }
}
