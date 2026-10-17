package eo7;

import cli.k;
import cli.n;
import cli.y;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends h implements dli.b {
    public final y o;

    public f(n mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.o = mra.d.b(this, k.f25028a, mapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
