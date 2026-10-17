package uz7;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nkm.d0;
import nkm.y;
import zhm.b0;
import zw7.h0;
import zw7.h1;

/* JADX INFO: loaded from: classes4.dex */
public final class v {
    public static h1 a(h0 h0Var, String str) {
        Object next;
        Iterator it8 = h0Var.e.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((h1) next).f325791a, str)) {
                break;
            }
        }
        return (h1) next;
    }

    public static List b(h0 plan) {
        Intrinsics.checkNotNullParameter(plan, "plan");
        d0 d0VarX = y.x(y.l(zhm.d0.Q(plan.e), new uyh.t(7)), new kotlin.jvm.internal.h0() { // from class: uz7.s
            @Override // kotlin.jvm.internal.h0, wim.p
            public final Object get(Object obj2) {
                return ((h1) obj2).d;
            }
        });
        Intrinsics.checkNotNullParameter(d0VarX, "<this>");
        return y.J(new nkm.m(d0VarX, 1));
    }

    public static kotlin.text.m c(h0 plan) {
        Intrinsics.checkNotNullParameter(plan, "plan");
        return b0.L(y.J(y.F(y.x(y.l(zhm.d0.Q(plan.e), new uyh.t(6)), new kotlin.jvm.internal.h0() { // from class: uz7.u
            @Override // kotlin.jvm.internal.h0, wim.p
            public final Object get(Object obj2) {
                return ((h1) obj2).f325793c;
            }
        }), cim.b.i(new t(), cim.b.e()))));
    }
}
