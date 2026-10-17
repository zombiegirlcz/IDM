package t5e;

import cli.y;
import com.revolut.feature.structured_note.details.impl.ui.screens.performance_tracker.PerformanceTrackerFlowContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import md6.s;

/* JADX INFO: loaded from: classes7.dex */
public final class o extends oki.h implements ali.h {
    public final PerformanceTrackerFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ybl.b f268074p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f268075q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ali.b f268076r;

    public o(PerformanceTrackerFlowContract$InputData input, l mapper, ybl.b instrumentTickerInteractor) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        this.o = input;
        this.f268074p = instrumentTickerInteractor;
        this.f268075q = mra.d.b(this, new a(0), mapper, null, false, 12);
        this.f268076r = s.b(this, new suf.a(this, 20));
    }

    @Override // ali.h
    public final ali.b I0() {
        return this.f268076r;
    }

    @Override // yji.l
    public final void T1(long j2) {
        yji.l.b1(this, rd0.e.b(((ael.k) this.f268074p).f(this.o.f88905a)), null, new sy6.j(this, null, 16), 3);
    }

    @Override // ali.h, cli.z
    public final cli.g getState() {
        return this.f268075q;
    }
}
