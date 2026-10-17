package eql;

import akl.v1;
import akl.w1;
import bjl.p0;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.sso.api.R$string;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class c0 extends cki.a implements hjl.e {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final jol.b f128491m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final mp.p f128492n;
    public final akl.k o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final akl.l f128493p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final akl.z f128494q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final fkg.a f128495r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ph0.f f128496s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final gql.a f128497t;
    public final p0 u;
    public final xjl.i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final w1 f128498w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final iy8.b f128499x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final hjl.d f128500y;

    public c0(akl.k challengesRepository, akl.l claimsRepository, akl.z configurationRepository, w1 socialAccountRepository, p0 revolutSsoDependenciesProvider, fkg.a dapIntentHandler, gql.a googleMobileServicesAvailabilityManager, iy8.b uaePassAppAvailabilityChecker, jol.b authenticationFlowDialogsFactory, mp.p bankIdIntentHandler, ph0.f googleAuthenticationClient, xjl.i revolutSsoFlowConfigurationInteractor) {
        Intrinsics.checkNotNullParameter(authenticationFlowDialogsFactory, "authenticationFlowDialogsFactory");
        Intrinsics.checkNotNullParameter(bankIdIntentHandler, "bankIdIntentHandler");
        Intrinsics.checkNotNullParameter(challengesRepository, "challengesRepository");
        Intrinsics.checkNotNullParameter(claimsRepository, "claimsRepository");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(dapIntentHandler, "dapIntentHandler");
        Intrinsics.checkNotNullParameter(googleAuthenticationClient, "googleAuthenticationClient");
        Intrinsics.checkNotNullParameter(googleMobileServicesAvailabilityManager, "googleMobileServicesAvailabilityManager");
        Intrinsics.checkNotNullParameter(revolutSsoDependenciesProvider, "revolutSsoDependenciesProvider");
        Intrinsics.checkNotNullParameter(revolutSsoFlowConfigurationInteractor, "revolutSsoFlowConfigurationInteractor");
        Intrinsics.checkNotNullParameter(socialAccountRepository, "socialAccountRepository");
        Intrinsics.checkNotNullParameter(uaePassAppAvailabilityChecker, "uaePassAppAvailabilityChecker");
        this.f128491m = authenticationFlowDialogsFactory;
        this.f128492n = bankIdIntentHandler;
        this.o = challengesRepository;
        this.f128493p = claimsRepository;
        this.f128494q = configurationRepository;
        this.f128495r = dapIntentHandler;
        this.f128496s = googleAuthenticationClient;
        this.f128497t = googleMobileServicesAvailabilityManager;
        this.u = revolutSsoDependenciesProvider;
        this.v = revolutSsoFlowConfigurationInteractor;
        this.f128498w = socialAccountRepository;
        this.f128499x = uaePassAppAvailabilityChecker;
        this.f128500y = new hjl.d(new Data(null, null, true, 3, null));
    }

    public static final void e3(c0 c0Var) {
        if (!c0Var.f128492n.n()) {
            yji.n.j2(c0Var, c0Var.L2(new y0("BANKID_NOT_FOUND", new nii.z(new TextLocalisedClause(R$string.revolut_sso_bankid_linking_not_found_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_bankid_linking_not_found_subtitle, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 4)), null, null, 7);
        } else {
            c0Var.T2(new y(c0Var, null), new l(c0Var, 0));
        }
    }

    public static final void f3(c0 c0Var) {
        if (!c0Var.f128495r.s()) {
            yji.n.j2(c0Var, c0Var.L2(new y0("DAP_NOT_FOUND", new nii.z(new TextLocalisedClause(R$string.revolut_sso_dap_linking_not_found_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_dap_linking_not_found_subtitle, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 4)), null, null, 7);
        } else {
            c0Var.T2(new z(c0Var, null), new l(c0Var, 4));
        }
    }

    public static final void g3(c0 c0Var) {
        if (!c0Var.f128499x.a()) {
            yji.n.j2(c0Var, c0Var.L2(new y0("UAE_PASS_NOT_FOUND", new nii.z(new TextLocalisedClause(R$string.revolut_sso_uae_linking_not_found_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_uae_linking_not_found_subtitle, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 4)), null, null, 7);
        } else {
            c0Var.T2(new a0(c0Var, null), new l(c0Var, 5));
        }
    }

    @Override // yji.n
    public final void D2() {
        String clientId = ((rqk.k) this.u).f256593p;
        w1 w1Var = this.f128498w;
        w1Var.getClass();
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Continuation continuation = null;
        yji.n.j2(this, new cqh.m(mo3.a.g(w1Var.f6110c.b(new v1(clientId), w4l.i.f294643c), null, new en6.a(15), 1), this, 29), new d4f.m(2, 12, continuation), new enb.f(this, continuation, 17), 2);
    }

    @Override // cki.a
    public final Object Z2() {
        return this.f128500y;
    }

    public final void h3(boolean z, hjl.c cVar, Function2 function2) {
        T2(new ack.o(this, z, cVar, function2, (Continuation) null), new eq4.c(((hjl.d) b3()).f152831a, this, 10));
    }
}
