package spc;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import sek.q;
import te0.w;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends yji.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f264947c;
    public final c84.c d;

    public d(a delegates, c84.c modelExtension) {
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        Intrinsics.checkNotNullParameter(modelExtension, "modelExtension");
        this.f264947c = delegates;
        this.d = modelExtension;
    }

    @Override // yji.d
    public final void M() {
        a aVar = this.f264947c;
        Continuation continuation = null;
        yji.d.H(this, rd0.e.b(w.a0(aVar.f264943a.d, new soi.a(5))), new q(this, continuation, 15), 3);
        yji.d.H(this, rd0.e.b(w.a0(aVar.f264944b.d.f121375b, new soi.a(6))), new se4.c(this, continuation, 16), 3);
    }
}
