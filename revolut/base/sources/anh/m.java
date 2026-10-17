package anh;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m extends yji.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f7792c;
    public final o d;

    public m(a delegates, o extensionModel) {
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        Intrinsics.checkNotNullParameter(extensionModel, "extensionModel");
        this.f7792c = delegates;
        this.d = extensionModel;
    }

    @Override // yji.d
    public final void M() {
        a aVar = this.f7792c;
        Continuation continuation = null;
        yji.d.H(this, new an9.i(rd0.e.b(aVar.f7780c.f53218h), 1), new af4.e(this, continuation, 28), 3);
        yji.d.H(this, new an9.i(rd0.e.b(aVar.f7778a.f52707c), 2), new l(this, continuation, 0), 3);
        yji.d.H(this, new an9.i(rd0.e.b(aVar.f7779b.f52371h.f121375b), 3), new l(this, continuation, 1), 3);
    }
}
