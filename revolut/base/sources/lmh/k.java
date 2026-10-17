package lmh;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kx4.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends yji.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f197085c;
    public final cnh.f d;

    public k(a delegates, cnh.f controllerModelExtension) {
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f197085c = delegates;
        this.d = controllerModelExtension;
    }

    @Override // yji.d
    public final void M() {
        a aVar = this.f197085c;
        Continuation continuation = null;
        yji.d.H(this, new f0(rd0.e.b(aVar.f197072a.f53218h), 23), new i(this, continuation, 0), 3);
        yji.d.H(this, new f0(rd0.e.b(aVar.f197073b.f52707c), 24), new i(this, continuation, 1), 3);
        yji.d.H(this, new f0(rd0.e.b(aVar.f197074c.f53336c.f121375b), 25), new i(this, continuation, 2), 3);
        yji.d.H(this, rd0.e.b(aVar.f.f52371h.f121375b), new j(this, null), 3);
    }
}
