package au0;

import com.fasterxml.jackson.databind.JavaType;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f9384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f9385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f9386c;
    public Object d;
    public Object e;
    public Object f;

    public u2(o navBarView) {
        j0 findScreenContentRecyclerView = new j0(1);
        Intrinsics.checkNotNullParameter(navBarView, "navBarView");
        Intrinsics.checkNotNullParameter(findScreenContentRecyclerView, "findScreenContentRecyclerView");
        this.f9385b = navBarView;
        this.f9386c = findScreenContentRecyclerView;
    }

    public static void d(JavaType javaType, ArrayList arrayList, boolean z) {
        Class cls = javaType.f26182a;
        if (z) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((JavaType) arrayList.get(i)).f26182a == cls) {
                    return;
                }
            }
            arrayList.add(javaType);
            if (cls == List.class || cls == Map.class) {
                return;
            }
        }
        Iterator it8 = javaType.y0().iterator();
        while (it8.hasNext()) {
            d((JavaType) it8.next(), arrayList, true);
        }
    }

    public static void e(JavaType javaType, ArrayList arrayList, boolean z) {
        Class cls = javaType.f26182a;
        if (cls == Object.class || cls == Enum.class) {
            return;
        }
        if (z) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((JavaType) arrayList.get(i)).f26182a == cls) {
                    return;
                }
            }
            arrayList.add(javaType);
        }
        Iterator it8 = javaType.y0().iterator();
        while (it8.hasNext()) {
            d((JavaType) it8.next(), arrayList, true);
        }
        JavaType javaTypeC0 = javaType.C0();
        if (javaTypeC0 != null) {
            e(javaTypeC0, arrayList, true);
        }
    }

    public static p9.a j(m9.h hVar, Class cls) {
        if (cls.isArray()) {
            if (hVar != null) {
                ((m9.i) hVar).f203601c.getClass();
            }
            return new p9.a(cls);
        }
        u2 u2Var = new u2(hVar, cls, hVar);
        List list = Collections.EMPTY_LIST;
        return new p9.a(null, cls, list, (Class) u2Var.f, u2Var.i(list), (w9.e) u2Var.d, (k9.p) u2Var.f9385b, hVar, hVar.f203599b.f203590a, u2Var.f9384a);
    }

    public p9.p a(p9.p pVar, Annotation[] annotationArr) {
        if (annotationArr != null) {
            for (Annotation annotation : annotationArr) {
                if (!pVar.i(annotation)) {
                    pVar = pVar.b(annotation);
                    if (((k9.p) this.f9385b).m0(annotation)) {
                        pVar = c(pVar, annotation);
                    }
                }
            }
        }
        return pVar;
    }

    public p9.p b(p9.p pVar, Class cls, Class cls2) {
        if (cls2 != null) {
            pVar = a(pVar, x9.f.h(cls2));
            Iterator it8 = x9.f.i(cls2, cls, false).iterator();
            while (it8.hasNext()) {
                pVar = a(pVar, x9.f.h((Class) it8.next()));
            }
        }
        return pVar;
    }

    public p9.p c(p9.p pVar, Annotation annotation) {
        for (Annotation annotation2 : x9.f.h(annotation.annotationType())) {
            if (!(annotation2 instanceof Target) && !(annotation2 instanceof Retention) && !pVar.i(annotation2)) {
                pVar = pVar.b(annotation2);
                if (((k9.p) this.f9385b).m0(annotation2)) {
                    pVar = c(pVar, annotation2);
                }
            }
        }
        return pVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    public void f(v2 source) {
        o oVar = (o) this.f9385b;
        Intrinsics.checkNotNullParameter(source, "source");
        if (!((Boolean) jo0.g.D.getValue()).booleanValue() || this.f9384a) {
            return;
        }
        ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ((j0) this.f9386c).invoke(oVar);
        if (screenContentRecyclerView == null) {
            m1 m1Var = (m1) this.d;
            if (m1Var != null) {
                m1Var.cancel();
            }
            m1 m1Var2 = new m1(oVar, this, source, 1);
            oVar.addOnLayoutChangeListener(m1Var2);
            this.d = m1Var2;
            return;
        }
        this.e = screenContentRecyclerView;
        at4.b bVar = new at4.b(screenContentRecyclerView, source, 2);
        bVar.invoke();
        source.setNavbarPositionChangedCallback(new aqe.a(bVar, 12));
        androidx.camera.viewfinder.a aVar = new androidx.camera.viewfinder.a(bVar, 2);
        screenContentRecyclerView.addOnLayoutChangeListener(aVar);
        this.f = aVar;
        this.f9384a = true;
    }

    public JavaType g(p9.f fVar, boolean z, JavaType javaType) {
        k9.p pVar = (k9.p) this.d;
        JavaType javaTypeP0 = pVar.p0((k9.t) this.f9385b, fVar, javaType);
        if (javaTypeP0 != javaType) {
            Class<?> cls = javaTypeP0.f26182a;
            Class<?> cls2 = javaType.f26182a;
            if (!cls.isAssignableFrom(cls2) && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Illegal concrete-type annotation for method '" + fVar.getName() + "': class " + cls.getName() + " not a super-type of (declared) class " + cls2.getName());
            }
            javaType = javaTypeP0;
            z = true;
        }
        l9.h hVarN = pVar.N(fVar);
        if (hVarN != null && hVarN != l9.h.DEFAULT_TYPING) {
            z = hVarN == l9.h.STATIC;
        }
        if (z) {
            return javaType.X0();
        }
        return null;
    }

    public void h() {
        androidx.camera.viewfinder.a aVar;
        this.f9384a = false;
        m1 m1Var = (m1) this.d;
        if (m1Var != null) {
            m1Var.cancel();
        }
        this.d = null;
        ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) this.e;
        if (screenContentRecyclerView != null && (aVar = (androidx.camera.viewfinder.a) this.f) != null) {
            screenContentRecyclerView.removeOnLayoutChangeListener(aVar);
        }
        this.f = null;
        this.e = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public x9.a i(java.util.List r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.e
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r1 = r7.f9384a
            java.lang.Object r2 = r7.f9386c
            p9.u r2 = (p9.u) r2
            java.lang.Object r3 = r7.f9385b
            k9.p r3 = (k9.p) r3
            if (r3 != 0) goto L11
            goto L22
        L11:
            if (r2 == 0) goto L1d
            boolean r3 = r2 instanceof p9.h0
            if (r3 == 0) goto L1b
            r3 = r2
            p9.h0 r3 = (p9.h0) r3
            goto L1d
        L1b:
            r3 = 1
            goto L1e
        L1d:
            r3 = 0
        L1e:
            if (r3 != 0) goto L25
            if (r1 != 0) goto L25
        L22:
            dl.a r8 = p9.p.f234235a
            return r8
        L25:
            java.lang.Object r4 = r7.f
            java.lang.Class r4 = (java.lang.Class) r4
            p9.l r5 = p9.l.f234228b
            if (r4 == 0) goto L31
            p9.p r5 = r7.b(r5, r0, r4)
        L31:
            if (r1 == 0) goto L3b
            java.lang.annotation.Annotation[] r0 = x9.f.h(r0)
            p9.p r5 = r7.a(r5, r0)
        L3b:
            java.util.Iterator r8 = r8.iterator()
        L3f:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L65
            java.lang.Object r0 = r8.next()
            com.fasterxml.jackson.databind.JavaType r0 = (com.fasterxml.jackson.databind.JavaType) r0
            if (r3 == 0) goto L57
            java.lang.Class r4 = r0.f26182a
            java.lang.Class r6 = r2.a(r4)
            p9.p r5 = r7.b(r5, r4, r6)
        L57:
            if (r1 == 0) goto L3f
            java.lang.Class r0 = r0.f26182a
            java.lang.annotation.Annotation[] r0 = x9.f.h(r0)
            p9.p r0 = r7.a(r5, r0)
            r5 = r0
            goto L3f
        L65:
            if (r3 == 0) goto L71
            java.lang.Class<java.lang.Object> r8 = java.lang.Object.class
            java.lang.Class r0 = r2.a(r8)
            p9.p r5 = r7.b(r5, r8, r0)
        L71:
            x9.a r8 = r5.d()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: au0.u2.i(java.util.List):x9.a");
    }

    public u2(m9.h hVar, JavaType javaType, m9.h hVar2) {
        Class cls = javaType.f26182a;
        this.e = cls;
        this.f9386c = hVar2;
        this.d = javaType.u0();
        k9.p pVarE = k9.l.USE_ANNOTATIONS.c(hVar.f203598a) ? hVar.e() : null;
        this.f9385b = pVarE;
        ((m9.i) hVar2).a(cls);
        this.f = null;
        this.f9384a = (pVarE == null || (x9.f.p(cls) && javaType.H0())) ? false : true;
    }

    public u2(k9.t tVar, p9.r rVar) {
        d9.z zVarB;
        this.f9385b = tVar;
        this.f9386c = rVar;
        d9.z zVarA = d9.z.e;
        k9.p pVar = rVar.d;
        if (pVar == null || (zVarB = pVar.B(rVar.e)) == null) {
            zVarB = zVarA;
        } else if (zVarA != null) {
            zVarB = zVarA.a(zVarB);
        }
        tVar.f(rVar.f234239a.f26182a);
        zVarA = zVarB != null ? zVarB.a(zVarA) : zVarA;
        d9.z zVar = (d9.z) tVar.f203602g.f25476b;
        this.f = zVar == null ? zVarA : zVar.a(zVarA);
        this.f9384a = zVarA.f112322a == d9.y.NON_DEFAULT;
        this.d = tVar.e();
    }

    public u2(m9.h hVar, Class cls, m9.h hVar2) {
        this.e = cls;
        this.f9386c = hVar2;
        this.d = w9.e.f295672g;
        if (hVar == null) {
            this.f9385b = null;
            this.f = null;
        } else {
            this.f9385b = k9.l.USE_ANNOTATIONS.c(hVar.f203598a) ? hVar.e() : null;
            if (hVar2 != null) {
                ((m9.i) hVar2).a(cls);
            }
            this.f = null;
        }
        this.f9384a = ((k9.p) this.f9385b) != null;
    }
}
