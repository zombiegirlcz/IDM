package mmh;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends yji.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f207232c;
    public final a d;

    public i(j controllerModelExtension, a delegates) {
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        this.f207232c = controllerModelExtension;
        this.d = delegates;
    }

    @Override // yji.d
    public final void M() {
        a aVar = this.d;
        int i = 0;
        Continuation continuation = null;
        yji.d.H(this, new e(rd0.e.b(aVar.f207218a.f53218h), i), new h(this, continuation, i), 3);
        int i2 = 1;
        yji.d.H(this, new e(rd0.e.b(aVar.f207219b.f52707c), i2), new h(this, continuation, i2), 3);
        int i3 = 2;
        yji.d.H(this, new e(rd0.e.b(aVar.f207220c.f53336c.f121375b), i3), new h(this, continuation, i3), 3);
    }
}
