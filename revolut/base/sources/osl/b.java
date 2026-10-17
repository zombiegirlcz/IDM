package osl;

import com.revolut.trading.orders.ui.details.BaseInvestOrderDetailsScreen;
import jsl.b0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f229360c;
    public final l d;

    public b(b0 screen, l controllerModelExtension) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f229360c = screen;
        this.d = controllerModelExtension;
    }

    @Override // yji.d
    public final void M() {
        yji.d.H(this, rd0.e.b(((BaseInvestOrderDetailsScreen) this.f229360c).p1().d), new a(this, null), 3);
    }
}
