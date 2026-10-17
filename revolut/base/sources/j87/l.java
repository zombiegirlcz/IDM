package j87;

import j82.q;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends yji.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f172153c;
    public final a d;

    public l(b delegates, a controllerModelExtension) {
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f172153c = delegates;
        this.d = controllerModelExtension;
    }

    @Override // yji.d
    public final void M() {
        b bVar = this.f172153c;
        Continuation continuation = null;
        yji.d.H(this, new iqh.d(rd0.e.b(bVar.f172131a.f52371h.f121375b), 25), new j2c.b(this, continuation, 10), 3);
        yji.d.H(this, rd0.e.b(bVar.f172132b.d.f121375b), new q(this, continuation, 3), 3);
    }
}
