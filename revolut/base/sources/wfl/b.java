package wfl;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.shared.feature.wealth.ui.core.R$string;
import dfl.b0;
import dfl.c0;
import dfl.d0;
import dfl.e;
import dfl.e0;
import dfl.f0;
import dfl.g;
import dfl.g0;
import dfl.h;
import dfl.h0;
import dfl.i;
import dfl.i0;
import dfl.j;
import dfl.k;
import dfl.l;
import dfl.m;
import dfl.q;
import dfl.s;
import dfl.t;
import dfl.v;
import dfl.w;
import dfl.y;
import dfl.z;
import dj0.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import pyd.c;

/* JADX INFO: loaded from: classes12.dex */
public final class b {
    public static d a(i0 trade) {
        Intrinsics.checkNotNullParameter(trade, "trade");
        if (trade instanceof f0) {
            f0 f0Var = (f0) trade;
            d dVar = f0Var.B;
            if (dVar == null) {
                dVar = f0Var.G;
            }
            if (dVar != null) {
                int i = a.f297156a[f0Var.f114307x.ordinal()];
                if (i == 1) {
                    return c.i0(dVar);
                }
                if (i == 2) {
                    return dVar;
                }
                throw new NoWhenBranchMatchedException();
            }
        } else {
            if (trade instanceof dfl.b) {
                dfl.b bVar = (dfl.b) trade;
                q qVar = bVar.i;
                Intrinsics.i(qVar, "null cannot be cast to non-null type com.revolut.shared.feature.wealth.models.transaction.AmountInvestValue");
                d dVarA0 = oi0.d.a0((dfl.a) qVar);
                int i2 = a.f297156a[bVar.f114191s.ordinal()];
                if (i2 == 1) {
                    return dVarA0;
                }
                if (i2 == 2) {
                    return c.i0(dVarA0);
                }
                throw new NoWhenBranchMatchedException();
            }
            if (trade instanceof dfl.c) {
                dfl.c cVar = (dfl.c) trade;
                d dVarA02 = oi0.d.a0((dfl.a) cVar.i);
                int i3 = a.f297156a[cVar.f114220s.ordinal()];
                if (i3 == 1) {
                    return dVarA02;
                }
                if (i3 == 2) {
                    return c.i0(dVarA02);
                }
                throw new NoWhenBranchMatchedException();
            }
            if (trade instanceof j) {
                return oi0.d.a0((dfl.a) ((j) trade).i);
            }
            if (trade instanceof g) {
                return oi0.d.a0((dfl.a) ((g) trade).i);
            }
            if (trade instanceof y) {
                return oi0.d.a0((dfl.a) ((y) trade).i);
            }
            if (trade instanceof h) {
                return oi0.d.a0((dfl.a) ((h) trade).i);
            }
            if (trade instanceof b0) {
                return oi0.d.a0((dfl.a) ((b0) trade).i);
            }
            if (trade instanceof g0) {
                return c.i0(oi0.d.a0((dfl.a) ((g0) trade).i));
            }
            if (trade instanceof dfl.d) {
                return oi0.d.a0((dfl.a) ((dfl.d) trade).i);
            }
            if (trade instanceof z) {
                return oi0.d.a0((dfl.a) ((z) trade).i);
            }
            if (trade instanceof s) {
                return c.U(((s) trade).f114469y, Long.signum(((dfl.a) r4.i).f114177a));
            }
            if (trade instanceof v) {
                return oi0.d.a0((dfl.a) ((v) trade).i);
            }
            if (trade instanceof l) {
                return oi0.d.a0((dfl.a) ((l) trade).i);
            }
            if (trade instanceof e) {
                e eVar = (e) trade;
                d dVar2 = eVar.v;
                int i5 = a.f297156a[eVar.f114273s.ordinal()];
                if (i5 == 1) {
                    return c.i0(dVar2);
                }
                if (i5 == 2) {
                    return dVar2;
                }
                throw new NoWhenBranchMatchedException();
            }
            if (trade instanceof k) {
                return oi0.d.a0(((k) trade).t());
            }
            if (trade instanceof h0) {
                return null;
            }
            if (trade instanceof w) {
                return oi0.d.a0((dfl.a) ((w) trade).i);
            }
            if (trade instanceof i) {
                return oi0.d.a0((dfl.a) ((i) trade).i);
            }
            if (trade instanceof t) {
                q qVar2 = ((t) trade).i;
                dfl.a aVar = qVar2 instanceof dfl.a ? (dfl.a) qVar2 : null;
                if (aVar != null) {
                    return oi0.d.a0(aVar);
                }
            } else if (trade instanceof c0) {
                q qVar3 = ((c0) trade).i;
                dfl.a aVar2 = qVar3 instanceof dfl.a ? (dfl.a) qVar3 : null;
                if (aVar2 != null) {
                    return oi0.d.a0(aVar2);
                }
            } else {
                if (trade instanceof e0) {
                    return null;
                }
                if (!(trade instanceof m)) {
                    if (trade instanceof d0) {
                        return c.i0(oi0.d.a0((dfl.a) ((d0) trade).i));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                m mVar = (m) trade;
                d dVar3 = mVar.z;
                if (dVar3 == null) {
                    dVar3 = mVar.E;
                }
                if (dVar3 != null) {
                    int i6 = a.f297156a[mVar.v.ordinal()];
                    if (i6 == 1) {
                        return c.i0(dVar3);
                    }
                    if (i6 == 2) {
                        return dVar3;
                    }
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        return null;
    }

    public static TextLocalisedClause b(b bVar, i0 trade) {
        int i;
        Intrinsics.checkNotNullParameter(trade, "trade");
        int i2 = a.f297157b[trade.p().ordinal()];
        if (i2 == 1) {
            i = R$string.wealth_trade_created_title;
        } else if (i2 == 2) {
            i = R$string.wealth_trade_pending_title;
        } else if (i2 == 3) {
            i = ((trade instanceof j) || (trade instanceof g) || (trade instanceof y)) ? R$string.wealth_state_paid : ((trade instanceof b0) || (trade instanceof dfl.d) || (trade instanceof h0) || (trade instanceof z) || (trade instanceof t) || (trade instanceof c0) || (trade instanceof e0) || (trade instanceof e) || (trade instanceof m)) ? R$string.wealth_state_completed : R$string.wealth_trade_executed_title;
        } else if (i2 == 4) {
            i = R$string.wealth_trade_declined_title;
        } else {
            if (i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.wealth_trading_common_cancelled;
        }
        return new TextLocalisedClause(i, null, null, 10);
    }
}
