package fsl;

import kotlin.jvm.internal.Intrinsics;
import vkm.q0;

/* JADX INFO: loaded from: classes12.dex */
public final class q extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f137731c;
    public final i d;

    public q(o view, i controllerModelExtension) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f137731c = view;
        this.d = controllerModelExtension;
    }

    @Override // yji.d
    public final void M() {
        yji.d.H(this, new q0(this.f137731c.k0(), new p(this, null), 1), null, 7);
    }
}
