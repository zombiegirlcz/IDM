package am6;

import cli.k;
import cli.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends oki.h implements e {
    public final n o;

    public f(n stateMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = stateMapper;
    }

    @Override // cli.z
    public final cli.g getState() {
        return mra.d.b(this, k.f25028a, this.o, null, false, 12);
    }
}
