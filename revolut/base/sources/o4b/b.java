package o4b;

import cli.g;
import cli.n;
import cli.y;
import kotlin.jvm.internal.Intrinsics;
import nwc.f;
import oki.h;
import yji.l;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends h implements dli.b {
    public final h2b.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f222188p;

    public b(n stateMapper, h2b.d cfdSettingsExtension) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(cfdSettingsExtension, "cfdSettingsExtension");
        this.o = cfdSettingsExtension;
        this.f222188p = mra.d.b(this, new c(null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, this.o.Z2(), null, null, new f(this, null, 23), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f222188p;
    }
}
