package rle;

import com.revolut.feature.tab.invest.impl.ui.home.TabInvestController;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f255034c;
    public final b d;

    public g(e view, b controllerModelExtension) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f255034c = view;
        this.d = controllerModelExtension;
    }

    @Override // yji.d
    public final void M() {
        yji.d.H(this, new r7b.e(rd0.e.b(((TabInvestController) this.f255034c).Q.f53226s), 6), new rk9.d(this, null, 4), 3);
    }
}
