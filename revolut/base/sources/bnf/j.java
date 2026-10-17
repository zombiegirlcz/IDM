package bnf;

import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit.models.badge.CircleIconBadge;
import com.revolut.core.ui_kit.models.badge.DangerCircleBadge;
import com.revolut.core.ui_kit.models.badge.InactiveCircleBadge;
import com.revolut.core.ui_kit.models.badge.WarningCircleBadge;
import com.revolut.domain.models.joint.InternalJointTransferType;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.a3;
import tof.d3;
import tof.l2;
import tof.l3;
import tof.q7;
import tof.v6;
import tof.w5;
import tof.w6;
import tof.x1;
import tof.y6;
import tof.z6;

/* JADX INFO: loaded from: classes8.dex */
public final class j {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sj5.a f17146a;

    public j(sj5.a cryptoDepositTransactionStateChecker) {
        Intrinsics.checkNotNullParameter(cryptoDepositTransactionStateChecker, "cryptoDepositTransactionStateChecker");
        this.f17146a = cryptoDepositTransactionStateChecker;
    }

    public static g b(a3 a3Var, boolean z) {
        v6 v6Var = a3Var.f;
        dj0.d dVar = a3Var.k;
        if (v6Var == v6.PENDING) {
            return g.PENDING;
        }
        if ((!k71.k.n0(a3Var) || k71.k.k0(a3Var) || z) && !k71.k.e1(a3Var) && !k71.k.K(a3Var) && !k71.k.L(a3Var) && ((a3Var.f272582b0 == null || !k71.k.X0(a3Var) || k71.k.k0(a3Var)) && !Intrinsics.f(a3Var.Q.getId(), l3.b(l2.DONATION)))) {
            Intrinsics.checkNotNullParameter(a3Var, "<this>");
            if (dVar.f115082a > 0 && (k71.k.k0(a3Var) || k71.k.j0(a3Var) || k71.k.l0(a3Var) != null)) {
                return g.MONEY_IN;
            }
            Intrinsics.checkNotNullParameter(a3Var, "<this>");
            if (dVar.f115082a >= 0) {
                return null;
            }
            if (k71.k.k0(a3Var) || k71.k.j0(a3Var) || k71.k.l0(a3Var) != null) {
                return g.MONEY_OUT;
            }
        }
        return null;
    }

    public final g a(String str, Map map, a3 transaction, boolean z) {
        w5 w5Var;
        yk5.e eVar;
        d3 d3Var = transaction.E;
        z6 z6Var = transaction.H;
        String str2 = transaction.f272611s;
        String str3 = transaction.f272581b;
        dj0.d dVar = transaction.k;
        y6 y6Var = transaction.e;
        v6 v6Var = transaction.f;
        if ((d3Var != null ? d3Var.f272684c : null) != yvh.h.LOYALTY_PROFILE && ((!k71.k.U0(transaction) || z) && !transaction.m0)) {
            q7 q7Var = kt5.b.f189500a;
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            if (kt5.b.c(transaction) || kt5.b.d(transaction)) {
                return null;
            }
            y6 y6Var2 = y6.TRANSFER;
            if (y6Var == y6Var2 && k71.k.O0(transaction)) {
                if (str != null) {
                    InternalJointTransferType internalJointTransferTypeM = k71.k.M(str, transaction);
                    int i = internalJointTransferTypeM == null ? -1 : i.d[internalJointTransferTypeM.ordinal()];
                    if (i == 1) {
                        return g.MONEY_IN;
                    }
                    if (i == 2) {
                        return g.MONEY_OUT;
                    }
                }
            } else if (!k71.k.Y(transaction) || z) {
                Intrinsics.checkNotNullParameter(transaction, "<this>");
                if (y6Var == y6.REFUND && transaction.Q0 != null) {
                    return g.MONEY_IN;
                }
                Intrinsics.checkNotNullParameter(transaction, "<this>");
                if (!Intrinsics.f(str2, "transfer_window_expired")) {
                    Intrinsics.checkNotNullParameter(transaction, "<this>");
                    if (!Intrinsics.f(str2, "debtor_name_mismatch")) {
                        if (!k71.k.o1(transaction) && !k71.k.T0(transaction)) {
                            if (k71.k.v1(transaction)) {
                                return g.PENDING;
                            }
                            if (!k71.k.p1(transaction)) {
                                if (k71.k.g1(transaction)) {
                                    return g.REFUND;
                                }
                                if (k71.k.y0(transaction)) {
                                    yk5.a aVar = (yk5.a) map.get(str3);
                                    if (((hk5.a) this.f17146a).b(transaction, aVar != null ? aVar.f : null)) {
                                        return g.WARNING;
                                    }
                                    if (v6Var == v6.REVERTED) {
                                        yk5.a aVar2 = (yk5.a) map.get(str3);
                                        if (aVar2 != null) {
                                            yk5.e eVar2 = aVar2.f314567b;
                                            boolean zContains = aVar2.d.contains(yk5.f.UNSUPPORTED_ASSET);
                                            if (eVar2 == yk5.e.RETURNING || (eVar2 == (eVar = yk5.e.AVAILABLE_FOR_RETURN) && zContains)) {
                                                return g.PENDING;
                                            }
                                            if (eVar2 == yk5.e.RETURNED) {
                                                return g.REFUND;
                                            }
                                            if (eVar2 == eVar) {
                                                return g.WARNING;
                                            }
                                        }
                                    } else {
                                        if (v6Var == v6.PENDING) {
                                            return k71.k.z0(transaction) ? g.WARNING : g.PENDING;
                                        }
                                        if (v6Var == v6.COMPLETED) {
                                            return g.MONEY_IN;
                                        }
                                        if (v6Var == v6.FAILED) {
                                            return g.FAILED;
                                        }
                                    }
                                } else {
                                    y6 y6Var3 = y6.DEFI_TOPUP;
                                    if ((y6Var == y6Var3 || y6Var == y6.DEFI_SWAP || y6Var == y6.DEFI_TRANSFER) && k71.k.h(transaction)) {
                                        return g.FAILED;
                                    }
                                    if (y6Var == y6Var3 && v6Var == v6.PENDING) {
                                        return g.PENDING;
                                    }
                                    if (y6Var == y6Var3 && v6Var == v6.COMPLETED) {
                                        return g.MONEY_IN;
                                    }
                                    v6 v6Var2 = v6.REVERTED;
                                    if (v6Var == v6Var2 && k71.k.l(transaction)) {
                                        return g.REFUND;
                                    }
                                    if (v6Var == v6Var2) {
                                        return g.CANCELLED;
                                    }
                                    if (v6Var == v6.DECLINED) {
                                        return Intrinsics.f(str2, "merchant_blocked_manually") ? g.FAILED : g.CANCELLED;
                                    }
                                    if (v6Var == v6.CANCELLED) {
                                        return g.CANCELLED;
                                    }
                                    if (transaction.f272585c1 == x1.PIX && v6Var == v6.FAILED) {
                                        return g.FAILED;
                                    }
                                    if (y6Var == y6.ALIPAY_PLUS_PAYMENT && v6Var == v6.FAILED) {
                                        return g.FAILED;
                                    }
                                    if (k71.k.D0(transaction)) {
                                        return g.RECURRING;
                                    }
                                    if (!k71.k.b1(transaction)) {
                                        Intrinsics.checkNotNullParameter(transaction, "<this>");
                                        if (((z6Var == null || (w5Var = z6Var.k) == null) ? null : w5Var.f273144b) == io3.l.INSTALMENT) {
                                            return g.REFUND;
                                        }
                                        Intrinsics.checkNotNullParameter(transaction, "<this>");
                                        if (k71.k.o(transaction) || Intrinsics.f(str2, "suspicious_transaction_pending_confirmation")) {
                                            return g.WARNING;
                                        }
                                        if (!k71.k.B0(transaction) && !k71.k.C0(transaction)) {
                                            if (y6Var == y6.CRYPTO_WITHDRAWAL || y6Var == y6.DEFI_TRANSFER) {
                                                int i2 = i.f17143a[v6Var.ordinal()];
                                                if (i2 == 1) {
                                                    return g.PENDING;
                                                }
                                                if (i2 == 2) {
                                                    return k71.k.r0(transaction) ? g.CANCELLED : g.FAILED;
                                                }
                                                if (i2 == 3) {
                                                    return g.MONEY_OUT;
                                                }
                                            } else {
                                                y6 y6Var4 = y6.TOPUP;
                                                if (y6Var == y6Var4 && transaction.f272602n0 == w6.CASH_DEPOSIT && v6Var == v6.PENDING) {
                                                    return g.PENDING;
                                                }
                                                if (y6Var == y6Var4) {
                                                    int i3 = i.f17143a[v6Var.ordinal()];
                                                    return i3 != 1 ? i3 != 2 ? g.PLUS : g.FAILED : g.PENDING;
                                                }
                                                if (y6Var != y6.EXCHANGE || k71.k.n0(transaction) || k71.k.f(transaction)) {
                                                    if (!k71.k.d0(transaction) && !k71.k.g0(transaction)) {
                                                        if (!k71.k.h(transaction)) {
                                                            if (k71.k.z(transaction)) {
                                                                return g.PLUS;
                                                            }
                                                            if (k71.k.n0(transaction)) {
                                                                return b(transaction, z);
                                                            }
                                                            if (k71.k.m(transaction) || (k71.k.f(transaction) && !k71.k.Z(transaction))) {
                                                                if (i.f17144b[y6Var.ordinal()] == 1) {
                                                                    return g.PLUS;
                                                                }
                                                            } else if (!k71.k.q0(transaction)) {
                                                                if (k71.k.Z(transaction)) {
                                                                    return g.RECURRING;
                                                                }
                                                                y6 y6Var5 = y6.REWARD;
                                                                if (y6Var != y6Var5 || !transaction.f0) {
                                                                    if (y6Var == y6Var5 && k71.k.E0(transaction)) {
                                                                        return g.PLUS;
                                                                    }
                                                                    if (y6Var != y6Var5 || !k71.k.k1(transaction)) {
                                                                        if (y6Var == y6Var2 && k71.k.k0(transaction)) {
                                                                            return b(transaction, z);
                                                                        }
                                                                        if (y6Var == y6Var2 && k71.k.j0(transaction)) {
                                                                            return b(transaction, z);
                                                                        }
                                                                        if ((y6Var != y6Var2 || k71.k.l0(transaction) == null) && !k71.k.f1(transaction)) {
                                                                            if (!k71.k.l(transaction) || v6Var != v6.PENDING) {
                                                                                if (y6Var == y6.REV_PAYMENT && v6Var == v6.PENDING) {
                                                                                    return g.PENDING;
                                                                                }
                                                                                if (y6Var == y6.MERCHANT_PAYMENT && v6Var == v6.PENDING) {
                                                                                    return g.PENDING;
                                                                                }
                                                                                if (y6Var == y6Var5 && v6Var == v6.COMPLETED && pyd.c.i(dVar) > 0 && transaction.f272624y.f273144b == io3.l.CREDIT) {
                                                                                    return g.MONEY_IN;
                                                                                }
                                                                                if (y6Var == y6Var5 && v6Var == v6.COMPLETED && pyd.c.i(dVar) > 0) {
                                                                                    return g.PLUS;
                                                                                }
                                                                                if (dVar.f115082a != 0 && (transaction.I.f273161a != null || transaction.G != null || z6Var != null)) {
                                                                                    return v6Var == v6.PENDING ? g.PENDING : pyd.c.i(dVar) > 0 ? g.MONEY_IN : g.MONEY_OUT;
                                                                                }
                                                                                if (k71.k.p0(transaction)) {
                                                                                    return g.PLUS;
                                                                                }
                                                                            }
                                                                        }
                                                                        return b(transaction, z);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    return g.WARNING;
                                                }
                                                if (k71.k.w(transaction)) {
                                                    return g.SPARE_CHANGE;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return g.PLUS;
                    }
                }
                return g.WARNING;
            }
        }
        return null;
    }

    public final CircleIconBadge c(String str, Map cryptoActionRequiredDeposits, a3 transaction, boolean z) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(cryptoActionRequiredDeposits, "cryptoActionRequiredDeposits");
        g gVarA = a(str, cryptoActionRequiredDeposits, transaction, z);
        if (gVarA == null) {
            return null;
        }
        switch (i.f17145c[gVarA.ordinal()]) {
            case 1:
                return new AccentCircleBadge(dw0.a.Income);
            case 2:
                return new AccentCircleBadge(dw0.a.Outgoing);
            case 3:
                return new AccentCircleBadge(dw0.a.Pending);
            case 4:
                return new DangerCircleBadge(dw0.a.Error);
            case 5:
                return new AccentCircleBadge(dw0.a.Refund);
            case 6:
                return new AccentCircleBadge(dw0.a.Recurring);
            case 7:
                return new AccentCircleBadge(dw0.a.SpareChange);
            case 8:
                return new AccentCircleBadge(dw0.a.TopUp);
            case 9:
                return new WarningCircleBadge(dw0.a.Suspicious);
            case 10:
                return new InactiveCircleBadge(dw0.a.Cancelled);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
