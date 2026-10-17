package yx8;

import android.webkit.GeolocationPermissions;
import com.revolut.feature.kyc.shared.exception.KycException;
import grl.cc;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import r10.q;
import rd0.d;
import tx8.b0;
import vkm.z1;
import yji.n;
import zhm.h0;
import zhm.q0;
import zjh.i;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i f317596l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final om0.b f317597m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final by8.a f317598n;
    public final y80.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z1 f317599p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public q f317600q;

    public c(i webPortalEventProviderFactory, om0.b inactivityTimer, by8.a webViewFeaturePolicy, y80.a permissionProvider) {
        Intrinsics.checkNotNullParameter(webPortalEventProviderFactory, "webPortalEventProviderFactory");
        Intrinsics.checkNotNullParameter(inactivityTimer, "inactivityTimer");
        Intrinsics.checkNotNullParameter(webViewFeaturePolicy, "webViewFeaturePolicy");
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        this.f317596l = webPortalEventProviderFactory;
        this.f317597m = inactivityTimer;
        this.f317598n = webViewFeaturePolicy;
        this.o = permissionProvider;
        this.f317599p = vkm.q.b(1, 5, null);
    }

    @Override // yji.n
    public final void D2() {
        n.j2(this, ta6.a.I(60000L, TimeUnit.MILLISECONDS), null, new yl6.b(this, null, 17), 3);
    }

    @Override // yx8.a
    public final boolean Z2(String url2) {
        Intrinsics.checkNotNullParameter(url2, "redirectUrl");
        q qVar = this.f317600q;
        if (qVar == null) {
            return false;
        }
        Intrinsics.checkNotNullParameter(url2, "url");
        cy8.a aVar = (cy8.a) qVar.f250849b;
        Object objI = aVar.i(url2);
        if (objI != null) {
            b0 b0Var = (b0) qVar.f250850c;
            av1.c vendor = aVar.m();
            String redirectUrl = aVar.r(url2);
            Intrinsics.checkNotNullParameter(vendor, "vendor");
            Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
            b0Var.b(cc.Redirected, vendor, q0.c(new Pair("redirect_url", d0.z0(redirectUrl, "?", redirectUrl))));
            ((z1) qVar.d).k(objI);
        }
        return objI != null;
    }

    @Override // yx8.a
    public final void b3(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        KycException kycException = new KycException("WebChromeClientControllerExtension", new Throwable(message));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        d.a(rd0.c.ERROR, null, null, kycException, h0Var);
    }

    @Override // yx8.a
    public final z1 c3() {
        return this.f317599p;
    }

    @Override // yx8.a
    public final z1 d3(cy8.a redirectMapper) {
        Intrinsics.checkNotNullParameter(redirectMapper, "redirectMapper");
        i iVar = this.f317596l;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(redirectMapper, "redirectMapper");
        q qVar = new q(redirectMapper, (b0) iVar.f322838b);
        this.f317600q = qVar;
        return (z1) qVar.d;
    }

    @Override // yx8.a
    public final void e3(String origin, GeolocationPermissions.Callback callback) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(callback, "callback");
        by8.a aVar = this.f317598n;
        if (aVar.f19778a && this.o.c("android.permission.ACCESS_FINE_LOCATION")) {
            callback.invoke(origin, true, true);
            return;
        }
        if (!aVar.f19778a) {
            callback.invoke(origin, false, false);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Missing fine location permission for Web KYC, origin=".concat(origin));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        callback.invoke(origin, false, false);
        this.f317599p.k(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (kotlin.collections.d.I(r0, "android.webkit.resource.AUDIO_CAPTURE") != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (kotlin.collections.d.I(r0, "android.webkit.resource.AUDIO_CAPTURE") != false) goto L19;
     */
    @Override // yx8.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f3(android.webkit.PermissionRequest r7) {
        /*
            r6 = this;
            java.lang.String r0 = "request"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String[] r0 = r7.getResources()
            int r1 = r0.length
            r2 = 1
            java.lang.String r3 = "android.webkit.resource.AUDIO_CAPTURE"
            java.lang.String r4 = "getResources(...)"
            java.lang.String r5 = "android.webkit.resource.VIDEO_CAPTURE"
            if (r1 == r2) goto L2b
            r2 = 2
            if (r1 == r2) goto L17
            goto L3f
        L17:
            boolean r0 = kotlin.collections.d.I(r0, r5)
            if (r0 == 0) goto L3f
            java.lang.String[] r0 = r7.getResources()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            boolean r0 = kotlin.collections.d.I(r0, r3)
            if (r0 == 0) goto L3f
            goto L6b
        L2b:
            boolean r0 = kotlin.collections.d.I(r0, r5)
            if (r0 != 0) goto L6b
            java.lang.String[] r0 = r7.getResources()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            boolean r0 = kotlin.collections.d.I(r0, r3)
            if (r0 == 0) goto L3f
            goto L6b
        L3f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String[] r1 = r7.getResources()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Too many or wrong permissions requested for Web KYC: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            zhm.h0 r1 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r2 = rd0.d.f253311a
            rd0.c r2 = rd0.c.ERROR
            r3 = 0
            rd0.d.a(r2, r3, r3, r0, r1)
            r7.deny()
            vkm.z1 r7 = r6.f317599p
            kotlin.Unit r0 = kotlin.Unit.f186387a
            r7.k(r0)
            return
        L6b:
            java.lang.String[] r0 = r7.getResources()
            r7.grant(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yx8.c.f3(android.webkit.PermissionRequest):void");
    }
}
