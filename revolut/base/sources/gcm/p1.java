package gcm;

import ch.qos.logback.core.CoreConstants;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.base.Strings;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.io.Closeable;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
public abstract class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f142808a = Logger.getLogger(p1.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f142809b = Collections.unmodifiableSet(EnumSet.of(ecm.e2.OK, ecm.e2.INVALID_ARGUMENT, ecm.e2.NOT_FOUND, ecm.e2.ALREADY_EXISTS, ecm.e2.FAILED_PRECONDITION, ecm.e2.ABORTED, ecm.e2.OUT_OF_RANGE, ecm.e2.DATA_LOSS));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ecm.g1 f142810c;
    public static final ecm.g1 d;
    public static final ecm.k1 e;
    public static final ecm.g1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ecm.k1 f142811g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ecm.g1 f142812h;
    public static final ecm.g1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ecm.g1 f142813j;
    public static final ecm.g1 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f142814l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final s4 f142815m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ecm.c f142816n;
    public static final k1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final m f142817p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final m f142818q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final l1 f142819r;

    static {
        Charset.forName("US-ASCII");
        f142810c = new ecm.g1("grpc-timeout", new o1());
        ecm.f1 f1Var = ecm.m1.d;
        d = new ecm.g1("grpc-encoding", f1Var);
        e = ecm.o0.a("grpc-accept-encoding", new m1(0));
        f = new ecm.g1("content-encoding", f1Var);
        f142811g = ecm.o0.a("accept-encoding", new m1(0));
        f142812h = new ecm.g1("content-length", f1Var);
        i = new ecm.g1("content-type", f1Var);
        f142813j = new ecm.g1("te", f1Var);
        k = new ecm.g1("user-agent", f1Var);
        Splitter.on(CoreConstants.COMMA_CHAR).trimResults();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f142814l = timeUnit.toNanos(20L);
        TimeUnit.HOURS.toNanos(2L);
        timeUnit.toNanos(20L);
        f142815m = new s4();
        f142816n = ecm.c.a("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER");
        o = new k1();
        f142817p = new m(7);
        f142818q = new m(8);
        f142819r = new l1(0);
    }

    public static URI a(String str) {
        String str2;
        Preconditions.checkNotNull(str, "authority");
        try {
            str2 = str;
            try {
                return new URI(null, str2, null, null, null);
            } catch (URISyntaxException e2) {
                e = e2;
                throw new IllegalArgumentException(j6.a.q("Invalid authority: ", str2), e);
            }
        } catch (URISyntaxException e4) {
            e = e4;
            str2 = str;
        }
    }

    public static void b(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e2) {
            f142808a.log(Level.WARNING, "exception caught in closeQuietly", (Throwable) e2);
        }
    }

    public static ecm.n[] c(ecm.d dVar, ecm.m1 m1Var, int i2, boolean z) {
        List list = dVar.d;
        int size = list.size();
        ecm.n[] nVarArr = new ecm.n[size + 1];
        ecm.d dVar2 = ecm.d.f124789h;
        ecm.m mVar = new ecm.m((ecm.d) Preconditions.checkNotNull(dVar, "callOptions cannot be null"), i2, z);
        for (int i3 = 0; i3 < list.size(); i3++) {
            nVarArr[i3] = ((ecm.l) list.get(i3)).a(mVar, m1Var);
        }
        nVarArr[size] = o;
        return nVarArr;
    }

    public static boolean d(String str, boolean z) {
        String strTrim = System.getenv(str);
        if (strTrim == null) {
            strTrim = System.getProperty(str);
        }
        if (strTrim != null) {
            strTrim = strTrim.trim();
        }
        return z ? Strings.isNullOrEmpty(strTrim) || Boolean.parseBoolean(strTrim) : !Strings.isNullOrEmpty(strTrim) && Boolean.parseBoolean(strTrim);
    }

    public static ThreadFactory e(String str) {
        return new ThreadFactoryBuilder().setDaemon(true).setNameFormat(str).build();
    }

    public static d0 f(ecm.v0 v0Var, boolean z) {
        b2 b2Var;
        ecm.x0 x0Var = v0Var.f124882a;
        ecm.g2 g2Var = v0Var.f124884c;
        if (x0Var == null) {
            b2Var = null;
        } else {
            g2 g2Var2 = (g2) ((i6) x0Var.e());
            b2Var = g2Var2.v;
            if (b2Var == null) {
                g2Var2.k.execute(new x1(g2Var2, 0));
                b2Var = null;
            }
        }
        if (b2Var != null) {
            ecm.l lVar = v0Var.f124883b;
            return lVar == null ? b2Var : new d1(lVar, b2Var);
        }
        if (!g2Var.e()) {
            if (v0Var.d) {
                return new d1(h(g2Var), b0.DROPPED);
            }
            if (!z) {
                return new d1(h(g2Var), b0.PROCESSED);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ecm.g2 g(int r3) {
        /*
            r0 = 100
            if (r3 < r0) goto Lb
            r0 = 200(0xc8, float:2.8E-43)
            if (r3 >= r0) goto Lb
            ecm.e2 r0 = ecm.e2.INTERNAL
            goto L37
        Lb:
            r0 = 400(0x190, float:5.6E-43)
            if (r3 == r0) goto L35
            r0 = 401(0x191, float:5.62E-43)
            if (r3 == r0) goto L32
            r0 = 403(0x193, float:5.65E-43)
            if (r3 == r0) goto L2f
            r0 = 404(0x194, float:5.66E-43)
            if (r3 == r0) goto L2c
            r0 = 429(0x1ad, float:6.01E-43)
            if (r3 == r0) goto L29
            r0 = 431(0x1af, float:6.04E-43)
            if (r3 == r0) goto L35
            switch(r3) {
                case 502: goto L29;
                case 503: goto L29;
                case 504: goto L29;
                default: goto L26;
            }
        L26:
            ecm.e2 r0 = ecm.e2.UNKNOWN
            goto L37
        L29:
            ecm.e2 r0 = ecm.e2.UNAVAILABLE
            goto L37
        L2c:
            ecm.e2 r0 = ecm.e2.UNIMPLEMENTED
            goto L37
        L2f:
            ecm.e2 r0 = ecm.e2.PERMISSION_DENIED
            goto L37
        L32:
            ecm.e2 r0 = ecm.e2.UNAUTHENTICATED
            goto L37
        L35:
            ecm.e2 r0 = ecm.e2.INTERNAL
        L37:
            ecm.g2 r0 = r0.b()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "HTTP status code "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            ecm.g2 r3 = r0.g(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: gcm.p1.g(int):ecm.g2");
    }

    public static ecm.g2 h(ecm.g2 g2Var) {
        Preconditions.checkArgument(g2Var != null);
        if (!f142809b.contains(g2Var.f124809a)) {
            return g2Var;
        }
        return ecm.g2.f124806l.g("Inappropriate status code from control plane: " + g2Var.f124809a + " " + g2Var.f124810b).f(g2Var.f124811c);
    }
}
