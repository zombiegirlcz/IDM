package xah;

import f1h.f;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends f1h.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f303885c;
    public final f1h.b d;

    public b(f screen, f1h.b controllerModelExtension) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f303885c = screen;
        this.d = controllerModelExtension;
    }

    @Override // yji.d
    public final void M() {
        yji.d.H(this, new wvl.b(rd0.e.b(this.f303885c.getR().f53218h), 20), new x64.b(this, null, 11), 3);
    }
}
