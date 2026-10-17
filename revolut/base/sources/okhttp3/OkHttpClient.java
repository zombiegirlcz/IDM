package okhttp3;

import ch.qos.logback.core.util.FileSize;
import emm.g;
import emm.h;
import imm.e;
import imm.f;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTimeConstants;
import ulm.a0;
import ulm.e0;
import ulm.f0;
import ulm.f1;
import ulm.h0;
import ulm.h1;
import ulm.j1;
import ulm.l0;
import ulm.m0;
import ulm.o;
import ulm.t;
import vlm.j;
import xlm.d;
import ylm.q;
import ylm.x;
import zhm.d0;

/* JADX INFO: loaded from: classes13.dex */
public class OkHttpClient implements o {

    @NotNull
    public static final f1 Companion = new f1();
    public static final List G = j.i(h1.HTTP_2, h1.HTTP_1_1);
    public static final List H = j.i(a0.f281060g, a0.f281061h);
    public final int A;
    public final int B;
    public final long C;
    public final x D;
    public final d E;
    public final ulm.x F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f226053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f226054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f226055c;
    public final l0 d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ulm.d f226056g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f226057h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e0 f226058j;
    public final Cache k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ah.a f226059l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ProxySelector f226060m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ulm.b f226061n;
    public final SocketFactory o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final SSLSocketFactory f226062p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final X509TrustManager f226063q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f226064r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List f226065s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f226066t;
    public final t u;
    public final e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f226067w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f226068x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f226069y;
    public final int z;

    public static final class a {
        public int A;
        public int B;
        public int C;
        public long D;
        public x E;
        public d F;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ulm.x f226071b;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public ulm.d f226074h;
        public boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f226075j;
        public e0 k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Cache f226076l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public ah.a f226077m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public ProxySelector f226078n;
        public ulm.b o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public SocketFactory f226079p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public SSLSocketFactory f226080q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public X509TrustManager f226081r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public List f226082s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public List f226083t;
        public f u;
        public t v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public e f226084w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f226085x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f226086y;
        public int z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public f0 f226070a = new f0();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f226072c = new ArrayList();
        public final ArrayList d = new ArrayList();
        public l0 e = j.a(m0.NONE);
        public boolean f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f226073g = true;

        public a() {
            ulm.b bVar = ulm.d.f281081a;
            this.f226074h = bVar;
            this.i = true;
            this.f226075j = true;
            this.k = e0.F1;
            this.f226077m = h0.G1;
            this.o = bVar;
            SocketFactory socketFactory = SocketFactory.getDefault();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "getDefault(...)");
            this.f226079p = socketFactory;
            OkHttpClient.Companion.getClass();
            this.f226082s = OkHttpClient.H;
            this.f226083t = OkHttpClient.G;
            this.u = f.f162568a;
            this.v = t.f281135c;
            this.f226086y = 10000;
            this.z = 10000;
            this.A = 10000;
            this.C = DateTimeConstants.MILLIS_PER_MINUTE;
            this.D = FileSize.KB_COEFFICIENT;
        }

        public final void a(Interceptor interceptor) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            this.f226072c.add(interceptor);
        }

        public final void b(Interceptor interceptor) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            this.d.add(interceptor);
        }

        public final void c(t certificatePinner) {
            Intrinsics.checkNotNullParameter(certificatePinner, "certificatePinner");
            if (!certificatePinner.equals(this.v)) {
                this.E = null;
            }
            this.v = certificatePinner;
        }

        public final void d(long j2, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.f226086y = j.d("timeout", unit, j2);
        }

        public final void e(List protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            ArrayList arrayListF1 = d0.f1(protocols);
            h1 h1Var = h1.H2_PRIOR_KNOWLEDGE;
            if (!arrayListF1.contains(h1Var) && !arrayListF1.contains(h1.HTTP_1_1)) {
                throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + arrayListF1).toString());
            }
            if (arrayListF1.contains(h1Var) && arrayListF1.size() > 1) {
                throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + arrayListF1).toString());
            }
            if (arrayListF1.contains(h1.HTTP_1_0)) {
                throw new IllegalArgumentException(("protocols must not contain http/1.0: " + arrayListF1).toString());
            }
            if (arrayListF1.contains(null)) {
                throw new IllegalArgumentException("protocols must not contain null");
            }
            arrayListF1.remove(h1.SPDY_3);
            if (!arrayListF1.equals(this.f226083t)) {
                this.E = null;
            }
            List listUnmodifiableList = Collections.unmodifiableList(arrayListF1);
            Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(...)");
            this.f226083t = listUnmodifiableList;
        }

        public final void f(long j2, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.z = j.d("timeout", unit, j2);
        }

        public final void g(SSLSocketFactory sslSocketFactory, X509TrustManager trustManager) {
            Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            if (!Intrinsics.f(sslSocketFactory, this.f226080q) || !Intrinsics.f(trustManager, this.f226081r)) {
                this.E = null;
            }
            this.f226080q = sslSocketFactory;
            e.Companion.getClass();
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            h.Companion.getClass();
            this.f226084w = h.f127697a.c(trustManager);
            this.f226081r = trustManager;
        }

        public final void h(long j2, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.A = j.d("timeout", unit, j2);
        }
    }

    public OkHttpClient(a builder) throws NoSuchAlgorithmException, KeyStoreException {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f226053a = builder.f226070a;
        this.f226054b = j.q(builder.f226072c);
        this.f226055c = j.q(builder.d);
        this.d = builder.e;
        this.e = builder.f;
        this.f = builder.f226073g;
        this.f226056g = builder.f226074h;
        this.f226057h = builder.i;
        this.i = builder.f226075j;
        this.f226058j = builder.k;
        this.k = builder.f226076l;
        this.f226059l = builder.f226077m;
        ProxySelector proxySelector = builder.f226078n;
        if (proxySelector == null && (proxySelector = ProxySelector.getDefault()) == null) {
            proxySelector = gmm.a.f144887a;
        }
        this.f226060m = proxySelector;
        this.f226061n = builder.o;
        this.o = builder.f226079p;
        List list = builder.f226082s;
        this.f226064r = list;
        this.f226065s = builder.f226083t;
        this.f226066t = builder.u;
        this.f226067w = builder.f226085x;
        this.f226068x = builder.f226086y;
        this.f226069y = builder.z;
        this.z = builder.A;
        this.A = builder.B;
        this.B = builder.C;
        this.C = builder.D;
        x xVar = builder.E;
        this.D = xVar == null ? new x() : xVar;
        d dVar = builder.F;
        this.E = dVar == null ? d.f307058l : dVar;
        ulm.x xVar2 = builder.f226071b;
        if (xVar2 == null) {
            xVar2 = new ulm.x();
            builder.f226071b = xVar2;
        }
        this.F = xVar2;
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            this.f226062p = null;
            this.v = null;
            this.f226063q = null;
            this.u = t.f281135c;
        } else {
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                if (((a0) it8.next()).f281062a) {
                    SSLSocketFactory sSLSocketFactory = builder.f226080q;
                    if (sSLSocketFactory == null) {
                        g gVar = h.Companion;
                        gVar.getClass();
                        h.f127697a.getClass();
                        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                        trustManagerFactory.init((KeyStore) null);
                        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                        Intrinsics.h(trustManagers);
                        if (trustManagers.length == 1) {
                            TrustManager trustManager = trustManagers[0];
                            if (trustManager instanceof X509TrustManager) {
                                X509TrustManager trustManager2 = (X509TrustManager) trustManager;
                                this.f226063q = trustManager2;
                                h hVar = h.f127697a;
                                hVar.getClass();
                                Intrinsics.checkNotNullParameter(trustManager2, "trustManager");
                                try {
                                    SSLContext sSLContextL = hVar.l();
                                    sSLContextL.init(null, new TrustManager[]{trustManager2}, null);
                                    SSLSocketFactory socketFactory = sSLContextL.getSocketFactory();
                                    Intrinsics.checkNotNullExpressionValue(socketFactory, "getSocketFactory(...)");
                                    this.f226062p = socketFactory;
                                    e.Companion.getClass();
                                    Intrinsics.checkNotNullParameter(trustManager2, "trustManager");
                                    gVar.getClass();
                                    e certificateChainCleaner = h.f127697a.c(trustManager2);
                                    this.v = certificateChainCleaner;
                                    t tVar = builder.v;
                                    tVar.getClass();
                                    Intrinsics.checkNotNullParameter(certificateChainCleaner, "certificateChainCleaner");
                                    this.u = Intrinsics.f(tVar.f281137b, certificateChainCleaner) ? tVar : new t(tVar.f281136a, certificateChainCleaner);
                                } catch (GeneralSecurityException e) {
                                    throw new AssertionError("No System TLS: " + e, e);
                                }
                            }
                        }
                        StringBuilder sb6 = new StringBuilder("Unexpected default trust managers: ");
                        String string = Arrays.toString(trustManagers);
                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                        sb6.append(string);
                        throw new IllegalStateException(sb6.toString().toString());
                    }
                    this.f226062p = sSLSocketFactory;
                    e certificateChainCleaner2 = builder.f226084w;
                    Intrinsics.h(certificateChainCleaner2);
                    this.v = certificateChainCleaner2;
                    X509TrustManager x509TrustManager = builder.f226081r;
                    Intrinsics.h(x509TrustManager);
                    this.f226063q = x509TrustManager;
                    t tVar2 = builder.v;
                    tVar2.getClass();
                    Intrinsics.checkNotNullParameter(certificateChainCleaner2, "certificateChainCleaner");
                    this.u = Intrinsics.f(tVar2.f281137b, certificateChainCleaner2) ? tVar2 : new t(tVar2.f281136a, certificateChainCleaner2);
                }
            }
            this.f226062p = null;
            this.v = null;
            this.f226063q = null;
            this.u = t.f281135c;
        }
        X509TrustManager x509TrustManager2 = this.f226063q;
        e eVar = this.v;
        SSLSocketFactory sSLSocketFactory2 = this.f226062p;
        List list3 = this.f226055c;
        List list4 = this.f226054b;
        Intrinsics.i(list4, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list4.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + list4).toString());
        }
        Intrinsics.i(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list3.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + list3).toString());
        }
        List list5 = this.f226064r;
        if (!(list5 instanceof Collection) || !list5.isEmpty()) {
            Iterator it9 = list5.iterator();
            while (it9.hasNext()) {
                if (((a0) it9.next()).f281062a) {
                    if (sSLSocketFactory2 == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (eVar == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (x509TrustManager2 == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (sSLSocketFactory2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (eVar != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (x509TrustManager2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!Intrinsics.f(this.u, t.f281135c)) {
            throw new IllegalStateException("Check failed.");
        }
        Unit unit = Unit.f186387a;
    }

    public final a a() {
        Intrinsics.checkNotNullParameter(this, "okHttpClient");
        a aVar = new a();
        aVar.f226070a = this.f226053a;
        aVar.f226071b = this.F;
        zhm.a0.x(this.f226054b, aVar.f226072c);
        zhm.a0.x(this.f226055c, aVar.d);
        aVar.e = this.d;
        aVar.f = this.e;
        aVar.f226073g = this.f;
        aVar.f226074h = this.f226056g;
        aVar.i = this.f226057h;
        aVar.f226075j = this.i;
        aVar.k = this.f226058j;
        aVar.f226076l = this.k;
        aVar.f226077m = this.f226059l;
        aVar.f226078n = this.f226060m;
        aVar.o = this.f226061n;
        aVar.f226079p = this.o;
        aVar.f226080q = this.f226062p;
        aVar.f226081r = this.f226063q;
        aVar.f226082s = this.f226064r;
        aVar.f226083t = this.f226065s;
        aVar.u = this.f226066t;
        aVar.v = this.u;
        aVar.f226084w = this.v;
        aVar.f226085x = this.f226067w;
        aVar.f226086y = this.f226068x;
        aVar.z = this.f226069y;
        aVar.A = this.z;
        aVar.B = this.A;
        aVar.C = this.B;
        aVar.D = this.C;
        aVar.E = this.D;
        aVar.F = this.E;
        return aVar;
    }

    public final q b(j1 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new q(this, request, false);
    }

    public OkHttpClient() {
        this(new a());
    }
}
