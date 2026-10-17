package p9;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.MapLikeType;
import d9.b1;
import d9.c1;
import d9.m0;
import d9.n0;
import d9.o0;
import d9.p0;
import d9.q0;
import d9.u0;
import d9.v0;
import d9.w0;
import d9.x0;
import d9.y0;
import d9.z0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class y extends k9.p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Class[] f234251c = {l9.i.class, y0.class, d9.q.class, u0.class, d9.k0.class, w0.class, d9.i.class, d9.e0.class};
    public static final Class[] d = {l9.e.class, y0.class, d9.q.class, u0.class, w0.class, d9.i.class, d9.e0.class, d9.f0.class};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient x9.i f234252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f234253b;

    static {
        try {
            int i = o9.b.f223049a;
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static s9.i r0(m9.h r5, p9.p r6) {
        /*
            java.lang.Class<d9.u0> r0 = d9.u0.class
            java.lang.annotation.Annotation r0 = r6.e(r0)
            d9.u0 r0 = (d9.u0) r0
            java.lang.Class<l9.k> r1 = l9.k.class
            java.lang.annotation.Annotation r1 = r6.e(r1)
            l9.k r1 = (l9.k) r1
            java.lang.String r2 = "idType cannot be null"
            r3 = 0
            if (r1 == 0) goto L2a
            if (r0 != 0) goto L18
            goto L2c
        L18:
            java.lang.Class r1 = r1.value()
            r5.i()
            boolean r4 = r5.b()
            java.lang.Object r1 = x9.f.f(r1, r4)
            s9.i r1 = (s9.i) r1
            goto L52
        L2a:
            if (r0 != 0) goto L2d
        L2c:
            return r3
        L2d:
            d9.s0 r1 = r0.use()
            d9.s0 r4 = d9.s0.NONE
            if (r1 != r4) goto L4d
            s9.i r5 = new s9.i
            r5.<init>()
            if (r4 == 0) goto L47
            r5.f261078a = r4
            r5.d = r3
            java.lang.String r6 = r4.a()
            r5.f261080c = r6
            return r5
        L47:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>(r2)
            throw r5
        L4d:
            s9.i r1 = new s9.i
            r1.<init>()
        L52:
            java.lang.Class<l9.j> r4 = l9.j.class
            java.lang.annotation.Annotation r4 = r6.e(r4)
            l9.j r4 = (l9.j) r4
            if (r4 != 0) goto L5d
            goto L6f
        L5d:
            java.lang.Class r3 = r4.value()
            r5.i()
            boolean r5 = r5.b()
            java.lang.Object r5 = x9.f.f(r3, r5)
            r3 = r5
            s9.j r3 = (s9.j) r3
        L6f:
            d9.s0 r5 = r0.use()
            if (r5 == 0) goto Lbd
            r1.f261078a = r5
            r1.d = r3
            java.lang.String r5 = r5.a()
            r1.f261080c = r5
            d9.r0 r5 = r0.include()
            d9.r0 r2 = d9.r0.EXTERNAL_PROPERTY
            if (r5 != r2) goto L8d
            boolean r6 = r6 instanceof p9.a
            if (r6 == 0) goto L8d
            d9.r0 r5 = d9.r0.PROPERTY
        L8d:
            if (r5 == 0) goto Lb5
            r1.f261079b = r5
            java.lang.String r5 = r0.property()
            if (r5 == 0) goto L9d
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto La3
        L9d:
            d9.s0 r5 = r1.f261078a
            java.lang.String r5 = r5.a()
        La3:
            r1.f261080c = r5
            java.lang.Class r5 = r0.defaultImpl()
            java.lang.Class<d9.t0> r6 = d9.t0.class
            if (r5 == r6) goto Lb1
            boolean r5 = r5.isAnnotation()
        Lb1:
            r0.visible()
            return r1
        Lb5:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "includeAs cannot be null"
            r5.<init>(r6)
            throw r5
        Lbd:
            r1.getClass()
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>(r2)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p9.y.r0(m9.h, p9.p):s9.i");
    }

    public static boolean s0(Class cls, Class cls2) {
        return cls.isPrimitive() ? cls == x9.f.t(cls2) : cls2.isPrimitive() && cls2 == x9.f.t(cls);
    }

    @Override // k9.p
    public final d9.v A(p pVar) {
        return y(pVar);
    }

    @Override // k9.p
    public final d9.z B(p pVar) {
        d9.z zVar;
        l9.i iVar;
        d9.a0 a0Var = (d9.a0) pVar.e(d9.a0.class);
        if (a0Var == null) {
            zVar = d9.z.e;
        } else {
            d9.z zVar2 = d9.z.e;
            d9.y yVarValue = a0Var.value();
            d9.y yVarContent = a0Var.content();
            d9.y yVar = d9.y.USE_DEFAULTS;
            if (yVarValue == yVar && yVarContent == yVar) {
                zVar = zVar2;
            } else {
                Class clsValueFilter = a0Var.valueFilter();
                if (clsValueFilter == Void.class) {
                    clsValueFilter = null;
                }
                Class clsContentFilter = a0Var.contentFilter();
                zVar = new d9.z(yVarValue, yVarContent, clsValueFilter, clsContentFilter != Void.class ? clsContentFilter : null);
            }
        }
        if (zVar.f112322a == d9.y.USE_DEFAULTS && (iVar = (l9.i) pVar.e(l9.i.class)) != null) {
            int i = x.f234250a[iVar.include().ordinal()];
            if (i == 1) {
                return zVar.b(d9.y.ALWAYS);
            }
            if (i == 2) {
                return zVar.b(d9.y.NON_NULL);
            }
            if (i == 3) {
                return zVar.b(d9.y.NON_DEFAULT);
            }
            if (i == 4) {
                return zVar.b(d9.y.NON_EMPTY);
            }
        }
        return zVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.HashSet] */
    @Override // k9.p
    public final d9.b0 C(p pVar) {
        ?? hashSet;
        d9.c0 c0Var = (d9.c0) pVar.e(d9.c0.class);
        if (c0Var == null) {
            return d9.b0.f112303b;
        }
        String[] strArrValue = c0Var.value();
        if (strArrValue == null || strArrValue.length == 0) {
            hashSet = Collections.EMPTY_SET;
        } else {
            hashSet = new HashSet(strArrValue.length);
            for (String str : strArrValue) {
                hashSet.add(str);
            }
        }
        return new d9.b0(hashSet);
    }

    @Override // k9.p
    public final Integer D(f fVar) {
        int iIndex;
        d9.h0 h0Var = (d9.h0) fVar.e(d9.h0.class);
        if (h0Var == null || (iIndex = h0Var.index()) == -1) {
            return null;
        }
        return Integer.valueOf(iIndex);
    }

    @Override // k9.p
    public final s9.i E(m9.h hVar, f fVar, JavaType javaType) {
        if (javaType.H0() || javaType.D()) {
            return null;
        }
        return r0(hVar, fVar);
    }

    @Override // k9.p
    public final k9.b F(f fVar) {
        d9.e0 e0Var = (d9.e0) fVar.e(d9.e0.class);
        if (e0Var != null) {
            e0Var.value();
            return new k9.b(k9.a.MANAGED_REFERENCE);
        }
        d9.i iVar = (d9.i) fVar.e(d9.i.class);
        if (iVar == null) {
            return null;
        }
        iVar.value();
        return new k9.b(k9.a.BACK_REFERENCE);
    }

    @Override // k9.p
    public final k9.r G(a aVar) {
        d9.l0 l0Var = (d9.l0) aVar.k.a(d9.l0.class);
        if (l0Var == null) {
            return null;
        }
        String strNamespace = l0Var.namespace();
        return k9.r.b(l0Var.value(), (strNamespace == null || !strNamespace.isEmpty()) ? strNamespace : null);
    }

    @Override // k9.p
    public final Object H(f fVar) {
        l9.i iVar = (l9.i) fVar.e(l9.i.class);
        if (iVar == null) {
            return null;
        }
        Class clsContentConverter = iVar.contentConverter();
        if (clsContentConverter == null || x9.f.o(clsContentConverter)) {
            clsContentConverter = null;
        }
        if (clsContentConverter == null || clsContentConverter == x9.g.class) {
            return null;
        }
        return clsContentConverter;
    }

    @Override // k9.p
    public final Object J(p pVar) {
        l9.i iVar = (l9.i) pVar.e(l9.i.class);
        if (iVar == null) {
            return null;
        }
        Class clsConverter = iVar.converter();
        if (clsConverter == null || x9.f.o(clsConverter)) {
            clsConverter = null;
        }
        if (clsConverter == null || clsConverter == x9.g.class) {
            return null;
        }
        return clsConverter;
    }

    @Override // k9.p
    public final String[] K(a aVar) {
        d9.j0 j0Var = (d9.j0) aVar.k.a(d9.j0.class);
        if (j0Var == null) {
            return null;
        }
        return j0Var.value();
    }

    @Override // k9.p
    public final Boolean M(p pVar) {
        d9.j0 j0Var = (d9.j0) pVar.e(d9.j0.class);
        if (j0Var == null || !j0Var.alphabetic()) {
            return null;
        }
        return Boolean.TRUE;
    }

    @Override // k9.p
    public final l9.h N(p pVar) {
        l9.i iVar = (l9.i) pVar.e(l9.i.class);
        if (iVar == null) {
            return null;
        }
        return iVar.typing();
    }

    @Override // k9.p
    public final Object P(p pVar) {
        Class clsUsing;
        l9.i iVar = (l9.i) pVar.e(l9.i.class);
        if (iVar != null && (clsUsing = iVar.using()) != k9.j.class) {
            return clsUsing;
        }
        d9.k0 k0Var = (d9.k0) pVar.e(d9.k0.class);
        if (k0Var == null || !k0Var.value()) {
            return null;
        }
        return new v9.q(pVar.f(), 0, 3);
    }

    @Override // k9.p
    public final m0 R(f fVar) {
        n0 n0Var = (n0) fVar.e(n0.class);
        m0 m0Var = m0.f112307c;
        if (n0Var != null) {
            z0 z0VarNulls = n0Var.nulls();
            z0 z0VarContentNulls = n0Var.contentNulls();
            if (z0VarNulls == null) {
                z0VarNulls = z0.DEFAULT;
            }
            if (z0VarContentNulls == null) {
                z0VarContentNulls = z0.DEFAULT;
            }
            z0 z0Var = z0.DEFAULT;
            if (z0VarNulls != z0Var || z0VarContentNulls != z0Var) {
                return new m0(z0VarNulls, z0VarContentNulls);
            }
        }
        return m0Var;
    }

    @Override // k9.p
    public final List S(p pVar) {
        p0 p0Var = (p0) pVar.e(p0.class);
        if (p0Var == null) {
            return null;
        }
        o0[] o0VarArrValue = p0Var.value();
        ArrayList arrayList = new ArrayList(o0VarArrValue.length);
        for (o0 o0Var : o0VarArrValue) {
            arrayList.add(new r9.a(o0Var.value(), o0Var.name()));
            for (String str : o0Var.names()) {
                arrayList.add(new r9.a(o0Var.value(), str));
            }
        }
        return arrayList;
    }

    @Override // k9.p
    public final String U(a aVar) {
        v0 v0Var = (v0) aVar.k.a(v0.class);
        if (v0Var == null) {
            return null;
        }
        return v0Var.value();
    }

    @Override // k9.p
    public final s9.i V(k9.t tVar, a aVar, JavaType javaType) {
        return r0(tVar, aVar);
    }

    @Override // k9.p
    public final x9.n X(f fVar) {
        w0 w0Var = (w0) fVar.e(w0.class);
        if (w0Var == null || !w0Var.enabled()) {
            return null;
        }
        String strPrefix = w0Var.prefix();
        String strSuffix = w0Var.suffix();
        boolean z = false;
        boolean z3 = (strPrefix == null || strPrefix.isEmpty()) ? false : true;
        if (strSuffix != null && !strSuffix.isEmpty()) {
            z = true;
        }
        return z3 ? z ? new x9.j(strPrefix, strSuffix) : new x9.k(strPrefix, 0) : z ? new x9.k(strSuffix, 1) : x9.n.f303516a;
    }

    @Override // k9.p
    public final Class[] Y(p pVar) {
        y0 y0Var = (y0) pVar.e(y0.class);
        if (y0Var == null) {
            return null;
        }
        return y0Var.value();
    }

    @Override // k9.p
    public final Boolean Z(f fVar) {
        d9.d dVar = (d9.d) fVar.e(d9.d.class);
        if (dVar == null) {
            return null;
        }
        return Boolean.valueOf(dVar.enabled());
    }

    @Override // k9.p
    public final void a(m9.h hVar, a aVar, ArrayList arrayList) {
        Annotation annotationA = aVar.k.a(l9.d.class);
        Class cls = aVar.f234183c;
        l9.d dVar = (l9.d) annotationA;
        if (dVar == null) {
            return;
        }
        boolean zPrepend = dVar.prepend();
        l9.b[] bVarArrAttrs = dVar.attrs();
        int length = bVarArrAttrs.length;
        JavaType javaTypeD = null;
        for (int i = 0; i < length; i++) {
            if (javaTypeD == null) {
                javaTypeD = hVar.d(Object.class);
            }
            l9.b bVar = bVarArrAttrs[i];
            k9.q qVar = bVar.required() ? k9.q.f182188h : k9.q.i;
            String strValue = bVar.value();
            String strPropName = bVar.propName();
            String strPropNamespace = bVar.propNamespace();
            k9.r rVarA = strPropName.isEmpty() ? k9.r.d : (strPropNamespace == null || strPropNamespace.isEmpty()) ? k9.r.a(strPropName) : k9.r.b(strPropName, strPropNamespace);
            if (rVarA.f182194a.isEmpty()) {
                rVarA = k9.r.a(strValue);
            }
            u9.a aVar2 = new u9.a(strValue, x9.p.p(hVar, new j0(aVar, cls, strValue, javaTypeD), rVarA, qVar, bVar.include()), aVar.k, javaTypeD);
            if (zPrepend) {
                arrayList.add(i, aVar2);
            } else {
                arrayList.add(aVar2);
            }
        }
        l9.c[] cVarArrProps = dVar.props();
        if (cVarArrProps.length > 0) {
            l9.c cVar = cVarArrProps[0];
            k9.q qVar2 = cVar.required() ? k9.q.f182188h : k9.q.i;
            String strName = cVar.name();
            String strNamespace = cVar.namespace();
            k9.r rVarA2 = !strName.isEmpty() ? (strNamespace == null || strNamespace.isEmpty()) ? k9.r.a(strName) : k9.r.b(strName, strNamespace) : k9.r.d;
            x9.p.p(hVar, new j0(aVar, cls, rVarA2.f182194a, hVar.d(cVar.type())), rVarA2, qVar2, cVar.include());
            Class clsValue = cVar.value();
            hVar.i();
            ((u9.a) x9.f.f(clsValue, hVar.b())).getClass();
            throw new IllegalStateException("Should not be called on this type");
        }
    }

    @Override // k9.p
    public final boolean a0(g gVar) {
        return gVar.r(d9.d.class);
    }

    @Override // k9.p
    public final l0 b(a aVar, l0 l0Var) {
        d9.h hVar = (d9.h) aVar.k.a(d9.h.class);
        if (hVar == null) {
            return l0Var;
        }
        k0 k0Var = (k0) l0Var;
        d9.g gVar = k0Var.f234225a;
        d9.g gVar2 = k0Var.e;
        d9.g gVar3 = k0Var.d;
        d9.g gVar4 = k0Var.f234227c;
        d9.g gVar5 = k0Var.f234226b;
        d9.g gVar6 = hVar.getterVisibility();
        d9.g gVar7 = d9.g.DEFAULT;
        d9.g gVar8 = gVar6 == gVar7 ? gVar : gVar6;
        d9.g gVarIsGetterVisibility = hVar.isGetterVisibility();
        d9.g gVar9 = gVarIsGetterVisibility == gVar7 ? gVar5 : gVarIsGetterVisibility;
        d9.g gVar10 = hVar.setterVisibility();
        d9.g gVar11 = gVar10 == gVar7 ? gVar4 : gVar10;
        d9.g gVarCreatorVisibility = hVar.creatorVisibility();
        d9.g gVar12 = gVarCreatorVisibility == gVar7 ? gVar3 : gVarCreatorVisibility;
        d9.g gVarFieldVisibility = hVar.fieldVisibility();
        d9.g gVar13 = gVarFieldVisibility == gVar7 ? gVar2 : gVarFieldVisibility;
        return (gVar8 == k0Var.f234225a && gVar9 == gVar5 && gVar11 == gVar4 && gVar12 == gVar3 && gVar13 == gVar2) ? k0Var : new k0(gVar8, gVar9, gVar11, gVar12, gVar13);
    }

    @Override // k9.p
    public final Boolean b0(f fVar) {
        d9.e eVar = (d9.e) fVar.e(d9.e.class);
        if (eVar == null) {
            return null;
        }
        return Boolean.valueOf(eVar.enabled());
    }

    @Override // k9.p
    public final Object c(p pVar) {
        Class clsContentUsing;
        l9.i iVar = (l9.i) pVar.e(l9.i.class);
        if (iVar == null || (clsContentUsing = iVar.contentUsing()) == k9.j.class) {
            return null;
        }
        return clsContentUsing;
    }

    @Override // k9.p
    public final d9.j d(k9.t tVar, p pVar) {
        d9.k kVar = (d9.k) pVar.e(d9.k.class);
        if (kVar != null) {
            return kVar.mode();
        }
        if (!this.f234253b) {
            return null;
        }
        k9.l.INFER_CREATOR_FROM_CONSTRUCTOR_PROPERTIES.getClass();
        return null;
    }

    @Override // k9.p
    public final Boolean d0(f fVar) {
        d9.d0 d0Var = (d9.d0) fVar.e(d9.d0.class);
        if (d0Var == null) {
            return null;
        }
        return Boolean.valueOf(d0Var.value());
    }

    @Override // k9.p
    public final d9.j e(p pVar) {
        d9.k kVar = (d9.k) pVar.e(d9.k.class);
        if (kVar == null) {
            return null;
        }
        return kVar.mode();
    }

    @Override // k9.p
    public final Boolean e0(f fVar) {
        x0 x0Var = (x0) fVar.e(x0.class);
        if (x0Var == null) {
            return null;
        }
        return Boolean.valueOf(x0Var.value());
    }

    @Override // k9.p
    public final String[] f(Class cls, Enum[] enumArr, String[] strArr) {
        d9.h0 h0Var;
        HashMap map = null;
        for (Field field : cls.getDeclaredFields()) {
            if (field.isEnumConstant() && (h0Var = (d9.h0) field.getAnnotation(d9.h0.class)) != null) {
                String strValue = h0Var.value();
                if (!strValue.isEmpty()) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    map.put(field.getName(), strValue);
                }
            }
        }
        if (map != null) {
            int length = enumArr.length;
            for (int i = 0; i < length; i++) {
                String str = (String) map.get(enumArr[i].name());
                if (str != null) {
                    strArr[i] = str;
                }
            }
        }
        return strArr;
    }

    @Override // k9.p
    public final boolean g0(g gVar) {
        x0 x0Var = (x0) gVar.e(x0.class);
        return x0Var != null && x0Var.value();
    }

    @Override // k9.p
    public final Object h(p pVar) {
        d9.l lVar = (d9.l) pVar.e(d9.l.class);
        if (lVar == null) {
            return null;
        }
        String strValue = lVar.value();
        if (strValue.isEmpty()) {
            return null;
        }
        return strValue;
    }

    @Override // k9.p
    public final boolean h0(p pVar) {
        d9.k kVar = (d9.k) pVar.e(d9.k.class);
        return (kVar == null || kVar.mode() == d9.j.DISABLED) ? false : true;
    }

    @Override // k9.p
    public final d9.p i(p pVar) {
        d9.q qVar = (d9.q) pVar.e(d9.q.class);
        if (qVar == null) {
            return null;
        }
        String strPattern = qVar.pattern();
        d9.o oVarShape = qVar.shape();
        String strLocale = qVar.locale();
        String strTimezone = qVar.timezone();
        d9.m[] mVarArrWith = qVar.with();
        d9.m[] mVarArrWithout = qVar.without();
        int iOrdinal = 0;
        for (d9.m mVar : mVarArrWith) {
            iOrdinal |= 1 << mVar.ordinal();
        }
        int iOrdinal2 = 0;
        for (d9.m mVar2 : mVarArrWithout) {
            iOrdinal2 |= 1 << mVar2.ordinal();
        }
        d9.n nVar = new d9.n(iOrdinal, iOrdinal2);
        c1 c1VarLenient = qVar.lenient();
        c1VarLenient.getClass();
        return new d9.p(strPattern, oVarShape, strLocale, strTimezone, nVar, c1VarLenient != c1.DEFAULT ? c1VarLenient == c1.TRUE ? Boolean.TRUE : Boolean.FALSE : null);
    }

    @Override // k9.p
    public final boolean i0(f fVar) {
        d9.u uVar = (d9.u) fVar.e(d9.u.class);
        if (uVar != null) {
            return uVar.value();
        }
        return false;
    }

    @Override // k9.p
    public final d9.b k(f fVar) {
        String name;
        d9.c cVar = (d9.c) fVar.e(d9.c.class);
        if (cVar == null) {
            return null;
        }
        String strValue = cVar.value();
        c1 c1VarUseInput = cVar.useInput();
        c1VarUseInput.getClass();
        Boolean bool = c1VarUseInput == c1.DEFAULT ? null : c1VarUseInput == c1.TRUE ? Boolean.TRUE : Boolean.FALSE;
        if ("".equals(strValue)) {
            strValue = null;
        }
        d9.b bVar = (strValue == null && bool == null) ? d9.b.f112300c : new d9.b(strValue, bool);
        Object obj2 = bVar.f112301a;
        if (obj2 == null) {
            if (fVar instanceof g) {
                g gVar = (g) fVar;
                if (gVar.w().length == 0) {
                    name = fVar.f().getName();
                } else {
                    Class[] clsArrW = gVar.w();
                    name = (clsArrW.length > 0 ? clsArrW[0] : null).getName();
                }
            } else {
                name = fVar.f().getName();
            }
            if (!name.equals(obj2)) {
                return new d9.b(name, bVar.f112302b);
            }
        }
        return bVar;
    }

    @Override // k9.p
    public final Object l(f fVar) {
        d9.b bVarK = k(fVar);
        if (bVarK == null) {
            return null;
        }
        return bVarK.f112301a;
    }

    @Override // k9.p
    public final Boolean l0(f fVar) {
        d9.h0 h0Var = (d9.h0) fVar.e(d9.h0.class);
        if (h0Var != null) {
            return Boolean.valueOf(h0Var.required());
        }
        return null;
    }

    @Override // k9.p
    public final Object m(p pVar) {
        Class clsKeyUsing;
        l9.i iVar = (l9.i) pVar.e(l9.i.class);
        if (iVar == null || (clsKeyUsing = iVar.keyUsing()) == k9.j.class) {
            return null;
        }
        return clsKeyUsing;
    }

    @Override // k9.p
    public final boolean m0(Annotation annotation) {
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        x9.i iVar = this.f234252a;
        Boolean boolValueOf = (Boolean) iVar.f303509b.get(clsAnnotationType);
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(clsAnnotationType.getAnnotation(d9.a.class) != null);
            iVar.a(clsAnnotationType, boolValueOf);
        }
        return boolValueOf.booleanValue();
    }

    @Override // k9.p
    public final Boolean n(f fVar) {
        d9.f0 f0Var = (d9.f0) fVar.e(d9.f0.class);
        if (f0Var == null) {
            return null;
        }
        c1 c1VarValue = f0Var.value();
        c1VarValue.getClass();
        if (c1VarValue == c1.DEFAULT) {
            return null;
        }
        return c1VarValue == c1.TRUE ? Boolean.TRUE : Boolean.FALSE;
    }

    @Override // k9.p
    public final Boolean n0(a aVar) {
        d9.x xVar = (d9.x) aVar.k.a(d9.x.class);
        if (xVar == null) {
            return null;
        }
        return Boolean.valueOf(xVar.value());
    }

    @Override // k9.p
    public final k9.r o(f fVar) {
        boolean z;
        n0 n0Var = (n0) fVar.e(n0.class);
        if (n0Var != null) {
            String strValue = n0Var.value();
            if (!strValue.isEmpty()) {
                return k9.r.a(strValue);
            }
            z = true;
        } else {
            z = false;
        }
        d9.h0 h0Var = (d9.h0) fVar.e(d9.h0.class);
        if (h0Var != null) {
            String strNamespace = h0Var.namespace();
            return k9.r.b(h0Var.value(), (strNamespace == null || !strNamespace.isEmpty()) ? strNamespace : null);
        }
        if (z || fVar.s(d)) {
            return k9.r.d;
        }
        return null;
    }

    @Override // k9.p
    public final Boolean o0(f fVar) {
        return Boolean.valueOf(fVar.r(q0.class));
    }

    @Override // k9.p
    public final k9.r p(f fVar) {
        boolean z;
        d9.r rVar = (d9.r) fVar.e(d9.r.class);
        if (rVar != null) {
            String strValue = rVar.value();
            if (!strValue.isEmpty()) {
                return k9.r.a(strValue);
            }
            z = true;
        } else {
            z = false;
        }
        d9.h0 h0Var = (d9.h0) fVar.e(d9.h0.class);
        if (h0Var != null) {
            String strNamespace = h0Var.namespace();
            return k9.r.b(h0Var.value(), (strNamespace == null || !strNamespace.isEmpty()) ? strNamespace : null);
        }
        if (z || fVar.s(f234251c)) {
            return k9.r.d;
        }
        return null;
    }

    @Override // k9.p
    public final JavaType p0(m9.h hVar, p pVar, JavaType javaType) throws JsonMappingException {
        Class<?> clsAs;
        Class<?> clsContentAs;
        JavaType javaTypeR0;
        Class<?> clsKeyAs;
        JavaType javaTypeR02;
        w9.f fVar = hVar.f203599b.f203590a;
        l9.i iVar = (l9.i) pVar.e(l9.i.class);
        if (iVar == null || (clsAs = iVar.as()) == null || x9.f.o(clsAs)) {
            clsAs = null;
        }
        if (clsAs != null) {
            if (javaType.F0(clsAs)) {
                javaType = javaType.X0();
            } else {
                Class<?> cls = javaType.f26182a;
                try {
                    if (clsAs.isAssignableFrom(cls)) {
                        fVar.getClass();
                        javaType = w9.f.f(javaType, clsAs);
                    } else if (cls.isAssignableFrom(clsAs)) {
                        javaType = fVar.h(javaType, clsAs, false);
                    } else {
                        if (!s0(cls, clsAs)) {
                            throw new JsonMappingException(null, String.format("Cannot refine serialization type %s into %s; types not related", javaType, clsAs.getName()));
                        }
                        javaType = javaType.X0();
                    }
                } catch (IllegalArgumentException e) {
                    throw new JsonMappingException(null, String.format("Failed to widen type %s with annotation (value %s), from '%s': %s", javaType, clsAs.getName(), pVar.getName(), e.getMessage()), e);
                }
            }
        }
        if (javaType.K0()) {
            JavaType javaTypeZ0 = javaType.z0();
            if (iVar == null || (clsKeyAs = iVar.keyAs()) == null || x9.f.o(clsKeyAs)) {
                clsKeyAs = null;
            }
            if (clsKeyAs != null) {
                if (javaTypeZ0.F0(clsKeyAs)) {
                    javaTypeR02 = javaTypeZ0.X0();
                } else {
                    Class<?> cls2 = javaTypeZ0.f26182a;
                    try {
                        if (clsKeyAs.isAssignableFrom(cls2)) {
                            fVar.getClass();
                            javaTypeR02 = w9.f.f(javaTypeZ0, clsKeyAs);
                        } else if (cls2.isAssignableFrom(clsKeyAs)) {
                            javaTypeR02 = fVar.h(javaTypeZ0, clsKeyAs, false);
                        } else {
                            if (!s0(cls2, clsKeyAs)) {
                                throw new JsonMappingException(null, String.format("Cannot refine serialization key type %s into %s; types not related", javaTypeZ0, clsKeyAs.getName()));
                            }
                            javaTypeR02 = javaTypeZ0.X0();
                        }
                    } catch (IllegalArgumentException e2) {
                        throw new JsonMappingException(null, String.format("Failed to widen key type of %s with concrete-type annotation (value %s), from '%s': %s", javaType, clsKeyAs.getName(), pVar.getName(), e2.getMessage()), e2);
                    }
                }
                javaType = ((MapLikeType) javaType).X0(javaTypeR02);
            }
        }
        JavaType javaTypeV0 = javaType.v0();
        if (javaTypeV0 != null) {
            if (iVar == null || (clsContentAs = iVar.contentAs()) == null || x9.f.o(clsContentAs)) {
                clsContentAs = null;
            }
            if (clsContentAs != null) {
                if (javaTypeV0.F0(clsContentAs)) {
                    javaTypeR0 = javaTypeV0.X0();
                } else {
                    Class<?> cls3 = javaTypeV0.f26182a;
                    try {
                        if (clsContentAs.isAssignableFrom(cls3)) {
                            fVar.getClass();
                            javaTypeR0 = w9.f.f(javaTypeV0, clsContentAs);
                        } else if (cls3.isAssignableFrom(clsContentAs)) {
                            javaTypeR0 = fVar.h(javaTypeV0, clsContentAs, false);
                        } else {
                            if (!s0(cls3, clsContentAs)) {
                                throw new JsonMappingException(null, String.format("Cannot refine serialization content type %s into %s; types not related", javaTypeV0, clsContentAs.getName()));
                            }
                            javaTypeR0 = javaTypeV0.X0();
                        }
                    } catch (IllegalArgumentException e4) {
                        throw new JsonMappingException(null, String.format("Internal error: failed to refine value type of %s with concrete-type annotation (value %s), from '%s': %s", javaType, clsContentAs.getName(), pVar.getName(), e4.getMessage()), e4);
                    }
                }
                return javaType.O0(javaTypeR0);
            }
        }
        return javaType;
    }

    @Override // k9.p
    public final Object q(a aVar) {
        l9.f fVar = (l9.f) aVar.k.a(l9.f.class);
        if (fVar == null) {
            return null;
        }
        return fVar.value();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032 A[RETURN] */
    @Override // k9.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p9.g q0(p9.g r6, p9.g r7) {
        /*
            r5 = this;
            java.lang.Class[] r0 = r6.w()
            int r1 = r0.length
            r2 = 0
            r3 = 0
            if (r1 > 0) goto Lb
            r0 = r2
            goto Ld
        Lb:
            r0 = r0[r3]
        Ld:
            java.lang.Class[] r1 = r7.w()
            int r4 = r1.length
            if (r4 > 0) goto L16
            r1 = r2
            goto L18
        L16:
            r1 = r1[r3]
        L18:
            boolean r3 = r0.isPrimitive()
            if (r3 == 0) goto L25
            boolean r7 = r1.isPrimitive()
            if (r7 != 0) goto L36
            goto L32
        L25:
            boolean r3 = r1.isPrimitive()
            if (r3 == 0) goto L2c
            goto L35
        L2c:
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            if (r0 != r3) goto L33
            if (r1 == r3) goto L36
        L32:
            return r6
        L33:
            if (r1 != r3) goto L36
        L35:
            return r7
        L36:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p9.y.q0(p9.g, p9.g):p9.g");
    }

    @Override // k9.p
    public final Object r(f fVar) {
        Class clsNullsUsing;
        l9.i iVar = (l9.i) fVar.e(l9.i.class);
        if (iVar == null || (clsNullsUsing = iVar.nullsUsing()) == k9.j.class) {
            return null;
        }
        return clsNullsUsing;
    }

    @Override // k9.p
    public final b0 s(p pVar) {
        d9.s sVar = (d9.s) pVar.e(d9.s.class);
        if (sVar == null || sVar.generator() == b1.class) {
            return null;
        }
        return new b0(k9.r.a(sVar.property()), sVar.scope(), sVar.generator(), false, sVar.resolver());
    }

    @Override // k9.p
    public final b0 t(p pVar, b0 b0Var) {
        d9.t tVar = (d9.t) pVar.e(d9.t.class);
        if (tVar == null) {
            return b0Var;
        }
        if (b0Var == null) {
            b0Var = b0.f;
        }
        boolean zAlwaysAsId = tVar.alwaysAsId();
        return b0Var.e == zAlwaysAsId ? b0Var : new b0(b0Var.f234191a, b0Var.d, b0Var.f234192b, zAlwaysAsId, b0Var.f234193c);
    }

    @Override // k9.p
    public final d9.g0 u(p pVar) {
        d9.h0 h0Var = (d9.h0) pVar.e(d9.h0.class);
        if (h0Var != null) {
            return h0Var.access();
        }
        return null;
    }

    @Override // k9.p
    public final s9.i v(m9.h hVar, f fVar, JavaType javaType) {
        if (javaType.v0() != null) {
            return r0(hVar, fVar);
        }
        throw new IllegalArgumentException("Must call method with a container or reference type (got " + javaType + ")");
    }

    @Override // k9.p
    public final String w(f fVar) {
        d9.h0 h0Var = (d9.h0) fVar.e(d9.h0.class);
        if (h0Var != null) {
            String strDefaultValue = h0Var.defaultValue();
            if (!strDefaultValue.isEmpty()) {
                return strDefaultValue;
            }
        }
        return null;
    }

    @Override // k9.p
    public final String x(f fVar) {
        d9.i0 i0Var = (d9.i0) fVar.e(d9.i0.class);
        if (i0Var == null) {
            return null;
        }
        return i0Var.value();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Set] */
    @Override // k9.p
    public final d9.v y(p pVar) {
        ?? hashSet;
        d9.w wVar = (d9.w) pVar.e(d9.w.class);
        if (wVar == null) {
            return d9.v.f;
        }
        d9.v vVar = d9.v.f;
        String[] strArrValue = wVar.value();
        if (strArrValue == null || strArrValue.length == 0) {
            hashSet = Collections.EMPTY_SET;
        } else {
            hashSet = new HashSet(strArrValue.length);
            for (String str : strArrValue) {
                hashSet.add(str);
            }
        }
        ?? r2 = hashSet;
        boolean zIgnoreUnknown = wVar.ignoreUnknown();
        boolean zAllowGetters = wVar.allowGetters();
        boolean zAllowSetters = wVar.allowSetters();
        d9.v vVar2 = d9.v.f;
        return (zIgnoreUnknown == vVar2.f112320b && zAllowGetters == vVar2.f112321c && zAllowSetters == vVar2.d && !vVar2.e && (r2 == 0 || r2.size() == 0)) ? vVar2 : new d9.v(r2, zIgnoreUnknown, zAllowGetters, zAllowSetters, false);
    }
}
