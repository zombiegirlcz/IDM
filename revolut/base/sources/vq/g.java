package vq;

import cli.n;
import cli.y;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class g extends oki.h implements dli.b {
    public final y o;

    public g(hwl.c uiTogglesProvider, n stateMapper) {
        Intrinsics.checkNotNullParameter(uiTogglesProvider, "uiTogglesProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, new d(), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
