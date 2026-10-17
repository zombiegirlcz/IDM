package kg;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import mg.c1;
import mg.e1;
import mg.n1;

/* JADX INFO: loaded from: classes.dex */
public final class o {
    public static final j u = j.d;
    public static final i v = i.IDENTITY;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final j0 f183864w = j0.DOUBLE;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final j0 f183865x = j0.LAZILY_PARSED_NUMBER;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadLocal f183866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f183867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r8.q f183868c;
    public final mg.l d;
    public final List e;
    public final com.google.gson.internal.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i f183869g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f183870h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j f183871j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f183872l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f183873m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f183874n;
    public final c0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f183875p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f183876q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j0 f183877r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j0 f183878s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List f183879t;

    /* JADX WARN: Illegal instructions before constructor call */
    public o() {
        com.google.gson.internal.f fVar = com.google.gson.internal.f.f49633c;
        Map map = Collections.EMPTY_MAP;
        c0 c0Var = c0.DEFAULT;
        List list = Collections.EMPTY_LIST;
        this(fVar, v, map, true, u, false, true, c0Var, 2, 2, list, list, list, f183864w, f183865x, list);
    }

    public static void a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final Object b(Reader reader, TypeToken typeToken) {
        qg.a aVar = new qg.a(reader);
        aVar.D(e0.LEGACY_STRICT);
        Object objF = f(aVar, typeToken);
        if (objF != null) {
            try {
                if (aVar.A() != qg.b.END_DOCUMENT) {
                    throw new JsonSyntaxException("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e) {
                throw new JsonSyntaxException(e);
            } catch (IOException e2) {
                throw new JsonIOException(e2);
            }
        }
        return objF;
    }

    public final Object c(String str, Class cls) {
        TypeToken typeToken = TypeToken.get(cls);
        if (str == null) {
            return null;
        }
        return b(new StringReader(str), typeToken);
    }

    public final Object d(String str, Type type) {
        TypeToken<?> typeToken = TypeToken.get(type);
        if (str == null) {
            return null;
        }
        return b(new StringReader(str), typeToken);
    }

    public final Object e(w wVar, Class cls) {
        TypeToken typeToken = TypeToken.get(cls);
        if (wVar == null) {
            return null;
        }
        return f(new mg.q(wVar), typeToken);
    }

    public final Object f(qg.a aVar, TypeToken typeToken) {
        boolean z;
        e0 e0Var = aVar.f245600b;
        if (e0Var == e0.LEGACY_STRICT) {
            aVar.D(e0.LENIENT);
        }
        try {
            try {
                try {
                    aVar.A();
                    z = false;
                    try {
                        l0 l0VarG = g(typeToken);
                        Object objC = l0VarG.c(aVar);
                        Class clsL = kli.a.L(typeToken.getRawType());
                        if (objC != null && !clsL.isInstance(objC)) {
                            throw new ClassCastException("Type adapter '" + l0VarG + "' returned wrong type; requested " + typeToken.getRawType() + " but got instance of " + objC.getClass() + "\nVerify that the adapter was registered for the correct type.");
                        }
                        return objC;
                    } catch (EOFException e) {
                        e = e;
                        if (!z) {
                            throw new JsonSyntaxException(e);
                        }
                        aVar.D(e0Var);
                        return null;
                    }
                } catch (EOFException e2) {
                    e = e2;
                    z = true;
                }
            } catch (IOException e4) {
                throw new JsonSyntaxException(e4);
            } catch (AssertionError e5) {
                throw new AssertionError("AssertionError (GSON 2.13.1): " + e5.getMessage(), e5);
            } catch (IllegalStateException e6) {
                throw new JsonSyntaxException(e6);
            }
        } finally {
            aVar.D(e0Var);
        }
    }

    public final l0 g(TypeToken typeToken) {
        boolean z;
        Objects.requireNonNull(typeToken, "type must not be null");
        ConcurrentHashMap concurrentHashMap = this.f183867b;
        l0 l0Var = (l0) concurrentHashMap.get(typeToken);
        if (l0Var != null) {
            return l0Var;
        }
        ThreadLocal threadLocal = this.f183866a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z = true;
        } else {
            l0 l0Var2 = (l0) map.get(typeToken);
            if (l0Var2 != null) {
                return l0Var2;
            }
            z = false;
        }
        try {
            n nVar = new n();
            map.put(typeToken, nVar);
            Iterator it8 = this.e.iterator();
            l0 l0VarA = null;
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                l0VarA = ((m0) it8.next()).a(this, typeToken);
                if (l0VarA != null) {
                    if (nVar.f183863a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    nVar.f183863a = l0VarA;
                    map.put(typeToken, l0VarA);
                }
            }
            if (z) {
                threadLocal.remove();
            }
            if (l0VarA != null) {
                if (z) {
                    concurrentHashMap.putAll(map);
                }
                return l0VarA;
            }
            throw new IllegalArgumentException("GSON (2.13.1) cannot handle " + typeToken);
        } catch (Throwable th10) {
            if (z) {
                threadLocal.remove();
            }
            throw th10;
        }
    }

    public final l0 h(Class cls) {
        return g(TypeToken.get(cls));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kg.l0 i(kg.m0 r7, com.google.gson.reflect.TypeToken r8) {
        /*
            r6 = this;
            java.lang.String r0 = "skipPast must not be null"
            java.util.Objects.requireNonNull(r7, r0)
            java.lang.String r0 = "type must not be null"
            java.util.Objects.requireNonNull(r8, r0)
            mg.l r0 = r6.d
            r0.getClass()
            java.util.concurrent.ConcurrentHashMap r1 = r0.f205092b
            mg.k r2 = mg.l.f205090c
            r3 = 1
            if (r7 != r2) goto L19
            goto L5b
        L19:
            java.lang.Class r2 = r8.getRawType()
            java.lang.Object r4 = r1.get(r2)
            kg.m0 r4 = (kg.m0) r4
            if (r4 == 0) goto L28
            if (r4 != r7) goto L5c
            goto L5b
        L28:
            java.lang.Class<lg.a> r4 = lg.a.class
            java.lang.annotation.Annotation r4 = r2.getAnnotation(r4)
            lg.a r4 = (lg.a) r4
            if (r4 != 0) goto L33
            goto L5c
        L33:
            java.lang.Class r4 = r4.value()
            java.lang.Class<kg.m0> r5 = kg.m0.class
            boolean r5 = r5.isAssignableFrom(r4)
            if (r5 != 0) goto L40
            goto L5c
        L40:
            r8.q r5 = r0.f205091a
            com.google.gson.reflect.TypeToken r4 = com.google.gson.reflect.TypeToken.get(r4)
            com.google.gson.internal.r r4 = r5.c(r4, r3)
            java.lang.Object r4 = r4.construct()
            kg.m0 r4 = (kg.m0) r4
            java.lang.Object r1 = r1.putIfAbsent(r2, r4)
            kg.m0 r1 = (kg.m0) r1
            if (r1 == 0) goto L59
            r4 = r1
        L59:
            if (r4 != r7) goto L5c
        L5b:
            r7 = r0
        L5c:
            java.util.List r0 = r6.e
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L63:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L7c
            java.lang.Object r2 = r0.next()
            kg.m0 r2 = (kg.m0) r2
            if (r1 != 0) goto L75
            if (r2 != r7) goto L63
            r1 = r3
            goto L63
        L75:
            kg.l0 r2 = r2.a(r6, r8)
            if (r2 == 0) goto L63
            return r2
        L7c:
            if (r1 != 0) goto L83
            kg.l0 r7 = r6.g(r8)
            return r7
        L83:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "GSON cannot serialize or deserialize "
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kg.o.i(kg.m0, com.google.gson.reflect.TypeToken):kg.l0");
    }

    public final qg.c j(Writer writer) {
        qg.c cVar = new qg.c(writer);
        cVar.o(this.f183871j);
        cVar.i = this.i;
        cVar.p(e0.LEGACY_STRICT);
        cVar.k = false;
        return cVar;
    }

    public final String k(Object obj2) {
        if (obj2 != null) {
            return l(obj2, obj2.getClass());
        }
        StringWriter stringWriter = new StringWriter();
        try {
            n(j(stringWriter));
            return stringWriter.toString();
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    public final String l(Object obj2, Type type) {
        StringWriter stringWriter = new StringWriter();
        try {
            m(obj2, type, j(stringWriter));
            return stringWriter.toString();
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    public final void m(Object obj2, Type type, qg.c cVar) {
        l0 l0VarG = g(TypeToken.get(type));
        e0 e0Var = cVar.f245615h;
        if (e0Var == e0.LEGACY_STRICT) {
            cVar.p(e0.LENIENT);
        }
        boolean z = cVar.i;
        boolean z3 = cVar.k;
        cVar.i = this.i;
        cVar.k = false;
        try {
            try {
                l0VarG.d(cVar, obj2);
            } catch (IOException e) {
                throw new JsonIOException(e);
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.13.1): " + e2.getMessage(), e2);
            }
        } finally {
            cVar.p(e0Var);
            cVar.i = z;
            cVar.k = z3;
        }
    }

    public final void n(qg.c cVar) {
        v vVar = v.f183890a;
        e0 e0Var = cVar.f245615h;
        boolean z = cVar.i;
        boolean z3 = cVar.k;
        cVar.i = this.i;
        cVar.k = false;
        if (e0Var == e0.LEGACY_STRICT) {
            cVar.p(e0.LENIENT);
        }
        try {
            try {
                try {
                    m70.a.w(vVar, cVar);
                } catch (IOException e) {
                    throw new JsonIOException(e);
                }
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.13.1): " + e2.getMessage(), e2);
            }
        } finally {
            cVar.p(e0Var);
            cVar.i = z;
            cVar.k = z3;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.e + ",instanceCreators:" + this.f183868c + "}";
    }

    public o(com.google.gson.internal.f fVar, i iVar, Map map, boolean z, j jVar, boolean z3, boolean z4, c0 c0Var, int i, int i2, List list, List list2, List list3, j0 j0Var, j0 j0Var2, List list4) {
        mg.u uVar;
        l0 lVar;
        l0 kVar;
        l0 kVar2;
        mg.u uVar2;
        this.f183866a = new ThreadLocal();
        this.f183867b = new ConcurrentHashMap();
        this.f = fVar;
        this.f183869g = iVar;
        this.f183870h = map;
        r8.q qVar = new r8.q(map, list4, z4);
        this.f183868c = qVar;
        this.i = z;
        this.f183871j = jVar;
        this.k = z3;
        this.f183872l = z4;
        this.o = c0Var;
        this.f183873m = i;
        this.f183874n = i2;
        this.f183875p = list;
        this.f183876q = list2;
        this.f183877r = j0Var;
        this.f183878s = j0Var2;
        this.f183879t = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(n1.C);
        int i3 = 1;
        if (j0Var == j0.DOUBLE) {
            uVar = mg.y.f205131c;
        } else {
            mg.u uVar3 = mg.y.f205131c;
            uVar = new mg.u(j0Var, i3);
        }
        arrayList.add(uVar);
        arrayList.add(fVar);
        arrayList.addAll(list3);
        arrayList.add(n1.f205106r);
        arrayList.add(n1.f205098g);
        arrayList.add(n1.d);
        arrayList.add(n1.e);
        arrayList.add(n1.f);
        if (c0Var == c0.DEFAULT) {
            lVar = n1.k;
        } else {
            lVar = new l();
        }
        arrayList.add(new e1(Long.TYPE, Long.class, lVar));
        int i5 = 0;
        if (z3) {
            kVar = n1.f205102m;
        } else {
            kVar = new k(i5);
        }
        arrayList.add(new e1(Double.TYPE, Double.class, kVar));
        if (z3) {
            kVar2 = n1.f205101l;
        } else {
            kVar2 = new k(i3);
        }
        arrayList.add(new e1(Float.TYPE, Float.class, kVar2));
        if (j0Var2 == j0.LAZILY_PARSED_NUMBER) {
            uVar2 = mg.w.f205128b;
        } else {
            uVar2 = new mg.u(new mg.w(j0Var2), i5);
        }
        arrayList.add(uVar2);
        arrayList.add(n1.f205099h);
        arrayList.add(n1.i);
        arrayList.add(new c1(AtomicLong.class, new m(lVar, i5).b(), i5));
        arrayList.add(new c1(AtomicLongArray.class, new m(lVar, i3).b(), i5));
        arrayList.add(n1.f205100j);
        arrayList.add(n1.f205103n);
        arrayList.add(n1.f205107s);
        arrayList.add(n1.f205108t);
        arrayList.add(new c1(BigDecimal.class, n1.o, i5));
        arrayList.add(new c1(BigInteger.class, n1.f205104p, i5));
        arrayList.add(new c1(com.google.gson.internal.l.class, n1.f205105q, i5));
        arrayList.add(n1.u);
        arrayList.add(n1.v);
        arrayList.add(n1.f205110x);
        arrayList.add(n1.f205111y);
        arrayList.add(n1.A);
        arrayList.add(n1.f205109w);
        arrayList.add(n1.f205096b);
        arrayList.add(mg.h.f205076c);
        arrayList.add(n1.z);
        if (pg.f.f235788a) {
            arrayList.add(pg.f.e);
            arrayList.add(pg.f.d);
            arrayList.add(pg.f.f);
        }
        arrayList.add(mg.b.f205048c);
        arrayList.add(n1.f205095a);
        arrayList.add(new mg.d(qVar, i5));
        arrayList.add(new mg.d(qVar, i3));
        mg.l lVar2 = new mg.l(qVar);
        this.d = lVar2;
        arrayList.add(lVar2);
        arrayList.add(n1.D);
        arrayList.add(new mg.f0(qVar, iVar, fVar, lVar2, list4));
        this.e = Collections.unmodifiableList(arrayList);
    }
}
