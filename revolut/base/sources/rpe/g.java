package rpe;

import cli.k;
import cli.y;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends oki.h implements dli.b {
    public final y o;

    public g(j stateMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, k.f25028a, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
