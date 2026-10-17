package y4e;

import kotlin.jvm.internal.Intrinsics;
import xo8.a0;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f310895c;
    public final c d;

    public h(b controllerModelExtension, c delegates) {
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        this.f310895c = controllerModelExtension;
        this.d = delegates;
    }

    @Override // yji.d
    public final void M() {
        yji.d.H(this, new a0(rd0.e.b(this.d.f310891a.f53218h), 17), new g(this, null), 3);
    }
}
