package e5e;

import a3e.u;
import cli.g;
import cli.y;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import vkm.j2;
import yji.l;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends h implements dli.b {
    public final k3h.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f122815p;

    public f(u mapper, k3h.b ratingsWidgetModel) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(ratingsWidgetModel, "ratingsWidgetModel");
        this.o = ratingsWidgetModel;
        this.f122815p = mra.d.b(this, new c((k3h.d) ((j2) ((a5h.f) ratingsWidgetModel).f1404r.f22677a).getValue()), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, (j2) ((a5h.f) this.o).f1404r.f22677a, null, new e0b.c(this, null, 17), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f122815p;
    }
}
