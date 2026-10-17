package iy8;

import cli.y;
import com.revolut.feature.kyc.vendors.shared.api.uae_pass.UaePassFlowOutputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends oki.h implements l {

    @NotNull
    public static final n Companion = new n();
    public final yx8.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f169633p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final r f169634q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final xx8.a f169635r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final xx8.e f169636s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final wx8.b f169637t;
    public final y u;
    public Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j2 f169638w;

    public o(p stateMapper, yx8.a webKycControllerExtension, d redirectMapper, r urlHandler, xx8.a destinationProvider, xx8.e packageChecker, wx8.b redirectionRelay) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(webKycControllerExtension, "webKycControllerExtension");
        Intrinsics.checkNotNullParameter(redirectMapper, "redirectMapper");
        Intrinsics.checkNotNullParameter(urlHandler, "urlHandler");
        Intrinsics.checkNotNullParameter(destinationProvider, "destinationProvider");
        Intrinsics.checkNotNullParameter(packageChecker, "packageChecker");
        Intrinsics.checkNotNullParameter(redirectionRelay, "redirectionRelay");
        this.o = webKycControllerExtension;
        this.f169633p = redirectMapper;
        this.f169634q = urlHandler;
        this.f169635r = destinationProvider;
        this.f169636s = packageChecker;
        this.f169637t = redirectionRelay;
        this.u = mra.d.b(this, new k(false, false), stateMapper, null, false, 12);
        this.v = h0.f322473a;
        this.f169638w = vkm.q.c(null);
    }

    @Override // yji.l
    public final void I1() throws Throwable {
        yji.l.a1(this, this.o.d3(this.f169633p), null, null, new hp4.e(2, this, o.class, "onRedirect", "onRedirect(Lcom/revolut/feature/kyc/vendors/shared/impl/uaepass/UaePassRedirectResult;)V", 4, 25), 3);
        wx8.b bVar = this.f169637t;
        bVar.f300787a = true;
        bVar.f300788b.i();
        yji.l.a1(this, bVar.f300789c, null, null, new iug.j(this, (Continuation) null, 10), 3);
    }

    public final void I2(UaePassFlowOutputData uaePassFlowOutputData) {
        y yVar = this.u;
        if (((k) ((j2) yVar.f22677a).getValue()).f169631b) {
            return;
        }
        H2(yVar, new iwk.b(11));
        C2(uaePassFlowOutputData);
    }

    @Override // yji.l
    public final void O1() throws Throwable {
        wx8.b bVar = this.f169637t;
        bVar.f300787a = false;
        bVar.f300788b.i();
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
