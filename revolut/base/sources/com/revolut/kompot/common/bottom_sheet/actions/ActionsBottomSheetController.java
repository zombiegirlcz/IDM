package com.revolut.kompot.common.bottom_sheet.actions;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import cii.b;
import cli.a0;
import cli.o;
import cli.q;
import cli.w;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dii.g;
import dii.l;
import dii.n;
import java.util.List;
import koi.c;
import koi.h;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import no.k;
import no.m;
import org.jetbrains.annotations.NotNull;
import xki.a;
import xki.e;
import yp0.y;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006:\u0004\b\t\u0002\n¨\u0006\u000b"}, d2 = {"Lcom/revolut/kompot/common/bottom_sheet/actions/ActionsBottomSheetController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetController;", "Ldii/g;", "Lcli/w;", "Lcii/b;", "Lno/m;", "Lno/k;", "Companion", "dii/a", "dii/j", "a", "kompot_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ActionsBottomSheetController extends BaseBottomSheetController<g> implements w, m, k {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public final dii.m N;
    public final h O;
    public final AnalyticsProduct P;
    public AnalyticsContext Q;
    public final dii.m R;
    public final a S;
    public final Object T;

    /* JADX INFO: renamed from: com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public ActionsBottomSheetController(dii.a inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        dii.m mVar = new dii.m(new n(inputData));
        this.N = mVar;
        this.O = new h(new c(v.k(new TextDelegate(), new CellDetailsStandaloneNoteDelegate())), false, false, 6);
        this.P = inputData.f115064c;
        this.Q = inputData.d;
        this.R = mVar;
        this.S = a.f306815a;
        this.T = te0.w.y0(new ai4.k(this, 1));
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        b uiState = (b) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        j3(new cii.a(uiState.f24554b, uiState.f24555c));
        List list = uiState.f24553a;
        this.O.c(list);
        ScreenContentRecyclerView bottomSheetControllerBaseRecyclerView = g3().d;
        Intrinsics.checkNotNullExpressionValue(bottomSheetControllerBaseRecyclerView, "bottomSheetControllerBaseRecyclerView");
        bottomSheetControllerBaseRecyclerView.setVisibility(!list.isEmpty() ? 0 : 8);
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.Q = analyticsContext;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getQ() {
        return this.P;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return this.S;
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getR() {
        return this.Q;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return this.R;
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetController, com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.Y2(view);
        ScreenContentRecyclerView bottomSheetControllerBaseRecyclerView = g3().d;
        Intrinsics.checkNotNullExpressionValue(bottomSheetControllerBaseRecyclerView, "bottomSheetControllerBaseRecyclerView");
        y.h(bottomSheetControllerBaseRecyclerView, this.O, new LinearLayoutManager(bottomSheetControllerBaseRecyclerView.getContext()));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, e3(), new dii.k(this, continuation, 0), 3);
        ViewController.P2(this, f3(), new dii.k(this, continuation, 1), 3);
        ViewController.P2(this, d3(), new l(this, continuation, 0), 3);
        ViewController.P2(this, i3(), new l(this, continuation, 1), 3);
        ViewController.P2(this, h3(), new l(this, continuation, 2), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.T.getValue();
    }
}
