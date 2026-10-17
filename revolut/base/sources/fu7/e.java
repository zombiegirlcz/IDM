package fu7;

import com.revolut.feature.insurance_embedded.impl.data.model.Website;
import com.revolut.feature.insurance_embedded.impl.data.model.a0;
import com.revolut.feature.insurance_embedded.impl.data.model.b0;
import com.revolut.feature.insurance_embedded.impl.data.model.c0;
import com.revolut.feature.insurance_embedded.impl.data.model.d0;
import com.revolut.feature.insurance_embedded.impl.data.model.v;
import com.revolut.feature.insurance_embedded.impl.data.model.x;
import com.revolut.feature.insurance_embedded.impl.data.model.y;
import com.revolut.feature.insurance_embedded.impl.data.model.z;
import du7.m1;
import du7.p1;
import du7.q7;
import du7.s1;
import du7.t1;
import gu7.e1;
import gu7.f1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e {
    public static final v a(m1 m1Var) {
        Intrinsics.checkNotNullParameter(m1Var, "<this>");
        if (m1Var instanceof m1.b) {
            m1.b bVar = (m1.b) m1Var;
            List list = bVar.f117759a;
            q7 q7Var = bVar.f117760b;
            Intrinsics.checkNotNullParameter(q7Var, "<this>");
            return new x(list, new Website(q7Var.f117823a, q7Var.f117824b));
        }
        if (m1Var instanceof m1.d) {
            return new y(((m1.d) m1Var).f117762a);
        }
        if (m1Var instanceof m1.e) {
            return new z(((m1.e) m1Var).f117764a);
        }
        if (m1Var instanceof m1.a) {
            return v.a.INSTANCE;
        }
        if (m1Var instanceof m1.g) {
            s1 s1Var = ((m1.g) m1Var).f117768a;
            return new b0(new e1(s1Var.f117835a, s1Var.f117836b));
        }
        if (m1Var instanceof m1.h) {
            return new c0(((m1.h) m1Var).f117770a);
        }
        if (m1Var instanceof m1.f) {
            return new a0(((m1.f) m1Var).f117766a);
        }
        if (m1Var instanceof m1.i) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final f1 b(t1 t1Var) {
        Intrinsics.checkNotNullParameter(t1Var, "<this>");
        String str = t1Var.f117849a;
        List<p1> list = t1Var.f117850b;
        ArrayList arrayList = new ArrayList();
        for (p1 p1Var : list) {
            Intrinsics.checkNotNullParameter(p1Var, "<this>");
            d0 d0Var = null;
            try {
                String str2 = p1Var.f117803b;
                String str3 = p1Var.f117802a;
                String str4 = p1Var.f117804c;
                m1 m1Var = p1Var.d;
                v vVarA = m1Var != null ? a(m1Var) : null;
                if (vVarA == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                d0Var = new d0(str2, str3, str4, vVarA);
            } catch (Exception e) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            }
            if (d0Var != null) {
                arrayList.add(d0Var);
            }
        }
        return new f1(str, arrayList);
    }
}
