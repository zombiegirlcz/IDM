package xfd;

import kotlin.jvm.internal.Intrinsics;
import l3d.h0;
import m3d.j;
import v0f.p;
import vkm.j2;
import vkm.q;
import yji.n;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends gfd.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final gfd.c f305238l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j f305239m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j2 f305240n;

    public g(efd.a alertsInteractor, i mapper, gfd.c viewApi, h0 watchlistInteractor, j watchlistDestinationProvider) {
        Intrinsics.checkNotNullParameter(alertsInteractor, "alertsInteractor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(viewApi, "viewApi");
        Intrinsics.checkNotNullParameter(watchlistInteractor, "watchlistInteractor");
        Intrinsics.checkNotNullParameter(watchlistDestinationProvider, "watchlistDestinationProvider");
        this.f305238l = viewApi;
        this.f305239m = watchlistDestinationProvider;
        this.f305240n = q.c(gfd.b.ASSETS);
        new vii.c();
    }

    @Override // yji.n
    public final void H2() {
        gfd.c cVar = this.f305238l;
        n.l2(this, rd0.e.b(cVar.T()), null, new f(this, null), 3);
        n.l2(this, new wvl.b(rd0.e.b(cVar.U()), 21), null, new a(this, null, 1), 3);
        n.l2(this, new wvl.b(rd0.e.b(cVar.i0()), 22), null, new a(this, null, 2), 3);
        n.l2(this, new p(new wvl.b(rd0.e.b(cVar.h0()), 23), 19), null, new a(this, null, 3), 3);
    }
}
