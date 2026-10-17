package v4e;

import kotlin.jvm.internal.Intrinsics;
import v2e.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class u extends l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f286065c;
    public final m d;

    public u(n delegates, m model) {
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f286065c = delegates;
        this.d = model;
    }

    @Override // yji.d
    public final void M() {
        n nVar = this.f286065c;
        yji.d.H(this, new h0(rd0.e.b(nVar.f286056b.f52518c), 1), new v44.e(this, null, 2), 3);
        yji.d.H(this, rd0.e.b(nVar.f286055a.r()), new t(this, null), 3);
    }
}
