package com.revolut.feature_market_data_impl.ui.breakdown.kompot.screens.fee;

import android.view.View;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature_market_data_impl.ui.breakdown.kompot.screens.fee.FeeBreakdownScreen;
import com.revolut.feature_market_data_impl.ui.breakdown.kompot.screens.fee.FeeBreakdownScreenContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import k4i.d;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import te0.w;
import u4i.g;
import u4i.h;
import u4i.i;
import u4i.j;
import u4i.o;
import u4i.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_market_data_impl/ui/breakdown/kompot/screens/fee/FeeBreakdownScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lu4i/o;", "Lu4i/j;", "Lno/m;", "feature_market_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FeeBreakdownScreen extends BaseBottomSheetRecyclerController<o, j> implements m {
    public static final /* synthetic */ int Z = 0;
    public final FeeBreakdownScreenContract$InputData Q;
    public final CellDetailsDelegate R;
    public final CellDetailsActionDelegate S;
    public final FooterTextDelegate T;
    public final FullScreenStateDelegate U;
    public final AnalyticsProduct V;
    public final Object W;
    public final Object X;
    public final List Y;

    public FeeBreakdownScreen(FeeBreakdownScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        CellDetailsDelegate cellDetailsDelegate = new CellDetailsDelegate();
        this.R = cellDetailsDelegate;
        CellDetailsActionDelegate cellDetailsActionDelegate = new CellDetailsActionDelegate();
        this.S = cellDetailsActionDelegate;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        FooterTextDelegate footerTextDelegate = new FooterTextDelegate();
        this.T = footerTextDelegate;
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.U = fullScreenStateDelegate;
        this.V = inputData.f97172b;
        final int i = 0;
        this.W = w.y0(new Function0(this) { // from class: u4i.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FeeBreakdownScreen f277352b;

            {
                this.f277352b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FeeBreakdownScreen feeBreakdownScreen = this.f277352b;
                switch (i2) {
                    case 0:
                        int i3 = FeeBreakdownScreen.Z;
                        qji.b bVarU2 = feeBreakdownScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature_market_data_impl.ui.breakdown.kompot.screens.fee.di.FeeBreakdownScreenInjector");
                        k4i.b bVar = (k4i.b) bVarU2;
                        k4i.c cVar = bVar.f180910c;
                        k4i.b bVar2 = bVar.d;
                        FeeBreakdownScreenContract$InputData feeBreakdownScreenContract$InputData = feeBreakdownScreen.Q;
                        feeBreakdownScreenContract$InputData.getClass();
                        return new k4i.d(cVar, bVar2, feeBreakdownScreenContract$InputData);
                    default:
                        int i5 = FeeBreakdownScreen.Z;
                        return (s) ((k4i.d) feeBreakdownScreen.W.getValue()).f180919c.get();
                }
            }
        });
        final int i2 = 1;
        this.X = w.y0(new Function0(this) { // from class: u4i.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FeeBreakdownScreen f277352b;

            {
                this.f277352b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FeeBreakdownScreen feeBreakdownScreen = this.f277352b;
                switch (i22) {
                    case 0:
                        int i3 = FeeBreakdownScreen.Z;
                        qji.b bVarU2 = feeBreakdownScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature_market_data_impl.ui.breakdown.kompot.screens.fee.di.FeeBreakdownScreenInjector");
                        k4i.b bVar = (k4i.b) bVarU2;
                        k4i.c cVar = bVar.f180910c;
                        k4i.b bVar2 = bVar.d;
                        FeeBreakdownScreenContract$InputData feeBreakdownScreenContract$InputData = feeBreakdownScreen.Q;
                        feeBreakdownScreenContract$InputData.getClass();
                        return new k4i.d(cVar, bVar2, feeBreakdownScreenContract$InputData);
                    default:
                        int i5 = FeeBreakdownScreen.Z;
                        return (s) ((k4i.d) feeBreakdownScreen.W.getValue()).f180919c.get();
                }
            }
        });
        this.Y = v.k(cellDetailsDelegate, cellDetailsActionDelegate, new CellDetailsLoadingDelegate(), rowDelegate, footerTextDelegate, fullScreenStateDelegate);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getV() {
        return this.V;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.W.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.S.d), new g(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.R.d), new h(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.T.e.f121375b), new tz6.e(this, (Continuation) null, 21), 3);
        ViewController.P2(this, rd0.e.b(this.U.f52371h.f121375b), new i(this, null), 3);
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getY() {
        return this.Y;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: m3, reason: merged with bridge method [inline-methods] */
    public final s R2() {
        return (s) this.X.getValue();
    }
}
