package hwk;

import cli.g;
import cli.y;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yji.l;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends h implements dli.b {
    public final aah.h o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f156285p;

    public c(aah.h wealthDisclaimersControllerModelExtension, d stateMapper) {
        Intrinsics.checkNotNullParameter(wealthDisclaimersControllerModelExtension, "wealthDisclaimersControllerModelExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = wealthDisclaimersControllerModelExtension;
        this.f156285p = mra.d.b(this, new a(null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        int i = 18;
        l.b1(this, nim.a.v(this.o.f2828l.w0(), new hwf.b(i)), null, new hp2.d(this, null, i), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f156285p;
    }
}
