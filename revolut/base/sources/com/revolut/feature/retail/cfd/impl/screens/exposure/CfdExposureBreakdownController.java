package com.revolut.feature.retail.cfd.impl.screens.exposure;

import aii.q;
import android.view.View;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.retail.cfd.impl.screens.exposure.CfdExposureBreakdownController;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m2b.j;
import m2b.v;
import p3b.c;
import p3b.e;
import p3b.f;
import pki.b;
import te0.w;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/cfd/impl/screens/exposure/CfdExposureBreakdownController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Lp3b/e;", "feature_retail_cfd_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CfdExposureBreakdownController extends BaseBottomSheetRecyclerController<q, e> {
    public static final /* synthetic */ int V = 0;
    public final f Q;
    public final FullScreenStateDelegate R;
    public final Object S;
    public final List T;
    public final Object U;

    public CfdExposureBreakdownController(f inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.R = fullScreenStateDelegate;
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: p3b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CfdExposureBreakdownController f232705b;

            {
                this.f232705b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CfdExposureBreakdownController cfdExposureBreakdownController = this.f232705b;
                switch (i2) {
                    case 0:
                        int i3 = CfdExposureBreakdownController.V;
                        return (c) ((m2b.j) cfdExposureBreakdownController.U.getValue()).f201845c.get();
                    default:
                        int i5 = CfdExposureBreakdownController.V;
                        phm.a aVar = (phm.a) ue0.e.j(cfdExposureBreakdownController.m2()).a().get(v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", v.class, " is not found"));
                        }
                        v vVar = ((v) aVar2.b()).C;
                        f fVar = cfdExposureBreakdownController.Q;
                        fVar.getClass();
                        return new m2b.j(vVar, fVar);
                }
            }
        });
        final int i2 = 1;
        this.T = zhm.v.k(new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), fullScreenStateDelegate);
        this.U = w.y0(new Function0(this) { // from class: p3b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CfdExposureBreakdownController f232705b;

            {
                this.f232705b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CfdExposureBreakdownController cfdExposureBreakdownController = this.f232705b;
                switch (i22) {
                    case 0:
                        int i3 = CfdExposureBreakdownController.V;
                        return (c) ((m2b.j) cfdExposureBreakdownController.U.getValue()).f201845c.get();
                    default:
                        int i5 = CfdExposureBreakdownController.V;
                        phm.a aVar = (phm.a) ue0.e.j(cfdExposureBreakdownController.m2()).a().get(v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", v.class, " is not found"));
                        }
                        v vVar = ((v) aVar2.b()).C;
                        f fVar = cfdExposureBreakdownController.Q;
                        fVar.getClass();
                        return new m2b.j(vVar, fVar);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (j) this.U.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (c) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.R.f52371h.f121375b), new p3b.b(this, null), 3);
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
