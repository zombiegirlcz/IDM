package gnh;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes10.dex */
public final class s extends yji.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f145018c;
    public final cc7.l d;

    public s(c delegates, cc7.l controllerModelExtension) {
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f145018c = delegates;
        this.d = controllerModelExtension;
    }

    @Override // yji.d
    public final void M() {
        c cVar = this.f145018c;
        int i = 12;
        an9.g gVar = new an9.g(vkm.q.J(new g9j.q(rd0.e.b(cVar.f144990a.f53218h), 11), new g9j.q(rd0.e.b(cVar.f144992c.f53378c), i), new g9j.q(rd0.e.b(cVar.f.q()), 13)), i);
        Continuation continuation = null;
        yji.d.H(this, gVar, new r(this, continuation, 0), 3);
        yji.d.H(this, rd0.e.b(w.a0(cVar.f144991b.f52707c, new gn.a(4))), new r(this, continuation, 1), 3);
    }
}
