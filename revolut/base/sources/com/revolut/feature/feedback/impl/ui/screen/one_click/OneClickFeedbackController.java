package com.revolut.feature.feedback.impl.ui.screen.one_click;

import android.view.View;
import com.revolut.core.ui_kit.delegates.RateOneClickDelegate;
import com.revolut.feature.feedback.impl.ui.screen.one_click.OneClickFeedbackContract$InputData;
import com.revolut.feature.feedback.impl.ui.screen.one_click.OneClickFeedbackController;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import gp6.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import tna.p;
import tp6.a;
import tp6.b;
import tp6.d;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/feedback/impl/ui/screen/one_click/OneClickFeedbackController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Ltp6/d;", "Ltp6/b;", "feature_feedback_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OneClickFeedbackController extends BaseBottomSheetRecyclerController<d, b> {
    public static final /* synthetic */ int V = 0;
    public final OneClickFeedbackContract$InputData Q;
    public final RateOneClickDelegate R;
    public final Object S;
    public final Object T;
    public final List U;

    public OneClickFeedbackController(OneClickFeedbackContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        RateOneClickDelegate rateOneClickDelegate = new RateOneClickDelegate();
        this.R = rateOneClickDelegate;
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: tp6.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OneClickFeedbackController f273295b;

            {
                this.f273295b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                OneClickFeedbackController oneClickFeedbackController = this.f273295b;
                switch (i2) {
                    case 0:
                        int i3 = OneClickFeedbackController.V;
                        phm.a aVar = (phm.a) ue0.e.j(oneClickFeedbackController.m2()).a().get(gp6.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gp6.e.class, " is not found"));
                        }
                        gp6.e eVar = ((gp6.e) aVar2.b()).d;
                        OneClickFeedbackContract$InputData oneClickFeedbackContract$InputData = oneClickFeedbackController.Q;
                        oneClickFeedbackContract$InputData.getClass();
                        return new gp6.f(eVar, oneClickFeedbackContract$InputData);
                    default:
                        int i5 = OneClickFeedbackController.V;
                        return (a) ((gp6.f) oneClickFeedbackController.S.getValue()).f145274b.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: tp6.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OneClickFeedbackController f273295b;

            {
                this.f273295b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                OneClickFeedbackController oneClickFeedbackController = this.f273295b;
                switch (i22) {
                    case 0:
                        int i3 = OneClickFeedbackController.V;
                        phm.a aVar = (phm.a) ue0.e.j(oneClickFeedbackController.m2()).a().get(gp6.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gp6.e.class, " is not found"));
                        }
                        gp6.e eVar = ((gp6.e) aVar2.b()).d;
                        OneClickFeedbackContract$InputData oneClickFeedbackContract$InputData = oneClickFeedbackController.Q;
                        oneClickFeedbackContract$InputData.getClass();
                        return new gp6.f(eVar, oneClickFeedbackContract$InputData);
                    default:
                        int i5 = OneClickFeedbackController.V;
                        return (a) ((gp6.f) oneClickFeedbackController.S.getValue()).f145274b.get();
                }
            }
        });
        this.U = u.c(rateOneClickDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (a) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, kii.e.t(this.R.d, "hide(...)"), new p(this, null, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (a) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getZ() {
        return this.U;
    }
}
