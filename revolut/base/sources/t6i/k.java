package t6i;

import cli.y;
import kotlin.jvm.internal.Intrinsics;
import qee.s;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends oki.h implements dli.b {
    public final y o;

    public k(s stateMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, cli.k.f25028a, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
