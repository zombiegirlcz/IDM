package q4h;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import pvk.i;
import q2e.i0;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends h3h.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h3h.c f242161c;
    public final h3h.b d;

    public b(h3h.c delegates, h3h.b model) {
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f242161c = delegates;
        this.d = model;
    }

    @Override // yji.d
    public final void M() {
        yji.d.H(this, new i(rd0.e.b(this.f242161c.d.f53218h), 21), new i0(this, (Continuation) null, 9), 3);
    }
}
