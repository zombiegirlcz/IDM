package com.revolut.feature_market_data_impl.ui.breakdown.kompot.screens.transaction_price_description;

import a5i.h;
import a5i.k;
import a5i.o;
import android.view.View;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature_market_data_impl.ui.breakdown.kompot.screens.transaction_price_description.TransactionPriceDescriptionScreen;
import com.revolut.feature_market_data_impl.ui.breakdown.kompot.screens.transaction_price_description.TransactionPriceDescriptionScreenContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import k4i.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import pki.b;
import te0.w;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_market_data_impl/ui/breakdown/kompot/screens/transaction_price_description/TransactionPriceDescriptionScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "La5i/k;", "La5i/h;", "Lno/m;", "feature_market_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransactionPriceDescriptionScreen extends BaseBottomSheetRecyclerController<k, h> implements m {
    public static final /* synthetic */ int X = 0;
    public final TransactionPriceDescriptionScreenContract$InputData Q;
    public final CellDetailsDelegate R;
    public final FullScreenStateDelegate S;
    public final AnalyticsProduct T;
    public final Object U;
    public final Object V;
    public final List W;

    public TransactionPriceDescriptionScreen(TransactionPriceDescriptionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        CellDetailsDelegate cellDetailsDelegate = new CellDetailsDelegate();
        this.R = cellDetailsDelegate;
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.S = fullScreenStateDelegate;
        this.T = inputData.f97178b;
        final int i = 0;
        this.U = w.y0(new Function0(this) { // from class: a5i.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionPriceDescriptionScreen f1414b;

            {
                this.f1414b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TransactionPriceDescriptionScreen transactionPriceDescriptionScreen = this.f1414b;
                switch (i2) {
                    case 0:
                        int i3 = TransactionPriceDescriptionScreen.X;
                        qji.b bVarU2 = transactionPriceDescriptionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature_market_data_impl.ui.breakdown.kompot.screens.transaction_price_description.di.TransactionPriceDescriptionScreenInjector");
                        k4i.b bVar = (k4i.b) bVarU2;
                        k4i.c cVar = bVar.f180910c;
                        k4i.b bVar2 = bVar.d;
                        TransactionPriceDescriptionScreenContract$InputData transactionPriceDescriptionScreenContract$InputData = transactionPriceDescriptionScreen.Q;
                        transactionPriceDescriptionScreenContract$InputData.getClass();
                        return new k4i.f(cVar, bVar2, transactionPriceDescriptionScreenContract$InputData);
                    default:
                        int i5 = TransactionPriceDescriptionScreen.X;
                        return (o) ((k4i.f) transactionPriceDescriptionScreen.U.getValue()).f180925c.get();
                }
            }
        });
        final int i2 = 1;
        this.V = w.y0(new Function0(this) { // from class: a5i.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionPriceDescriptionScreen f1414b;

            {
                this.f1414b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TransactionPriceDescriptionScreen transactionPriceDescriptionScreen = this.f1414b;
                switch (i22) {
                    case 0:
                        int i3 = TransactionPriceDescriptionScreen.X;
                        qji.b bVarU2 = transactionPriceDescriptionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature_market_data_impl.ui.breakdown.kompot.screens.transaction_price_description.di.TransactionPriceDescriptionScreenInjector");
                        k4i.b bVar = (k4i.b) bVarU2;
                        k4i.c cVar = bVar.f180910c;
                        k4i.b bVar2 = bVar.d;
                        TransactionPriceDescriptionScreenContract$InputData transactionPriceDescriptionScreenContract$InputData = transactionPriceDescriptionScreen.Q;
                        transactionPriceDescriptionScreenContract$InputData.getClass();
                        return new k4i.f(cVar, bVar2, transactionPriceDescriptionScreenContract$InputData);
                    default:
                        int i5 = TransactionPriceDescriptionScreen.X;
                        return (o) ((k4i.f) transactionPriceDescriptionScreen.U.getValue()).f180925c.get();
                }
            }
        });
        this.W = v.k(cellDetailsDelegate, new CellDetailsLoadingDelegate(), fullScreenStateDelegate);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getT() {
        return this.T;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.U.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (o) this.V.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.R.d), new a5i.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.S.f52371h.f121375b), new a5i.f(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (o) this.V.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getW() {
        return this.W;
    }
}
