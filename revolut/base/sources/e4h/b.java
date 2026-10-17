package e4h;

import dmj.k;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends a3h.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a3h.h f122551c;
    public final a3h.c d;

    public b(a3h.h view, a3h.c controllerModelExtension) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f122551c = view;
        this.d = controllerModelExtension;
    }

    @Override // yji.d
    public final void M() {
        yji.d.H(this, new k(rd0.e.b(this.f122551c.d().f52339c.f121375b), 16), new e0b.c(this, null, 11), 3);
    }
}
