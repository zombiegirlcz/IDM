package x8j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends yji.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f303429c;
    public final n d;

    public e(o view, n model) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f303429c = view;
        this.d = model;
    }

    @Override // yji.d
    public final void M() {
        o oVar = this.f303429c;
        yji.d.H(this, new vy5.d0(oVar.S1(), 18), new d(this, null, 0), 3);
        yji.d.H(this, new vy5.d0(oVar.N1(), 19), new d(this, null, 1), 3);
        yji.d.H(this, new vy5.d0(oVar.N1(), 20), new d(this, null, 2), 3);
    }
}
