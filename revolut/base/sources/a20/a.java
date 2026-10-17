package a20;

import a01.e;
import android.os.Looper;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import qd0.b;
import rd0.c;
import skm.e0;
import skm.p0;
import t20.d;
import vc.s;
import w01.f;
import yhm.m;
import yhm.n;
import yhm.o;
import zhm.h0;
import zhm.r0;

/* JADX INFO: loaded from: classes.dex */
public final class a implements bk0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b1j.a f658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p10.b f660c;
    public final d d;
    public final dm0.d e;

    public a(b1j.a pushTokenProvider, b languageProvider, p10.b configuration, d authentication, dm0.d deviceIdProvider, f mainThreadChecker) {
        Intrinsics.checkNotNullParameter(pushTokenProvider, "pushTokenProvider");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(authentication, "authentication");
        Intrinsics.checkNotNullParameter(deviceIdProvider, "deviceIdProvider");
        Intrinsics.checkNotNullParameter(mainThreadChecker, "mainThreadChecker");
        this.f658a = pushTokenProvider;
        this.f659b = languageProvider;
        this.f660c = configuration;
        this.d = authentication;
        this.e = deviceIdProvider;
    }

    @Override // bk0.a
    public final Map a(String url2) {
        Object objA;
        Intrinsics.checkNotNullParameter(url2, "url");
        od0.a aVar = od0.a.f224253a;
        boolean zE = od0.a.e();
        Intrinsics.checkNotNullParameter("Auth headers should not be requested on the Main thread", "message");
        boolean z = false;
        if (Intrinsics.f(Looper.getMainLooper(), Looper.myLooper())) {
            IllegalThreadStateException illegalThreadStateException = new IllegalThreadStateException("Auth headers should not be requested on the Main thread");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(c.ERROR, null, null, illegalThreadStateException, h0Var);
            if (zE) {
                throw illegalThreadStateException;
            }
        }
        try {
            m.Companion companion = m.INSTANCE;
            objA = (String) e0.E(p0.f264003c, new e(this, z ? 1 : 0, 3));
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        boolean z3 = objA instanceof n;
        Object objQ = objA;
        if (!z3) {
            objQ = j6.a.q("Bearer ", (String) objA);
        }
        String str = (String) (objQ instanceof n ? null : objQ);
        if (str == null) {
            return r0.g();
        }
        Pair pair = new Pair("X-Device-Id", this.e.b().f115812a);
        Pair pair2 = new Pair("Accept-Language", p10.b.a(((s80.b) this.f659b).b()));
        Pair pair3 = new Pair("User-Agent", s.g(this.f660c.k));
        Pair pair4 = new Pair("Authorization", str);
        Pair pair5 = new Pair("X-Chat-Version", "4.5.0");
        String strA = this.f658a.a();
        if (strA == null) {
            m70.a.c(t0.f186434a);
            strA = "";
        }
        return r0.k(pair, pair2, pair3, pair4, pair5, new Pair("X-Push-Token", strA));
    }
}
