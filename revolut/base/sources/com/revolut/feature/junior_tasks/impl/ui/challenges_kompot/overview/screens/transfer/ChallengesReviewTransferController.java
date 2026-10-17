package com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.screens.transfer;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.junior_tasks.api.R$string;
import com.revolut.feature.junior_tasks.impl.R$id;
import com.revolut.feature.junior_tasks.impl.R$layout;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.screens.transfer.ChallengesReviewTransferController;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import gp8.m;
import hq8.b;
import hq8.c;
import hq8.d;
import hq8.f;
import hq8.k;
import hq8.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/overview/screens/transfer/ChallengesReviewTransferController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lhq8/k;", "Ldli/a;", "Lhq8/l;", "feature_junior_tasks_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChallengesReviewTransferController extends ViewController<k> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(ChallengesReviewTransferController.class, "binding", "getBinding()Lcom/revolut/feature/junior_tasks/impl/databinding/ScreenChallengeReviewTransferBinding;", 0))};
    public final h K;
    public final CellDetailsDelegate L;
    public final FullScreenStateDelegate M;
    public final int N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public ChallengesReviewTransferController(hq8.h inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, b.f);
        this.L = new CellDetailsDelegate();
        this.M = new FullScreenStateDelegate();
        this.N = R$layout.screen_challenge_review_transfer;
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: hq8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChallengesReviewTransferController f154626b;

            {
                this.f154626b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = ChallengesReviewTransferController.R;
                        ChallengesReviewTransferController challengesReviewTransferController = this.f154626b;
                        return dli.f.a(challengesReviewTransferController, challengesReviewTransferController.d(), v.k(new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), new RowDelegate(null, null, 7), new CenteredAmountDelegate(null), challengesReviewTransferController.L, challengesReviewTransferController.M), R$id.reviewTransfer_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = ChallengesReviewTransferController.R;
                        return (f) ((gp8.m) this.f154626b.P.getValue()).f145323c.get();
                }
            }
        });
        this.P = w.y0(new hl6.b(this, inputData, 9));
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: hq8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChallengesReviewTransferController f154626b;

            {
                this.f154626b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ChallengesReviewTransferController.R;
                        ChallengesReviewTransferController challengesReviewTransferController = this.f154626b;
                        return dli.f.a(challengesReviewTransferController, challengesReviewTransferController.d(), v.k(new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), new RowDelegate(null, null, 7), new CenteredAmountDelegate(null), challengesReviewTransferController.L, challengesReviewTransferController.M), R$id.reviewTransfer_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = ChallengesReviewTransferController.R;
                        return (f) ((gp8.m) this.f154626b.P.getValue()).f145323c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        LargeActionButton reviewTransferLargeActionButton = d3().f128117c;
        Intrinsics.checkNotNullExpressionValue(reviewTransferLargeActionButton, "reviewTransferLargeActionButton");
        reviewTransferLargeActionButton.setVisibility(uiState.f154633a ? 0 : 8);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (m) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        BasicNavBar basicNavBar = d3().f128116b;
        basicNavBar.setTitle(new TextLocalisedClause(R$string.challenges_review_transfer_navbar_title, null, null, 14));
        basicNavBar.setNavigationButtonImage(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        LargeActionButton largeActionButton = d3().f128117c;
        largeActionButton.setText(new TextLocalisedClause(R$string.challenges_review_transfer_action_button_label, null, null, 14));
        largeActionButton.o(LargeActionButton.ButtonStyle.f58725a);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f128116b.f59211b), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f128117c.o), new c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.L.e), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.M.f52371h.f121375b), new hq8.e(this, null), 3);
    }

    public final ep8.d d3() {
        ViewBinding value = this.K.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ep8.d) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final f d() {
        return (f) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
