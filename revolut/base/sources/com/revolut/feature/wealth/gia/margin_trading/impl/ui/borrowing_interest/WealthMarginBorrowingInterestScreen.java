package com.revolut.feature.wealth.gia.margin_trading.impl.ui.borrowing_interest;

import aii.q;
import android.view.View;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.wealth.gia.margin_trading.impl.ui.borrowing_interest.WealthMarginBorrowingInterestScreen;
import com.revolut.feature.wealth.gia.margin_trading.impl.ui.borrowing_interest.WealthMarginBorrowingInterestScreenContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mta.c;
import n6h.d;
import pki.b;
import te0.w;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/gia/margin_trading/impl/ui/borrowing_interest/WealthMarginBorrowingInterestScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Ln6h/d;", "feature_wealth_gia_margin_trading_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WealthMarginBorrowingInterestScreen extends BaseBottomSheetRecyclerController<q, d> {
    public static final /* synthetic */ int V = 0;
    public final WealthMarginBorrowingInterestScreenContract$InputData Q;
    public final CellDetailsDelegate R;
    public final List S;
    public final Object T;
    public final Object U;

    public WealthMarginBorrowingInterestScreen(WealthMarginBorrowingInterestScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        CellDetailsDelegate cellDetailsDelegate = new CellDetailsDelegate();
        this.R = cellDetailsDelegate;
        this.S = u.c(cellDetailsDelegate);
        final int i = 0;
        this.T = w.y0(new Function0(this) { // from class: n6h.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WealthMarginBorrowingInterestScreen f212785b;

            {
                this.f212785b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                WealthMarginBorrowingInterestScreen wealthMarginBorrowingInterestScreen = this.f212785b;
                switch (i2) {
                    case 0:
                        int i3 = WealthMarginBorrowingInterestScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(wealthMarginBorrowingInterestScreen.m2()).a().get(f6h.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", f6h.c.class, " is not found"));
                        }
                        f6h.c cVar = ((f6h.c) aVar2.b()).f132434j;
                        WealthMarginBorrowingInterestScreenContract$InputData wealthMarginBorrowingInterestScreenContract$InputData = wealthMarginBorrowingInterestScreen.Q;
                        wealthMarginBorrowingInterestScreenContract$InputData.getClass();
                        return new f6h.d(cVar, wealthMarginBorrowingInterestScreenContract$InputData);
                    default:
                        int i5 = WealthMarginBorrowingInterestScreen.V;
                        return (e) ((f6h.d) wealthMarginBorrowingInterestScreen.T.getValue()).f132439b.get();
                }
            }
        });
        final int i2 = 1;
        this.U = w.y0(new Function0(this) { // from class: n6h.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WealthMarginBorrowingInterestScreen f212785b;

            {
                this.f212785b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                WealthMarginBorrowingInterestScreen wealthMarginBorrowingInterestScreen = this.f212785b;
                switch (i22) {
                    case 0:
                        int i3 = WealthMarginBorrowingInterestScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(wealthMarginBorrowingInterestScreen.m2()).a().get(f6h.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", f6h.c.class, " is not found"));
                        }
                        f6h.c cVar = ((f6h.c) aVar2.b()).f132434j;
                        WealthMarginBorrowingInterestScreenContract$InputData wealthMarginBorrowingInterestScreenContract$InputData = wealthMarginBorrowingInterestScreen.Q;
                        wealthMarginBorrowingInterestScreenContract$InputData.getClass();
                        return new f6h.d(cVar, wealthMarginBorrowingInterestScreenContract$InputData);
                    default:
                        int i5 = WealthMarginBorrowingInterestScreen.V;
                        return (e) ((f6h.d) wealthMarginBorrowingInterestScreen.T.getValue()).f132439b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f6h.d) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (n6h.e) this.U.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new c(this, null, 18), 3);
        ViewController.P2(this, rd0.e.b(this.R.e), new n6h.c(2, 4, n6h.e.class, (n6h.e) this.U.getValue(), "onCellDetailEndTextClicked", "onCellDetailEndTextClicked(Lcom/revolut/core/ui_kit/delegates/CellDetailsDelegate$Model;)V"), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (n6h.e) this.U.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getS() {
        return this.S;
    }
}
