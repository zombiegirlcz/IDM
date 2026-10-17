package nwl;

import android.content.Intent;
import az0.r1;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.feature.onboarding.api.onboarding.OnboardingLanguageChangePromptDestination;
import com.revolut.feature.retail.legacy.login.api.LegacyLoginFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.api.userauth.navigation.UserAuthFeatureConfig;
import com.revolut.ui.login.pin.LoginActivity;
import com.revolut.ui.login.pin.LoginScreenContract$Configuration;
import cu8.u0;
import cul.n0;
import efm.d0;
import fwj.p;
import grl.m5;
import ie.b0;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import no.k1;
import no.m1;
import org.jetbrains.annotations.NotNull;
import pfm.t;
import pfm.z;
import skm.e0;
import skm.p0;
import sri.m;
import te0.w;
import yhm.m;
import yhm.n;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes13.dex */
public final class l extends pri.b {

    @NotNull
    private static final h Companion = new h();
    public final lwl.f A;
    public final lwl.f B;
    public final w51.a C;
    public final ihm.d D;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final lwl.f f220024h;
    public final lwl.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final lwl.f f220025j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final lwl.f f220026l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m f220027m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final tpi.j f220028n;
    public final lwl.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final lwl.f f220029p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final lwl.f f220030q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final lwl.f f220031r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final lwl.f f220032s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final lwl.f f220033t;
    public final cn0.e u;
    public final LoginScreenContract$Configuration v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final em0.b f220034w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final mwl.e f220035x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Intent f220036y;
    public final CoroutineScope z;

    public l(lwl.f userInteractor, lwl.f checkLocaleInteractor, lwl.f logoutController, String str, lwl.f intentEventsTracker, m navigator, tpi.j progressView, lwl.f contactsRepository, lwl.f peerToPeerFeatureConfigProvider, lwl.f userOnboardingInteractor, lwl.f revolutJobInteractor, lwl.f configurationInteractor, lwl.f revolutSsoOnClientLaunchedPresenterDelegate, cn0.e primaryAuthCredentialsTypeProvider, LoginScreenContract$Configuration loginScreenContract$Configuration, em0.b deviceIdHelper, mwl.e preLoginDataPrefetcher, Intent intent, CoroutineScope coroutineScope, lwl.f pushMessageHandler, lwl.f firebaseExperimentsRepositoryProvider, w51.a appEntryPointInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(checkLocaleInteractor, "checkLocaleInteractor");
        Intrinsics.checkNotNullParameter(logoutController, "logoutController");
        Intrinsics.checkNotNullParameter(intentEventsTracker, "intentEventsTracker");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        Intrinsics.checkNotNullParameter(contactsRepository, "contactsRepository");
        Intrinsics.checkNotNullParameter(peerToPeerFeatureConfigProvider, "peerToPeerFeatureConfigProvider");
        Intrinsics.checkNotNullParameter(userOnboardingInteractor, "userOnboardingInteractor");
        Intrinsics.checkNotNullParameter(revolutJobInteractor, "revolutJobInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(revolutSsoOnClientLaunchedPresenterDelegate, "revolutSsoOnClientLaunchedPresenterDelegate");
        Intrinsics.checkNotNullParameter(primaryAuthCredentialsTypeProvider, "primaryAuthCredentialsTypeProvider");
        Intrinsics.checkNotNullParameter(deviceIdHelper, "deviceIdHelper");
        Intrinsics.checkNotNullParameter(preLoginDataPrefetcher, "preLoginDataPrefetcher");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(pushMessageHandler, "pushMessageHandler");
        Intrinsics.checkNotNullParameter(firebaseExperimentsRepositoryProvider, "firebaseExperimentsRepositoryProvider");
        Intrinsics.checkNotNullParameter(appEntryPointInteractor, "appEntryPointInteractor");
        this.f220024h = userInteractor;
        this.i = checkLocaleInteractor;
        this.f220025j = logoutController;
        this.k = str;
        this.f220026l = intentEventsTracker;
        this.f220027m = navigator;
        this.f220028n = progressView;
        this.o = contactsRepository;
        this.f220029p = peerToPeerFeatureConfigProvider;
        this.f220030q = userOnboardingInteractor;
        this.f220031r = revolutJobInteractor;
        this.f220032s = configurationInteractor;
        this.f220033t = revolutSsoOnClientLaunchedPresenterDelegate;
        this.u = primaryAuthCredentialsTypeProvider;
        this.v = loginScreenContract$Configuration;
        this.f220034w = deviceIdHelper;
        this.f220035x = preLoginDataPrefetcher;
        this.f220036y = intent;
        this.z = coroutineScope;
        this.A = pushMessageHandler;
        this.B = firebaseExperimentsRepositoryProvider;
        this.C = appEntryPointInteractor;
        ihm.d dVarF = ihm.d.F();
        Intrinsics.checkNotNullExpressionValue(dVarF, "create(...)");
        this.D = dVarF;
    }

    @Override // pri.b, pri.e
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final void h(owl.a view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        lte.c cVar = (lte.c) this.B.get();
        cVar.getClass();
        Continuation continuation = null;
        pfm.c cVar2 = new pfm.c(ue0.e.v(w.g0(pd.b.n(p0.f264003c, new r1(cVar, continuation, 8)))));
        Intrinsics.checkNotNullExpressionValue(cVar2, "cache(...)");
        pfm.a aVarV = ue0.e.v(cVar2);
        int i = 0;
        a aVar = new a(this, i);
        Function1 function1K = K();
        int i2 = 2;
        pfm.a aVar2 = new pfm.a(aVarV, new gn.b(6, new ne0.e(new BreadcrumbException(), 11)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new bo.e(7, function1K), new c86.f(8, aVar));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        w.j0(bVar, hVarW);
        Intent intent = this.f220036y;
        try {
            io.c.Companion.getClass();
            io.a.a("fastTrackStarted");
            this.f220035x.c(true);
            if (!((Boolean) w.k(S(intent))).booleanValue() && !R() && !((Boolean) w.k(Q())).booleanValue()) {
                P(intent);
                e0.C(this.z, elm.f.f127540b, null, new r1(this, continuation, 12), 2);
                io.a.a("fastTrackSucceeded");
                return;
            }
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
        }
        pfm.a aVarE = mo3.a.u(o70.a.g(ue0.e.v(pd.b.n(p0.f264003c, new k(this, continuation, i)))), this.f220028n, true).e(new pfm.h(new lm.a(this, i2), 2));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        Function1 function1K2 = K();
        pfm.a aVar3 = new pfm.a(aVarE, new gn.b(6, new bo.c(new BreadcrumbException(), 23)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new bo.e(7, function1K2), new c86.f(8, j.f220022a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar, hVarW2);
    }

    public final void O(Intent intent, boolean z, boolean z3) {
        Object objA;
        ((m1) ((k1) this.f220026l.get())).a(intent, m5.incoming);
        int i = 12;
        int i2 = 0;
        int i3 = 1;
        Continuation continuation = null;
        if (z50.c.a(intent) && z) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            String stringExtra = intent.getStringExtra("ticketId");
            Intrinsics.checkNotNullParameter(intent, "intent");
            String stringExtra2 = intent.getStringExtra("feedId");
            Intrinsics.checkNotNullParameter(intent, "intent");
            String stringExtra3 = intent.getStringExtra("feedType");
            owl.a aVar = (owl.a) L();
            if (aVar != null) {
                LoginActivity loginActivity = (LoginActivity) aVar;
                if (loginActivity.f107075v0 == null) {
                    loginActivity.f107075v0 = ((r41.a) loginActivity.f107076w0).A();
                }
                cwl.g gVar = (cwl.g) loginActivity.f107075v0;
                gVar.getClass();
                try {
                    m.Companion companion = yhm.m.INSTANCE;
                    objA = UUID.fromString(stringExtra);
                } catch (Throwable th10) {
                    m.Companion companion2 = yhm.m.INSTANCE;
                    objA = o.a(th10);
                }
                if (objA instanceof n) {
                    objA = null;
                }
                ufm.i iVar = new ufm.i(com.revolut.retail.feature.api.userauth.navigation.a.a(gVar.f109865a, false, null, 5), new u0(13, new n0(lf3.b.a(stringExtra2, stringExtra3, (UUID) objA), 17)), 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                pfm.h hVar = new pfm.h(new ufm.f(o70.a.i(iVar), new u0(i, new cwl.a(gVar, 1)), 3), 4);
                Intrinsics.checkNotNullExpressionValue(hVar, "ignoreElement(...)");
                loginActivity.f107074t0.a(w.t0(hVar));
                return;
            }
            return;
        }
        sri.m mVar = this.f220027m;
        if (z) {
            this.C.a(this.k);
            if (R()) {
                mVar.c(new FeatureCommand(new UserAuthFeatureConfig.Main((String) null, (UserAuthFeatureConfig.Main.SSODeeplinkData) null, true, (UserAuthFeatureConfig.UseCase) new UserAuthFeatureConfig.UseCase.SignIn(0), 7)));
                return;
            }
            owl.a aVar2 = (owl.a) L();
            if (aVar2 != null) {
                LoginActivity loginActivity2 = (LoginActivity) aVar2;
                if (loginActivity2.f107075v0 == null) {
                    loginActivity2.f107075v0 = ((r41.a) loginActivity2.f107076w0).A();
                }
                loginActivity2.f107074t0.a(w.t0(((cwl.g) loginActivity2.f107075v0).b(true)));
                return;
            }
            return;
        }
        String stringExtra4 = this.f220036y.getStringExtra("EXTRA_NOTIFICATION_TAG");
        if (stringExtra4 != null) {
            ((b90.a) this.A.get()).a(stringExtra4);
        }
        if (z3) {
            mVar.c(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new OnboardingLanguageChangePromptDestination(0), false, (Integer) null, 335577088, 41)));
            return;
        }
        if (!R()) {
            P(intent);
            return;
        }
        p0 p0Var = p0.f264001a;
        ufm.n nVarI = o70.a.i(w.o0(elm.f.f127540b, new k(this, continuation, i3)));
        e eVar = new e(this, i3);
        Function1 function1K = K();
        ufm.i iVar2 = new ufm.i(nVarI, new gn.b(6, new ne0.e(new BreadcrumbException(), i)), 2);
        Intrinsics.checkNotNullExpressionValue(iVar2, "onErrorResumeNext(...)");
        ofm.i iVar3 = new ofm.i(new bo.e(7, eVar), new bo.e(7, function1K), i2);
        iVar2.q(iVar3);
        Intrinsics.checkNotNullExpressionValue(iVar3, "subscribe(...)");
        w.j0(this.f239031a, iVar3);
    }

    public final void P(Intent intent) {
        sab.b bVar;
        LoginScreenContract$Configuration loginScreenContract$Configuration = this.v;
        if (loginScreenContract$Configuration == null || (bVar = loginScreenContract$Configuration.f107077a) == null) {
            bVar = sab.b.NONE;
        }
        String str = loginScreenContract$Configuration != null ? loginScreenContract$Configuration.f107078b : null;
        boolean z = loginScreenContract$Configuration != null ? loginScreenContract$Configuration.f107079c : true;
        boolean z3 = loginScreenContract$Configuration != null ? loginScreenContract$Configuration.e : false;
        this.f220027m.c(new FeatureCommand(new LegacyLoginFeatureConfig.Login(bVar, str, z, this.k, z3, loginScreenContract$Configuration != null ? loginScreenContract$Configuration.f : null, loginScreenContract$Configuration != null ? loginScreenContract$Configuration.f107080g : null, intent.getParcelableExtra("WALLPAPER_MODEL_EXTRAS_KEY"))));
    }

    public final d0 Q() {
        mwl.e eVar = this.f220035x;
        Boolean bool = eVar.k;
        Object obj2 = null;
        if (eVar.f209552l) {
            bool = null;
        }
        if (bool != null) {
            ufm.b bVarM = d0.m(bool);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        z zVar = new z(new ufm.i(((ang.f) ((ylg.b) this.f220024h.get())).d.c().o(), new b0(new e(this, 3), 28), 1), 1, new a5.a(29), obj2);
        Intrinsics.checkNotNullExpressionValue(zVar, "onErrorReturn(...)");
        return zVar;
    }

    public final boolean R() {
        mwl.e eVar = this.f220035x;
        Boolean bool = eVar.f209551j;
        if (eVar.f209552l) {
            bool = null;
        }
        return bool != null ? bool.booleanValue() : ((kll.c) ((wil.a) this.f220033t.get())).i.d() != null;
    }

    public final d0 S(Intent intent) {
        LoginScreenContract$Configuration loginScreenContract$Configuration;
        d0 d0VarB;
        if (intent.hasExtra("argSignMode") || !((loginScreenContract$Configuration = this.v) == null || loginScreenContract$Configuration.f107077a == sab.b.NONE)) {
            ufm.b bVarM = d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        mwl.e eVar = this.f220035x;
        m0j.a aVar = eVar.i;
        if (eVar.f209552l) {
            aVar = null;
        }
        if (aVar != null) {
            d0VarB = d0.m(aVar);
            Intrinsics.checkNotNullExpressionValue(d0VarB, "just(...)");
        } else {
            d0VarB = ((p) this.f220030q.get()).b();
        }
        ufm.i iVar = new ufm.i(d0VarB, new b0(new jli.f(24), 27), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public final void T() {
        efm.b bVarP = efm.b.p(this.D, ((ik3.c) ((fk3.a) this.f220032s.get())).q());
        Intrinsics.checkNotNullExpressionValue(bVarP, "mergeArray(...)");
        t tVarM = o70.a.g(bVarP).m(new b0(new e(this, 2), 26));
        Intrinsics.checkNotNullExpressionValue(tVarM, "doOnError(...)");
        a aVar = new a(this, 1);
        Function1 function1K = K();
        pfm.a aVar2 = new pfm.a(tVarM, new gn.b(6, new bo.c(new BreadcrumbException(), 25)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new bo.e(7, function1K), new c86.f(8, aVar));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(this.f239031a, hVarW);
    }

    @Override // pri.b, pri.e
    public final void l() {
        super.l();
        this.f220035x.f209552l = true;
    }
}
