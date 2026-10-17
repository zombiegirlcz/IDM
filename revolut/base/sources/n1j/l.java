package n1j;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.retail.feature.balance.picker.impl.balance_picker_v2.BalancePickerScreen;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BalancePickerScreen f211387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f211388b;

    public l(BalancePickerScreen balancePickerScreen, int i) {
        this.f211387a = balancePickerScreen;
        this.f211388b = i;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32) {
        view.removeOnLayoutChangeListener(this);
        KProperty[] kPropertyArr = BalancePickerScreen.W;
        BalancePickerScreen balancePickerScreen = this.f211387a;
        enk.a aVar = new enk.a(balancePickerScreen.d3().f302449c.getContext(), 1);
        aVar.setTargetPosition(this.f211388b);
        RecyclerView.LayoutManager layoutManager = balancePickerScreen.d3().f302449c.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.startSmoothScroll(aVar);
        }
        balancePickerScreen.O = true;
    }
}
