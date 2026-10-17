package pkh;

import cli.y;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import pfk.o0;
import pj9.n;
import zh9.u0;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends oki.h implements dli.b {
    public final rkh.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final tkh.b f237193p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f237194q;

    public k(l stateMapper, rkh.f disclosuresContentProvider, tkh.b navigationDestinationProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(disclosuresContentProvider, "disclosuresContentProvider");
        Intrinsics.checkNotNullParameter(navigationDestinationProvider, "navigationDestinationProvider");
        this.o = disclosuresContentProvider;
        this.f237193p = navigationDestinationProvider;
        this.f237194q = mra.d.b(this, new i(null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        rkh.f fVar = this.o;
        yji.l.b1(this, com.revolut.data.database.models.openbanking.d.x("DisclosuresControllerModel", "onCreated", nim.a.v(u0.i(fVar.a(), fVar.b(), fVar.c()), new n(14))), null, new o0(this, (Continuation) null, 12), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f237194q;
    }
}
