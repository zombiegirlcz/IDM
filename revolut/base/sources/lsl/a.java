package lsl;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.trading.orders.ui.details.BaseInvestOrderDetailsScreen;
import jsl.b0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f199694c;
    public final h d;

    public a(b0 screen, h controllerModelExtension) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f199694c = screen;
        this.d = controllerModelExtension;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // yji.d
    public final void M() {
        BaseInvestOrderDetailsScreen baseInvestOrderDetailsScreen = (BaseInvestOrderDetailsScreen) this.f199694c;
        yji.d.H(this, vkm.q.J(rd0.e.b(((CellDetailsDelegate) baseInvestOrderDetailsScreen.S.getValue()).f), rd0.e.b(baseInvestOrderDetailsScreen.p1().d)), new lph.h(this, null, 2), 3);
    }
}
