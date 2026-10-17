package i4h;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class n extends e3h.j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e3h.i f158460c;
    public final p0 d;

    public n(e3h.i view, p0 controllerModel) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(controllerModel, "controllerModel");
        this.f158460c = view;
        this.d = controllerModel;
    }

    @Override // yji.d
    public final void M() {
        e3h.i iVar = this.f158460c;
        Continuation continuation = null;
        yji.d.H(this, new hsl.c(rd0.e.b(iVar.I()), 28), new k(this, null), 3);
        yji.d.H(this, rd0.e.b(iVar.h1()), new l(this, null), 3);
        yji.d.H(this, new hsl.c(rd0.e.b(iVar.B1()), 29), new m(this, null), 3);
        efm.r rVarMerge = efm.r.merge(iVar.Z0().filter(new i31.e(21, new i3k.h(19))).map(new i31.e(22, new i3k.h(20))), iVar.F().filter(new i31.e(23, new i3k.h(21))).map(new i31.e(24, new i3k.h(22))));
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        yji.d.H(this, rd0.e.b(rVarMerge), new g(this, continuation, 0), 3);
        yji.d.H(this, new hsl.c(rd0.e.b(iVar.C()), 27), new h(this, null), 3);
        yji.d.H(this, rd0.e.b(iVar.E0()), new g(this, continuation, 1), 3);
        yji.d.H(this, new hsl.c(rd0.e.b(iVar.U1()), 26), new hwi.l0(this, continuation, 14), 3);
    }
}
