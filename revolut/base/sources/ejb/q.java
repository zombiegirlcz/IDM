package ejb;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import tof.g9;
import tof.i7;
import tof.n7;
import tof.o7;

/* JADX INFO: loaded from: classes6.dex */
public abstract class q {
    public static final i7 a(o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        int i = p.f126855a[oVar.ordinal()];
        if (i == 1) {
            return new g9(true);
        }
        if (i != 2) {
            if (i == 3) {
                return new o7();
            }
            throw new NoWhenBranchMatchedException();
        }
        i7.c cVar = i7.Companion;
        i7[] i7VarArr = {new n7(), new g9(false)};
        cVar.getClass();
        return i7.c.a(i7VarArr);
    }
}
