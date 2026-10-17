package tof;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import tof.i3;

/* JADX INFO: loaded from: classes8.dex */
public abstract class l3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f272907a;

    static {
        Pair pair = new Pair("services", l2.SERVICES);
        Pair pair2 = new Pair("entertainment", l2.ENTERTAINMENT);
        Pair pair3 = new Pair("groceries", l2.GROCERIES);
        Pair pair4 = new Pair("health", l2.HEALTH);
        Pair pair5 = new Pair("restaurants", l2.RESTAURANTS);
        Pair pair6 = new Pair("shopping", l2.SHOPPING);
        Pair pair7 = new Pair("transport", l2.TRANSPORT);
        Pair pair8 = new Pair("travel", l2.TRAVEL);
        Pair pair9 = new Pair("utilities", l2.UTILITIES);
        Pair pair10 = new Pair("cash", l2.CASH);
        l2 l2Var = l2.TRANSFERS;
        f272907a = zhm.r0.i(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, new Pair("transfer", l2Var), new Pair("transfers", l2Var), new Pair("wealth", l2.WEALTH), new Pair("insurance", l2.INSURANCE), new Pair("general", l2.GENERAL), new Pair("refund", l2.REFUND), new Pair("cashback", l2.CASHBACK), new Pair("child_allowance", l2.CHILD_ALLOWANCE), new Pair("investment", l2.INVESTMENT), new Pair("loan", l2.LOAN), new Pair("credit", l2.CREDIT), new Pair("savings", l2.SAVINGS), new Pair("donation", l2.DONATION), new Pair("salary", l2.SALARY), new Pair("gift", l2.GIFT), new Pair("topup", l2.TOPUP), new Pair("net_sales", l2.NET_SALES), new Pair("interest", l2.INTEREST), new Pair("fee", l2.FEE), new Pair("card", l2.CARD), new Pair("accommodation", l2.ACCOMMODATION), new Pair("financial", l2.FINANCIAL), new Pair("furniture", l2.FURNITURE), new Pair("hardware", l2.HARDWARE), new Pair("fuel", l2.FUEL), new Pair("software", l2.SOFTWARE), new Pair("advertising", l2.ADVERTISING), new Pair("education", l2.EDUCATION), new Pair("government", l2.GOVERNMENT), new Pair("remittances", l2.REMITTANCES));
    }

    public static final i3 a(String id10, List list) {
        Object next;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(id10, "id");
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (kotlin.text.a0.z(((i3) next).getId(), id10, true)) {
                break;
            }
        }
        i3 i3Var = (i3) next;
        if (i3Var != null) {
            return i3Var;
        }
        i3.Companion.getClass();
        return i3.a.a();
    }

    public static final String b(l2 l2Var) {
        Intrinsics.checkNotNullParameter(l2Var, "<this>");
        return le.u1.g(l2Var, f272907a);
    }

    public static final l2 c(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return (l2) le.u1.v(str, f272907a);
    }
}
