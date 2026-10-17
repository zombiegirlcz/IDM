package s1b;

import cli.g;
import cli.k;
import cli.y;
import fu6.t;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends h implements d {
    public final y o;

    public c(t stateMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, k.f25028a, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.o;
    }
}
