package com.revolut.feature_market_data_impl.ui.breakdown.kompot.screens.transaction;

import android.view.View;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature_market_data_impl.ui.breakdown.kompot.screens.transaction.TransactionBreakdownScreen;
import com.revolut.feature_market_data_impl.ui.breakdown.kompot.screens.transaction.TransactionBreakdownScreenContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import vrl.d;
import w4i.a0;
import w4i.b0;
import w4i.f;
import w4i.g;
import w4i.h;
import w4i.i;
import w4i.j;
import w4i.k;
import w4i.m;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_market_data_impl/ui/breakdown/kompot/screens/transaction/TransactionBreakdownScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lw4i/a0;", "Lw4i/m;", "Lno/m;", "feature_market_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransactionBreakdownScreen extends BaseBottomSheetRecyclerController<a0, m> implements no.m {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ int f97173b0 = 0;
    public final TransactionBreakdownScreenContract$InputData Q;
    public final CellDetailsDelegate R;
    public final CellDetailsActionDelegate S;
    public final RowDelegate T;
    public final HighlightTileDelegate U;
    public final FooterTextDelegate V;
    public final FullScreenStateDelegate W;
    public final AnalyticsProduct X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final List f97174a0;

    public TransactionBreakdownScreen(TransactionBreakdownScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        CellDetailsDelegate cellDetailsDelegate = new CellDetailsDelegate();
        this.R = cellDetailsDelegate;
        CellDetailsActionDelegate cellDetailsActionDelegate = new CellDetailsActionDelegate();
        this.S = cellDetailsActionDelegate;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.T = rowDelegate;
        HighlightTileDelegate highlightTileDelegate = new HighlightTileDelegate();
        this.U = highlightTileDelegate;
        FooterTextDelegate footerTextDelegate = new FooterTextDelegate();
        this.V = footerTextDelegate;
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.W = fullScreenStateDelegate;
        this.X = inputData.f97176b;
        final int i = 0;
        this.Y = w.y0(new Function0(this) { // from class: w4i.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionBreakdownScreen f294576b;

            {
                this.f294576b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TransactionBreakdownScreen transactionBreakdownScreen = this.f294576b;
                switch (i2) {
                    case 0:
                        int i3 = TransactionBreakdownScreen.f97173b0;
                        qji.b bVarU2 = transactionBreakdownScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature_market_data_impl.ui.breakdown.kompot.screens.transaction.di.TransactionBreakdownScreenInjector");
                        k4i.b bVar = (k4i.b) bVarU2;
                        k4i.c cVar = bVar.f180910c;
                        k4i.b bVar2 = bVar.d;
                        TransactionBreakdownScreenContract$InputData transactionBreakdownScreenContract$InputData = transactionBreakdownScreen.Q;
                        transactionBreakdownScreenContract$InputData.getClass();
                        return new k4i.e(cVar, bVar2, transactionBreakdownScreenContract$InputData);
                    default:
                        int i5 = TransactionBreakdownScreen.f97173b0;
                        return (b0) ((k4i.e) transactionBreakdownScreen.Y.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.Z = w.y0(new Function0(this) { // from class: w4i.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionBreakdownScreen f294576b;

            {
                this.f294576b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TransactionBreakdownScreen transactionBreakdownScreen = this.f294576b;
                switch (i22) {
                    case 0:
                        int i3 = TransactionBreakdownScreen.f97173b0;
                        qji.b bVarU2 = transactionBreakdownScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature_market_data_impl.ui.breakdown.kompot.screens.transaction.di.TransactionBreakdownScreenInjector");
                        k4i.b bVar = (k4i.b) bVarU2;
                        k4i.c cVar = bVar.f180910c;
                        k4i.b bVar2 = bVar.d;
                        TransactionBreakdownScreenContract$InputData transactionBreakdownScreenContract$InputData = transactionBreakdownScreen.Q;
                        transactionBreakdownScreenContract$InputData.getClass();
                        return new k4i.e(cVar, bVar2, transactionBreakdownScreenContract$InputData);
                    default:
                        int i5 = TransactionBreakdownScreen.f97173b0;
                        return (b0) ((k4i.e) transactionBreakdownScreen.Y.getValue()).d.get();
                }
            }
        });
        this.f97174a0 = v.k(cellDetailsDelegate, cellDetailsActionDelegate, new CellDetailsLoadingDelegate(), rowDelegate, highlightTileDelegate, new HighlightTileLoadingDelegate(), footerTextDelegate, fullScreenStateDelegate);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getX() {
        return this.X;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (k4i.e) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        CellDetailsActionDelegate cellDetailsActionDelegate = this.S;
        ViewController.P2(this, rd0.e.b(cellDetailsActionDelegate.d), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(cellDetailsActionDelegate.f51780c), new g(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.R.d), new h(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.V.e.f121375b), new d(this, null, 27), 3);
        ViewController.P2(this, rd0.e.b(this.T.f53218h), new i(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.U.f52437c), new j(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.W.f52371h.f121375b), new k(this, null), 3);
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getF97174a0() {
        return this.f97174a0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: m3, reason: merged with bridge method [inline-methods] */
    public final b0 R2() {
        return (b0) this.Z.getValue();
    }
}
