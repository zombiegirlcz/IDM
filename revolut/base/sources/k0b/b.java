package k0b;

import cli.g;
import cli.k;
import cli.y;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends h implements dli.b {
    public final y o;

    public b(c stateMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = d.b(this, k.f25028a, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.o;
    }
}
