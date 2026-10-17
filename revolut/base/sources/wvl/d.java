package wvl;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import wuh.q;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends qdf.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qdf.d f300555c;
    public final qdf.b d;

    public d(qdf.d view, qdf.b controllerModelExtension) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f300555c = view;
        this.d = controllerModelExtension;
    }

    @Override // yji.d
    public final void M() {
        qdf.d dVar = this.f300555c;
        yji.d.H(this, new b(rd0.e.b(dVar.n()), 0), new wkg.e(this, null, 19), 3);
        yji.d.H(this, new b(rd0.e.b(dVar.o()), 1), new q(this, (Continuation) null, 12), 3);
    }
}
