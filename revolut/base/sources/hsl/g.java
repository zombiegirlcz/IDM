package hsl;

import ip0.mj;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends jdf.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final vki.a f155089l = pyd.c.a(this, new jdf.f(null, null));

    @Override // jdf.e
    public final void Z2(jdf.b period) {
        Intrinsics.checkNotNullParameter(period, "period");
        X2(this.f155089l, new hs4.l(period, 7));
    }

    @Override // jdf.e
    public final void b3(mj mjVar) {
        X2(this.f155089l, new hs4.l(mjVar, 6));
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.f155089l;
    }
}
