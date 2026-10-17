package com.revolut.retail.feature.esim.impl.ui.screens.refund_summary;

import afj.a3;
import afj.b3;
import aii.q;
import android.view.View;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsRevPointsDelegate;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.screens.refund_summary.EsimDataPlanRefundSummaryBottomSheetScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.refund_summary.EsimDataPlanRefundSummaryBottomSheetScreenContract$InputData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import se4.c;
import te0.w;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/refund_summary/EsimDataPlanRefundSummaryBottomSheetScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/refund_summary/EsimDataPlanRefundSummaryBottomSheetScreenContract$InputData;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimDataPlanRefundSummaryBottomSheetScreen extends BaseBottomSheetRecyclerController<q, EsimDataPlanRefundSummaryBottomSheetScreenContract$InputData> {
    public static final /* synthetic */ int U = 0;
    public final EsimDataPlanRefundSummaryBottomSheetScreenContract$InputData Q;
    public final List R;
    public final Object S;
    public final Object T;

    public EsimDataPlanRefundSummaryBottomSheetScreen(EsimDataPlanRefundSummaryBottomSheetScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        final int i = 0;
        final int i2 = 1;
        this.R = v.k(new CellDetailsDelegate(), new CellDetailsRevPointsDelegate());
        this.S = w.y0(new Function0(this) { // from class: smj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimDataPlanRefundSummaryBottomSheetScreen f264452b;

            {
                this.f264452b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                EsimDataPlanRefundSummaryBottomSheetScreen esimDataPlanRefundSummaryBottomSheetScreen = this.f264452b;
                switch (i3) {
                    case 0:
                        int i5 = EsimDataPlanRefundSummaryBottomSheetScreen.U;
                        qji.b bVarU2 = esimDataPlanRefundSummaryBottomSheetScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.refund_summary.di.EsimDataPlanRefundSummaryBottomSheetScreenInjector");
                        a3 a3Var = (a3) ((tmj.a) bVarU2).s().mo3808a(esimDataPlanRefundSummaryBottomSheetScreen);
                        EsimDataPlanRefundSummaryBottomSheetScreenContract$InputData esimDataPlanRefundSummaryBottomSheetScreenContract$InputData = esimDataPlanRefundSummaryBottomSheetScreen.Q;
                        switch (a3Var.f4117a) {
                            case 0:
                                esimDataPlanRefundSummaryBottomSheetScreenContract$InputData.getClass();
                                a3Var.d = esimDataPlanRefundSummaryBottomSheetScreenContract$InputData;
                                break;
                            default:
                                esimDataPlanRefundSummaryBottomSheetScreenContract$InputData.getClass();
                                a3Var.d = esimDataPlanRefundSummaryBottomSheetScreenContract$InputData;
                                break;
                        }
                        return (b3) a3Var.mo3783build();
                    default:
                        int i6 = EsimDataPlanRefundSummaryBottomSheetScreen.U;
                        b3 b3Var = (b3) esimDataPlanRefundSummaryBottomSheetScreen.S.getValue();
                        switch (b3Var.f4178a) {
                            case 0:
                                return (b) b3Var.e.get();
                            default:
                                return (b) b3Var.e.get();
                        }
                }
            }
        });
        this.T = w.y0(new Function0(this) { // from class: smj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimDataPlanRefundSummaryBottomSheetScreen f264452b;

            {
                this.f264452b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                EsimDataPlanRefundSummaryBottomSheetScreen esimDataPlanRefundSummaryBottomSheetScreen = this.f264452b;
                switch (i3) {
                    case 0:
                        int i5 = EsimDataPlanRefundSummaryBottomSheetScreen.U;
                        qji.b bVarU2 = esimDataPlanRefundSummaryBottomSheetScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.refund_summary.di.EsimDataPlanRefundSummaryBottomSheetScreenInjector");
                        a3 a3Var = (a3) ((tmj.a) bVarU2).s().mo3808a(esimDataPlanRefundSummaryBottomSheetScreen);
                        EsimDataPlanRefundSummaryBottomSheetScreenContract$InputData esimDataPlanRefundSummaryBottomSheetScreenContract$InputData = esimDataPlanRefundSummaryBottomSheetScreen.Q;
                        switch (a3Var.f4117a) {
                            case 0:
                                esimDataPlanRefundSummaryBottomSheetScreenContract$InputData.getClass();
                                a3Var.d = esimDataPlanRefundSummaryBottomSheetScreenContract$InputData;
                                break;
                            default:
                                esimDataPlanRefundSummaryBottomSheetScreenContract$InputData.getClass();
                                a3Var.d = esimDataPlanRefundSummaryBottomSheetScreenContract$InputData;
                                break;
                        }
                        return (b3) a3Var.mo3783build();
                    default:
                        int i6 = EsimDataPlanRefundSummaryBottomSheetScreen.U;
                        b3 b3Var = (b3) esimDataPlanRefundSummaryBottomSheetScreen.S.getValue();
                        switch (b3Var.f4178a) {
                            case 0:
                                return (b) b3Var.e.get();
                            default:
                                return (b) b3Var.e.get();
                        }
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b3) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (smj.b) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new c(this, null, 13), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (smj.b) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getU() {
        return this.R;
    }
}
