package buk;

import a3e.u;
import cli.y;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends oki.h implements dli.b {
    public final y o;

    public a(u mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.o = mra.d.b(this, d.f18897a, mapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
