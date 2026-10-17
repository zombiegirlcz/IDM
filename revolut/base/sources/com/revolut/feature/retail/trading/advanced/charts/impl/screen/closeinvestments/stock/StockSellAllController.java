package com.revolut.feature.retail.trading.advanced.charts.impl.screen.closeinvestments.stock;

import android.view.View;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.retail.trading.advanced.charts.impl.screen.closeinvestments.stock.StockSellAllController;
import com.revolut.feature.retail.trading.advanced.charts.impl.screen.closeinvestments.stock.StockSellAllControllerContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lrb.b;
import te0.w;
import urb.a;
import wrb.c;
import wrb.h;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/trading/advanced/charts/impl/screen/closeinvestments/stock/StockSellAllController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lurb/a;", "Lwrb/c;", "", "feature_retail_trading_advanced_charts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StockSellAllController extends BaseBottomSheetRecyclerController<a, c> {
    public static final /* synthetic */ int U = 0;
    public final StockSellAllControllerContract$InputData Q;
    public final Object R;
    public final List S;
    public final Object T;

    public StockSellAllController(StockSellAllControllerContract$InputData input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.Q = input;
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: wrb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockSellAllController f299534b;

            {
                this.f299534b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                StockSellAllController stockSellAllController = this.f299534b;
                switch (i2) {
                    case 0:
                        int i3 = StockSellAllController.U;
                        return (h) ((lrb.b) stockSellAllController.T.getValue()).f199483b.get();
                    default:
                        int i5 = StockSellAllController.U;
                        phm.a aVar = (phm.a) ue0.e.j(stockSellAllController.m2()).a().get(lrb.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", lrb.c.class, " is not found"));
                        }
                        lrb.c cVar = ((lrb.c) aVar2.b()).f199490l;
                        StockSellAllControllerContract$InputData stockSellAllControllerContract$InputData = stockSellAllController.Q;
                        stockSellAllControllerContract$InputData.getClass();
                        return new lrb.b(cVar, stockSellAllControllerContract$InputData);
                }
            }
        });
        final int i2 = 1;
        this.S = v.k(new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), new FullScreenStateDelegate());
        this.T = w.y0(new Function0(this) { // from class: wrb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockSellAllController f299534b;

            {
                this.f299534b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                StockSellAllController stockSellAllController = this.f299534b;
                switch (i22) {
                    case 0:
                        int i3 = StockSellAllController.U;
                        return (h) ((lrb.b) stockSellAllController.T.getValue()).f199483b.get();
                    default:
                        int i5 = StockSellAllController.U;
                        phm.a aVar = (phm.a) ue0.e.j(stockSellAllController.m2()).a().get(lrb.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", lrb.c.class, " is not found"));
                        }
                        lrb.c cVar = ((lrb.c) aVar2.b()).f199490l;
                        StockSellAllControllerContract$InputData stockSellAllControllerContract$InputData = stockSellAllController.Q;
                        stockSellAllControllerContract$InputData.getClass();
                        return new lrb.b(cVar, stockSellAllControllerContract$InputData);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (h) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, e3(), null, new wrb.b(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, f3(), null, new wrb.b(this, null, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (h) this.R.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getS() {
        return this.S;
    }
}
