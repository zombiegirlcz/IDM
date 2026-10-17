package kvl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class q extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f190170c;
    public final c d;

    public q(g screen, c controllerModelExtension) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f190170c = screen;
        this.d = controllerModelExtension;
    }

    @Override // yji.d
    public final void M() {
        g gVar = this.f190170c;
        yji.d.H(this, new kge.b(rd0.e.b(gVar.p1().f51780c), 29), new h(this, null), 3);
        yji.d.H(this, new o(rd0.e.b(gVar.p1().d), 0), new i(this, null), 3);
        yji.d.H(this, new o(rd0.e.b(gVar.c0().d.f121375b), 1), new j(this, null), 3);
        yji.d.H(this, vkm.q.J(rd0.e.b(gVar.U0().f51551c.f53218h), rd0.e.b(gVar.c().f53218h)), new k(this, null), 3);
    }
}
