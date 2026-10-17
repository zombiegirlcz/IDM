package t9;

import com.fasterxml.jackson.databind.JavaType;
import d9.z;
import java.io.File;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import k9.p;
import k9.v;
import v9.i0;
import v9.j0;
import v9.k0;
import v9.n;
import v9.o0;
import v9.p0;
import v9.q;
import v9.q0;
import v9.s;
import v9.t;
import v9.w;
import x9.r;

/* JADX INFO: loaded from: classes16.dex */
public abstract class b extends v13.d implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f268910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f268911b;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map2.put(String.class.getName(), new v9.f(2));
        s sVar = s.f;
        map2.put(StringBuffer.class.getName(), sVar);
        map2.put(StringBuilder.class.getName(), sVar);
        map2.put(Character.class.getName(), sVar);
        map2.put(Character.TYPE.getName(), sVar);
        int i = 4;
        map2.put(Integer.class.getName(), new w(Integer.class, i));
        Class cls = Integer.TYPE;
        map2.put(cls.getName(), new w(cls, i));
        int i2 = 5;
        map2.put(Long.class.getName(), new w(Long.class, i2));
        Class cls2 = Long.TYPE;
        map2.put(cls2.getName(), new w(cls2, i2));
        String name = Byte.class.getName();
        w wVar = w.f;
        map2.put(name, wVar);
        map2.put(Byte.TYPE.getName(), wVar);
        String name2 = Short.class.getName();
        w wVar2 = w.f286944g;
        map2.put(name2, wVar2);
        map2.put(Short.TYPE.getName(), wVar2);
        int i3 = 3;
        map2.put(Double.class.getName(), new w(Double.class, i3));
        Class cls3 = Double.TYPE;
        map2.put(cls3.getName(), new w(cls3, i3));
        String name3 = Float.class.getName();
        w wVar3 = w.e;
        map2.put(name3, wVar3);
        map2.put(Float.TYPE.getName(), wVar3);
        map2.put(Boolean.TYPE.getName(), new v9.e(true, 1));
        int i5 = 0;
        map2.put(Boolean.class.getName(), new v9.e(false, 1));
        map2.put(BigInteger.class.getName(), new t(BigInteger.class));
        map2.put(BigDecimal.class.getName(), new t(BigDecimal.class));
        map2.put(Calendar.class.getName(), v9.g.f286915g);
        map2.put(Date.class.getName(), v9.i.f286917g);
        HashMap map3 = new HashMap();
        map3.put(URL.class, new s(URL.class, i5));
        map3.put(URI.class, new s(URI.class, i5));
        map3.put(Currency.class, new s(Currency.class, i5));
        map3.put(UUID.class, new q0(null));
        map3.put(Pattern.class, new s(Pattern.class, i5));
        map3.put(Locale.class, new s(Locale.class, i5));
        map3.put(AtomicBoolean.class, i0.class);
        map3.put(AtomicInteger.class, j0.class);
        map3.put(AtomicLong.class, k0.class);
        map3.put(File.class, v9.l.class);
        map3.put(Class.class, v9.h.class);
        q qVar = q.d;
        map3.put(Void.class, qVar);
        map3.put(Void.TYPE, qVar);
        for (Map.Entry entry : map3.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof k9.k) {
                map2.put(((Class) entry.getKey()).getName(), (k9.k) value);
            } else {
                map.put(((Class) entry.getKey()).getName(), (Class) value);
            }
        }
        map.put(r.class.getName(), p0.class);
        f268910a = map2;
        f268911b = map;
    }

    public static z i0(v vVar, p9.r rVar, JavaType javaType, Class cls) {
        z zVarB;
        k9.t tVar = vVar.f182201a;
        z zVarA = (z) tVar.f203602g.f25476b;
        p pVar = rVar.d;
        if (pVar != null && (zVarB = pVar.B(rVar.e)) != null) {
            zVarA = zVarA == null ? zVarB : zVarA.a(zVarB);
        }
        tVar.f(cls);
        tVar.f(javaType.f26182a);
        return zVarA;
    }

    public static k9.k m0(v vVar, p9.p pVar) {
        k9.t tVar = vVar.f182201a;
        Object objP = tVar.e().P(pVar);
        if (objP == null) {
            return null;
        }
        k9.k kVarD = vVar.D(pVar, objP);
        Object objJ = tVar.e().J(pVar);
        if (objJ == null) {
            return kVarD;
        }
        vVar.f(objJ);
        return kVarD;
    }

    public static boolean n0(k9.t tVar, p9.r rVar) {
        l9.h hVarN = tVar.e().N(rVar.e);
        return (hVarN == null || hVarN == l9.h.DEFAULT_TYPING) ? k9.l.USE_STATIC_TYPING.c(tVar.f203598a) : hVarN == l9.h.STATIC;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fb  */
    @Override // v13.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final k9.k c(k9.v r9, com.fasterxml.jackson.databind.JavaType r10) {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t9.b.c(k9.v, com.fasterxml.jackson.databind.JavaType):k9.k");
    }

    @Override // v13.d
    public final s9.l d(k9.t tVar, JavaType javaType) {
        ArrayList arrayList;
        JavaType javaTypeD = tVar.d(javaType.f26182a);
        m9.a aVar = tVar.f203599b;
        ((p9.s) aVar.f203591b).getClass();
        p9.r rVarN = p9.s.n(tVar, javaTypeD);
        if (rVarN == null) {
            rVarN = p9.r.d(tVar, javaTypeD, p9.s.o(tVar, javaTypeD, tVar));
        }
        p9.a aVar2 = rVarN.e;
        s9.i iVarV = tVar.e().V(tVar, aVar2, javaType);
        if (iVarV == null) {
            aVar.getClass();
            arrayList = null;
            iVarV = null;
        } else {
            tVar.d.getClass();
            p pVarE = tVar.e();
            HashMap map = new HashMap();
            s9.g.M(aVar2, new r9.a(aVar2.f234183c, null), tVar, pVarE, map);
            arrayList = new ArrayList(map.values());
        }
        if (iVarV == null) {
            return null;
        }
        return iVarV.a(tVar, javaType, arrayList);
    }

    public final o0 l0(v vVar, JavaType javaType, p9.r rVar) {
        k9.t tVar = vVar.f182201a;
        if (k9.i.class.isAssignableFrom(javaType.f26182a)) {
            return q.e;
        }
        p9.f fVarC = rVar.c();
        if (fVarC == null) {
            return null;
        }
        if (tVar.b()) {
            x9.f.d(fVarC.p(), k9.l.OVERRIDE_PUBLIC_ACCESS_MODIFIERS.c(tVar.f203598a));
        }
        JavaType javaTypeH = fVarC.h();
        k9.k kVarM0 = m0(vVar, fVarC);
        if (kVarM0 == null) {
            kVarM0 = (k9.k) javaTypeH.f26184c;
        }
        r9.c cVarD = (r9.c) javaTypeH.d;
        if (cVarD == null) {
            cVarD = d(tVar, javaTypeH);
        }
        return new n(fVarC, cVarD, kVarM0);
    }
}
