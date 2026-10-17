package com.revolut.feature.selfserve.sot.impl.ui.evidencelist;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.selfserve.sot.api.models.DocumentType;
import com.revolut.feature.selfserve.sot.impl.ui.evidencelist.EvidenceListController;
import com.revolut.feature.selfserve.sot.impl.ui.flow.SotFlowContract$Step;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
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
import org.jetbrains.annotations.NotNull;
import te0.w;
import tx0.j0;
import uyc.f;
import uyc.g;
import uyc.i;
import uyc.k;
import uyc.l;
import uyc.p;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/selfserve/sot/impl/ui/evidencelist/EvidenceListController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Luyc/p;", "Ldli/a;", "Luyc/q;", "Companion", "a", "feature_selfserve_sot_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EvidenceListController extends ViewController<p> implements a {
    public final SotFlowContract$Step.EvidenceList K;
    public final int L;
    public final h M;
    public final RowDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(EvidenceListController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.selfserve.sot.impl.ui.evidencelist.EvidenceListController$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public EvidenceListController(SotFlowContract$Step.EvidenceList step) {
        Intrinsics.checkNotNullParameter(step, "step");
        this.K = step;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, f.f);
        this.N = new RowDelegate(null, null, 7);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: uyc.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EvidenceListController f284136b;

            {
                this.f284136b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EvidenceListController evidenceListController = this.f284136b;
                switch (i2) {
                    case 0:
                        EvidenceListController.Companion companion = EvidenceListController.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(evidenceListController.m2()).a().get(gyc.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gyc.a.class, " is not found"));
                        }
                        jyc.d dVarF = ((jyc.r) aVar2.b()).f();
                        SotFlowContract$Step.EvidenceList evidenceList = evidenceListController.K;
                        evidenceList.getClass();
                        dVarF.f179368c = evidenceList;
                        dVarF.f179367b = evidenceListController;
                        return (vyc.a) dVarF.mo3783build();
                    case 1:
                        EvidenceListController.Companion companion2 = EvidenceListController.INSTANCE;
                        jyc.e eVar = (jyc.e) ((vyc.a) evidenceListController.O.getValue());
                        SotFlowContract$Step.EvidenceList evidenceList2 = eVar.f179369a;
                        ViewController viewController = eVar.f179370b;
                        vyc.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(viewController, "viewController");
                        return new w(evidenceList2, new qee.s(new y(new p80.a(viewController.m2()))), (e60.a) eVar.f179376m.get());
                    default:
                        EvidenceListController.Companion companion3 = EvidenceListController.INSTANCE;
                        EvidenceListController evidenceListController2 = this.f284136b;
                        return dli.f.a(evidenceListController2, evidenceListController2.R2(), zhm.v.k(new ListSubheaderDelegate(), new RowLoadingDelegate(), new PlainTextDelegate(), evidenceListController2.N), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: uyc.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EvidenceListController f284136b;

            {
                this.f284136b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EvidenceListController evidenceListController = this.f284136b;
                switch (i22) {
                    case 0:
                        EvidenceListController.Companion companion = EvidenceListController.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(evidenceListController.m2()).a().get(gyc.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gyc.a.class, " is not found"));
                        }
                        jyc.d dVarF = ((jyc.r) aVar2.b()).f();
                        SotFlowContract$Step.EvidenceList evidenceList = evidenceListController.K;
                        evidenceList.getClass();
                        dVarF.f179368c = evidenceList;
                        dVarF.f179367b = evidenceListController;
                        return (vyc.a) dVarF.mo3783build();
                    case 1:
                        EvidenceListController.Companion companion2 = EvidenceListController.INSTANCE;
                        jyc.e eVar = (jyc.e) ((vyc.a) evidenceListController.O.getValue());
                        SotFlowContract$Step.EvidenceList evidenceList2 = eVar.f179369a;
                        ViewController viewController = eVar.f179370b;
                        vyc.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(viewController, "viewController");
                        return new w(evidenceList2, new qee.s(new y(new p80.a(viewController.m2()))), (e60.a) eVar.f179376m.get());
                    default:
                        EvidenceListController.Companion companion3 = EvidenceListController.INSTANCE;
                        EvidenceListController evidenceListController2 = this.f284136b;
                        return dli.f.a(evidenceListController2, evidenceListController2.R2(), zhm.v.k(new ListSubheaderDelegate(), new RowLoadingDelegate(), new PlainTextDelegate(), evidenceListController2.N), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: uyc.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EvidenceListController f284136b;

            {
                this.f284136b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EvidenceListController evidenceListController = this.f284136b;
                switch (i22) {
                    case 0:
                        EvidenceListController.Companion companion = EvidenceListController.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(evidenceListController.m2()).a().get(gyc.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gyc.a.class, " is not found"));
                        }
                        jyc.d dVarF = ((jyc.r) aVar2.b()).f();
                        SotFlowContract$Step.EvidenceList evidenceList = evidenceListController.K;
                        evidenceList.getClass();
                        dVarF.f179368c = evidenceList;
                        dVarF.f179367b = evidenceListController;
                        return (vyc.a) dVarF.mo3783build();
                    case 1:
                        EvidenceListController.Companion companion2 = EvidenceListController.INSTANCE;
                        jyc.e eVar = (jyc.e) ((vyc.a) evidenceListController.O.getValue());
                        SotFlowContract$Step.EvidenceList evidenceList2 = eVar.f179369a;
                        ViewController viewController = eVar.f179370b;
                        vyc.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(viewController, "viewController");
                        return new w(evidenceList2, new qee.s(new y(new p80.a(viewController.m2()))), (e60.a) eVar.f179376m.get());
                    default:
                        EvidenceListController.Companion companion3 = EvidenceListController.INSTANCE;
                        EvidenceListController evidenceListController2 = this.f284136b;
                        return dli.f.a(evidenceListController2, evidenceListController2.R2(), zhm.v.k(new ListSubheaderDelegate(), new RowLoadingDelegate(), new PlainTextDelegate(), evidenceListController2.N), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        uyc.q uiState = (uyc.q) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        u uVarD3 = d3();
        l lVar = uiState.f284147a;
        LargeActionButton goToButton = uVarD3.f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        goToButton.setVisibility(lVar.f284140a ? 0 : 8);
        goToButton.setEnabled(lVar.f284141b);
        goToButton.setText(lVar.f284142c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (vyc.a) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        SotFlowContract$Step.EvidenceList evidenceList = this.K;
        DocumentType documentType = evidenceList.f85924a;
        String str = documentType.d;
        if (str == null) {
            str = documentType.f85860b;
        }
        String str2 = str;
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setToolbarTitle(new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        navBarWithToolbar.setTitle(new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null);
        navBarWithToolbar.setDescriptionText(new TextClause(evidenceList.f85924a.f85861c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new g(this, null, 0), 3);
        RowDelegate rowDelegate = this.N;
        ViewController.P2(this, rd0.e.b(rowDelegate.f53218h), new uyc.h(this, null), 3);
        ViewController.P2(this, rd0.e.b(rowDelegate.k), new i(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new g(this, null, 1), 3);
    }

    public final u d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final k R2() {
        return (k) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.Q.getValue();
    }
}
