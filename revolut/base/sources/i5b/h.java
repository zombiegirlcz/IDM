package i5b;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends h2b.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h2b.b f158802c;
    public final j d;

    public h(h2b.b view, j controllerModel) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(controllerModel, "controllerModel");
        this.f158802c = view;
        this.d = controllerModel;
    }

    @Override // yji.d
    public final void M() {
        h2b.b bVar = this.f158802c;
        yji.d.H(this, new d(rd0.e.b(bVar.d().d), 0), new f(this, null), 3);
        yji.d.H(this, new d(rd0.e.b(bVar.c().f53218h), 1), new g(this, null), 3);
    }
}
