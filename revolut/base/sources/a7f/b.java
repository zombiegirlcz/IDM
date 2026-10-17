package a7f;

import i6f.n;
import i6f.t0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends t0 {
    public final k f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f1859g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(k model, f view) {
        super(view, model, "ManagedPortfolioDetailsOrdersExtensionContract");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(view, "view");
        this.f = model;
        this.f1859g = view;
    }

    @Override // i6f.t0, yji.d
    public final void M() {
        super.M();
        yji.d.H(this, new a15.d(rd0.e.b(((n) this.f1859g).f158948a.f53218h), 8), new a0l.k(this, null, 15), 3);
    }
}
