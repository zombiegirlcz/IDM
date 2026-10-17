package e19;

import cli.g;
import cli.k;
import cli.y;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends h implements dli.b {
    public final y o;

    public d(e mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.o = mra.d.b(this, k.f25028a, mapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.o;
    }
}
