package com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.dialog.confirm_different_address;

import android.view.View;
import com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.dialog.confirm_different_address.ConfirmDifferentAddressController;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import s23.d;
import s23.e;
import s23.f;
import te0.w;
import x13.q;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/card_order_new/impl/kompot/screen/address_verification/dialog/confirm_different_address/ConfirmDifferentAddressController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Ls23/f;", "Ls23/e;", "<init>", "()V", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ConfirmDifferentAddressController extends BaseBottomSheetRecyclerController<f, e> {
    public static final /* synthetic */ int T = 0;
    public final Object Q;
    public final Object R;
    public final f0 S = f0.f322471a;

    public ConfirmDifferentAddressController() {
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: s23.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmDifferentAddressController f259245b;

            {
                this.f259245b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ConfirmDifferentAddressController confirmDifferentAddressController = this.f259245b;
                switch (i2) {
                    case 0:
                        int i3 = ConfirmDifferentAddressController.T;
                        qji.b bVarU2 = confirmDifferentAddressController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.dialog.confirm_different_address.di.ConfirmDifferentAddressControllerInjector");
                        q qVar = (q) bVarU2;
                        return new x13.w(qVar.f302174c, qVar.d);
                    default:
                        int i5 = ConfirmDifferentAddressController.T;
                        return (d) ((x13.w) confirmDifferentAddressController.Q.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: s23.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmDifferentAddressController f259245b;

            {
                this.f259245b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ConfirmDifferentAddressController confirmDifferentAddressController = this.f259245b;
                switch (i22) {
                    case 0:
                        int i3 = ConfirmDifferentAddressController.T;
                        qji.b bVarU2 = confirmDifferentAddressController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.dialog.confirm_different_address.di.ConfirmDifferentAddressControllerInjector");
                        q qVar = (q) bVarU2;
                        return new x13.w(qVar.f302174c, qVar.d);
                    default:
                        int i5 = ConfirmDifferentAddressController.T;
                        return (d) ((x13.w) confirmDifferentAddressController.Q.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (x13.w) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (d) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        a.g2(this, e3(), null, new s23.b(this, null, 0), 3);
        a.g2(this, f3(), null, new s23.b(this, null, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (d) this.R.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3 */
    public final List getU() {
        return this.S;
    }
}
