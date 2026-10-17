package com.revolut.feature.add_card_to_google_pay_shared.impl.add_to_google;

import android.view.View;
import com.revolut.feature.add_card_to_google_pay_shared.impl.add_to_google.AddToGooglePayBottomSheetController;
import com.revolut.feature.add_card_to_google_pay_shared.impl.add_to_google.AddToGooglePayBottomSheetControllerContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kg1.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import m9d.y0;
import mg1.c;
import og1.i;
import te0.w;
import xki.e;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/add_card_to_google_pay_shared/impl/add_to_google/AddToGooglePayBottomSheetController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lkg1/a;", "Lmg1/c;", "feature_add_card_to_google_pay_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AddToGooglePayBottomSheetController extends BaseBottomSheetRecyclerController<a, c> {
    public static final /* synthetic */ int U = 0;
    public final AddToGooglePayBottomSheetControllerContract$InputData Q;
    public final Object R;
    public final Object S;
    public final List T;

    public AddToGooglePayBottomSheetController(AddToGooglePayBottomSheetControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: mg1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddToGooglePayBottomSheetController f205137b;

            {
                this.f205137b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AddToGooglePayBottomSheetController addToGooglePayBottomSheetController = this.f205137b;
                switch (i2) {
                    case 0:
                        int i3 = AddToGooglePayBottomSheetController.U;
                        phm.a aVar = (phm.a) ue0.e.j(addToGooglePayBottomSheetController.m2()).a().get(i.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i.class, " is not found"));
                        }
                        i iVar = ((i) aVar2.b()).f;
                        AddToGooglePayBottomSheetControllerContract$InputData addToGooglePayBottomSheetControllerContract$InputData = addToGooglePayBottomSheetController.Q;
                        addToGooglePayBottomSheetControllerContract$InputData.getClass();
                        return new og1.a(iVar, addToGooglePayBottomSheetControllerContract$InputData);
                    default:
                        int i5 = AddToGooglePayBottomSheetController.U;
                        return (b) ((og1.a) addToGooglePayBottomSheetController.R.getValue()).f224957c.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: mg1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddToGooglePayBottomSheetController f205137b;

            {
                this.f205137b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AddToGooglePayBottomSheetController addToGooglePayBottomSheetController = this.f205137b;
                switch (i22) {
                    case 0:
                        int i3 = AddToGooglePayBottomSheetController.U;
                        phm.a aVar = (phm.a) ue0.e.j(addToGooglePayBottomSheetController.m2()).a().get(i.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i.class, " is not found"));
                        }
                        i iVar = ((i) aVar2.b()).f;
                        AddToGooglePayBottomSheetControllerContract$InputData addToGooglePayBottomSheetControllerContract$InputData = addToGooglePayBottomSheetController.Q;
                        addToGooglePayBottomSheetControllerContract$InputData.getClass();
                        return new og1.a(iVar, addToGooglePayBottomSheetControllerContract$InputData);
                    default:
                        int i5 = AddToGooglePayBottomSheetController.U;
                        return (b) ((og1.a) addToGooglePayBottomSheetController.R.getValue()).f224957c.get();
                }
            }
        });
        this.T = b.v(null, null, 7);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (og1.a) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (mg1.b) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new y0(this, null, 11), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (mg1.b) this.S.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getQ() {
        return this.T;
    }
}
