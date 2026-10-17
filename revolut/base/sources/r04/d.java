package r04;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import pu3.f;
import pu3.h;
import zhm.h0;
import zhm.r0;

/* JADX INFO: loaded from: classes22.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f250697a = r0.k(new Pair("MORTGAGE", pu3.d.MORTGAGE), new Pair("LOAN", pu3.d.LOAN), new Pair("CREDIT_CARD", pu3.d.CREDIT_CARD), new Pair("LINE_OF_CREDIT", pu3.d.LINE_OF_CREDIT), new Pair("BNPL", pu3.d.BNPL), new Pair("OVERDRAFT", pu3.d.OVERDRAFT));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f250698b = r0.k(new Pair("SOLO", pu3.c.SOLO), new Pair("JOINT", pu3.c.JOINT));

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public static final pu3.b a(b bVar, xi0.b currency) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Long creditLimit = bVar.getCreditLimit();
        ?? r110 = f250697a;
        if (creditLimit != null) {
            String id10 = bVar.getId();
            String pluginState = bVar.getDebtType();
            Intrinsics.checkNotNullParameter(pluginState, "pluginState");
            return new f(id10, (pu3.d) u1.u(pluginState, r110), bVar.getCreditProvider(), new dj0.d(bVar.getCreditLimit().longValue(), currency));
        }
        if (bVar.getMonthlyRepaymentAmount() != null) {
            String id11 = bVar.getId();
            String pluginState2 = bVar.getDebtType();
            Intrinsics.checkNotNullParameter(pluginState2, "pluginState");
            return new h(id11, (pu3.d) u1.u(pluginState2, r110), bVar.getCreditProvider(), new dj0.d(bVar.getMonthlyRepaymentAmount().longValue(), currency));
        }
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.c cVar = rd0.c.ERROR;
        String id12 = bVar.getId();
        String debtType = bVar.getDebtType();
        String creditProvider = bVar.getCreditProvider();
        Long monthlyRepaymentAmount = bVar.getMonthlyRepaymentAmount();
        Long creditLimit2 = bVar.getCreditLimit();
        StringBuilder sbM = v0.a.m("Can't support debt type id=", id12, ", debtType=", debtType, ", creditProvider=");
        sbM.append(creditProvider);
        sbM.append(", monthlyRepaymentAmount=");
        sbM.append(monthlyRepaymentAmount);
        sbM.append(", creditLimit=");
        sbM.append(creditLimit2);
        rd0.d.a(cVar, "OutstandingDebts", sbM.toString(), null, h0Var);
        return null;
    }
}
