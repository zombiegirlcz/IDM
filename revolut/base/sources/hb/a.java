package hb;

import android.content.Context;
import android.net.Uri;
import g1m.d;
import g1m.j;
import i1m.c;
import ib.e;
import ib.f;
import ib.g;
import ib.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import z0m.q;
import z0m.x;
import zhm.r0;
import zhm.v;

/* JADX INFO: loaded from: classes23.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static h f150532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f150533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashSet f150534c = new HashSet();
    public static final ArrayList d = new ArrayList();

    public static void a(String message, Throwable th10, Map attributes) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        d(e.ERROR, message, attributes, th10);
    }

    public static /* synthetic */ void b(int i, String str, Throwable th10, Map map) {
        if ((i & 2) != 0) {
            th10 = null;
        }
        if ((i & 4) != 0) {
            map = r0.g();
        }
        a(str, th10, map);
    }

    public static void c(Map attributes, String message, int i) {
        if ((i & 4) != 0) {
            attributes = r0.g();
        }
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        d(e.INFO, message, attributes, null);
    }

    public static void d(e level, String message, Map attributes, Throwable th10) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        if (f150532a != null) {
            Intrinsics.checkNotNullParameter(level, "level");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(attributes, "attributes");
        }
        Objects.toString(level);
        Objects.toString(attributes);
        Objects.toString(th10);
        b bVar = b.PENDING;
    }

    public static final void e(b consent) {
        ArrayList<Pair> arrayList = d;
        Intrinsics.checkNotNullParameter(consent, "consent");
        Objects.toString(consent);
        h hVar = f150532a;
        if (hVar != null) {
            Intrinsics.checkNotNullParameter(consent, "consent");
            hVar.f = consent;
            if (consent == b.GRANTED) {
                if (hVar.f160074b == null) {
                    Context context = hVar.f160073a;
                    String appId = context.getPackageName();
                    String endpoint = g.d.a();
                    d value = d.POST;
                    Intrinsics.checkNotNullParameter(endpoint, "endpoint");
                    Intrinsics.checkNotNullParameter(value, "method");
                    c1m.e network = new c1m.e();
                    Intrinsics.checkNotNullParameter(value, "value");
                    network.f20546c = value;
                    String scheme = Uri.parse(endpoint).getScheme();
                    if (scheme == null) {
                        network.d = j.HTTPS;
                        network.f20545b = "https://" + endpoint;
                    } else if (scheme.equals("https")) {
                        network.d = j.HTTPS;
                        network.f20545b = endpoint;
                    } else if (scheme.equals("http")) {
                        network.d = j.HTTP;
                        network.f20545b = endpoint;
                    } else {
                        network.d = j.HTTPS;
                        network.f20545b = "https://" + endpoint;
                    }
                    Intrinsics.h(appId);
                    Intrinsics.checkNotNullParameter(appId, "appId");
                    c1m.j jVar = new c1m.j();
                    jVar.f20549a = appId;
                    i1m.b value2 = i1m.b.Mobile;
                    Intrinsics.checkNotNullParameter(value2, "devicePlatform");
                    Intrinsics.checkNotNullParameter(value2, "value");
                    jVar.f20551c = value2;
                    Boolean bool = Boolean.FALSE;
                    jVar.f20553h = bool;
                    jVar.i = bool;
                    jVar.f20554j = bool;
                    jVar.f = bool;
                    jVar.e = Boolean.TRUE;
                    jVar.f20552g = bool;
                    c value3 = c.DEBUG;
                    Intrinsics.checkNotNullParameter(value3, "logLevel");
                    Intrinsics.checkNotNullParameter(value3, "value");
                    jVar.d = value3;
                    c1m.b bVar = new c1m.b();
                    d1m.b value4 = d1m.b.Single;
                    Intrinsics.checkNotNullParameter(value4, "bufferOption");
                    Intrinsics.checkNotNullParameter(value4, "value");
                    bVar.f20542b = value4;
                    c1m.a[] configurations = {jVar, bVar};
                    q qVar = b1m.a.f11846a;
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter("com.fourthline.sdk", "namespace");
                    Intrinsics.checkNotNullParameter(network, "network");
                    Intrinsics.checkNotNullParameter(configurations, "configurations");
                    HashMap map = b1m.a.f11847b;
                    q serviceProvider = (q) map.get("com.fourthline.sdk");
                    if (serviceProvider != null) {
                        ArrayList configurations2 = new ArrayList(v.k(Arrays.copyOf(configurations, 2)));
                        configurations2.add(network);
                        Intrinsics.checkNotNullParameter(configurations2, "configurations");
                        z0m.v vVar = serviceProvider.f318658b;
                        if (vVar != null) {
                            a1m.d.c(vVar.H);
                            a1m.d.c(vVar.F);
                            a1m.d.c(vVar.E);
                            a1m.d.c(vVar.G);
                            a1m.d.c(vVar.I);
                            vVar.b();
                            vVar.f318673h.e();
                        }
                        s0m.c cVar = serviceProvider.f318659c;
                        if (cVar != null) {
                            cVar.e();
                        }
                        serviceProvider.e().f20550b = null;
                        c1m.h hVar2 = serviceProvider.k;
                        if (hVar2 == null) {
                            Intrinsics.r("subjectConfiguration");
                            throw null;
                        }
                        hVar2.f20548a = null;
                        serviceProvider.a().f20541a = null;
                        serviceProvider.d().f20547a = null;
                        c1m.c cVar2 = serviceProvider.f318665n;
                        if (cVar2 == null) {
                            Intrinsics.r("gdprConfiguration");
                            throw null;
                        }
                        cVar2.f20543a = null;
                        serviceProvider.f(configurations2);
                        serviceProvider.f318659c = null;
                        serviceProvider.d = null;
                        serviceProvider.f318658b = null;
                        serviceProvider.c();
                    } else {
                        serviceProvider = new q(context, network, v.k(Arrays.copyOf(configurations, 2)));
                        synchronized (b1m.a.class) {
                            map.put("com.fourthline.sdk", serviceProvider);
                            if (b1m.a.f11846a == null) {
                                b1m.a.f11846a = serviceProvider;
                            }
                        }
                    }
                    x xVar = serviceProvider.e;
                    if (xVar == null) {
                        Intrinsics.checkNotNullParameter(serviceProvider, "serviceProvider");
                        xVar = new x(serviceProvider);
                        serviceProvider.e = xVar;
                    }
                    hVar.f160074b = xVar;
                }
                for (Pair pair : hVar.e) {
                    hVar.e((f) pair.f186385a, (List) pair.f186386b);
                }
                hVar.e.clear();
            }
        }
        if (f150533b && consent == b.GRANTED) {
            for (Pair pair2 : arrayList) {
            }
            arrayList.clear();
        }
    }
}
