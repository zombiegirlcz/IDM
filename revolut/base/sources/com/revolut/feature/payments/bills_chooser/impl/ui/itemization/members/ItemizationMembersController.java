package com.revolut.feature.payments.bills_chooser.impl.ui.itemization.members;

import android.view.View;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.payments.bills_chooser.impl.ui.itemization.members.ItemizationMembersController;
import com.revolut.feature.payments.bills_chooser.impl.ui.itemization.members.ItemizationMembersControllerContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import fq9.c;
import fq9.d;
import fq9.e;
import fq9.f;
import gp9.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/bills_chooser/impl/ui/itemization/members/ItemizationMembersController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lfq9/e;", "Lfq9/d;", "feature_payments_bills_chooser_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ItemizationMembersController extends BaseBottomSheetRecyclerController<e, d> {
    public static final /* synthetic */ int V = 0;
    public final ItemizationMembersControllerContract$InputData Q;
    public final Object R;
    public final Object S;
    public final SelectableDelegate T;
    public final List U;

    public ItemizationMembersController(ItemizationMembersControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: fq9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ItemizationMembersController f137212b;

            {
                this.f137212b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ItemizationMembersController itemizationMembersController = this.f137212b;
                switch (i2) {
                    case 0:
                        int i3 = ItemizationMembersController.V;
                        phm.a aVar = (phm.a) ue0.e.j(itemizationMembersController.m2()).a().get(gp9.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gp9.a.class, " is not found"));
                        }
                        gp9.d dVar = ((gp9.d) ((gp9.a) aVar2.b())).f145365r;
                        ItemizationMembersControllerContract$InputData itemizationMembersControllerContract$InputData = itemizationMembersController.Q;
                        itemizationMembersControllerContract$InputData.getClass();
                        return new gp9.g(dVar, itemizationMembersControllerContract$InputData);
                    default:
                        int i5 = ItemizationMembersController.V;
                        return (f) ((gp9.g) itemizationMembersController.R.getValue()).f145377c.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: fq9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ItemizationMembersController f137212b;

            {
                this.f137212b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ItemizationMembersController itemizationMembersController = this.f137212b;
                switch (i22) {
                    case 0:
                        int i3 = ItemizationMembersController.V;
                        phm.a aVar = (phm.a) ue0.e.j(itemizationMembersController.m2()).a().get(gp9.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gp9.a.class, " is not found"));
                        }
                        gp9.d dVar = ((gp9.d) ((gp9.a) aVar2.b())).f145365r;
                        ItemizationMembersControllerContract$InputData itemizationMembersControllerContract$InputData = itemizationMembersController.Q;
                        itemizationMembersControllerContract$InputData.getClass();
                        return new gp9.g(dVar, itemizationMembersControllerContract$InputData);
                    default:
                        int i5 = ItemizationMembersController.V;
                        return (f) ((gp9.g) itemizationMembersController.R.getValue()).f145377c.get();
                }
            }
        });
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        SelectableDelegate selectableDelegate = new SelectableDelegate(rowDelegate);
        this.T = selectableDelegate;
        this.U = v.k(rowDelegate, selectableDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (g) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (f) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.T.r()), new fq9.b(this, null), 3);
        ViewController.P2(this, e3(), new c(this, null, 0), 3);
        ViewController.P2(this, f3(), new c(this, null, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (f) this.S.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getT() {
        return this.U;
    }
}
