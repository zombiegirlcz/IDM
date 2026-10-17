package vd7;

import cli.y;
import kotlin.jvm.internal.Intrinsics;
import rd7.j;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends oki.h implements f {
    public final y o;

    public h(i stateMapper, j inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = mra.d.b(this, new c(inputData.f253369a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
