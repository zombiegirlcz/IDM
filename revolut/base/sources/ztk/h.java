package ztk;

import cli.y;
import kotlin.jvm.internal.Intrinsics;
import yji.l;
import zr2.o;

/* JADX INFO: loaded from: classes12.dex */
public final class h extends oki.h implements dli.b {
    public final qrk.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f325181p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f325182q;

    public h(g mapper, qrk.c stockInsightsInteractor, d input) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(stockInsightsInteractor, "stockInsightsInteractor");
        Intrinsics.checkNotNullParameter(input, "input");
        this.o = stockInsightsInteractor;
        this.f325181p = input;
        this.f325182q = mra.d.b(this, new c(null, null), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, nim.a.v(this.o.b(this.f325181p.f325177a, w4l.h.f294642c), new o(19)), null, new zt4.l(this, null, 2), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f325182q;
    }
}
