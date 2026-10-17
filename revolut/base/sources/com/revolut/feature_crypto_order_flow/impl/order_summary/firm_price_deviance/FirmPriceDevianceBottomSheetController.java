package com.revolut.feature_crypto_order_flow.impl.order_summary.firm_price_deviance;

import android.view.View;
import az.i;
import b0i.a;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.feature_crypto_order_flow.api.navigation.FirmPriceDevianceBottomSheetControllerProvider$InputData;
import com.revolut.feature_crypto_order_flow.impl.order_summary.firm_price_deviance.FirmPriceDevianceBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nyh.b;
import te0.w;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_crypto_order_flow/impl/order_summary/firm_price_deviance/FirmPriceDevianceBottomSheetController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lnyh/b;", "Lb0i/a;", "feature_crypto_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FirmPriceDevianceBottomSheetController extends BaseBottomSheetRecyclerController<b, a> {
    public static final /* synthetic */ int U = 0;
    public final FirmPriceDevianceBottomSheetControllerProvider$InputData Q;
    public final Object R;
    public final Object S;
    public final List T;

    public FirmPriceDevianceBottomSheetController(FirmPriceDevianceBottomSheetControllerProvider$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: b0i.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FirmPriceDevianceBottomSheetController f11675b;

            {
                this.f11675b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FirmPriceDevianceBottomSheetController firmPriceDevianceBottomSheetController = this.f11675b;
                switch (i2) {
                    case 0:
                        int i3 = FirmPriceDevianceBottomSheetController.U;
                        phm.a aVar = (phm.a) ue0.e.j(firmPriceDevianceBottomSheetController.m2()).a().get(tyh.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", tyh.b.class, " is not found"));
                        }
                        tyh.b bVar = ((tyh.b) aVar2.b()).N;
                        FirmPriceDevianceBottomSheetControllerProvider$InputData firmPriceDevianceBottomSheetControllerProvider$InputData = firmPriceDevianceBottomSheetController.Q;
                        firmPriceDevianceBottomSheetControllerProvider$InputData.getClass();
                        return new tyh.e(bVar, firmPriceDevianceBottomSheetControllerProvider$InputData);
                    default:
                        int i5 = FirmPriceDevianceBottomSheetController.U;
                        return (e) ((tyh.e) firmPriceDevianceBottomSheetController.R.getValue()).f275620b.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: b0i.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FirmPriceDevianceBottomSheetController f11675b;

            {
                this.f11675b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FirmPriceDevianceBottomSheetController firmPriceDevianceBottomSheetController = this.f11675b;
                switch (i22) {
                    case 0:
                        int i3 = FirmPriceDevianceBottomSheetController.U;
                        phm.a aVar = (phm.a) ue0.e.j(firmPriceDevianceBottomSheetController.m2()).a().get(tyh.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", tyh.b.class, " is not found"));
                        }
                        tyh.b bVar = ((tyh.b) aVar2.b()).N;
                        FirmPriceDevianceBottomSheetControllerProvider$InputData firmPriceDevianceBottomSheetControllerProvider$InputData = firmPriceDevianceBottomSheetController.Q;
                        firmPriceDevianceBottomSheetControllerProvider$InputData.getClass();
                        return new tyh.e(bVar, firmPriceDevianceBottomSheetControllerProvider$InputData);
                    default:
                        int i5 = FirmPriceDevianceBottomSheetController.U;
                        return (e) ((tyh.e) firmPriceDevianceBottomSheetController.R.getValue()).f275620b.get();
                }
            }
        });
        this.T = v.k(new CellDetailsDelegate(), new CellDetailsLoadingDelegate());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (tyh.e) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (b0i.e) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new i(this, null, 2), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (b0i.e) this.S.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getT() {
        return this.T;
    }
}
