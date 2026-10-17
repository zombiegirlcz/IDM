package akf;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class t1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ t1[] $VALUES;
    public static final t1 ACCEPT_ALERT;
    public static final t1 ADD_CASH_AGAIN;
    public static final t1 ADJUST_ANALYTICS;
    public static final t1 ATM_LIMITS;
    public static final t1 BLOCK_JUNIOR_INBOUND_TRANSFER_SENDER_ID;
    public static final t1 BLOCK_MERCHANT;
    public static final t1 BLOCK_SUBSCRIPTION;
    public static final t1 BUY_AGAIN;
    public static final t1 BUY_AGAIN_ONE_OFF_REV_POINTS_PURCHASE;
    public static final t1 CANCEL;
    public static final t1 CANCEL_RECURRING_SPLIT_BILL;
    public static final t1 CANCEL_SPLIT_BILL;
    public static final t1 CANCEL_SUBSCRIPTION;
    public static final t1 CANCEL_TRANSFER_LINK;
    public static final t1 CARD_LIMITS;
    public static final t1 CHARITY_DETAILS;
    public static final t1 CHECK;
    public static final t1 CONFIRMATION;
    public static final t1 CONFIRM_CANCEL_BANK_TRANSFER;
    public static final t1 CONFIRM_RECALL;
    public static final t1 CREDIT_CARD_INSTALMENT_CREATE;
    public static final t1 DEBIT_TO_INSTALMENT_CREATE;
    public static final t1 DIRECT_DEBIT_REFUND;
    public static final t1 FRAUD_CONFIRM;
    public static final t1 FRAUD_DENY;
    public static final t1 GET_HELP;
    public static final t1 JUNIOR_P2P_TRANSFER_APPROVE;
    public static final t1 JUNIOR_P2P_TRANSFER_REJECT;
    public static final t1 MANAGE_PLAN;
    public static final t1 MANAGE_RECURRING_REV_POINTS_PURCHASE;
    public static final t1 MANAGE_SPARE_CHANGE;
    public static final t1 OPEN_SPLIT_BILL;
    public static final t1 PAYMENT_GROUP_BILL_REMOVE;
    public static final t1 RECALL;
    public static final t1 RECURRING;
    public static final t1 REFUND;
    public static final t1 REPLACE_CARD;
    public static final t1 REQUEST;
    public static final t1 REQUEST_APM;
    public static final t1 RETRY_PAYMENT;
    public static final t1 SEND_AGAIN;
    public static final t1 SEND_AGAIN_APM;
    public static final t1 SEND_AGAIN_BILL;
    public static final t1 SEND_AGAIN_P2P;
    public static final t1 SEND_AGAIN_PUSH_TO_CARD;
    public static final t1 SEND_AGAIN_UPI;
    public static final t1 SEND_TO_PAYER;
    public static final t1 SET_RECURRING_BUY;
    public static final t1 SHARE_PAYMENT_LINK;
    public static final t1 SHOW_SUSPICIOUS_TRANSACTION;
    public static final t1 SORT_INCOME;
    public static final t1 SPARE_CHANGE_REFUND;
    public static final t1 STATEMENT;
    private final int priority;

    static {
        t1 t1Var = new t1("FRAUD_DENY", 0, 0);
        FRAUD_DENY = t1Var;
        t1 t1Var2 = new t1("FRAUD_CONFIRM", 1, 0);
        FRAUD_CONFIRM = t1Var2;
        t1 t1Var3 = new t1("REPLACE_CARD", 2, 0);
        REPLACE_CARD = t1Var3;
        t1 t1Var4 = new t1("BLOCK_SUBSCRIPTION", 3, 0);
        BLOCK_SUBSCRIPTION = t1Var4;
        t1 t1Var5 = new t1("BLOCK_MERCHANT", 4, 0);
        BLOCK_MERCHANT = t1Var5;
        t1 t1Var6 = new t1("STATEMENT", 5, 0);
        STATEMENT = t1Var6;
        t1 t1Var7 = new t1("CONFIRMATION", 6, 0);
        CONFIRMATION = t1Var7;
        t1 t1Var8 = new t1("CHECK", 7, 0);
        CHECK = t1Var8;
        t1 t1Var9 = new t1("CREDIT_CARD_INSTALMENT_CREATE", 8, 2);
        CREDIT_CARD_INSTALMENT_CREATE = t1Var9;
        t1 t1Var10 = new t1("DEBIT_TO_INSTALMENT_CREATE", 9, 2);
        DEBIT_TO_INSTALMENT_CREATE = t1Var10;
        t1 t1Var11 = new t1("OPEN_SPLIT_BILL", 10, 2);
        OPEN_SPLIT_BILL = t1Var11;
        t1 t1Var12 = new t1("SEND_TO_PAYER", 11, 3);
        SEND_TO_PAYER = t1Var12;
        t1 t1Var13 = new t1("SEND_AGAIN_P2P", 12, 3);
        SEND_AGAIN_P2P = t1Var13;
        t1 t1Var14 = new t1("SEND_AGAIN", 13, 3);
        SEND_AGAIN = t1Var14;
        t1 t1Var15 = new t1("SEND_AGAIN_PUSH_TO_CARD", 14, 3);
        SEND_AGAIN_PUSH_TO_CARD = t1Var15;
        t1 t1Var16 = new t1("SEND_AGAIN_APM", 15, 3);
        SEND_AGAIN_APM = t1Var16;
        t1 t1Var17 = new t1("SEND_AGAIN_BILL", 16, 3);
        SEND_AGAIN_BILL = t1Var17;
        t1 t1Var18 = new t1("SEND_AGAIN_UPI", 17, 3);
        SEND_AGAIN_UPI = t1Var18;
        t1 t1Var19 = new t1("RETRY_PAYMENT", 18, 3);
        RETRY_PAYMENT = t1Var19;
        t1 t1Var20 = new t1("REQUEST", 19, 3);
        REQUEST = t1Var20;
        t1 t1Var21 = new t1("REQUEST_APM", 20, 3);
        REQUEST_APM = t1Var21;
        t1 t1Var22 = new t1("RECURRING", 21, 3);
        RECURRING = t1Var22;
        t1 t1Var23 = new t1("CANCEL_TRANSFER_LINK", 22, 3);
        CANCEL_TRANSFER_LINK = t1Var23;
        t1 t1Var24 = new t1("CANCEL_SPLIT_BILL", 23, 3);
        CANCEL_SPLIT_BILL = t1Var24;
        t1 t1Var25 = new t1("CANCEL_RECURRING_SPLIT_BILL", 24, 3);
        CANCEL_RECURRING_SPLIT_BILL = t1Var25;
        t1 t1Var26 = new t1("RECALL", 25, 3);
        RECALL = t1Var26;
        t1 t1Var27 = new t1("CONFIRM_RECALL", 26, 3);
        CONFIRM_RECALL = t1Var27;
        t1 t1Var28 = new t1("CONFIRM_CANCEL_BANK_TRANSFER", 27, 4);
        CONFIRM_CANCEL_BANK_TRANSFER = t1Var28;
        t1 t1Var29 = new t1("SHARE_PAYMENT_LINK", 28, 3);
        SHARE_PAYMENT_LINK = t1Var29;
        t1 t1Var30 = new t1("CHARITY_DETAILS", 29, 2);
        CHARITY_DETAILS = t1Var30;
        t1 t1Var31 = new t1("PAYMENT_GROUP_BILL_REMOVE", 30, 2);
        PAYMENT_GROUP_BILL_REMOVE = t1Var31;
        t1 t1Var32 = new t1("JUNIOR_P2P_TRANSFER_REJECT", 31, 0);
        JUNIOR_P2P_TRANSFER_REJECT = t1Var32;
        t1 t1Var33 = new t1("JUNIOR_P2P_TRANSFER_APPROVE", 32, 0);
        JUNIOR_P2P_TRANSFER_APPROVE = t1Var33;
        t1 t1Var34 = new t1("ADD_CASH_AGAIN", 33, 0);
        ADD_CASH_AGAIN = t1Var34;
        t1 t1Var35 = new t1("ACCEPT_ALERT", 34, 0);
        ACCEPT_ALERT = t1Var35;
        t1 t1Var36 = new t1("SHOW_SUSPICIOUS_TRANSACTION", 35, 0);
        SHOW_SUSPICIOUS_TRANSACTION = t1Var36;
        t1 t1Var37 = new t1("MANAGE_PLAN", 36, 0);
        MANAGE_PLAN = t1Var37;
        t1 t1Var38 = new t1("ATM_LIMITS", 37, 0);
        ATM_LIMITS = t1Var38;
        t1 t1Var39 = new t1("CARD_LIMITS", 38, 0);
        CARD_LIMITS = t1Var39;
        t1 t1Var40 = new t1("ADJUST_ANALYTICS", 39, 2);
        ADJUST_ANALYTICS = t1Var40;
        t1 t1Var41 = new t1("SORT_INCOME", 40, 2);
        SORT_INCOME = t1Var41;
        t1 t1Var42 = new t1("GET_HELP", 41, 2);
        GET_HELP = t1Var42;
        t1 t1Var43 = new t1("REFUND", 42, 0);
        REFUND = t1Var43;
        t1 t1Var44 = new t1("MANAGE_SPARE_CHANGE", 43, 0);
        MANAGE_SPARE_CHANGE = t1Var44;
        t1 t1Var45 = new t1("CANCEL", 44, 4);
        CANCEL = t1Var45;
        t1 t1Var46 = new t1("BUY_AGAIN_ONE_OFF_REV_POINTS_PURCHASE", 45, 0);
        BUY_AGAIN_ONE_OFF_REV_POINTS_PURCHASE = t1Var46;
        t1 t1Var47 = new t1("MANAGE_RECURRING_REV_POINTS_PURCHASE", 46, 0);
        MANAGE_RECURRING_REV_POINTS_PURCHASE = t1Var47;
        t1 t1Var48 = new t1("BUY_AGAIN", 47, 0);
        BUY_AGAIN = t1Var48;
        t1 t1Var49 = new t1("SET_RECURRING_BUY", 48, 0);
        SET_RECURRING_BUY = t1Var49;
        t1 t1Var50 = new t1("BLOCK_JUNIOR_INBOUND_TRANSFER_SENDER_ID", 49, 0);
        BLOCK_JUNIOR_INBOUND_TRANSFER_SENDER_ID = t1Var50;
        t1 t1Var51 = new t1("CANCEL_SUBSCRIPTION", 50, 0);
        CANCEL_SUBSCRIPTION = t1Var51;
        t1 t1Var52 = new t1("SPARE_CHANGE_REFUND", 51, 0);
        SPARE_CHANGE_REFUND = t1Var52;
        t1 t1Var53 = new t1("DIRECT_DEBIT_REFUND", 52, 0);
        DIRECT_DEBIT_REFUND = t1Var53;
        t1[] t1VarArr = {t1Var, t1Var2, t1Var3, t1Var4, t1Var5, t1Var6, t1Var7, t1Var8, t1Var9, t1Var10, t1Var11, t1Var12, t1Var13, t1Var14, t1Var15, t1Var16, t1Var17, t1Var18, t1Var19, t1Var20, t1Var21, t1Var22, t1Var23, t1Var24, t1Var25, t1Var26, t1Var27, t1Var28, t1Var29, t1Var30, t1Var31, t1Var32, t1Var33, t1Var34, t1Var35, t1Var36, t1Var37, t1Var38, t1Var39, t1Var40, t1Var41, t1Var42, t1Var43, t1Var44, t1Var45, t1Var46, t1Var47, t1Var48, t1Var49, t1Var50, t1Var51, t1Var52, t1Var53};
        $VALUES = t1VarArr;
        $ENTRIES = vc.s.n(t1VarArr);
    }

    public t1(String str, int i, int i2) {
        this.priority = i2;
    }

    public static t1 valueOf(String str) {
        return (t1) Enum.valueOf(t1.class, str);
    }

    public static t1[] values() {
        return (t1[]) $VALUES.clone();
    }
}
