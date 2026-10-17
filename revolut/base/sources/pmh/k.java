package pmh;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends yji.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f237581c;
    public final a d;

    public k(l controllerModelExtension, a delegates) {
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        this.f237581c = controllerModelExtension;
        this.d = delegates;
    }

    @Override // yji.d
    public final void M() {
        a aVar = this.d;
        Continuation continuation = null;
        yji.d.H(this, new p73.d(rd0.e.b(aVar.f237566a.f53218h), 15), new j(this, continuation, 0), 3);
        yji.d.H(this, new p73.d(rd0.e.b(aVar.d.f52467c), 16), new j(this, continuation, 1), 3);
        yji.d.H(this, new p73.d(rd0.e.b(aVar.f237568c.d), 17), new j(this, continuation, 2), 3);
    }
}
