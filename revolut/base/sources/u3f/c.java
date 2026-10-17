package u3f;

import dfl.q0;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import le.u1;

/* JADX INFO: loaded from: classes8.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f276929a;

    static {
        String str;
        q0[] q0VarArrValues = q0.values();
        int iB = zhm.q0.b(q0VarArrValues.length);
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (q0 q0Var : q0VarArrValues) {
            int i = b.f276928a[q0Var.ordinal()];
            if (i == 1) {
                str = "CREATED";
            } else if (i == 2) {
                str = "PENDING";
            } else if (i == 3) {
                str = "COMPLETED";
            } else if (i == 4) {
                str = "DECLINED";
            } else {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "CANCELLED";
            }
            linkedHashMap.put(str, q0Var);
        }
        f276929a = linkedHashMap;
    }

    public static final q0 a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return (q0) u1.u(str, f276929a);
    }
}
