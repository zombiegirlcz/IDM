package com.revolut.feature.atm.impl.ui.redesign.fees;

import aii.q;
import android.view.View;
import com.revolut.feature.atm.impl.ui.redesign.fees.AtmFeesBottomSheetController;
import com.revolut.feature.atm.impl.ui.redesign.fees.AtmFeesBottomSheetScreenContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import ik2.c;
import ik2.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import te0.w;
import ue0.e;
import xj2.g;
import xj2.n;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/atm/impl/ui/redesign/fees/AtmFeesBottomSheetController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Lik2/d;", "feature_atm_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AtmFeesBottomSheetController extends BaseBottomSheetRecyclerController<q, d> {
    public static final /* synthetic */ int U = 0;
    public final AtmFeesBottomSheetScreenContract$InputData Q;
    public final Object R;
    public final Object S;
    public final List T;

    public AtmFeesBottomSheetController(AtmFeesBottomSheetScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: ik2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AtmFeesBottomSheetController f161873b;

            {
                this.f161873b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AtmFeesBottomSheetController atmFeesBottomSheetController = this.f161873b;
                switch (i2) {
                    case 0:
                        int i3 = AtmFeesBottomSheetController.U;
                        phm.a aVar = (phm.a) e.j(atmFeesBottomSheetController.m2()).a().get(n.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n.class, " is not found"));
                        }
                        n nVar = ((n) aVar2.b()).f306487q;
                        AtmFeesBottomSheetScreenContract$InputData atmFeesBottomSheetScreenContract$InputData = atmFeesBottomSheetController.Q;
                        atmFeesBottomSheetScreenContract$InputData.getClass();
                        return new g(nVar, atmFeesBottomSheetScreenContract$InputData);
                    default:
                        int i5 = AtmFeesBottomSheetController.U;
                        return (c) ((g) atmFeesBottomSheetController.R.getValue()).f306462c.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: ik2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AtmFeesBottomSheetController f161873b;

            {
                this.f161873b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AtmFeesBottomSheetController atmFeesBottomSheetController = this.f161873b;
                switch (i22) {
                    case 0:
                        int i3 = AtmFeesBottomSheetController.U;
                        phm.a aVar = (phm.a) e.j(atmFeesBottomSheetController.m2()).a().get(n.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n.class, " is not found"));
                        }
                        n nVar = ((n) aVar2.b()).f306487q;
                        AtmFeesBottomSheetScreenContract$InputData atmFeesBottomSheetScreenContract$InputData = atmFeesBottomSheetController.Q;
                        atmFeesBottomSheetScreenContract$InputData.getClass();
                        return new g(nVar, atmFeesBottomSheetScreenContract$InputData);
                    default:
                        int i5 = AtmFeesBottomSheetController.U;
                        return (c) ((g) atmFeesBottomSheetController.R.getValue()).f306462c.get();
                }
            }
        });
        this.T = b.v(null, null, 7);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (g) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (c) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new iaf.d(this, null, 10), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (c) this.S.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getU() {
        return this.T;
    }
}
