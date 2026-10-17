package opg;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import pcd.e0;
import pcd.g0;
import pcd.h0;
import pcd.l0;
import pcd.s;
import pcd.x;
import pcd.z;
import xvh.a;

/* JADX INFO: loaded from: classes9.dex */
public abstract class c {
    public static final pcd.a a(s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        g0 g0Var = sVar.f234885h;
        e0 e0Var = g0Var instanceof e0 ? (e0) g0Var : null;
        if (e0Var != null) {
            return e0Var.d;
        }
        return null;
    }

    public static final xvh.a b(s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        int i = b.f227657b[sVar.f234889n.ordinal()];
        if (i == 1) {
            switch (b.f227656a[sVar.e.ordinal()]) {
                case 1:
                    return a.c.f309271a;
                case 2:
                    throw new IllegalArgumentException("Spare change not supported for PRO_TAX");
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    return a.b.f309269a;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        if (i == 2) {
            return a.C1716a.f309267a;
        }
        if (i == 3) {
            return new xvh.b(sVar.f);
        }
        if (i == 4) {
            throw new IllegalStateException();
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalArgumentException("MoneyBoxAccountType.PERSONAL_UNDER_18 not supported");
    }

    public static final boolean c(s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        return sVar.f234883c == h0.ACTIVE;
    }

    public static final boolean d(s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        List list = sVar.k;
        return (list != null ? list.size() : 0) > 0;
    }

    public static final boolean e(String userId, s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        Intrinsics.checkNotNullParameter(userId, "userId");
        List list = sVar.k;
        x xVar = null;
        Object obj2 = null;
        if (list != null) {
            Iterator it8 = list.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                Object next = it8.next();
                if (((x) next).f234905c == z.ADMIN) {
                    obj2 = next;
                    break;
                }
            }
            xVar = (x) obj2;
        }
        if (xVar != null) {
            return !Intrinsics.f(xVar.f234903a, userId);
        }
        return false;
    }

    public static final boolean f(s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        l0.Companion.getClass();
        return l0.proVaults.contains(sVar.e);
    }

    public static final boolean g(s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        l0[] elements = {l0.GROUP, l0.REGULAR, l0.PRO_REGULAR, l0.PRO_TAX};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return d.y0(elements).contains(sVar.e);
    }

    public static final boolean h(String userId, s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        Intrinsics.checkNotNullParameter(userId, "userId");
        List list = sVar.k;
        if (list != null) {
            List<x> list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return false;
            }
            for (x xVar : list2) {
                if (xVar.f234905c == z.ADMIN && Intrinsics.f(xVar.f234903a, userId)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean i(java.lang.String r3, pcd.s r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r1 = "userId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r1)
            boolean r2 = e(r3, r4)
            if (r2 == 0) goto L4c
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r1)
            java.util.List r4 = r4.k
            if (r4 == 0) goto L3f
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L20:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L36
            java.lang.Object r0 = r4.next()
            r1 = r0
            pcd.x r1 = (pcd.x) r1
            java.lang.String r1 = r1.f234903a
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 == 0) goto L20
            goto L37
        L36:
            r0 = 0
        L37:
            pcd.x r0 = (pcd.x) r0
            if (r0 == 0) goto L3f
            java.util.Set r3 = r0.f234906g
            if (r3 != 0) goto L41
        L3f:
            zhm.h0 r3 = zhm.h0.f322473a
        L41:
            pcd.y r4 = pcd.y.WITHDRAW
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L4a
            goto L4c
        L4a:
            r3 = 0
            return r3
        L4c:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: opg.c.i(java.lang.String, pcd.s):boolean");
    }

    public static final String j(s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        String pocketId = sVar.f234885h.getPocketId();
        if (pocketId != null) {
            return pocketId;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
