package xn6;

import cli.y;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends oki.h implements k {
    public final f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xoj.a f307330p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final oe6.a f307331q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f307332r;

    public o(f inputData, xoj.a featuresInteractor, oe6.a externalInstitutionsInteractor, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(externalInstitutionsInteractor, "externalInstitutionsInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f307330p = featuresInteractor;
        this.f307331q = externalInstitutionsInteractor;
        this.f307332r = mra.d.b(this, new e(false, new Data(null, null, true, 3, null), "", inputData.f307320b, inputData.f307321c), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, rd0.e.b(((cpj.b) this.f307330p).l(yoj.c.OPENBANKING_MORE_BANKS_ITEM)), null, null, new n(this, null, 0), 3);
        yji.l.a1(this, rd0.e.b(((xg6.j) this.f307331q).i(w4l.i.f294643c, this.o.f307320b)), null, null, new n(this, null, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f307332r;
    }
}
