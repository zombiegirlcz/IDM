package nsl;

import com.revolut.trading.orders.ui.details.BaseInvestOrderDetailsScreen;
import jsl.b0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f218906c;
    public final p d;

    public b(b0 screen, p controllerModelExtension) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f218906c = screen;
        this.d = controllerModelExtension;
    }

    @Override // yji.d
    public final void M() {
        yji.d.H(this, new njj.n(rd0.e.b(((BaseInvestOrderDetailsScreen) this.f218906c).p1().d), 10), new nn7.d(this, null, 17), 3);
    }
}
