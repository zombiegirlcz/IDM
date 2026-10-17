package com.revolut.feature.retail.salary_account.impl.salary_hub.reward_bottom_sheet;

import android.os.Parcelable;
import android.view.View;
import cli.k;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.SimpleMediaDelegate;
import com.revolut.core.ui_kit.delegates.TagDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.retail.salary_account.impl.salary_hub.reward_bottom_sheet.SalaryRewardBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import grl.k9;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nfj.j2;
import ngb.a;
import ngb.b;
import ngb.d;
import no.m;
import te0.w;
import wfb.i;
import wfb.j;
import wfb.o;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/salary_hub/reward_bottom_sheet/SalaryRewardBottomSheetController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lngb/b;", "Lcli/k;", "Lno/m;", "Lno/k;", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SalaryRewardBottomSheetController extends BaseBottomSheetRecyclerController<b, k> implements m, no.k {
    public static final /* synthetic */ int W = 0;
    public final a Q;
    public final AnalyticsProduct.Retail R;
    public AnalyticsContext S;
    public final Object T;
    public final Object U;
    public final List V;

    public SalaryRewardBottomSheetController(a inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        k9 k9Var = k9.Salary;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.R = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        this.S = null;
        final int i = 0;
        this.T = w.y0(new Function0(this) { // from class: ngb.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SalaryRewardBottomSheetController f215132b;

            {
                this.f215132b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SalaryRewardBottomSheetController salaryRewardBottomSheetController = this.f215132b;
                switch (i2) {
                    case 0:
                        int i3 = SalaryRewardBottomSheetController.W;
                        qji.b bVarU2 = salaryRewardBottomSheetController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.salary_account.impl.salary_hub.reward_bottom_sheet.di.SalaryRewardBottomSheetControllerComponent.Injector");
                        j jVar = (j) bVarU2;
                        i iVar = jVar.f297057b;
                        j jVar2 = jVar.f297058c;
                        a aVar = salaryRewardBottomSheetController.Q;
                        aVar.getClass();
                        return new o(iVar, jVar2, aVar);
                    default:
                        int i5 = SalaryRewardBottomSheetController.W;
                        return (d) ((o) salaryRewardBottomSheetController.T.getValue()).f297068b.get();
                }
            }
        });
        final int i2 = 1;
        this.U = w.y0(new Function0(this) { // from class: ngb.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SalaryRewardBottomSheetController f215132b;

            {
                this.f215132b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SalaryRewardBottomSheetController salaryRewardBottomSheetController = this.f215132b;
                switch (i22) {
                    case 0:
                        int i3 = SalaryRewardBottomSheetController.W;
                        qji.b bVarU2 = salaryRewardBottomSheetController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.salary_account.impl.salary_hub.reward_bottom_sheet.di.SalaryRewardBottomSheetControllerComponent.Injector");
                        j jVar = (j) bVarU2;
                        i iVar = jVar.f297057b;
                        j jVar2 = jVar.f297058c;
                        a aVar = salaryRewardBottomSheetController.Q;
                        aVar.getClass();
                        return new o(iVar, jVar2, aVar);
                    default:
                        int i5 = SalaryRewardBottomSheetController.W;
                        return (d) ((o) salaryRewardBottomSheetController.T.getValue()).f297068b.get();
                }
            }
        });
        this.V = v.k(new SimpleMediaDelegate(), new TagDelegate(), new TextDelegate());
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.S = analyticsContext;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getM() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (o) this.T.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getS() {
        return this.S;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b e3() {
        return (d) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new j2(this, null, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (d) this.U.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getV() {
        return this.V;
    }
}
