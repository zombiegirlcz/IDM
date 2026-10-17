package gcm;

import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.common.base.Throwables;
import com.google.common.base.Verify;
import com.google.common.base.VerifyException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
public final class z0 extends ecm.v1 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Logger f142990s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Set f142991t;
    public static final boolean u;
    public static final boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final boolean f142992w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static String f142993x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ecm.a2 f142994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Random f142995b = new Random();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile w0 f142996c = w0.INSTANCE;
    public final AtomicReference d = new AtomicReference();
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f142997g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b6 f142998h;
    public final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ecm.k2 f142999j;
    public final Stopwatch k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f143000l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f143001m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Executor f143002n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s5 f143003p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f143004q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ecm.t1 f143005r;

    static {
        Logger logger = Logger.getLogger(z0.class.getName());
        f142990s = logger;
        f142991t = Collections.unmodifiableSet(new HashSet(Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));
        String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
        String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
        String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
        u = Boolean.parseBoolean(property);
        v = Boolean.parseBoolean(property2);
        f142992w = Boolean.parseBoolean(property3);
        try {
            try {
                try {
                    if (Class.forName("gcm.h2", true, z0.class.getClassLoader()).asSubclass(y0.class).getConstructor(null).newInstance(null) == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (Exception e) {
                    logger.log(Level.FINE, "Can't construct JndiResourceResolverFactory, skipping.", (Throwable) e);
                }
            } catch (Exception e2) {
                logger.log(Level.FINE, "Can't find JndiResourceResolverFactory ctor, skipping.", (Throwable) e2);
            }
        } catch (ClassCastException e4) {
            logger.log(Level.FINE, "Unable to cast JndiResourceResolverFactory, skipping.", (Throwable) e4);
        } catch (ClassNotFoundException e5) {
            logger.log(Level.FINE, "Unable to find JndiResourceResolverFactory, skipping.", (Throwable) e5);
        }
    }

    public z0(String str, ecm.r1 r1Var, b6 b6Var, Stopwatch stopwatch, boolean z) {
        Preconditions.checkNotNull(r1Var, "args");
        this.f142998h = b6Var;
        URI uriCreate = URI.create("//" + ((String) Preconditions.checkNotNull(str, "name")));
        Preconditions.checkArgument(uriCreate.getHost() != null, "Invalid DNS name: %s", str);
        this.e = (String) Preconditions.checkNotNull(uriCreate.getAuthority(), "nameUri (%s) doesn't have an authority", uriCreate);
        this.f = uriCreate.getHost();
        if (uriCreate.getPort() == -1) {
            this.f142997g = r1Var.f124867a;
        } else {
            this.f142997g = uriCreate.getPort();
        }
        this.f142994a = (ecm.a2) Preconditions.checkNotNull(r1Var.f124868b, "proxyDetector");
        long nanos = 0;
        if (!z) {
            String property = System.getProperty("networkaddress.cache.ttl");
            long j2 = 30;
            if (property != null) {
                try {
                    j2 = Long.parseLong(property);
                } catch (NumberFormatException unused) {
                    f142990s.log(Level.WARNING, "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
                }
            }
            nanos = j2 > 0 ? TimeUnit.SECONDS.toNanos(j2) : j2;
        }
        this.i = nanos;
        this.k = (Stopwatch) Preconditions.checkNotNull(stopwatch, "stopwatch");
        this.f142999j = (ecm.k2) Preconditions.checkNotNull(r1Var.f124869c, "syncContext");
        a3 a3Var = r1Var.f124870g;
        this.f143002n = a3Var;
        this.o = a3Var == null;
        this.f143003p = (s5) Preconditions.checkNotNull(r1Var.d, "serviceConfigParser");
    }

    public static Map f(Map map, Random random, String str) {
        for (Map.Entry entry : map.entrySet()) {
            Verify.verify(f142991t.contains(entry.getKey()), "Bad key: %s", entry);
        }
        List listD = k2.d("clientLanguage", map);
        if (listD != null && !listD.isEmpty()) {
            Iterator it8 = listD.iterator();
            while (it8.hasNext()) {
                if ("java".equalsIgnoreCase((String) it8.next())) {
                }
            }
            return null;
        }
        Double dE = k2.e("percentage", map);
        if (dE != null) {
            int iIntValue = dE.intValue();
            Verify.verify(iIntValue >= 0 && iIntValue <= 100, "Bad percentage: %s", dE);
            if (random.nextInt(100) >= iIntValue) {
                return null;
            }
        }
        List listD2 = k2.d("clientHostname", map);
        if (listD2 != null && !listD2.isEmpty()) {
            Iterator it9 = listD2.iterator();
            while (it9.hasNext()) {
                if (((String) it9.next()).equals(str)) {
                }
            }
            return null;
        }
        Map mapG = k2.g("serviceConfig", map);
        if (mapG != null) {
            return mapG;
        }
        throw new VerifyException(String.format("key '%s' missing in '%s'", map, "serviceConfig"));
    }

    public static ArrayList g() {
        List<String> list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str.startsWith("grpc_config=")) {
                Object objA = j2.a(str.substring(12));
                if (!(objA instanceof List)) {
                    throw new ClassCastException(a0.d.m(objA, "wrong type "));
                }
                List list2 = (List) objA;
                k2.a(list2);
                arrayList.addAll(list2);
            } else {
                f142990s.log(Level.FINE, "Ignoring non service config {0}", new Object[]{str});
            }
        }
        return arrayList;
    }

    @Override // ecm.v1
    public final String a() {
        return this.e;
    }

    @Override // ecm.v1
    public final void b() {
        Preconditions.checkState(this.f143005r != null, "not started");
        h();
    }

    @Override // ecm.v1
    public final void c() {
        if (this.f143001m) {
            return;
        }
        this.f143001m = true;
        Executor executor = this.f143002n;
        if (executor == null || !this.o) {
            return;
        }
        c6.b(this.f142998h, executor);
        this.f143002n = null;
    }

    @Override // ecm.v1
    public final void d(ecm.t1 t1Var) {
        Preconditions.checkState(this.f143005r == null, "already started");
        if (this.o) {
            this.f143002n = (Executor) c6.a(this.f142998h);
        }
        this.f143005r = (ecm.t1) Preconditions.checkNotNull(t1Var, "listener");
        h();
    }

    public final jpf.a e() {
        ecm.s1 s1Var;
        String str = this.f;
        jpf.a aVar = new jpf.a();
        try {
            aVar.f177268b = i();
            if (f142992w) {
                List list = Collections.EMPTY_LIST;
                boolean z = false;
                if (u) {
                    if ("localhost".equalsIgnoreCase(str)) {
                        z = v;
                    } else if (!str.contains(":")) {
                        boolean z3 = true;
                        for (int i = 0; i < str.length(); i++) {
                            char cCharAt = str.charAt(i);
                            if (cCharAt != '.') {
                                z3 &= cCharAt >= '0' && cCharAt <= '9';
                            }
                        }
                        z = !z3;
                    }
                }
                if (z) {
                    a0.d.B(this.d.get());
                }
                ecm.s1 s1Var2 = null;
                if (list.isEmpty()) {
                    f142990s.log(Level.FINE, "No TXT records found for {0}", new Object[]{str});
                } else {
                    Random random = this.f142995b;
                    if (f142993x == null) {
                        try {
                            f142993x = InetAddress.getLocalHost().getHostName();
                        } catch (UnknownHostException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    String str2 = f142993x;
                    try {
                        Iterator it8 = g().iterator();
                        Map mapF = null;
                        while (it8.hasNext()) {
                            try {
                                mapF = f((Map) it8.next(), random, str2);
                                if (mapF != null) {
                                    break;
                                }
                            } catch (RuntimeException e2) {
                                s1Var = new ecm.s1(ecm.g2.f124803g.g("failed to pick service config choice").f(e2));
                            }
                        }
                        s1Var = mapF == null ? null : new ecm.s1(mapF);
                    } catch (IOException | RuntimeException e4) {
                        s1Var = new ecm.s1(ecm.g2.f124803g.g("failed to parse TXT records").f(e4));
                    }
                    if (s1Var != null) {
                        ecm.g2 g2Var = s1Var.f124873a;
                        s1Var2 = g2Var != null ? new ecm.s1(g2Var) : this.f143003p.a((Map) s1Var.f124874b);
                    }
                }
                aVar.f177269c = s1Var2;
            }
            return aVar;
        } catch (Exception e5) {
            aVar.f177267a = ecm.g2.f124807m.g("Unable to resolve host " + str).f(e5);
            return aVar;
        }
    }

    public final void h() {
        if (this.f143004q || this.f143001m) {
            return;
        }
        if (this.f143000l) {
            long j2 = this.i;
            if (j2 != 0 && (j2 <= 0 || this.k.elapsed(TimeUnit.NANOSECONDS) <= j2)) {
                return;
            }
        }
        this.f143004q = true;
        this.f143002n.execute(new ch.p(this, this.f143005r));
    }

    public final List i() {
        try {
            try {
                w0 w0Var = this.f142996c;
                String str = this.f;
                w0Var.getClass();
                List listUnmodifiableList = Collections.unmodifiableList(Arrays.asList(InetAddress.getAllByName(str)));
                ArrayList arrayList = new ArrayList(listUnmodifiableList.size());
                Iterator it8 = listUnmodifiableList.iterator();
                while (it8.hasNext()) {
                    arrayList.add(new ecm.z(new InetSocketAddress((InetAddress) it8.next(), this.f142997g)));
                }
                return Collections.unmodifiableList(arrayList);
            } catch (Exception e) {
                Throwables.throwIfUnchecked(e);
                throw new RuntimeException(e);
            }
        } catch (Throwable th10) {
            if (0 != 0) {
                f142990s.log(Level.FINE, "Address resolution failure", (Throwable) null);
            }
            throw th10;
        }
    }
}
