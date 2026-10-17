package com.revolut.feature.retail.cfd.impl.screens.spread;

import aii.q;
import android.view.View;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.retail.cfd.impl.screens.spread.CfdSpreadBreakdownController;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m2b.d0;
import m2b.e0;
import pki.b;
import q4b.c;
import q4b.e;
import q4b.g;
import te0.w;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/cfd/impl/screens/spread/CfdSpreadBreakdownController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Lq4b/e;", "feature_retail_cfd_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CfdSpreadBreakdownController extends BaseBottomSheetRecyclerController<q, e> {
    public static final /* synthetic */ int V = 0;
    public final g Q;
    public final FullScreenStateDelegate R;
    public final Object S;
    public final List T;
    public final Object U;

    public CfdSpreadBreakdownController(g inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.R = fullScreenStateDelegate;
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: q4b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CfdSpreadBreakdownController f242116b;

            {
                this.f242116b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CfdSpreadBreakdownController cfdSpreadBreakdownController = this.f242116b;
                switch (i2) {
                    case 0:
                        int i3 = CfdSpreadBreakdownController.V;
                        e0 e0Var = (e0) cfdSpreadBreakdownController.U.getValue();
                        switch (e0Var.f201815a) {
                            case 0:
                                return (c) e0Var.f201817c.get();
                            default:
                                return (c) e0Var.f201817c.get();
                        }
                    default:
                        int i5 = CfdSpreadBreakdownController.V;
                        qji.b bVarU2 = cfdSpreadBreakdownController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.cfd.impl.screens.spread.di.CfdSpreadBreakdownControllerComponent.Injector");
                        d0 d0Var = (d0) ((r4b.a) bVarU2).j().mo3808a(cfdSpreadBreakdownController);
                        g gVar = cfdSpreadBreakdownController.Q;
                        switch (d0Var.f201798a) {
                            case 0:
                                gVar.getClass();
                                d0Var.d = gVar;
                                break;
                            default:
                                gVar.getClass();
                                d0Var.d = gVar;
                                break;
                        }
                        return (e0) d0Var.mo3783build();
                }
            }
        });
        final int i2 = 1;
        this.T = v.k(new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), fullScreenStateDelegate);
        this.U = w.y0(new Function0(this) { // from class: q4b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CfdSpreadBreakdownController f242116b;

            {
                this.f242116b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CfdSpreadBreakdownController cfdSpreadBreakdownController = this.f242116b;
                switch (i22) {
                    case 0:
                        int i3 = CfdSpreadBreakdownController.V;
                        e0 e0Var = (e0) cfdSpreadBreakdownController.U.getValue();
                        switch (e0Var.f201815a) {
                            case 0:
                                return (c) e0Var.f201817c.get();
                            default:
                                return (c) e0Var.f201817c.get();
                        }
                    default:
                        int i5 = CfdSpreadBreakdownController.V;
                        qji.b bVarU2 = cfdSpreadBreakdownController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.cfd.impl.screens.spread.di.CfdSpreadBreakdownControllerComponent.Injector");
                        d0 d0Var = (d0) ((r4b.a) bVarU2).j().mo3808a(cfdSpreadBreakdownController);
                        g gVar = cfdSpreadBreakdownController.Q;
                        switch (d0Var.f201798a) {
                            case 0:
                                gVar.getClass();
                                d0Var.d = gVar;
                                break;
                            default:
                                gVar.getClass();
                                d0Var.d = gVar;
                                break;
                        }
                        return (e0) d0Var.mo3783build();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (e0) this.U.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b e3() {
        return (c) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.R.f52371h.f121375b), new q4b.b(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (c) this.S.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getT() {
        return this.T;
    }
}
