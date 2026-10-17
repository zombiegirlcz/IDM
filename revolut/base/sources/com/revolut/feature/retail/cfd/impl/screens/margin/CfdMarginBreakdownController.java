package com.revolut.feature.retail.cfd.impl.screens.margin;

import aii.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.retail.cfd.impl.screens.margin.CfdMarginBreakdownController;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m2b.a0;
import m2b.z;
import pki.b;
import te0.w;
import w3b.d;
import w3b.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/cfd/impl/screens/margin/CfdMarginBreakdownController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Lw3b/d;", "feature_retail_cfd_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CfdMarginBreakdownController extends BaseBottomSheetRecyclerController<q, d> {
    public static final /* synthetic */ int U = 0;
    public final e Q;
    public final Object R;
    public final List S;
    public final Object T;

    public CfdMarginBreakdownController(e inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: w3b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CfdMarginBreakdownController f294251b;

            {
                this.f294251b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CfdMarginBreakdownController cfdMarginBreakdownController = this.f294251b;
                switch (i2) {
                    case 0:
                        int i3 = CfdMarginBreakdownController.U;
                        a0 a0Var = (a0) cfdMarginBreakdownController.T.getValue();
                        switch (a0Var.f201770a) {
                            case 0:
                                return (b) a0Var.f201772c.get();
                            default:
                                return (b) a0Var.f201772c.get();
                        }
                    default:
                        int i5 = CfdMarginBreakdownController.U;
                        qji.b bVarU2 = cfdMarginBreakdownController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.cfd.impl.screens.margin.di.CfdMarginBreakdownControllerComponent.Injector");
                        z zVar = (z) ((x3b.a) bVarU2).b().mo3808a(cfdMarginBreakdownController);
                        e eVar = cfdMarginBreakdownController.Q;
                        switch (zVar.f201950a) {
                            case 0:
                                eVar.getClass();
                                zVar.d = eVar;
                                break;
                            default:
                                eVar.getClass();
                                zVar.d = eVar;
                                break;
                        }
                        return (a0) zVar.mo3783build();
                }
            }
        });
        final int i2 = 1;
        this.S = v.k(new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), new FullScreenStateDelegate());
        this.T = w.y0(new Function0(this) { // from class: w3b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CfdMarginBreakdownController f294251b;

            {
                this.f294251b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CfdMarginBreakdownController cfdMarginBreakdownController = this.f294251b;
                switch (i22) {
                    case 0:
                        int i3 = CfdMarginBreakdownController.U;
                        a0 a0Var = (a0) cfdMarginBreakdownController.T.getValue();
                        switch (a0Var.f201770a) {
                            case 0:
                                return (b) a0Var.f201772c.get();
                            default:
                                return (b) a0Var.f201772c.get();
                        }
                    default:
                        int i5 = CfdMarginBreakdownController.U;
                        qji.b bVarU2 = cfdMarginBreakdownController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.cfd.impl.screens.margin.di.CfdMarginBreakdownControllerComponent.Injector");
                        z zVar = (z) ((x3b.a) bVarU2).b().mo3808a(cfdMarginBreakdownController);
                        e eVar = cfdMarginBreakdownController.Q;
                        switch (zVar.f201950a) {
                            case 0:
                                eVar.getClass();
                                zVar.d = eVar;
                                break;
                            default:
                                eVar.getClass();
                                zVar.d = eVar;
                                break;
                        }
                        return (a0) zVar.mo3783build();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (a0) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (w3b.b) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (w3b.b) this.R.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getS() {
        return this.S;
    }
}
