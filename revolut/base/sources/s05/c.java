package s05;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c ACCOUNT_AGE;
    public static final c AFFORDABILITY;
    public static final c APPLICATIONS;
    public static final c BALANCE_MANAGEMENT;
    public static final c CREDIT_HISTORY;
    public static final c DEBT_MANAGEMENT;
    public static final c ID_VERIFICATION;
    public static final c LOCAL_PHONE_NUMBER;
    public static final c PAYMENT_HABITS;
    public static final c PUBLIC_RECORDS;
    public static final c SALARY;
    public static final c SPEND_INCOME_RATIO;
    public static final c TRANSACTIONS;
    public static final c UTILISATION;
    public static final c WEALTH_OUTFLOW_RATIO;

    static {
        c cVar = new c("AFFORDABILITY", 0);
        AFFORDABILITY = cVar;
        c cVar2 = new c("LOCAL_PHONE_NUMBER", 1);
        LOCAL_PHONE_NUMBER = cVar2;
        c cVar3 = new c("CREDIT_HISTORY", 2);
        CREDIT_HISTORY = cVar3;
        c cVar4 = new c("PAYMENT_HABITS", 3);
        PAYMENT_HABITS = cVar4;
        c cVar5 = new c("UTILISATION", 4);
        UTILISATION = cVar5;
        c cVar6 = new c("APPLICATIONS", 5);
        APPLICATIONS = cVar6;
        c cVar7 = new c("PUBLIC_RECORDS", 6);
        PUBLIC_RECORDS = cVar7;
        c cVar8 = new c("SALARY", 7);
        SALARY = cVar8;
        c cVar9 = new c("ID_VERIFICATION", 8);
        ID_VERIFICATION = cVar9;
        c cVar10 = new c("ACCOUNT_AGE", 9);
        ACCOUNT_AGE = cVar10;
        c cVar11 = new c("SPEND_INCOME_RATIO", 10);
        SPEND_INCOME_RATIO = cVar11;
        c cVar12 = new c("WEALTH_OUTFLOW_RATIO", 11);
        WEALTH_OUTFLOW_RATIO = cVar12;
        c cVar13 = new c("DEBT_MANAGEMENT", 12);
        DEBT_MANAGEMENT = cVar13;
        c cVar14 = new c("TRANSACTIONS", 13);
        TRANSACTIONS = cVar14;
        c cVar15 = new c("BALANCE_MANAGEMENT", 14);
        BALANCE_MANAGEMENT = cVar15;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13, cVar14, cVar15};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
