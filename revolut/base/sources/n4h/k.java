package n4h;

import cli.y;
import kotlin.jvm.internal.Intrinsics;
import kxk.o;

/* JADX INFO: loaded from: classes9.dex */
public final class k extends oki.h implements g {
    public final ybl.l o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f212449p;

    public k(o stateMapper, ybl.l tradingConfigInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        this.o = tradingConfigInteractor;
        this.f212449p = mra.d.b(this, new h(null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, ybl.l.d(this.o), null, null, new mx5.g(this, null, 19), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f212449p;
    }
}
