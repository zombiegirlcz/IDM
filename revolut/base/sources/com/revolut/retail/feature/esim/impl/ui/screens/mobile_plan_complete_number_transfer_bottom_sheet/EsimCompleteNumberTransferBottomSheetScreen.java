package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_complete_number_transfer_bottom_sheet;

import afj.u1;
import afj.v1;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.k;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalV2Delegate;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.a;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_complete_number_transfer_bottom_sheet.EsimCompleteNumberTransferBottomSheetScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_complete_number_transfer_bottom_sheet.EsimCompleteNumberTransferBottomSheetScreenContract$InputData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tjj.b;
import tjj.c;
import tjj.d;
import tjj.g;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_complete_number_transfer_bottom_sheet/EsimCompleteNumberTransferBottomSheetScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Ltjj/g;", "Lcli/k;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimCompleteNumberTransferBottomSheetScreen extends BaseBottomSheetRecyclerController<g, k> {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(EsimCompleteNumberTransferBottomSheetScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetBaseBinding;", 0))};
    public final EsimCompleteNumberTransferBottomSheetScreenContract$InputData Q;
    public final h R;
    public final ProgressStepVerticalV2Delegate S;
    public final CellDetailsChevronDelegate T;
    public final List U;
    public final Object V;
    public final Object W;

    public EsimCompleteNumberTransferBottomSheetScreen(EsimCompleteNumberTransferBottomSheetScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        this.R = s.t(this, b.f);
        ProgressStepVerticalV2Delegate progressStepVerticalV2Delegate = new ProgressStepVerticalV2Delegate();
        this.S = progressStepVerticalV2Delegate;
        CellDetailsChevronDelegate cellDetailsChevronDelegate = new CellDetailsChevronDelegate();
        this.T = cellDetailsChevronDelegate;
        final int i = 0;
        final int i2 = 1;
        this.U = v.k(progressStepVerticalV2Delegate, cellDetailsChevronDelegate);
        this.V = w.y0(new Function0(this) { // from class: tjj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimCompleteNumberTransferBottomSheetScreen f271795b;

            {
                this.f271795b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                EsimCompleteNumberTransferBottomSheetScreen esimCompleteNumberTransferBottomSheetScreen = this.f271795b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = EsimCompleteNumberTransferBottomSheetScreen.X;
                        qji.b bVarU2 = esimCompleteNumberTransferBottomSheetScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_complete_number_transfer_bottom_sheet.di.EsimCompleteNumberTransferBottomSheetScreenInjector");
                        u1 u1Var = (u1) ((ujj.a) bVarU2).N().mo3808a(esimCompleteNumberTransferBottomSheetScreen);
                        EsimCompleteNumberTransferBottomSheetScreenContract$InputData esimCompleteNumberTransferBottomSheetScreenContract$InputData = esimCompleteNumberTransferBottomSheetScreen.Q;
                        switch (u1Var.f4467a) {
                            case 0:
                                esimCompleteNumberTransferBottomSheetScreenContract$InputData.getClass();
                                u1Var.d = esimCompleteNumberTransferBottomSheetScreenContract$InputData;
                                break;
                            case 1:
                                esimCompleteNumberTransferBottomSheetScreenContract$InputData.getClass();
                                u1Var.d = esimCompleteNumberTransferBottomSheetScreenContract$InputData;
                                break;
                            case 2:
                                esimCompleteNumberTransferBottomSheetScreenContract$InputData.getClass();
                                u1Var.d = esimCompleteNumberTransferBottomSheetScreenContract$InputData;
                                break;
                            case 3:
                                esimCompleteNumberTransferBottomSheetScreenContract$InputData.getClass();
                                u1Var.d = esimCompleteNumberTransferBottomSheetScreenContract$InputData;
                                break;
                            case 4:
                                esimCompleteNumberTransferBottomSheetScreenContract$InputData.getClass();
                                u1Var.d = esimCompleteNumberTransferBottomSheetScreenContract$InputData;
                                break;
                            case 5:
                                esimCompleteNumberTransferBottomSheetScreenContract$InputData.getClass();
                                u1Var.d = esimCompleteNumberTransferBottomSheetScreenContract$InputData;
                                break;
                            default:
                                esimCompleteNumberTransferBottomSheetScreenContract$InputData.getClass();
                                u1Var.d = esimCompleteNumberTransferBottomSheetScreenContract$InputData;
                                break;
                        }
                        return (v1) u1Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr2 = EsimCompleteNumberTransferBottomSheetScreen.X;
                        v1 v1Var = (v1) esimCompleteNumberTransferBottomSheetScreen.V.getValue();
                        switch (v1Var.f4493a) {
                            case 0:
                                return (h) v1Var.d.get();
                            case 1:
                                return (h) v1Var.d.get();
                            case 2:
                                return (h) v1Var.d.get();
                            case 3:
                                return (h) v1Var.d.get();
                            case 4:
                                return (h) v1Var.d.get();
                            case 5:
                                return (h) v1Var.d.get();
                            default:
                                return (h) v1Var.d.get();
                        }
                }
            }
        });
        this.W = w.y0(new Function0(this) { // from class: tjj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimCompleteNumberTransferBottomSheetScreen f271795b;

            {
                this.f271795b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                EsimCompleteNumberTransferBottomSheetScreen esimCompleteNumberTransferBottomSheetScreen = this.f271795b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = EsimCompleteNumberTransferBottomSheetScreen.X;
                        qji.b bVarU2 = esimCompleteNumberTransferBottomSheetScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_complete_number_transfer_bottom_sheet.di.EsimCompleteNumberTransferBottomSheetScreenInjector");
                        u1 u1Var = (u1) ((ujj.a) bVarU2).N().mo3808a(esimCompleteNumberTransferBottomSheetScreen);
                        EsimCompleteNumberTransferBottomSheetScreenContract$InputData esimCompleteNumberTransferBottomSheetScreenContract$InputData = esimCompleteNumberTransferBottomSheetScreen.Q;
                        switch (u1Var.f4467a) {
                            case 0:
                                esimCompleteNumberTransferBottomSheetScreenContract$InputData.getClass();
                                u1Var.d = esimCompleteNumberTransferBottomSheetScreenContract$InputData;
                                break;
                            case 1:
                                esimCompleteNumberTransferBottomSheetScreenContract$InputData.getClass();
                                u1Var.d = esimCompleteNumberTransferBottomSheetScreenContract$InputData;
                                break;
                            case 2:
                                esimCompleteNumberTransferBottomSheetScreenContract$InputData.getClass();
                                u1Var.d = esimCompleteNumberTransferBottomSheetScreenContract$InputData;
                                break;
                            case 3:
                                esimCompleteNumberTransferBottomSheetScreenContract$InputData.getClass();
                                u1Var.d = esimCompleteNumberTransferBottomSheetScreenContract$InputData;
                                break;
                            case 4:
                                esimCompleteNumberTransferBottomSheetScreenContract$InputData.getClass();
                                u1Var.d = esimCompleteNumberTransferBottomSheetScreenContract$InputData;
                                break;
                            case 5:
                                esimCompleteNumberTransferBottomSheetScreenContract$InputData.getClass();
                                u1Var.d = esimCompleteNumberTransferBottomSheetScreenContract$InputData;
                                break;
                            default:
                                esimCompleteNumberTransferBottomSheetScreenContract$InputData.getClass();
                                u1Var.d = esimCompleteNumberTransferBottomSheetScreenContract$InputData;
                                break;
                        }
                        return (v1) u1Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr2 = EsimCompleteNumberTransferBottomSheetScreen.X;
                        v1 v1Var = (v1) esimCompleteNumberTransferBottomSheetScreen.V.getValue();
                        switch (v1Var.f4493a) {
                            case 0:
                                return (h) v1Var.d.get();
                            case 1:
                                return (h) v1Var.d.get();
                            case 2:
                                return (h) v1Var.d.get();
                            case 3:
                                return (h) v1Var.d.get();
                            case 4:
                                return (h) v1Var.d.get();
                            case 5:
                                return (h) v1Var.d.get();
                            default:
                                return (h) v1Var.d.get();
                        }
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (v1) this.V.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b k3() {
        return (tjj.h) this.W.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.R.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        a.g2(this, rd0.e.b(((jii.e) value).f174513b.f), null, new c(this, null, 0), 3);
        a.g2(this, rd0.e.b(this.S.e), null, new c(this, null, 1), 3);
        a.g2(this, rd0.e.b(this.T.f51821c), null, new d(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (tjj.h) this.W.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getU() {
        return this.U;
    }
}
