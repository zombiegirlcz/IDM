package fuk;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class l extends yji.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f138249c;
    public final c d;

    public l(t controllerModelExtension, c delegates) {
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        this.f138249c = controllerModelExtension;
        this.d = delegates;
    }

    @Override // yji.d
    public final void M() {
        c cVar = this.d;
        Continuation continuation = null;
        yji.d.H(this, new fo6.d(rd0.e.b(cVar.f138227a.f), 10), new k(this, continuation, 0), 3);
        yji.d.H(this, new fo6.d(rd0.e.b(cVar.f138228b.f52391c.f121375b), 9), new k(this, continuation, 1), 3);
    }
}
