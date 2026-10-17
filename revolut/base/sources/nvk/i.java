package nvk;

import androidx.viewpager2.widget.ViewPager2;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.financials_statements.StockFinancialsStatementsController;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes12.dex */
public final class i extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StockFinancialsStatementsController f219713a;

    public i(StockFinancialsStatementsController stockFinancialsStatementsController) {
        this.f219713a = stockFinancialsStatementsController;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i) {
        final esk.b bVar;
        final StockFinancialsStatementsController stockFinancialsStatementsController = this.f219713a;
        if (stockFinancialsStatementsController.S || (bVar = (esk.b) d0.e0(i, stockFinancialsStatementsController.T)) == null) {
            return;
        }
        final int i2 = stockFinancialsStatementsController.R + 1;
        stockFinancialsStatementsController.R = i2;
        final int i3 = stockFinancialsStatementsController.Q;
        stockFinancialsStatementsController.d3().d.post(new Runnable() { // from class: nvk.h
            @Override // java.lang.Runnable
            public final void run() {
                StockFinancialsStatementsController stockFinancialsStatementsController2 = stockFinancialsStatementsController;
                if (i2 != stockFinancialsStatementsController2.R) {
                    return;
                }
                if (i3 != stockFinancialsStatementsController2.Q || stockFinancialsStatementsController2.S) {
                    return;
                }
                com.revolut.retail.feature.stockdetails.impl.ui.screens.financials_statements.a aVar = (com.revolut.retail.feature.stockdetails.impl.ui.screens.financials_statements.a) stockFinancialsStatementsController2.R2();
                aVar.getClass();
                esk.b subPeriod = bVar;
                Intrinsics.checkNotNullParameter(subPeriod, "subPeriod");
                aVar.H2(aVar.u, new nrd.g(subPeriod, 15));
            }
        });
    }
}
