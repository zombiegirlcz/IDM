package com.revolut.feature.payments.who_to_transfer.impl.transfer.add_recipient;

import android.view.View;
import cli.k;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.add_recipient.AddRecipientContract$InputData;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.add_recipient.AddRecipientController;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import j4a.a;
import j4a.c;
import j4a.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import s3a.r;
import te0.w;
import ue0.e;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/transfer/add_recipient/AddRecipientController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lj4a/a;", "Lcli/k;", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AddRecipientController extends BaseBottomSheetRecyclerController<a, k> {
    public static final /* synthetic */ int V = 0;
    public final AddRecipientContract$InputData Q;
    public final Object R;
    public final Object S;
    public final RowDelegate T;
    public final List U;

    public AddRecipientController(AddRecipientContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: j4a.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddRecipientController f171332b;

            {
                this.f171332b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AddRecipientController addRecipientController = this.f171332b;
                switch (i2) {
                    case 0:
                        int i3 = AddRecipientController.V;
                        phm.a aVar = (phm.a) e.j(addRecipientController.m2()).a().get(r.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", r.class, " is not found"));
                        }
                        s3a.k kVar = ((s3a.k) ((r) aVar2.b())).g0;
                        AddRecipientContract$InputData addRecipientContract$InputData = addRecipientController.Q;
                        addRecipientContract$InputData.getClass();
                        return new s3a.a(kVar, addRecipientContract$InputData);
                    default:
                        int i5 = AddRecipientController.V;
                        return (d) ((s3a.a) addRecipientController.R.getValue()).f259483b.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: j4a.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddRecipientController f171332b;

            {
                this.f171332b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AddRecipientController addRecipientController = this.f171332b;
                switch (i22) {
                    case 0:
                        int i3 = AddRecipientController.V;
                        phm.a aVar = (phm.a) e.j(addRecipientController.m2()).a().get(r.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", r.class, " is not found"));
                        }
                        s3a.k kVar = ((s3a.k) ((r) aVar2.b())).g0;
                        AddRecipientContract$InputData addRecipientContract$InputData = addRecipientController.Q;
                        addRecipientContract$InputData.getClass();
                        return new s3a.a(kVar, addRecipientContract$InputData);
                    default:
                        int i5 = AddRecipientController.V;
                        return (d) ((s3a.a) addRecipientController.R.getValue()).f259483b.get();
                }
            }
        });
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.T = rowDelegate;
        this.U = u.c(rowDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (s3a.a) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (d) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.T.f53218h), new c(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (d) this.S.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getU() {
        return this.U;
    }
}
