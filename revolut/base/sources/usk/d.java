package usk;

import com.revolut.core.ui_kit.delegates.EpsChartDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import jul.o;
import kotlin.jvm.internal.Intrinsics;
import urd.n;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends yji.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f282981c;
    public final tsk.c d;

    public d(o view, tsk.c controllerModelExtension) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f282981c = view;
        this.d = controllerModelExtension;
    }

    @Override // yji.d
    public final void M() {
        o oVar = this.f282981c;
        yji.d.H(this, new n(rd0.e.b(((EpsChartDelegate) oVar.f178695b).f52225c.f121375b), 4), new c(this, null, 0), 3);
        yji.d.H(this, new n(rd0.e.b(((FixedTabsDelegate) oVar.f178696c).f52339c.f121375b), 3), new c(this, null, 1), 3);
    }
}
