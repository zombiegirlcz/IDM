package je8;

import cli.k;
import cli.y;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends oki.h implements dli.b {
    public final y o;

    public h(i mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.o = mra.d.b(this, k.f25028a, mapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
