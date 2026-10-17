package atk;

import akl.e0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f9089c;
    public final c d;

    public i(f view, c controllerModelExtension) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f9089c = view;
        this.d = controllerModelExtension;
    }

    @Override // yji.d
    public final void M() {
        yji.d.H(this, new an9.i(rd0.e.b(this.f9089c.d().d), 12), new e0(this, null, 8), 3);
    }
}
