package utg;

import com.revolut.retail.trading.core.domain.account_closure.AccountClosureProgressStep;
import h4l.c;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import wtg.c0;
import zhm.r0;

/* JADX INFO: loaded from: classes9.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f283100a = r0.k(new Pair("REQUESTED", c.REQUESTED), new Pair("ACCOUNTS_SUSPENDED", c.ACCOUNTS_SUSPENDED), new Pair("APPROVED", c.APPROVED), new Pair("POSITIONS_RECONCILIATION_SCHEDULED", c.POSITIONS_RECONCILIATION_SCHEDULED), new Pair("POSITIONS_RECONCILED", c.POSITIONS_RECONCILED), new Pair("ORDERS_PLACED", c.ORDERS_PLACED), new Pair("POSITIONS_CLOSED", c.POSITIONS_CLOSED), new Pair("MONEY_WITHDRAWN", c.MONEY_WITHDRAWN), new Pair("ACCOUNTS_CLOSED", c.ACCOUNTS_CLOSED), new Pair("CANCELLED", c.CANCELLED));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f283101b = r0.k(new Pair("REQUESTED", h4l.a.REQUESTED), new Pair("TRADING_SUSPENDED", h4l.a.TRADING_SUSPENDED), new Pair("SELLING_OPEN_POSITIONS", h4l.a.SELLING_OPEN_POSITIONS), new Pair("WITHDRAWING_FUNDS", h4l.a.WITHDRAWING_FUNDS), new Pair("WITHDRAWING_FUNDS_NEGATIVE_BALANCE", h4l.a.WITHDRAWING_FUNDS_NEGATIVE_BALANCE), new Pair("ACCOUNT_CLOSED", h4l.a.ACCOUNT_CLOSED));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f283102c = r0.k(new Pair("USER", h4l.b.USER), new Pair("REVOLUT", h4l.b.REVOLUT));

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    public static final AccountClosureProgressStep a(stg.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        h4l.a aVar = (h4l.a) u1.v(cVar.getName(), f283101b);
        if (aVar == null) {
            aVar = h4l.a.UNKNOWN;
        }
        return new AccountClosureProgressStep(aVar, cVar.getTitle(), cVar.getDescription());
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    public static final AccountClosureProgressStep b(c0 c0Var) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        h4l.a aVar = (h4l.a) u1.v(c0Var.f299944a, f283101b);
        if (aVar == null) {
            aVar = h4l.a.UNKNOWN;
        }
        return new AccountClosureProgressStep(aVar, c0Var.f299945b, c0Var.f299946c);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    public static final stg.c c(AccountClosureProgressStep accountClosureProgressStep) {
        Intrinsics.checkNotNullParameter(accountClosureProgressStep, "<this>");
        String strH = u1.h(accountClosureProgressStep.f104496a, f283101b);
        if (strH == null) {
            strH = "";
        }
        return new stg.c(strH, accountClosureProgressStep.f104497b, accountClosureProgressStep.f104498c);
    }
}
