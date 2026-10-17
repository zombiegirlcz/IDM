package com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.screens.details;

import aee.g;
import android.view.View;
import cf6.a;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.ErrorDelegate;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import cq8.c;
import cq8.k;
import cq8.m;
import efm.r;
import gp8.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/overview/screens/details/ChallengesOverviewDetailsScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lcq8/k;", "Lcq8/c;", "feature_junior_tasks_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChallengesOverviewDetailsScreen extends BaseBottomSheetRecyclerController<k, c> {
    public static final /* synthetic */ int U = 0;
    public final Object Q;
    public final Object R;
    public final ErrorDelegate S;
    public final List T;

    public ChallengesOverviewDetailsScreen(ChallengesOverviewDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = w.y0(new a(this, inputData, 19));
        this.R = w.y0(new co7.a(this, 6));
        ErrorDelegate errorDelegate = new ErrorDelegate();
        this.S = errorDelegate;
        this.T = v.k(new CellDetailsDelegate(), new CellDetailsNoteDelegate(), new CellDetailsLoadingDelegate(), errorDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (m) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        cbf.c cVar = new cbf.c(e3(), 14);
        ?? r132 = this.R;
        ViewController.P2(this, cVar, new g(2, (m) r132.getValue(), m.class, "onEvent", "onEvent(Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/overview/screens/details/ChallengesOverviewDetailsScreenContract$Event;)V", 4, 25), 3);
        ViewController.P2(this, new cbf.c(f3(), 15), new g(2, (m) r132.getValue(), m.class, "onEvent", "onEvent(Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/overview/screens/details/ChallengesOverviewDetailsScreenContract$Event;)V", 4, 26), 3);
        r map = this.S.f52226c.map(new com.onfido.android.sdk.capture.ui.userconsent.c(new com.revolut.feature.alipay_plus.mpm.webcontainer.a(21), 19));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        ViewController.P2(this, rd0.e.b(map), new g(2, (m) r132.getValue(), m.class, "onEvent", "onEvent(Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/overview/screens/details/ChallengesOverviewDetailsScreenContract$Event;)V", 4, 24), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b d() {
        return (m) this.R.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getT() {
        return this.T;
    }
}
