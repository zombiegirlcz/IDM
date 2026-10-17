package sae;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.feature.subscriptions.impl.payment_balance_picker.PaymentBalancePickerScreen;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PaymentBalancePickerScreen f261383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScreenContentRecyclerView f261384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f261385c;

    public g(PaymentBalancePickerScreen paymentBalancePickerScreen, ScreenContentRecyclerView screenContentRecyclerView, int i) {
        this.f261383a = paymentBalancePickerScreen;
        this.f261384b = screenContentRecyclerView;
        this.f261385c = i;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32) {
        view.removeOnLayoutChangeListener(this);
        PaymentBalancePickerScreen paymentBalancePickerScreen = this.f261383a;
        if (paymentBalancePickerScreen.N) {
            return;
        }
        ScreenContentRecyclerView screenContentRecyclerView = this.f261384b;
        enk.a aVar = new enk.a(screenContentRecyclerView.getContext(), 2);
        aVar.setTargetPosition(this.f261385c);
        RecyclerView.LayoutManager layoutManager = screenContentRecyclerView.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.startSmoothScroll(aVar);
        }
        paymentBalancePickerScreen.N = true;
    }
}
