package avk;

import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.delegates.airtip.AirTipDelegate;
import com.revolut.feature.wealth.ui.impl.trade_redesign.screen.TradeScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.bond_details.BondDetailsController;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.cfd_details.CfdDetailsController;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.etf_details_overview.EtfDetailsOverviewController;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.stock_details_overview.StockDetailsOverviewController;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements e5d.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewController f10070b;

    public /* synthetic */ b(ViewController viewController, int i) {
        this.f10069a = i;
        this.f10070b = viewController;
    }

    @Override // e5d.d
    /* JADX INFO: renamed from: I0 */
    public final AirTipDelegate getF87535n0() {
        switch (this.f10069a) {
            case 0:
                return ((CfdDetailsController) this.f10070b).M;
            case 1:
                return ((EtfDetailsOverviewController) this.f10070b).P;
            case 2:
                return ((TradeScreen) this.f10070b).P;
            case 3:
                return ((StockDetailsOverviewController) this.f10070b).Q;
            default:
                return ((BondDetailsController) this.f10070b).Q;
        }
    }

    @Override // e5d.d
    public final ScreenContentRecyclerView O() {
        int i = this.f10069a;
        ViewController viewController = this.f10070b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = CfdDetailsController.f103904s0;
                ScreenContentRecyclerView recyclerView = ((CfdDetailsController) viewController).d3().f174568c;
                Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
                return recyclerView;
            case 1:
                EtfDetailsOverviewController etfDetailsOverviewController = (EtfDetailsOverviewController) viewController;
                KProperty[] kPropertyArr2 = EtfDetailsOverviewController.B0;
                ViewBinding value = etfDetailsOverviewController.L.getValue(etfDetailsOverviewController, EtfDetailsOverviewController.B0[0]);
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                ScreenContentRecyclerView recyclerView2 = ((nrk.b) value).f218664b;
                Intrinsics.checkNotNullExpressionValue(recyclerView2, "recyclerView");
                return recyclerView2;
            case 2:
                KProperty[] kPropertyArr3 = TradeScreen.p0;
                ScreenContentRecyclerView recyclerView3 = ((TradeScreen) viewController).d3().f185067c;
                Intrinsics.checkNotNullExpressionValue(recyclerView3, "recyclerView");
                return recyclerView3;
            case 3:
                StockDetailsOverviewController stockDetailsOverviewController = (StockDetailsOverviewController) viewController;
                KProperty[] kPropertyArr4 = StockDetailsOverviewController.P0;
                ViewBinding value2 = stockDetailsOverviewController.L.getValue(stockDetailsOverviewController, StockDetailsOverviewController.P0[0]);
                Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                ScreenContentRecyclerView recyclerView4 = ((nrk.b) value2).f218664b;
                Intrinsics.checkNotNullExpressionValue(recyclerView4, "recyclerView");
                return recyclerView4;
            default:
                KProperty[] kPropertyArr5 = BondDetailsController.H0;
                ScreenContentRecyclerView recyclerView5 = ((BondDetailsController) viewController).d3().f174568c;
                Intrinsics.checkNotNullExpressionValue(recyclerView5, "recyclerView");
                return recyclerView5;
        }
    }
}
