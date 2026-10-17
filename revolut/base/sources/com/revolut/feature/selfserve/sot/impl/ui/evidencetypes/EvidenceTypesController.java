package com.revolut.feature.selfserve.sot.impl.ui.evidencetypes;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ErrorDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.selfserve.core.R$string;
import com.revolut.feature.selfserve.sot.api.models.IncomeSource;
import com.revolut.feature.selfserve.sot.impl.ui.evidencetypes.EvidenceTypesController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import dli.a;
import dli.c;
import h30.l;
import java.util.List;
import jii.u;
import jyc.f;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import te0.w;
import tx0.j0;
import vc.s;
import wyc.g;
import wyc.i;
import wyc.n;
import wyc.t;
import xki.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/selfserve/sot/impl/ui/evidencetypes/EvidenceTypesController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lwyc/n;", "Ldli/a;", "Lwyc/o;", "feature_selfserve_sot_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EvidenceTypesController extends ViewController<n> implements a {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(EvidenceTypesController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final String K;
    public final IncomeSource L;
    public final boolean M;
    public final int N;
    public final h O;
    public final RowDelegate P;
    public final SelectableDelegate Q;
    public final ErrorDelegate R;
    public final Object S;
    public final Object T;
    public final Object U;

    public EvidenceTypesController(String transactionId, IncomeSource incomeSource, boolean z) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.K = transactionId;
        this.L = incomeSource;
        this.M = z;
        this.N = R$layout.screen_recycler_navbar_nextbutton;
        this.O = s.t(this, g.f);
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.P = rowDelegate;
        this.Q = new SelectableDelegate(rowDelegate);
        this.R = new ErrorDelegate();
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: wyc.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EvidenceTypesController f301212b;

            {
                this.f301212b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EvidenceTypesController evidenceTypesController = this.f301212b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EvidenceTypesController.V;
                        phm.a aVar = (phm.a) ue0.e.j(evidenceTypesController.m2()).a().get(gyc.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gyc.a.class, " is not found"));
                        }
                        a5h.g gVarG = ((jyc.r) aVar2.b()).g();
                        String str = evidenceTypesController.K;
                        str.getClass();
                        gVarG.d = str;
                        gVarG.e = evidenceTypesController.L;
                        gVarG.f = Boolean.valueOf(evidenceTypesController.M);
                        gVarG.f1407c = evidenceTypesController;
                        return (jyc.f) gVarG.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = EvidenceTypesController.V;
                        jyc.f fVar = (jyc.f) evidenceTypesController.S.getValue();
                        String str2 = fVar.f179378a;
                        IncomeSource incomeSource2 = fVar.f179379b;
                        boolean zBooleanValue = fVar.f179380c.booleanValue();
                        jyc.h hVar = fVar.d;
                        djf.c cVar = hVar.d;
                        thf.m mVarG = cVar.g();
                        vc.s.j(mVarG);
                        thf.d dVarD = cVar.d();
                        vc.s.j(dVarD);
                        d0 d0Var = new d0(new v(mVarG, dVarD));
                        kpj.f fVarM = hVar.m();
                        com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) hVar.f179384c).c();
                        vc.s.j(aVarC);
                        return new t(str2, incomeSource2, zBooleanValue, d0Var, fVarM, aVarC);
                    default:
                        KProperty[] kPropertyArr3 = EvidenceTypesController.V;
                        EvidenceTypesController evidenceTypesController2 = this.f301212b;
                        return dli.f.a(evidenceTypesController2, (t) evidenceTypesController2.T.getValue(), zhm.v.k(new ListSubheaderDelegate(), new PlainTextWarningDelegate(), new RowLoadingDelegate(), evidenceTypesController2.P, evidenceTypesController2.Q, evidenceTypesController2.R), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: wyc.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EvidenceTypesController f301212b;

            {
                this.f301212b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EvidenceTypesController evidenceTypesController = this.f301212b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EvidenceTypesController.V;
                        phm.a aVar = (phm.a) ue0.e.j(evidenceTypesController.m2()).a().get(gyc.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gyc.a.class, " is not found"));
                        }
                        a5h.g gVarG = ((jyc.r) aVar2.b()).g();
                        String str = evidenceTypesController.K;
                        str.getClass();
                        gVarG.d = str;
                        gVarG.e = evidenceTypesController.L;
                        gVarG.f = Boolean.valueOf(evidenceTypesController.M);
                        gVarG.f1407c = evidenceTypesController;
                        return (jyc.f) gVarG.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = EvidenceTypesController.V;
                        jyc.f fVar = (jyc.f) evidenceTypesController.S.getValue();
                        String str2 = fVar.f179378a;
                        IncomeSource incomeSource2 = fVar.f179379b;
                        boolean zBooleanValue = fVar.f179380c.booleanValue();
                        jyc.h hVar = fVar.d;
                        djf.c cVar = hVar.d;
                        thf.m mVarG = cVar.g();
                        vc.s.j(mVarG);
                        thf.d dVarD = cVar.d();
                        vc.s.j(dVarD);
                        d0 d0Var = new d0(new v(mVarG, dVarD));
                        kpj.f fVarM = hVar.m();
                        com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) hVar.f179384c).c();
                        vc.s.j(aVarC);
                        return new t(str2, incomeSource2, zBooleanValue, d0Var, fVarM, aVarC);
                    default:
                        KProperty[] kPropertyArr3 = EvidenceTypesController.V;
                        EvidenceTypesController evidenceTypesController2 = this.f301212b;
                        return dli.f.a(evidenceTypesController2, (t) evidenceTypesController2.T.getValue(), zhm.v.k(new ListSubheaderDelegate(), new PlainTextWarningDelegate(), new RowLoadingDelegate(), evidenceTypesController2.P, evidenceTypesController2.Q, evidenceTypesController2.R), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: wyc.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EvidenceTypesController f301212b;

            {
                this.f301212b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EvidenceTypesController evidenceTypesController = this.f301212b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EvidenceTypesController.V;
                        phm.a aVar = (phm.a) ue0.e.j(evidenceTypesController.m2()).a().get(gyc.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gyc.a.class, " is not found"));
                        }
                        a5h.g gVarG = ((jyc.r) aVar2.b()).g();
                        String str = evidenceTypesController.K;
                        str.getClass();
                        gVarG.d = str;
                        gVarG.e = evidenceTypesController.L;
                        gVarG.f = Boolean.valueOf(evidenceTypesController.M);
                        gVarG.f1407c = evidenceTypesController;
                        return (jyc.f) gVarG.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = EvidenceTypesController.V;
                        jyc.f fVar = (jyc.f) evidenceTypesController.S.getValue();
                        String str2 = fVar.f179378a;
                        IncomeSource incomeSource2 = fVar.f179379b;
                        boolean zBooleanValue = fVar.f179380c.booleanValue();
                        jyc.h hVar = fVar.d;
                        djf.c cVar = hVar.d;
                        thf.m mVarG = cVar.g();
                        vc.s.j(mVarG);
                        thf.d dVarD = cVar.d();
                        vc.s.j(dVarD);
                        d0 d0Var = new d0(new v(mVarG, dVarD));
                        kpj.f fVarM = hVar.m();
                        com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) hVar.f179384c).c();
                        vc.s.j(aVarC);
                        return new t(str2, incomeSource2, zBooleanValue, d0Var, fVarM, aVarC);
                    default:
                        KProperty[] kPropertyArr3 = EvidenceTypesController.V;
                        EvidenceTypesController evidenceTypesController2 = this.f301212b;
                        return dli.f.a(evidenceTypesController2, (t) evidenceTypesController2.T.getValue(), zhm.v.k(new ListSubheaderDelegate(), new PlainTextWarningDelegate(), new RowLoadingDelegate(), evidenceTypesController2.P, evidenceTypesController2.Q, evidenceTypesController2.R), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        wyc.o uiState = (wyc.o) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        LargeActionButton goToButton = d3().f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        goToButton.setVisibility(uiState.f301218a ? 0 : 8);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (t) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.sot_source_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.sot_source_title, null, null, 14), null);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.sot_source_caption, null, null, 14));
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        l.A(R.string.common_action_continue, null, null, 14, d3().f174564b);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new wyc.h(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.Q.r()), new i(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.R.f52226c), new wyc.h(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new wyc.h(this, continuation, 2), 3);
    }

    public final u d3() {
        ViewBinding value = this.O.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.U.getValue();
    }
}
