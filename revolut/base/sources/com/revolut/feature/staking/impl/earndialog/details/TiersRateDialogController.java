package com.revolut.feature.staking.impl.earndialog.details;

import aii.q;
import android.view.View;
import com.revolut.feature.staking.impl.earndialog.details.TiersRateDialogController;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qud.g;
import te0.w;
import tk5.c;
import tud.a;
import tud.b;
import tud.f;
import wp5.y;
import xki.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/staking/impl/earndialog/details/TiersRateDialogController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Ltud/a;", "feature_staking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TiersRateDialogController extends BaseBottomSheetRecyclerController<q, a> {
    public static final /* synthetic */ int U = 0;
    public final b Q;
    public final List R;
    public final Object S;
    public final Object T;

    public TiersRateDialogController(b inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        this.R = y.w();
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: tud.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TiersRateDialogController f274594b;

            {
                this.f274594b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TiersRateDialogController tiersRateDialogController = this.f274594b;
                switch (i2) {
                    case 0:
                        int i3 = TiersRateDialogController.U;
                        phm.a aVar = (phm.a) ue0.e.j(tiersRateDialogController.m2()).a().get(qud.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", qud.c.class, " is not found"));
                        }
                        qud.c cVar = ((qud.c) aVar2.b()).f249379y;
                        b bVar = tiersRateDialogController.Q;
                        bVar.getClass();
                        return new g(cVar, bVar);
                    default:
                        int i5 = TiersRateDialogController.U;
                        return (f) ((g) tiersRateDialogController.S.getValue()).f249399c.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: tud.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TiersRateDialogController f274594b;

            {
                this.f274594b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TiersRateDialogController tiersRateDialogController = this.f274594b;
                switch (i22) {
                    case 0:
                        int i3 = TiersRateDialogController.U;
                        phm.a aVar = (phm.a) ue0.e.j(tiersRateDialogController.m2()).a().get(qud.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", qud.c.class, " is not found"));
                        }
                        qud.c cVar = ((qud.c) aVar2.b()).f249379y;
                        b bVar = tiersRateDialogController.Q;
                        bVar.getClass();
                        return new g(cVar, bVar);
                    default:
                        int i5 = TiersRateDialogController.U;
                        return (f) ((g) tiersRateDialogController.S.getValue()).f249399c.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (f) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new c(this, null, 18), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (f) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getR() {
        return this.R;
    }
}
