package com.revolut.feature_crypto_order_flow.impl.order_summary.extensions.price.screen;

import aii.q;
import android.view.View;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature_crypto_order_flow.impl.order_summary.extensions.price.screen.OrderPriceScreen;
import com.revolut.feature_crypto_order_flow.impl.order_summary.extensions.price.screen.OrderPriceScreenContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import tyh.f;
import wzh.c;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature_crypto_order_flow/impl/order_summary/extensions/price/screen/OrderPriceScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Lwzh/c;", "Ldli/a;", "Lcii/b;", "feature_crypto_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OrderPriceScreen extends BaseBottomSheetRecyclerController<q, c> {
    public static final /* synthetic */ int U = 0;
    public final OrderPriceScreenContract$InputData Q;
    public final Object R;
    public final Object S;
    public final List T;

    public OrderPriceScreen(OrderPriceScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: wzh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderPriceScreen f301420b;

            {
                this.f301420b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                OrderPriceScreen orderPriceScreen = this.f301420b;
                switch (i2) {
                    case 0:
                        int i3 = OrderPriceScreen.U;
                        qji.b bVarU2 = orderPriceScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature_crypto_order_flow.impl.order_summary.extensions.price.screen.di.OrderPriceScreenInjector");
                        tyh.c cVar = (tyh.c) bVarU2;
                        tyh.b bVar = cVar.f275604b;
                        tyh.c cVar2 = cVar.f275605c;
                        OrderPriceScreenContract$InputData orderPriceScreenContract$InputData = orderPriceScreen.Q;
                        orderPriceScreenContract$InputData.getClass();
                        return new tyh.f(bVar, cVar2, orderPriceScreenContract$InputData);
                    default:
                        int i5 = OrderPriceScreen.U;
                        return (e) ((tyh.f) orderPriceScreen.R.getValue()).f275623c.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: wzh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderPriceScreen f301420b;

            {
                this.f301420b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                OrderPriceScreen orderPriceScreen = this.f301420b;
                switch (i22) {
                    case 0:
                        int i3 = OrderPriceScreen.U;
                        qji.b bVarU2 = orderPriceScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature_crypto_order_flow.impl.order_summary.extensions.price.screen.di.OrderPriceScreenInjector");
                        tyh.c cVar = (tyh.c) bVarU2;
                        tyh.b bVar = cVar.f275604b;
                        tyh.c cVar2 = cVar.f275605c;
                        OrderPriceScreenContract$InputData orderPriceScreenContract$InputData = orderPriceScreen.Q;
                        orderPriceScreenContract$InputData.getClass();
                        return new tyh.f(bVar, cVar2, orderPriceScreenContract$InputData);
                    default:
                        int i5 = OrderPriceScreen.U;
                        return (e) ((tyh.f) orderPriceScreen.R.getValue()).f275623c.get();
                }
            }
        });
        this.T = u.c(new TextDelegate());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (wzh.e) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, e3(), new wzh.b(this, continuation, 0), 3);
        ViewController.P2(this, h3(), new wzh.b(this, continuation, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (wzh.e) this.S.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getT() {
        return this.T;
    }
}
