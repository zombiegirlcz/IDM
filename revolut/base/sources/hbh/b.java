package hbh;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends h1h.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h1h.f f150727c;
    public final h1h.b d;

    public b(h1h.f screen, h1h.b investTransactionsWidgetControllerModelExtension) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(investTransactionsWidgetControllerModelExtension, "investTransactionsWidgetControllerModelExtension");
        this.f150727c = screen;
        this.d = investTransactionsWidgetControllerModelExtension;
    }

    @Override // yji.d
    public final void M() {
        yji.d.H(this, new h23.b(rd0.e.b(this.f150727c.getR().f52707c), 13), new hba.k(this, (Continuation) null, 1), 3);
    }
}
