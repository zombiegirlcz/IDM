package lee;

import cli.y;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class m extends oki.h implements dli.b {
    public final y o;

    public m(n stateMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, new g(0), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
