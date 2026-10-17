package fu7;

import com.revolut.feature.insurance_embedded.impl.data.model.p;
import com.revolut.feature.insurance_embedded.impl.data.model.r;
import com.revolut.feature.insurance_embedded.impl.data.model.s;
import com.revolut.feature.insurance_embedded.impl.data.model.t;
import du7.d1;
import du7.g1;
import du7.h1;
import du7.i1;
import du7.t1;
import du7.w0;
import du7.z0;
import gu7.a0;
import gu7.e0;
import gu7.m0;
import gu7.u;
import gu7.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {
    public static final m0 a(i1 i1Var) {
        ArrayList arrayList;
        u a0Var;
        List list;
        Intrinsics.checkNotNullParameter(i1Var, "<this>");
        String str = i1Var.f117712a;
        h1 h1Var = i1Var.f117713b;
        e0 e0Var = null;
        rVar = null;
        s rVar = null;
        p pVar = null;
        if (h1Var == null || (list = h1Var.f117691a) == null) {
            arrayList = null;
        } else {
            List list2 = list;
            arrayList = new ArrayList(w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList.add(e.b((t1) it8.next()));
            }
        }
        w0 w0Var = i1Var.f117714c;
        if (w0Var != null) {
            Intrinsics.checkNotNullParameter(w0Var, "<this>");
            if (w0Var instanceof w0.b) {
                a0Var = new x(((w0.b) w0Var).f117884a);
            } else if (w0Var instanceof w0.c) {
                a0Var = new a0(((w0.c) w0Var).f117886a);
            } else {
                if (!(w0Var instanceof w0.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                a0Var = null;
            }
        } else {
            a0Var = null;
        }
        g1 g1Var = i1Var.d;
        if (g1Var != null) {
            Intrinsics.checkNotNullParameter(g1Var, "<this>");
            d1 d1Var = g1Var.f117679a;
            if (d1Var != null) {
                Intrinsics.checkNotNullParameter(d1Var, "<this>");
                String str2 = d1Var.f117627a;
                z0 z0Var = d1Var.f117628b;
                if (z0Var != null) {
                    Intrinsics.checkNotNullParameter(z0Var, "<this>");
                    if (z0Var instanceof z0.c) {
                        rVar = new t(((z0.c) z0Var).f117918a);
                    } else if (z0Var instanceof z0.d) {
                        rVar = new com.revolut.feature.insurance_embedded.impl.data.model.u(((z0.d) z0Var).f117920a);
                    } else if (z0Var instanceof z0.a) {
                        rVar = new r(a.c(((z0.a) z0Var).f117916a));
                    } else if (!(z0Var instanceof z0.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                pVar = new p(str2, rVar);
            }
            e0Var = new e0(pVar);
        }
        return new m0(str, arrayList, a0Var, e0Var);
    }
}
