package duk;

import cli.y;
import kotlin.jvm.internal.Intrinsics;
import yji.l;

/* JADX INFO: loaded from: classes12.dex */
public final class i extends oki.h implements dli.b {
    public final qrk.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f117996p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f117997q;

    public i(h mapper, qrk.c stockInsightsInteractor, d input) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(stockInsightsInteractor, "stockInsightsInteractor");
        Intrinsics.checkNotNullParameter(input, "input");
        this.o = stockInsightsInteractor;
        this.f117996p = input;
        this.f117997q = mra.d.b(this, new c(null), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, this.o.b(this.f117996p.f117990a, w4l.h.f294642c), null, new dob.c(this, null, 20), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f117997q;
    }
}
