package ms7;

import es7.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ts7.d;
import ts7.e;
import ts7.f;
import ts7.g;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {
    public static final g a(i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        if (iVar instanceof i.b) {
            return new d(((i.b) iVar).f128892b);
        }
        if (iVar instanceof i.d) {
            return new f(((i.d) iVar).f128896b);
        }
        if (iVar instanceof i.c) {
            return new e(((i.c) iVar).f128894b);
        }
        if (iVar instanceof i.e) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final i b(g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        if (gVar instanceof d) {
            return new i.b(((d) gVar).f274045a);
        }
        if (gVar instanceof f) {
            return new i.d(((f) gVar).f274047a);
        }
        if (gVar instanceof e) {
            return new i.c(((e) gVar).f274046a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
