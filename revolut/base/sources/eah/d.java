package eah;

import b1h.f;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.insights.InsightsScreen;
import e8e.y;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends yji.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f124255c;
    public final b1h.a d;

    public d(f view, b1h.a controllerModelExtension) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f124255c = view;
        this.d = controllerModelExtension;
    }

    @Override // yji.d
    public final void M() {
        InsightsScreen insightsScreen = (InsightsScreen) this.f124255c;
        yji.d.H(this, rd0.e.b(w.a0(insightsScreen.P.f52707c, new y(19))), new c(this, null, 0), 3);
        yji.d.H(this, rd0.e.b(w.a0(insightsScreen.Q.q(), new y(20))), new c(this, null, 1), 3);
    }
}
