package com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.unlink_payment;

import android.view.View;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.unlink_payment.RentAndBillsUnlinkPaymentsBottomSheetScreen;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.unlink_payment.RentAndBillsUnlinkPaymentsBottomSheetScreenContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pjc.c;
import pjc.d;
import pjc.g;
import pjc.h;
import pki.b;
import te0.w;
import whc.y;
import whc.z;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rewards/impl/ui/rent_and_bills/screen/unlink_payment/RentAndBillsUnlinkPaymentsBottomSheetScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lpjc/g;", "Lpjc/d;", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RentAndBillsUnlinkPaymentsBottomSheetScreen extends BaseBottomSheetRecyclerController<g, d> {
    public static final /* synthetic */ int V = 0;
    public final RentAndBillsUnlinkPaymentsBottomSheetScreenContract$InputData Q;
    public final SelectableDelegate R;
    public final List S;
    public final Object T;
    public final Object U;

    public RentAndBillsUnlinkPaymentsBottomSheetScreen(RentAndBillsUnlinkPaymentsBottomSheetScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        SelectableDelegate selectableDelegate = new SelectableDelegate(new RowDelegate(null, null, 7));
        this.R = selectableDelegate;
        final int i = 0;
        final int i2 = 1;
        this.S = v.k(rowDelegate, selectableDelegate);
        this.T = w.y0(new Function0(this) { // from class: pjc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RentAndBillsUnlinkPaymentsBottomSheetScreen f236724b;

            {
                this.f236724b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                RentAndBillsUnlinkPaymentsBottomSheetScreen rentAndBillsUnlinkPaymentsBottomSheetScreen = this.f236724b;
                switch (i3) {
                    case 0:
                        int i5 = RentAndBillsUnlinkPaymentsBottomSheetScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(rentAndBillsUnlinkPaymentsBottomSheetScreen.m2()).a().get(z.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", z.class, " is not found"));
                        }
                        z zVar = ((z) aVar2.b()).f297622n;
                        RentAndBillsUnlinkPaymentsBottomSheetScreenContract$InputData rentAndBillsUnlinkPaymentsBottomSheetScreenContract$InputData = rentAndBillsUnlinkPaymentsBottomSheetScreen.Q;
                        rentAndBillsUnlinkPaymentsBottomSheetScreenContract$InputData.getClass();
                        return new y(zVar, rentAndBillsUnlinkPaymentsBottomSheetScreenContract$InputData);
                    default:
                        int i6 = RentAndBillsUnlinkPaymentsBottomSheetScreen.V;
                        return (h) ((y) rentAndBillsUnlinkPaymentsBottomSheetScreen.T.getValue()).f297613c.get();
                }
            }
        });
        this.U = w.y0(new Function0(this) { // from class: pjc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RentAndBillsUnlinkPaymentsBottomSheetScreen f236724b;

            {
                this.f236724b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                RentAndBillsUnlinkPaymentsBottomSheetScreen rentAndBillsUnlinkPaymentsBottomSheetScreen = this.f236724b;
                switch (i3) {
                    case 0:
                        int i5 = RentAndBillsUnlinkPaymentsBottomSheetScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(rentAndBillsUnlinkPaymentsBottomSheetScreen.m2()).a().get(z.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", z.class, " is not found"));
                        }
                        z zVar = ((z) aVar2.b()).f297622n;
                        RentAndBillsUnlinkPaymentsBottomSheetScreenContract$InputData rentAndBillsUnlinkPaymentsBottomSheetScreenContract$InputData = rentAndBillsUnlinkPaymentsBottomSheetScreen.Q;
                        rentAndBillsUnlinkPaymentsBottomSheetScreenContract$InputData.getClass();
                        return new y(zVar, rentAndBillsUnlinkPaymentsBottomSheetScreenContract$InputData);
                    default:
                        int i6 = RentAndBillsUnlinkPaymentsBottomSheetScreen.V;
                        return (h) ((y) rentAndBillsUnlinkPaymentsBottomSheetScreen.T.getValue()).f297613c.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (y) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (h) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        a.g2(this, rd0.e.b(this.R.r()), null, new pjc.b(this, null), 3);
        a.g2(this, e3(), null, new c(this, continuation, 0), 3);
        a.g2(this, f3(), null, new c(this, continuation, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (h) this.U.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getS() {
        return this.S;
    }
}
