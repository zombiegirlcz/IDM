package com.revolut.feature.trading_asset_quotes.impl.ui.dialog.total_exchange_fees;

import a0l.k;
import adf.b;
import adf.f;
import aii.q;
import android.view.View;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.feature.trading_asset_quotes.impl.ui.dialog.total_exchange_fees.TotalExchangeFeesDialogContract$InputData;
import com.revolut.feature.trading_asset_quotes.impl.ui.dialog.total_exchange_fees.TotalExchangeFeesDialogController;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xcf.a;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/trading_asset_quotes/impl/ui/dialog/total_exchange_fees/TotalExchangeFeesDialogController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Ladf/b;", "feature_trading_asset_quotes_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TotalExchangeFeesDialogController extends BaseBottomSheetRecyclerController<q, b> {
    public static final /* synthetic */ int W = 0;
    public final TotalExchangeFeesDialogContract$InputData Q;
    public final CellDetailsActionDelegate R;
    public final FooterTextDelegate S;
    public final List T;
    public final Object U;
    public final Object V;

    public TotalExchangeFeesDialogController(TotalExchangeFeesDialogContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        CellDetailsActionDelegate cellDetailsActionDelegate = new CellDetailsActionDelegate();
        this.R = cellDetailsActionDelegate;
        FooterTextDelegate footerTextDelegate = new FooterTextDelegate();
        this.S = footerTextDelegate;
        final int i = 0;
        final int i2 = 1;
        this.T = v.k(cellDetailsActionDelegate, new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate(), footerTextDelegate);
        this.U = w.y0(new Function0(this) { // from class: adf.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TotalExchangeFeesDialogController f3335b;

            {
                this.f3335b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                TotalExchangeFeesDialogController totalExchangeFeesDialogController = this.f3335b;
                switch (i3) {
                    case 0:
                        int i5 = TotalExchangeFeesDialogController.W;
                        phm.a aVar = (phm.a) ue0.e.j(totalExchangeFeesDialogController.m2()).a().get(xcf.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", xcf.b.class, " is not found"));
                        }
                        xcf.b bVar = ((xcf.b) aVar2.b()).d;
                        TotalExchangeFeesDialogContract$InputData totalExchangeFeesDialogContract$InputData = totalExchangeFeesDialogController.Q;
                        totalExchangeFeesDialogContract$InputData.getClass();
                        return new xcf.a(bVar, totalExchangeFeesDialogContract$InputData);
                    default:
                        int i6 = TotalExchangeFeesDialogController.W;
                        return (a) ((xcf.a) totalExchangeFeesDialogController.U.getValue()).f304124b.get();
                }
            }
        });
        this.V = w.y0(new Function0(this) { // from class: adf.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TotalExchangeFeesDialogController f3335b;

            {
                this.f3335b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                TotalExchangeFeesDialogController totalExchangeFeesDialogController = this.f3335b;
                switch (i3) {
                    case 0:
                        int i5 = TotalExchangeFeesDialogController.W;
                        phm.a aVar = (phm.a) ue0.e.j(totalExchangeFeesDialogController.m2()).a().get(xcf.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", xcf.b.class, " is not found"));
                        }
                        xcf.b bVar = ((xcf.b) aVar2.b()).d;
                        TotalExchangeFeesDialogContract$InputData totalExchangeFeesDialogContract$InputData = totalExchangeFeesDialogController.Q;
                        totalExchangeFeesDialogContract$InputData.getClass();
                        return new xcf.a(bVar, totalExchangeFeesDialogContract$InputData);
                    default:
                        int i6 = TotalExchangeFeesDialogController.W;
                        return (a) ((xcf.a) totalExchangeFeesDialogController.U.getValue()).f304124b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (a) this.U.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (adf.a) this.V.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.R.d), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.S.e.f121375b), new k(this, null, 27), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (adf.a) this.V.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getT() {
        return this.T;
    }
}
