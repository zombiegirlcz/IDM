package com.revolut.feature.feedback.impl.ui.screen.comment;

import android.view.View;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import q97.p1;
import qp6.a;
import qp6.b;
import qp6.c;
import qp6.d;
import te0.w;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/feedback/impl/ui/screen/comment/FeedbackCommentController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lqp6/c;", "Lqp6/b;", "feature_feedback_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FeedbackCommentController extends BaseBottomSheetRecyclerController<c, b> {
    public static final /* synthetic */ int V = 0;
    public final InputTextDelegate Q;
    public final LargeActionButtonDelegate R;
    public final Object S;
    public final Object T;
    public final List U;

    public FeedbackCommentController(FeedbackCommentContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        InputTextDelegate inputTextDelegate = new InputTextDelegate(null);
        this.Q = inputTextDelegate;
        LargeActionButtonDelegate largeActionButtonDelegate = new LargeActionButtonDelegate();
        this.R = largeActionButtonDelegate;
        this.S = w.y0(new qba.b(this, inputData, 20));
        this.T = w.y0(new p1(this, 15));
        this.U = v.k(inputTextDelegate, largeActionButtonDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (gp6.c) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (a) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.Q.e.f121375b), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.R.d.f121375b), new qp6.e(view, this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (a) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getU() {
        return this.U;
    }
}
