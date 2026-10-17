package h50;

import at.r;
import cli.y;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes19.dex */
public final class h extends oki.h implements dli.b {
    public final y o;

    public h(a inputData, r stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, new i(inputData.f149408a, inputData.f149409b, inputData.f149410c, h0.f322473a, ""), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
