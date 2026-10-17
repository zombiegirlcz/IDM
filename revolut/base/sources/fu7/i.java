package fu7;

import du7.v4;
import du7.z4;
import gu7.e3;
import gu7.h3;
import gu7.k3;
import gu7.n3;
import gu7.q3;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class i {
    public static final e3 a(v4 v4Var) {
        Intrinsics.checkNotNullParameter(v4Var, "<this>");
        if (v4Var instanceof v4.b) {
            return new h3(((v4.b) v4Var).f117870a);
        }
        if (v4Var instanceof v4.c) {
            return new k3(((v4.c) v4Var).f117872a);
        }
        if (v4Var instanceof v4.e) {
            v4.e eVar = (v4.e) v4Var;
            return new n3(eVar.f117876a, eVar.f117877b);
        }
        if (v4Var instanceof v4.d) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final q3 b(z4 z4Var) {
        Intrinsics.checkNotNullParameter(z4Var, "<this>");
        try {
            String str = z4Var.f117928a;
            String str2 = z4Var.f117929b;
            String str3 = z4Var.f117930c;
            v4 v4Var = z4Var.d;
            e3 e3VarA = v4Var != null ? a(v4Var) : null;
            if (e3VarA != null) {
                return new q3(str, str2, str3, e3VarA);
            }
            throw new IllegalStateException("Required value was null.");
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final gu7.x3 c(du7.g5 r7) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = r7.f117682a
            java.lang.String r7 = r7.f117683b
            if (r7 == 0) goto L27
            gu7.y3[] r1 = gu7.y3.values()
            int r2 = r1.length
            r3 = 0
        L11:
            if (r3 >= r2) goto L24
            r4 = r1[r3]
            java.lang.String r5 = r4.name()
            r6 = 1
            boolean r5 = kotlin.text.a0.z(r5, r7, r6)
            if (r5 == 0) goto L21
            goto L25
        L21:
            int r3 = r3 + 1
            goto L11
        L24:
            r4 = 0
        L25:
            if (r4 != 0) goto L29
        L27:
            gu7.y3 r4 = gu7.y3.UNKNOWN
        L29:
            gu7.x3 r7 = new gu7.x3
            r7.<init>(r0, r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: fu7.i.c(du7.g5):gu7.x3");
    }
}
