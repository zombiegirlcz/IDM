package h28;

import cli.y;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends oki.h implements dli.b, od0.f {
    public final y o;

    public j(e stateMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, d.f148736a, stateMapper, null, false, 12);
    }

    @Override // od0.f
    public final void accept(Object obj2) {
        c analyticsMethod = (c) obj2;
        Intrinsics.checkNotNullParameter(analyticsMethod, "analyticsMethod");
        C2(new f(analyticsMethod));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
