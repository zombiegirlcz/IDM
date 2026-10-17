package com.revolut.feature.restricted_access;

import a08.p0;
import com.revolut.core.extensions.rx.BreadcrumbException;
import efm.r;
import fjd.g0;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import sri.m;
import te0.w;
import ulm.w0;
import ulm.x0;
import vkm.q;
import vkm.y;
import zhm.y0;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends fsi.c implements qf0.a {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final qf0.c f82035h;
    public final m i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final kz0.b f82036j;
    public final pak.h k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final fkl.h f82037l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final sf0.h f82038m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Optional f82039n;
    public final mli.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final asi.d f82040p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final zm0.c f82041q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Set f82042r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Lazy f82043s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile boolean f82044t;
    public final AtomicBoolean u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(qf0.c exceptionsOverseer, m navigator, kz0.b progressDialogFactory, pak.h restrictedAccessNavigationFactory, fkl.h revolutSsoLogoutEventHandler, sf0.h serverErrorParser, yil.b ssoConfiguration, Optional tokenRepository, mli.e userLogoutInteractor, asi.d userSessionInteractor, zm0.c sessionProvider) {
        super(new fsi.b("LogoutGuardian"));
        Intrinsics.checkNotNullParameter(exceptionsOverseer, "exceptionsOverseer");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(progressDialogFactory, "progressDialogFactory");
        Intrinsics.checkNotNullParameter(restrictedAccessNavigationFactory, "restrictedAccessNavigationFactory");
        Intrinsics.checkNotNullParameter(revolutSsoLogoutEventHandler, "revolutSsoLogoutEventHandler");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(ssoConfiguration, "ssoConfiguration");
        Intrinsics.checkNotNullParameter(tokenRepository, "tokenRepository");
        Intrinsics.checkNotNullParameter(userLogoutInteractor, "userLogoutInteractor");
        Intrinsics.checkNotNullParameter(userSessionInteractor, "userSessionInteractor");
        Intrinsics.checkNotNullParameter(sessionProvider, "sessionProvider");
        this.f82035h = exceptionsOverseer;
        this.i = navigator;
        this.f82036j = progressDialogFactory;
        this.k = restrictedAccessNavigationFactory;
        this.f82037l = revolutSsoLogoutEventHandler;
        this.f82038m = serverErrorParser;
        this.f82039n = tokenRepository;
        this.o = userLogoutInteractor;
        this.f82040p = userSessionInteractor;
        this.f82041q = sessionProvider;
        w0 w0Var = x0.Companion;
        String hostUrl = ssoConfiguration.getHostUrl();
        w0Var.getClass();
        this.f82042r = y0.b(w0.c(hostUrl).d);
        this.f82043s = yhm.j.b(new co7.a(this, 2));
        this.u = new AtomicBoolean(false);
    }

    public final void N() {
        ((kz0.a) this.f82043s.getValue()).show();
        ufm.f fVar = new ufm.f(ue0.e.L(this.o.a(false), 3L).f(new ufm.f(com.revolut.retail.feature.api.userauth.navigation.a.a((com.revolut.retail.feature.api.userauth.navigation.a) this.k.f234573b, false, null, 7), new com.onfido.android.sdk.capture.ui.userconsent.c(new d(this, 1), 2), 3)), new com.onfido.android.sdk.capture.ui.userconsent.c(new d(this, 2), 3), 1);
        Intrinsics.checkNotNullExpressionValue(fVar, "doOnError(...)");
        ufm.i iVar = new ufm.i(fVar, new a0d.g(7, new c0d.j(new BreadcrumbException(), 8)), 2);
        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
        ofm.i iVar2 = new ofm.i(new p0(6, f.f82033a), new p0(6, g.f82034a), 0);
        iVar.q(iVar2);
        Intrinsics.checkNotNullExpressionValue(iVar2, "subscribe(...)");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00de  */
    @Override // qf0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P(java.lang.Exception r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.restricted_access.h.P(java.lang.Exception, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // fsi.a
    public final void onStart() {
        this.f82044t = this.f82040p.a() == asi.c.EXIST;
        this.f82035h.b(this);
        if (this.f82040p.a() == asi.c.ABSENT) {
            return;
        }
        fkl.h hVar = this.f82037l;
        Flow flowQ = q.q(new y(new g0(hVar, (Continuation) null, 2), hVar.d));
        skm.p0 p0Var = skm.p0.f264001a;
        r rVarC = rd0.e.c(q.C(flowQ, elm.f.f127540b), kotlin.coroutines.g.f186406a);
        d dVar = new d(this, 0);
        Function1 function1M = M();
        Function0 function0L = L();
        r rVarOnErrorResumeNext = rVarC.onErrorResumeNext(new a0d.g(7, new c0d.j(new BreadcrumbException(), 9)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new p0(6, dVar), new p0(6, function1M), new a08.q(18, function0L));
        w.j0(this.f137706c, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
    }

    @Override // fsi.c, fsi.a
    public final void onStop() {
        super.onStop();
        this.f82035h.a(this);
    }
}
