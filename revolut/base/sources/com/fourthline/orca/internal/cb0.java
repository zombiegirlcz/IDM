package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class cb0 {
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final com.fourthline.orca.internal.mf a(com.fourthline.orca.internal.bb0 r17) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.cb0.a(com.fourthline.orca.internal.bb0):com.fourthline.orca.internal.mf");
    }

    public static final bb0 b(bb0 bb0Var) {
        Intrinsics.checkNotNullParameter(bb0Var, "<this>");
        mf mfVarA = a(bb0Var);
        double dA = mfVarA.a();
        double dB = mfVarA.b();
        String strC = mfVarA.c();
        Double dJ = bb0Var.j();
        double dDoubleValue = (dJ != null ? dJ.doubleValue() : 0.0d) + dA;
        return bb0.a(bb0Var, 0L, 0L, 0L, null, null, null, null, null, null, Double.valueOf(dA), Double.valueOf(dB), Double.valueOf(dDoubleValue), null, null, null, null, strC, a(bb0Var, dDoubleValue), 61951, null);
    }

    private static final boolean b(bb0 bb0Var, boolean z, boolean z3) {
        return (z && bb0Var.q() != null && (bb0Var.q().doubleValue() > 512.0d ? 1 : (bb0Var.q().doubleValue() == 512.0d ? 0 : -1)) < 0) || (z3 && bb0Var.c() != null && (bb0Var.c().doubleValue() > 512.0d ? 1 : (bb0Var.c().doubleValue() == 512.0d ? 0 : -1)) < 0);
    }

    private static final boolean a(bb0 bb0Var, boolean z, boolean z3) {
        return (!z || (bb0Var.q() != null && (bb0Var.q().doubleValue() > 1024.0d ? 1 : (bb0Var.q().doubleValue() == 1024.0d ? 0 : -1)) >= 0)) && (!z3 || (bb0Var.c() != null && (bb0Var.c().doubleValue() > 1024.0d ? 1 : (bb0Var.c().doubleValue() == 1024.0d ? 0 : -1)) >= 0));
    }

    private static final String a(bb0 bb0Var, double d) {
        if (bb0Var.p() <= 0) {
            return "unknown";
        }
        if (bb0Var.n() == null && bb0Var.b() == null) {
            return "unknown";
        }
        if (bb0Var.i() + bb0Var.k() <= 10240) {
            return Intrinsics.f(bb0Var.r(), Boolean.TRUE) ? "average" : d > 1500.0d ? "weak" : d < 300.0d ? "strong" : "average";
        }
        boolean z = bb0Var.i() > 10240;
        boolean z3 = bb0Var.k() > 10240;
        return b(bb0Var, z, z3) ? "weak" : a(bb0Var, z, z3) ? "strong" : "average";
    }
}
