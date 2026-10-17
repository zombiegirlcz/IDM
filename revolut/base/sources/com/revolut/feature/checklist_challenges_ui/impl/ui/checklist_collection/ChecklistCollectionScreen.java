package com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.c1;
import au0.s0;
import aw0.d0;
import aw0.i;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.checklist_challenges_ui.impl.R$id;
import com.revolut.feature.checklist_challenges_ui.impl.R$layout;
import com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.ChecklistCollectionScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import e58.d;
import ec8.c;
import eh3.j;
import eh3.k;
import eh3.n;
import eh3.p;
import eh3.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import tx0.o2;
import vc.s;
import wp5.y;
import xki.e;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/checklist_challenges_ui/impl/ui/checklist_collection/ChecklistCollectionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Leh3/r;", "Lno/m;", "feature_checklist_challenges_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChecklistCollectionScreen extends ViewController<q> implements dli.a, m {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(ChecklistCollectionScreen.class, "binding", "getBinding()Lcom/revolut/feature/checklist_challenges_ui/impl/databinding/ScreenChecklistCollectionBinding;", 0))};
    public final AnalyticsProduct K;
    public final FullScreenStateDelegate L;
    public final RowDelegate M;
    public final TextDelegate N;
    public final Object O;
    public final int P;
    public final Object Q;
    public final Object R;
    public final h S;

    public ChecklistCollectionScreen(ChecklistCollectionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData.f65813b;
        this.L = new FullScreenStateDelegate();
        this.M = new RowDelegate(null, null, 7);
        this.N = new TextDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: eh3.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChecklistCollectionScreen f125715b;

            {
                this.f125715b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = ChecklistCollectionScreen.T;
                        ChecklistCollectionScreen checklistCollectionScreen = this.f125715b;
                        return dli.f.a(checklistCollectionScreen, checklistCollectionScreen.R2(), zhm.v.k(new RowLoadingDelegate(), checklistCollectionScreen.L, checklistCollectionScreen.M, checklistCollectionScreen.N), R$id.screenChecklistCollection_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = ChecklistCollectionScreen.T;
                        return (q) ((vg3.h) this.f125715b.Q.getValue()).d.get();
                }
            }
        });
        this.P = R$layout.screen_checklist_collection;
        this.Q = w.y0(new d(this, inputData, 18));
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: eh3.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChecklistCollectionScreen f125715b;

            {
                this.f125715b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ChecklistCollectionScreen.T;
                        ChecklistCollectionScreen checklistCollectionScreen = this.f125715b;
                        return dli.f.a(checklistCollectionScreen, checklistCollectionScreen.R2(), zhm.v.k(new RowLoadingDelegate(), checklistCollectionScreen.L, checklistCollectionScreen.M, checklistCollectionScreen.N), R$id.screenChecklistCollection_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = ChecklistCollectionScreen.T;
                        return (q) ((vg3.h) this.f125715b.Q.getValue()).d.get();
                }
            }
        });
        this.S = s.t(this, eh3.h.f);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        r uiState = (r) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        p pVar = uiState.f125724a;
        NavBarWithBigTile screenChecklistCollectionNavBar = d3().f271057c;
        Intrinsics.checkNotNullExpressionValue(screenChecklistCollectionNavBar, "screenChecklistCollectionNavBar");
        boolean z = pVar instanceof n;
        screenChecklistCollectionNavBar.setHeightMode(new o2(z ? new d0(375, 324) : new d0(375, 485)));
        if (pVar instanceof eh3.o) {
            screenChecklistCollectionNavBar.setLoadingState(true);
        } else if (pVar instanceof eh3.m) {
            screenChecklistCollectionNavBar.setLoadingState(false);
            eh3.m mVar = (eh3.m) pVar;
            c1.S(screenChecklistCollectionNavBar, mVar.f125719a, null, null, 6);
            screenChecklistCollectionNavBar.setToolbarTitle(mVar.f125720b);
            screenChecklistCollectionNavBar.setMenuItems(mVar.f125721c);
        } else {
            if (!z) {
                throw new NoWhenBranchMatchedException();
            }
            screenChecklistCollectionNavBar.setLoadingState(false);
            f0 f0Var = f0.f322471a;
            c1.S(screenChecklistCollectionNavBar, f0Var, null, null, 6);
            screenChecklistCollectionNavBar.setToolbarTitle(null);
            screenChecklistCollectionNavBar.setMenuItems(f0Var);
        }
        i iVar = uiState.f125726c;
        ActionFooterView screenChecklistCollectionActionFooterView = d3().f271056b;
        Intrinsics.checkNotNullExpressionValue(screenChecklistCollectionActionFooterView, "screenChecklistCollectionActionFooterView");
        if (iVar == null) {
            screenChecklistCollectionActionFooterView.setVisibility(8);
        } else {
            screenChecklistCollectionActionFooterView.setVisibility(0);
            screenChecklistCollectionActionFooterView.setModel(iVar);
        }
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (vg3.h) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithBigTile navBarWithBigTile = d3().f271057c;
        navBarWithBigTile.setNavigationButtonIcon(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithBigTile.setLayoutType(s0.CENTERED_HORIZONTALLY);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f271057c.f59357t), new c(this, null, 9), 3);
        ViewController.P2(this, rd0.e.b(this.L.f52371h.f121375b), new eh3.i(this, null), 3);
        ActionFooterView actionFooterView = d3().f271056b;
        ViewController.P2(this, y.x(actionFooterView.f, actionFooterView.f58955g, "mergeWith(...)"), new j(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.M.f53218h), new k(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.d), new j(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f271057c.b()), new j(this, continuation, 2), 3);
    }

    public final tg3.a d3() {
        ViewBinding value = this.S.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (tg3.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final eh3.q R2() {
        return (eh3.q) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
