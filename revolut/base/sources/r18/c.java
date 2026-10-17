package r18;

import kotlin.jvm.internal.Intrinsics;
import vkm.q0;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends a18.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a18.g f250916c;
    public final a18.c d;

    public c(a18.g view, a18.c controllerModelExtension) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f250916c = view;
        this.d = controllerModelExtension;
    }

    @Override // yji.d
    public final void M() {
        a18.g gVar = this.f250916c;
        yji.d.H(this, new q0(gVar.k0(), new a(this, null), 1), null, 7);
        yji.d.H(this, new q0(gVar.l0(), new b(this, null), 1), null, 7);
    }
}
