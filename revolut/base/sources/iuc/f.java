package iuc;

import cli.y;
import ibg.g;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yji.l;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends h implements dli.b {
    public final kuc.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f168549p;

    public f(e stateMapper, kuc.f gamblingBlockExtension) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(gamblingBlockExtension, "gamblingBlockExtension");
        this.o = gamblingBlockExtension;
        this.f168549p = mra.d.b(this, new c(kuc.a.f189766a), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, ((kuc.l) this.o).o.B(new ksk.h(16)), null, new g(this, null, 29), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f168549p;
    }
}
