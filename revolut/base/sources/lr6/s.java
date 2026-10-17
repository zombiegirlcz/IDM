package lr6;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class s {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ s[] $VALUES;
    public static final s CHARGEBACK;
    public static final s CHARGEBACK_REVERSAL;
    public static final s PAYMENT;
    public static final s PAYMENT_REQUEST;
    public static final s REFUND;
    public static final s REFUND_REVERSAL;

    static {
        s sVar = new s("PAYMENT", 0);
        PAYMENT = sVar;
        s sVar2 = new s("PAYMENT_REQUEST", 1);
        PAYMENT_REQUEST = sVar2;
        s sVar3 = new s("REFUND", 2);
        REFUND = sVar3;
        s sVar4 = new s("CHARGEBACK", 3);
        CHARGEBACK = sVar4;
        s sVar5 = new s("CHARGEBACK_REVERSAL", 4);
        CHARGEBACK_REVERSAL = sVar5;
        s sVar6 = new s("REFUND_REVERSAL", 5);
        REFUND_REVERSAL = sVar6;
        s[] sVarArr = {sVar, sVar2, sVar3, sVar4, sVar5, sVar6};
        $VALUES = sVarArr;
        $ENTRIES = vc.s.n(sVarArr);
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) $VALUES.clone();
    }
}
