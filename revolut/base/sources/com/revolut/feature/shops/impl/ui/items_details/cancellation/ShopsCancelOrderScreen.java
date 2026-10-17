package com.revolut.feature.shops.impl.ui.items_details.cancellation;

import aii.q;
import android.view.View;
import com.revolut.feature.shops.impl.ui.items_details.cancellation.ShopsCancelOrderContract$InputData;
import com.revolut.feature.shops.impl.ui.items_details.cancellation.ShopsCancelOrderScreen;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import did.g;
import java.util.List;
import jjd.a;
import jjd.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import wp5.y;
import xki.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/shops/impl/ui/items_details/cancellation/ShopsCancelOrderScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Ljjd/a;", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ShopsCancelOrderScreen extends BaseBottomSheetRecyclerController<q, a> {
    public static final /* synthetic */ int U = 0;
    public final ShopsCancelOrderContract$InputData Q;
    public final Object R;
    public final Object S;
    public final List T;

    public ShopsCancelOrderScreen(ShopsCancelOrderContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: jjd.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShopsCancelOrderScreen f174818b;

            {
                this.f174818b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ShopsCancelOrderScreen shopsCancelOrderScreen = this.f174818b;
                switch (i2) {
                    case 0:
                        int i3 = ShopsCancelOrderScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(shopsCancelOrderScreen.m2()).a().get(did.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", did.d.class, " is not found"));
                        }
                        did.d dVar = ((did.d) aVar2.b()).f115008y;
                        ShopsCancelOrderContract$InputData shopsCancelOrderContract$InputData = shopsCancelOrderScreen.Q;
                        shopsCancelOrderContract$InputData.getClass();
                        return new g(dVar, shopsCancelOrderContract$InputData);
                    default:
                        int i5 = ShopsCancelOrderScreen.U;
                        return (b) ((g) shopsCancelOrderScreen.R.getValue()).f115015b.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: jjd.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShopsCancelOrderScreen f174818b;

            {
                this.f174818b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ShopsCancelOrderScreen shopsCancelOrderScreen = this.f174818b;
                switch (i22) {
                    case 0:
                        int i3 = ShopsCancelOrderScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(shopsCancelOrderScreen.m2()).a().get(did.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", did.d.class, " is not found"));
                        }
                        did.d dVar = ((did.d) aVar2.b()).f115008y;
                        ShopsCancelOrderContract$InputData shopsCancelOrderContract$InputData = shopsCancelOrderScreen.Q;
                        shopsCancelOrderContract$InputData.getClass();
                        return new g(dVar, shopsCancelOrderContract$InputData);
                    default:
                        int i5 = ShopsCancelOrderScreen.U;
                        return (b) ((g) shopsCancelOrderScreen.R.getValue()).f115015b.get();
                }
            }
        });
        this.T = y.w();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (jjd.b) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, e3(), null, new d(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, f3(), null, new d(this, null, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (jjd.b) this.S.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getT() {
        return this.T;
    }
}
