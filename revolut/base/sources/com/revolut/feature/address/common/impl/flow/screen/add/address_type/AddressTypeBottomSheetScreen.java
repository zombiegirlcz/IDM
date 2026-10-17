package com.revolut.feature.address.common.impl.flow.screen.add.address_type;

import android.view.View;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import hi1.b;
import hi1.c;
import hi1.e;
import hi1.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xki.a;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/address/common/impl/flow/screen/add/address_type/AddressTypeBottomSheetScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lhi1/e;", "Lhi1/b;", "feature_address_common_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AddressTypeBottomSheetScreen extends BaseBottomSheetRecyclerController<e, b> {
    public final c Q;
    public final yi1.e R;
    public final SingleChoiceDelegate S;
    public final Object T;
    public final a U;
    public final List V;

    public AddressTypeBottomSheetScreen(c inputData, yi1.e addressTypeMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(addressTypeMapper, "addressTypeMapper");
        this.Q = inputData;
        this.R = addressTypeMapper;
        SingleChoiceDelegate singleChoiceDelegate = new SingleChoiceDelegate();
        this.S = singleChoiceDelegate;
        this.T = w.y0(new h1g.a(this, 18));
        this.U = a.f306815a;
        this.V = u.c(singleChoiceDelegate);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (h) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.S.p()), new hi1.a(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (h) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getV() {
        return this.V;
    }
}
