package com.revolut.feature.slot_manager.impl.ui.custom_rating.dialog;

import aii.q;
import android.view.View;
import bld.j;
import c65.i;
import cld.a;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.slot_manager.impl.ui.custom_rating.dialog.CustomRatingBottomSheetContract$InputData;
import com.revolut.feature.slot_manager.impl.ui.custom_rating.dialog.CustomRatingBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kli.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import rkd.g;
import te0.w;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/slot_manager/impl/ui/custom_rating/dialog/CustomRatingBottomSheetController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Lcld/a;", "feature_slot_manager_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CustomRatingBottomSheetController extends BaseBottomSheetRecyclerController<q, a> {
    public static final /* synthetic */ int V = 0;
    public final CustomRatingBottomSheetContract$InputData Q;
    public final InputTextDelegate R;
    public final Object S;
    public final Object T;
    public final Object U;

    public CustomRatingBottomSheetController(CustomRatingBottomSheetContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        this.R = new InputTextDelegate(null);
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: cld.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CustomRatingBottomSheetController f24974b;

            {
                this.f24974b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CustomRatingBottomSheetController customRatingBottomSheetController = this.f24974b;
                switch (i2) {
                    case 0:
                        return u.c(customRatingBottomSheetController.R);
                    case 1:
                        int i3 = CustomRatingBottomSheetController.V;
                        phm.a aVar = (phm.a) ue0.e.j(customRatingBottomSheetController.m2()).a().get(g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", g.class, " is not found"));
                        }
                        g gVar = ((g) aVar2.b()).f254806l;
                        CustomRatingBottomSheetContract$InputData customRatingBottomSheetContract$InputData = customRatingBottomSheetController.Q;
                        customRatingBottomSheetContract$InputData.getClass();
                        return new rkd.a(gVar, customRatingBottomSheetContract$InputData);
                    default:
                        int i5 = CustomRatingBottomSheetController.V;
                        rkd.a aVar3 = (rkd.a) customRatingBottomSheetController.T.getValue();
                        return new e(aVar3.f254793a, (j) aVar3.f254794b.C.get());
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: cld.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CustomRatingBottomSheetController f24974b;

            {
                this.f24974b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CustomRatingBottomSheetController customRatingBottomSheetController = this.f24974b;
                switch (i22) {
                    case 0:
                        return u.c(customRatingBottomSheetController.R);
                    case 1:
                        int i3 = CustomRatingBottomSheetController.V;
                        phm.a aVar = (phm.a) ue0.e.j(customRatingBottomSheetController.m2()).a().get(g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", g.class, " is not found"));
                        }
                        g gVar = ((g) aVar2.b()).f254806l;
                        CustomRatingBottomSheetContract$InputData customRatingBottomSheetContract$InputData = customRatingBottomSheetController.Q;
                        customRatingBottomSheetContract$InputData.getClass();
                        return new rkd.a(gVar, customRatingBottomSheetContract$InputData);
                    default:
                        int i5 = CustomRatingBottomSheetController.V;
                        rkd.a aVar3 = (rkd.a) customRatingBottomSheetController.T.getValue();
                        return new e(aVar3.f254793a, (j) aVar3.f254794b.C.get());
                }
            }
        });
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: cld.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CustomRatingBottomSheetController f24974b;

            {
                this.f24974b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CustomRatingBottomSheetController customRatingBottomSheetController = this.f24974b;
                switch (i22) {
                    case 0:
                        return u.c(customRatingBottomSheetController.R);
                    case 1:
                        int i32 = CustomRatingBottomSheetController.V;
                        phm.a aVar = (phm.a) ue0.e.j(customRatingBottomSheetController.m2()).a().get(g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", g.class, " is not found"));
                        }
                        g gVar = ((g) aVar2.b()).f254806l;
                        CustomRatingBottomSheetContract$InputData customRatingBottomSheetContract$InputData = customRatingBottomSheetController.Q;
                        customRatingBottomSheetContract$InputData.getClass();
                        return new rkd.a(gVar, customRatingBottomSheetContract$InputData);
                    default:
                        int i5 = CustomRatingBottomSheetController.V;
                        rkd.a aVar3 = (rkd.a) customRatingBottomSheetController.T.getValue();
                        return new e(aVar3.f254793a, (j) aVar3.f254794b.C.get());
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final void J0(boolean z) {
        View viewFindFocus;
        super.J0(z);
        if (!z || (viewFindFocus = D2().findFocus()) == null) {
            return;
        }
        c.d(viewFindFocus, 0L);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (rkd.a) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (cld.e) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: T2 */
    public final Boolean getG() {
        return null;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.R.e.f121375b), new cld.c(this, null), 3);
        ViewController.P2(this, e3(), new i(this, null, 22), 3);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final void i1(boolean z) {
        View viewFindFocus;
        if (z || (viewFindFocus = D2().findFocus()) == null) {
            return;
        }
        c.c(viewFindFocus, true);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (cld.e) this.U.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3 */
    public final List getS() {
        return (List) this.S.getValue();
    }
}
