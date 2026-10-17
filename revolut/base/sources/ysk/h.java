package ysk;

import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.GroupedBarLineChartDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h extends yji.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jx0.a f316514c;
    public final xsk.b d;

    public h(jx0.a view, xsk.b modelExtension) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(modelExtension, "modelExtension");
        this.f316514c = view;
        this.d = modelExtension;
    }

    @Override // yji.d
    public final void M() {
        jx0.a aVar = this.f316514c;
        yji.d.H(this, new yph.b(rd0.e.b(((GroupedBarLineChartDelegate) aVar.f179038b).f52391c.f121375b), 9), new g(this, null, 0), 3);
        yji.d.H(this, new yph.b(rd0.e.b(((FixedTabsDelegate) aVar.f179039c).f52339c.f121375b), 8), new g(this, null, 1), 3);
    }
}
