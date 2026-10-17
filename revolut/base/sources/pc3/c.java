package pc3;

import android.view.ViewTreeObserver;
import com.revolut.feature.cash_topup.impl.ui.search.CashTopUpSearchLocationScreen;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f234809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CashTopUpSearchLocationScreen f234810b;

    public c(CashTopUpSearchLocationScreen cashTopUpSearchLocationScreen) {
        this.f234810b = cashTopUpSearchLocationScreen;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean z = this.f234809a;
        CashTopUpSearchLocationScreen cashTopUpSearchLocationScreen = this.f234810b;
        if (!z) {
            KProperty[] kPropertyArr = CashTopUpSearchLocationScreen.f65680a0;
            cashTopUpSearchLocationScreen.g3().f174539b.E0();
            this.f234809a = true;
        }
        if (cashTopUpSearchLocationScreen.D2().getViewTreeObserver().isAlive()) {
            cashTopUpSearchLocationScreen.D2().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
