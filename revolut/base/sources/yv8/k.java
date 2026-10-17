package yv8;

import cli.y;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends oki.h implements dli.b {
    public final yx8.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x8h.e f317149p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f317150q;

    public k(l stateMapper, yx8.a webKycControllerExtension, x8h.e redirectMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(webKycControllerExtension, "webKycControllerExtension");
        Intrinsics.checkNotNullParameter(redirectMapper, "redirectMapper");
        this.o = webKycControllerExtension;
        this.f317149p = redirectMapper;
        this.f317150q = mra.d.b(this, new d(false), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        x8h.e eVar = this.f317149p;
        yx8.a aVar = this.o;
        yji.l.a1(this, aVar.d3(eVar), null, null, new ys.i(2, this, k.class, "onRedirect", "onRedirect(Ljava/lang/String;)V", 4, 2), 3);
        yji.l.a1(this, aVar.c3(), null, null, new yl6.b(this, null, 12), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f317150q;
    }
}
