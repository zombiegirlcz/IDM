package eol;

import akl.r;
import akl.z;
import bjl.p0;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okl.n1;
import org.jetbrains.annotations.NotNull;
import rp0.g1;

/* JADX INFO: loaded from: classes12.dex */
public final class l extends oki.h implements d {

    @NotNull
    public static final h Companion = new h();
    public final n1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final akl.l f128003p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z f128004q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final col.c f128005r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final uil.a f128006s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p0 f128007t;
    public final xjl.i u;
    public final g1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f128008w;

    public l(n1 authenticationInteractor, akl.l claimsRepository, z configurationRepository, col.c passkeysControllerModelExtension, uil.a revolutAccountsManager, p0 revolutSsoDependenciesProvider, xjl.i revolutSsoFlowConfigurationInteractor, g1 shotDialogDisplayer, n stateMapper) {
        Intrinsics.checkNotNullParameter(authenticationInteractor, "authenticationInteractor");
        Intrinsics.checkNotNullParameter(claimsRepository, "claimsRepository");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(passkeysControllerModelExtension, "passkeysControllerModelExtension");
        Intrinsics.checkNotNullParameter(revolutAccountsManager, "revolutAccountsManager");
        Intrinsics.checkNotNullParameter(revolutSsoDependenciesProvider, "revolutSsoDependenciesProvider");
        Intrinsics.checkNotNullParameter(revolutSsoFlowConfigurationInteractor, "revolutSsoFlowConfigurationInteractor");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = authenticationInteractor;
        this.f128003p = claimsRepository;
        this.f128004q = configurationRepository;
        this.f128005r = passkeysControllerModelExtension;
        this.f128006s = revolutAccountsManager;
        this.f128007t = revolutSsoDependenciesProvider;
        this.u = revolutSsoFlowConfigurationInteractor;
        this.v = shotDialogDisplayer;
        this.f128008w = mra.d.b(this, new c(new Data(null, null, false, 7, null), false), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, this.f128004q.e.c(Unit.f186387a, false), null, null, new enb.f(this, null, 6), 3);
        String clientId = ((rqk.k) this.f128007t).f256593p;
        gkl.n name = gkl.n.WEBAUTHN;
        r rVar = (r) this.f128003p;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(name, "name");
        yji.l.a1(this, nim.a.v(rVar.e.b(new akl.m(clientId, name), w4l.i.f294643c), new elb.a(27)), null, null, new k(this, null), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f128008w;
    }
}
