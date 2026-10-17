package com.revolut.feature.card_design.impl.card_design.rev_points_price_breakdown;

import aii.q;
import com.revolut.feature.card_design.impl.card_design.rev_points_price_breakdown.RevPointsPriceBreakdownController;
import com.revolut.feature.card_design.impl.card_design.rev_points_price_breakdown.RevPointsPriceBreakdownControllerContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import gy2.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import ue0.e;
import wp5.y;
import yx2.b;
import yx2.c;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/card_design/impl/card_design/rev_points_price_breakdown/RevPointsPriceBreakdownController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Lyx2/b;", "retail_feature_card_design_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevPointsPriceBreakdownController extends BaseBottomSheetRecyclerController<q, b> {
    public static final /* synthetic */ int U = 0;
    public final RevPointsPriceBreakdownControllerContract$InputData Q;
    public final List R;
    public final Object S;
    public final Object T;

    public RevPointsPriceBreakdownController(RevPointsPriceBreakdownControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        this.R = y.w();
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: yx2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsPriceBreakdownController f317539b;

            {
                this.f317539b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RevPointsPriceBreakdownController revPointsPriceBreakdownController = this.f317539b;
                switch (i2) {
                    case 0:
                        int i3 = RevPointsPriceBreakdownController.U;
                        phm.a aVar = (phm.a) e.j(revPointsPriceBreakdownController.m2()).a().get(gy2.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gy2.d.class, " is not found"));
                        }
                        gy2.d dVar = ((gy2.d) aVar2.b()).f147796y;
                        RevPointsPriceBreakdownControllerContract$InputData revPointsPriceBreakdownControllerContract$InputData = revPointsPriceBreakdownController.Q;
                        revPointsPriceBreakdownControllerContract$InputData.getClass();
                        return new j(dVar, revPointsPriceBreakdownControllerContract$InputData);
                    default:
                        int i5 = RevPointsPriceBreakdownController.U;
                        return (c) ((j) revPointsPriceBreakdownController.S.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: yx2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsPriceBreakdownController f317539b;

            {
                this.f317539b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RevPointsPriceBreakdownController revPointsPriceBreakdownController = this.f317539b;
                switch (i22) {
                    case 0:
                        int i3 = RevPointsPriceBreakdownController.U;
                        phm.a aVar = (phm.a) e.j(revPointsPriceBreakdownController.m2()).a().get(gy2.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gy2.d.class, " is not found"));
                        }
                        gy2.d dVar = ((gy2.d) aVar2.b()).f147796y;
                        RevPointsPriceBreakdownControllerContract$InputData revPointsPriceBreakdownControllerContract$InputData = revPointsPriceBreakdownController.Q;
                        revPointsPriceBreakdownControllerContract$InputData.getClass();
                        return new j(dVar, revPointsPriceBreakdownControllerContract$InputData);
                    default:
                        int i5 = RevPointsPriceBreakdownController.U;
                        return (c) ((j) revPointsPriceBreakdownController.S.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (j) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (c) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (c) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getR() {
        return this.R;
    }
}
