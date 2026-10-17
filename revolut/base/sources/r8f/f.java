package r8f;

import cli.g;
import cli.n;
import cli.y;
import j6f.t;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yji.l;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends h implements dli.b {
    public final j6f.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f252427p;

    public f(j6f.b allocationExtensionModel, n stateMapper) {
        Intrinsics.checkNotNullParameter(allocationExtensionModel, "allocationExtensionModel");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = allocationExtensionModel;
        this.f252427p = mra.d.b(this, new d(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, ((t) this.o).f171764t.B(new j3f.d(22)), null, new r5e.e(this, null, 13), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f252427p;
    }
}
