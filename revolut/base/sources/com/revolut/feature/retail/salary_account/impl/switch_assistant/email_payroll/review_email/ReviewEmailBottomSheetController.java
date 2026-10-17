package com.revolut.feature.retail.salary_account.impl.switch_assistant.email_payroll.review_email;

import android.os.Parcelable;
import android.view.View;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextLoadingDelegate;
import com.revolut.feature.retail.salary_account.impl.switch_assistant.email_payroll.review_email.ReviewEmailBottomSheetContract$InputData;
import com.revolut.feature.retail.salary_account.impl.switch_assistant.email_payroll.review_email.ReviewEmailBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import grl.k9;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import qg4.d;
import qhb.a;
import qhb.b;
import qhb.f;
import te0.w;
import wfb.g;
import wfb.i;
import wfb.q;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/email_payroll/review_email/ReviewEmailBottomSheetController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lqhb/b;", "Lqhb/a;", "Lno/m;", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ReviewEmailBottomSheetController extends BaseBottomSheetRecyclerController<b, a> implements m {
    public static final /* synthetic */ int W = 0;
    public final ReviewEmailBottomSheetContract$InputData Q;
    public final AnalyticsProduct.Retail R;
    public final FullScreenStateDelegate S;
    public final List T;
    public final Object U;
    public final Object V;

    public ReviewEmailBottomSheetController(ReviewEmailBottomSheetContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        k9 k9Var = k9.Salary;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.R = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.S = fullScreenStateDelegate;
        final int i = 0;
        final int i2 = 1;
        this.T = v.k(new PlainTextDelegate(), new PlainTextLoadingDelegate(), fullScreenStateDelegate);
        this.U = w.y0(new Function0(this) { // from class: qhb.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReviewEmailBottomSheetController f246595b;

            {
                this.f246595b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                ReviewEmailBottomSheetController reviewEmailBottomSheetController = this.f246595b;
                switch (i3) {
                    case 0:
                        int i5 = ReviewEmailBottomSheetController.W;
                        qji.b bVarU2 = reviewEmailBottomSheetController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.salary_account.impl.switch_assistant.email_payroll.review_email.di.ReviewEmailBottomSheetComponent.Injector");
                        q qVar = (q) bVarU2;
                        i iVar = qVar.f297072c;
                        q qVar2 = qVar.d;
                        ReviewEmailBottomSheetContract$InputData reviewEmailBottomSheetContract$InputData = reviewEmailBottomSheetController.Q;
                        reviewEmailBottomSheetContract$InputData.getClass();
                        return new wfb.g(iVar, qVar2, reviewEmailBottomSheetContract$InputData);
                    default:
                        int i6 = ReviewEmailBottomSheetController.W;
                        return (f) ((wfb.g) reviewEmailBottomSheetController.U.getValue()).f297036b.get();
                }
            }
        });
        this.V = w.y0(new Function0(this) { // from class: qhb.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReviewEmailBottomSheetController f246595b;

            {
                this.f246595b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                ReviewEmailBottomSheetController reviewEmailBottomSheetController = this.f246595b;
                switch (i3) {
                    case 0:
                        int i5 = ReviewEmailBottomSheetController.W;
                        qji.b bVarU2 = reviewEmailBottomSheetController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.salary_account.impl.switch_assistant.email_payroll.review_email.di.ReviewEmailBottomSheetComponent.Injector");
                        q qVar = (q) bVarU2;
                        i iVar = qVar.f297072c;
                        q qVar2 = qVar.d;
                        ReviewEmailBottomSheetContract$InputData reviewEmailBottomSheetContract$InputData = reviewEmailBottomSheetController.Q;
                        reviewEmailBottomSheetContract$InputData.getClass();
                        return new wfb.g(iVar, qVar2, reviewEmailBottomSheetContract$InputData);
                    default:
                        int i6 = ReviewEmailBottomSheetController.W;
                        return (f) ((wfb.g) reviewEmailBottomSheetController.U.getValue()).f297036b.get();
                }
            }
        });
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getG0() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.U.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.V.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new d(this, null, 5), 3);
        ViewController.P2(this, rd0.e.b(this.S.f52371h.f121375b), new qhb.d(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (f) this.V.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getT() {
        return this.T;
    }
}
