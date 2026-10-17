package deg;

import cli.y;
import dee.a0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends oki.h implements h {
    public final y o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f113438p;

    public i(j stateMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, new feg.e(0), stateMapper, null, false, 12);
        this.f113438p = hx7.e.a(this, new a0(1));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f113438p;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
