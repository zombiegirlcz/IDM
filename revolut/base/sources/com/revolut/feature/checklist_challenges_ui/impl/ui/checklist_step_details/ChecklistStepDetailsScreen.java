package com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_step_details;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_step_details.ChecklistStepDetailsScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import exe.k;
import gaa.g;
import gd8.j;
import gh3.b;
import gh3.c;
import gh3.f;
import gh3.i;
import java.util.List;
import jii.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mx0.c7;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/checklist_challenges_ui/impl/ui/checklist_step_details/ChecklistStepDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lgh3/i;", "feature_checklist_challenges_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChecklistStepDetailsScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(ChecklistStepDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterBinding;", 0))};
    public final FullScreenStateDelegate K;
    public final RowDelegate L;
    public final Object M;
    public final int N;
    public final Object O;
    public final Object P;
    public final h Q;

    public ChecklistStepDetailsScreen(ChecklistStepDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = new FullScreenStateDelegate();
        this.L = new RowDelegate(null, null, 7);
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: gh3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChecklistStepDetailsScreen f143833b;

            {
                this.f143833b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = ChecklistStepDetailsScreen.R;
                        ChecklistStepDetailsScreen checklistStepDetailsScreen = this.f143833b;
                        return dli.f.a(checklistStepDetailsScreen, checklistStepDetailsScreen.R2(), v.k(new ListSubheaderDelegate(), new RowLoadingDelegate(), checklistStepDetailsScreen.L, checklistStepDetailsScreen.K, new HeaderLoadingDelegate(), new TextDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = ChecklistStepDetailsScreen.R;
                        return (h) ((vg3.i) this.f143833b.O.getValue()).f288747h.get();
                }
            }
        });
        this.N = R$layout.screen_recycler_navbar_footer;
        this.O = w.y0(new fx5.a(this, inputData, 27));
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: gh3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChecklistStepDetailsScreen f143833b;

            {
                this.f143833b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ChecklistStepDetailsScreen.R;
                        ChecklistStepDetailsScreen checklistStepDetailsScreen = this.f143833b;
                        return dli.f.a(checklistStepDetailsScreen, checklistStepDetailsScreen.R2(), v.k(new ListSubheaderDelegate(), new RowLoadingDelegate(), checklistStepDetailsScreen.L, checklistStepDetailsScreen.K, new HeaderLoadingDelegate(), new TextDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = ChecklistStepDetailsScreen.R;
                        return (h) ((vg3.i) this.f143833b.O.getValue()).f288747h.get();
                }
            }
        });
        this.Q = s.t(this, b.f);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f174555c;
        navBarWithToolbar.setTitle(uiState.f143840a.f143839a, null);
        navBarWithToolbar.setToolbarTitle(uiState.f143840a.f143839a);
        FooterTextView footerTextView = d3().f174554b;
        f fVar = uiState.f143842c;
        footerTextView.setVisibility(fVar != null ? 0 : 8);
        if (fVar != null) {
            footerTextView.setContent(new c7(fVar.f143838a, false, null, 6));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (vg3.i) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174555c.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174555c.f59410q), new g85.f(this, null, 11), 3);
        ViewController.P2(this, rd0.e.b(this.K.f52371h.f121375b), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(w.a0(this.L.f53218h, new j(19))), new g(this, null, 21), 3);
        ViewController.P2(this, rd0.e.b(d3().f174554b.f58608l), new k(2, R2(), gh3.h.class, "onFooterLinkClicked", "onFooterLinkClicked(Lcom/revolut/core/ui_kit_core/clause/ClauseDisplayer$ClickData;)V", 4, 17), 3);
    }

    public final r d3() {
        ViewBinding value = this.Q.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (r) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final gh3.h R2() {
        return (gh3.h) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.M.getValue();
    }
}
