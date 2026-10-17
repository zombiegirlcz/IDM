package cn0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import mm0.i;
import mm0.j;
import mm0.k;
import mm0.l;
import mm0.m;
import mm0.n;
import mm0.o;
import mm0.p;
import rm0.e0;
import zhm.a0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f25329a;

    public b(e0 securityFeatureToggles) {
        Intrinsics.checkNotNullParameter(securityFeatureToggles, "securityFeatureToggles");
        this.f25329a = securityFeatureToggles;
    }

    public final List a(k update) {
        String strValueOf;
        Intrinsics.checkNotNullParameter(update, "update");
        if (update instanceof mm0.h) {
            mm0.h hVar = (mm0.h) update;
            return v.k(new lm0.f(hVar.a()), new lm0.g(String.valueOf(hVar.a().length())));
        }
        if (update instanceof i) {
            return u.c(new lm0.h(((i) update).a().a()));
        }
        if (!(update instanceof j)) {
            if (!(update instanceof l)) {
                throw new NoWhenBranchMatchedException();
            }
            List listA = ((l) update).a();
            ArrayList arrayList = new ArrayList();
            Iterator it8 = listA.iterator();
            while (it8.hasNext()) {
                a0.x(a((k) it8.next()), arrayList);
            }
            return arrayList;
        }
        j jVar = (j) update;
        KClass kClassD = jVar.d();
        p0 p0Var = o0.f186429a;
        if (!Intrinsics.f(kClassD, p0Var.b(n.class))) {
            if (!Intrinsics.f(kClassD, p0Var.b(p.class))) {
                if (Intrinsics.f(kClassD, p0Var.b(m.class)) || Intrinsics.f(kClassD, p0Var.b(o.a.class))) {
                    throw new IllegalStateException("This type of value can not be mapped");
                }
                throw new IllegalArgumentException(String.valueOf(jVar.d().m()));
            }
            lm0.m mVar = new lm0.m(jVar.e());
            Long lA = jVar.a();
            lm0.k kVar = (lA == null || (strValueOf = String.valueOf(lA.longValue())) == null) ? null : new lm0.k(strValueOf);
            String strC = jVar.c();
            lm0.p[] elements = {mVar, kVar, strC != null ? new lm0.l(strC) : null, new lm0.o(jVar.b())};
            Intrinsics.checkNotNullParameter(elements, "elements");
            return kotlin.collections.d.L(elements);
        }
        lm0.b bVar = new lm0.b(jVar.e());
        Long lA2 = jVar.a();
        if (lA2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        lm0.e eVar = new lm0.e(String.valueOf(lA2.longValue()));
        String strC2 = jVar.c();
        if (strC2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        lm0.j jVar2 = new lm0.j(strC2);
        String strB = jVar.b();
        if (strB == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ArrayList arrayListN = v.n(bVar, eVar, jVar2, new lm0.a(strB));
        if (!this.f25329a.a()) {
            return arrayListN;
        }
        arrayListN.add(new lm0.c(jVar.e()));
        String strC3 = jVar.c();
        if (strC3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        arrayListN.add(new lm0.d(strC3));
        return arrayListN;
    }
}
