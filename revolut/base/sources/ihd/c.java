package ihd;

import com.revolut.feature.robo.impl.ui.screen.portfolio_strategy_information.PortfolioStrategyInformationScreen;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.screen.home_widget_customisation.WatchlistCustomisationScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.EsimMobilePlanCancellationScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.picker.EsimPickerScreen;
import ip0.y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements kfm.o, kfm.p, kfm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f161371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f161372b;

    public /* synthetic */ c(int i, Function1 function1) {
        this.f161371a = i;
        this.f161372b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f161371a) {
            case 9:
                ((ijj.p) this.f161372b).invoke(obj2);
                break;
            default:
                ((ijj.p) this.f161372b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f161371a;
        Function1 function1 = this.f161372b;
        switch (i) {
            case 0:
                WatchlistCustomisationScreen.Companion aVar = WatchlistCustomisationScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((igh.k) function1).invoke(p0);
                break;
            case 1:
                break;
            case 2:
            case 9:
            case 10:
            case 14:
            case 16:
            case 17:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 3:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 4:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 5:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 6:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 15:
                KProperty[] kPropertyArr = PortfolioStrategyInformationScreen.f0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 18:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((im3.e) function1).invoke(p0);
                break;
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((im3.e) function1).invoke(p0);
                break;
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((im3.e) function1).invoke(p0);
                break;
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((im3.e) function1).invoke(p0);
                break;
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((im3.e) function1).invoke(p0);
                break;
            case 28:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
        }
        return (y) ((ip0.v) function1).invoke(p0);
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        int i = this.f161371a;
        Function1 function1 = this.f161372b;
        switch (i) {
            case 2:
                KProperty[] kPropertyArr = EsimMobilePlanCancellationScreen.T;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 14:
                KProperty[] kPropertyArr2 = EsimPickerScreen.R;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 16:
                KProperty[] kPropertyArr3 = PortfolioStrategyInformationScreen.f0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            default:
                KProperty[] kPropertyArr4 = PortfolioStrategyInformationScreen.f0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
        }
        return ((Boolean) ((im3.e) function1).invoke(p0)).booleanValue();
    }
}
