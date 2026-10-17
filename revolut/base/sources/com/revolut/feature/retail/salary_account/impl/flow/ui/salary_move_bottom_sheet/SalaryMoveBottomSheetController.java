package com.revolut.feature.retail.salary_account.impl.flow.ui.salary_move_bottom_sheet;

import android.os.Parcelable;
import android.view.View;
import cgb.d;
import cgb.f;
import cgb.h;
import cli.k;
import com.google.android.gms.internal.mlkit_vision_face.a;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.retail.salary_account.impl.flow.ui.salary_move_bottom_sheet.SalaryMoveBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import grl.k9;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import pki.b;
import te0.w;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/flow/ui/salary_move_bottom_sheet/SalaryMoveBottomSheetController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lcgb/d;", "Lcli/k;", "Lno/m;", "<init>", "()V", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SalaryMoveBottomSheetController extends BaseBottomSheetRecyclerController<d, k> implements m {
    public static final /* synthetic */ int V = 0;
    public final Object Q;
    public final Object R;
    public final AnalyticsProduct.Retail S;
    public final RowDelegate T;
    public final List U;

    public SalaryMoveBottomSheetController() {
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: cgb.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SalaryMoveBottomSheetController f23901b;

            {
                this.f23901b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SalaryMoveBottomSheetController salaryMoveBottomSheetController = this.f23901b;
                switch (i2) {
                    case 0:
                        int i3 = SalaryMoveBottomSheetController.V;
                        qji.b bVarU2 = salaryMoveBottomSheetController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.salary_account.impl.flow.ui.salary_move_bottom_sheet.di.SalaryMoveBottomSheetComponent.Injector");
                        wfb.m mVar = new wfb.m();
                        mVar.f297063a = e4m.b.b(new vk6.a(13));
                        return mVar;
                    default:
                        int i5 = SalaryMoveBottomSheetController.V;
                        return (h) ((wfb.m) salaryMoveBottomSheetController.Q.getValue()).f297063a.get();
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: cgb.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SalaryMoveBottomSheetController f23901b;

            {
                this.f23901b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SalaryMoveBottomSheetController salaryMoveBottomSheetController = this.f23901b;
                switch (i22) {
                    case 0:
                        int i3 = SalaryMoveBottomSheetController.V;
                        qji.b bVarU2 = salaryMoveBottomSheetController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.salary_account.impl.flow.ui.salary_move_bottom_sheet.di.SalaryMoveBottomSheetComponent.Injector");
                        wfb.m mVar = new wfb.m();
                        mVar.f297063a = e4m.b.b(new vk6.a(13));
                        return mVar;
                    default:
                        int i5 = SalaryMoveBottomSheetController.V;
                        return (h) ((wfb.m) salaryMoveBottomSheetController.Q.getValue()).f297063a.get();
                }
            }
        });
        k9 k9Var = k9.Salary;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.S = a.h(k9Var, "value", k9Var);
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.T = rowDelegate;
        this.U = u.c(rowDelegate);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getT() {
        return this.S;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (wfb.m) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (h) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.T.f53218h), new f(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (h) this.R.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getU() {
        return this.U;
    }
}
