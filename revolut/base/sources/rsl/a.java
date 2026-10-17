package rsl;

import com.revolut.core.ui_kit.delegates.CellDetailsActionableIconDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.trading.orders.ui.details.BaseInvestOrderDetailsScreen;
import jsl.b0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f257121c;
    public final j d;

    public a(b0 screen, j controllerModelExtension) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f257121c = screen;
        this.d = controllerModelExtension;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // yji.d
    public final void M() {
        BaseInvestOrderDetailsScreen baseInvestOrderDetailsScreen = (BaseInvestOrderDetailsScreen) this.f257121c;
        yji.d.H(this, vkm.q.J(rd0.e.b(baseInvestOrderDetailsScreen.p1().d), rd0.e.b(((CellDetailsActionableIconDelegate) baseInvestOrderDetailsScreen.V.getValue()).f51807c), rd0.e.b(((CellDetailsNoteDelegate) baseInvestOrderDetailsScreen.X.getValue()).d)), new rk9.d(this, null, 28), 3);
    }
}
