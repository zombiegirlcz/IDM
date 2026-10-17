package com.revolut.feature.retail.reverywhere.impl.web_app;

import a26.s;
import a5g.i;
import cli.g;
import cli.n;
import cli.y;
import com.revolut.feature.retail.reverywhere.impl.web_app.ReverywhereWebAppScreenContract$InputData;
import com.revolut.feature.retail.reverywhere.impl.web_app.c;
import java.net.URI;
import java.util.concurrent.CopyOnWriteArrayList;
import jch.p;
import jfb.a0;
import jfb.h0;
import jfb.p0;
import jfb.q0;
import jfb.t0;
import jfb.x0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import oki.h;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import vkm.q;
import yji.l;
import zhm.d0;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends h implements h0 {

    @NotNull
    public static final q0 Companion = new q0();
    public final com.revolut.kompot.navigable.vc.modal.a A;
    public final y B;
    public final bjl.q0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ReverywhereWebAppScreenContract$InputData f82936p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x0 f82937q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final efb.h f82938r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final web.b f82939s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final a0 f82940t;
    public final ffb.d u;
    public final vii.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public a2 f82941w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final hlm.c f82942x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public s f82943y;
    public boolean z;

    public d(bjl.q0 revolutSsoOnAppLinkInteractor, n stateMapper, ReverywhereWebAppScreenContract$InputData inputData, x0 reverywhereWebControllerExtension, efb.h reverywhereInteractor, web.b reverywhereConfigInteractor, a urlBuilder, a0 performanceTracker, ffb.d locationManager) {
        String strS;
        String host;
        Intrinsics.checkNotNullParameter(revolutSsoOnAppLinkInteractor, "revolutSsoOnAppLinkInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(reverywhereWebControllerExtension, "reverywhereWebControllerExtension");
        Intrinsics.checkNotNullParameter(reverywhereInteractor, "reverywhereInteractor");
        Intrinsics.checkNotNullParameter(reverywhereConfigInteractor, "reverywhereConfigInteractor");
        Intrinsics.checkNotNullParameter(urlBuilder, "urlBuilder");
        Intrinsics.checkNotNullParameter(performanceTracker, "performanceTracker");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        this.o = revolutSsoOnAppLinkInteractor;
        this.f82936p = inputData;
        this.f82937q = reverywhereWebControllerExtension;
        this.f82938r = reverywhereInteractor;
        this.f82939s = reverywhereConfigInteractor;
        this.f82940t = performanceTracker;
        this.u = locationManager;
        this.v = new vii.b();
        this.f82942x = hlm.d.a();
        this.A = hx7.e.a(this, new p(this, 11));
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        if (inputData instanceof ReverywhereWebAppScreenContract$InputData.AppConfiguration) {
            ReverywhereWebAppScreenContract$InputData.AppConfiguration appConfiguration = (ReverywhereWebAppScreenContract$InputData.AppConfiguration) inputData;
            Regex regex = a.f82926b;
            String str = appConfiguration.f82918a;
            if (regex.f(str) && (host = URI.create(urlBuilder.f82927a.getBaseUrl()).getHost()) != null) {
                strS = a0.d.s("https://", str, ".", d0.k0(d0.W0(2, kotlin.text.d0.n0(host, new String[]{"."}, 0, 6)), ".", null, null, 0, null, 62));
                String decodedPath = appConfiguration.f82920c;
                if (decodedPath != null && decodedPath.length() != 0) {
                    Intrinsics.checkNotNullParameter(decodedPath, "decodedPath");
                    if (kotlin.text.d0.J(decodedPath, "..", false) || !jfb.y.f173845a.f(decodedPath)) {
                        String name = a.class.getName();
                        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                        zhm.h0 h0Var = zhm.h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, name, p.a.p("Reverywhere path validation rejected (subdomain=", str, ")"), null, h0Var);
                        strS = null;
                    } else {
                        strS = com.google.android.gms.internal.mlkit_vision_face.a.o(strS, "/", decodedPath);
                    }
                }
            } else {
                strS = null;
            }
        } else {
            if (!(inputData instanceof ReverywhereWebAppScreenContract$InputData.Url)) {
                throw new NoWhenBranchMatchedException();
            }
            strS = ((ReverywhereWebAppScreenContract$InputData.Url) inputData).f82921a;
        }
        this.B = mra.d.b(this, new b(strS == null ? "" : strS, strS == null ? new p0(new ReverywhereWebResourceException(null, "Invalid app subdomain")) : c.b.f82933a, 94), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, this.f82937q.b3(), null, null, new t0(this, continuation, 0), 3);
        l.a1(this, q.Q(this.v, new iw6.l(continuation, this, 14)), null, null, new t0(this, continuation, 1), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I2(gim.c r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof jfb.r0
            if (r0 == 0) goto L13
            r0 = r11
            jfb.r0 r0 = (jfb.r0) r0
            int r1 = r0.f173836y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f173836y = r1
            goto L18
        L13:
            jfb.r0 r0 = new jfb.r0
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f173834w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f173836y
            r3 = 2
            r4 = 0
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L43
            if (r2 == r5) goto L3a
            if (r2 != r3) goto L32
            hlm.a r0 = r0.u
            yhm.o.b(r11)     // Catch: java.lang.Throwable -> L2f
            goto Lae
        L2f:
            r11 = move-exception
            goto Lbe
        L32:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L3a:
            int r2 = r0.v
            hlm.a r7 = r0.u
            yhm.o.b(r11)
            r11 = r7
            goto L56
        L43:
            yhm.o.b(r11)
            hlm.c r11 = r10.f82942x
            r0.u = r11
            r0.v = r4
            r0.f173836y = r5
            java.lang.Object r2 = r11.lock(r6, r0)
            if (r2 != r1) goto L55
            goto Lab
        L55:
            r2 = r4
        L56:
            ffb.d r7 = r10.u     // Catch: java.lang.Throwable -> Lbc
            y80.a r7 = r7.f134791b     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r8 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r7 = r7.c(r8)     // Catch: java.lang.Throwable -> Lbc
            if (r7 == 0) goto L65
            r0 = r11
            r4 = r5
            goto Lb4
        L65:
            boolean r7 = r10.z     // Catch: java.lang.Throwable -> Lbc
            if (r7 == 0) goto L6b
            r0 = r11
            goto Lb4
        L6b:
            r0.u = r11     // Catch: java.lang.Throwable -> Lbc
            r0.v = r2     // Catch: java.lang.Throwable -> Lbc
            r0.f173836y = r3     // Catch: java.lang.Throwable -> Lbc
            skm.l r2 = new skm.l     // Catch: java.lang.Throwable -> Lbc
            kotlin.coroutines.Continuation r3 = fim.h.b(r0)     // Catch: java.lang.Throwable -> Lbc
            r2.<init>(r5, r3)     // Catch: java.lang.Throwable -> Lbc
            r2.u()     // Catch: java.lang.Throwable -> Lbc
            a26.s r3 = new a26.s     // Catch: java.lang.Throwable -> Lbc
            r4 = 20
            r3.<init>(r10, r2, r4)     // Catch: java.lang.Throwable -> Lbc
            r10.f82943y = r3     // Catch: java.lang.Throwable -> Lbc
            ghk.x r3 = new ghk.x     // Catch: java.lang.Throwable -> Lbc
            r4 = 14
            r3.<init>(r10, r4)     // Catch: java.lang.Throwable -> Lbc
            r2.r(r3)     // Catch: java.lang.Throwable -> Lbc
            com.revolut.kompot.navigable.vc.modal.a r3 = r10.A     // Catch: java.lang.Throwable -> Lbc
            com.revolut.feature.retail.reverywhere.impl.web_app.ReverywhereWebAppScreenContract$Step$LocationPermission r4 = com.revolut.feature.retail.reverywhere.impl.web_app.ReverywhereWebAppScreenContract$Step.LocationPermission.f82924a     // Catch: java.lang.Throwable -> Lbc
            com.revolut.kompot.common.ModalDestination$Style$POPUP r5 = com.revolut.kompot.common.ModalDestination.Style.POPUP.f98311a     // Catch: java.lang.Throwable -> Lbc
            oki.h.v2(r3, r4, r5)     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object r2 = r2.t()     // Catch: java.lang.Throwable -> Lbc
            if (r2 != r1) goto La9
            java.lang.String r3 = "frame"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)     // Catch: java.lang.Throwable -> Lbc
            goto La9
        La5:
            r9 = r0
            r0 = r11
            r11 = r9
            goto Lbe
        La9:
            if (r2 != r1) goto Lac
        Lab:
            return r1
        Lac:
            r0 = r11
            r11 = r2
        Lae:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L2f
            boolean r4 = r11.booleanValue()     // Catch: java.lang.Throwable -> L2f
        Lb4:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L2f
            r0.unlock(r6)
            return r11
        Lbc:
            r0 = move-exception
            goto La5
        Lbe:
            r0.unlock(r6)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.retail.reverywhere.impl.web_app.d.I2(gim.c):java.lang.Object");
    }

    public final void J2(int i) {
        a0 a0Var = this.f82940t;
        l80.e eVar = a0Var.f173771b;
        a0Var.d = System.currentTimeMillis();
        a0Var.e = 0L;
        a0Var.f = 0L;
        a0Var.f173773g = 0L;
        a0Var.i = 200;
        a0Var.o = 0L;
        a0Var.k = null;
        a0Var.f173776l = null;
        a0Var.f173777m = null;
        a0Var.f173778n = null;
        a0Var.f173779p = false;
        a0Var.f173780q = false;
        a0Var.f173781r = false;
        H2(this.B, new i(i, 27));
        this.v.a();
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.A;
    }

    @Override // cli.z
    public final g getState() {
        return this.B;
    }
}
