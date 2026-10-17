package com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.income_insurance_claim_bottom_sheet;

import android.view.View;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.income_insurance_claim_bottom_sheet.IncomeInsuranceClaimBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import ugb.a;
import ugb.c;
import ugb.f;
import wfb.b;
import wfb.i;
import wfb.j;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/salary_hub_phase3/income_insurance_claim_bottom_sheet/IncomeInsuranceClaimBottomSheetController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lugb/c;", "Lugb/a;", "<init>", "()V", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IncomeInsuranceClaimBottomSheetController extends BaseBottomSheetRecyclerController<c, a> {
    public static final /* synthetic */ int U = 0;
    public final SelectableDelegate Q;
    public final List R;
    public final Object S;
    public final Object T;

    public IncomeInsuranceClaimBottomSheetController() {
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        SelectableDelegate selectableDelegate = new SelectableDelegate(rowDelegate);
        this.Q = selectableDelegate;
        final int i = 0;
        final int i2 = 1;
        this.R = v.k(rowDelegate, selectableDelegate);
        this.S = w.y0(new Function0(this) { // from class: ugb.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IncomeInsuranceClaimBottomSheetController f279993b;

            {
                this.f279993b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                IncomeInsuranceClaimBottomSheetController incomeInsuranceClaimBottomSheetController = this.f279993b;
                switch (i3) {
                    case 0:
                        int i5 = IncomeInsuranceClaimBottomSheetController.U;
                        qji.b bVarU2 = incomeInsuranceClaimBottomSheetController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.income_insurance_claim_bottom_sheet.di.IncomeInsuranceClaimBottomSheetComponent.Injector");
                        i iVar = ((j) bVarU2).f297057b;
                        wfb.b bVar = new wfb.b();
                        bVar.f297026a = e4m.b.b(new wfb.a(iVar));
                        return bVar;
                    default:
                        int i6 = IncomeInsuranceClaimBottomSheetController.U;
                        return (f) ((wfb.b) incomeInsuranceClaimBottomSheetController.S.getValue()).f297026a.get();
                }
            }
        });
        this.T = w.y0(new Function0(this) { // from class: ugb.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IncomeInsuranceClaimBottomSheetController f279993b;

            {
                this.f279993b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                IncomeInsuranceClaimBottomSheetController incomeInsuranceClaimBottomSheetController = this.f279993b;
                switch (i3) {
                    case 0:
                        int i5 = IncomeInsuranceClaimBottomSheetController.U;
                        qji.b bVarU2 = incomeInsuranceClaimBottomSheetController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.income_insurance_claim_bottom_sheet.di.IncomeInsuranceClaimBottomSheetComponent.Injector");
                        i iVar = ((j) bVarU2).f297057b;
                        wfb.b bVar = new wfb.b();
                        bVar.f297026a = e4m.b.b(new wfb.a(iVar));
                        return bVar;
                    default:
                        int i6 = IncomeInsuranceClaimBottomSheetController.U;
                        return (f) ((wfb.b) incomeInsuranceClaimBottomSheetController.S.getValue()).f297026a.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (f) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.Q.r()), new ugb.e(this, null), 3);
        ViewController.P2(this, e3(), new uea.e(this, null, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (f) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getV() {
        return this.R;
    }
}
