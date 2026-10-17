package mw1;

import cli.n;
import cli.y;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes20.dex */
public final class j extends oki.h implements h {
    public final y o;

    public j(f inputData, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, new e(inputData.f209304a, d0.P0(inputData.f209305b, new k2j.d(inputData, 14))), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
