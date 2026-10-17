package com.revolut.feature.card_order_new.impl.kompot.ordernewcard.dialogs;

import android.view.View;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m23.c;
import m23.d;
import m23.e;
import m23.f;
import pki.b;
import xki.a;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/card_order_new/impl/kompot/ordernewcard/dialogs/CardSubtypePickerBottomSheetController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lm23/e;", "Lm23/c;", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardSubtypePickerBottomSheetController extends BaseBottomSheetRecyclerController<e, c> {
    public final ProductSelectionDelegate Q;
    public final a R;
    public final ay4.a S;
    public final List T;

    public CardSubtypePickerBottomSheetController(d inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        ProductSelectionDelegate productSelectionDelegate = new ProductSelectionDelegate();
        this.Q = productSelectionDelegate;
        this.R = a.f306815a;
        this.S = new ay4.a(inputData);
        this.T = u.c(productSelectionDelegate);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return this.R;
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b e3() {
        return this.S;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.Q.p()), new f(this, null), 3);
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return this.S;
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getT() {
        return this.T;
    }
}
