package chg;

import cli.n;
import cli.y;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import skm.a2;
import yji.l;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends oki.h implements g {
    public final vfg.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final dyb.a f24228p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final bgg.a f24229q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a2 f24230r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f24231s;

    public j(n stateMapper, vfg.e airlinesInteractor, dyb.a kycCheckExtension, bgg.a accountUnlinkingControllerModelExtension) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(airlinesInteractor, "airlinesInteractor");
        Intrinsics.checkNotNullParameter(kycCheckExtension, "kycCheckExtension");
        Intrinsics.checkNotNullParameter(accountUnlinkingControllerModelExtension, "accountUnlinkingControllerModelExtension");
        this.o = airlinesInteractor;
        this.f24228p = kycCheckExtension;
        this.f24229q = accountUnlinkingControllerModelExtension;
        this.f24231s = mra.d.b(this, new e(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        I2();
    }

    public final void I2() {
        a2 a2Var = this.f24230r;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.f24230r = l.a1(this, this.o.b(w4l.h.f294642c), null, null, new cbh.g(this, continuation, 19), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f24231s;
    }
}
