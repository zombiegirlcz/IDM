package a5h;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends k3h.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k3h.b f1395c;
    public final k3h.c d;

    public d(k3h.b controllerModelExtension, k3h.c delegates) {
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        this.f1395c = controllerModelExtension;
        this.d = delegates;
    }

    @Override // yji.d
    public final void M() {
        ListSubheaderDelegate listSubheaderDelegate = this.d.d;
        yji.d.H(this, new a15.d(rd0.e.b(listSubheaderDelegate.d), 4), new c(this, null, 0), 3);
        yji.d.H(this, new a15.d(rd0.e.b(listSubheaderDelegate.f52707c), 5), new c(this, null, 1), 3);
    }
}
