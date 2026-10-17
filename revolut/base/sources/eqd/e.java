package eqd;

import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.retail.cfd.impl.screens.withdraw.CfdWithdrawScreen;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.disclaimer.IncomeSorterDisclaimerBottomSheetController;
import com.revolut.kompot.navigable.vc.ViewController;
import d1h.j;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewController f128441b;

    public /* synthetic */ e(ViewController viewController, int i) {
        this.f128440a = i;
        this.f128441b = viewController;
    }

    @Override // d1h.j
    /* JADX INFO: renamed from: H0 */
    public final FooterTextDelegate getV() {
        switch (this.f128440a) {
            case 0:
                return ((IncomeSorterDisclaimerBottomSheetController) this.f128441b).R;
            default:
                return ((CfdWithdrawScreen) this.f128441b).O;
        }
    }

    @Override // d1h.j
    /* JADX INFO: renamed from: Q */
    public final FullScreenStateDelegate getF91266e0() {
        switch (this.f128440a) {
            case 0:
                return ((IncomeSorterDisclaimerBottomSheetController) this.f128441b).T;
            default:
                return ((CfdWithdrawScreen) this.f128441b).P;
        }
    }

    @Override // d1h.j
    public final Flow y() {
        switch (this.f128440a) {
            case 0:
                return rd0.e.b(((IncomeSorterDisclaimerBottomSheetController) this.f128441b).S.d);
            default:
                return rd0.e.b(((CfdWithdrawScreen) this.f128441b).N.d);
        }
    }
}
