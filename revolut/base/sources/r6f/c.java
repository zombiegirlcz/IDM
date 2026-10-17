package r6f;

import i6f.t0;
import kotlin.jvm.internal.Intrinsics;
import q97.b1;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends t0 {
    public final h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f251828g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h view, d model) {
        super(view, model, "ManagedPortfolioDetailsFeesExtensionContract");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f = view;
        this.f251828g = model;
    }

    @Override // i6f.t0, yji.d
    public final void M() {
        super.M();
        yji.d.H(this, new b1(rd0.e.b(this.f.j0().d), 25), new b(this, null), 3);
    }
}
