package com.revolut.retail.feature.pricing_plans.ui.impl.screens.student_email_resend_bottom_sheet;

import android.view.View;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.student_email_resend_bottom_sheet.StudentEmailResendBottomSheet;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import qgk.i0;
import qgk.s1;
import qgk.y1;
import qni.a;
import qnk.c;
import qnk.d;
import qnk.g;
import te0.w;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/student_email_resend_bottom_sheet/StudentEmailResendBottomSheet;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lqnk/d;", "Lqnk/c;", "<init>", "()V", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StudentEmailResendBottomSheet extends BaseBottomSheetRecyclerController<d, c> {
    public static final /* synthetic */ int U = 0;
    public final Object Q;
    public final List R;
    public final Object S;
    public final Object T;

    public StudentEmailResendBottomSheet() {
        Lazy lazyY0 = w.y0(new a(1));
        this.Q = lazyY0;
        this.R = u.c((LargeActionButtonDelegate) lazyY0.getValue());
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: qnk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StudentEmailResendBottomSheet f247959b;

            {
                this.f247959b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                StudentEmailResendBottomSheet studentEmailResendBottomSheet = this.f247959b;
                switch (i2) {
                    case 0:
                        int i3 = StudentEmailResendBottomSheet.U;
                        qji.b bVarU2 = studentEmailResendBottomSheet.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.student_email_resend_bottom_sheet.di.StudentEmailResendBottomSheetInjector");
                        y1 y1Var = (y1) bVarU2;
                        i0 i0Var = y1Var.f246334b;
                        y1 y1Var2 = y1Var.f246335c;
                        s1 s1Var = new s1();
                        s1Var.f246231a = e4m.b.b(new qbj.w(i0Var, y1Var2, 11));
                        return s1Var;
                    default:
                        int i5 = StudentEmailResendBottomSheet.U;
                        return (g) ((s1) studentEmailResendBottomSheet.S.getValue()).f246231a.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: qnk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StudentEmailResendBottomSheet f247959b;

            {
                this.f247959b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                StudentEmailResendBottomSheet studentEmailResendBottomSheet = this.f247959b;
                switch (i22) {
                    case 0:
                        int i3 = StudentEmailResendBottomSheet.U;
                        qji.b bVarU2 = studentEmailResendBottomSheet.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.student_email_resend_bottom_sheet.di.StudentEmailResendBottomSheetInjector");
                        y1 y1Var = (y1) bVarU2;
                        i0 i0Var = y1Var.f246334b;
                        y1 y1Var2 = y1Var.f246335c;
                        s1 s1Var = new s1();
                        s1Var.f246231a = e4m.b.b(new qbj.w(i0Var, y1Var2, 11));
                        return s1Var;
                    default:
                        int i5 = StudentEmailResendBottomSheet.U;
                        return (g) ((s1) studentEmailResendBottomSheet.S.getValue()).f246231a.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (s1) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (g) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(((LargeActionButtonDelegate) this.Q.getValue()).d.f121375b), new qnk.b(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (g) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getR() {
        return this.R;
    }
}
