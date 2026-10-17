package dtl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends yji.d implements a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f117470c;
    public final b d;

    public g(d view, b controllerModelExtension) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f117470c = view;
        this.d = controllerModelExtension;
    }

    @Override // yji.d
    public final void M() {
        yji.d.H(this, new dfj.f(this.f117470c.B0(), 5), new f(this, null), 3);
    }
}
