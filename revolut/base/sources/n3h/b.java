package n3h;

import kotlin.jvm.internal.Intrinsics;
import q2h.k;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends q2h.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f212131c;
    public final q2h.b d;

    public b(k view, q2h.b controllerModelExtension) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f212131c = view;
        this.d = controllerModelExtension;
    }

    @Override // yji.d
    public final void M() {
        yji.d.H(this, rd0.e.b(this.f212131c.c().f53218h), new a(this, null), 3);
    }
}
