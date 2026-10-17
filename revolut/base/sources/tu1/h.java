package tu1;

import cli.n;
import cli.y;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends oki.h implements f {
    public final y o;

    public h(n stateMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, d.f274516a, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
