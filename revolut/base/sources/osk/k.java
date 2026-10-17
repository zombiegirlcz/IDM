package osk;

import com.revolut.core.ui_kit.delegates.HorizontalHistogramTileDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.LogosTileDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class k extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f229347c;
    public final jpc.e d;

    public k(b controllerModelExtension, jpc.e view) {
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        Intrinsics.checkNotNullParameter(view, "view");
        this.f229347c = controllerModelExtension;
        this.d = view;
    }

    @Override // yji.d
    public final void M() {
        jpc.e eVar = this.d;
        yji.d.H(this, rd0.e.b(((ListSubheaderDelegate) eVar.f177256b).f52707c), new h(this, null), 3);
        yji.d.H(this, rd0.e.b(((LogosTileDelegate) eVar.f177257c).f52753c), new j(this, null), 3);
        yji.d.H(this, rd0.e.b(((HorizontalHistogramTileDelegate) eVar.d).f52456c), new i(this, null), 3);
    }
}
