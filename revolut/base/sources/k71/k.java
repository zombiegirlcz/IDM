package k71;

import com.revolut.domain.models.joint.InternalJointTransferType;
import com.revolut.domain.models.transactions.SavingsDirection;
import com.revolut.domain.models.transactions.SavingsTransactionLeg;
import do3.r;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import tof.a3;
import tof.b7;
import tof.d3;
import tof.d7;
import tof.e3;
import tof.f5;
import tof.g5;
import tof.h3;
import tof.i2;
import tof.i3;
import tof.ic;
import tof.j5;
import tof.jc;
import tof.k3;
import tof.l2;
import tof.m3;
import tof.n1;
import tof.n3;
import tof.o3;
import tof.p1;
import tof.p2;
import tof.p3;
import tof.q2;
import tof.r3;
import tof.s0;
import tof.t0;
import tof.t6;
import tof.u2;
import tof.v5;
import tof.v6;
import tof.w5;
import tof.w6;
import tof.x1;
import tof.x6;
import tof.y2;
import tof.y6;
import tof.z0;
import tof.z6;
import zhm.a0;
import zhm.d0;
import zhm.f0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f181789a;

    static {
        y6[] elements = {y6.REFUND, y6.CARD_REFUND, y6.CHARGE_REFUND, y6.MERCHANT_REFUND, y6.REV_PAYMENT_REFUND};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f181789a = kotlin.collections.d.y0(elements);
    }

    public static final boolean A(a3 a3Var) {
        w5 w5Var;
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        if (a3Var.e != y6.EXCHANGE) {
            return false;
        }
        o3 o3Var = a3Var.J;
        io3.l lVar = (o3Var == null || (w5Var = o3Var.f272966b) == null) ? null : w5Var.f273144b;
        io3.l lVar2 = io3.l.REVX_FIAT;
        return lVar == lVar2 && a3Var.f272624y.f273144b == lVar2;
    }

    public static final boolean A0(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        if (!y0(a3Var) || !cp5.d.A(a3Var.k.f115083b)) {
            return false;
        }
        o3 o3Var = a3Var.J;
        return (o3Var != null ? o3Var.f272965a : null) != null;
    }

    public static final u2 A1(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        d3 d3Var = a3Var.E;
        w5 w5Var = a3Var.f272624y;
        d3 d3Var2 = a3Var.E;
        if (d3Var != null) {
            if ((d3Var != null ? d3Var.f272683b : null) == yvh.f.SPARE_CHANGE) {
                io3.l lVar = w5Var.f273144b;
                io3.l lVar2 = io3.l.CURRENT;
                if ((lVar == lVar2 || lVar == io3.l.SAVINGS || lVar == io3.l.SAVINGS_EXTERNAL) && n0(a3Var)) {
                    String str = d3Var2 != null ? d3Var2.f272682a : null;
                    d7 d7Var = a3Var.S;
                    if (Intrinsics.f(str, d7Var != null ? d7Var.f272692a : null)) {
                        return u2.VAULT;
                    }
                }
                if (j1(a3Var)) {
                    String str2 = d3Var2 != null ? d3Var2.f272682a : null;
                    jc jcVar = a3Var.J0;
                    if (Intrinsics.f(str2, jcVar != null ? jcVar.f272866a : null)) {
                        return u2.ROBO;
                    }
                }
                io3.l lVar3 = w5Var.f273144b;
                if (lVar3 == lVar2) {
                    if ((d3Var2 != null ? d3Var2.f272684c : null) == yvh.h.LOYALTY_PROFILE) {
                        return u2.REVPOINTS;
                    }
                }
                if (lVar3 == lVar2 && !n0(a3Var)) {
                    if ((d3Var2 != null ? d3Var2.f272684c : null) == yvh.h.CURRENT_POCKET) {
                        return u2.CRYPTO;
                    }
                }
                if (w5Var.f273144b == lVar2 && !n0(a3Var)) {
                    if ((d3Var2 != null ? d3Var2.f272684c : null) != yvh.h.CURRENT_POCKET) {
                        if ((d3Var2 != null ? d3Var2.f272684c : null) != yvh.h.LOYALTY_PROFILE) {
                            if ((d3Var2 != null ? d3Var2.f272684c : null) != yvh.h.WEALTH_PORTFOLIO) {
                                return u2.CHARITY;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public static final boolean B(a3 a3Var) {
        dj0.d dVar;
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        if (a3Var.e != y6.EXCHANGE || !cp5.d.A(a3Var.k.f115083b)) {
            return false;
        }
        o3 o3Var = a3Var.J;
        return cp5.d.A((o3Var == null || (dVar = o3Var.f272965a) == null) ? null : dVar.f115083b);
    }

    public static final boolean B0(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        String str = a3Var.f272611s;
        y6 y6Var = a3Var.e;
        if (!Intrinsics.f(str, "revx_topup")) {
            return false;
        }
        int i = j.f181788c[a3Var.L1.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (y6Var != y6.TOPUP) {
                return false;
            }
        } else if (y6Var != y6.TRANSFER) {
            return false;
        }
        return true;
    }

    public static final boolean C(a3 a3Var) {
        j5 j5Var;
        String str;
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        Integer[] elements = {7800, 7801, 7802, 7995, 9406, 9754};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set setY0 = kotlin.collections.d.y0(elements);
        h3 h3Var = a3Var.A;
        return d0.T(setY0, (h3Var == null || (j5Var = h3Var.f272779a) == null || (str = j5Var.e) == null) ? null : z.m(str));
    }

    public static final boolean C0(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        String str = a3Var.f272611s;
        y6 y6Var = a3Var.e;
        if (!Intrinsics.f(str, "revx_withdrawal")) {
            return false;
        }
        int i = j.f181788c[a3Var.L1.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (y6Var != y6.TRANSFER) {
                return false;
            }
        } else if (y6Var != y6.TOPUP) {
            return false;
        }
        return true;
    }

    public static final boolean D(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        return a3Var.f272604o0 == y2.GOOGLE_PAY;
    }

    public static final boolean D0(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        ibd.i iVar = a3Var.C;
        return (iVar != null ? iVar.getType() : null) == ibd.h.EXTERNAL_MANDATE;
    }

    public static final boolean E(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        return !v.k(v6.DECLINED, v6.CANCELLED, v6.REVERTED, v6.FAILED).contains(a3Var.f);
    }

    public static final boolean E0(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        return a3Var.e == y6.REWARD && a3Var.f272622x0 != null;
    }

    public static final boolean F(a3 a3Var) {
        s0 s0Var;
        dj0.d dVar;
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        m3 m3Var = a3Var.f272589e1;
        return (m3Var == null || (s0Var = m3Var.f272931c) == null || (dVar = s0Var.f273037b) == null || dVar.f115082a == 0) ? false : true;
    }

    public static final boolean F0(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        return a3Var.e == y6.TOPUP && a3Var.f272602n0 == w6.EXTERNAL_ACCOUNT;
    }

    public static final boolean G(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        return a3Var.c0 != null;
    }

    public static final boolean G0(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        return a3Var.e == y6.TOPUP && a3Var.f272602n0 == w6.EXTERNAL_CARD;
    }

    public static final boolean H(a3 a3Var) {
        z3l.a aVar;
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        m3 m3Var = a3Var.f272589e1;
        List list = (m3Var == null || (aVar = m3Var.f272930b) == null) ? null : aVar.f319298a;
        if (list == null) {
            list = f0.f322471a;
        }
        List<z3l.b> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (z3l.b bVar : list2) {
            if (Intrinsics.f(bVar.f319300a, "consumption.gmf") && bVar.e.f(dj0.d.e)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean H0(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        return a3Var.e == y6.FEE && Intrinsics.f(a3Var.f272609r, "Extra Revolut Card");
    }

    public static final boolean I(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        xi0.b bVar = a3Var.k.f115083b;
        xi0.b.Companion.getClass();
        return Intrinsics.f(bVar, xi0.b.f306279q);
    }

    public static final boolean I0(a3 a3Var) {
        uof.b bVar;
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        if (a3Var.e != y6.REWARD || a3Var.f272624y.f273144b != io3.l.MERCHANT) {
            return false;
        }
        uof.a aVar = a3Var.Z0;
        return ((aVar == null || (bVar = aVar.f281645b) == null) ? null : bVar.f281646a) != null;
    }

    public static final boolean J(a3 a3Var) {
        z3l.a aVar;
        dj0.d dVar;
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        m3 m3Var = a3Var.f272589e1;
        return (m3Var == null || (aVar = m3Var.f272930b) == null || (dVar = aVar.f319299b) == null || dVar.f115082a == 0) ? false : true;
    }

    public static final boolean J0(a3 a3Var) {
        dj0.d dVar;
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        if (a3Var.e != y6.TOPUP) {
            return false;
        }
        xi0.b bVar = a3Var.k.f115083b;
        xi0.a aVar = xi0.b.Companion;
        aVar.getClass();
        xi0.b bVar2 = xi0.b.E;
        if (Intrinsics.f(bVar, bVar2)) {
            return false;
        }
        o3 o3Var = a3Var.J;
        xi0.b bVar3 = (o3Var == null || (dVar = o3Var.f272965a) == null) ? null : dVar.f115083b;
        aVar.getClass();
        return Intrinsics.f(bVar3, bVar2);
    }

    public static final boolean K(a3 a3Var) {
        w5 w5Var;
        w5 w5Var2;
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        io3.l lVar = null;
        if (a3Var.K != null) {
            z6 z6Var = a3Var.G;
            if (((z6Var == null || (w5Var2 = z6Var.k) == null) ? null : w5Var2.f273144b) == io3.l.INVESTMENT) {
                return true;
            }
        }
        o3 o3Var = a3Var.J;
        if (o3Var != null && (w5Var = o3Var.f272966b) != null) {
            lVar = w5Var.f273144b;
        }
        return lVar == io3.l.INVESTMENT;
    }

    public static final boolean K0(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        i3 i3Var = a3Var.Q;
        k3 k3Var = i3Var instanceof k3 ? (k3) i3Var : null;
        if ((k3Var != null ? k3Var.f272879a : null) != l2.DONATION) {
            return false;
        }
        n3 n3Var = a3Var.B0;
        return (n3Var != null ? n3Var.f272944b : null) != null;
    }

    public static final boolean L(a3 a3Var) {
        w5 w5Var;
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        if (a3Var.K == null) {
            return false;
        }
        z6 z6Var = a3Var.H;
        return ((z6Var == null || (w5Var = z6Var.k) == null) ? null : w5Var.f273144b) == io3.l.INVESTMENT;
    }

    public static final boolean L0(a3 a3Var) {
        z3l.a aVar;
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        if (a3Var.e != y6.TAX) {
            return false;
        }
        m3 m3Var = a3Var.f272589e1;
        List list = (m3Var == null || (aVar = m3Var.f272930b) == null) ? null : aVar.f319298a;
        if (list == null) {
            list = f0.f322471a;
        }
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            if (Intrinsics.f(((z3l.b) it8.next()).f319300a, "iof")) {
                return true;
            }
        }
        return false;
    }

    public static final InternalJointTransferType M(String currentUserId, a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        Intrinsics.checkNotNullParameter(currentUserId, "currentUserId");
        z0 z0Var = a3Var.C0;
        z6 z6Var = a3Var.G;
        z6 z6Var2 = a3Var.H;
        if (z0Var == null) {
            return null;
        }
        String str = z0Var.f273188c;
        String str2 = z0Var.d;
        if (!M0(a3Var)) {
            if (Intrinsics.f(z6Var != null ? z6Var.f273196a : null, str)) {
                return InternalJointTransferType.TOP_UP_TO_JOINT;
            }
            if (Intrinsics.f(z6Var2 != null ? z6Var2.f273196a : null, str)) {
                return InternalJointTransferType.WITHDRAW_FROM_JOINT;
            }
            return null;
        }
        if (Intrinsics.f(z6Var2 != null ? z6Var2.f273196a : null, currentUserId)) {
            return InternalJointTransferType.TOP_UP_FROM_PERSONAL;
        }
        if (Intrinsics.f(z6Var != null ? z6Var.f273196a : null, currentUserId)) {
            return InternalJointTransferType.WITHDRAW_TO_PERSONAL;
        }
        if (Intrinsics.f(z6Var2 != null ? z6Var2.f273196a : null, str2)) {
            return InternalJointTransferType.TOP_UP_FROM_PEER;
        }
        if (Intrinsics.f(z6Var != null ? z6Var.f273196a : null, str2)) {
            return InternalJointTransferType.WITHDRAW_TO_PEER;
        }
        return null;
    }

    public static final boolean M0(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        z0 z0Var = a3Var.C0;
        if (z0Var == null) {
            return false;
        }
        String str = z0Var.f273188c;
        z6 z6Var = a3Var.G;
        boolean zF = Intrinsics.f(str, z6Var != null ? z6Var.f273196a : null);
        z6 z6Var2 = a3Var.H;
        boolean zF2 = Intrinsics.f(str, z6Var2 != null ? z6Var2.f273196a : null);
        if (z0Var.f273187b) {
            return true;
        }
        return (zF || zF2) ? false : true;
    }

    public static final String N(a3 a3Var) {
        j5 j5Var;
        String str;
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        h3 h3Var = a3Var.A;
        if (h3Var != null && (j5Var = h3Var.f272779a) != null && (str = j5Var.d) != null) {
            return str;
        }
        z6 z6Var = a3Var.G;
        String str2 = z6Var != null ? z6Var.f273199g : null;
        if (str2 != null) {
            return str2;
        }
        e3 e3Var = a3Var.I.d;
        if (e3Var != null) {
            return e3Var.f272728c;
        }
        return null;
    }

    public static final boolean N0(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        return M0(a3Var) || O0(a3Var);
    }

    public static final boolean O(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        return a3Var.e == y6.LOAN || R0(a3Var);
    }

    public static final boolean O0(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        z0 z0Var = a3Var.C0;
        return z0Var != null && z0Var.f273186a;
    }

    public static final boolean P(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        d3 d3Var = a3Var.E;
        if ((d3Var != null ? d3Var.f272684c : null) == yvh.h.LOYALTY_PROFILE) {
            return (d3Var != null ? d3Var.f272683b : null) == yvh.f.SPARE_CHANGE;
        }
        return false;
    }

    public static final boolean P0(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        return a3Var.y0 != null;
    }

    public static final String Q(a3 a3Var) {
        j5 j5Var;
        j5 j5Var2;
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        h3 h3Var = a3Var.A;
        if (((h3Var == null || (j5Var2 = h3Var.f272779a) == null) ? null : j5Var2.f272854l) == null) {
            return a3Var.v;
        }
        if (h3Var == null || (j5Var = h3Var.f272779a) == null) {
            return null;
        }
        return j5Var.f272854l;
    }

    public static final boolean Q0(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        f5 f5Var = a3Var.y0;
        return (f5Var != null ? f5Var.f272750b : null) == g5.WITHDRAWAL;
    }

    public static final boolean R(a3 a3Var) {
        tof.c cVar;
        tof.c cVar2;
        io3.l lVar;
        io3.l lVar2;
        io3.l lVar3;
        w5 w5Var;
        w5 w5Var2;
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        tof.a aVar = a3Var.R0;
        io3.l lVar4 = null;
        tof.c cVar3 = aVar != null ? aVar.f272572a : null;
        tof.c cVar4 = tof.c.SAVINGS;
        if (cVar3 == cVar4 || cVar3 == (cVar = tof.c.JOINT_SAVINGS) || cVar3 == (cVar2 = tof.c.JUNIOR_SAVINGS)) {
            return true;
        }
        tof.a aVar2 = a3Var.S0;
        tof.c cVar5 = aVar2 != null ? aVar2.f272572a : null;
        if (cVar5 == cVar4 || cVar5 == cVar || cVar5 == cVar2 || (lVar = a3Var.f272624y.f273144b) == (lVar2 = io3.l.SAVINGS_INTEREST_BEARING) || lVar == (lVar3 = io3.l.SAVINGS_EXTERNAL)) {
            return true;
        }
        z6 z6Var = a3Var.H;
        io3.l lVar5 = (z6Var == null || (w5Var2 = z6Var.k) == null) ? null : w5Var2.f273144b;
        if (lVar5 == lVar2 || lVar5 == lVar3) {
            return true;
        }
        z6 z6Var2 = a3Var.G;
        if (z6Var2 != null && (w5Var = z6Var2.k) != null) {
            lVar4 = w5Var.f273144b;
        }
        return lVar4 == lVar2 || lVar4 == lVar3;
    }

    public static final boolean R0(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        return v.k(y6.LOAN_PAYMENT, y6.LOAN_PAYOFF).contains(a3Var.e);
    }

    public static final BigDecimal S(d7 d7Var) {
        Object next;
        Intrinsics.checkNotNullParameter(d7Var, "<this>");
        Iterator it8 = d7Var.e.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((b7) next).f272649a, "FUND_DIVIDEND_TAX")) {
                break;
            }
        }
        b7 b7Var = (b7) next;
        if (b7Var != null) {
            return b7Var.f272650b;
        }
        return null;
    }

    public static final boolean S0(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        y6 y6Var = a3Var.e;
        return y6Var == y6.MERCHANT_PAYMENT || y6Var == y6.MERCHANT_REFUND || y6Var == y6.MERCHANT_CB || y6Var == y6.MERCHANT_CB_RVSL || y6Var == y6.MERCHANT_CRED_RVSL || y6Var == y6.MERCHANT_FEE_RVSL || y6Var == y6.MERCHANT_FEE || y6Var == y6.MERCHANT_RESERVE;
    }

    public static final boolean T(a3 a3Var) {
        n1 n1Var;
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        if (!P0(a3Var)) {
            return false;
        }
        f5 f5Var = a3Var.y0;
        p1 p1Var = null;
        if ((f5Var != null ? f5Var.f272750b : null) != g5.P2P_TRANSFER) {
            return false;
        }
        if (f5Var != null && (n1Var = f5Var.f272751c) != null) {
            p1Var = n1Var.f272941b;
        }
        return p1Var == p1.ACTIVE;
    }

    public static final boolean T0(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        return a3Var.e == y6.LOAN && Intrinsics.f(a3Var.f272611s, "mtg_rfb_disbursal");
    }

    public static final boolean U(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        if (a3Var.f != v6.PENDING) {
            return false;
        }
        String[] elements = {"suspicious_transaction_counterparty_action_required", "suspicious_transaction_pending_confirmation", "suspicious_transaction_pending_review", "suspicious_transaction_no_user_action_required"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return o(a3Var) || d0.T(kotlin.collections.d.y0(elements), a3Var.f272611s);
    }

    public static final boolean U0(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        return (a3Var.R0 == null || a3Var.S0 == null) ? false : true;
    }

    public static final boolean V(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        return g(a3Var) == a.HOLD && pyd.c.i(a3Var.k) > 0;
    }

    public static final boolean V0(tof.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        dj0.d dVar = eVar.f272701a;
        if (dVar != null) {
            Intrinsics.h(dVar);
            if (!dVar.k()) {
                return true;
            }
        }
        dj0.d dVar2 = eVar.f272702b;
        if (dVar2 == null) {
            return false;
        }
        Intrinsics.h(dVar2);
        return !dVar2.k();
    }

    public static final boolean W(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        return g(a3Var) == a.HOLD && pyd.c.i(a3Var.k) < 0;
    }

    public static final boolean W0(i2 i2Var) {
        Intrinsics.checkNotNullParameter(i2Var, "<this>");
        dj0.d dVar = i2Var.f272795a;
        if (dVar != null && !dVar.k()) {
            return true;
        }
        dj0.d dVar2 = i2Var.f272796b;
        if (dVar2 != null && !dVar2.k()) {
            return true;
        }
        dj0.d dVar3 = i2Var.i;
        if ((dVar3 != null && !dVar3.k()) || i2Var.e != null || i2Var.f != null) {
            return true;
        }
        dj0.d dVar4 = i2Var.f272799h;
        if (dVar4 != null && !dVar4.k()) {
            return true;
        }
        dj0.d dVar5 = i2Var.f272797c;
        if ((dVar5 != null && !dVar5.k()) || i2Var.f272798g != null) {
            return true;
        }
        dj0.d dVar6 = i2Var.d;
        return (dVar6 == null || dVar6.k()) ? false : true;
    }

    public static final boolean X(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        if (!Intrinsics.f(a3Var.f272611s, "points_purchase")) {
            return false;
        }
        tof.a aVar = a3Var.R0;
        if ((aVar != null ? aVar.f272572a : null) != tof.c.PERSONAL) {
            return false;
        }
        tof.a aVar2 = a3Var.S0;
        return (aVar2 != null ? aVar2.f272572a : null) == tof.c.LOYALTY_VAULT;
    }

    public static final boolean X0(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        ibd.i iVar = a3Var.C;
        if (iVar != null) {
            return (iVar != null ? iVar.getType() : null) == ibd.h.BILL_MONEY_BOX;
        }
        return true;
    }

    public static final boolean Y(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        if (e1(a3Var)) {
            return true;
        }
        if (P0(a3Var) && U0(a3Var)) {
            return true;
        }
        if ((n0(a3Var) && !k0(a3Var) && !z(a3Var)) || K(a3Var) || L(a3Var) || O0(a3Var) || j1(a3Var)) {
            return true;
        }
        return (a3Var.f272582b0 == null || !X0(a3Var) || k0(a3Var)) ? false : true;
    }

    public static final boolean Y0(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        if (a3Var.e != y6.CARD_PAYMENT) {
            return false;
        }
        h3 h3Var = a3Var.A;
        return pd.b.j(h3Var != null ? Boolean.valueOf(h3Var.f) : null);
    }

    public static final boolean Z(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        ibd.i iVar = a3Var.C;
        return (iVar != null ? iVar.L() : null) != null;
    }

    public static final boolean Z0(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        return a3Var.e == y6.TOPUP && a3Var.f272602n0 == w6.OPEN_BANKING;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.math.BigDecimal a(tof.a3 r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            dj0.d r0 = r4.k
            java.math.BigDecimal r0 = pyd.c.x(r0)
            tof.d7 r4 = r4.S
            java.lang.String r1 = "add(...)"
            if (r4 == 0) goto L3e
            java.util.List r4 = r4.e
            if (r4 == 0) goto L3e
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r2 = 0
            java.math.BigDecimal r2 = java.math.BigDecimal.valueOf(r2)
            java.lang.String r3 = "valueOf(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.util.Iterator r4 = r4.iterator()
        L26:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L3c
            java.lang.Object r3 = r4.next()
            tof.b7 r3 = (tof.b7) r3
            java.math.BigDecimal r3 = r3.f272650b
            java.math.BigDecimal r2 = r2.add(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            goto L26
        L3c:
            if (r2 != 0) goto L45
        L3e:
            java.math.BigDecimal r2 = java.math.BigDecimal.ZERO
            java.lang.String r4 = "ZERO"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
        L45:
            java.math.BigDecimal r4 = r0.add(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k71.k.a(tof.a3):java.math.BigDecimal");
    }

    public static final o a0(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        h3 h3Var = a3Var.A;
        dj0.d dVar = a3Var.N1;
        xi0.b bVar = dVar.f115083b;
        List<p2> list = h3Var.f272782g;
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            long j2 = 0;
            boolean z = false;
            for (p2 p2Var : list) {
                y6 y6Var = p2Var.f272977b;
                dj0.d dVar2 = p2Var.e;
                if (f181789a.contains(y6Var)) {
                    if (!Intrinsics.f(dVar2.f115083b, bVar)) {
                        return m.f181791a;
                    }
                    j2 += dVar2.f115082a;
                    z = true;
                }
            }
            if (z) {
                return new n(new dj0.d(dVar.f115082a + j2, bVar), new dj0.d(j2, bVar));
            }
        }
        return l.f181790a;
    }

    public static final boolean a1(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        if (a3Var.e != y6.TRANSFER) {
            return false;
        }
        z6 z6Var = a3Var.H;
        if ((z6Var != null ? z6Var.i : null) != null) {
            return true;
        }
        z6 z6Var2 = a3Var.G;
        return (z6Var2 != null ? z6Var2.i : null) != null;
    }

    public static final dj0.d b(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        dj0.d dVar = a3Var.k;
        dj0.d dVar2 = a3Var.f272599l;
        dj0.d dVar3 = a3Var.k;
        return Intrinsics.f(dVar.f115083b, h0(a3Var).f115083b) ? pyd.c.H(pyd.c.H(dVar3, dVar2), h0(a3Var)) : pyd.c.H(dVar3, dVar2);
    }

    public static final boolean b0(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        return g(a3Var) == a.RELEASE && pyd.c.i(a3Var.k) > 0;
    }

    public static final boolean b1(a3 a3Var) {
        w5 w5Var;
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        z6 z6Var = a3Var.G;
        return ((z6Var == null || (w5Var = z6Var.k) == null) ? null : w5Var.f273144b) == io3.l.INSTALMENT;
    }

    public static final boolean c(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        return a3Var.f272604o0 == y2.ANDROID_PAY;
    }

    public static final boolean c0(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        return g(a3Var) == a.RELEASE && pyd.c.i(a3Var.k) < 0;
    }

    public static final boolean c1(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        return a3Var.f == v6.PENDING;
    }

    public static final boolean d(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        return a3Var.D != null;
    }

    public static final boolean d0(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        return Intrinsics.f(a3Var.f272611s, "street_mode") && a3Var.f == v6.PENDING;
    }

    public static final boolean d1(a3 a3Var) {
        v5 v5Var;
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        return a3Var.f272585c1 == x1.PIX || (v5Var = a3Var.f272618v1) == v5.PIX_CHANGE || v5Var == v5.PIX_WITHDRAW;
    }

    public static final String e(a3 a3Var) {
        String str;
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        e3 e3Var = a3Var.I.d;
        if (e3Var != null && (str = e3Var.f272728c) != null) {
            return str;
        }
        String str2 = e3Var != null ? e3Var.d : null;
        if (str2 != null) {
            return str2;
        }
        String str3 = e3Var != null ? e3Var.e : null;
        return str3 == null ? "" : str3;
    }

    public static final BigDecimal e0(d7 d7Var) {
        Intrinsics.checkNotNullParameter(d7Var, "<this>");
        List list = d7Var.e;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            b7 b7Var = (b7) obj2;
            if (Intrinsics.f(b7Var.f272649a, "PARTNER_FEE") || Intrinsics.f(b7Var.f272649a, "COMPANY_FEE")) {
                arrayList.add(obj2);
            }
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            bigDecimalValueOf = bigDecimalValueOf.add(((b7) it8.next()).f272650b);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    public static final boolean e1(a3 a3Var) {
        w5 w5Var;
        w5 w5Var2;
        w5 w5Var3;
        w5 w5Var4;
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        y6 y6Var = a3Var.e;
        z6 z6Var = a3Var.H;
        w5 w5Var5 = a3Var.f272624y;
        z6 z6Var2 = a3Var.G;
        y6 y6Var2 = y6.TRANSFER;
        io3.l lVar = null;
        if (y6Var == y6Var2 && w5Var5.f273144b == io3.l.CURRENT) {
            if (z6Var == null) {
                if (((z6Var2 == null || (w5Var4 = z6Var2.k) == null) ? null : w5Var4.f273144b) == io3.l.MERCHANT) {
                    return true;
                }
            }
            if (z6Var2 == null) {
                if (((z6Var == null || (w5Var3 = z6Var.k) == null) ? null : w5Var3.f273144b) == io3.l.MERCHANT) {
                    return true;
                }
            }
        }
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        if (a3Var.e != y6Var2 || w5Var5.f273144b != io3.l.MERCHANT) {
            return false;
        }
        if (z6Var == null) {
            if (((z6Var2 == null || (w5Var2 = z6Var2.k) == null) ? null : w5Var2.f273144b) == io3.l.CURRENT) {
                return true;
            }
        }
        if (z6Var2 != null) {
            return false;
        }
        if (z6Var != null && (w5Var = z6Var.k) != null) {
            lVar = w5Var.f273144b;
        }
        return lVar == io3.l.CURRENT;
    }

    public static final boolean f(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        return a3Var.f272582b0 != null;
    }

    public static final long f0(a3 a3Var) {
        dj0.d dVar;
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        o3 o3Var = a3Var.J;
        long j2 = (o3Var == null || (dVar = o3Var.f272965a) == null) ? 0L : dVar.f115082a;
        boolean z = ((a3Var.k.f115082a > 0L ? 1 : (a3Var.k.f115082a == 0L ? 0 : -1)) < 0) != ((j2 > 0L ? 1 : (j2 == 0L ? 0 : -1)) < 0);
        if (a3Var.e == y6.EXCHANGE) {
            if (!z) {
                return -j2;
            }
        } else if (z) {
            return -j2;
        }
        return j2;
    }

    public static final boolean f1(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        return (a3Var.j0 == null || a3Var.f272597k0 == null) ? false : true;
    }

    public static final a g(a3 a3Var) {
        w5 w5Var;
        w5 w5Var2;
        z6 z6Var = a3Var.H;
        io3.l lVar = (z6Var == null || (w5Var2 = z6Var.k) == null) ? null : w5Var2.f273144b;
        io3.l lVar2 = a3Var.f272624y.f273144b;
        z6 z6Var2 = a3Var.G;
        io3.l[] elements = {lVar, lVar2, (z6Var2 == null || (w5Var = z6Var2.k) == null) ? null : w5Var.f273144b};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        List list = ((ArrayList) listL).size() == 2 ? listL : null;
        if (list != null) {
            io3.l lVar3 = (io3.l) list.get(0);
            io3.l lVar4 = (io3.l) list.get(1);
            io3.l lVar5 = io3.l.BLOCKING;
            a aVar = (lVar3 == lVar5 || lVar4 != lVar5) ? (lVar3 != lVar5 || lVar4 == lVar5) ? a.UNKNOWN : a.RELEASE : a.HOLD;
            if (aVar != null) {
                return aVar;
            }
        }
        return a.UNKNOWN;
    }

    public static final boolean g0(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        h3 h3Var = a3Var.A;
        return (h3Var != null ? h3Var.f272781c : null) == t0.SUSPICIOUS;
    }

    public static final boolean g1(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        y6 y6Var = a3Var.e;
        return y6Var == y6.REV_PAYMENT_REFUND || y6Var == y6.TOPUP_RETURN || y6Var == y6.REFUND || y6Var == y6.CARD_REFUND || y6Var == y6.CHARGE_REFUND || y6Var == y6.MERCHANT_REFUND || y6Var == y6.MERCHANT_CRED_RVSL || y6Var == y6.MERCHANT_FEE_RVSL;
    }

    public static final boolean h(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        v6 v6Var = a3Var.f;
        return v6Var == v6.DECLINED || v6Var == v6.FAILED || v6Var == v6.CANCELLED;
    }

    public static final dj0.d h0(a3 a3Var) {
        List list;
        z3l.a aVar;
        dj0.d dVar;
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        m3 m3Var = a3Var.f272589e1;
        if (m3Var != null && (aVar = m3Var.f272930b) != null && (dVar = aVar.f319299b) != null) {
            return dVar;
        }
        d7 d7Var = a3Var.S;
        long jLongValue = 0;
        if (d7Var != null && (list = d7Var.f) != null) {
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                jLongValue += ((Number) it8.next()).longValue();
            }
        }
        return new dj0.d(jLongValue, a3Var.k.f115083b);
    }

    public static final boolean h1(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        return a3Var.e == y6.REV_PAYMENT && a3Var.k.k();
    }

    public static final dj0.d i(a3 a3Var) {
        List list;
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        dj0.d dVar = null;
        if (!m0(a3Var) && (list = a3Var.A.f272782g) != null) {
            Iterator it8 = list.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                p2 p2Var = (p2) it8.next();
                d3 d3Var = p2Var.i;
                dj0.d dVar2 = ((d3Var != null ? d3Var.f272683b : null) == yvh.f.SPARE_CHANGE && Intrinsics.f(p2Var.f, a3Var.f272624y.f273143a)) ? p2Var.f272981j : null;
                if (dVar2 != null) {
                    dVar = dVar2;
                    break;
                }
            }
        }
        return dVar == null ? a3Var.f272616t1 : dVar;
    }

    public static final boolean i0(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        return Intrinsics.f(a3Var.v, "tfl");
    }

    public static final boolean i1(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        return d0.T(v.k("revx_topup", "revx_crypto_topup", "revx_withdrawal", "revx_crypto_withdrawal"), a3Var.f272611s);
    }

    public static final boolean j(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        v6 v6Var = a3Var.f;
        return ((v6Var != v6.COMPLETED && v6Var != v6.PENDING) || a3Var.f272624y.f273145c == io3.i.EXTERNAL || p0(a3Var)) ? false : true;
    }

    public static final boolean j0(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        return a3Var.e == y6.TRANSFER && a3Var.I.f273161a != null;
    }

    public static final boolean j1(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        jc jcVar = a3Var.J0;
        return (jcVar != null ? jcVar.f272867b : null) == ic.ROBO;
    }

    public static final boolean k(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        return a3Var.f == v6.PENDING && a3Var.I.f273161a != null;
    }

    public static final boolean k0(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        y6 y6Var = a3Var.e;
        x6 x6Var = a3Var.I;
        if (y6Var == y6.TRANSFER) {
            return !(x6Var.d == null && x6Var.e == null && a3Var.J == null && !D0(a3Var)) && a3Var.G == null && a3Var.H == null && x6Var.f273161a == null;
        }
        return false;
    }

    public static final boolean k1(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        return a3Var.e == y6.REWARD && a3Var.P1 == q2.SALARY;
    }

    public static final boolean l(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        y6 y6Var = a3Var.e;
        return y6Var == y6.CARD_PAYMENT || y6Var == y6.ATM;
    }

    public static final z6 l0(a3 a3Var) {
        Object next;
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        z6[] elements = {a3Var.H, a3Var.G};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it8 = kotlin.collections.d.E(elements).iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((z6) next) != null) {
                break;
            }
        }
        return (z6) next;
    }

    public static final boolean l1(io3.l lVar) {
        return lVar == io3.l.SAVINGS || lVar == io3.l.SAVINGS_INTEREST_BEARING || lVar == io3.l.SAVINGS_EXTERNAL;
    }

    public static final boolean m(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        return a3Var.B != null;
    }

    public static final boolean m0(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        v6 v6Var = a3Var.f;
        return v6Var == v6.DECLINED || v6Var == v6.FAILED || v6Var == v6.REVERTED || v6Var == v6.CANCELLED;
    }

    public static final boolean m1(a3 a3Var) {
        w5 w5Var;
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        if (a3Var.f272624y.f273144b != io3.l.CURRENT) {
            return false;
        }
        z6 z6Var = a3Var.G;
        return ((z6Var == null || (w5Var = z6Var.k) == null) ? null : w5Var.f273144b) == io3.l.STAKING;
    }

    public static final boolean n(a3 a3Var) {
        dj0.d dVar;
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        if (a3Var.e != y6.EXCHANGE) {
            return false;
        }
        if (cp5.d.y(a3Var.k.f115083b)) {
            return true;
        }
        o3 o3Var = a3Var.J;
        return cp5.d.y((o3Var == null || (dVar = o3Var.f272965a) == null) ? null : dVar.f115083b);
    }

    public static final boolean n0(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        return a3Var.S != null;
    }

    public static final boolean n1(a3 a3Var) {
        w5 w5Var;
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        if (a3Var.e != y6.EXCHANGE) {
            return false;
        }
        o3 o3Var = a3Var.J;
        return ((o3Var == null || (w5Var = o3Var.f272966b) == null) ? null : w5Var.f273144b) == io3.l.STAKING;
    }

    public static final boolean o(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        return q1(a3Var) && a3Var.f == v6.PENDING;
    }

    public static final String o0(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        d7 d7Var = a3Var.S;
        if (d7Var != null) {
            return d7Var.f272692a;
        }
        return null;
    }

    public static final boolean o1(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        if (a3Var.f272624y.f273144b == io3.l.STAKING && a3Var.e == y6.REWARD) {
            return true;
        }
        t6 t6Var = a3Var.V0;
        return t6Var != null ? Intrinsics.f(t6Var.f273089a, Boolean.TRUE) : false;
    }

    public static final boolean p(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        return a3Var.f272624y.f273144b == io3.l.CREDIT;
    }

    public static final boolean p0(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        return a3Var.e == y6.REWARD && Intrinsics.f(a3Var.f272611s, "interest_incentive_reward");
    }

    public static final boolean p1(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        if (m1(a3Var)) {
            return true;
        }
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        if (x1(a3Var) || w1(a3Var) || v1(a3Var) || o1(a3Var)) {
            return true;
        }
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        return (a3Var.e == y6.EXCHANGE && a3Var.f272624y.f273144b == io3.l.STAKING) || n1(a3Var) || s1(a3Var);
    }

    public static final boolean q(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        double d = a3Var.f272619w;
        if (d == 0.0d || d == 1.0d) {
            return false;
        }
        o3 o3Var = a3Var.J;
        return (o3Var != null ? o3Var.f272965a : null) != null;
    }

    public static final boolean q0(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        return g(a3Var) != a.UNKNOWN;
    }

    public static final boolean q1(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        String[] elements = {"suspicious_transaction_user_action_required", "crypto_withdrawal_fraud_limit"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return d0.T(kotlin.collections.d.y0(elements), a3Var.f272611s);
    }

    public static final dj0.d r(a3 a3Var) {
        dj0.d dVar;
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        o3 o3Var = a3Var.J;
        if (o3Var != null && (dVar = o3Var.f272965a) != null) {
            if (!A0(a3Var) && a3Var.e != y6.CRYPTO_WITHDRAWAL) {
                dVar = null;
            }
            if (dVar != null) {
                return dVar;
            }
        }
        return a3Var.k;
    }

    public static final boolean r0(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        if (a3Var.e != y6.CRYPTO_WITHDRAWAL) {
            return false;
        }
        r3 r3Var = a3Var.V;
        if ((r3Var != null ? r3Var.d : null) != tof.f0.REVOLUT_CANCELLED) {
            return (r3Var != null ? r3Var.d : null) == tof.f0.USER_CANCELLED;
        }
        return true;
    }

    public static final boolean r1(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        return y0(a3Var) && a3Var.f == v6.REVERTED;
    }

    public static final boolean s(a3 a3Var) {
        dj0.d dVar;
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        if (a3Var.e != y6.EXCHANGE) {
            return false;
        }
        if (cp5.d.z(a3Var.k.f115083b)) {
            return true;
        }
        o3 o3Var = a3Var.J;
        return cp5.d.z((o3Var == null || (dVar = o3Var.f272965a) == null) ? null : dVar.f115083b);
    }

    public static final boolean s0(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        if (!a3Var.m0 || a3Var.e != y6.CARD_PAYMENT) {
            return false;
        }
        v6 v6Var = a3Var.f;
        return v6Var == v6.PENDING || v6Var == v6.REVERTED || v6Var == v6.COMPLETED;
    }

    public static final boolean s1(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        return a3Var.e == y6.TOPUP && a3Var.f272624y.f273144b == io3.l.STAKING;
    }

    public static final boolean t(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        return s(a3Var) || n(a3Var);
    }

    public static final boolean t0(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        return a3Var.e == y6.CARD_PAYMENT;
    }

    public static final boolean t1(a3 a3Var, do3.n nVar) {
        String str;
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        z6 z6VarL0 = l0(a3Var);
        String str2 = a3Var.d;
        if (z6VarL0 == null) {
            return false;
        }
        String str3 = z6VarL0.f273196a;
        if (nVar == null || (str = nVar.f116414l) == null || !U0(a3Var) || !Intrinsics.f(z6VarL0.i, str) || str2 == null || Intrinsics.f(str3, str2)) {
            return false;
        }
        List list = nVar.v;
        if (list == null) {
            list = f0.f322471a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            a0.x(((r) it8.next()).f116431b, arrayList);
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it9 = arrayList.iterator();
        while (it9.hasNext()) {
            arrayList2.add(((do3.e) it9.next()).f116395a);
        }
        return list.size() > 1 && d0.T(arrayList2, str2) && d0.T(arrayList2, str3);
    }

    public static final boolean u(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        return a3Var.e == y6.REVX_EXCHANGE && a3Var.f == v6.COMPLETED;
    }

    public static final boolean u0(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        return a3Var.f == v6.COMPLETED;
    }

    public static final boolean u1(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        return a3Var.e == y6.TRANSFER;
    }

    public static final boolean v(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        return a3Var.e == y6.REVX_EXCHANGE && a3Var.f == v6.PENDING;
    }

    public static final boolean v0(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        return Intrinsics.f(a3Var.f272611s, "credit_card_excess_balance_correction");
    }

    public static final boolean v1(a3 a3Var) {
        w5 w5Var;
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        if (a3Var.f272624y.f273144b != io3.l.STAKING) {
            return false;
        }
        z6 z6Var = a3Var.G;
        return ((z6Var == null || (w5Var = z6Var.k) == null) ? null : w5Var.f273144b) == io3.l.STAKING_PROXY;
    }

    public static final boolean w(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        d3 d3Var = a3Var.E;
        if ((d3Var != null ? d3Var.f272684c : null) == yvh.h.CURRENT_POCKET) {
            return (d3Var != null ? d3Var.f272683b : null) == yvh.f.SPARE_CHANGE;
        }
        return false;
    }

    public static final boolean w0(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        if (a3Var.e != y6.TRANSFER || !p(a3Var)) {
            return false;
        }
        tof.a aVar = a3Var.R0;
        if ((aVar != null ? aVar.f272572a : null) != tof.c.LOYALTY_VAULT) {
            return false;
        }
        tof.a aVar2 = a3Var.S0;
        return (aVar2 != null ? aVar2.f272572a : null) == tof.c.CREDIT;
    }

    public static final boolean w1(a3 a3Var) {
        w5 w5Var;
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        if (a3Var.f272624y.f273144b != io3.l.CURRENT) {
            return false;
        }
        z6 z6Var = a3Var.H;
        return ((z6Var == null || (w5Var = z6Var.k) == null) ? null : w5Var.f273144b) == io3.l.STAKING_PROXY;
    }

    public static final boolean x(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        return cp5.d.z(a3Var.k.f115083b) || cp5.d.y(a3Var.k.f115083b);
    }

    public static final boolean x0(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        if (a3Var.e != y6.CARD_PAYMENT) {
            return false;
        }
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        return cp5.d.z(a3Var.k.f115083b);
    }

    public static final boolean x1(a3 a3Var) {
        w5 w5Var;
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        if (a3Var.f272624y.f273144b != io3.l.CURRENT) {
            return false;
        }
        z6 z6Var = a3Var.H;
        return ((z6Var == null || (w5Var = z6Var.k) == null) ? null : w5Var.f273144b) == io3.l.STAKING;
    }

    public static final boolean y(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        return (cp5.d.z(a3Var.k.f115083b) || cp5.d.y(a3Var.k.f115083b)) ? false : true;
    }

    public static final boolean y0(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        return a3Var.e == y6.TOPUP && a3Var.f272602n0 == w6.CRYPTO_WALLET;
    }

    public static final boolean y1(a3 a3Var, SavingsDirection direction, SavingsTransactionLeg transactionLeg) {
        boolean zL1;
        w5 w5Var;
        w5 w5Var2;
        y6 y6Var;
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(transactionLeg, "transactionLeg");
        boolean zN0 = n0(a3Var);
        io3.l lVar = a3Var.f272624y.f273144b;
        boolean z = zN0 && ((y6Var = a3Var.e) == y6.TRANSFER || y6Var == y6.EXCHANGE);
        z6 z6Var = a3Var.H;
        io3.l lVar2 = null;
        boolean z3 = (l1((z6Var == null || (w5Var2 = z6Var.k) == null) ? null : w5Var2.f273144b) && pyd.c.i(b(a3Var)) > 0) || (l1(lVar) && pyd.c.i(b(a3Var)) < 0);
        z6 z6Var2 = a3Var.G;
        if (z6Var2 != null && (w5Var = z6Var2.k) != null) {
            lVar2 = w5Var.f273144b;
        }
        boolean z4 = (l1(lVar2) && pyd.c.i(b(a3Var)) < 0) || (l1(lVar) && pyd.c.i(b(a3Var)) > 0);
        int i = j.f181786a[transactionLeg.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (l1(lVar)) {
                zL1 = false;
            }
            zL1 = true;
        } else {
            zL1 = l1(lVar);
        }
        int i2 = j.f181787b[direction.ordinal()];
        if (i2 == 1) {
            z3 = z4;
        } else if (i2 != 2) {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            z3 = z4 || z3;
        }
        return z && zL1 && z3;
    }

    public static final boolean z(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        d7 d7Var = a3Var.S;
        if (d7Var != null) {
            return d7Var.d;
        }
        return false;
    }

    public static final boolean z0(a3 a3Var) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        if (y0(a3Var)) {
            p3 p3Var = a3Var.W;
            if ((p3Var == null || (bool = p3Var.f272984c) == null) ? false : bool.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final p2 z1(a3 a3Var, Map pockets) {
        List list;
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        Intrinsics.checkNotNullParameter(pockets, "pockets");
        h3 h3Var = a3Var.A;
        Object obj2 = null;
        if (h3Var == null || (list = h3Var.f272782g) == null) {
            return null;
        }
        for (Object obj3 : list) {
            p2 p2Var = (p2) obj3;
            io3.d dVar = (io3.d) pockets.get(p2Var.f);
            io3.l lVar = dVar != null ? dVar.e : null;
            if (lVar == io3.l.CURRENT || lVar == io3.l.SAVINGS) {
                d3 d3Var = p2Var.i;
                if ((d3Var != null ? d3Var.f272683b : null) == yvh.f.SPARE_CHANGE && (p2Var.f272979g != null || p2Var.f272980h == null)) {
                    obj2 = obj3;
                    break;
                }
            }
        }
        return (p2) obj2;
    }
}
