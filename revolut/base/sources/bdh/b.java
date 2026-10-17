package bdh;

import efm.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends yji.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f14603c;
    public final v1h.a d;

    public b(c modelApi, v1h.a delegates) {
        Intrinsics.checkNotNullParameter(modelApi, "modelApi");
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        this.f14603c = modelApi;
        this.d = delegates;
    }

    @Override // yji.d
    public final void M() {
        r rVarFilter = this.d.f285315a.f51821c.filter(new bce.e(new bbh.a(14), 11));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        yji.d.H(this, rd0.e.b(rVarFilter), new a(this, null), 3);
    }
}
