package com.revolut.retail.trading.core.domain.orders;

import bfl.g;
import com.revolut.retail.trading.core.domain.orders.InvestOrder;
import dfl.q;
import dfl.x;
import dj0.d;
import java.math.BigDecimal;
import k4l.f;
import k4l.r0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import pyd.c;
import xi0.b;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a {
    public static final b a(InvestCommodityOrder investCommodityOrder) {
        Intrinsics.checkNotNullParameter(investCommodityOrder, "<this>");
        return (b) investCommodityOrder.k.f186385a;
    }

    public static final d b(InvestCommodityOrder investCommodityOrder) {
        Intrinsics.checkNotNullParameter(investCommodityOrder, "<this>");
        r0 r0Var = investCommodityOrder.f104512j;
        d dVar = investCommodityOrder.f104516p;
        int i = f.f180963a[r0Var.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            b bVar = (b) investCommodityOrder.k.f186386b;
            return Intrinsics.f(dVar.f115083b, bVar) ? dVar : c.L(dVar, c.Y(m(investCommodityOrder)), bVar);
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        d dVar2 = investCommodityOrder.f104517q;
        return dVar2 == null ? dVar : dVar2;
    }

    public static final BigDecimal c(InvestMarginOrder investMarginOrder) {
        Intrinsics.checkNotNullParameter(investMarginOrder, "<this>");
        q qVar = investMarginOrder.G;
        if (qVar instanceof dfl.a) {
            BigDecimal bigDecimal = investMarginOrder.f104557q;
            return bigDecimal == null ? investMarginOrder.f104556p : bigDecimal;
        }
        if (qVar instanceof x) {
            return ((x) qVar).f114516a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final BigDecimal d(InvestOrder.InvestSecuritiesOrder investSecuritiesOrder) {
        Intrinsics.checkNotNullParameter(investSecuritiesOrder, "<this>");
        q value = investSecuritiesOrder.getF104639p();
        if (value instanceof dfl.a) {
            BigDecimal bigDecimalS3 = investSecuritiesOrder.getF104646y();
            return bigDecimalS3 == null ? investSecuritiesOrder.getF104643t() : bigDecimalS3;
        }
        if (value instanceof x) {
            return ((x) value).f114516a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String e(InvestOrder investOrder) {
        Intrinsics.checkNotNullParameter(investOrder, "<this>");
        if (investOrder instanceof InvestOrder.InvestSecuritiesOrder) {
            return ((InvestOrder.InvestSecuritiesOrder) investOrder).getH();
        }
        if (investOrder instanceof InvestCommodityOrder) {
            return null;
        }
        if (investOrder instanceof InvestMarginOrder) {
            return ((InvestMarginOrder) investOrder).M;
        }
        if (investOrder instanceof InvestFundOrder) {
            return ((InvestFundOrder) investOrder).J;
        }
        if (investOrder instanceof InvestMutualFundOrder) {
            return ((InvestMutualFundOrder) investOrder).J;
        }
        if (investOrder instanceof InvestOptionOrder) {
            return ((InvestOptionOrder) investOrder).J;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final d f(InvestOrder.InvestSecuritiesOrder investSecuritiesOrder) {
        Intrinsics.checkNotNullParameter(investSecuritiesOrder, "<this>");
        d dVarQ4 = investSecuritiesOrder.getF104645x();
        return dVarQ4 == null ? investSecuritiesOrder.getF104642s() : dVarQ4;
    }

    public static final String g(InvestFundOrder investFundOrder) {
        Intrinsics.checkNotNullParameter(investFundOrder, "<this>");
        return ((b) investFundOrder.k.f186385a).f306286a;
    }

    public static final String h(InvestMarginOrder investMarginOrder) {
        Intrinsics.checkNotNullParameter(investMarginOrder, "<this>");
        return ((b) investMarginOrder.k.f186385a).f306286a;
    }

    public static final String i(InvestMutualFundOrder investMutualFundOrder) {
        Intrinsics.checkNotNullParameter(investMutualFundOrder, "<this>");
        return ((b) investMutualFundOrder.k.f186385a).f306286a;
    }

    public static final String j(InvestOrder.InvestSecuritiesOrder investSecuritiesOrder) {
        Intrinsics.checkNotNullParameter(investSecuritiesOrder, "<this>");
        return ((b) investSecuritiesOrder.getK().f186385a).f306286a;
    }

    public static final String k(InvestOrder investOrder) {
        Intrinsics.checkNotNullParameter(investOrder, "<this>");
        if (investOrder instanceof InvestOrder.InvestSecuritiesOrder) {
            return j((InvestOrder.InvestSecuritiesOrder) investOrder);
        }
        if (investOrder instanceof InvestCommodityOrder) {
            return null;
        }
        if (investOrder instanceof InvestMarginOrder) {
            return h((InvestMarginOrder) investOrder);
        }
        if (investOrder instanceof InvestFundOrder) {
            return g((InvestFundOrder) investOrder);
        }
        if (investOrder instanceof InvestMutualFundOrder) {
            return i((InvestMutualFundOrder) investOrder);
        }
        if (!(investOrder instanceof InvestOptionOrder)) {
            throw new NoWhenBranchMatchedException();
        }
        InvestOptionOrder investOptionOrder = (InvestOptionOrder) investOrder;
        Intrinsics.checkNotNullParameter(investOptionOrder, "<this>");
        return ((b) investOptionOrder.k.f186385a).f306286a;
    }

    public static final boolean l(InvestOrder investOrder) {
        Intrinsics.checkNotNullParameter(investOrder, "<this>");
        return oc.c.o(investOrder.getI());
    }

    public static final d m(InvestCommodityOrder investCommodityOrder) {
        Intrinsics.checkNotNullParameter(investCommodityOrder, "<this>");
        d dVar = investCommodityOrder.o;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final d n(d dVar, g side) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(side, "side");
        int i = f.f180964b[side.ordinal()];
        if (i == 1) {
            return c.i0(dVar);
        }
        if (i == 2) {
            return dVar;
        }
        throw new NoWhenBranchMatchedException();
    }
}
