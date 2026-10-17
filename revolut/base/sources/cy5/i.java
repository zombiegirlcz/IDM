package cy5;

import cli.n;
import cli.y;
import cq6.k;
import cul.r1;
import kotlin.jvm.internal.Intrinsics;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends oki.h implements d {
    public final ey5.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final fy5.c f110055p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final dy5.b f110056q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final hy5.b f110057r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final sh5.d f110058s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f110059t;

    public i(n stateMapper, ey5.d actionsModelExtension, fy5.c chartModelExtension, dy5.b aboutModelExtension, hy5.b currenciesInsideModelExtension, sh5.d cryptoFcaDisclaimerWidget) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(actionsModelExtension, "actionsModelExtension");
        Intrinsics.checkNotNullParameter(chartModelExtension, "chartModelExtension");
        Intrinsics.checkNotNullParameter(aboutModelExtension, "aboutModelExtension");
        Intrinsics.checkNotNullParameter(currenciesInsideModelExtension, "currenciesInsideModelExtension");
        Intrinsics.checkNotNullParameter(cryptoFcaDisclaimerWidget, "cryptoFcaDisclaimerWidget");
        this.o = actionsModelExtension;
        this.f110055p = chartModelExtension;
        this.f110056q = aboutModelExtension;
        this.f110057r = currenciesInsideModelExtension;
        this.f110058s = cryptoFcaDisclaimerWidget;
        this.f110059t = mra.d.b(this, new e(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, this.o.e3(), null, new h(this, null, 0), 3);
        fy5.c cVar = this.f110055p;
        l.b1(this, mo3.a.g(cVar.f3(), null, new r1(27), 1), null, new h(this, null, 1), 3);
        l.b1(this, cVar.e3(), null, new h(this, null, 2), 3);
        l.b1(this, this.f110056q.Z2(), null, new h(this, null, 3), 3);
        l.b1(this, this.f110057r.Z2(), null, new h(this, null, 4), 3);
        n2(new k(this, null, 7), new whi.b(6));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f110059t;
    }
}
