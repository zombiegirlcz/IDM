package cbf;

import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.screens.disclaimer.TransferOutDisclaimerScreen;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TransferOutDisclaimerScreen f22791a;

    public f(TransferOutDisclaimerScreen transferOutDisclaimerScreen) {
        this.f22791a = transferOutDisclaimerScreen;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        boolean zCanScrollVertically = recyclerView.canScrollVertically(1);
        KProperty[] kPropertyArr = TransferOutDisclaimerScreen.S;
        TwinVerticalButton twinVerticalButton = this.f22791a.d3().d;
        Intrinsics.checkNotNullExpressionValue(twinVerticalButton, "screenRecyclerNavbarTwin…lButtonTwinVerticalButton");
        twinVerticalButton.setCollapsed(zCanScrollVertically, true);
    }
}
