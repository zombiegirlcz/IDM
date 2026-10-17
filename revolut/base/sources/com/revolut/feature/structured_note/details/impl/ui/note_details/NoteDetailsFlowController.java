package com.revolut.feature.structured_note.details.impl.ui.note_details;

import aii.q;
import ali.g;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import b4b.z;
import b5e.c;
import b5e.e;
import b5e.f;
import b5e.j;
import b5e.k;
import b5e.l;
import b5e.m;
import b5e.n;
import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.buttons.TwinHorizontalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.structured_note.details.impl.R$id;
import com.revolut.feature.structured_note.details.impl.R$layout;
import com.revolut.feature.structured_note.details.impl.ui.note_details.NoteDetailsFlowController;
import com.revolut.feature.structured_note.details.impl.ui.note_details.NoteDetailsFlowControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import com.revolut.retail.wealth.resources.R$string;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import tx0.q3;
import tx0.t3;
import tx0.u3;
import vc.s;
import x2h.b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/structured_note/details/impl/ui/note_details/NoteDetailsFlowController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lali/g;", "Lb5e/n;", "Lcom/revolut/feature/structured_note/details/impl/ui/note_details/NoteDetailsFlowControllerContract$Page;", "feature_structured_note_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NoteDetailsFlowController extends ViewController<q> implements g {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(NoteDetailsFlowController.class, "binding", "getBinding()Lcom/revolut/feature/structured_note/details/impl/databinding/FlowNoteDetailsBinding;", 0))};
    public final NoteDetailsFlowControllerContract$InputData K;
    public final Object L;
    public final Object M;
    public final int N;
    public final h O;
    public final Object P;

    public NoteDetailsFlowController(NoteDetailsFlowControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: b5e.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NoteDetailsFlowController f12492b;

            {
                this.f12492b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                NoteDetailsFlowController noteDetailsFlowController = this.f12492b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = NoteDetailsFlowController.Q;
                        phm.a aVar = (phm.a) ue0.e.j(noteDetailsFlowController.m2()).a().get(o4e.l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o4e.l.class, " is not found"));
                        }
                        o4e.l lVar = ((o4e.l) aVar2.b()).o;
                        NoteDetailsFlowControllerContract$InputData noteDetailsFlowControllerContract$InputData = noteDetailsFlowController.K;
                        noteDetailsFlowControllerContract$InputData.getClass();
                        return new o4e.d(lVar, noteDetailsFlowControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = NoteDetailsFlowController.Q;
                        return (g) ((o4e.d) ((c5e.a) noteDetailsFlowController.L.getValue())).f222216g.get();
                    default:
                        KProperty[] kPropertyArr3 = NoteDetailsFlowController.Q;
                        return mif.a.a(noteDetailsFlowController, 0, R$id.flowNoteDetails_viewPager, noteDetailsFlowController.d(), 5);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: b5e.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NoteDetailsFlowController f12492b;

            {
                this.f12492b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                NoteDetailsFlowController noteDetailsFlowController = this.f12492b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = NoteDetailsFlowController.Q;
                        phm.a aVar = (phm.a) ue0.e.j(noteDetailsFlowController.m2()).a().get(o4e.l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o4e.l.class, " is not found"));
                        }
                        o4e.l lVar = ((o4e.l) aVar2.b()).o;
                        NoteDetailsFlowControllerContract$InputData noteDetailsFlowControllerContract$InputData = noteDetailsFlowController.K;
                        noteDetailsFlowControllerContract$InputData.getClass();
                        return new o4e.d(lVar, noteDetailsFlowControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = NoteDetailsFlowController.Q;
                        return (g) ((o4e.d) ((c5e.a) noteDetailsFlowController.L.getValue())).f222216g.get();
                    default:
                        KProperty[] kPropertyArr3 = NoteDetailsFlowController.Q;
                        return mif.a.a(noteDetailsFlowController, 0, R$id.flowNoteDetails_viewPager, noteDetailsFlowController.d(), 5);
                }
            }
        });
        this.N = R$layout.flow_note_details;
        this.O = s.t(this, e.f);
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: b5e.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NoteDetailsFlowController f12492b;

            {
                this.f12492b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                NoteDetailsFlowController noteDetailsFlowController = this.f12492b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = NoteDetailsFlowController.Q;
                        phm.a aVar = (phm.a) ue0.e.j(noteDetailsFlowController.m2()).a().get(o4e.l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o4e.l.class, " is not found"));
                        }
                        o4e.l lVar = ((o4e.l) aVar2.b()).o;
                        NoteDetailsFlowControllerContract$InputData noteDetailsFlowControllerContract$InputData = noteDetailsFlowController.K;
                        noteDetailsFlowControllerContract$InputData.getClass();
                        return new o4e.d(lVar, noteDetailsFlowControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = NoteDetailsFlowController.Q;
                        return (g) ((o4e.d) ((c5e.a) noteDetailsFlowController.L.getValue())).f222216g.get();
                    default:
                        KProperty[] kPropertyArr3 = NoteDetailsFlowController.Q;
                        return mif.a.a(noteDetailsFlowController, 0, R$id.flowNoteDetails_viewPager, noteDetailsFlowController.d(), 5);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        Tabs flowNoteDetailsTabs = d3().d;
        Intrinsics.checkNotNullExpressionValue(flowNoteDetailsTabs, "flowNoteDetailsTabs");
        flowNoteDetailsTabs.setVisibility(!uiState.d.isEmpty() ? 0 : 8);
        NavBarWithToolbar navBarWithToolbar = d3().f202724c;
        m mVar = uiState.f12502b;
        if (mVar instanceof j) {
            navBarWithToolbar.l0();
            j jVar = (j) mVar;
            TextClause textClause = jVar.f12496a;
            Clause clause = jVar.d;
            Clause clause2 = jVar.f12497b;
            if (clause2 == null) {
                navBarWithToolbar.setToolbarTitle(textClause);
            } else {
                NavBarWithToolbar.setToolbar$default(navBarWithToolbar, textClause, clause2, null, 4, null);
            }
            navBarWithToolbar.setDescriptionText(jVar.f12498c);
            navBarWithToolbar.setSecondDescriptionVisible(clause != null);
            navBarWithToolbar.setSecondDescriptionText(clause);
            navBarWithToolbar.setEndImage(new q3(jVar.e));
        } else if (mVar instanceof k) {
            navBarWithToolbar.l0();
        } else {
            if (!(mVar instanceof l)) {
                throw new NoWhenBranchMatchedException();
            }
            t3 t3Var = t3.DEFAULT;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar.I0(t3Var, false);
        }
        b bVar = uiState.f12503c;
        TwinHorizontalButton twinHorizontalButton = d3().f202723b;
        Intrinsics.checkNotNullExpressionValue(twinHorizontalButton, "flowNoteDetailsBuySellPanel");
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(twinHorizontalButton, "twinHorizontalButton");
        Pair pairB = c.b(bVar);
        b5e.a aVar = (b5e.a) pairB.f186385a;
        b5e.a aVar2 = (b5e.a) pairB.f186386b;
        TextLocalisedClause textLocalisedClauseA = aVar != null ? c.a(aVar) : null;
        twinHorizontalButton.setPrimaryButtonText(textLocalisedClauseA);
        twinHorizontalButton.setPrimaryButtonEnabled(textLocalisedClauseA != null);
        twinHorizontalButton.setPrimaryButtonVisible(textLocalisedClauseA != null);
        TextLocalisedClause textLocalisedClauseA2 = aVar2 != null ? c.a(aVar2) : null;
        twinHorizontalButton.setSecondaryButtonText(textLocalisedClauseA2);
        twinHorizontalButton.setSecondaryButtonEnabled(textLocalisedClauseA2 != null);
        twinHorizontalButton.setSecondaryButtonVisible(textLocalisedClauseA2 != null);
        twinHorizontalButton.setVisibility((textLocalisedClauseA2 == null && textLocalisedClauseA == null) ? 8 : 0);
    }

    @Override // ali.g
    public final void Q1(PagerItem pagerItem) {
        NoteDetailsFlowControllerContract$Page page = (NoteDetailsFlowControllerContract$Page) pagerItem;
        Intrinsics.checkNotNullParameter(page, "pagerItem");
        Intrinsics.checkNotNullParameter(page, "pagerItem");
        a aVar = (a) d();
        aVar.getClass();
        Intrinsics.checkNotNullParameter(page, "page");
        aVar.H2(aVar.f88874w, new z(page, 14));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (c5e.a) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (c5e.a) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        pd.b.p(view, new TextLocalisedClause(R$string.wealth_asset_details, null, null, 14));
        NavBarWithToolbar navBarWithToolbar = d3().f202724c;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setTitleAutoSize(true);
        navBarWithToolbar.setTitleVisible(false);
        navBarWithToolbar.setToolbarTitleVisibilityMode(u3.COLLAPSING);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionVisible(false);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f202723b.c()), new f(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f202723b.d()), new f(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f202724c.f59410q), new f(this, null, 2), 3);
    }

    public final m4e.a d3() {
        ViewBinding value = this.O.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m4e.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final b5e.g d() {
        return (b5e.g) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (ali.c) this.P.getValue();
    }
}
