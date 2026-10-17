package r50;

import cli.g;
import cli.y;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes19.dex */
public final class f extends h implements dli.b {
    public final y o;

    public f(c input, e stateMapper) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, new b(input.f251524a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.o;
    }
}
