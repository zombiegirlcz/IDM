package fwj;

import com.revolut.data.network.models.privacy_settings.NotificationSettingDto;
import com.revolut.data.network.models.privacy_settings.PrivacySettingsDto;
import do3.s;
import efm.d0;
import efm.r;
import et6.q1;
import ft3.h0;
import g2e.t;
import java.lang.reflect.Type;
import java.util.Set;
import java.util.concurrent.Callable;
import k7c.m0;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import le.u1;
import pjl.b1;
import te0.w;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class p {
    public final ih0.b A;
    public final gte.a B;
    public final g41.b C;
    public final t D;
    public final twj.i E;
    public final Lazy F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0j.a f138685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ang.f f138686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fk3.a f138687c;
    public final kza.a d;
    public final fpj.e e;
    public final fn2.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ang.c f138688g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wsg.n f138689h;
    public final zm0.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final loi.b f138690j;
    public final i1b.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final wl0.c f138691l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final jte.c f138692m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final zm0.c f138693n;
    public final cn0.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final cn0.e f138694p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b31.a f138695q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final zd0.b f138696r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b1 f138697s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final mk0.p f138698t;
    public final ekg.g u;
    public final d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final loi.a f138699w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final m0 f138700x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final q1 f138701y;
    public final toa.a z;

    public p(t0j.a userAuthRepository, ang.f userInteractor, fk3.a configurationInteractor, kza.a remoteStoriesInteractor, fpj.e featuresRepository, fn2.c productCatalogueLoader, ang.c userCompanyLoader, wsg.n walletInteractor, zm0.b sessionController, loi.b appAnalyticsTracker, i1b.e appsFlyerAnalyticsInteractor, wl0.c biometricHelper, jte.c experimentsInteractor, zm0.c sessionProvider, cn0.c passcodeMetadataProvider, cn0.e primaryAuthCredentialsTypeProvider, b31.a privacySettingsRepository, zd0.b currencyInfoInitializer, b1 accountsInteractor, mk0.p personalisationStorageLoader, ekg.g uiPersonalisationInteractor, d userAuthAnalyticsInteractor, loi.a analyticsInteractor, m0 revolutPayJoinCampaignRepository, q1 freelancerJoinCampaignInteractor, toa.a notificationSettingsInteractor, ih0.b remoteConfig, gte.a featureToggleInteractor, g41.b dexProtectorAnalytics, t signinInteractor, twj.i userOnboardedStateHolder) {
        Intrinsics.checkNotNullParameter(userAuthRepository, "userAuthRepository");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(remoteStoriesInteractor, "remoteStoriesInteractor");
        Intrinsics.checkNotNullParameter(featuresRepository, "featuresRepository");
        Intrinsics.checkNotNullParameter(productCatalogueLoader, "productCatalogueLoader");
        Intrinsics.checkNotNullParameter(userCompanyLoader, "userCompanyLoader");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(sessionController, "sessionController");
        Intrinsics.checkNotNullParameter(appAnalyticsTracker, "appAnalyticsTracker");
        Intrinsics.checkNotNullParameter(appsFlyerAnalyticsInteractor, "appsFlyerAnalyticsInteractor");
        Intrinsics.checkNotNullParameter(biometricHelper, "biometricHelper");
        Intrinsics.checkNotNullParameter(experimentsInteractor, "experimentsInteractor");
        Intrinsics.checkNotNullParameter(sessionProvider, "sessionProvider");
        Intrinsics.checkNotNullParameter(passcodeMetadataProvider, "passcodeMetadataProvider");
        Intrinsics.checkNotNullParameter(primaryAuthCredentialsTypeProvider, "primaryAuthCredentialsTypeProvider");
        Intrinsics.checkNotNullParameter(privacySettingsRepository, "privacySettingsRepository");
        Intrinsics.checkNotNullParameter(currencyInfoInitializer, "currencyInfoInitializer");
        Intrinsics.checkNotNullParameter(accountsInteractor, "accountsInteractor");
        Intrinsics.checkNotNullParameter(personalisationStorageLoader, "personalisationStorageLoader");
        Intrinsics.checkNotNullParameter(uiPersonalisationInteractor, "uiPersonalisationInteractor");
        Intrinsics.checkNotNullParameter(userAuthAnalyticsInteractor, "userAuthAnalyticsInteractor");
        Intrinsics.checkNotNullParameter(analyticsInteractor, "analyticsInteractor");
        Intrinsics.checkNotNullParameter(revolutPayJoinCampaignRepository, "revolutPayJoinCampaignRepository");
        Intrinsics.checkNotNullParameter(freelancerJoinCampaignInteractor, "freelancerJoinCampaignInteractor");
        Intrinsics.checkNotNullParameter(notificationSettingsInteractor, "notificationSettingsInteractor");
        Intrinsics.checkNotNullParameter(remoteConfig, "remoteConfig");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(dexProtectorAnalytics, "dexProtectorAnalytics");
        Intrinsics.checkNotNullParameter(signinInteractor, "signinInteractor");
        Intrinsics.checkNotNullParameter(userOnboardedStateHolder, "userOnboardedStateHolder");
        this.f138685a = userAuthRepository;
        this.f138686b = userInteractor;
        this.f138687c = configurationInteractor;
        this.d = remoteStoriesInteractor;
        this.e = featuresRepository;
        this.f = productCatalogueLoader;
        this.f138688g = userCompanyLoader;
        this.f138689h = walletInteractor;
        this.i = sessionController;
        this.f138690j = appAnalyticsTracker;
        this.k = appsFlyerAnalyticsInteractor;
        this.f138691l = biometricHelper;
        this.f138692m = experimentsInteractor;
        this.f138693n = sessionProvider;
        this.o = passcodeMetadataProvider;
        this.f138694p = primaryAuthCredentialsTypeProvider;
        this.f138695q = privacySettingsRepository;
        this.f138696r = currencyInfoInitializer;
        this.f138697s = accountsInteractor;
        this.f138698t = personalisationStorageLoader;
        this.u = uiPersonalisationInteractor;
        this.v = userAuthAnalyticsInteractor;
        this.f138699w = analyticsInteractor;
        this.f138700x = revolutPayJoinCampaignRepository;
        this.f138701y = freelancerJoinCampaignInteractor;
        this.z = notificationSettingsInteractor;
        this.A = remoteConfig;
        this.B = featureToggleInteractor;
        this.C = dexProtectorAnalytics;
        this.D = signinInteractor;
        this.E = userOnboardedStateHolder;
        this.F = yhm.j.b(new h0(24));
    }

    public final ufm.n a(String step, String workflowStepId) {
        Intrinsics.checkNotNullParameter(step, "stepName");
        Intrinsics.checkNotNullParameter(workflowStepId, "workflowStepId");
        twj.f fVar = (twj.f) this.f138685a;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(workflowStepId, "workflowStepId");
        ufm.c cVar = new ufm.c(new tif.e(step, 3, fVar, workflowStepId), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return w.i0(cVar);
    }

    public final ufm.i b() {
        d0 d0VarFirstOrError = ((cn0.g) this.f138693n).g().firstOrError();
        h hVar = new h(new fwf.n(2), 1);
        d0VarFirstOrError.getClass();
        ufm.i iVar = new ufm.i(d0VarFirstOrError, hVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0150, code lost:
    
        if (nim.a.a(r12, r0) != r1) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(cdd.c r12, gim.c r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fwj.p.c(cdd.c, gim.c):java.lang.Object");
    }

    public final boolean d(od0.i iVar, od0.i iVar2) {
        Boolean bool = (Boolean) iVar.f224257a;
        return bool != null ? !bool.booleanValue() : zhm.d0.T((Set) this.F.getValue(), iVar2.f224257a);
    }

    public final r e() {
        final twj.i iVar = this.E;
        r rVarW0 = w.w0(iVar.f275046c);
        final int i = 0;
        r rVarDefer = r.defer(new Callable() { // from class: twj.g
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.Map] */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                switch (i) {
                    case 0:
                        ue0.c cVar = iVar.f275044a;
                        Type type = l21.d.e;
                        Intrinsics.checkNotNullExpressionValue(type, "<get-BOOLEAN_TYPE>(...)");
                        Boolean bool = (Boolean) cVar.T2("requires_onboarding", type);
                        od0.i.Companion.getClass();
                        return w.h(od0.h.a(bool));
                    default:
                        String str = (String) iVar.f275044a.T2("user_state", l21.d.d);
                        s sVar = str != null ? (s) u1.u(str, mwj.a.f209484a) : null;
                        od0.i.Companion.getClass();
                        return w.h(od0.h.a(sVar));
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(rVarDefer, "defer(...)");
        r rVarStartWith = rVarW0.startWith((efm.w) w.f0(rVarDefer));
        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
        r rVarW02 = w.w0(iVar.f275045b);
        final int i2 = 1;
        r rVarDefer2 = r.defer(new Callable() { // from class: twj.g
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.Map] */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                switch (i2) {
                    case 0:
                        ue0.c cVar = iVar.f275044a;
                        Type type = l21.d.e;
                        Intrinsics.checkNotNullExpressionValue(type, "<get-BOOLEAN_TYPE>(...)");
                        Boolean bool = (Boolean) cVar.T2("requires_onboarding", type);
                        od0.i.Companion.getClass();
                        return w.h(od0.h.a(bool));
                    default:
                        String str = (String) iVar.f275044a.T2("user_state", l21.d.d);
                        s sVar = str != null ? (s) u1.u(str, mwj.a.f209484a) : null;
                        od0.i.Companion.getClass();
                        return w.h(od0.h.a(sVar));
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(rVarDefer2, "defer(...)");
        r rVarStartWith2 = rVarW02.startWith((efm.w) w.f0(rVarDefer2));
        Intrinsics.checkNotNullExpressionValue(rVarStartWith2, "startWith(...)");
        r rVarDistinctUntilChanged = w.v(rVarStartWith, rVarStartWith2, new fv1.a(this, 6)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return rVarDistinctUntilChanged;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r12, java.lang.String r13, boolean r14, gim.c r15) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r15 instanceof fwj.l
            if (r0 == 0) goto L13
            r0 = r15
            fwj.l r0 = (fwj.l) r0
            int r1 = r0.f138678y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f138678y = r1
            goto L18
        L13:
            fwj.l r0 = new fwj.l
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.f138676w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f138678y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            cdd.c r12 = r0.u
            yhm.o.b(r15)
            return r12
        L2c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L34:
            boolean r14 = r0.v
            yhm.o.b(r15)
            goto L7a
        L3a:
            yhm.o.b(r15)
            r0.v = r14
            r0.f138678y = r4
            com.revolut.feature.shared.signin.api.SigninSharedApi$Toggles$X3SignInMigration r15 = com.revolut.feature.shared.signin.api.SigninSharedApi$Toggles$X3SignInMigration.f86686c
            gte.a r2 = r11.B
            jte.d r2 = (jte.d) r2
            boolean r15 = r2.c(r15)
            if (r15 == 0) goto L5a
            g2e.t r15 = r11.D
            java.lang.Object r15 = r15.f140031b
            edd.d r15 = (edd.d) r15
            java.lang.Object r12 = r15.b(r12, r13, r14, r0)
            r8 = r14
        L58:
            r15 = r12
            goto L76
        L5a:
            t0j.a r15 = r11.f138685a
            r5 = r15
            twj.f r5 = (twj.f) r5
            r5.getClass()
            skm.p0 r15 = skm.p0.f264001a
            elm.f r15 = elm.f.f127540b
            ack.o r4 = new ack.o
            r9 = 0
            r10 = 24
            r6 = r12
            r7 = r13
            r8 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10)
            java.lang.Object r12 = skm.e0.J(r15, r4, r0)
            goto L58
        L76:
            if (r15 != r1) goto L79
            goto L88
        L79:
            r14 = r8
        L7a:
            cdd.c r15 = (cdd.c) r15
            r0.u = r15
            r0.v = r14
            r0.f138678y = r3
            java.lang.Object r12 = r11.c(r15, r0)
            if (r12 != r1) goto L89
        L88:
            return r1
        L89:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: fwj.p.f(java.lang.String, java.lang.String, boolean, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(wi0.b r12, java.lang.String r13, boolean r14, gim.c r15) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r15 instanceof fwj.m
            if (r0 == 0) goto L13
            r0 = r15
            fwj.m r0 = (fwj.m) r0
            int r1 = r0.f138681y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f138681y = r1
            goto L18
        L13:
            fwj.m r0 = new fwj.m
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.f138679w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f138681y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            cdd.c r12 = r0.u
            yhm.o.b(r15)
            return r12
        L2c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L34:
            boolean r14 = r0.v
            yhm.o.b(r15)
            goto L7a
        L3a:
            yhm.o.b(r15)
            r0.v = r14
            r0.f138681y = r4
            com.revolut.feature.shared.signin.api.SigninSharedApi$Toggles$X3SignInMigration r15 = com.revolut.feature.shared.signin.api.SigninSharedApi$Toggles$X3SignInMigration.f86686c
            gte.a r2 = r11.B
            jte.d r2 = (jte.d) r2
            boolean r15 = r2.c(r15)
            if (r15 == 0) goto L5a
            g2e.t r15 = r11.D
            java.lang.Object r15 = r15.f140031b
            edd.d r15 = (edd.d) r15
            java.lang.Object r12 = r15.c(r12, r13, r14, r0)
            r8 = r14
        L58:
            r15 = r12
            goto L76
        L5a:
            t0j.a r15 = r11.f138685a
            r5 = r15
            twj.f r5 = (twj.f) r5
            r5.getClass()
            skm.p0 r15 = skm.p0.f264001a
            elm.f r15 = elm.f.f127540b
            ack.o r4 = new ack.o
            r9 = 0
            r10 = 25
            r6 = r12
            r7 = r13
            r8 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10)
            java.lang.Object r12 = skm.e0.J(r15, r4, r0)
            goto L58
        L76:
            if (r15 != r1) goto L79
            goto L88
        L79:
            r14 = r8
        L7a:
            cdd.c r15 = (cdd.c) r15
            r0.u = r15
            r0.v = r14
            r0.f138681y = r3
            java.lang.Object r12 = r11.c(r15, r0)
            if (r12 != r1) goto L89
        L88:
            return r1
        L89:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: fwj.p.g(wi0.b, java.lang.String, boolean, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
    
        if (((twj.f) r9).c(r11, r0) != r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ad, code lost:
    
        if (((twj.f) r9).c(r11, r0) != r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bd, code lost:
    
        if (((twj.f) r9).c(r11, r0) == r1) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(o0j.c r11, kotlin.coroutines.Continuation r12) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r12 instanceof fwj.n
            if (r0 == 0) goto L13
            r0 = r12
            fwj.n r0 = (fwj.n) r0
            int r1 = r0.f138683x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f138683x = r1
            goto L18
        L13:
            fwj.n r0 = new fwj.n
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f138683x
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            t0j.a r9 = r10.f138685a
            if (r2 == 0) goto L54
            if (r2 == r7) goto L4e
            if (r2 == r6) goto L4a
            if (r2 == r5) goto L44
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            yhm.o.b(r12)
            goto Lc0
        L37:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3f:
            yhm.o.b(r12)
            goto Lb0
        L44:
            o0j.c r11 = r0.u
            yhm.o.b(r12)
            goto La3
        L4a:
            yhm.o.b(r12)
            goto L83
        L4e:
            o0j.c r11 = r0.u
            yhm.o.b(r12)
            goto L76
        L54:
            yhm.o.b(r12)
            boolean r12 = r11 instanceof o0j.c.k
            r2 = 18
            if (r12 == 0) goto L86
            r0.u = r11
            r0.f138683x = r7
            skm.p0 r12 = skm.p0.f264001a
            elm.f r12 = elm.f.f127540b
            fna.f r3 = new fna.f
            r3.<init>(r11, r10, r8, r2)
            java.lang.Object r12 = skm.e0.J(r12, r3, r0)
            if (r12 != r1) goto L71
            goto L73
        L71:
            kotlin.Unit r12 = kotlin.Unit.f186387a
        L73:
            if (r12 != r1) goto L76
            goto Lbf
        L76:
            r0.u = r8
            r0.f138683x = r6
            twj.f r9 = (twj.f) r9
            java.lang.Object r11 = r9.c(r11, r0)
            if (r11 != r1) goto L83
            goto Lbf
        L83:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        L86:
            boolean r12 = r11 instanceof o0j.l
            if (r12 == 0) goto Lb3
            r0.u = r11
            r0.f138683x = r5
            skm.p0 r12 = skm.p0.f264001a
            elm.f r12 = elm.f.f127540b
            fna.f r3 = new fna.f
            r3.<init>(r11, r10, r8, r2)
            java.lang.Object r12 = skm.e0.J(r12, r3, r0)
            if (r12 != r1) goto L9e
            goto La0
        L9e:
            kotlin.Unit r12 = kotlin.Unit.f186387a
        La0:
            if (r12 != r1) goto La3
            goto Lbf
        La3:
            r0.u = r8
            r0.f138683x = r4
            twj.f r9 = (twj.f) r9
            java.lang.Object r11 = r9.c(r11, r0)
            if (r11 != r1) goto Lb0
            goto Lbf
        Lb0:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        Lb3:
            r0.u = r8
            r0.f138683x = r3
            twj.f r9 = (twj.f) r9
            java.lang.Object r11 = r9.c(r11, r0)
            if (r11 != r1) goto Lc0
        Lbf:
            return r1
        Lc0:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: fwj.p.h(o0j.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final pfm.r i(boolean z) {
        return w.g0(this.f138695q.f11983a.updatePrivacySettings(new PrivacySettingsDto(v.k(new NotificationSettingDto(cp5.d.a0(soa.c.MARKETING), z, z), new NotificationSettingDto(cp5.d.a0(soa.c.OFFERS), z, z)), f0.f322471a)));
    }

    public final void j(cdd.a aVar) {
        String str = aVar.f23231a;
        String str2 = aVar.f23232b;
        long j2 = aVar.f23233c;
        ((cn0.g) this.i).l(new mm0.j(o0.f186429a.b(mm0.p.class), str, Long.valueOf(j2), str2, aVar.d));
    }
}
