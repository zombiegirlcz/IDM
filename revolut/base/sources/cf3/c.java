package cf3;

import cbh.g;
import cli.y;
import cli.z;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import yji.l;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends h implements z {
    public final se3.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f23535p;

    public c(se3.c repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.o = repository;
        this.f23535p = d.b(this, new b(0), new a54.b(4), null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, this.o.f262097c.b(Unit.f186387a, w4l.h.f294642c), null, null, new g(this, null, 6), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f23535p;
    }
}
