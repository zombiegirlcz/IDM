package htl;

import kotlin.jvm.internal.Intrinsics;
import vkm.q0;

/* JADX INFO: loaded from: classes12.dex */
public final class i extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f155463c;
    public final d d;

    public i(g view, d controllerModelExtension) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f155463c = view;
        this.d = controllerModelExtension;
    }

    @Override // yji.d
    public final void M() {
        yji.d.H(this, new q0(this.f155463c.O1(), new h(this, null), 1), null, 7);
    }
}
