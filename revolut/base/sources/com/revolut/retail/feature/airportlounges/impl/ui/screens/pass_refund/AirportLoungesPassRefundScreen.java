package com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_refund;

import android.view.View;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_refund.AirportLoungesPassRefundScreen;
import cwi.b0;
import cwi.h0;
import cwi.l0;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ox5.p;
import oyi.g;
import oyi.h;
import te0.w;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/pass_refund/AirportLoungesPassRefundScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/pass_refund/a;", "Loyi/b;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AirportLoungesPassRefundScreen extends BaseBottomSheetRecyclerController<a, oyi.b> {
    public static final /* synthetic */ int W = 0;
    public final oyi.c Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final List V;

    public AirportLoungesPassRefundScreen(oyi.c inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: oyi.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirportLoungesPassRefundScreen f231047b;

            {
                this.f231047b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AirportLoungesPassRefundScreen airportLoungesPassRefundScreen = this.f231047b;
                switch (i2) {
                    case 0:
                        int i3 = AirportLoungesPassRefundScreen.W;
                        qji.b bVarU2 = airportLoungesPassRefundScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_refund.di.AirportLoungesPassRefundScreenInjector");
                        }
                        b0 b0Var = (b0) bVarU2;
                        h0 h0Var = b0Var.f109638b;
                        b0 b0Var2 = b0Var.f109639c;
                        c cVar = airportLoungesPassRefundScreen.Q;
                        cVar.getClass();
                        return new l0(h0Var, b0Var2, airportLoungesPassRefundScreen, cVar);
                    default:
                        int i5 = AirportLoungesPassRefundScreen.W;
                        return (e) ((l0) airportLoungesPassRefundScreen.R.getValue()).e.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: oyi.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirportLoungesPassRefundScreen f231047b;

            {
                this.f231047b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AirportLoungesPassRefundScreen airportLoungesPassRefundScreen = this.f231047b;
                switch (i22) {
                    case 0:
                        int i3 = AirportLoungesPassRefundScreen.W;
                        qji.b bVarU2 = airportLoungesPassRefundScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_refund.di.AirportLoungesPassRefundScreenInjector");
                        }
                        b0 b0Var = (b0) bVarU2;
                        h0 h0Var = b0Var.f109638b;
                        b0 b0Var2 = b0Var.f109639c;
                        c cVar = airportLoungesPassRefundScreen.Q;
                        cVar.getClass();
                        return new l0(h0Var, b0Var2, airportLoungesPassRefundScreen, cVar);
                    default:
                        int i5 = AirportLoungesPassRefundScreen.W;
                        return (e) ((l0) airportLoungesPassRefundScreen.R.getValue()).e.get();
                }
            }
        });
        Lazy lazyY0 = w.y0(new p(22));
        this.T = lazyY0;
        Lazy lazyY02 = w.y0(new p(23));
        this.U = lazyY02;
        this.V = v.k((CellDetailsActionDelegate) lazyY0.getValue(), new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), (RowDelegate) lazyY02.getValue(), new RowLoadingDelegate());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l0) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(((RowDelegate) this.U.getValue()).f53226s), new g(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(((CellDetailsActionDelegate) this.T.getValue()).d), new h(this, null), 3);
        ViewController.P2(this, e3(), new g(this, continuation, 1), 3);
        ViewController.P2(this, f3(), new g(this, continuation, 2), 3);
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getV() {
        return this.V;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: m3, reason: merged with bridge method [inline-methods] */
    public final oyi.e R2() {
        return (oyi.e) this.S.getValue();
    }
}
