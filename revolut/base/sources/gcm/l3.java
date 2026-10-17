package gcm;

import ch.qos.logback.core.util.FileSize;
import com.google.common.base.Preconditions;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes13.dex */
public final class l3 extends ecm.e0 {
    public static final Logger D = Logger.getLogger(l3.class.getName());
    public static final long E = TimeUnit.MINUTES.toMillis(30);
    public static final long F = TimeUnit.SECONDS.toMillis(1);
    public static final d6 G = new d6(p1.f142817p);
    public static final ecm.y H = ecm.y.d;
    public static final ecm.p I = ecm.p.f124852b;
    public static final Pattern J = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");
    public static final Method K;
    public final boolean A;
    public final hcm.k B;
    public final a31.a C;
    public final d6 d;
    public final d6 e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ecm.x1 f142747g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f142748h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f142749j;
    public final ecm.y k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ecm.p f142750l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f142751m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f142752n;
    public final int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f142753p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f142754q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f142755r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ecm.j0 f142756s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Map f142757t;
    public boolean u;
    public ecm.a2 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f142758w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f142759x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f142760y;
    public final boolean z;

    static {
        Method declaredMethod;
        try {
            Class<?> cls = Class.forName("io.grpc.census.InternalCensusStatsAccessor");
            Class cls2 = Boolean.TYPE;
            declaredMethod = cls.getDeclaredMethod("getClientInterceptor", cls2, cls2, cls2, cls2);
        } catch (ClassNotFoundException e) {
            D.log(Level.FINE, "Unable to apply census stats", (Throwable) e);
            declaredMethod = null;
        } catch (NoSuchMethodException e2) {
            D.log(Level.FINE, "Unable to apply census stats", (Throwable) e2);
            declaredMethod = null;
        }
        K = declaredMethod;
    }

    public l3(String str, hcm.k kVar, a31.a aVar) {
        ecm.x1 x1Var;
        List list;
        d6 d6Var = G;
        this.d = d6Var;
        this.e = d6Var;
        this.f = new ArrayList();
        Logger logger = ecm.x1.d;
        synchronized (ecm.x1.class) {
            try {
                if (ecm.x1.e == null) {
                    ArrayList arrayList = new ArrayList();
                    try {
                        boolean z = a1.f142555a;
                        arrayList.add(a1.class);
                    } catch (ClassNotFoundException e) {
                        ecm.x1.d.log(Level.FINE, "Unable to find DNS NameResolver", (Throwable) e);
                    }
                    List<ecm.w1> listI = ecm.e0.i(ecm.w1.class, Collections.unmodifiableList(arrayList), ecm.w1.class.getClassLoader(), new ecm.q1(5));
                    if (listI.isEmpty()) {
                        ecm.x1.d.warning("No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                    }
                    ecm.x1.e = new ecm.x1();
                    for (ecm.w1 w1Var : listI) {
                        ecm.x1.d.fine("Service loader found " + w1Var);
                        ecm.x1 x1Var2 = ecm.x1.e;
                        synchronized (x1Var2) {
                            w1Var.getClass();
                            Preconditions.checkArgument(true, "isAvailable() returned false");
                            x1Var2.f124895b.add(w1Var);
                        }
                    }
                    ecm.x1.e.a();
                }
                x1Var = ecm.x1.e;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        this.f142747g = x1Var;
        this.f142748h = new ArrayList();
        this.f142749j = "pick_first";
        this.k = H;
        this.f142750l = I;
        this.f142751m = E;
        this.f142752n = 5;
        this.o = 5;
        this.f142753p = 16777216L;
        this.f142754q = FileSize.MB_COEFFICIENT;
        this.f142755r = true;
        this.f142756s = ecm.j0.e;
        this.u = true;
        this.f142758w = true;
        this.f142759x = true;
        this.f142760y = true;
        this.z = true;
        this.A = true;
        new ArrayList();
        this.i = (String) Preconditions.checkNotNull(str, "target");
        this.B = (hcm.k) Preconditions.checkNotNull(kVar, "clientTransportFactoryBuilder");
        this.C = aVar;
        ecm.q qVarD = ecm.q.d();
        synchronized (qVarD) {
            list = (List) qVarD.f124861b;
        }
        Iterator it8 = list.iterator();
        if (it8.hasNext()) {
            throw v0.a.e(it8);
        }
    }

    public static List q(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj2 : list) {
            if (obj2 == null) {
                arrayList.add(null);
            } else if (obj2 instanceof Map) {
                arrayList.add(r((Map) obj2));
            } else if (obj2 instanceof List) {
                arrayList.add(q((List) obj2));
            } else if (obj2 instanceof String) {
                arrayList.add(obj2);
            } else if (obj2 instanceof Double) {
                arrayList.add(obj2);
            } else {
                if (!(obj2 instanceof Boolean)) {
                    throw new IllegalArgumentException("The entry '" + obj2 + "' is of type '" + obj2.getClass() + "', which is not supported");
                }
                arrayList.add(obj2);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static Map r(Map map) {
        if (map == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            Preconditions.checkArgument(entry.getKey() instanceof String, "The key of the entry '%s' is not of String type", entry);
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                linkedHashMap.put(str, null);
            } else if (value instanceof Map) {
                linkedHashMap.put(str, r((Map) value));
            } else if (value instanceof List) {
                linkedHashMap.put(str, q((List) value));
            } else if (value instanceof String) {
                linkedHashMap.put(str, value);
            } else if (value instanceof Double) {
                linkedHashMap.put(str, value);
            } else {
                if (!(value instanceof Boolean)) {
                    throw new IllegalArgumentException("The value of the map entry '" + entry + "' is of type '" + value.getClass() + "', which is not supported");
                }
                linkedHashMap.put(str, value);
            }
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e0  */
    @Override // ecm.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ecm.d1 a() {
        /*
            Method dump skipped, instruction units count: 579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gcm.l3.a():ecm.d1");
    }

    @Override // ecm.e0
    public final ecm.e0 b(Map map) {
        this.f142757t = r(map);
        return this;
    }

    @Override // ecm.e0
    public final ecm.e0 c() {
        this.u = false;
        return this;
    }

    @Override // ecm.e0
    public final ecm.e0 d() {
        this.f142755r = true;
        return this;
    }

    @Override // ecm.e0
    public final ecm.e0 n(ecm.a2 a2Var) {
        this.v = a2Var;
        return this;
    }

    @Override // ecm.e0
    public final ecm.e0 o() {
        Preconditions.checkArgument(true, "retry buffer size must be positive");
        this.f142753p = 4000000L;
        return this;
    }
}
