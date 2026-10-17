package nk6;

import cli.y;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends oki.h implements h {
    public final oe6.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f216664p;

    public j(oe6.a externalInstitutionsInteractor, m stateMapper) {
        Intrinsics.checkNotNullParameter(externalInstitutionsInteractor, "externalInstitutionsInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = externalInstitutionsInteractor;
        this.f216664p = mra.d.b(this, new e(new Data(null, null, true, 3, null), ""), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, rd0.e.b(((xg6.j) this.o).i(w4l.h.f294642c, oe6.c.f224552a)), null, null, new naf.j(this, null, 25), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f216664p;
    }
}
