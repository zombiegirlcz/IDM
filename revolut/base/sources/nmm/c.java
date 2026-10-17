package nmm;

import kotlin.jvm.internal.Intrinsics;
import mmm.h0;

/* JADX INFO: loaded from: classes14.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mmm.m f217395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final mmm.m f217396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final mmm.m f217397c;
    public static final mmm.m d;
    public static final mmm.m e;

    static {
        mmm.m.Companion.getClass();
        f217395a = mmm.l.c("/");
        f217396b = mmm.l.c("\\");
        f217397c = mmm.l.c("/\\");
        d = mmm.l.c(".");
        e = mmm.l.c("..");
    }

    public static final int a(h0 h0Var) {
        mmm.m mVar = h0Var.f207272a;
        if (mVar.d() != 0) {
            if (mVar.k(0) != 47) {
                if (mVar.k(0) == 92) {
                    if (mVar.d() > 2 && mVar.k(1) == 92) {
                        mmm.m other = f217396b;
                        Intrinsics.checkNotNullParameter(other, "other");
                        int iF = mVar.f(2, other.i());
                        return iF == -1 ? mVar.d() : iF;
                    }
                } else if (mVar.d() > 2 && mVar.k(1) == 58 && mVar.k(2) == 92) {
                    char cK = (char) mVar.k(0);
                    if ('a' <= cK && cK < '{') {
                        return 3;
                    }
                    if ('A' <= cK && cK < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    public static final h0 b(h0 h0Var, h0 child, boolean z) {
        Intrinsics.checkNotNullParameter(h0Var, "<this>");
        Intrinsics.checkNotNullParameter(child, "child");
        child.getClass();
        if (a(child) != -1 || child.g() != null) {
            return child;
        }
        mmm.m mVarC = c(h0Var);
        if (mVarC == null && (mVarC = c(child)) == null) {
            mVarC = f(h0.f207271b);
        }
        mmm.h hVar = new mmm.h();
        hVar.v(h0Var.f207272a);
        if (hVar.f207266b > 0) {
            hVar.v(mVarC);
        }
        hVar.v(child.f207272a);
        return d(hVar, z);
    }

    public static final mmm.m c(h0 h0Var) {
        mmm.m mVar = h0Var.f207272a;
        mmm.m mVar2 = f217395a;
        if (mmm.m.h(mVar, mVar2) != -1) {
            return mVar2;
        }
        mmm.m mVar3 = h0Var.f207272a;
        mmm.m mVar4 = f217396b;
        if (mmm.m.h(mVar3, mVar4) != -1) {
            return mVar4;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0118 A[EDGE_INSN: B:100:0x0118->B:82:0x0118 BREAK  A[LOOP:1: B:54:0x00b3->B:113:0x00b3], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final mmm.h0 d(mmm.h r17, boolean r18) throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nmm.c.d(mmm.h, boolean):mmm.h0");
    }

    public static final mmm.m e(byte b4) {
        if (b4 == 47) {
            return f217395a;
        }
        if (b4 == 92) {
            return f217396b;
        }
        throw new IllegalArgumentException(a0.d.n("not a directory separator: ", b4));
    }

    public static final mmm.m f(String str) {
        if (Intrinsics.f(str, "/")) {
            return f217395a;
        }
        if (Intrinsics.f(str, "\\")) {
            return f217396b;
        }
        throw new IllegalArgumentException(j6.a.q("not a directory separator: ", str));
    }
}
