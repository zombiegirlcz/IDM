package qaj;

import cli.n;
import cli.y;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import q2e.i0;
import skm.a2;
import yji.l;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends oki.h implements e {
    public final oaj.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final gaj.b f244045p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public a2 f244046q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f244047r;

    public g(n mapper, oaj.a newlyAddedCryptoInteractor, gaj.b assetDestinationProvider) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(newlyAddedCryptoInteractor, "newlyAddedCryptoInteractor");
        Intrinsics.checkNotNullParameter(assetDestinationProvider, "assetDestinationProvider");
        this.o = newlyAddedCryptoInteractor;
        this.f244045p = assetDestinationProvider;
        this.f244047r = mra.d.b(this, new d(0), mapper, null, false, 12);
    }

    public final void I2() {
        a2 a2Var = this.f244046q;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.f244046q = l.b1(this, oaj.a.a(this.o), null, new i0(this, continuation, 24), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        I2();
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f244047r;
    }
}
