package yqb;

import akd.s;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import org.jetbrains.annotations.NotNull;
import zhm.r0;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f316026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f316027b;

    public static final class a {
        private a() {
        }
    }

    static {
        s sVar = s.HOME;
        Pair pair = new Pair("PERSONAL_CURRENCY_HOME_10", sVar);
        s sVar2 = s.PRO;
        Pair pair2 = new Pair("PRO_CURRENCY_HOME_10", sVar2);
        s sVar3 = s.JUNIOR;
        Pair pair3 = new Pair("JUNIOR_HOME_10", sVar3);
        s sVar4 = s.TEEN;
        Pair pair4 = new Pair("TEEN_CURRENCY_HOME", sVar4);
        s sVar5 = s.SAVINGS;
        Pair pair5 = new Pair("SAVINGS_HOME_10", sVar5);
        s sVar6 = s.CREDIT_CARD;
        Pair pair6 = new Pair("CREDIT_CARD_HOME_10", sVar6);
        s sVar7 = s.PAY_LATER;
        Pair pair7 = new Pair("PAY_LATER_HOME_10", sVar7);
        s sVar8 = s.LOAN;
        Pair pair8 = new Pair("LOAN_HOME_10", sVar8);
        s sVar9 = s.POCKETS;
        Pair pair9 = new Pair("POCKETS_HOME_10", sVar9);
        s sVar10 = s.JOINT;
        Pair pair10 = new Pair("JOINT_CURRENCY_HOME_10", sVar10);
        s sVar11 = s.CREDIT_APPLICATION;
        Pair pair11 = new Pair("CREDIT_APPLICATION_HOME_10", sVar11);
        s sVar12 = s.LINKED;
        Pair pair12 = new Pair("LINKED_HOME_10", sVar12);
        s sVar13 = s.BLOCKING;
        f316026a = r0.k(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, new Pair("BLOCKING_HOME_10", sVar13), new Pair("CRYPTO_HOME", s.CRYPTO_HOME), new Pair("INVEST_HOME", s.INVEST_HOME), new Pair("INVEST_DISCOVERY", s.INVEST_DISCOVER), new Pair("INVEST_ROBO_DETAILS", s.INVEST_ROBO_DETAILS), new Pair("PROFILE", s.PROFILE), new Pair("PAYMENTS_HOME", s.PAYMENTS_HOME), new Pair("PAYMENTS_SCHEDULED", s.PAYMENTS_SCHEDULED), new Pair("PLANHUB", s.PLAN_HUB), new Pair("CRYPTO_EXCHANGE_FEES", s.CRYPTO_EXCHANGE_FEES), new Pair("CRYPTO_TRANSFERS", s.CRYPTO_TRANSFERS), new Pair("CRYPTO_TOTAL_WEALTH", s.CRYPTO_TOTAL_WEALTH), new Pair("CRYPTO_TRADE", s.CRYPTO_TRADE), new Pair("ACCOUNTS_LIST", s.ACCOUNTS_LIST), new Pair("ACCOUNT_DETAILS", s.ACCOUNT_DETAILS), new Pair("ACCOUNT_DETAILS_V1", s.ACCOUNT_DETAILS_V1), new Pair("PAYMENTS_TRANSFER_REVIEW", s.PAYMENTS_TRANSFER_REVIEW), new Pair("OPEN_BANKING_PAYMENT_REVIEW", s.OPEN_BANKING_PAYMENT_REVIEW), new Pair("SUGGEST_SWITCH_SALARY", s.SUGGEST_SWITCH_SALARY), new Pair("LIFESTYLE_HOME", s.LIFESTYLE_HOME), new Pair("CREDIT_CARD_CASHBACK_DETAILS", s.CREDIT_CARD_CASHBACK_DETAILS), new Pair("REVPOINTS_HUB", s.REVPOINTS_HUB), new Pair("REVPOINTS_EARN_HUB", s.REVPOINTS_EARN_HUB), new Pair("REVPOINTS_REDEEM_HUB", s.REVPOINTS_REDEEM_HUB), new Pair("SECURITY_HUB", s.SECURITY_HUB), new Pair("STUDENT_HUB", s.STUDENT_HUB), new Pair("AIRPORT_LOUNGES_HOME", s.AIRPORT_LOUNGES_HOME), new Pair("MOBILE_PLAN_MANAGEMENT", s.MOBILE_PLAN_MANAGEMENT), new Pair("TRANSACTION_DETAILS", s.TRANSACTION_DETAILS), new Pair("SALARY_HUB", s.SALARY_HUB), new Pair("REVX_HOME_MOBILE", s.REVX_HOME_MOBILE), new Pair("REVX_HOME_MOBILE_LITE", s.REVX_HOME_MOBILE_LITE), new Pair("AIR_HOME", s.AIR_HOME), new Pair("AIR_INVEST", s.AIR_INVEST), new Pair("AIR_PAYMENTS", s.AIR_PAYMENTS), new Pair("AIR_CRYPTO", s.AIR_CRYPTO), new Pair("AIR_LIFESTYLE", s.AIR_LIFESTYLE), new Pair("AIR_DEFAULT", s.AIR_DEFAULT));
        s[] elements = {sVar, sVar2, sVar3, sVar4, sVar5, sVar6, sVar7, sVar8, sVar9, sVar10, sVar11, sVar12, sVar13};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f316027b = d.y0(elements);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final s a(String screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        return (s) u1.u(screen, f316026a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final String b(s screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        return u1.g(screen, f316026a);
    }
}
