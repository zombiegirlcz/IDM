package xug;

import cli.y;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class q extends oki.h implements dli.b {

    @NotNull
    private static final p Companion = new p();
    public final y o;

    public q(h inputData, s stateMapper, r saveStateDelegate) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(saveStateDelegate, "saveStateDelegate");
        this.o = mra.d.b(this, new g(inputData.f309065a, h0.f322473a), stateMapper, saveStateDelegate, false, 8);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
