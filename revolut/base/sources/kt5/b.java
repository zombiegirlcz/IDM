package kt5;

import io3.l;
import k71.k;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import tof.cc;
import tof.i7;
import tof.n7;
import tof.o3;
import tof.o7;
import tof.oa;
import tof.q7;
import tof.q8;
import tof.w5;
import tof.xa;
import tof.y6;
import tof.za;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q7 f189500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final oa f189501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q7 f189502c;
    public static final q7 d;
    public static final oa e;

    static {
        i7.c cVar = i7.Companion;
        y6[] y6VarArr = {y6.DERIVATIVE_PNL};
        cVar.getClass();
        cc ccVarD = i7.c.d(y6VarArr);
        l lVar = l.COLLATERAL;
        q7 q7VarA = i7.c.a(ccVarD, i7.c.b(new xa(lVar), new q8(lVar)));
        f189500a = q7VarA;
        q7 q7VarA2 = i7.c.a(i7.c.d(y6.FEE), i7.c.b(new xa(lVar), new q8(lVar)));
        y6 y6Var = y6.TRANSFER;
        oa oaVarB = i7.c.b(q7VarA2, i7.c.a(i7.c.d(y6Var), i7.c.b(new xa(lVar), new q8(lVar)), new za("revx_funding_payment")));
        f189501b = oaVarB;
        y6 y6Var2 = y6.REVX_TRANSFER;
        y6 y6Var3 = y6.EXCHANGE;
        cc ccVarD2 = i7.c.d(y6Var, y6Var2, y6Var3);
        l lVar2 = l.COLLATERAL_PROXY;
        q7 q7VarA3 = i7.c.a(ccVarD2, i7.c.b(new q8(lVar2)), new o7());
        f189502c = q7VarA3;
        q7 q7VarA4 = i7.c.a(i7.c.d(y6Var, y6Var2, y6Var3), i7.c.b(new q8(lVar2)), new n7());
        d = q7VarA4;
        e = i7.c.b(q7VarA, q7VarA2, q7VarA3, q7VarA4);
        i7.c.b(q7VarA, oaVarB, q7VarA3, q7VarA4);
    }

    private b() {
    }

    public static boolean a(a3 transaction) {
        w5 w5Var;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        if (b(transaction)) {
            return true;
        }
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        y6 y6Var = transaction.e;
        if (y6Var != y6.TRANSFER && y6Var != y6.REVX_TRANSFER && y6Var != y6.EXCHANGE) {
            return false;
        }
        o3 o3Var = transaction.J;
        return ((o3Var == null || (w5Var = o3Var.f272966b) == null) ? null : w5Var.f273144b) == l.COLLATERAL_PROXY && k.b(transaction).f115082a > 0;
    }

    public static boolean b(a3 transaction) {
        w5 w5Var;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        y6 y6Var = transaction.e;
        if (y6Var != y6.TRANSFER && y6Var != y6.REVX_TRANSFER && y6Var != y6.EXCHANGE) {
            return false;
        }
        o3 o3Var = transaction.J;
        return ((o3Var == null || (w5Var = o3Var.f272966b) == null) ? null : w5Var.f273144b) == l.COLLATERAL_PROXY && k.b(transaction).f115082a < 0;
    }

    public static boolean c(a3 transaction) {
        w5 w5Var;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        if (transaction.e != y6.FEE) {
            return false;
        }
        l lVar = transaction.f272624y.f273144b;
        l lVar2 = l.COLLATERAL;
        if (lVar == lVar2) {
            return true;
        }
        o3 o3Var = transaction.J;
        return ((o3Var == null || (w5Var = o3Var.f272966b) == null) ? null : w5Var.f273144b) == lVar2;
    }

    public static boolean d(a3 transaction) {
        w5 w5Var;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        if (transaction.e != y6.TRANSFER || !Intrinsics.f(transaction.f272611s, "revx_funding_payment")) {
            return false;
        }
        l lVar = transaction.f272624y.f273144b;
        l lVar2 = l.COLLATERAL;
        if (lVar == lVar2) {
            return true;
        }
        o3 o3Var = transaction.J;
        return ((o3Var == null || (w5Var = o3Var.f272966b) == null) ? null : w5Var.f273144b) == lVar2;
    }
}
