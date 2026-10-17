package btk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f18633c;
    public final fvk.j d;

    public h(b controllerModelExtension, fvk.j view) {
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        Intrinsics.checkNotNullParameter(view, "view");
        this.f18633c = controllerModelExtension;
        this.d = view;
    }

    @Override // yji.d
    public final void M() {
        yji.d.H(this, new bk6.c(rd0.e.b(this.d.f138439a.f52942c), 18), new btd.e(this, null, 2), 3);
    }
}
