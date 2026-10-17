package bci;

import cci.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import zhm.h0;
import zhm.r0;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f14448a = r0.k(new Pair("budgeting", g.BUDGETING), new Pair("cashback", g.CASHBACK), new Pair("commodities", g.COMMODITIES), new Pair("crypto", g.CRYPTO), new Pair("disposable_cards", g.DISPOSABLE_CARDS), new Pair("fx", g.FX), new Pair("investing", g.INVESTING), new Pair("junior", g.JUNIOR), new Pair("linked_accounts", g.LINKED_ACCOUNTS), new Pair("metal", g.METAL), new Pair("mortgage", g.MORTGAGE), new Pair("p2p", g.P2P), new Pair("payments", g.PAYMENTS), new Pair("purchase_protection", g.PURCHASE_PROTECTION), new Pair("remittance", g.REMITTANCE), new Pair("rent", g.RENT), new Pair("rewards", g.REWARDS), new Pair("salary", g.SALARY), new Pair("savings", g.SAVINGS), new Pair("smart_delay", g.SMART_DELAY), new Pair("spending", g.SPENDING), new Pair("stays", g.STAYS), new Pair("stocks", g.STOCKS), new Pair("subscriptions", g.SUBSCRIPTIONS), new Pair("travel_insurance", g.TRAVEL_INSURANCE), new Pair("vaults", g.VAULTS), new Pair("virtual_cards", g.VIRTUAL_CARDS), new Pair("freelancing", g.FREELANCING), new Pair("online_payments", g.ONLINE_PURCHASE), new Pair("foreign_travel_payments", g.SPENDING_ABROAD), new Pair("domestic_travel_payments", g.SPENDING_DOMESTIC), new Pair("foreign_atm_withdrawals", g.ATM_WITHDRAWAL_ABROAD), new Pair("domestic_atm_withdrawals", g.ATM_WITHDRAWAL_DOMESTIC), new Pair("self_foreign_remittance", g.REMITTANCE_SELF_ABROAD), new Pair("self_domestic_remittance", g.REMITTANCE_SELF_DOMESTIC), new Pair("revolut_user_remittance", g.REMITTANCE_REV_USER), new Pair("foreign_remittance", g.REMITTANCE_ABROAD), new Pair("domestic_remittance", g.REMITTANCE_DOMESTIC), new Pair("overseas_trading", g.TRADING_ABROAD), new Pair("domestic_trading", g.TRADING_DOMESTIC), new Pair("loans", g.LOANS), new Pair("receive_eur_transfer", g.P2P_EUR), new Pair("manage_property", g.MANAGE_PROPERTY), new Pair("utilities", g.UTILITIES), new Pair("direct_debits", g.DIRECT_DEBITS), new Pair("living_abroad", g.LIVING_ABROAD), new Pair("local_authorities", g.LOCAL_AUTHORITIES), new Pair("joint_account", g.JOINT_ACCOUNT), new Pair("credit_cards", g.CREDIT_CARDS));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14449b = r0.k(new Pair("payments", g.DAILY_PURCHASE), new Pair("subscriptions", g.RECURRING_PAYMENTS), new Pair("p2p", g.P2P_DOMESTIC), new Pair("commodities", g.TRADING_COMMODITIES));

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public final ArrayList a(List purposes) {
        Intrinsics.checkNotNullParameter(purposes, "purposes");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = purposes.iterator();
        while (it8.hasNext()) {
            String purpose = (String) it8.next();
            Intrinsics.checkNotNullParameter(purpose, "purpose");
            g gVar = (g) u1.v(purpose, this.f14448a);
            if (gVar == null) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unsupported purpose of account: ".concat(purpose));
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                gVar = null;
            }
            if (gVar != null) {
                arrayList.add(gVar);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    public final String b(g purpose) {
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        String strH = u1.h(purpose, this.f14448a);
        return strH == null ? u1.g(purpose, this.f14449b) : strH;
    }
}
