package ymh;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import xo8.a0;
import yk6.m;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends yji.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f314999c;
    public final g d;

    public e(a delegates, g extensionModel) {
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        Intrinsics.checkNotNullParameter(extensionModel, "extensionModel");
        this.f314999c = delegates;
        this.d = extensionModel;
    }

    @Override // yji.d
    public final void M() {
        yji.d.H(this, new a0(rd0.e.b(this.f314999c.f314993a.d), 25), new m(this, (Continuation) null, 5), 3);
    }
}
