package fg8;

import com.revolut.core.ui_kit.views.slider_layout.SliderLayout;
import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements cg8.b {
    public final q78.e A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f134948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ao.h f134949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zq.a f134950c;
    public final hj8.a d;
    public final te8.e e;
    public final hp8.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final xcd.a f134951g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wsg.n f134952h;
    public final ic8.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final sri.m f134953j;
    public final t0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g0 f134954l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c0 f134955m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l0 f134956n;
    public final r o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m0 f134957p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final zjh.f f134958q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final q f134959r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final mp.p f134960s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final an8.b f134961t;
    public final te8.r u;
    public final te8.v v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final kbb.c f134962w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final v f134963x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final qka.c f134964y;
    public final jla.h z;

    public m(d juniorAccountActivationDeeplinkHandler, ao.h juniorCoparentInteractor, zq.a juniorCoparentLauncherFactory, hj8.a juniorProfileInteractor, te8.e juniorAccountInteractor, hp8.b juniorTasksInteractor, xcd.a savingsRequestInteractor, wsg.n walletsInteractor, ic8.a juniorCardCommandsFactory, sri.m navigator, t0 juniorReferralPromptDeeplinkHandler, g0 juniorConsentsPromptDeeplinkHandler, c0 juniorConsentRequestDeeplinkHandler, l0 juniorGraduationDeeplinkHandler, r juniorAppLinkShareDeeplinkHandler, m0 juniorInviteCreationDeeplinkHandler, zjh.f juniorConsentDeeplinkHandler, q juniorAllowanceDeeplinkHandler, mp.p juniorPerksDeeplinkHandler, an8.b juniorSavingProductInteractor, te8.r juniorCoreSavingsProductInteractor, te8.v juniorPocketsProductInteractor, h0 juniorDeeplinkAvailabilityErrorConfigurationProvider, kbb.c juniorConfigInteractor, v juniorCardRequestDeeplinkHandler, qka.c productArticleNavigationProvider, jla.h productCatalogueInteractor, q78.e juniorAccountDestinationResolver) {
        Intrinsics.checkNotNullParameter(juniorAccountActivationDeeplinkHandler, "juniorAccountActivationDeeplinkHandler");
        Intrinsics.checkNotNullParameter(juniorCoparentInteractor, "juniorCoparentInteractor");
        Intrinsics.checkNotNullParameter(juniorCoparentLauncherFactory, "juniorCoparentLauncherFactory");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(juniorAccountInteractor, "juniorAccountInteractor");
        Intrinsics.checkNotNullParameter(juniorTasksInteractor, "juniorTasksInteractor");
        Intrinsics.checkNotNullParameter(savingsRequestInteractor, "savingsRequestInteractor");
        Intrinsics.checkNotNullParameter(walletsInteractor, "walletsInteractor");
        Intrinsics.checkNotNullParameter(juniorCardCommandsFactory, "juniorCardCommandsFactory");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(juniorReferralPromptDeeplinkHandler, "juniorReferralPromptDeeplinkHandler");
        Intrinsics.checkNotNullParameter(juniorConsentsPromptDeeplinkHandler, "juniorConsentsPromptDeeplinkHandler");
        Intrinsics.checkNotNullParameter(juniorConsentRequestDeeplinkHandler, "juniorConsentRequestDeeplinkHandler");
        Intrinsics.checkNotNullParameter(juniorGraduationDeeplinkHandler, "juniorGraduationDeeplinkHandler");
        Intrinsics.checkNotNullParameter(juniorAppLinkShareDeeplinkHandler, "juniorAppLinkShareDeeplinkHandler");
        Intrinsics.checkNotNullParameter(juniorInviteCreationDeeplinkHandler, "juniorInviteCreationDeeplinkHandler");
        Intrinsics.checkNotNullParameter(juniorConsentDeeplinkHandler, "juniorConsentDeeplinkHandler");
        Intrinsics.checkNotNullParameter(juniorAllowanceDeeplinkHandler, "juniorAllowanceDeeplinkHandler");
        Intrinsics.checkNotNullParameter(juniorPerksDeeplinkHandler, "juniorPerksDeeplinkHandler");
        Intrinsics.checkNotNullParameter(juniorSavingProductInteractor, "juniorSavingProductInteractor");
        Intrinsics.checkNotNullParameter(juniorCoreSavingsProductInteractor, "juniorCoreSavingsProductInteractor");
        Intrinsics.checkNotNullParameter(juniorPocketsProductInteractor, "juniorPocketsProductInteractor");
        Intrinsics.checkNotNullParameter(juniorDeeplinkAvailabilityErrorConfigurationProvider, "juniorDeeplinkAvailabilityErrorConfigurationProvider");
        Intrinsics.checkNotNullParameter(juniorConfigInteractor, "juniorConfigInteractor");
        Intrinsics.checkNotNullParameter(juniorCardRequestDeeplinkHandler, "juniorCardRequestDeeplinkHandler");
        Intrinsics.checkNotNullParameter(productArticleNavigationProvider, "productArticleNavigationProvider");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(juniorAccountDestinationResolver, "juniorAccountDestinationResolver");
        this.f134948a = juniorAccountActivationDeeplinkHandler;
        this.f134949b = juniorCoparentInteractor;
        this.f134950c = juniorCoparentLauncherFactory;
        this.d = juniorProfileInteractor;
        this.e = juniorAccountInteractor;
        this.f = juniorTasksInteractor;
        this.f134951g = savingsRequestInteractor;
        this.f134952h = walletsInteractor;
        this.i = juniorCardCommandsFactory;
        this.f134953j = navigator;
        this.k = juniorReferralPromptDeeplinkHandler;
        this.f134954l = juniorConsentsPromptDeeplinkHandler;
        this.f134955m = juniorConsentRequestDeeplinkHandler;
        this.f134956n = juniorGraduationDeeplinkHandler;
        this.o = juniorAppLinkShareDeeplinkHandler;
        this.f134957p = juniorInviteCreationDeeplinkHandler;
        this.f134958q = juniorConsentDeeplinkHandler;
        this.f134959r = juniorAllowanceDeeplinkHandler;
        this.f134960s = juniorPerksDeeplinkHandler;
        this.f134961t = juniorSavingProductInteractor;
        this.u = juniorCoreSavingsProductInteractor;
        this.v = juniorPocketsProductInteractor;
        this.f134962w = juniorConfigInteractor;
        this.f134963x = juniorCardRequestDeeplinkHandler;
        this.f134964y = productArticleNavigationProvider;
        this.z = productCatalogueInteractor;
        this.A = juniorAccountDestinationResolver;
    }

    public static pfm.n j(jf0.c cVar) {
        Regex regex = d0m.b.f110450a;
        pfm.n nVarN = efm.b.n(new UnsupportedOperationException(p.a.p("Junior deeplink ", d0m.b.a(cVar.f173627a), " is not supported")));
        Intrinsics.checkNotNullExpressionValue(nVarN, "error(...)");
        return nVarN;
    }

    public static pfm.a l(efm.r rVar) {
        efm.b bVarIgnoreElements = mo3.a.n(rVar).ignoreElements();
        Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
        return ue0.e.v(bVarIgnoreElements);
    }

    public static NaviCommand m(NaviCommand naviCommand, boolean z) {
        if (z) {
            return new MainContainerScreenDestination.JustShow(ibb.c.f160140a.f83420a, (SliderLayout.SlidingSpec) null, naviCommand != null ? new TabAccountsInitialPayload.Action(naviCommand) : null, 10).e;
        }
        return naviCommand;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return wp5.y.D(cVar, "deeplink", 1, "youth");
    }

    public final ufm.i b(String str) {
        sfm.b bVarG = pd.b.n(skm.p0.f264003c, new i(this, null, 0)).g(rd0.e.c(hj8.a.a(this.d, str, w4l.j.f294644c), kotlin.coroutines.g.f186406a));
        Intrinsics.checkNotNullExpressionValue(bVarG, "andThen(...)");
        efm.d0 d0VarFirstOrError = m70.a.e(bVarG, new fb.c(this, str, 2), new fci.e0(21)).firstOrError();
        ffk.l lVar = new ffk.l(18, new g(0));
        d0VarFirstOrError.getClass();
        ufm.i iVar = new ufm.i(d0VarFirstOrError, lVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public final efm.d0 c() {
        sfm.b bVarG = pd.b.n(skm.p0.f264003c, new i(this, null, 1)).g(this.f134962w.L());
        Intrinsics.checkNotNullExpressionValue(bVarG, "andThen(...)");
        efm.d0 d0VarFirstOrError = ue0.e.E(m70.a.g(bVarG, null, new fci.e0(20), 1), new lf8.c(false)).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }

    public final pfm.h d(StatusViewConfiguration.Error error, boolean z) {
        return h(m(com.revolut.retail.operation_status.modal_screen.a.a(h3l.g.Companion, error, null, null, null, null, 510), z));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r9, kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fg8.m.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c cVar, boolean z) {
        Object objFirstOrError;
        if (wp5.y.D(cVar, "deeplink", 2, "graduation")) {
            objFirstOrError = efm.d0.m(Boolean.TRUE);
        } else {
            efm.r map = rd0.e.c(bla.b.b(this.z, "YOUTH"), kotlin.coroutines.g.f186406a).map(new ffk.l(17, new fe9.f(29)));
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            objFirstOrError = ue0.e.E(map, Boolean.FALSE).firstOrError();
            Intrinsics.h(objFirstOrError);
        }
        pfm.z zVarD = new pfm.a(objFirstOrError, new ffk.l(8, new e(this, cVar, z, 0)), 4).D(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
        return zVarD;
    }

    public final void g(NaviCommand naviCommand) {
        this.f134953j.c(naviCommand);
    }

    public final pfm.h h(NaviCommand naviCommand) {
        pfm.h hVar = new pfm.h(new f0d.m(this, naviCommand, 10), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }

    public final pfm.h i(String str) {
        return pd.b.n(skm.p0.f264003c, new etj.l(this, str, (Continuation) null, 17));
    }

    public final pfm.a k(pfm.a aVar, String str) {
        return ue0.e.A(aVar, new f(this, str, 7));
    }
}
