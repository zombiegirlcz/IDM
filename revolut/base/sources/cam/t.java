package cam;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import c84.y;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import skm.e0;
import skm.p0;
import ulm.i1;
import ulm.j1;
import ulm.o1;
import ulm.p1;
import zhm.r0;

/* JADX INFO: loaded from: classes19.dex */
public final class t extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f22696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WebView f22697c;
    public final zkm.d d;
    public final String e;
    public final skm.r f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f22698g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f22699h;
    public final OkHttpClient i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(b browser, WebView webView) {
        super(0);
        Intrinsics.checkNotNullParameter(browser, "browser");
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.f22696b = browser;
        this.f22697c = webView;
        zkm.d dVarC = e0.c(p0.f264002b);
        this.d = dVarC;
        this.e = "MuppetPage_" + hashCode();
        this.f = e0.b();
        this.f22698g = new ArrayList();
        this.f22699h = new ArrayList();
        OkHttpClient.a aVar = new OkHttpClient.a();
        aVar.b(new s());
        this.i = new OkHttpClient(aVar);
        webView.setWebViewClient(new c9i.b(this, 1));
        int i = 0;
        webView.setWebChromeClient(new r(this, i));
        e0.C(dVarC, zkm.o.f323119a, null, new h(this, null, i), 2);
    }

    public static final Response G(t tVar, String str, String str2, String str3, Map map, boolean z) {
        i1 i1Var = new i1();
        i1Var.e(str2);
        if (str.length() == 0) {
            str = "GET";
        }
        String upperCase = str.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        o1 o1VarB = null;
        if (str3 != null && str3.length() != 0) {
            RequestBody.Companion.getClass();
            o1VarB = p1.b(str3, null);
        }
        i1Var.c(upperCase, o1VarB);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (!a0.z((String) entry.getKey(), "Accept-Encoding", true)) {
                    i1Var.a((String) entry.getKey(), (String) entry.getValue());
                }
            }
        }
        j1 j1Var = new j1(i1Var);
        OkHttpClient.a aVarA = tVar.i.a();
        aVarA.i = z;
        return FirebasePerfOkHttpClient.execute(new OkHttpClient(aVarA).b(j1Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object H(final cam.t r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof cam.p
            if (r0 == 0) goto L13
            r0 = r5
            cam.p r0 = (cam.p) r0
            int r1 = r0.f22691x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22691x = r1
            goto L18
        L13:
            cam.p r0 = new cam.p
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f22691x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            cam.t r4 = r0.u
            yhm.o.b(r5)
            goto L46
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r5)
            java.lang.String r5 = r4.e
            financial.atomic.muppet.Page$setupJSObject$2 r2 = new financial.atomic.muppet.Page$setupJSObject$2
            r2.<init>()
            r0.u = r4
            r0.f22691x = r3
            java.lang.Object r5 = r4.L(r0, r2, r5)
            if (r5 != r1) goto L46
            return r1
        L46:
            cam.i r5 = cam.i.started
            cam.h r0 = new cam.h
            r1 = 0
            r2 = 1
            r0.<init>(r4, r1, r2)
            r4.x(r5, r0)
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: cam.t.H(cam.t, gim.c):java.lang.Object");
    }

    public static final boolean I(t tVar, Uri uri2) {
        WebView webView = tVar.f22697c;
        boolean zF = tVar.F(uri2);
        boolean z = !zF;
        if (!zF) {
            e0.C(tVar.d, null, null, new y(tVar, uri2, null, 5), 3);
        }
        String string = uri2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "uri.toString()");
        if (a0.H(string, "mailto", false)) {
            webView.getContext().startActivity(new Intent("android.intent.action.VIEW", uri2));
            z = true;
        }
        String string2 = uri2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "uri.toString()");
        if (!a0.H(string2, "tel", false)) {
            return z;
        }
        webView.getContext().startActivity(new Intent("android.intent.action.DIAL", uri2));
        return true;
    }

    public static Object M(t tVar, String str, gim.c cVar) {
        Map mapG = r0.g();
        tVar.getClass();
        p0 p0Var = p0.f264001a;
        return e0.J(zkm.o.f323119a, new c34.d(8, tVar, mapG, str, (Continuation) null), cVar);
    }

    public final boolean F(Uri uri2) {
        boolean z;
        boolean zY;
        synchronized (this.f22699h) {
            try {
                if (this.f22699h.size() <= 0) {
                    z = true;
                    break;
                }
                ArrayList<String> arrayList = this.f22699h;
                z = false;
                if (arrayList == null || !arrayList.isEmpty()) {
                    for (String str : arrayList) {
                        String host = uri2.getHost();
                        if (host != null) {
                            Intrinsics.checkNotNullExpressionValue(host, "host");
                            zY = a0.y(host, str, false);
                        } else {
                            zY = false;
                        }
                        if (zY) {
                            z = true;
                            break;
                        }
                    }
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J(gim.c r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof cam.k
            if (r0 == 0) goto L13
            r0 = r6
            cam.k r0 = (cam.k) r0
            int r1 = r0.f22682x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22682x = r1
            goto L18
        L13:
            cam.k r0 = new cam.k
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f22682x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            cam.t r0 = r0.u
            yhm.o.b(r6)
            goto L4b
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            yhm.o.b(r6)
            r0.u = r5
            r0.f22682x = r3
            skm.p0 r6 = skm.p0.f264001a
            tkm.e r6 = zkm.o.f323119a
            cam.j r2 = new cam.j
            r3 = 0
            r4 = 4
            r2.<init>(r5, r3, r4)
            java.lang.Object r6 = skm.e0.J(r6, r2, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            r0 = r5
        L4b:
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L50
            goto L64
        L50:
            cam.b r0 = r0.f22696b
            r0.getClass()
            android.webkit.CookieManager r0 = android.webkit.CookieManager.getInstance()
            java.lang.String r1 = "getInstance()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r6 = r0.getCookie(r6)
            if (r6 != 0) goto L66
        L64:
            java.lang.String r6 = ""
        L66:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: cam.t.J(gim.c):java.lang.Object");
    }

    public final Object K(String str, gim.c cVar) {
        p0 p0Var = p0.f264001a;
        return e0.J(zkm.o.f323119a, new m(this, str, null, 0), cVar);
    }

    public final Object L(gim.c cVar, Object obj2, String str) throws Throwable {
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(zkm.o.f323119a, new a26.q(this, obj2, str, (Continuation) null), cVar);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.util.LinkedHashMap r16, boolean r17, gim.c r18) {
        /*
            r12 = this;
            r0 = r18
            boolean r1 = r0 instanceof cam.n
            if (r1 == 0) goto L15
            r1 = r0
            cam.n r1 = (cam.n) r1
            int r2 = r1.f22686w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f22686w = r2
            goto L1a
        L15:
            cam.n r1 = new cam.n
            r1.<init>(r12, r0)
        L1a:
            java.lang.Object r0 = r1.u
            fim.a r10 = fim.a.COROUTINE_SUSPENDED
            int r2 = r1.f22686w
            r11 = 1
            if (r2 == 0) goto L31
            if (r2 != r11) goto L29
            yhm.o.b(r0)
            goto L4f
        L29:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L31:
            yhm.o.b(r0)
            skm.p0 r0 = skm.p0.f264001a
            elm.f r0 = elm.f.f127540b
            cam.o r2 = new cam.o
            r9 = 0
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r1.f22686w = r11
            java.lang.Object r0 = skm.e0.J(r0, r2, r1)
            if (r0 != r10) goto L4f
            return r10
        L4f:
            java.lang.String r1 = "suspend fun request(meth…?.close()\n        }\n    }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cam.t.N(java.lang.String, java.lang.String, java.lang.String, java.util.LinkedHashMap, boolean, gim.c):java.lang.Object");
    }

    public final Object O(String str, gim.c cVar) throws Throwable {
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(zkm.o.f323119a, new c1i.f(this, str, null, 27), cVar);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }
}
