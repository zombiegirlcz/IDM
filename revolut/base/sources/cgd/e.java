package cgd;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.revolut.core.ui_kit.internal.views.navbar.SearchView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.crypto.currency_pair.picker.impl.ui.currency_pair_picker.CryptoCurrencyPairPickerScreen;
import com.revolut.feature.cryptocommodity_invest.impl.ui.standalone_symbol.screen.StandaloneSymbolCustomisationScreen;
import com.revolut.feature.shared_separate_favourites.common.screen.add_asset.SharedFavouritesAddAssetScreen;
import com.revolut.feature.shared_separate_favourites.common.screen.counterpart_chooser.SharedFavouritesCounterpartChooserScreen;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.screens.instruments_list.InstrumentsListScreen;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NavBarWithToolbar f23936b;

    public /* synthetic */ e(NavBarWithToolbar navBarWithToolbar, int i) {
        this.f23935a = i;
        this.f23936b = navBarWithToolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View currentFocus;
        int i = this.f23935a;
        NavBarWithToolbar navBarWithToolbar = this.f23936b;
        switch (i) {
            case 0:
                SharedFavouritesCounterpartChooserScreen.a aVar = SharedFavouritesCounterpartChooserScreen.Companion;
                navBarWithToolbar.E0();
                break;
            case 1:
                navBarWithToolbar.E0();
                Object systemService = navBarWithToolbar.getContext().getSystemService("input_method");
                InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                if (inputMethodManager != null) {
                    Context context = navBarWithToolbar.getContext();
                    Activity activity = context instanceof Activity ? (Activity) context : null;
                    if (activity != null && (currentFocus = activity.getCurrentFocus()) != null) {
                        inputMethodManager.showSoftInput(currentFocus, 0);
                        break;
                    }
                }
                break;
            case 2:
                KProperty[] kPropertyArr = CryptoCurrencyPairPickerScreen.T;
                navBarWithToolbar.E0();
                break;
            case 3:
                KProperty[] kPropertyArr2 = StandaloneSymbolCustomisationScreen.S;
                navBarWithToolbar.E0();
                break;
            case 4:
                NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
                SearchView searchView = navBarWithToolbar.f59409p;
                searchView.o();
                View viewFindFocus = searchView.findFocus();
                if (viewFindFocus != null) {
                    kli.c.d(viewFindFocus, 0L);
                }
                break;
            case 5:
                KProperty[] kPropertyArr3 = InstrumentsListScreen.T;
                navBarWithToolbar.E0();
                kli.c.d(navBarWithToolbar, 0L);
                break;
            case 6:
                KProperty[] kPropertyArr4 = SharedFavouritesAddAssetScreen.f86802h0;
                navBarWithToolbar.E0();
                break;
            default:
                navBarWithToolbar.E0();
                break;
        }
    }
}
