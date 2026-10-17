package com.revolut.feature.retail.trading.advanced.charts.impl.screen.closeinvestments.cfd;

import android.view.View;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.retail.trading.advanced.charts.impl.screen.closeinvestments.cfd.CfdClosePositionsSelectorContract$InputData;
import com.revolut.feature.retail.trading.advanced.charts.impl.screen.closeinvestments.cfd.CfdClosePositionsSelectorController;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import urb.a;
import vfg.m;
import vge.z1;
import vrb.c;
import vrb.h;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/trading/advanced/charts/impl/screen/closeinvestments/cfd/CfdClosePositionsSelectorController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lurb/a;", "Lvrb/c;", "", "feature_retail_trading_advanced_charts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CfdClosePositionsSelectorController extends BaseBottomSheetRecyclerController<a, c> {
    public static final /* synthetic */ int V = 0;
    public final CfdClosePositionsSelectorContract$InputData Q;
    public final SelectableDelegate R;
    public final List S;
    public final Object T;
    public final Object U;

    public CfdClosePositionsSelectorController(CfdClosePositionsSelectorContract$InputData input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.Q = input;
        SelectableDelegate selectableDelegate = new SelectableDelegate(new RowDelegate(null, null, 7));
        this.R = selectableDelegate;
        final int i = 0;
        final int i2 = 1;
        this.S = v.k(new RowLoadingDelegate(), selectableDelegate);
        this.T = w.y0(new Function0(this) { // from class: vrb.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CfdClosePositionsSelectorController f291552b;

            {
                this.f291552b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                CfdClosePositionsSelectorController cfdClosePositionsSelectorController = this.f291552b;
                switch (i3) {
                    case 0:
                        int i5 = CfdClosePositionsSelectorController.V;
                        return (b) ((lrb.a) cfdClosePositionsSelectorController.U.getValue()).f199481b.get();
                    default:
                        int i6 = CfdClosePositionsSelectorController.V;
                        phm.a aVar = (phm.a) ue0.e.j(cfdClosePositionsSelectorController.m2()).a().get(lrb.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", lrb.c.class, " is not found"));
                        }
                        lrb.c cVar = ((lrb.c) aVar2.b()).f199490l;
                        CfdClosePositionsSelectorContract$InputData cfdClosePositionsSelectorContract$InputData = cfdClosePositionsSelectorController.Q;
                        cfdClosePositionsSelectorContract$InputData.getClass();
                        return new lrb.a(cVar, cfdClosePositionsSelectorContract$InputData);
                }
            }
        });
        this.U = w.y0(new Function0(this) { // from class: vrb.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CfdClosePositionsSelectorController f291552b;

            {
                this.f291552b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                CfdClosePositionsSelectorController cfdClosePositionsSelectorController = this.f291552b;
                switch (i3) {
                    case 0:
                        int i5 = CfdClosePositionsSelectorController.V;
                        return (b) ((lrb.a) cfdClosePositionsSelectorController.U.getValue()).f199481b.get();
                    default:
                        int i6 = CfdClosePositionsSelectorController.V;
                        phm.a aVar = (phm.a) ue0.e.j(cfdClosePositionsSelectorController.m2()).a().get(lrb.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", lrb.c.class, " is not found"));
                        }
                        lrb.c cVar = ((lrb.c) aVar2.b()).f199490l;
                        CfdClosePositionsSelectorContract$InputData cfdClosePositionsSelectorContract$InputData = cfdClosePositionsSelectorController.Q;
                        cfdClosePositionsSelectorContract$InputData.getClass();
                        return new lrb.a(cVar, cfdClosePositionsSelectorContract$InputData);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (lrb.a) this.U.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (vrb.b) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.r()), null, new h(this, null), 3);
        ViewController.P2(this, e3(), new z1(this, continuation, 14), 3);
        com.revolut.kompot.navigable.a.g2(this, f3(), null, new m(this, continuation, 28), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (vrb.b) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getS() {
        return this.S;
    }
}
