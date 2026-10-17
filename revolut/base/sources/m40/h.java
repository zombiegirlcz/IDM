package m40;

import cli.y;
import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import yji.l;

/* JADX INFO: loaded from: classes19.dex */
public final class h extends oki.h implements dli.b {
    public final jpc.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f202619p;

    public h(g stateMapper, jpc.e callInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(callInteractor, "callInteractor");
        this.o = callInteractor;
        this.f202619p = mra.d.b(this, new d(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        I2();
    }

    public final void I2() {
        jpc.e eVar = this.o;
        eVar.getClass();
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        u20.f fVar = (u20.f) eVar.f177257c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        l.a1(this, rd0.e.b(fVar.e.e(Unit.f186387a, loadingStrategy)), null, null, new lph.h(this, null, 20), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f202619p;
    }
}
