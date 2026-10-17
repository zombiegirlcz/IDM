package az;

import a3e.u;
import cli.y;
import cli.z;
import jv.r;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import yji.l;

/* JADX INFO: loaded from: classes16.dex */
public final class k extends oki.h implements z {
    public final vy.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yy.c f11282p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final dv.a f11283q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final xv.h f11284r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final uy.a f11285s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f11286t;
    public final y u;

    public k(u stateMapper, vy.a inputData, yy.c analyticsExtension, dv.a cameraKitClient, xv.h detector, uy.a dialogsMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(analyticsExtension, "analyticsExtension");
        Intrinsics.checkNotNullParameter(cameraKitClient, "cameraKitClient");
        Intrinsics.checkNotNullParameter(detector, "detector");
        Intrinsics.checkNotNullParameter(dialogsMapper, "dialogsMapper");
        this.o = inputData;
        this.f11282p = analyticsExtension;
        this.f11283q = cameraKitClient;
        this.f11284r = detector;
        this.f11285s = dialogsMapper;
        this.f11286t = w.y0(new aqe.a(this, 22));
        this.u = mra.d.b(this, new a(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        ((sx.b) this.f11282p.f317737n).f(this.o.f293110g);
        Continuation continuation = null;
        l.a1(this, new vkm.y(new g2d.c(2, 20, null), ((r) this.f11283q).f178729s), null, null, new j(this, continuation, 1), 3);
        l.a1(this, this.f11284r.a(), null, null, new j(this, continuation, 0), 3);
    }

    public final void I2(d event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (Intrinsics.f(event, b.f11273a)) {
            B2();
        } else {
            if (!Intrinsics.f(event, c.f11274a)) {
                throw new NoWhenBranchMatchedException();
            }
            H2(this.u, new ax9.a(23));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
